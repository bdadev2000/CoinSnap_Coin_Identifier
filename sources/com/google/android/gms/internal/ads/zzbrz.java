package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbrz implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbsb zza;

    public zzbrz(zzbsb zzbsbVar) {
        this.zza = zzbsbVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        Context context;
        zzbsb zzbsbVar = this.zza;
        Intent zzb = zzbsbVar.zzb();
        com.google.android.gms.ads.internal.zzv.zzq();
        context = zzbsbVar.zzb;
        com.google.android.gms.ads.internal.util.zzs.zzT(context, zzb);
    }
}
