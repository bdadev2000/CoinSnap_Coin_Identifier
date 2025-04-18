package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
final class zzdxu implements zzgee {
    final /* synthetic */ zzdxv zza;

    public zzdxu(zzdxv zzdxvVar) {
        this.zza = zzdxvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
        Pattern pattern;
        zzecl zzeclVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgc)).booleanValue()) {
            pattern = zzdxv.zza;
            Matcher matcher = pattern.matcher(th2.getMessage());
            if (matcher.matches()) {
                String group = matcher.group(1);
                zzeclVar = this.zza.zzf;
                zzeclVar.zzi(Integer.parseInt(group));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzecl zzeclVar;
        zzecl zzeclVar2;
        zzfff zzfffVar = (zzfff) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgc)).booleanValue()) {
            zzeclVar = this.zza.zzf;
            zzeclVar.zzi(zzfffVar.zzb.zzb.zzf);
            zzeclVar2 = this.zza.zzf;
            zzeclVar2.zzj(zzfffVar.zzb.zzb.zzg);
        }
    }
}
