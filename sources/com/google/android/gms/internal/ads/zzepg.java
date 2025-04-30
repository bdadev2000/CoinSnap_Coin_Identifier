package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzepg implements com.google.android.gms.ads.internal.client.zza, zzdhi {
    private com.google.android.gms.ads.internal.client.zzbe zza;

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        com.google.android.gms.ads.internal.client.zzbe zzbeVar = this.zza;
        if (zzbeVar != null) {
            try {
                zzbeVar.zzb();
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Remote Exception at onAdClicked.", e4);
            }
        }
    }

    public final synchronized void zza(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
        this.zza = zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final synchronized void zzdG() {
        com.google.android.gms.ads.internal.client.zzbe zzbeVar = this.zza;
        if (zzbeVar != null) {
            try {
                zzbeVar.zzb();
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Remote Exception at onPhysicalClick.", e4);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final synchronized void zzdf() {
    }
}
