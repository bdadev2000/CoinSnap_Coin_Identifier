package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* loaded from: classes2.dex */
final class zzcgw implements DialogInterface.OnClickListener {
    final /* synthetic */ JsResult zza;

    public zzcgw(JsResult jsResult) {
        this.zza = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i9) {
        this.zza.cancel();
    }
}
