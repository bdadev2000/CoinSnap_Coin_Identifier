package com.facebook.internal;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;

/* loaded from: classes3.dex */
public final class u0 extends WebView {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11102b = 0;

    public u0(Context context, int i10) {
        super(context, null);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f11102b) {
            case 1:
                super.onTouchEvent(motionEvent);
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        switch (this.f11102b) {
            case 0:
                try {
                    super.onWindowFocusChanged(z10);
                    return;
                } catch (NullPointerException unused) {
                    return;
                }
            default:
                super.onWindowFocusChanged(z10);
                return;
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        switch (this.f11102b) {
            case 1:
                super.performClick();
                return false;
            default:
                return super.performClick();
        }
    }

    public u0(Context context) {
        super(context);
    }
}
