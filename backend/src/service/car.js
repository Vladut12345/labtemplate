"use strict";

const Car = require('../models').Car;

exports.list = function (req, res) {
  Car.findAll().then(Car => {
    res.jsonp(Car);
  });
};

exports.create = function (req, res) {
  res.jsonp(Car.create(req.body));
};

exports.findById = function (req, res) {
  let id = req.params.id;
  Car.findById(id).then(Car => {
    res.jsonp(Car);
  });
};
