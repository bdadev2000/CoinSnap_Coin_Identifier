package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;
import android.net.Uri;

/* loaded from: classes3.dex */
final class zzav implements DialogInterface.OnClickListener {
    final /* synthetic */ zzaw zza;

    public zzav(zzaw zzawVar) {
        this.zza = zzawVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        com.google.android.gms.ads.internal.zzv.zzq();
        zzs.zzU(this.zza.zza, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
