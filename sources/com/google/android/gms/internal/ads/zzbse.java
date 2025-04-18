package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbse implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbsg zza;

    public zzbse(zzbsg zzbsgVar) {
        this.zza = zzbsgVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        Context context;
        zzbsg zzbsgVar = this.zza;
        Intent zzb = zzbsgVar.zzb();
        com.google.android.gms.ads.internal.zzu.zzp();
        context = zzbsgVar.zzb;
        com.google.android.gms.ads.internal.util.zzt.zzT(context, zzb);
    }
}
