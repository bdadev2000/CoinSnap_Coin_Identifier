package com.google.android.gms.ads.appopen;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbak;
import com.google.android.gms.internal.ads.zzbao;
import com.google.android.gms.internal.ads.zzbaw;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbph;
import com.google.android.gms.internal.ads.zzbup;

/* loaded from: classes.dex */
public abstract class AppOpenAd {
    public static final int APP_OPEN_AD_ORIENTATION_LANDSCAPE = 2;
    public static final int APP_OPEN_AD_ORIENTATION_PORTRAIT = 1;

    /* loaded from: classes.dex */
    public static abstract class AppOpenAdLoadCallback extends AdLoadCallback<AppOpenAd> {
    }

    /* loaded from: classes.dex */
    public @interface AppOpenAdOrientation {
    }

    public static boolean isAdAvailable(@NonNull Context context, @NonNull String str) {
        try {
            return zzbc.zza().zzg(context.getApplicationContext(), new zzbph()).zzj(str);
        } catch (RemoteException e) {
            zzm.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    @Deprecated
    public static void load(@NonNull final Context context, @NonNull final String str, @NonNull final AdRequest adRequest, @AppOpenAdOrientation final int i2, @NonNull final AppOpenAdLoadCallback appOpenAdLoadCallback) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "adUnitId cannot be null.");
        Preconditions.checkNotNull(adRequest, "AdRequest cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbcv.zza(context);
        if (((Boolean) zzbep.zzd.zze()).booleanValue()) {
            if (((Boolean) zzbe.zzc().zza(zzbcv.zzkO)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.appopen.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        int i3 = i2;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new zzbaw(context2, str2, adRequest2.zza(), i3, appOpenAdLoadCallback).zza();
                        } catch (IllegalStateException e) {
                            zzbup.zza(context2).zzh(e, "AppOpenAd.load");
                        }
                    }
                });
                return;
            }
        }
        new zzbaw(context, str, adRequest.zza(), i2, appOpenAdLoadCallback).zza();
    }

    @Nullable
    public static AppOpenAd pollAd(@NonNull Context context, @NonNull String str) {
        try {
            zzbao zze = zzbc.zza().zzg(context.getApplicationContext(), new zzbph()).zze(str);
            if (zze != null) {
                return new zzbak(zze, str);
            }
            zzm.zzl("Failed to obtain an App Open ad from the preloader.", null);
            return null;
        } catch (RemoteException e) {
            zzm.zzl("#007 Could not call remote method.", e);
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

    public abstract void setImmersiveMode(boolean z2);

    public abstract void setOnPaidEventListener(@Nullable OnPaidEventListener onPaidEventListener);

    public abstract void show(@NonNull Activity activity);

    public static void load(@NonNull final Context context, @NonNull final String str, @NonNull final AdRequest adRequest, @NonNull final AppOpenAdLoadCallback appOpenAdLoadCallback) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "adUnitId cannot be null.");
        Preconditions.checkNotNull(adRequest, "AdRequest cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbcv.zza(context);
        if (((Boolean) zzbep.zzd.zze()).booleanValue()) {
            if (((Boolean) zzbe.zzc().zza(zzbcv.zzkO)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.appopen.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new zzbaw(context2, str2, adRequest2.zza(), 3, appOpenAdLoadCallback).zza();
                        } catch (IllegalStateException e) {
                            zzbup.zza(context2).zzh(e, "AppOpenAd.load");
                        }
                    }
                });
                return;
            }
        }
        new zzbaw(context, str, adRequest.zza(), 3, appOpenAdLoadCallback).zza();
    }

    @Deprecated
    public static void load(@NonNull final Context context, @NonNull final String str, @NonNull final AdManagerAdRequest adManagerAdRequest, @AppOpenAdOrientation final int i2, @NonNull final AppOpenAdLoadCallback appOpenAdLoadCallback) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "adUnitId cannot be null.");
        Preconditions.checkNotNull(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbcv.zza(context);
        if (((Boolean) zzbep.zzd.zze()).booleanValue()) {
            if (((Boolean) zzbe.zzc().zza(zzbcv.zzkO)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.appopen.zzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        int i3 = i2;
                        String str2 = str;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        try {
                            new zzbaw(context2, str2, adManagerAdRequest2.zza(), i3, appOpenAdLoadCallback).zza();
                        } catch (IllegalStateException e) {
                            zzbup.zza(context2).zzh(e, "AppOpenAdManager.load");
                        }
                    }
                });
                return;
            }
        }
        new zzbaw(context, str, adManagerAdRequest.zza(), i2, appOpenAdLoadCallback).zza();
    }
}
