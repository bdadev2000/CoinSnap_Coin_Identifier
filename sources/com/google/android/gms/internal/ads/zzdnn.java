package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.applovin.impl.L;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzdnn {
    private final zzdsd zza;
    private final zzdqs zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdnn(zzdsd zzdsdVar, zzdqs zzdqsVar) {
        this.zza = zzdsdVar;
        this.zzb = zzdqsVar;
    }

    private static final int zzf(Context context, String str, int i9) {
        try {
            i9 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        com.google.android.gms.ads.internal.client.zzay.zzb();
        return com.google.android.gms.ads.internal.util.client.zzf.zzy(context, i9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zza(@NonNull final View view, @NonNull final WindowManager windowManager) throws zzchp {
        zzchd zza = this.zza.zza(com.google.android.gms.ads.internal.client.zzq.zzc(), null, null);
        View view2 = (View) zza;
        view2.setVisibility(4);
        view2.setContentDescription("policy_validator");
        zza.zzag("/sendMessageToSdk", new zzblp() { // from class: com.google.android.gms.internal.ads.zzdnh
            @Override // com.google.android.gms.internal.ads.zzblp
            public final void zza(Object obj, Map map) {
                zzdnn.this.zzb((zzchd) obj, map);
            }
        });
        zza.zzag("/hideValidatorOverlay", new zzblp() { // from class: com.google.android.gms.internal.ads.zzdni
            @Override // com.google.android.gms.internal.ads.zzblp
            public final void zza(Object obj, Map map) {
                zzdnn.this.zzc(windowManager, view, (zzchd) obj, map);
            }
        });
        zza.zzag("/open", new zzbmb(null, null, null, null, null));
        this.zzb.zzm(new WeakReference(zza), "/loadNativeAdPolicyViolations", new zzblp() { // from class: com.google.android.gms.internal.ads.zzdnj
            @Override // com.google.android.gms.internal.ads.zzblp
            public final void zza(Object obj, Map map) {
                zzdnn.this.zze(view, windowManager, (zzchd) obj, map);
            }
        });
        this.zzb.zzm(new WeakReference(zza), "/showValidatorOverlay", new zzblp() { // from class: com.google.android.gms.internal.ads.zzdnk
            @Override // com.google.android.gms.internal.ads.zzblp
            public final void zza(Object obj, Map map) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Show native ad policy validator overlay.");
                ((zzchd) obj).zzF().setVisibility(0);
            }
        });
        return (View) zza;
    }

    public final /* synthetic */ void zzb(zzchd zzchdVar, Map map) {
        this.zzb.zzj("sendMessageToNativeJs", map);
    }

    public final /* synthetic */ void zzc(WindowManager windowManager, View view, zzchd zzchdVar, Map map) {
        com.google.android.gms.ads.internal.util.client.zzm.zze("Hide native ad policy validator overlay.");
        zzchdVar.zzF().setVisibility(8);
        if (zzchdVar.zzF().getWindowToken() != null) {
            windowManager.removeView(zzchdVar.zzF());
        }
        zzchdVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.zzc != null && viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this.zzc);
        }
    }

    public final /* synthetic */ void zzd(Map map, boolean z8, int i9, String str, String str2) {
        HashMap m = L.m("messageType", "validatorHtmlLoaded");
        m.put("id", (String) map.get("id"));
        this.zzb.zzj("sendMessageToNativeJs", m);
    }

    public final /* synthetic */ void zze(final View view, final WindowManager windowManager, final zzchd zzchdVar, final Map map) {
        int i9;
        zzchdVar.zzN().zzB(new zzcit() { // from class: com.google.android.gms.internal.ads.zzdnm
            @Override // com.google.android.gms.internal.ads.zzcit
            public final void zza(boolean z8, int i10, String str, String str2) {
                zzdnn.this.zzd(map, z8, i10, str, str2);
            }
        });
        if (map != null) {
            Context context = view.getContext();
            int zzf = zzf(context, (String) map.get("validator_width"), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzig)).intValue());
            int zzf2 = zzf(context, (String) map.get("validator_height"), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzih)).intValue());
            int zzf3 = zzf(context, (String) map.get("validator_x"), 0);
            int zzf4 = zzf(context, (String) map.get("validator_y"), 0);
            zzchdVar.zzaj(zzcix.zzb(zzf, zzf2));
            try {
                zzchdVar.zzG().getSettings().setUseWideViewPort(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzii)).booleanValue());
                zzchdVar.zzG().getSettings().setLoadWithOverviewMode(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzij)).booleanValue());
            } catch (NullPointerException unused) {
            }
            final WindowManager.LayoutParams zzb = com.google.android.gms.ads.internal.util.zzbz.zzb();
            zzb.x = zzf3;
            zzb.y = zzf4;
            windowManager.updateViewLayout(zzchdVar.zzF(), zzb);
            final String str = (String) map.get("orientation");
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                if (!"1".equals(str) && !MBridgeConstans.API_REUQEST_CATEGORY_APP.equals(str)) {
                    i9 = rect.top;
                } else {
                    i9 = rect.bottom;
                }
                final int i10 = i9 - zzf4;
                this.zzc = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.zzdnl
                    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                    public final void onScrollChanged() {
                        Rect rect2 = new Rect();
                        if (view.getGlobalVisibleRect(rect2)) {
                            zzchd zzchdVar2 = zzchdVar;
                            if (zzchdVar2.zzF().getWindowToken() != null) {
                                int i11 = i10;
                                WindowManager.LayoutParams layoutParams = zzb;
                                String str2 = str;
                                if (!"1".equals(str2) && !MBridgeConstans.API_REUQEST_CATEGORY_APP.equals(str2)) {
                                    layoutParams.y = rect2.top - i11;
                                } else {
                                    layoutParams.y = rect2.bottom - i11;
                                }
                                windowManager.updateViewLayout(zzchdVar2.zzF(), layoutParams);
                            }
                        }
                    }
                };
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnScrollChangedListener(this.zzc);
                }
            }
            String str2 = (String) map.get("overlay_url");
            if (!TextUtils.isEmpty(str2)) {
                zzchdVar.loadUrl(str2);
            }
        }
    }
}
