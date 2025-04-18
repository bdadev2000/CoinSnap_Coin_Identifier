package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbr;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzei;
import com.google.android.gms.ads.internal.client.zzfi;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzbfn;
import com.google.android.gms.internal.ads.zzbic;
import com.google.android.gms.internal.ads.zzbie;
import com.google.android.gms.internal.ads.zzbif;
import com.google.android.gms.internal.ads.zzbpc;
import com.google.android.gms.internal.ads.zzbst;
import com.google.android.gms.internal.ads.zzbsv;

/* loaded from: classes3.dex */
public class AdLoader {
    private final zzr zza;
    private final Context zzb;
    private final zzbr zzc;

    /* loaded from: classes3.dex */
    public static class Builder {
        private final Context zza;
        private final zzbu zzb;

        public Builder(@NonNull Context context, @NonNull String str) {
            Context context2 = (Context) Preconditions.checkNotNull(context, "context cannot be null");
            zzbu zzd = zzbc.zza().zzd(context, str, new zzbpc());
            this.zza = context2;
            this.zzb = zzd;
        }

        @NonNull
        public AdLoader build() {
            try {
                return new AdLoader(this.zza, this.zzb.zze(), zzr.zza);
            } catch (RemoteException e2) {
                zzm.zzh("Failed to build AdLoader.", e2);
                return new AdLoader(this.zza, new zzfi().zzc(), zzr.zza);
            }
        }

        @NonNull
        public Builder forAdManagerAdView(@NonNull OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener, @NonNull AdSize... adSizeArr) {
            if (adSizeArr != null && adSizeArr.length > 0) {
                try {
                    this.zzb.zzj(new zzbie(onAdManagerAdViewLoadedListener), new zzs(this.zza, adSizeArr));
                } catch (RemoteException e2) {
                    zzm.zzk("Failed to add Google Ad Manager banner ad listener", e2);
                }
                return this;
            }
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }

        @NonNull
        public Builder forCustomFormatAd(@NonNull String str, @NonNull NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, @Nullable NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
            zzbst zzbstVar = new zzbst(onCustomFormatAdLoadedListener, onCustomClickListener);
            try {
                this.zzb.zzh(str, zzbstVar.zzb(), zzbstVar.zza());
            } catch (RemoteException e2) {
                zzm.zzk("Failed to add custom format ad listener", e2);
            }
            return this;
        }

        @NonNull
        public Builder forNativeAd(@NonNull NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
            try {
                this.zzb.zzk(new zzbsv(onNativeAdLoadedListener));
            } catch (RemoteException e2) {
                zzm.zzk("Failed to add google native ad listener", e2);
            }
            return this;
        }

        @NonNull
        public Builder withAdListener(@NonNull AdListener adListener) {
            try {
                this.zzb.zzl(new com.google.android.gms.ads.internal.client.zzg(adListener));
            } catch (RemoteException e2) {
                zzm.zzk("Failed to set AdListener.", e2);
            }
            return this;
        }

        @NonNull
        public Builder withAdManagerAdViewOptions(@NonNull AdManagerAdViewOptions adManagerAdViewOptions) {
            try {
                this.zzb.zzm(adManagerAdViewOptions);
            } catch (RemoteException e2) {
                zzm.zzk("Failed to specify Ad Manager banner ad options", e2);
            }
            return this;
        }

        @NonNull
        public Builder withNativeAdOptions(@NonNull NativeAdOptions nativeAdOptions) {
            zzga zzgaVar;
            try {
                zzbu zzbuVar = this.zzb;
                boolean shouldReturnUrlsForImageAssets = nativeAdOptions.shouldReturnUrlsForImageAssets();
                boolean shouldRequestMultipleImages = nativeAdOptions.shouldRequestMultipleImages();
                int adChoicesPlacement = nativeAdOptions.getAdChoicesPlacement();
                if (nativeAdOptions.getVideoOptions() != null) {
                    zzgaVar = new zzga(nativeAdOptions.getVideoOptions());
                } else {
                    zzgaVar = null;
                }
                zzbuVar.zzo(new zzbfn(4, shouldReturnUrlsForImageAssets, -1, shouldRequestMultipleImages, adChoicesPlacement, zzgaVar, nativeAdOptions.zzc(), nativeAdOptions.getMediaAspectRatio(), nativeAdOptions.zza(), nativeAdOptions.zzb(), nativeAdOptions.zzd() - 1));
            } catch (RemoteException e2) {
                zzm.zzk("Failed to specify native ad options", e2);
            }
            return this;
        }

        @Deprecated
        public final Builder zza(String str, com.google.android.gms.ads.formats.zzg zzgVar, @Nullable com.google.android.gms.ads.formats.zzf zzfVar) {
            zzbic zzbicVar = new zzbic(zzgVar, zzfVar);
            try {
                this.zzb.zzh(str, zzbicVar.zzd(), zzbicVar.zzc());
            } catch (RemoteException e2) {
                zzm.zzk("Failed to add custom template ad listener", e2);
            }
            return this;
        }

        @Deprecated
        public final Builder zzb(com.google.android.gms.ads.formats.zzi zziVar) {
            try {
                this.zzb.zzk(new zzbif(zziVar));
            } catch (RemoteException e2) {
                zzm.zzk("Failed to add google native ad listener", e2);
            }
            return this;
        }

        @NonNull
        @Deprecated
        public final Builder zzc(@NonNull com.google.android.gms.ads.formats.NativeAdOptions nativeAdOptions) {
            try {
                this.zzb.zzo(new zzbfn(nativeAdOptions));
            } catch (RemoteException e2) {
                zzm.zzk("Failed to specify native ad options", e2);
            }
            return this;
        }
    }

    public AdLoader(Context context, zzbr zzbrVar, zzr zzrVar) {
        this.zzb = context;
        this.zzc = zzbrVar;
        this.zza = zzrVar;
    }

    private final void zzb(final zzei zzeiVar) {
        zzbcn.zza(this.zzb);
        if (((Boolean) zzbel.zzc.zze()).booleanValue()) {
            if (((Boolean) zzbe.zzc().zza(zzbcn.zzkP)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdLoader.this.zza(zzeiVar);
                    }
                });
                return;
            }
        }
        try {
            this.zzc.zzg(this.zza.zza(this.zzb, zzeiVar));
        } catch (RemoteException e2) {
            zzm.zzh("Failed to load ad.", e2);
        }
    }

    public boolean isLoading() {
        try {
            return this.zzc.zzi();
        } catch (RemoteException e2) {
            zzm.zzk("Failed to check if ad is loading.", e2);
            return false;
        }
    }

    @RequiresPermission("android.permission.INTERNET")
    public void loadAd(@NonNull AdRequest adRequest) {
        zzb(adRequest.zza);
    }

    @RequiresPermission("android.permission.INTERNET")
    public void loadAds(@NonNull AdRequest adRequest, int i10) {
        try {
            this.zzc.zzh(this.zza.zza(this.zzb, adRequest.zza), i10);
        } catch (RemoteException e2) {
            zzm.zzh("Failed to load ads.", e2);
        }
    }

    public final /* synthetic */ void zza(zzei zzeiVar) {
        try {
            this.zzc.zzg(this.zza.zza(this.zzb, zzeiVar));
        } catch (RemoteException e2) {
            zzm.zzh("Failed to load ad.", e2);
        }
    }

    public void loadAd(@NonNull AdManagerAdRequest adManagerAdRequest) {
        zzb(adManagerAdRequest.zza);
    }
}
