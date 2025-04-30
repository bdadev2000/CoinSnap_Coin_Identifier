package com.applovin.impl;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class W0 implements View.OnClickListener {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6513c;

    public /* synthetic */ W0(Object obj, int i9) {
        this.b = i9;
        this.f6513c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                n9.f((n9) this.f6513c, view);
                return;
            case 1:
                s6.a((s6) this.f6513c, view);
                return;
            default:
                ((w4) this.f6513c).a(view);
                return;
        }
    }
}
