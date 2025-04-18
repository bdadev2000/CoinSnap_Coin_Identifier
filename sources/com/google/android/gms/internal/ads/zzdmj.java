package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.facebook.appevents.AppEventsConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzdmj {
    private final zzdre zza;
    private final zzdpt zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdmj(zzdre zzdreVar, zzdpt zzdptVar) {
        this.zza = zzdreVar;
        this.zzb = zzdptVar;
    }

    private static final int zzf(Context context, String str, int i2) {
        try {
            i2 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        return com.google.android.gms.ads.internal.util.client.zzf.zzy(context, i2);
    }

    public final View zza(@NonNull final View view, @NonNull final WindowManager windowManager) throws zzcga {
        zzcfo zza = this.zza.zza(com.google.android.gms.ads.internal.client.zzs.zzc(), null, null);
        zza.zzF().setVisibility(4);
        zza.zzF().setContentDescription("policy_validator");
        zza.zzag("/sendMessageToSdk", new zzbjw() { // from class: com.google.android.gms.internal.ads.zzdmd
            @Override // com.google.android.gms.internal.ads.zzbjw
            public final void zza(Object obj, Map map) {
                zzdmj.this.zzb((zzcfo) obj, map);
            }
        });
        zza.zzag("/hideValidatorOverlay", new zzbjw() { // from class: com.google.android.gms.internal.ads.zzdme
            @Override // com.google.android.gms.internal.ads.zzbjw
            public final void zza(Object obj, Map map) {
                zzdmj.this.zzc(windowManager, view, (zzcfo) obj, map);
            }
        });
        zza.zzag("/open", new zzbki(null, null, null, null, null));
        this.zzb.zzm(new WeakReference(zza), "/loadNativeAdPolicyViolations", new zzbjw() { // from class: com.google.android.gms.internal.ads.zzdmf
            @Override // com.google.android.gms.internal.ads.zzbjw
            public final void zza(Object obj, Map map) {
                zzdmj.this.zze(view, windowManager, (zzcfo) obj, map);
            }
        });
        this.zzb.zzm(new WeakReference(zza), "/showValidatorOverlay", new zzbjw() { // from class: com.google.android.gms.internal.ads.zzdmg
            @Override // com.google.android.gms.internal.ads.zzbjw
            public final void zza(Object obj, Map map) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Show native ad policy validator overlay.");
                ((zzcfo) obj).zzF().setVisibility(0);
            }
        });
        return zza.zzF();
    }

    public final /* synthetic */ void zzb(zzcfo zzcfoVar, Map map) {
        this.zzb.zzj("sendMessageToNativeJs", map);
    }

    public final /* synthetic */ void zzc(WindowManager windowManager, View view, zzcfo zzcfoVar, Map map) {
        com.google.android.gms.ads.internal.util.client.zzm.zze("Hide native ad policy validator overlay.");
        zzcfoVar.zzF().setVisibility(8);
        if (zzcfoVar.zzF().getWindowToken() != null) {
            windowManager.removeView(zzcfoVar.zzF());
        }
        zzcfoVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.zzc == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.zzc);
    }

    public final /* synthetic */ void zzd(Map map, boolean z2, int i2, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.zzb.zzj("sendMessageToNativeJs", hashMap);
    }

    public final /* synthetic */ void zze(final View view, final WindowManager windowManager, final zzcfo zzcfoVar, final Map map) {
        zzcfoVar.zzN().zzB(new zzche() { // from class: com.google.android.gms.internal.ads.zzdmi
            @Override // com.google.android.gms.internal.ads.zzche
            public final void zza(boolean z2, int i2, String str, String str2) {
                zzdmj.this.zzd(map, z2, i2, str, str2);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int zzf = zzf(context, (String) map.get("validator_width"), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzhI)).intValue());
        int zzf2 = zzf(context, (String) map.get("validator_height"), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzhJ)).intValue());
        int zzf3 = zzf(context, (String) map.get("validator_x"), 0);
        int zzf4 = zzf(context, (String) map.get("validator_y"), 0);
        zzcfoVar.zzaj(zzchi.zzb(zzf, zzf2));
        try {
            zzcfoVar.zzG().getSettings().setUseWideViewPort(((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzhK)).booleanValue());
            zzcfoVar.zzG().getSettings().setLoadWithOverviewMode(((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzhL)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams zzb = com.google.android.gms.ads.internal.util.zzbv.zzb();
        zzb.x = zzf3;
        zzb.y = zzf4;
        windowManager.updateViewLayout(zzcfoVar.zzF(), zzb);
        final String str = (String) map.get("orientation");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            final int i2 = ((AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(str) || "2".equals(str)) ? rect.bottom : rect.top) - zzf4;
            this.zzc = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.zzdmh
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    Rect rect2 = new Rect();
                    if (view.getGlobalVisibleRect(rect2)) {
                        zzcfo zzcfoVar2 = zzcfoVar;
                        if (zzcfoVar2.zzF().getWindowToken() == null) {
                            return;
                        }
                        int i3 = i2;
                        WindowManager.LayoutParams layoutParams = zzb;
                        String str2 = str;
                        if (AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(str2) || "2".equals(str2)) {
                            layoutParams.y = rect2.bottom - i3;
                        } else {
                            layoutParams.y = rect2.top - i3;
                        }
                        windowManager.updateViewLayout(zzcfoVar2.zzF(), layoutParams);
                    }
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.zzc);
            }
        }
        String str2 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        zzcfoVar.loadUrl(str2);
    }
}
