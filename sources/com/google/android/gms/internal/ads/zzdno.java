package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzdno implements zzbjr {

    @Nullable
    private final zzbhc zza;
    private final zzdoc zzb;
    private final zzhfr zzc;

    public zzdno(zzdjj zzdjjVar, zzdiy zzdiyVar, zzdoc zzdocVar, zzhfr zzhfrVar) {
        this.zza = zzdjjVar.zzc(zzdiyVar.zzA());
        this.zzb = zzdocVar;
        this.zzc = zzhfrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.zza.zze((zzbgs) this.zzc.zzb(), str);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to call onCustomClick for asset " + str + ".", e2);
        }
    }

    public final void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zzb.zzl("/nativeAdCustomClick", this);
    }
}
