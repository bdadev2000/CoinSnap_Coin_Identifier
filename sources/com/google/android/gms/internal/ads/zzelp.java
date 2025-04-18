package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzelp implements zzegm {
    private final zzemt zza;
    private final zzdru zzb;

    public zzelp(zzemt zzemtVar, zzdru zzdruVar) {
        this.zza = zzemtVar;
        this.zzb = zzdruVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegm
    @Nullable
    public final zzegn zza(String str, JSONObject jSONObject) throws zzfhj {
        zzbrk zzbrkVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzbH)).booleanValue()) {
            try {
                zzbrkVar = this.zzb.zzb(str);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Coundn't create RTB adapter: ", e);
                zzbrkVar = null;
            }
        } else {
            zzbrkVar = this.zza.zza(str);
        }
        if (zzbrkVar == null) {
            return null;
        }
        return new zzegn(zzbrkVar, new zzeig(), str);
    }
}
