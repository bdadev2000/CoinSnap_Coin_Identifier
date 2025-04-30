package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbgi;
import com.google.android.gms.internal.ads.zzbwj;

/* loaded from: classes2.dex */
public abstract class BaseAdView extends ViewGroup {
    protected final zzea zza;

    public BaseAdView(@NonNull Context context, int i9) {
        super(context);
        this.zza = new zzea(this, i9);
    }

    public void destroy() {
        zzbep.zza(getContext());
        if (((Boolean) zzbgi.zze.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zza(zzbep.zzld)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zzd
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = BaseAdView.this;
                        try {
                            baseAdView.zza.zzk();
                        } catch (IllegalStateException e4) {
                            zzbwj.zza(baseAdView.getContext()).zzh(e4, "BaseAdView.destroy");
                        }
                    }
                });
                return;
            }
        }
        this.zza.zzk();
    }

    @NonNull
    public AdListener getAdListener() {
        return this.zza.zza();
    }

    @Nullable
    public AdSize getAdSize() {
        return this.zza.zzb();
    }

    @NonNull
    public String getAdUnitId() {
        return this.zza.zzj();
    }

    @Nullable
    public OnPaidEventListener getOnPaidEventListener() {
        return this.zza.zzc();
    }

    @Nullable
    public ResponseInfo getResponseInfo() {
        return this.zza.zzd();
    }

    public boolean isCollapsible() {
        return this.zza.zzA();
    }

    public boolean isLoading() {
        return this.zza.zzB();
    }

    @RequiresPermission("android.permission.INTERNET")
    public void loadAd(@NonNull final AdRequest adRequest) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbep.zza(getContext());
        if (((Boolean) zzbgi.zzf.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zza(zzbep.zzlg)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zzf
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = BaseAdView.this;
                        try {
                            baseAdView.zza.zzm(adRequest.zza);
                        } catch (IllegalStateException e4) {
                            zzbwj.zza(baseAdView.getContext()).zzh(e4, "BaseAdView.loadAd");
                        }
                    }
                });
                return;
            }
        }
        this.zza.zzm(adRequest.zza);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i13 = ((i11 - i9) - measuredWidth) / 2;
            int i14 = ((i12 - i10) - measuredHeight) / 2;
            childAt.layout(i13, i14, measuredWidth + i13, measuredHeight + i14);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        AdSize adSize;
        int i11;
        int i12 = 0;
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            measureChild(childAt, i9, i10);
            i12 = childAt.getMeasuredWidth();
            i11 = childAt.getMeasuredHeight();
        } else {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e4) {
                zzm.zzh("Unable to retrieve ad size.", e4);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                i11 = adSize.getHeightInPixels(context);
                i12 = widthInPixels;
            } else {
                i11 = 0;
            }
        }
        setMeasuredDimension(View.resolveSize(Math.max(i12, getSuggestedMinimumWidth()), i9), View.resolveSize(Math.max(i11, getSuggestedMinimumHeight()), i10));
    }

    public void pause() {
        zzbep.zza(getContext());
        if (((Boolean) zzbgi.zzg.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zza(zzbep.zzle)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zze
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = BaseAdView.this;
                        try {
                            baseAdView.zza.zzn();
                        } catch (IllegalStateException e4) {
                            zzbwj.zza(baseAdView.getContext()).zzh(e4, "BaseAdView.pause");
                        }
                    }
                });
                return;
            }
        }
        this.zza.zzn();
    }

    public void resume() {
        zzbep.zza(getContext());
        if (((Boolean) zzbgi.zzh.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zza(zzbep.zzlc)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = BaseAdView.this;
                        try {
                            baseAdView.zza.zzp();
                        } catch (IllegalStateException e4) {
                            zzbwj.zza(baseAdView.getContext()).zzh(e4, "BaseAdView.resume");
                        }
                    }
                });
                return;
            }
        }
        this.zza.zzp();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(@NonNull AdListener adListener) {
        this.zza.zzr(adListener);
        if (adListener == 0) {
            this.zza.zzq(null);
            return;
        }
        if (adListener instanceof com.google.android.gms.ads.internal.client.zza) {
            this.zza.zzq((com.google.android.gms.ads.internal.client.zza) adListener);
        }
        if (adListener instanceof AppEventListener) {
            this.zza.zzv((AppEventListener) adListener);
        }
    }

    public void setAdSize(@NonNull AdSize adSize) {
        this.zza.zzs(adSize);
    }

    public void setAdUnitId(@NonNull String str) {
        this.zza.zzu(str);
    }

    public void setOnPaidEventListener(@Nullable OnPaidEventListener onPaidEventListener) {
        this.zza.zzx(onPaidEventListener);
    }

    public BaseAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i9) {
        super(context, attributeSet);
        this.zza = new zzea(this, attributeSet, false, i9);
    }

    public BaseAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i9, int i10) {
        super(context, attributeSet, i9);
        this.zza = new zzea(this, attributeSet, false, i10);
    }

    public BaseAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i9, int i10, boolean z8) {
        super(context, attributeSet, i9);
        this.zza = new zzea(this, attributeSet, z8, i10);
    }

    public BaseAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, boolean z8) {
        super(context, attributeSet);
        this.zza = new zzea(this, attributeSet, z8);
    }
}
