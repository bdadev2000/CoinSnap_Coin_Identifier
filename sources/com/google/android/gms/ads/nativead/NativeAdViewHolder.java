package com.google.android.gms.ads.nativead;

import android.os.RemoteException;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbgi;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class NativeAdViewHolder {

    @NonNull
    public static final WeakHashMap zza = new WeakHashMap();
    private zzbgi zzb;
    private WeakReference zzc;

    public NativeAdViewHolder(@NonNull View view, @NonNull Map<String, View> map, @NonNull Map<String, View> map2) {
        Preconditions.checkNotNull(view, "ContainerView must not be null");
        if (view instanceof NativeAdView) {
            zzm.zzg("The provided containerView is of type of NativeAdView, which cannot be usedwith NativeAdViewHolder.");
            return;
        }
        WeakHashMap weakHashMap = zza;
        if (weakHashMap.get(view) != null) {
            zzm.zzg("The provided containerView is already in use with another NativeAdViewHolder.");
            return;
        }
        weakHashMap.put(view, this);
        this.zzc = new WeakReference(view);
        this.zzb = zzbc.zza().zzk(view, zza(map), zza(map2));
    }

    private static final HashMap zza(Map map) {
        if (map == null) {
            return new HashMap();
        }
        return new HashMap(map);
    }

    public final void setClickConfirmingView(@NonNull View view) {
        try {
            this.zzb.zzb(ObjectWrapper.wrap(view));
        } catch (RemoteException e2) {
            zzm.zzh("Unable to call setClickConfirmingView on delegate", e2);
        }
    }

    public void setNativeAd(@NonNull NativeAd nativeAd) {
        View view;
        IObjectWrapper iObjectWrapper = (IObjectWrapper) nativeAd.zza();
        WeakReference weakReference = this.zzc;
        if (weakReference != null) {
            view = (View) weakReference.get();
        } else {
            view = null;
        }
        if (view == null) {
            zzm.zzj("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        WeakHashMap weakHashMap = zza;
        if (!weakHashMap.containsKey(view)) {
            weakHashMap.put(view, this);
        }
        zzbgi zzbgiVar = this.zzb;
        if (zzbgiVar != null) {
            try {
                zzbgiVar.zzc(iObjectWrapper);
            } catch (RemoteException e2) {
                zzm.zzh("Unable to call setNativeAd on delegate", e2);
            }
        }
    }

    public void unregisterNativeAd() {
        View view;
        zzbgi zzbgiVar = this.zzb;
        if (zzbgiVar != null) {
            try {
                zzbgiVar.zzd();
            } catch (RemoteException e2) {
                zzm.zzh("Unable to call unregisterNativeAd on delegate", e2);
            }
        }
        WeakReference weakReference = this.zzc;
        if (weakReference != null) {
            view = (View) weakReference.get();
        } else {
            view = null;
        }
        if (view != null) {
            zza.remove(view);
        }
    }
}
