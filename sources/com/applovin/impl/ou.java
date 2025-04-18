package com.applovin.impl;

import android.view.View;

/* loaded from: classes2.dex */
public final /* synthetic */ class ou implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25942a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25943b;

    public /* synthetic */ ou(Object obj, int i2) {
        this.f25942a = i2;
        this.f25943b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i2 = this.f25942a;
        Object obj = this.f25943b;
        switch (i2) {
            case 0:
                p9.g((p9) obj, view);
                return;
            case 1:
                u6.a((u6) obj, view);
                return;
            default:
                y4.b((y4) obj, view);
                return;
        }
    }
}
