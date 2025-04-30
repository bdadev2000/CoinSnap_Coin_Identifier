package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzeu;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbgi;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzbka;
import com.google.android.gms.internal.ads.zzbkc;
import com.google.android.gms.internal.ads.zzbkd;
import com.google.android.gms.internal.ads.zzbrb;
import com.google.android.gms.internal.ads.zzbut;
import com.google.android.gms.internal.ads.zzbuv;

/* loaded from: classes2.dex */
public class AdLoader {
    private final zzp zza;
    private final Context zzb;
    private final zzbn zzc;

    /* loaded from: classes2.dex */
    public static class Builder {
        private final Context zza;
        private final zzbq zzb;

        public Builder(@NonNull Context context, @NonNull String str) {
            Context context2 = (Context) Preconditions.checkNotNull(context, "context cannot be null");
            zzbq zzc = zzay.zza().zzc(context, str, new zzbrb());
            this.zza = context2;
            this.zzb = zzc;
        }

        @NonNull
        public AdLoader build() {
            try {
                return new AdLoader(this.zza, this.zzb.zze(), zzp.zza);
            } catch (RemoteException e4) {
                zzm.zzh("Failed to build AdLoader.", e4);
                return new AdLoader(this.zza, new zzeu().zzc(), zzp.zza);
            }
        }

        @NonNull
        public Builder forAdManagerAdView(@NonNull OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener, @NonNull AdSize... adSizeArr) {
            if (adSizeArr != null && adSizeArr.length > 0) {
                try {
                    this.zzb.zzj(new zzbkc(onAdManagerAdViewLoadedListener), new zzq(this.zza, adSizeArr));
                } catch (RemoteException e4) {
                    zzm.zzk("Failed to add Google Ad Manager banner ad listener", e4);
                }
                return this;
            }
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }

        @NonNull
        public Builder forCustomFormatAd(@NonNull String str, @NonNull NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, @Nullable NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
            zzbut zzbutVar = new zzbut(onCustomFormatAdLoadedListener, onCustomClickListener);
            try {
                this.zzb.zzh(str, zzbutVar.zzb(), zzbutVar.zza());
            } catch (RemoteException e4) {
                zzm.zzk("Failed to add custom format ad listener", e4);
            }
            return this;
        }

        @NonNull
        public Builder forNativeAd(@NonNull NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
            try {
                this.zzb.zzk(new zzbuv(onNativeAdLoadedListener));
            } catch (RemoteException e4) {
                zzm.zzk("Failed to add google native ad listener", e4);
            }
            return this;
        }

        @NonNull
        public Builder withAdListener(@NonNull AdListener adListener) {
            try {
                this.zzb.zzl(new com.google.android.gms.ads.internal.client.zzg(adListener));
            } catch (RemoteException e4) {
                zzm.zzk("Failed to set AdListener.", e4);
            }
            return this;
        }

        @NonNull
        public Builder withAdManagerAdViewOptions(@NonNull AdManagerAdViewOptions adManagerAdViewOptions) {
            try {
                this.zzb.zzm(adManagerAdViewOptions);
            } catch (RemoteException e4) {
                zzm.zzk("Failed to specify Ad Manager banner ad options", e4);
            }
            return this;
        }

        @NonNull
        public Builder withNativeAdOptions(@NonNull NativeAdOptions nativeAdOptions) {
            zzfk zzfkVar;
            try {
                zzbq zzbqVar = this.zzb;
                boolean shouldReturnUrlsForImageAssets = nativeAdOptions.shouldReturnUrlsForImageAssets();
                boolean shouldRequestMultipleImages = nativeAdOptions.shouldRequestMultipleImages();
                int adChoicesPlacement = nativeAdOptions.getAdChoicesPlacement();
                if (nativeAdOptions.getVideoOptions() != null) {
                    zzfkVar = new zzfk(nativeAdOptions.getVideoOptions());
                } else {
                    zzfkVar = null;
                }
                zzbqVar.zzo(new zzbhk(4, shouldReturnUrlsForImageAssets, -1, shouldRequestMultipleImages, adChoicesPlacement, zzfkVar, nativeAdOptions.zzc(), nativeAdOptions.getMediaAspectRatio(), nativeAdOptions.zza(), nativeAdOptions.zzb(), nativeAdOptions.zzd() - 1));
            } catch (RemoteException e4) {
                zzm.zzk("Failed to specify native ad options", e4);
            }
            return this;
        }

        @Deprecated
        public final Builder zza(String str, com.google.android.gms.ads.formats.zzg zzgVar, @Nullable com.google.android.gms.ads.formats.zzf zzfVar) {
            zzbka zzbkaVar = new zzbka(zzgVar, zzfVar);
            try {
                this.zzb.zzh(str, zzbkaVar.zzd(), zzbkaVar.zzc());
            } catch (RemoteException e4) {
                zzm.zzk("Failed to add custom template ad listener", e4);
            }
            return this;
        }

        @Deprecated
        public final Builder zzb(com.google.android.gms.ads.formats.zzi zziVar) {
            try {
                this.zzb.zzk(new zzbkd(zziVar));
            } catch (RemoteException e4) {
                zzm.zzk("Failed to add google native ad listener", e4);
            }
            return this;
        }

        @NonNull
        @Deprecated
        public final Builder zzc(@NonNull com.google.android.gms.ads.formats.NativeAdOptions nativeAdOptions) {
            try {
                this.zzb.zzo(new zzbhk(nativeAdOptions));
            } catch (RemoteException e4) {
                zzm.zzk("Failed to specify native ad options", e4);
            }
            return this;
        }
    }

    public AdLoader(Context context, zzbn zzbnVar, zzp zzpVar) {
        this.zzb = context;
        this.zzc = zzbnVar;
        this.zza = zzpVar;
    }

    private final void zzb(final zzdx zzdxVar) {
        zzbep.zza(this.zzb);
        if (((Boolean) zzbgi.zzc.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zza(zzbep.zzlg)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdLoader.this.zza(zzdxVar);
                    }
                });
                return;
            }
        }
        try {
            this.zzc.zzg(this.zza.zza(this.zzb, zzdxVar));
        } catch (RemoteException e4) {
            zzm.zzh("Failed to load ad.", e4);
        }
    }

    public boolean isLoading() {
        try {
            return this.zzc.zzi();
        } catch (RemoteException e4) {
            zzm.zzk("Failed to check if ad is loading.", e4);
            return false;
        }
    }

    @RequiresPermission("android.permission.INTERNET")
    public void loadAd(@NonNull AdRequest adRequest) {
        zzb(adRequest.zza);
    }

    @RequiresPermission("android.permission.INTERNET")
    public void loadAds(@NonNull AdRequest adRequest, int i9) {
        try {
            this.zzc.zzh(this.zza.zza(this.zzb, adRequest.zza), i9);
        } catch (RemoteException e4) {
            zzm.zzh("Failed to load ads.", e4);
        }
    }

    public final /* synthetic */ void zza(zzdx zzdxVar) {
        try {
            this.zzc.zzg(this.zza.zza(this.zzb, zzdxVar));
        } catch (RemoteException e4) {
            zzm.zzh("Failed to load ad.", e4);
        }
    }

    public void loadAd(@NonNull AdManagerAdRequest adManagerAdRequest) {
        zzb(adManagerAdRequest.zza);
    }
}
