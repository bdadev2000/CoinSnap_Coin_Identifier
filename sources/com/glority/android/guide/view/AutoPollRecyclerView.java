package com.glority.android.guide.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class AutoPollRecyclerView extends RecyclerView {
    private static final long TIME_AUTO_POLL = 5;
    AutoPollTask autoPollTask;
    private boolean canRun;
    private boolean running;

    public AutoPollRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.autoPollTask = new AutoPollTask(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class AutoPollTask implements Runnable {
        private final WeakReference<AutoPollRecyclerView> mReference;

        public AutoPollTask(AutoPollRecyclerView autoPollRecyclerView) {
            this.mReference = new WeakReference<>(autoPollRecyclerView);
        }

        @Override // java.lang.Runnable
        public void run() {
            AutoPollRecyclerView autoPollRecyclerView = this.mReference.get();
            if (autoPollRecyclerView != null && autoPollRecyclerView.running && autoPollRecyclerView.canRun) {
                autoPollRecyclerView.scrollBy(2, 2);
                autoPollRecyclerView.postDelayed(autoPollRecyclerView.autoPollTask, 5L);
            }
        }
    }

    public void start() {
        if (this.running) {
            stop();
        }
        this.canRun = true;
        this.running = true;
        postDelayed(this.autoPollTask, 5L);
    }

    public void stop() {
        this.running = false;
        removeCallbacks(this.autoPollTask);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            if (this.running) {
                stop();
            }
        } else if ((action == 1 || action == 3 || action == 4) && this.canRun) {
            start();
        }
        return super.onTouchEvent(motionEvent);
    }
}
