package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.VideoController;

/* loaded from: classes3.dex */
public final class zzdom extends VideoController.VideoLifecycleCallbacks {
    private final zzdiy zza;

    public zzdom(zzdiy zzdiyVar) {
        this.zza = zzdiyVar;
    }

    @Nullable
    private static com.google.android.gms.ads.internal.client.zzee zza(zzdiy zzdiyVar) {
        com.google.android.gms.ads.internal.client.zzeb zzj = zzdiyVar.zzj();
        if (zzj == null) {
            return null;
        }
        try {
            return zzj.zzi();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoEnd() {
        com.google.android.gms.ads.internal.client.zzee zza = zza(this.zza);
        if (zza == null) {
            return;
        }
        try {
            zza.zze();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Unable to call onVideoEnd()", e2);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoPause() {
        com.google.android.gms.ads.internal.client.zzee zza = zza(this.zza);
        if (zza == null) {
            return;
        }
        try {
            zza.zzg();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Unable to call onVideoEnd()", e2);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoStart() {
        com.google.android.gms.ads.internal.client.zzee zza = zza(this.zza);
        if (zza == null) {
            return;
        }
        try {
            zza.zzi();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Unable to call onVideoEnd()", e2);
        }
    }
}
