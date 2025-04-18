package com.applovin.impl;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.applovin.impl.adview.AppLovinWebViewBase;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class h3 extends AppLovinWebViewBase {

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f5083b;
    private final AtomicReference a;

    public h3(Context context) {
        super(context);
        this.a = new AtomicReference();
        if (f5083b == null) {
            try {
                WebView.class.getDeclaredMethod("onTouchEvent", MotionEvent.class);
                f5083b = Boolean.TRUE;
            } catch (NoSuchMethodException unused) {
                com.applovin.impl.sdk.t.h("AppLovinSdk", "WebView.onTouchEvent() not implemented");
                f5083b = Boolean.FALSE;
            }
        }
    }

    public boolean a() {
        return this.a.get() != null;
    }

    @Nullable
    public MotionEvent getAndClearLastClickEvent() {
        return (MotionEvent) this.a.getAndSet(null);
    }

    @Nullable
    public MotionEvent getLastClickEvent() {
        return (MotionEvent) this.a.get();
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.a.set(MotionEvent.obtain(motionEvent));
        if (f5083b.booleanValue()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }
}
