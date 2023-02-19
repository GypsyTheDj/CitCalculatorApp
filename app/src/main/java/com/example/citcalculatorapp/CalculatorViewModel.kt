package com.example.citcalculatorapp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue


class CalculatorViewModel (){
	var state by mutableStateOf(CalculatorState())
		private set
}
