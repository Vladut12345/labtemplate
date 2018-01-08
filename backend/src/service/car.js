"use strict";

const car = require('../models').car;

exports.list = function (req, res) {
  car.findAll().then(car => {
    res.jsonp(car);
  });
};

exports.create = function (req, res) {
  res.jsonp(car.create(req.body));
};

exports.findById = function (req, res) {
  let id = req.params.id;
  car.findById(id).then(car => {
    res.jsonp(car);
  });
};
