var express = require('express');
var router = express.Router();
var Address = require('../service/').Address;

router.get('/', Address.list);
router.get('/:id', Address.findById);
router.post('/', Address.create);
router.delete('/:id', Address.delete);
router.put('/:id', Address.update);

module.exports = router;
