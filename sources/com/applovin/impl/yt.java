package com.applovin.impl;

import android.content.DialogInterface;
import android.net.Uri;

/* loaded from: classes4.dex */
public final /* synthetic */ class yt implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28242a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28243b;

    public /* synthetic */ yt(Object obj, int i2) {
        this.f28242a = i2;
        this.f28243b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        int i3 = this.f28242a;
        Object obj = this.f28243b;
        switch (i3) {
            case 0:
                h4.c((Uri) obj, dialogInterface, i2);
                return;
            case 1:
                kb.a((Runnable) obj, dialogInterface, i2);
                return;
            default:
                ((ue) obj).a(dialogInterface, i2);
                return;
        }
    }
}
