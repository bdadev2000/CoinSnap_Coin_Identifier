package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
final class zzeag implements zzgfp {
    final /* synthetic */ zzeah zza;

    public zzeag(zzeah zzeahVar) {
        this.zza = zzeahVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        Pattern pattern;
        zzeev zzeevVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgs)).booleanValue()) {
            pattern = zzeah.zza;
            Matcher matcher = pattern.matcher(th.getMessage());
            if (matcher.matches()) {
                String group = matcher.group(1);
                zzeevVar = this.zza.zzf;
                zzeevVar.zzi(Integer.parseInt(group));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzeev zzeevVar;
        zzeev zzeevVar2;
        zzfhf zzfhfVar = (zzfhf) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgs)).booleanValue()) {
            zzeevVar = this.zza.zzf;
            zzeevVar.zzi(zzfhfVar.zzb.zzb.zze);
            zzeevVar2 = this.zza.zzf;
            zzeevVar2.zzj(zzfhfVar.zzb.zzb.zzf);
        }
    }
}
