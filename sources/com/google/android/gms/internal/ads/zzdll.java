package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdll implements zzban {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdlo zzb;

    public zzdll(zzdlo zzdloVar, String str) {
        this.zza = str;
        this.zzb = zzdloVar;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final void zzdp(zzbam zzbamVar) {
        Map map;
        zzdnp zzdnpVar;
        zzdnp zzdnpVar2;
        zzdnp zzdnpVar3;
        zzdnp zzdnpVar4;
        Map map2;
        zzdnp zzdnpVar5;
        zzdnp zzdnpVar6;
        zzdnp zzdnpVar7;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbK)).booleanValue()) {
            synchronized (this) {
                try {
                    if (zzbamVar.zzj) {
                        zzdlo zzdloVar = this.zzb;
                        zzdnpVar4 = zzdloVar.zzo;
                        if (zzdnpVar4 == null) {
                            return;
                        }
                        map2 = zzdloVar.zzy;
                        map2.put(this.zza, Boolean.TRUE);
                        zzdlo zzdloVar2 = this.zzb;
                        zzdnpVar5 = zzdloVar2.zzo;
                        View zzf = zzdnpVar5.zzf();
                        zzdnpVar6 = this.zzb.zzo;
                        Map zzl = zzdnpVar6.zzl();
                        zzdnpVar7 = this.zzb.zzo;
                        zzdloVar2.zzB(zzf, zzl, zzdnpVar7.zzm(), true);
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (zzbamVar.zzj) {
            zzdlo zzdloVar3 = this.zzb;
            String str = this.zza;
            map = zzdloVar3.zzy;
            map.put(str, Boolean.TRUE);
            zzdlo zzdloVar4 = this.zzb;
            zzdnpVar = zzdloVar4.zzo;
            View zzf2 = zzdnpVar.zzf();
            zzdnpVar2 = this.zzb.zzo;
            Map zzl2 = zzdnpVar2.zzl();
            zzdnpVar3 = this.zzb.zzo;
            zzdloVar4.zzB(zzf2, zzl2, zzdnpVar3.zzm(), true);
        }
    }
}
