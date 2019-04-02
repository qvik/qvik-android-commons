package fi.qvik.android.commons.livedata

import androidx.lifecycle.MutableLiveData

/**
 * Helper class for Extending LiveData that is never null.
 * T is a kotlin non null type. The default value must be given in constructor. After that the value is guaranteed to be present.
 */
class NonNullLiveData<T>(value: T) : MutableLiveData<T>() {

    init {
        setValue(value)
    }

    override fun getValue(): T {
        return super.getValue()!!
    }
}