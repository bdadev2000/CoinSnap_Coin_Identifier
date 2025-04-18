package com.applovin.impl;

import android.content.DialogInterface;

/* loaded from: classes3.dex */
public final /* synthetic */ class cw implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23385a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23386b;

    public /* synthetic */ cw(Object obj, int i2) {
        this.f23385a = i2;
        this.f23386b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i2 = this.f23385a;
        Object obj = this.f23386b;
        switch (i2) {
            case 0:
                tb.a((Runnable) obj, dialogInterface);
                return;
            default:
                x.c((x) obj, dialogInterface);
                return;
        }
    }
}
