package com.applovin.impl.adview;

import android.view.KeyEvent;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3731b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f3732c;

    public /* synthetic */ u(KeyEvent.Callback callback, int i10) {
        this.f3731b = i10;
        this.f3732c = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f3731b;
        KeyEvent.Callback callback = this.f3732c;
        switch (i10) {
            case 0:
                f.c((f) callback);
                return;
            case 1:
                f.f((f) callback);
                return;
            default:
                a.a((WebView) callback);
                return;
        }
    }
}
