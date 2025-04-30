package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzdqe implements zzblp {

    @Nullable
    private final zzbiz zza;
    private final zzdqs zzb;
    private final zzhkj zzc;

    public zzdqe(zzdme zzdmeVar, zzdlt zzdltVar, zzdqs zzdqsVar, zzhkj zzhkjVar) {
        this.zza = zzdmeVar.zzc(zzdltVar.zzA());
        this.zzb = zzdqsVar;
        this.zzc = zzhkjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.zza.zze((zzbip) this.zzc.zzb(), str);
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to call onCustomClick for asset " + str + ".", e4);
        }
    }

    public final void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zzb.zzl("/nativeAdCustomClick", this);
    }
}
