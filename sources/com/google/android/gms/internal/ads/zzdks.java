package com.google.android.gms.internal.ads;

import a4.j;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzdks {
    private final zzdpn zza;
    private final zzdoc zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdks(zzdpn zzdpnVar, zzdoc zzdocVar) {
        this.zza = zzdpnVar;
        this.zzb = zzdocVar;
    }

    private static final int zzf(Context context, String str, int i10) {
        try {
            i10 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        return com.google.android.gms.ads.internal.util.client.zzf.zzy(context, i10);
    }

    public final View zza(@NonNull final View view, @NonNull final WindowManager windowManager) throws zzcfw {
        zzcfk zza = this.zza.zza(com.google.android.gms.ads.internal.client.zzs.zzc(), null, null);
        zza.zzF().setVisibility(4);
        zza.zzF().setContentDescription("policy_validator");
        zza.zzag("/sendMessageToSdk", new zzbjr() { // from class: com.google.android.gms.internal.ads.zzdkm
            @Override // com.google.android.gms.internal.ads.zzbjr
            public final void zza(Object obj, Map map) {
                zzdks.this.zzb((zzcfk) obj, map);
            }
        });
        zza.zzag("/hideValidatorOverlay", new zzbjr() { // from class: com.google.android.gms.internal.ads.zzdkn
            @Override // com.google.android.gms.internal.ads.zzbjr
            public final void zza(Object obj, Map map) {
                zzdks.this.zzc(windowManager, view, (zzcfk) obj, map);
            }
        });
        zza.zzag("/open", new zzbkd(null, null, null, null, null));
        this.zzb.zzm(new WeakReference(zza), "/loadNativeAdPolicyViolations", new zzbjr() { // from class: com.google.android.gms.internal.ads.zzdko
            @Override // com.google.android.gms.internal.ads.zzbjr
            public final void zza(Object obj, Map map) {
                zzdks.this.zze(view, windowManager, (zzcfk) obj, map);
            }
        });
        this.zzb.zzm(new WeakReference(zza), "/showValidatorOverlay", new zzbjr() { // from class: com.google.android.gms.internal.ads.zzdkp
            @Override // com.google.android.gms.internal.ads.zzbjr
            public final void zza(Object obj, Map map) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Show native ad policy validator overlay.");
                ((zzcfk) obj).zzF().setVisibility(0);
            }
        });
        return zza.zzF();
    }

    public final /* synthetic */ void zzb(zzcfk zzcfkVar, Map map) {
        this.zzb.zzj("sendMessageToNativeJs", map);
    }

    public final /* synthetic */ void zzc(WindowManager windowManager, View view, zzcfk zzcfkVar, Map map) {
        com.google.android.gms.ads.internal.util.client.zzm.zze("Hide native ad policy validator overlay.");
        zzcfkVar.zzF().setVisibility(8);
        if (zzcfkVar.zzF().getWindowToken() != null) {
            windowManager.removeView(zzcfkVar.zzF());
        }
        zzcfkVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.zzc != null && viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this.zzc);
        }
    }

    public final /* synthetic */ void zzd(Map map, boolean z10, int i10, String str, String str2) {
        HashMap q10 = j.q("messageType", "validatorHtmlLoaded");
        q10.put("id", (String) map.get("id"));
        this.zzb.zzj("sendMessageToNativeJs", q10);
    }

    public final /* synthetic */ void zze(final View view, final WindowManager windowManager, final zzcfk zzcfkVar, final Map map) {
        int i10;
        zzcfkVar.zzN().zzB(new zzcha() { // from class: com.google.android.gms.internal.ads.zzdkr
            @Override // com.google.android.gms.internal.ads.zzcha
            public final void zza(boolean z10, int i11, String str, String str2) {
                zzdks.this.zzd(map, z10, i11, str, str2);
            }
        });
        if (map != null) {
            Context context = view.getContext();
            int zzf = zzf(context, (String) map.get("validator_width"), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhK)).intValue());
            int zzf2 = zzf(context, (String) map.get("validator_height"), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhL)).intValue());
            int zzf3 = zzf(context, (String) map.get("validator_x"), 0);
            int zzf4 = zzf(context, (String) map.get("validator_y"), 0);
            zzcfkVar.zzaj(zzche.zzb(zzf, zzf2));
            try {
                zzcfkVar.zzG().getSettings().setUseWideViewPort(((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhM)).booleanValue());
                zzcfkVar.zzG().getSettings().setLoadWithOverviewMode(((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhN)).booleanValue());
            } catch (NullPointerException unused) {
            }
            final WindowManager.LayoutParams zzb = com.google.android.gms.ads.internal.util.zzbu.zzb();
            zzb.x = zzf3;
            zzb.y = zzf4;
            windowManager.updateViewLayout(zzcfkVar.zzF(), zzb);
            final String str = (String) map.get("orientation");
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                if (!"1".equals(str) && !MBridgeConstans.API_REUQEST_CATEGORY_APP.equals(str)) {
                    i10 = rect.top;
                } else {
                    i10 = rect.bottom;
                }
                final int i11 = i10 - zzf4;
                this.zzc = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.zzdkq
                    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                    public final void onScrollChanged() {
                        Rect rect2 = new Rect();
                        if (view.getGlobalVisibleRect(rect2)) {
                            zzcfk zzcfkVar2 = zzcfkVar;
                            if (zzcfkVar2.zzF().getWindowToken() != null) {
                                int i12 = i11;
                                WindowManager.LayoutParams layoutParams = zzb;
                                String str2 = str;
                                if (!"1".equals(str2) && !MBridgeConstans.API_REUQEST_CATEGORY_APP.equals(str2)) {
                                    layoutParams.y = rect2.top - i12;
                                } else {
                                    layoutParams.y = rect2.bottom - i12;
                                }
                                windowManager.updateViewLayout(zzcfkVar2.zzF(), layoutParams);
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
                zzcfkVar.loadUrl(str2);
            }
        }
    }
}
