package com.instagram.common.viewpoint.core;

import android.content.DialogInterface;

/* loaded from: assets/audience_network.dex */
public class MF implements DialogInterface.OnClickListener {
    public final /* synthetic */ C0930Vd A00;

    public MF(C0930Vd c0930Vd) {
        this.A00 = c0930Vd;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        dialogInterface.cancel();
    }
}
