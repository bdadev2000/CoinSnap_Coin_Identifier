package com.applovin.impl.adview;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements View.OnTouchListener {
    public final /* synthetic */ int b;

    public /* synthetic */ r(int i9) {
        this.b = i9;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.b) {
            case 0:
                return b.c(view, motionEvent);
            default:
                if (!view.hasFocus()) {
                    view.requestFocus();
                    return false;
                }
                return false;
        }
    }
}
