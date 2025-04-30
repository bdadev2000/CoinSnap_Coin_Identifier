package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzecf {
    private final zzgge zza;
    private final zzgge zzb;
    private final zzecx zzc;

    public zzecf(zzgge zzggeVar, zzgge zzggeVar2, zzecx zzecxVar) {
        this.zza = zzggeVar;
        this.zzb = zzggeVar2;
        this.zzc = zzecxVar;
    }

    public final /* synthetic */ f4.c zza(zzbwv zzbwvVar) throws Exception {
        return this.zzc.zza(zzbwvVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlC)).longValue());
    }

    public final f4.c zzb(final zzbwv zzbwvVar) {
        f4.c zzf;
        String str = zzbwvVar.zzb;
        com.google.android.gms.ads.internal.zzu.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzC(str)) {
            zzf = zzgft.zzg(new zzebh(1, "Ads signal service force local"));
        } else {
            zzf = zzgft.zzf(zzgft.zzk(new zzgez() { // from class: com.google.android.gms.internal.ads.zzecb
                @Override // com.google.android.gms.internal.ads.zzgez
                public final f4.c zza() {
                    return zzecf.this.zza(zzbwvVar);
                }
            }, this.zza), ExecutionException.class, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzecc
                @Override // com.google.android.gms.internal.ads.zzgfa
                public final f4.c zza(Object obj) {
                    Throwable th = (ExecutionException) obj;
                    if (th.getCause() != null) {
                        th = th.getCause();
                    }
                    return zzgft.zzg(th);
                }
            }, this.zzb);
        }
        return zzgft.zzn(zzgft.zzf(zzgfk.zzu(zzf), zzebh.class, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzecd
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                return zzgft.zzh(null);
            }
        }, this.zzb), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzece
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                InputStream inputStream = (InputStream) obj;
                JSONObject jSONObject = new JSONObject();
                if (inputStream == null) {
                    return zzgft.zzh(jSONObject);
                }
                try {
                    com.google.android.gms.ads.internal.zzu.zzp();
                    jSONObject = new JSONObject(com.google.android.gms.ads.internal.util.zzt.zzN(new InputStreamReader(inputStream)));
                } catch (IOException | JSONException e4) {
                    com.google.android.gms.ads.internal.zzu.zzo().zzw(e4, "AdsServiceSignalTask.startAdsServiceSignalTask");
                }
                return zzgft.zzh(jSONObject);
            }
        }, this.zzb);
    }
}
