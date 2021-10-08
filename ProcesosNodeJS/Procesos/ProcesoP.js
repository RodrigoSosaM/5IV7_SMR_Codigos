console.log("Proceso padre: Mi nombre es Rodrigo Sosa Mendoza")

var fork = require("child_process").fork;

var  subproceso1  = fork("SubP1.js");
var  subproceso2  = fork("SubP2.js");
var  subproceso3  = fork("SubP3.js");