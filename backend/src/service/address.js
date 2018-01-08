"use strict";

const Address = require('../models').Address;

exports.list = function (req, res) {
  Address.findAll().then(Address => {
    res.jsonp(Address);
  });
};

exports.create = function (req, res) {
  res.jsonp(Address.create(req.body));
};

exports.findById = function (req, res) {
  let id = req.params.id;
  Address.findById(id).then(Address => {
    res.jsonp(Address);
  });
};

exports.update = function (req, res) {
  let id = req.params.id;
  Address.findById(id).then(Address => {
    Address.update(req.body);
  });
  res.jsonp(Address);
};

exports.delete = function (req, res) {
  let id = req.params.id;
  Address.findById(req.params.id)
    .then(Address => {
      if (!Address) {
        return res.status(400).send({
          message: 'Address Not Found',
        });
      }
      return Address
        .destroy()
        .then(() => res.status(204).send())
        .catch(error => res.status(400).send(error));
    })
    .catch(error => res.status(400).send(error));
};