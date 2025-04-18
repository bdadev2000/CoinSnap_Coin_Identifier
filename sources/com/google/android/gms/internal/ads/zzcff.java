package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* loaded from: classes3.dex */
final class zzcff implements DialogInterface.OnCancelListener {
    final /* synthetic */ JsPromptResult zza;

    public zzcff(JsPromptResult jsPromptResult) {
        this.zza = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.zza.cancel();
    }
}
