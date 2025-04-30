package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* loaded from: classes2.dex */
final class zzbtz implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbua zza;

    public zzbtz(zzbua zzbuaVar) {
        this.zza = zzbuaVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i9) {
        this.zza.zzh("Operation denied by user.");
    }
}
