"use strict";

const produs = require('../models').produs;

exports.list = function (req, res) {
  produs.findAll().then(produs => {
    res.jsonp(produs);
  });
};

exports.create = function (req, res) {
  res.jsonp(produs.create(req.body));
};

exports.findById = function (req, res) {
  let id = req.params.id;
  produs.findById(id).then(produs => {
    res.jsonp(produs);
  });
};
