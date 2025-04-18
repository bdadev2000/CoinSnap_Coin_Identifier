package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* loaded from: classes3.dex */
final class zzfep implements OnAdMetadataChangedListener {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzcc zza;
    final /* synthetic */ zzfeq zzb;

    public zzfep(zzfeq zzfeqVar, com.google.android.gms.ads.internal.client.zzcc zzccVar) {
        this.zza = zzccVar;
        this.zzb = zzfeqVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzdor zzdorVar;
        zzdorVar = this.zzb.zzd;
        if (zzdorVar != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
            }
        }
    }
}
