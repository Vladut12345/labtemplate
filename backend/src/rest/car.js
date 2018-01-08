var express = require('express');
var router = express.Router();
var car = require('../service/').car;

router.get('/', car.list);
router.get('/:id', car.findById);
router.post('/', car.create);

module.exports = router;
