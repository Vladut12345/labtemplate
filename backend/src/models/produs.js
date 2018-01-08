'use strict';
module.exports = (sequelize, DataTypes) => {
  var produs = sequelize.define('produs', {
    productName: DataTypes.STRING,
    quantity: DataTypes.INTEGER
  }, {
    classMethods: {
      associate: function(models) {
        // associations can be defined here
      }
    }
  });
  return produs;
};