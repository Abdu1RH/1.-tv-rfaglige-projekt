package com.example.asynctask;

import android.os.AsyncTask;
import android.widget.TextView;

import java.lang.ref.WeakReference;

public class AsyncDataFetcher extends AsyncTask<Void, Void, String> {
   private WeakReference<TextView> textView;

   public AsyncDataFetcher(TextView textView){
       this.textView = new WeakReference<>(textView);
   }

    @Override
    protected String doInBackground(Void... voids) {
        try {
            //Simulation of slow API
            Thread.sleep(4000);
            System.out.println("We just waited for 4 seconds");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        return "This String will go to onPostExecute()";
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        textView.get().setText("Text Changed Asynchronous");
    }
}
