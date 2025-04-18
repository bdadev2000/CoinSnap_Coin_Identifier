package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* loaded from: classes3.dex */
final class zzcfc implements DialogInterface.OnCancelListener {
    final /* synthetic */ JsResult zza;

    public zzcfc(JsResult jsResult) {
        this.zza = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.zza.cancel();
    }
}
