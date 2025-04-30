package com.applovin.impl;

import android.content.DialogInterface;

/* loaded from: classes.dex */
public final /* synthetic */ class B1 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6368c;

    public /* synthetic */ B1(Object obj, int i9) {
        this.b = i9;
        this.f6368c = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.b) {
            case 0:
                ob.c((Runnable) this.f6368c, dialogInterface);
                return;
            default:
                AbstractActivityC0773x.a((AbstractActivityC0773x) this.f6368c, dialogInterface);
                return;
        }
    }
}
