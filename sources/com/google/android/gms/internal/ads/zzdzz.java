package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzdzz {
    private final zzges zza;
    private final zzdzu zzb;
    private final zzfjr zzc;

    public zzdzz(zzges zzgesVar, zzdzu zzdzuVar, zzfjr zzfjrVar) {
        this.zza = zzgesVar;
        this.zzb = zzdzuVar;
        this.zzc = zzfjrVar;
    }

    public final ua.b zza(final zzbvx zzbvxVar) {
        zzfjh zzb = this.zzc.zzb(zzfjl.GMS_SIGNALS, zzgei.zzm(zzgei.zzh(null), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzdzw
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                zzbvx zzbvxVar2 = zzbvx.this;
                String zzc = zzfxf.zzc(zzbvxVar2.zza.getString("ms"));
                ApplicationInfo applicationInfo = zzbvxVar2.zzc;
                String str = zzbvxVar2.zzh;
                return new zzbuv(applicationInfo, zzbvxVar2.zzd, zzbvxVar2.zzf, zzc, -1, str, zzbvxVar2.zze, zzbvxVar2.zzk, zzbvxVar2.zzl);
            }
        }, this.zza));
        final zzdzu zzdzuVar = this.zzb;
        Objects.requireNonNull(zzdzuVar);
        return zzgei.zzm(zzb.zzf(new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdzx
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzdzu.this.zzb((zzbuv) obj);
            }
        }).zza(), new zzfwh(this) { // from class: com.google.android.gms.internal.ads.zzdzy
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                Bundle bundle = zzbvxVar.zza;
                if (bundle != null) {
                    try {
                        JSONObject zzi = com.google.android.gms.ads.internal.client.zzbc.zzb().zzi(bundle);
                        try {
                            com.google.android.gms.ads.internal.client.zzbc.zzb().zzl(jSONObject, zzi);
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
