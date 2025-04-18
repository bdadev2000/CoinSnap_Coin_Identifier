package com.applovin.impl;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.applovin.impl.adview.AppLovinWebViewBase;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class j3 extends AppLovinWebViewBase {

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f24586b;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f24587a;

    public j3(Context context) {
        super(context);
        this.f24587a = new AtomicReference();
        if (f24586b == null) {
            try {
                WebView.class.getDeclaredMethod("onTouchEvent", MotionEvent.class);
                f24586b = Boolean.TRUE;
            } catch (NoSuchMethodException unused) {
                com.applovin.impl.sdk.n.h("AppLovinSdk", "WebView.onTouchEvent() not implemented");
                f24586b = Boolean.FALSE;
            }
        }
    }

    public boolean a() {
        return this.f24587a.get() != null;
    }

    @Override // com.applovin.impl.adview.AppLovinWebViewBase, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f30048a, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Nullable
    public MotionEvent getAndClearLastClickEvent() {
        return (MotionEvent) this.f24587a.getAndSet(null);
    }

    @Nullable
    public MotionEvent getLastClickEvent() {
        return (MotionEvent) this.f24587a.get();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.adview.AppLovinWebViewBase, android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f24587a.set(MotionEvent.obtain(motionEvent));
        if (f24586b.booleanValue()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }
}
