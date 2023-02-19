package com.example.citcalculatorapp

//A state means something that is not constant and changes value overtime

data class CalculatorState(
	val number: String = "",
	val number2 : String = "",
	val operation: CalculatorOperation?   = null
)
