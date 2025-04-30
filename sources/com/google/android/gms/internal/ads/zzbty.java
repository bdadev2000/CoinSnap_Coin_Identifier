package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbty implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbua zza;

    public zzbty(zzbua zzbuaVar) {
        this.zza = zzbuaVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i9) {
        Context context;
        zzbua zzbuaVar = this.zza;
        Intent zzb = zzbuaVar.zzb();
        com.google.android.gms.ads.internal.zzu.zzp();
        context = zzbuaVar.zzb;
        com.google.android.gms.ads.internal.util.zzt.zzT(context, zzb);
    }
}
