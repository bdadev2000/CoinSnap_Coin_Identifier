package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* loaded from: classes3.dex */
final class zzcfg implements DialogInterface.OnClickListener {
    final /* synthetic */ JsPromptResult zza;

    public zzcfg(JsPromptResult jsPromptResult) {
        this.zza = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.zza.cancel();
    }
}
