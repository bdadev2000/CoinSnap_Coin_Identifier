package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.applovin.impl.adview.t;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzdrd {
    private final zzcxy zza;
    private final zzdfy zzb;
    private final zzczh zzc;
    private final zzczu zzd;
    private final zzdag zze;
    private final zzdcx zzf;
    private final Executor zzg;
    private final zzdfu zzh;
    private final zzcpm zzi;
    private final com.google.android.gms.ads.internal.zzb zzj;
    private final zzbyk zzk;
    private final zzavn zzl;
    private final zzdco zzm;
    private final zzeey zzn;
    private final zzfng zzo;
    private final zzdud zzp;
    private final zzcop zzq;
    private final zzdrj zzr;

    public zzdrd(zzcxy zzcxyVar, zzczh zzczhVar, zzczu zzczuVar, zzdag zzdagVar, zzdcx zzdcxVar, Executor executor, zzdfu zzdfuVar, zzcpm zzcpmVar, com.google.android.gms.ads.internal.zzb zzbVar, @Nullable zzbyk zzbykVar, zzavn zzavnVar, zzdco zzdcoVar, zzeey zzeeyVar, zzfng zzfngVar, zzdud zzdudVar, zzdfy zzdfyVar, zzcop zzcopVar, zzdrj zzdrjVar) {
        this.zza = zzcxyVar;
        this.zzc = zzczhVar;
        this.zzd = zzczuVar;
        this.zze = zzdagVar;
        this.zzf = zzdcxVar;
        this.zzg = executor;
        this.zzh = zzdfuVar;
        this.zzi = zzcpmVar;
        this.zzj = zzbVar;
        this.zzk = zzbykVar;
        this.zzl = zzavnVar;
        this.zzm = zzdcoVar;
        this.zzn = zzeeyVar;
        this.zzo = zzfngVar;
        this.zzp = zzdudVar;
        this.zzb = zzdfyVar;
        this.zzq = zzcopVar;
        this.zzr = zzdrjVar;
    }

    public static final ListenableFuture zzj(zzcfo zzcfoVar, String str, String str2, final Bundle bundle) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzch)).booleanValue()) {
            t.t(bundle, zzdtm.RENDERING_WEBVIEW_LOAD_HTML_START.zza());
        }
        final zzcas zzcasVar = new zzcas();
        zzcfoVar.zzN().zzB(new zzche() { // from class: com.google.android.gms.internal.ads.zzdqu
            @Override // com.google.android.gms.internal.ads.zzche
            public final void zza(boolean z2, int i2, String str3, String str4) {
                zzcas zzcasVar2 = zzcasVar;
                if (z2) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzch)).booleanValue()) {
                        t.t(bundle, zzdtm.RENDERING_WEBVIEW_LOAD_HTML_END.zza());
                    }
                    zzcasVar2.zzc(null);
                    return;
                }
                zzcasVar2.zzd(new Exception("Ad Web View failed to load. Error code: " + i2 + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        zzcfoVar.zzae(str, str2, null);
        return zzcasVar;
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

    public final /* synthetic */ void zzg(zzcfo zzcfoVar, zzcfo zzcfoVar2, Map map) {
        this.zzi.zzh(zzcfoVar);
    }

    public final /* synthetic */ boolean zzh(View view, MotionEvent motionEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjG)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            this.zzr.zzb(motionEvent);
        }
        this.zzj.zza();
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    public final void zzi(final zzcfo zzcfoVar, boolean z2, zzbjz zzbjzVar, Bundle bundle) {
        zzavi zzc;
        zzbcm zzbcmVar = zzbcv.zzch;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcmVar)).booleanValue()) {
            t.t(bundle, zzdtm.RENDERING_CONFIGURE_WEBVIEW_START.zza());
        }
        zzcfoVar.zzN().zzS(new com.google.android.gms.ads.internal.client.zza() { // from class: com.google.android.gms.internal.ads.zzdqv
            @Override // com.google.android.gms.ads.internal.client.zza
            public final void onAdClicked() {
                zzdrd.this.zzc();
            }
        }, this.zzd, this.zze, new zzbio() { // from class: com.google.android.gms.internal.ads.zzdqw
            @Override // com.google.android.gms.internal.ads.zzbio
            public final void zzb(String str, String str2) {
                zzdrd.this.zzd(str, str2);
            }
        }, new com.google.android.gms.ads.internal.overlay.zzac() { // from class: com.google.android.gms.internal.ads.zzdqx
            @Override // com.google.android.gms.ads.internal.overlay.zzac
            public final void zzg() {
                zzdrd.this.zze();
            }
        }, z2, zzbjzVar, this.zzj, new zzdrc(this), this.zzk, this.zzn, this.zzo, this.zzp, null, this.zzb, null, null, null, this.zzq);
        zzcfoVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.zzdqy
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                zzdrd.this.zzh(view, motionEvent);
                return false;
            }
        });
        zzcfoVar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzdqz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zzdrd.this.zzf(view);
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzcG)).booleanValue() && (zzc = this.zzl.zzc()) != null) {
            zzc.zzo(zzcfoVar.zzF());
        }
        this.zzh.zzo(zzcfoVar, this.zzg);
        this.zzh.zzo(new zzayv() { // from class: com.google.android.gms.internal.ads.zzdra
            @Override // com.google.android.gms.internal.ads.zzayv
            public final void zzdp(zzayu zzayuVar) {
                zzchg zzN = zzcfo.this.zzN();
                Rect rect = zzayuVar.zzd;
                zzN.zzq(rect.left, rect.top, false);
            }
        }, this.zzg);
        this.zzh.zza(zzcfoVar.zzF());
        zzcfoVar.zzag("/trackActiveViewUnit", new zzbjw() { // from class: com.google.android.gms.internal.ads.zzdrb
            @Override // com.google.android.gms.internal.ads.zzbjw
            public final void zza(Object obj, Map map) {
                zzdrd.this.zzg(zzcfoVar, (zzcfo) obj, map);
            }
        });
        this.zzi.zzi(zzcfoVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcmVar)).booleanValue()) {
            t.t(bundle, zzdtm.RENDERING_CONFIGURE_WEBVIEW_END.zza());
        }
    }
}
