package com.applovin.impl.adview;

import android.view.KeyEvent;
import android.webkit.WebView;

/* loaded from: classes2.dex */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22830a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f22831b;

    public /* synthetic */ v(KeyEvent.Callback callback, int i2) {
        this.f22830a = i2;
        this.f22831b = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f22830a;
        KeyEvent.Callback callback = this.f22831b;
        switch (i2) {
            case 0:
                f.c((f) callback);
                return;
            case 1:
                f.f((f) callback);
                return;
            default:
                ((WebView) callback).setVisibility(0);
                return;
        }
    }
}
