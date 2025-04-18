package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdiq implements zzaym {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdit zzb;

    public zzdiq(zzdit zzditVar, String str) {
        this.zza = str;
        this.zzb = zzditVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final void zzdp(zzayl zzaylVar) {
        Map map;
        zzdku zzdkuVar;
        zzdku zzdkuVar2;
        zzdku zzdkuVar3;
        zzdku zzdkuVar4;
        Map map2;
        zzdku zzdkuVar5;
        zzdku zzdkuVar6;
        zzdku zzdkuVar7;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbP)).booleanValue()) {
            synchronized (this) {
                if (zzaylVar.zzj) {
                    zzdit zzditVar = this.zzb;
                    zzdkuVar4 = zzditVar.zzo;
                    if (zzdkuVar4 == null) {
                        return;
                    }
                    map2 = zzditVar.zzy;
                    map2.put(this.zza, Boolean.TRUE);
                    zzdit zzditVar2 = this.zzb;
                    zzdkuVar5 = zzditVar2.zzo;
                    View zzf = zzdkuVar5.zzf();
                    zzdkuVar6 = this.zzb.zzo;
                    Map zzl = zzdkuVar6.zzl();
                    zzdkuVar7 = this.zzb.zzo;
                    zzditVar2.zzB(zzf, zzl, zzdkuVar7.zzm(), true);
                }
                return;
            }
        }
        if (zzaylVar.zzj) {
            zzdit zzditVar3 = this.zzb;
            String str = this.zza;
            map = zzditVar3.zzy;
            map.put(str, Boolean.TRUE);
            zzdit zzditVar4 = this.zzb;
            zzdkuVar = zzditVar4.zzo;
            View zzf2 = zzdkuVar.zzf();
            zzdkuVar2 = this.zzb.zzo;
            Map zzl2 = zzdkuVar2.zzl();
            zzdkuVar3 = this.zzb.zzo;
            zzditVar4.zzB(zzf2, zzl2, zzdkuVar3.zzm(), true);
        }
    }
}
