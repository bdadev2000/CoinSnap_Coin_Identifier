package com.applovin.impl;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.applovin.impl.adview.AppLovinWebViewBase;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class h3 extends AppLovinWebViewBase {
    private static Boolean b;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f8050a;

    public h3(Context context) {
        super(context);
        this.f8050a = new AtomicReference();
        if (b == null) {
            try {
                WebView.class.getDeclaredMethod("onTouchEvent", MotionEvent.class);
                b = Boolean.TRUE;
            } catch (NoSuchMethodException unused) {
                com.applovin.impl.sdk.t.h("AppLovinSdk", "WebView.onTouchEvent() not implemented");
                b = Boolean.FALSE;
            }
        }
    }

    public boolean a() {
        if (this.f8050a.get() != null) {
            return true;
        }
        return false;
    }

    @Nullable
    public MotionEvent getAndClearLastClickEvent() {
        return (MotionEvent) this.f8050a.getAndSet(null);
    }

    @Nullable
    public MotionEvent getLastClickEvent() {
        return (MotionEvent) this.f8050a.get();
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f8050a.set(MotionEvent.obtain(motionEvent));
        if (b.booleanValue()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }
}
