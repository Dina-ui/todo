package com.example.nezabudka.screens.main;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.nezabudka.App;
import com.example.nezabudka.model.Note;

import java.util.List;

public class MainViewModel extends ViewModel {
  private LiveData<List<Note>> noteLiveData = App.getInstance().getNoteDao().getAllLiveData();

  public LiveData<List<Note>> getNoteLiveData() {
    return noteLiveData;
  }
}