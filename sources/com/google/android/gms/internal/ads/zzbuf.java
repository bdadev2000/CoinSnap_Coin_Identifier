package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* loaded from: classes2.dex */
final class zzbuf implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbug zza;

    public zzbuf(zzbug zzbugVar) {
        this.zza = zzbugVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i9) {
        this.zza.zzh("User canceled the download.");
    }
}
