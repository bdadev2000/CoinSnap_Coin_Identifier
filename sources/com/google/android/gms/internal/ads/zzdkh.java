package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzdkh implements zzayv {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdkk zzb;

    public zzdkh(zzdkk zzdkkVar, String str) {
        this.zza = str;
        this.zzb = zzdkkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzayv
    public final void zzdp(zzayu zzayuVar) {
        Map map;
        zzdml zzdmlVar;
        zzdml zzdmlVar2;
        zzdml zzdmlVar3;
        zzdml zzdmlVar4;
        Map map2;
        zzdml zzdmlVar5;
        zzdml zzdmlVar6;
        zzdml zzdmlVar7;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzbM)).booleanValue()) {
            if (zzayuVar.zzj) {
                zzdkk zzdkkVar = this.zzb;
                String str = this.zza;
                map = zzdkkVar.zzy;
                map.put(str, Boolean.TRUE);
                zzdkk zzdkkVar2 = this.zzb;
                zzdmlVar = zzdkkVar2.zzo;
                View zzf = zzdmlVar.zzf();
                zzdmlVar2 = this.zzb.zzo;
                Map zzl = zzdmlVar2.zzl();
                zzdmlVar3 = this.zzb.zzo;
                zzdkkVar2.zzB(zzf, zzl, zzdmlVar3.zzm(), true);
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                if (zzayuVar.zzj) {
                    zzdkk zzdkkVar3 = this.zzb;
                    zzdmlVar4 = zzdkkVar3.zzo;
                    if (zzdmlVar4 == null) {
                        return;
                    }
                    map2 = zzdkkVar3.zzy;
                    map2.put(this.zza, Boolean.TRUE);
                    zzdkk zzdkkVar4 = this.zzb;
                    zzdmlVar5 = zzdkkVar4.zzo;
                    View zzf2 = zzdmlVar5.zzf();
                    zzdmlVar6 = this.zzb.zzo;
                    Map zzl2 = zzdmlVar6.zzl();
                    zzdmlVar7 = this.zzb.zzo;
                    zzdkkVar4.zzB(zzf2, zzl2, zzdmlVar7.zzm(), true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
