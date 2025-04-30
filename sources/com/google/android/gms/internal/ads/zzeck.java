package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzeck {
    private final zzgge zza;
    private final zzecf zzb;
    private final zzflt zzc;

    public zzeck(zzgge zzggeVar, zzecf zzecfVar, zzflt zzfltVar) {
        this.zza = zzggeVar;
        this.zzb = zzecfVar;
        this.zzc = zzfltVar;
    }

    public final f4.c zza(final zzbxu zzbxuVar) {
        zzflk zzb = this.zzc.zzb(zzfln.GMS_SIGNALS, zzgft.zzm(zzgft.zzh(null), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzech
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                zzbxu zzbxuVar2 = zzbxu.this;
                String zzc = zzfyv.zzc(zzbxuVar2.zza.getString("ms"));
                ApplicationInfo applicationInfo = zzbxuVar2.zzc;
                String str = zzbxuVar2.zzh;
                return new zzbwv(applicationInfo, zzbxuVar2.zzd, zzbxuVar2.zzf, zzc, -1, str, zzbxuVar2.zze, zzbxuVar2.zzk, zzbxuVar2.zzl);
            }
        }, this.zza));
        final zzecf zzecfVar = this.zzb;
        Objects.requireNonNull(zzecfVar);
        return zzgft.zzm(zzb.zzf(new zzgfa() { // from class: com.google.android.gms.internal.ads.zzeci
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                return zzecf.this.zzb((zzbwv) obj);
            }
        }).zza(), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzecj
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                Bundle bundle = zzbxuVar.zza;
                if (bundle != null) {
                    try {
                        JSONObject zzi = com.google.android.gms.ads.internal.client.zzay.zzb().zzi(bundle);
                        try {
                            com.google.android.gms.ads.internal.client.zzay.zzb().zzl(jSONObject, zzi);
                            return jSONObject;
                        } catch (JSONException unused) {
                            return zzi;
                        }
                    } catch (JSONException unused2) {
                        return jSONObject;
                    }
                }
                return jSONObject;
            }
        }, this.zza);
    }
}
