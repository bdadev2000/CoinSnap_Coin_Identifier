package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes3.dex */
public final class zzbab extends AppOpenAd {

    @Nullable
    FullScreenContentCallback zza;
    private final zzbaf zzb;

    @NonNull
    private final String zzc;
    private final zzbac zzd = new zzbac();

    @Nullable
    private OnPaidEventListener zze;

    public zzbab(zzbaf zzbafVar, String str) {
        this.zzb = zzbafVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final String getAdUnitId() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    @Nullable
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    @Nullable
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    @NonNull
    public final ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzdy zzdyVar;
        try {
            zzdyVar = this.zzb.zzf();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
            zzdyVar = null;
        }
        return ResponseInfo.zzb(zzdyVar);
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setFullScreenContentCallback(@Nullable FullScreenContentCallback fullScreenContentCallback) {
        this.zza = fullScreenContentCallback;
        this.zzd.zzg(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setImmersiveMode(boolean z10) {
        try {
            this.zzb.zzg(z10);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setOnPaidEventListener(@Nullable OnPaidEventListener onPaidEventListener) {
        this.zze = onPaidEventListener;
        try {
            this.zzb.zzh(new com.google.android.gms.ads.internal.client.zzfs(onPaidEventListener));
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void show(@NonNull Activity activity) {
        try {
            this.zzb.zzi(ObjectWrapper.wrap(activity), this.zzd);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
    }
}
