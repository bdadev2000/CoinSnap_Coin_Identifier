package com.applovin.impl;

import android.content.DialogInterface;

/* loaded from: classes.dex */
public final /* synthetic */ class ju implements DialogInterface.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5544b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5545c;

    public /* synthetic */ ju(Object obj, int i10) {
        this.f5544b = i10;
        this.f5545c = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f5544b;
        Object obj = this.f5545c;
        switch (i10) {
            case 0:
                ob.f((Runnable) obj, dialogInterface);
                return;
            default:
                x.d((x) obj, dialogInterface);
                return;
        }
    }
}
