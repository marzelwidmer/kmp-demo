package ch.keepcalm.app.contacts.presentation

import ch.keepcalm.app.contacts.domain.Contact

sealed interface ContactListEvent {
    object OnAddNewContactClick : ContactListEvent
    object DismissContact : ContactListEvent
    data class OnFirstNameChanged(val value: String) : ContactListEvent
    data class OnLastNameChanged(val value: String) : ContactListEvent
    data class OnEmailChanged(val value: String) : ContactListEvent
    data class OnPhoneNumberChanged(val value: String) : ContactListEvent
    class OnPhotoPicket(val bytes: ByteArray) : ContactListEvent
    object OnAddPhotoClicked : ContactListEvent
    object SaveContact : ContactListEvent
    data class SelectContact(val contact: Contact) : ContactListEvent
    data class EditContact(val contact: Contact) : ContactListEvent
    object DeleteContact : ContactListEvent
}
