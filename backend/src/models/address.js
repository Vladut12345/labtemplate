'use strict';
module.exports = (sequelize, DataTypes) => {
  var Address = sequelize.define('Address', {
    street: DataTypes.STRING,
    number: DataTypes.INTEGER,
    type: DataTypes.STRING
  }, {
    classMethods: {
      associate: function(models) {
        // associations can be defined here
      }
    }
  });
  return Address;
};