package com.example.tugas_uas_akb_if3_10117091.Database;

import android.view.View;

/** NIM : 10117091
 * Nama : Dida Handian
 * Kelas : IF-3
 * Tanggal : 10-08-2020
 **/

public class CustomClickListener  implements View.OnClickListener {

    private int position;
    private OnItemClickCallback onItemClickCallback;
    public CustomClickListener(int position, CustomClickListener.OnItemClickCallback onItemClickCallback) {
        this.position = position;
        this.onItemClickCallback = onItemClickCallback;
    }

    @Override
    public void onClick(View v) {
        onItemClickCallback.onItemClicked(v, position);
    }

    public interface  OnItemClickCallback{
        void onItemClicked(View view, int position);
    }
}
