package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcqo implements zzgfp {
    final /* synthetic */ String zza;
    final /* synthetic */ zzcqp zzb;

    public zzcqo(zzcqp zzcqpVar, String str) {
        this.zza = str;
        this.zzb = zzcqpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        zzfia zzfiaVar;
        zzfoa zzfoaVar;
        zzfhf zzfhfVar;
        zzfgt zzfgtVar;
        List zzu;
        zzcqp zzcqpVar = this.zzb;
        zzfiaVar = zzcqpVar.zzh;
        zzfoaVar = zzcqpVar.zzg;
        zzfhfVar = zzcqpVar.zze;
        zzfgtVar = zzcqpVar.zzf;
        zzu = zzcqpVar.zzu();
        zzfiaVar.zza(zzfoaVar.zzd(zzfhfVar, zzfgtVar, false, this.zza, null, zzu));
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfia zzfiaVar;
        zzfoa zzfoaVar;
        zzfhf zzfhfVar;
        zzfgt zzfgtVar;
        List zzu;
        zzcqp zzcqpVar = this.zzb;
        String str = this.zza;
        String str2 = (String) obj;
        zzfiaVar = zzcqpVar.zzh;
        zzfoaVar = zzcqpVar.zzg;
        zzfhfVar = zzcqpVar.zze;
        zzfgtVar = zzcqpVar.zzf;
        zzu = zzcqpVar.zzu();
        zzfiaVar.zza(zzfoaVar.zzd(zzfhfVar, zzfgtVar, false, str, str2, zzu));
    }
}
