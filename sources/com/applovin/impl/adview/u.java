package com.applovin.impl.adview;

import android.view.KeyEvent;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f6724c;

    public /* synthetic */ u(KeyEvent.Callback callback, int i9) {
        this.b = i9;
        this.f6724c = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                f.c((f) this.f6724c);
                return;
            case 1:
                f.e((f) this.f6724c);
                return;
            default:
                ((WebView) this.f6724c).setVisibility(0);
                return;
        }
    }
}
