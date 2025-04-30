package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* loaded from: classes2.dex */
final class zzcqn implements zzgfp {
    final /* synthetic */ zzcqp zza;

    public zzcqn(zzcqp zzcqpVar) {
        this.zza = zzcqpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfia zzfiaVar;
        zzfoa zzfoaVar;
        zzfhf zzfhfVar;
        zzfgt zzfgtVar;
        zzfgt zzfgtVar2;
        Context context;
        zzcqp zzcqpVar = this.zza;
        String str = (String) obj;
        zzfiaVar = zzcqpVar.zzh;
        zzfoaVar = zzcqpVar.zzg;
        zzfhfVar = zzcqpVar.zze;
        zzfgtVar = zzcqpVar.zzf;
        zzfgtVar2 = zzcqpVar.zzf;
        List zzd = zzfoaVar.zzd(zzfhfVar, zzfgtVar, false, "", str, zzfgtVar2.zzc);
        zzcqp zzcqpVar2 = this.zza;
        zzcby zzo = com.google.android.gms.ads.internal.zzu.zzo();
        context = zzcqpVar2.zza;
        boolean zzA = zzo.zzA(context);
        int i9 = 1;
        if (true == zzA) {
            i9 = 2;
        }
        zzfiaVar.zzc(zzd, i9);
    }
}
