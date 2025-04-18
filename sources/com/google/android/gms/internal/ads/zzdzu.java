package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzdzu {
    private final zzges zza;
    private final zzges zzb;
    private final zzeam zzc;

    public zzdzu(zzges zzgesVar, zzges zzgesVar2, zzeam zzeamVar) {
        this.zza = zzgesVar;
        this.zzb = zzgesVar2;
        this.zzc = zzeamVar;
    }

    public final /* synthetic */ ua.b zza(zzbuv zzbuvVar) throws Exception {
        return this.zzc.zza(zzbuvVar, ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzlj)).longValue());
    }

    public final ua.b zzb(final zzbuv zzbuvVar) {
        ua.b zzf;
        String str = zzbuvVar.zzb;
        com.google.android.gms.ads.internal.zzv.zzq();
        if (com.google.android.gms.ads.internal.util.zzs.zzC(str)) {
            zzf = zzgei.zzg(new zzdyw(1, "Ads signal service force local"));
        } else {
            zzf = zzgei.zzf(zzgei.zzk(new zzgdo() { // from class: com.google.android.gms.internal.ads.zzdzq
                @Override // com.google.android.gms.internal.ads.zzgdo
                public final ua.b zza() {
                    return zzdzu.this.zza(zzbuvVar);
                }
            }, this.zza), ExecutionException.class, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdzr
                @Override // com.google.android.gms.internal.ads.zzgdp
                public final ua.b zza(Object obj) {
                    Throwable th2 = (ExecutionException) obj;
                    if (th2.getCause() != null) {
                        th2 = th2.getCause();
                    }
                    return zzgei.zzg(th2);
                }
            }, this.zzb);
        }
        return (zzgdz) zzgei.zzn((zzgdz) zzgei.zzf(zzgdz.zzu(zzf), zzdyw.class, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdzs
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzgei.zzh(null);
            }
        }, this.zzb), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdzt
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                InputStream inputStream = (InputStream) obj;
                JSONObject jSONObject = new JSONObject();
                if (inputStream == null) {
                    return zzgei.zzh(jSONObject);
                }
                try {
                    com.google.android.gms.ads.internal.zzv.zzq();
                    jSONObject = new JSONObject(com.google.android.gms.ads.internal.util.zzs.zzN(new InputStreamReader(inputStream)));
                } catch (IOException | JSONException e2) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "AdsServiceSignalTask.startAdsServiceSignalTask");
                }
                return zzgei.zzh(jSONObject);
            }
        }, this.zzb);
    }
}
