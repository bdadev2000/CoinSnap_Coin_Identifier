package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzemq implements zzehn {
    private final zzenu zza;
    private final zzdst zzb;

    public zzemq(zzenu zzenuVar, zzdst zzdstVar) {
        this.zza = zzenuVar;
        this.zzb = zzdstVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehn
    @Nullable
    public final zzeho zza(String str, JSONObject jSONObject) throws zzfhv {
        zzbte zzbteVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbF)).booleanValue()) {
            try {
                zzbteVar = this.zzb.zzb(str);
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Coundn't create RTB adapter: ", e4);
                zzbteVar = null;
            }
        } else {
            zzbteVar = this.zza.zza(str);
        }
        if (zzbteVar == null) {
            return null;
        }
        return new zzeho(zzbteVar, new zzejh(), str);
    }
}
