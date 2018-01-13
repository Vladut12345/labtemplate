var express = require('express');
var router = express.Router();
var Client = require('../service/').Client;

router.get('/', Client.list);
router.get('/:id', Client.findById);
router.post('/', Client.create);
router.delete('/:id', Client.delete);
router.put('/:id', Client.update);

module.exports = router;
