var express = require('express');
var router = express.Router();
var Car = require('../service/').Car;

router.get('/', Car.list);
router.get('/:id', Car.findById);
router.post('/', Car.create);
router.delete('/:id', Car.delete);
router.put('/:id', Car.update);

module.exports = router;
