package com.applovin.impl;

import android.view.View;
import com.applovin.impl.q1;
import com.google.android.material.internal.ViewUtils;

/* loaded from: classes2.dex */
public final /* synthetic */ class wu implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27792a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f27793b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27794c;

    public /* synthetic */ wu(int i2, Object obj, boolean z2) {
        this.f27792a = i2;
        this.f27794c = obj;
        this.f27793b = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f27792a;
        boolean z2 = this.f27793b;
        Object obj = this.f27794c;
        switch (i2) {
            case 0:
                ((q1.a) obj).a(z2);
                return;
            case 1:
                ((sg) obj).a(z2);
                return;
            default:
                ViewUtils.a((View) obj, z2);
                return;
        }
    }
}
