"use strict";

const Client = require('../models').Client;

exports.list = function (req, res) {
  Client.findAll().then(Client => {
    res.jsonp(Client);
  });
};

exports.create = function (req, res) {
  res.jsonp(Client.create(req.body));
};

exports.findById = function (req, res) {
  let id = req.params.id;
  Client.findById(id).then(Client => {
    res.jsonp(Client);
  });
};

exports.update = function (req, res) {
  let id = req.params.id;
  Client.findById(id).then(Client => {
    Client.update(req.body);
  });
  res.jsonp(Client);
};

exports.delete = function (req, res) {
  let id = req.params.id;
  Client.findById(req.params.id)
    .then(Client => {
      if (!Client) {
        return res.status(400).send({
          message: 'Client Not Found',
        });
      }
      return Client
        .destroy()
        .then(() => res.status(204).send())
        .catch(error => res.status(400).send(error));
    })
    .catch(error => res.status(400).send(error));
};