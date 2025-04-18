package com.applovin.impl;

import android.content.DialogInterface;
import android.net.Uri;

/* loaded from: classes.dex */
public final /* synthetic */ class rt implements DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7404b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7405c;

    public /* synthetic */ rt(Object obj, int i10) {
        this.f7404b = i10;
        this.f7405c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11 = this.f7404b;
        Object obj = this.f7405c;
        switch (i11) {
            case 0:
                f4.e((Uri) obj, dialogInterface, i10);
                return;
            case 1:
                gb.b((Runnable) obj, dialogInterface, i10);
                return;
            default:
                pe.e((pe) obj, dialogInterface, i10);
                return;
        }
    }
}
