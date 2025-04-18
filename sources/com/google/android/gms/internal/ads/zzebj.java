package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzebj {
    private final zzgfz zza;
    private final zzebe zzb;
    private final zzflg zzc;

    public zzebj(zzgfz zzgfzVar, zzebe zzebeVar, zzflg zzflgVar) {
        this.zza = zzgfzVar;
        this.zzb = zzebeVar;
        this.zzc = zzflgVar;
    }

    public final ListenableFuture zza(final zzbwa zzbwaVar) {
        zzfkx zzb = this.zzc.zzb(zzfla.GMS_SIGNALS, zzgfo.zzm(zzgfo.zzh(null), new zzfxq() { // from class: com.google.android.gms.internal.ads.zzebg
            @Override // com.google.android.gms.internal.ads.zzfxq
            public final Object apply(Object obj) {
                zzbwa zzbwaVar2 = zzbwa.this;
                String zzc = zzfyo.zzc(zzbwaVar2.zza.getString("ms"));
                ApplicationInfo applicationInfo = zzbwaVar2.zzc;
                String str = zzbwaVar2.zzh;
                return new zzbvb(applicationInfo, zzbwaVar2.zzd, zzbwaVar2.zzf, zzc, -1, str, zzbwaVar2.zze, zzbwaVar2.zzk, zzbwaVar2.zzl);
            }
        }, this.zza));
        final zzebe zzebeVar = this.zzb;
        Objects.requireNonNull(zzebeVar);
        return zzgfo.zzm(zzb.zzf(new zzgev() { // from class: com.google.android.gms.internal.ads.zzebh
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                return zzebe.this.zzb((zzbvb) obj);
            }
        }).zza(), new zzfxq(this) { // from class: com.google.android.gms.internal.ads.zzebi
            @Override // com.google.android.gms.internal.ads.zzfxq
            public final Object apply(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                Bundle bundle = zzbwaVar.zza;
                if (bundle == null) {
                    return jSONObject;
                }
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
        }, this.zza);
    }
}
