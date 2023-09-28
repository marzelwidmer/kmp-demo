package ch.keepcalm.app.contacts.presentation.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import ch.keepcalm.app.contacts.domain.Contact

@Composable
fun ContactPhtot(
    contact: Contact?,
    modifier: Modifier = Modifier,
    iconSize: Dp = 25.dp
) {

    if (contact?.photoBytes != null){
        println(".....")
    }
}
