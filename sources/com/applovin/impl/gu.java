package com.applovin.impl;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class gu implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5039b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5040c;

    public /* synthetic */ gu(Object obj, int i10) {
        this.f5039b = i10;
        this.f5040c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f5039b;
        Object obj = this.f5040c;
        switch (i10) {
            case 0:
                n9.h((n9) obj, view);
                return;
            case 1:
                s6.a((s6) obj, view);
                return;
            default:
                ((w4) obj).a(view);
                return;
        }
    }
}
