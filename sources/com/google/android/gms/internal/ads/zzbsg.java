package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* loaded from: classes3.dex */
final class zzbsg implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbsh zza;

    public zzbsg(zzbsh zzbshVar) {
        this.zza = zzbshVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.zza.zzh("User canceled the download.");
    }
}
