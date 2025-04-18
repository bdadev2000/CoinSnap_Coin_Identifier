package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* loaded from: classes3.dex */
final class zzcfe implements DialogInterface.OnClickListener {
    final /* synthetic */ JsResult zza;

    public zzcfe(JsResult jsResult) {
        this.zza = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.zza.confirm();
    }
}
