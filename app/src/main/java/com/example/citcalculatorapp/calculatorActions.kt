package com.example.citcalculatorapp
// we want events for all the numbers
//events to clear
//event for del and for perform operation char
// for decimals


sealed class CalculatorActions{
	data class Number(val number: Int) : CalculatorActions() {
	object Clear: CalculatorActions()
	object Delete: CalculatorActions()
	object Decimal: CalculatorActions()
	object Calculate: CalculatorActions()
	data class Operation(val operation: CalculatorOperation): CalculatorActions()
	}
}
