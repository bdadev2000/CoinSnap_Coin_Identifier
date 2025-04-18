package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.applovin.impl.adview.t;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzehl implements zzegk {
    private final zzcrv zza;
    private final Context zzb;
    private final zzdre zzc;
    private final zzfhc zzd;
    private final Executor zze;
    private final zzfxq zzf;
    private final zzdty zzg;

    public zzehl(zzcrv zzcrvVar, Context context, Executor executor, zzdre zzdreVar, zzfhc zzfhcVar, zzfxq zzfxqVar, zzdty zzdtyVar) {
        this.zzb = context;
        this.zza = zzcrvVar;
        this.zze = executor;
        this.zzc = zzdreVar;
        this.zzd = zzfhcVar;
        this.zzf = zzfxqVar;
        this.zzg = zzdtyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final ListenableFuture zza(final zzfgt zzfgtVar, final zzfgh zzfghVar) {
        return zzgfo.zzn(zzgfo.zzh(null), new zzgev() { // from class: com.google.android.gms.internal.ads.zzehk
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                return zzehl.this.zzc(zzfgtVar, zzfghVar, obj);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final boolean zzb(zzfgt zzfgtVar, zzfgh zzfghVar) {
        zzfgm zzfgmVar = zzfghVar.zzs;
        return (zzfgmVar == null || zzfgmVar.zza == null) ? false : true;
    }

    public final /* synthetic */ ListenableFuture zzc(zzfgt zzfgtVar, zzfgh zzfghVar, Object obj) throws Exception {
        zzbcm zzbcmVar = zzbcv.zzch;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcmVar)).booleanValue()) {
            t.t(this.zzg.zza(), zzdtm.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        com.google.android.gms.ads.internal.client.zzs zza = zzfhi.zza(this.zzb, zzfghVar.zzu);
        final zzcfo zza2 = this.zzc.zza(zza, zzfghVar, zzfgtVar.zzb.zzb);
        zza2.zzac(zzfghVar.zzW);
        View zza3 = (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzhw)).booleanValue() && zzfghVar.zzag) ? zzcsq.zza(this.zzb, zza2.zzF(), zzfghVar) : new zzdrh(this.zzb, zza2.zzF(), (com.google.android.gms.ads.internal.util.zzau) this.zzf.apply(zzfghVar));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcmVar)).booleanValue()) {
            t.t(this.zzg.zza(), zzdtm.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        final zzcqs zza4 = this.zza.zza(new zzctu(zzfgtVar, zzfghVar, null), new zzcqy(zza3, zza2, new zzctc() { // from class: com.google.android.gms.internal.ads.zzehf
            @Override // com.google.android.gms.internal.ads.zzctc
            public final com.google.android.gms.ads.internal.client.zzeb zza() {
                return zzcfo.this.zzq();
            }
        }, zzfhi.zzb(zza)));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcmVar)).booleanValue()) {
            t.t(this.zzg.zza(), zzdtm.RENDERING_AD_COMPONENT_CREATION_END.zza());
        }
        zza4.zzh().zzi(zza2, false, null, this.zzg.zza());
        zzcys zzc = zza4.zzc();
        zzcyu zzcyuVar = new zzcyu() { // from class: com.google.android.gms.internal.ads.zzehg
            @Override // com.google.android.gms.internal.ads.zzcyu
            public final void zzr() {
                zzcfo zzcfoVar = zzcfo.this;
                if (zzcfoVar.zzN() != null) {
                    zzcfoVar.zzN().zzr();
                }
            }
        };
        zzgfz zzgfzVar = zzcan.zzf;
        zzc.zzo(zzcyuVar, zzgfzVar);
        String str = zzfghVar.zzs.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzeX)).booleanValue() && zza4.zzi().zze(true)) {
            str = zzcgz.zzb(str, zzcgz.zza(zzfghVar));
        }
        zza4.zzh();
        ListenableFuture zzj = zzdrd.zzj(zza2, zzfghVar.zzs.zzb, str, this.zzg.zza());
        if (zzfghVar.zzM) {
            zzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehh
                @Override // java.lang.Runnable
                public final void run() {
                    zzcfo.this.zzah();
                }
            }, this.zze);
        }
        zzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehi
            @Override // java.lang.Runnable
            public final void run() {
                zzehl.this.zzd(zza2);
            }
        }, this.zze);
        return zzgfo.zzm(zzj, new zzfxq() { // from class: com.google.android.gms.internal.ads.zzehj
            @Override // com.google.android.gms.internal.ads.zzfxq
            public final Object apply(Object obj2) {
                return zzcqs.this.zza();
            }
        }, zzgfzVar);
    }

    public final /* synthetic */ void zzd(zzcfo zzcfoVar) {
        zzcfoVar.zzab();
        zzfhc zzfhcVar = this.zzd;
        zzcgq zzq = zzcfoVar.zzq();
        com.google.android.gms.ads.internal.client.zzgb zzgbVar = zzfhcVar.zza;
        if (zzgbVar != null && zzq != null) {
            zzq.zzs(zzgbVar);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzbm)).booleanValue() || zzcfoVar.isAttachedToWindow()) {
            return;
        }
        zzcfoVar.onPause();
        zzcfoVar.zzav(true);
    }
}
