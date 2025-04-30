package com.google.android.gms.ads.admanager;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbgi;
import com.google.android.gms.internal.ads.zzbwj;

/* loaded from: classes2.dex */
public final class AdManagerAdView extends BaseAdView {
    public AdManagerAdView(@NonNull Context context) {
        super(context, 0);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    @Nullable
    public AdSize[] getAdSizes() {
        return this.zza.zzC();
    }

    @Nullable
    public AppEventListener getAppEventListener() {
        return this.zza.zzh();
    }

    @NonNull
    public VideoController getVideoController() {
        return this.zza.zzf();
    }

    @Nullable
    public VideoOptions getVideoOptions() {
        return this.zza.zzg();
    }

    @RequiresPermission("android.permission.INTERNET")
    public void loadAd(@NonNull final AdManagerAdRequest adManagerAdRequest) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbep.zza(getContext());
        if (((Boolean) zzbgi.zzf.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zza(zzbep.zzlg)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.admanager.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdManagerAdView.this.zza(adManagerAdRequest);
                    }
                });
                return;
            }
        }
        this.zza.zzm(adManagerAdRequest.zza());
    }

    public void recordManualImpression() {
        this.zza.zzo();
    }

    public void setAdSizes(@NonNull AdSize... adSizeArr) {
        if (adSizeArr != null && adSizeArr.length > 0) {
            this.zza.zzt(adSizeArr);
            return;
        }
        throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
    }

    public void setAppEventListener(@Nullable AppEventListener appEventListener) {
        this.zza.zzv(appEventListener);
    }

    public void setManualImpressionsEnabled(boolean z8) {
        this.zza.zzw(z8);
    }

    public void setVideoOptions(@NonNull VideoOptions videoOptions) {
        this.zza.zzy(videoOptions);
    }

    public final /* synthetic */ void zza(AdManagerAdRequest adManagerAdRequest) {
        try {
            this.zza.zzm(adManagerAdRequest.zza());
        } catch (IllegalStateException e4) {
            zzbwj.zza(getContext()).zzh(e4, "AdManagerAdView.loadAd");
        }
    }

    public final boolean zzb(zzbu zzbuVar) {
        return this.zza.zzz(zzbuVar);
    }

    public AdManagerAdView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet, true);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    public AdManagerAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9, 0, true);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }
}
