package com.applovin.impl.adview;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.internal.v0;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3727b;

    public /* synthetic */ r(int i10) {
        this.f3727b = i10;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f3727b) {
            case 0:
                return b.b(view, motionEvent);
            default:
                int i10 = v0.f11104o;
                if (!view.hasFocus()) {
                    view.requestFocus();
                    return false;
                }
                return false;
        }
    }
}
