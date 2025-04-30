package com.applovin.impl;

import android.content.DialogInterface;
import android.net.Uri;

/* loaded from: classes.dex */
public final /* synthetic */ class J0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6420c;

    public /* synthetic */ J0(Object obj, int i9) {
        this.b = i9;
        this.f6420c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i9) {
        switch (this.b) {
            case 0:
                f4.e((Uri) this.f6420c, dialogInterface, i9);
                return;
            case 1:
                gb.b((Runnable) this.f6420c, dialogInterface, i9);
                return;
            default:
                pe.a((pe) this.f6420c, dialogInterface, i9);
                return;
        }
    }
}
