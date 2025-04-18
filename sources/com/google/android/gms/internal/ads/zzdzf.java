package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
final class zzdzf implements zzgfk {
    final /* synthetic */ zzdzg zza;

    public zzdzf(zzdzg zzdzgVar) {
        this.zza = zzdzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(Throwable th) {
        Pattern pattern;
        zzedu zzeduVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzfX)).booleanValue()) {
            pattern = zzdzg.zza;
            Matcher matcher = pattern.matcher(th.getMessage());
            if (matcher.matches()) {
                String group = matcher.group(1);
                zzeduVar = this.zza.zzf;
                zzeduVar.zzi(Integer.parseInt(group));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzedu zzeduVar;
        zzedu zzeduVar2;
        zzfgt zzfgtVar = (zzfgt) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzfX)).booleanValue()) {
            zzeduVar = this.zza.zzf;
            zzeduVar.zzi(zzfgtVar.zzb.zzb.zzf);
            zzeduVar2 = this.zza.zzf;
            zzeduVar2.zzj(zzfgtVar.zzb.zzb.zzg);
        }
    }
}
