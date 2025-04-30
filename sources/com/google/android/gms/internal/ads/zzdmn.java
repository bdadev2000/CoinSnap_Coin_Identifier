package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdmn extends zzbie implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdnp {
    private final WeakReference zza;
    private final Map zzb = new HashMap();
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private zzdlo zze;
    private zzbao zzf;

    public zzdmn(View view, HashMap hashMap, HashMap hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        com.google.android.gms.ads.internal.zzu.zzx();
        zzccv.zza(view, this);
        com.google.android.gms.ads.internal.zzu.zzx();
        zzccv.zzb(view, this);
        this.zza = new WeakReference(view);
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (view2 != null) {
                this.zzb.put(str, new WeakReference(view2));
                if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.zzd.putAll(this.zzb);
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            View view3 = (View) entry2.getValue();
            if (view3 != null) {
                this.zzc.put((String) entry2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.zzd.putAll(this.zzc);
        this.zzf = new zzbao(view.getContext(), view);
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzdlo zzdloVar = this.zze;
        if (zzdloVar != null) {
            zzdloVar.zzD(view, zzf(), zzl(), zzm(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdlo zzdloVar = this.zze;
        if (zzdloVar != null) {
            zzdloVar.zzB(zzf(), zzl(), zzm(), zzdlo.zzX(zzf()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdlo zzdloVar = this.zze;
        if (zzdloVar != null) {
            zzdloVar.zzB(zzf(), zzl(), zzm(), zzdlo.zzX(zzf()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdlo zzdloVar = this.zze;
        if (zzdloVar != null) {
            zzdloVar.zzK(view, motionEvent, zzf());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final synchronized void zzb(IObjectWrapper iObjectWrapper) {
        try {
            if (this.zze != null) {
                Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
                if (!(unwrap instanceof View)) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                }
                this.zze.zzM((View) unwrap);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final synchronized void zzc(IObjectWrapper iObjectWrapper) {
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof zzdlo)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        zzdlo zzdloVar = this.zze;
        if (zzdloVar != null) {
            zzdloVar.zzS(this);
        }
        zzdlo zzdloVar2 = (zzdlo) unwrap;
        if (zzdloVar2.zzT()) {
            this.zze = zzdloVar2;
            zzdloVar2.zzR(this);
            this.zze.zzJ(zzf());
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzg("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final synchronized void zzd() {
        zzdlo zzdloVar = this.zze;
        if (zzdloVar != null) {
            zzdloVar.zzS(this);
            this.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnp
    @Nullable
    public final View zzf() {
        return (View) this.zza.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdnp
    @Nullable
    public final synchronized View zzg(String str) {
        WeakReference weakReference = (WeakReference) this.zzd.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdnp
    @Nullable
    public final FrameLayout zzh() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdnp
    public final zzbao zzi() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzdnp
    @Nullable
    public final synchronized IObjectWrapper zzj() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdnp
    public final synchronized String zzk() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.zzdnp
    public final synchronized Map zzl() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdnp
    public final synchronized Map zzm() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdnp
    @Nullable
    public final synchronized Map zzn() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdnp
    @Nullable
    public final synchronized JSONObject zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdnp
    @Nullable
    public final synchronized JSONObject zzp() {
        zzdlo zzdloVar = this.zze;
        if (zzdloVar != null) {
            return zzdloVar.zzk(zzf(), zzl(), zzm());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdnp
    public final synchronized void zzq(String str, View view, boolean z8) {
        this.zzd.put(str, new WeakReference(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
            this.zzb.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }
}
