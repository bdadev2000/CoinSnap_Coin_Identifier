package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzeqd implements zzexh {
    private final zzgfz zza;
    private final zzdru zzb;
    private final zzdwg zzc;
    private final zzeqf zzd;

    public zzeqd(zzgfz zzgfzVar, zzdru zzdruVar, zzdwg zzdwgVar, zzeqf zzeqfVar) {
        this.zza = zzgfzVar;
        this.zzb = zzdruVar;
        this.zzc = zzdwgVar;
        this.zzd = zzeqfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final ListenableFuture zzb() {
        zzbcm zzbcmVar = zzbcv.zzln;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcmVar)).booleanValue() && this.zzd.zza() != null) {
            zzeqe zza = this.zzd.zza();
            zza.getClass();
            return zzgfo.zzh(zza);
        }
        if (zzfyo.zzd((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzbu)) || (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcmVar)).booleanValue() && (this.zzd.zzd() || !this.zzc.zzt()))) {
            return zzgfo.zzh(new zzeqe(new Bundle()));
        }
        this.zzd.zzc(true);
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeqd.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzeqe zzc() throws Exception {
        List<String> asList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzbu)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : asList) {
            try {
                zzfia zzc = this.zzb.zzc(str, new JSONObject());
                zzc.zzC();
                boolean zzt = this.zzc.zzt();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzln)).booleanValue() || zzt) {
                    try {
                        zzbrz zzf = zzc.zzf();
                        if (zzf != null) {
                            bundle2.putString("sdk_version", zzf.toString());
                        }
                    } catch (zzfhj unused) {
                    }
                }
                try {
                    zzbrz zze = zzc.zze();
                    if (zze != null) {
                        bundle2.putString("adapter_version", zze.toString());
                    }
                } catch (zzfhj unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfhj unused3) {
            }
        }
        zzeqe zzeqeVar = new zzeqe(bundle);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzln)).booleanValue()) {
            this.zzd.zzb(zzeqeVar);
        }
        return zzeqeVar;
    }
}
