package es.unex.gps.weathevent.view.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import es.unex.gps.weathevent.model.User

class HomeViewModel: ViewModel() {
    private val _user = MutableLiveData<User>(null)
    val user: LiveData<User>
        get() = _user

    var userInSession: User? = null
        set(value) {
            field = value
            _user.value = value!!
        }
}