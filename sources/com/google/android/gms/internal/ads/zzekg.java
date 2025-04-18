package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzekg implements zzefd {
    private final zzelk zza;
    private final zzdqd zzb;

    public zzekg(zzelk zzelkVar, zzdqd zzdqdVar) {
        this.zza = zzelkVar;
        this.zzb = zzdqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefd
    @Nullable
    public final zzefe zza(String str, JSONObject jSONObject) throws zzffv {
        zzbrf zzbrfVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbK)).booleanValue()) {
            try {
                zzbrfVar = this.zzb.zzb(str);
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Coundn't create RTB adapter: ", e2);
                zzbrfVar = null;
            }
        } else {
            zzbrfVar = this.zza.zza(str);
        }
        if (zzbrfVar == null) {
            return null;
        }
        return new zzefe(zzbrfVar, new zzegx(), str);
    }
}
