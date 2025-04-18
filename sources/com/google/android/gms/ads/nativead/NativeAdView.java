package com.google.android.gms.ads.nativead;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzfd;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbgc;

/* loaded from: classes3.dex */
public final class NativeAdView extends FrameLayout {
    private final FrameLayout zza;

    @Nullable
    private final zzbgc zzb;

    public NativeAdView(@NonNull Context context) {
        super(context);
        this.zza = zzd(context);
        this.zzb = zze();
    }

    private final FrameLayout zzd(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    @Nullable
    private final zzbgc zze() {
        if (isInEditMode()) {
            return null;
        }
        FrameLayout frameLayout = this.zza;
        return zzbc.zza().zzj(frameLayout.getContext(), this, frameLayout);
    }

    private final void zzf(String str, @Nullable View view) {
        zzbgc zzbgcVar = this.zzb;
        if (zzbgcVar == null) {
            return;
        }
        try {
            zzbgcVar.zzdv(str, ObjectWrapper.wrap(view));
        } catch (RemoteException e2) {
            zzm.zzh("Unable to call setAssetView on delegate", e2);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(@NonNull View view, int i10, @NonNull ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        super.bringChildToFront(this.zza);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(@NonNull View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.zza;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public void destroy() {
        zzbgc zzbgcVar = this.zzb;
        if (zzbgcVar == null) {
            return;
        }
        try {
            zzbgcVar.zzc();
        } catch (RemoteException e2) {
            zzm.zzh("Unable to destroy native ad view", e2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(@NonNull MotionEvent motionEvent) {
        if (this.zzb != null) {
            if (((Boolean) zzbe.zzc().zza(zzbcn.zzlh)).booleanValue()) {
                try {
                    this.zzb.zzd(ObjectWrapper.wrap(motionEvent));
                } catch (RemoteException e2) {
                    zzm.zzh("Unable to call handleTouchEvent on delegate", e2);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public AdChoicesView getAdChoicesView() {
        View zza = zza("3011");
        if (zza instanceof AdChoicesView) {
            return (AdChoicesView) zza;
        }
        return null;
    }

    @Nullable
    public final View getAdvertiserView() {
        return zza("3005");
    }

    @Nullable
    public final View getBodyView() {
        return zza("3004");
    }

    @Nullable
    public final View getCallToActionView() {
        return zza("3002");
    }

    @Nullable
    public final View getHeadlineView() {
        return zza("3001");
    }

    @Nullable
    public final View getIconView() {
        return zza("3003");
    }

    @Nullable
    public final View getImageView() {
        return zza("3008");
    }

    @Nullable
    public final MediaView getMediaView() {
        View zza = zza("3010");
        if (zza instanceof MediaView) {
            return (MediaView) zza;
        }
        if (zza != null) {
            zzm.zze("View is not an instance of MediaView");
            return null;
        }
        return null;
    }

    @Nullable
    public final View getPriceView() {
        return zza("3007");
    }

    @Nullable
    public final View getStarRatingView() {
        return zza("3009");
    }

    @Nullable
    public final View getStoreView() {
        return zza("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NonNull View view, int i10) {
        super.onVisibilityChanged(view, i10);
        zzbgc zzbgcVar = this.zzb;
        if (zzbgcVar == null) {
            return;
        }
        try {
            zzbgcVar.zze(ObjectWrapper.wrap(view), i10);
        } catch (RemoteException e2) {
            zzm.zzh("Unable to call onVisibilityChanged on delegate", e2);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        addView(this.zza);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(@NonNull View view) {
        if (this.zza == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(@Nullable AdChoicesView adChoicesView) {
        zzf("3011", adChoicesView);
    }

    public final void setAdvertiserView(@Nullable View view) {
        zzf("3005", view);
    }

    public final void setBodyView(@Nullable View view) {
        zzf("3004", view);
    }

    public final void setCallToActionView(@Nullable View view) {
        zzf("3002", view);
    }

    public final void setClickConfirmingView(@Nullable View view) {
        zzbgc zzbgcVar = this.zzb;
        if (zzbgcVar == null) {
            return;
        }
        try {
            zzbgcVar.zzdw(ObjectWrapper.wrap(view));
        } catch (RemoteException e2) {
            zzm.zzh("Unable to call setClickConfirmingView on delegate", e2);
        }
    }

    public final void setHeadlineView(@Nullable View view) {
        zzf("3001", view);
    }

    public final void setIconView(@Nullable View view) {
        zzf("3003", view);
    }

    public final void setImageView(@Nullable View view) {
        zzf("3008", view);
    }

    public final void setMediaView(@Nullable MediaView mediaView) {
        zzf("3010", mediaView);
        if (mediaView == null) {
            return;
        }
        mediaView.zza(new zzb(this));
        mediaView.zzb(new zzc(this));
    }

    public void setNativeAd(@NonNull NativeAd nativeAd) {
        zzbgc zzbgcVar = this.zzb;
        if (zzbgcVar == null) {
            return;
        }
        try {
            zzbgcVar.zzdz((IObjectWrapper) nativeAd.zza());
        } catch (RemoteException e2) {
            zzm.zzh("Unable to call setNativeAd on delegate", e2);
        }
    }

    public final void setPriceView(@Nullable View view) {
        zzf("3007", view);
    }

    public final void setStarRatingView(@Nullable View view) {
        zzf("3009", view);
    }

    public final void setStoreView(@Nullable View view) {
        zzf("3006", view);
    }

    @Nullable
    public final View zza(@NonNull String str) {
        zzbgc zzbgcVar = this.zzb;
        if (zzbgcVar != null) {
            try {
                IObjectWrapper zzb = zzbgcVar.zzb(str);
                if (zzb != null) {
                    return (View) ObjectWrapper.unwrap(zzb);
                }
            } catch (RemoteException e2) {
                zzm.zzh("Unable to call getAssetView on delegate", e2);
            }
        }
        return null;
    }

    public final /* synthetic */ void zzb(MediaContent mediaContent) {
        zzbgc zzbgcVar = this.zzb;
        if (zzbgcVar == null) {
            return;
        }
        try {
            if (mediaContent instanceof zzfd) {
                zzbgcVar.zzdx(((zzfd) mediaContent).zzc());
            } else if (mediaContent == null) {
                zzbgcVar.zzdx(null);
            } else {
                zzm.zze("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e2) {
            zzm.zzh("Unable to call setMediaContent on delegate", e2);
        }
    }

    public final /* synthetic */ void zzc(ImageView.ScaleType scaleType) {
        zzbgc zzbgcVar = this.zzb;
        if (zzbgcVar != null && scaleType != null) {
            try {
                zzbgcVar.zzdy(ObjectWrapper.wrap(scaleType));
            } catch (RemoteException e2) {
                zzm.zzh("Unable to call setMediaViewImageScaleType on delegate", e2);
            }
        }
    }

    public NativeAdView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zza = zzd(context);
        this.zzb = zze();
    }

    public NativeAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.zza = zzd(context);
        this.zzb = zze();
    }

    @TargetApi(21)
    public NativeAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.zza = zzd(context);
        this.zzb = zze();
    }
}
