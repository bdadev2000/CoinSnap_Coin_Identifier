package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* loaded from: classes2.dex */
final class zzcoz implements zzgfk {
    final /* synthetic */ zzcpb zza;

    public zzcoz(zzcpb zzcpbVar) {
        this.zza = zzcpbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfho zzfhoVar;
        zzfnc zzfncVar;
        zzfgt zzfgtVar;
        zzfgh zzfghVar;
        zzfgh zzfghVar2;
        Context context;
        zzcpb zzcpbVar = this.zza;
        String str = (String) obj;
        zzfhoVar = zzcpbVar.zzh;
        zzfncVar = zzcpbVar.zzg;
        zzfgtVar = zzcpbVar.zze;
        zzfghVar = zzcpbVar.zzf;
        zzfghVar2 = zzcpbVar.zzf;
        List zzd = zzfncVar.zzd(zzfgtVar, zzfghVar, false, "", str, zzfghVar2.zzc);
        zzcpb zzcpbVar2 = this.zza;
        zzcad zzo = com.google.android.gms.ads.internal.zzu.zzo();
        context = zzcpbVar2.zza;
        zzfhoVar.zzc(zzd, true == zzo.zzA(context) ? 2 : 1);
    }
}
