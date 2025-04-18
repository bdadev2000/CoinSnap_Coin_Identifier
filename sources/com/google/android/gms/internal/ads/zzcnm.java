package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzcnm implements zzgee {
    final /* synthetic */ String zza;
    final /* synthetic */ zzcnn zzb;

    public zzcnm(zzcnn zzcnnVar, String str) {
        this.zza = str;
        this.zzb = zzcnnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
        zzfga zzfgaVar;
        zzfln zzflnVar;
        zzfff zzfffVar;
        zzfet zzfetVar;
        List zzu;
        zzcnn zzcnnVar = this.zzb;
        zzfgaVar = zzcnnVar.zzh;
        zzflnVar = zzcnnVar.zzg;
        zzfffVar = zzcnnVar.zze;
        zzfetVar = zzcnnVar.zzf;
        zzu = zzcnnVar.zzu();
        zzfgaVar.zza(zzflnVar.zzd(zzfffVar, zzfetVar, false, this.zza, null, zzu));
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfga zzfgaVar;
        zzfln zzflnVar;
        zzfff zzfffVar;
        zzfet zzfetVar;
        List zzu;
        zzcnn zzcnnVar = this.zzb;
        String str = this.zza;
        String str2 = (String) obj;
        zzfgaVar = zzcnnVar.zzh;
        zzflnVar = zzcnnVar.zzg;
        zzfffVar = zzcnnVar.zze;
        zzfetVar = zzcnnVar.zzf;
        zzu = zzcnnVar.zzu();
        zzfgaVar.zza(zzflnVar.zzd(zzfffVar, zzfetVar, false, str, str2, zzu));
    }
}
