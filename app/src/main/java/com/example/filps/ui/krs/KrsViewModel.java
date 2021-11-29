package com.example.filps.ui.krs;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class KrsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public KrsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is krs fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}