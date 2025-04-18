package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* loaded from: classes4.dex */
final class zzfgd implements OnAdMetadataChangedListener {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzcc zza;
    final /* synthetic */ zzfge zzb;

    public zzfgd(zzfge zzfgeVar, com.google.android.gms.ads.internal.client.zzcc zzccVar) {
        this.zza = zzccVar;
        this.zzb = zzfgeVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzdqi zzdqiVar;
        zzdqiVar = this.zzb.zzd;
        if (zzdqiVar != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
