package com.example.asynctask;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.ListView;

import java.util.ArrayList;

public class StudentAsyncTask extends AsyncTask<Void,Void, ArrayList<Student>> {

    private Context context;
    private ListView listView;

    public StudentAsyncTask(ListView listView, Context context) {
        this.listView = listView;
        this.context = context;
    }

    @Override
    protected ArrayList<Student> doInBackground(Void... voids) {
        StudentDao studentDAO = new StudentDao();
        return studentDAO.getListOfStudents();
    }

    @Override
    protected void onPostExecute(ArrayList<Student> students) {
        super.onPostExecute(students);

        StudentAdapter adapter = new StudentAdapter(context, students);
        listView.setAdapter(adapter);
    }
}
