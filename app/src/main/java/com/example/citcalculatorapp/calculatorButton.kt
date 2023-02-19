package com.example.citcalculatorapp

import android.content.DialogInterface.OnClickListener
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

//In Kotlin, a sealed class is a class that can be subclassed, but only inside the same file where it is declared. This means that all the subclasses of a sealed class must be declared in the same file as the sealed class itself.
@Composable
fun calculatorButton(
	symbol: String,
	modifier: Modifier,
	onClickListener: () -> Unit
) {
	Box(
		contentAlignment = Alignment.Center,
		modifier = Modifier
			.clip(CircleShape)
			.clickable { onClick() }
			.then(modifier)
	){
		Text(
			text = symbol,
			fontSize = 36.sp,
			color = Color.White
		)
	}
}

fun onClick() {
	TODO("Not yet implemented")
}
