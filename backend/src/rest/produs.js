var express = require('express');
var router = express.Router();
var produs = require('../service/').produs;

router.get('/', produs.list);
router.get('/:id', produs.findById);
router.post('/', produs.create);

module.exports = router;
