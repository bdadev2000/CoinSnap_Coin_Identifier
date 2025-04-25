package com.glority.android.guide.utils;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class RecyclerViewDisabler implements RecyclerView.OnItemTouchListener {
    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
