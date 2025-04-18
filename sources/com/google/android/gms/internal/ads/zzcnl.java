package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* loaded from: classes3.dex */
final class zzcnl implements zzgee {
    final /* synthetic */ zzcnn zza;

    public zzcnl(zzcnn zzcnnVar) {
        this.zza = zzcnnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfga zzfgaVar;
        zzfln zzflnVar;
        zzfff zzfffVar;
        zzfet zzfetVar;
        zzfet zzfetVar2;
        Context context;
        zzcnn zzcnnVar = this.zza;
        String str = (String) obj;
        zzfgaVar = zzcnnVar.zzh;
        zzflnVar = zzcnnVar.zzg;
        zzfffVar = zzcnnVar.zze;
        zzfetVar = zzcnnVar.zzf;
        zzfetVar2 = zzcnnVar.zzf;
        List zzd = zzflnVar.zzd(zzfffVar, zzfetVar, false, "", str, zzfetVar2.zzc);
        zzcnn zzcnnVar2 = this.zza;
        zzbzz zzp = com.google.android.gms.ads.internal.zzv.zzp();
        context = zzcnnVar2.zza;
        boolean zzA = zzp.zzA(context);
        int i10 = 1;
        if (true == zzA) {
            i10 = 2;
        }
        zzfgaVar.zzc(zzd, i10);
    }
}
