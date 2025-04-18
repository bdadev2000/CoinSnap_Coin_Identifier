package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.applovin.impl.mediation.ads.e;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzdpm {
    private final zzcwk zza;
    private final zzdej zzb;
    private final zzcxt zzc;
    private final zzcyg zzd;
    private final zzcys zze;
    private final zzdbi zzf;
    private final Executor zzg;
    private final zzdef zzh;
    private final zzcny zzi;
    private final com.google.android.gms.ads.internal.zzb zzj;
    private final zzbyh zzk;
    private final zzavc zzl;
    private final zzdaz zzm;
    private final zzedp zzn;
    private final zzflr zzo;
    private final zzdsm zzp;
    private final zzcnb zzq;
    private final zzdps zzr;

    public zzdpm(zzcwk zzcwkVar, zzcxt zzcxtVar, zzcyg zzcygVar, zzcys zzcysVar, zzdbi zzdbiVar, Executor executor, zzdef zzdefVar, zzcny zzcnyVar, com.google.android.gms.ads.internal.zzb zzbVar, @Nullable zzbyh zzbyhVar, zzavc zzavcVar, zzdaz zzdazVar, zzedp zzedpVar, zzflr zzflrVar, zzdsm zzdsmVar, zzdej zzdejVar, zzcnb zzcnbVar, zzdps zzdpsVar) {
        this.zza = zzcwkVar;
        this.zzc = zzcxtVar;
        this.zzd = zzcygVar;
        this.zze = zzcysVar;
        this.zzf = zzdbiVar;
        this.zzg = executor;
        this.zzh = zzdefVar;
        this.zzi = zzcnyVar;
        this.zzj = zzbVar;
        this.zzk = zzbyhVar;
        this.zzl = zzavcVar;
        this.zzm = zzdazVar;
        this.zzn = zzedpVar;
        this.zzo = zzflrVar;
        this.zzp = zzdsmVar;
        this.zzb = zzdejVar;
        this.zzq = zzcnbVar;
        this.zzr = zzdpsVar;
    }

    public static final ua.b zzj(zzcfk zzcfkVar, String str, String str2, final Bundle bundle) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzck)).booleanValue()) {
            e.m(bundle, zzdrv.RENDERING_WEBVIEW_LOAD_HTML_START.zza());
        }
        final zzcao zzcaoVar = new zzcao();
        zzcfkVar.zzN().zzB(new zzcha() { // from class: com.google.android.gms.internal.ads.zzdpd
            @Override // com.google.android.gms.internal.ads.zzcha
            public final void zza(boolean z10, int i10, String str3, String str4) {
                zzcao zzcaoVar2 = zzcaoVar;
                if (z10) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzck)).booleanValue()) {
                        e.m(bundle, zzdrv.RENDERING_WEBVIEW_LOAD_HTML_END.zza());
                    }
                    zzcaoVar2.zzc(null);
                    return;
                }
                zzcaoVar2.zzd(new Exception("Ad Web View failed to load. Error code: " + i10 + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        zzcfkVar.zzae(str, str2, null);
        return zzcaoVar;
    }

    public final /* synthetic */ void zzc() {
        this.zza.onAdClicked();
    }

    public final /* synthetic */ void zzd(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    public final /* synthetic */ void zze() {
        this.zzc.zzb();
    }

    public final /* synthetic */ void zzf(View view) {
        this.zzj.zza();
    }

    public final /* synthetic */ void zzg(zzcfk zzcfkVar, zzcfk zzcfkVar2, Map map) {
        this.zzi.zzh(zzcfkVar);
    }

    public final /* synthetic */ boolean zzh(View view, MotionEvent motionEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjI)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            this.zzr.zzb(motionEvent);
        }
        this.zzj.zza();
        if (view != null) {
            view.performClick();
            return false;
        }
        return false;
    }

    public final void zzi(final zzcfk zzcfkVar, boolean z10, zzbju zzbjuVar, Bundle bundle) {
        zzaux zzc;
        zzbce zzbceVar = zzbcn.zzck;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).booleanValue()) {
            e.m(bundle, zzdrv.RENDERING_CONFIGURE_WEBVIEW_START.zza());
        }
        zzcfkVar.zzN().zzU(new com.google.android.gms.ads.internal.client.zza() { // from class: com.google.android.gms.internal.ads.zzdpe
            @Override // com.google.android.gms.ads.internal.client.zza
            public final void onAdClicked() {
                zzdpm.this.zzc();
            }
        }, this.zzd, this.zze, new zzbij() { // from class: com.google.android.gms.internal.ads.zzdpf
            @Override // com.google.android.gms.internal.ads.zzbij
            public final void zzb(String str, String str2) {
                zzdpm.this.zzd(str, str2);
            }
        }, new com.google.android.gms.ads.internal.overlay.zzac() { // from class: com.google.android.gms.internal.ads.zzdpg
            @Override // com.google.android.gms.ads.internal.overlay.zzac
            public final void zzg() {
                zzdpm.this.zze();
            }
        }, z10, zzbjuVar, this.zzj, new zzdpl(this), this.zzk, this.zzn, this.zzo, this.zzp, null, this.zzb, null, null, null, this.zzq);
        zzcfkVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.zzdph
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                zzdpm.this.zzh(view, motionEvent);
                return false;
            }
        });
        zzcfkVar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzdpi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zzdpm.this.zzf(view);
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcJ)).booleanValue() && (zzc = this.zzl.zzc()) != null) {
            zzc.zzo(zzcfkVar.zzF());
        }
        this.zzh.zzo(zzcfkVar, this.zzg);
        this.zzh.zzo(new zzaym() { // from class: com.google.android.gms.internal.ads.zzdpj
            @Override // com.google.android.gms.internal.ads.zzaym
            public final void zzdp(zzayl zzaylVar) {
                zzchc zzN = zzcfk.this.zzN();
                Rect rect = zzaylVar.zzd;
                zzN.zzq(rect.left, rect.top, false);
            }
        }, this.zzg);
        this.zzh.zza(zzcfkVar.zzF());
        zzcfkVar.zzag("/trackActiveViewUnit", new zzbjr() { // from class: com.google.android.gms.internal.ads.zzdpk
            @Override // com.google.android.gms.internal.ads.zzbjr
            public final void zza(Object obj, Map map) {
                zzdpm.this.zzg(zzcfkVar, (zzcfk) obj, map);
            }
        });
        this.zzi.zzi(zzcfkVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).booleanValue()) {
            e.m(bundle, zzdrv.RENDERING_CONFIGURE_WEBVIEW_END.zza());
        }
    }
}
