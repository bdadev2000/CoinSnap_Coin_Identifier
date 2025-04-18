package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* loaded from: classes3.dex */
final class zzfei implements OnAdMetadataChangedListener {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzdo zza;
    final /* synthetic */ zzfek zzb;

    public zzfei(zzfek zzfekVar, com.google.android.gms.ads.internal.client.zzdo zzdoVar) {
        this.zza = zzdoVar;
        this.zzb = zzfekVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzdor zzdorVar;
        zzdorVar = this.zzb.zzi;
        if (zzdorVar != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
            }
        }
    }
}
