package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcpa implements zzgfk {
    final /* synthetic */ String zza;
    final /* synthetic */ zzcpb zzb;

    public zzcpa(zzcpb zzcpbVar, String str) {
        this.zza = str;
        this.zzb = zzcpbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(Throwable th) {
        zzfho zzfhoVar;
        zzfnc zzfncVar;
        zzfgt zzfgtVar;
        zzfgh zzfghVar;
        List zzu;
        zzcpb zzcpbVar = this.zzb;
        zzfhoVar = zzcpbVar.zzh;
        zzfncVar = zzcpbVar.zzg;
        zzfgtVar = zzcpbVar.zze;
        zzfghVar = zzcpbVar.zzf;
        zzu = zzcpbVar.zzu();
        zzfhoVar.zza(zzfncVar.zzd(zzfgtVar, zzfghVar, false, this.zza, null, zzu));
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfho zzfhoVar;
        zzfnc zzfncVar;
        zzfgt zzfgtVar;
        zzfgh zzfghVar;
        List zzu;
        zzcpb zzcpbVar = this.zzb;
        String str = this.zza;
        String str2 = (String) obj;
        zzfhoVar = zzcpbVar.zzh;
        zzfncVar = zzcpbVar.zzg;
        zzfgtVar = zzcpbVar.zze;
        zzfghVar = zzcpbVar.zzf;
        zzu = zzcpbVar.zzu();
        zzfhoVar.zza(zzfncVar.zzd(zzfgtVar, zzfghVar, false, str, str2, zzu));
    }
}
