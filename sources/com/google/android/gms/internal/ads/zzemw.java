package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzemw implements com.google.android.gms.ads.internal.client.zza, zzdel {
    private com.google.android.gms.ads.internal.client.zzbi zza;

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        com.google.android.gms.ads.internal.client.zzbi zzbiVar = this.zza;
        if (zzbiVar != null) {
            try {
                zzbiVar.zzb();
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Remote Exception at onAdClicked.", e2);
            }
        }
    }

    public final synchronized void zza(com.google.android.gms.ads.internal.client.zzbi zzbiVar) {
        this.zza = zzbiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final synchronized void zzdG() {
        com.google.android.gms.ads.internal.client.zzbi zzbiVar = this.zza;
        if (zzbiVar != null) {
            try {
                zzbiVar.zzb();
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Remote Exception at onPhysicalClick.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final synchronized void zzdf() {
    }
}
