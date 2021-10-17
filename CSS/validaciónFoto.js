* {
	box-sizing: border-box;
}
embed{
	border-radius: 50%;
	border: none;
	border-style: none;
	max-width: 120px;
	max-height: 120px;
}

body {
	font-family: 'Roboto', sans-serif;
	background: rgb(239, 239, 239);
}

main {
	max-width: 800px;
	width: 50%;
	margin-left: 16%;
	padding: 40px;
    padding-top: 0px;
	margin-bottom: 5.5rem;
}
nav#encabezado{
    background-color: rgb(37,36,42);
    padding-left: 37px;
    padding-top: 38px;
    display: flex;
    padding-bottom: 38px;
    padding-right: 5rem;
    margin-left: 24%;
    margin-top: 3%;
    padding: 5%;
    color: rgb(247,96,31);
    height: 35%;
    margin-bottom: -7rem;
    border-radius: 20px;
    justify-content: center;
    width: 100%;
}

.seleccionar_archivo {
	width: 100%;
	background: rgb(37,36,42);
	border: 3px solid transparent;
	border-radius: 3px;
	height: 27px;
	line-height: 20px;
	padding: 0 40px 0 0px;
	transition: .3s ease all;
    width: 8.5rem;
	cursor: pointer;
}
#circulo{
	border: 4px rgb(247,96,31);
	border-style: solid;
	width: 128px;
    height: 128px;
    margin-left: 25%;
    border-radius: 50%;
	display: flex;
	align-items: center;
	justify-content: center;
	
}

#foto_seleccionada{
	border: none;
	border-style: none;
	width: 120px;
    height: 120px;
	max-width: 120px;
	max-height: 120px;
	margin: auto;
    border-radius: 50%;
	image-rendering: optimizeQuality;
	
}
.btn_genero{
	cursor: pointer;
}

input[type='radio']:after {
	width: 15px;
	height: 15px;
	border-radius: 15px;
	top: -2px;
	left: -1px;
	position: relative;
	background-color: rgb(239, 239, 239);
	content: '';
	display: inline-block;
	visibility: visible;
	border: 2px solid rgb(239, 239, 239);
}

input[type='radio']:checked:after {
	width: 15px;
	height: 15px;
	border-radius: 15px;
	top: -2px;
	left: -1px;
	position: relative;
	background-color: rgb(247,96,31);
	content: '';
	display: inline-block;
	visibility: visible;
	border: 2px solid rgb(247,96,31);
	box-shadow: 3px 0px 30px rgba(163,163,163, 0.4);
}
.seleccionar_archivo:focus {
	border: 4px rgb(247,96,31);
    border-style: outset;
	outline: none;
	box-shadow: 3px 0px 30px rgba(163,163,163, 0.4);
}

#formulario{
    padding: 2%;
    padding-right: 4rem;
    padding-left: 3rem;
}
label, h1,input {
    margin: 1.5%;
}
#h1{
    margin-left: 3rem;
    margin-right: 3rem;
    margin-bottom: 0rem;
	padding-top: 3.5rem;
    line-height: 40px;
    font-size: 22px;
}
#div_registrate{
	padding-left: 2.5rem;
	padding-top: 1rem;

}


.formulario {
	display: grid;
	grid-template-columns: 1fr 1fr;
	gap: 20px;
}

.formulario__label {
	display: block;
	font-weight: 700;
	padding: 1px;
	cursor: pointer;
}

.formulario__grupo-input {
	position: relative;
}

.formulario__input {
	width: 100%;
	background: rgb(239, 239, 239);
	border: 3px solid transparent;
	border-radius: 3px;
	height: 35px;
	line-height: 45px;
	padding: 0 40px 0 10px;
	transition: .3s ease all;
    width: 15rem;
}

.formulario__input:focus {
	border: 4px rgb(247,96,31);
    border-style: outset;
	outline: none;
	box-shadow: 3px 0px 30px rgba(163,163,163, 0.4);
}

.formulario__grupo-btn-enviar {
	grid-column: span 1;
    
}

.formulario__grupo-btn-enviar {
	display: flex;
	flex-direction: column;
	align-items: center;
}

.formulario__btn {
	height: 30px;
	line-height: 23px;
	width: 35%;
	background: rgb(37,36,42);
	color: rgb(247,96,31);
	font-weight: bold;
	border: rgb(247,96,31);
    border-style: outset;
	border-radius: 25px;
	cursor: pointer;
	transition: .1s ease all;
    margin-left: 98.5%;
    text-align: center;
    font-size: 15px;
}

.formulario__btn:hover {
	box-shadow: 3px 0px 30px rgba(163,163,163, 1);
}
.main-header{
    display: flex;
    width: 100%;
    margin-left: 2%;
}
.bamrram{
    margin-inline: 2%;
    margin-block: 2%;
    color: rgb(247,96,31);
}
a:visited, a:link{
    text-decoration: none;
    color: rgb(247,96,31);
  }

/* ----- -----  Mediaqueries ----- ----- */
@media screen and (max-width: 800px) {
	.formulario {
		grid-template-columns: 1fr;
	}

	.formulario__grupo-btn-enviar {
		grid-column: 1;
	}

	.formulario__btn {
		width: 100%;
    }
}