package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;

/* loaded from: classes4.dex */
public abstract class h {

    /* renamed from: b, reason: collision with root package name */
    protected Context f14166b;

    /* renamed from: c, reason: collision with root package name */
    protected Object f14167c;

    /* renamed from: d, reason: collision with root package name */
    protected WindVaneWebView f14168d;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        this.f14166b = context;
        this.f14168d = windVaneWebView;
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        this.f14167c = obj;
        this.f14168d = windVaneWebView;
    }
}
