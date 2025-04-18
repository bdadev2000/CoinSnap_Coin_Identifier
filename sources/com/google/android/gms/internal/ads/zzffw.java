package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* loaded from: classes4.dex */
final class zzffw implements OnAdMetadataChangedListener {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzdo zza;
    final /* synthetic */ zzffy zzb;

    public zzffw(zzffy zzffyVar, com.google.android.gms.ads.internal.client.zzdo zzdoVar) {
        this.zza = zzdoVar;
        this.zzb = zzffyVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzdqi zzdqiVar;
        zzdqiVar = this.zzb.zzi;
        if (zzdqiVar != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
