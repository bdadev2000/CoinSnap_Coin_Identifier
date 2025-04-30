package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzere implements zzexw {
    private final zzgge zza;
    private final zzdst zzb;
    private final zzdxf zzc;
    private final zzerg zzd;

    public zzere(zzgge zzggeVar, zzdst zzdstVar, zzdxf zzdxfVar, zzerg zzergVar) {
        this.zza = zzggeVar;
        this.zzb = zzdstVar;
        this.zzc = zzdxfVar;
        this.zzd = zzergVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        zzbeg zzbegVar = zzbep.zzlH;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbegVar)).booleanValue() && this.zzd.zza() != null) {
            zzerf zza = this.zzd.zza();
            zza.getClass();
            return zzgft.zzh(zza);
        }
        if (!zzfyv.zzd((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbs)) && (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbegVar)).booleanValue() || (!this.zzd.zzd() && this.zzc.zzt()))) {
            this.zzd.zzc(true);
            return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzerd
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzere.this.zzc();
                }
            });
        }
        return zzgft.zzh(new zzerf(new Bundle()));
    }

    public final /* synthetic */ zzerf zzc() throws Exception {
        List<String> asList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbs)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : asList) {
            try {
                zzfim zzc = this.zzb.zzc(str, new JSONObject());
                zzc.zzC();
                boolean zzt = this.zzc.zzt();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlH)).booleanValue() || zzt) {
                    try {
                        zzbtt zzf = zzc.zzf();
                        if (zzf != null) {
                            bundle2.putString("sdk_version", zzf.toString());
                        }
                    } catch (zzfhv unused) {
                    }
                }
                try {
                    zzbtt zze = zzc.zze();
                    if (zze != null) {
                        bundle2.putString("adapter_version", zze.toString());
                    }
                } catch (zzfhv unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfhv unused3) {
            }
        }
        zzerf zzerfVar = new zzerf(bundle);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlH)).booleanValue()) {
            this.zzd.zzb(zzerfVar);
        }
        return zzerfVar;
    }
}
