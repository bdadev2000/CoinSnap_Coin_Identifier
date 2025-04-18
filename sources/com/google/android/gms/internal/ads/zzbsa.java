package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* loaded from: classes3.dex */
final class zzbsa implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbsb zza;

    public zzbsa(zzbsb zzbsbVar) {
        this.zza = zzbsbVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.zza.zzh("Operation denied by user.");
    }
}
