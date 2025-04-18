package com.google.android.gms.ads.interstitial;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzbml;
import com.google.android.gms.internal.ads.zzbpc;
import com.google.android.gms.internal.ads.zzbuj;

/* loaded from: classes3.dex */
public abstract class InterstitialAd {
    public static boolean isAdAvailable(@NonNull Context context, @NonNull String str) {
        try {
            return zzbc.zza().zzg(context.getApplicationContext(), new zzbpc()).zzk(str);
        } catch (RemoteException e2) {
            zzm.zzl("#007 Could not call remote method.", e2);
            return false;
        }
    }

    public static void load(@NonNull final Context context, @NonNull final String str, @NonNull final AdRequest adRequest, @NonNull final InterstitialAdLoadCallback interstitialAdLoadCallback) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(adRequest, "AdRequest cannot be null.");
        Preconditions.checkNotNull(interstitialAdLoadCallback, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbcn.zza(context);
        if (((Boolean) zzbel.zzi.zze()).booleanValue()) {
            if (((Boolean) zzbe.zzc().zza(zzbcn.zzkP)).booleanValue()) {
                zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.interstitial.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new zzbml(context2, str2).zza(adRequest2.zza(), interstitialAdLoadCallback);
                        } catch (IllegalStateException e2) {
                            zzbuj.zza(context2).zzh(e2, "InterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new zzbml(context, str).zza(adRequest.zza(), interstitialAdLoadCallback);
    }

    @Nullable
    public static InterstitialAd pollAd(@NonNull Context context, @NonNull String str) {
        try {
            zzby zzf = zzbc.zza().zzg(context.getApplicationContext(), new zzbpc()).zzf(str);
            if (zzf == null) {
                zzm.zzl("Failed to obtain an Interstitial Ad from the preloader.", null);
                return null;
            }
            return new zzbml(context, str, zzf);
        } catch (RemoteException e2) {
            zzm.zzl("#007 Could not call remote method.", e2);
            return null;
        }
    }

    @NonNull
    public abstract String getAdUnitId();

    @Nullable
    public abstract FullScreenContentCallback getFullScreenContentCallback();

    @Nullable
    public abstract OnPaidEventListener getOnPaidEventListener();

    @NonNull
    public abstract ResponseInfo getResponseInfo();

    public abstract void setFullScreenContentCallback(@Nullable FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z10);

    public abstract void setOnPaidEventListener(@Nullable OnPaidEventListener onPaidEventListener);

    public abstract void show(@NonNull Activity activity);
}
