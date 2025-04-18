package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzeot implements zzevz {
    private final zzges zza;
    private final zzdqd zzb;
    private final zzdup zzc;
    private final zzeov zzd;

    public zzeot(zzges zzgesVar, zzdqd zzdqdVar, zzdup zzdupVar, zzeov zzeovVar) {
        this.zza = zzgesVar;
        this.zzb = zzdqdVar;
        this.zzc = zzdupVar;
        this.zzd = zzeovVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        zzbce zzbceVar = zzbcn.zzlo;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).booleanValue() && this.zzd.zza() != null) {
            zzeou zza = this.zzd.zza();
            zza.getClass();
            return zzgei.zzh(zza);
        }
        if (!zzfxf.zzd((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbx)) && (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).booleanValue() || (!this.zzd.zzd() && this.zzc.zzt()))) {
            this.zzd.zzc(true);
            return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeos
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzeot.this.zzc();
                }
            });
        }
        return zzgei.zzh(new zzeou(new Bundle()));
    }

    public final /* synthetic */ zzeou zzc() throws Exception {
        List<String> asList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbx)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : asList) {
            try {
                zzfgm zzc = this.zzb.zzc(str, new JSONObject());
                zzc.zzC();
                boolean zzt = this.zzc.zzt();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzlo)).booleanValue() || zzt) {
                    try {
                        zzbru zzf = zzc.zzf();
                        if (zzf != null) {
                            bundle2.putString("sdk_version", zzf.toString());
                        }
                    } catch (zzffv unused) {
                    }
                }
                try {
                    zzbru zze = zzc.zze();
                    if (zze != null) {
                        bundle2.putString("adapter_version", zze.toString());
                    }
                } catch (zzffv unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzffv unused3) {
            }
        }
        zzeou zzeouVar = new zzeou(bundle);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzlo)).booleanValue()) {
            this.zzd.zzb(zzeouVar);
        }
        return zzeouVar;
    }
}
