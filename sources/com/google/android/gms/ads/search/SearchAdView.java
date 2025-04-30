package com.google.android.gms.ads.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.util.client.zzm;

/* loaded from: classes2.dex */
public final class SearchAdView extends ViewGroup {
    private final zzea zza;

    public SearchAdView(@NonNull Context context) {
        super(context);
        this.zza = new zzea(this);
    }

    public void destroy() {
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

    @RequiresPermission("android.permission.INTERNET")
    public void loadAd(@NonNull DynamicHeightSearchAdRequest dynamicHeightSearchAdRequest) {
        if (AdSize.SEARCH.equals(getAdSize())) {
            this.zza.zzm(dynamicHeightSearchAdRequest.zza());
            return;
        }
        throw new IllegalStateException("You must use AdSize.SEARCH for a DynamicHeightSearchAdRequest");
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
        this.zza.zzn();
    }

    public void resume() {
        this.zza.zzp();
    }

    public void setAdListener(@NonNull AdListener adListener) {
        this.zza.zzr(adListener);
    }

    public void setAdSize(@NonNull AdSize adSize) {
        this.zza.zzs(adSize);
    }

    public void setAdUnitId(@NonNull String str) {
        this.zza.zzu(str);
    }

    public SearchAdView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zza = new zzea(this, attributeSet, false);
    }

    public SearchAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.zza = new zzea(this, attributeSet, false);
    }

    @RequiresPermission("android.permission.INTERNET")
    public void loadAd(@NonNull SearchAdRequest searchAdRequest) {
        this.zza.zzm(searchAdRequest.zza());
    }
}
