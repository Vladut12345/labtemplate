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

exports.update = function (req, res) {
  let id = req.params.id;
  Car.findById(id).then(Car => {
    Car.update(req.body);
  });
  res.jsonp(Car);
};

exports.delete = function (req, res) {
  let id = req.params.id;
  Car.findById(req.params.id)
    .then(Car => {
      if (!Car) {
        return res.status(400).send({
          message: 'Car Not Found',
        });
      }
      return Car
        .destroy()
        .then(() => res.status(204).send())
        .catch(error => res.status(400).send(error));
    })
    .catch(error => res.status(400).send(error));
};