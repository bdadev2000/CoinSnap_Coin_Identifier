package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* loaded from: classes2.dex */
final class zzfgp implements OnAdMetadataChangedListener {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzby zza;
    final /* synthetic */ zzfgq zzb;

    public zzfgp(zzfgq zzfgqVar, com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        this.zza = zzbyVar;
        this.zzb = zzfgqVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzdrh zzdrhVar;
        zzdrhVar = this.zzb.zzd;
        if (zzdrhVar != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e4);
            }
        }
    }
}
