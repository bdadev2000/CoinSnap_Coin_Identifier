package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* loaded from: classes2.dex */
final class zzcgz implements DialogInterface.OnClickListener {
    final /* synthetic */ JsPromptResult zza;

    public zzcgz(JsPromptResult jsPromptResult) {
        this.zza = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i9) {
        this.zza.cancel();
    }
}
