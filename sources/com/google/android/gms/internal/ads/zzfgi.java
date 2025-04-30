package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* loaded from: classes2.dex */
final class zzfgi implements OnAdMetadataChangedListener {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzdd zza;
    final /* synthetic */ zzfgk zzb;

    public zzfgi(zzfgk zzfgkVar, com.google.android.gms.ads.internal.client.zzdd zzddVar) {
        this.zza = zzddVar;
        this.zzb = zzfgkVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzdrh zzdrhVar;
        zzdrhVar = this.zzb.zzi;
        if (zzdrhVar != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e4);
            }
        }
    }
}
