package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* loaded from: classes3.dex */
final class zzbsf implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbsg zza;

    public zzbsf(zzbsg zzbsgVar) {
        this.zza = zzbsgVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.zza.zzh("Operation denied by user.");
    }
}
