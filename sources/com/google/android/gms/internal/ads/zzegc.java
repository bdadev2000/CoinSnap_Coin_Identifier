package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.applovin.impl.mediation.ads.e;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzegc implements zzefb {
    private final zzcqh zza;
    private final Context zzb;
    private final zzdpn zzc;
    private final zzffo zzd;
    private final Executor zze;
    private final zzfwh zzf;
    private final zzdsh zzg;

    public zzegc(zzcqh zzcqhVar, Context context, Executor executor, zzdpn zzdpnVar, zzffo zzffoVar, zzfwh zzfwhVar, zzdsh zzdshVar) {
        this.zzb = context;
        this.zza = zzcqhVar;
        this.zze = executor;
        this.zzc = zzdpnVar;
        this.zzd = zzffoVar;
        this.zzf = zzfwhVar;
        this.zzg = zzdshVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final ua.b zza(final zzfff zzfffVar, final zzfet zzfetVar) {
        return zzgei.zzn(zzgei.zzh(null), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzegb
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzegc.this.zzc(zzfffVar, zzfetVar, obj);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final boolean zzb(zzfff zzfffVar, zzfet zzfetVar) {
        zzfey zzfeyVar = zzfetVar.zzs;
        return (zzfeyVar == null || zzfeyVar.zza == null) ? false : true;
    }

    public final /* synthetic */ ua.b zzc(zzfff zzfffVar, zzfet zzfetVar, Object obj) throws Exception {
        View zzdpqVar;
        zzbce zzbceVar = zzbcn.zzck;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).booleanValue()) {
            e.m(this.zzg.zza(), zzdrv.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        com.google.android.gms.ads.internal.client.zzs zza = zzffu.zza(this.zzb, zzfetVar.zzu);
        final zzcfk zza2 = this.zzc.zza(zza, zzfetVar, zzfffVar.zzb.zzb);
        zza2.zzac(zzfetVar.zzW);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhy)).booleanValue() && zzfetVar.zzag) {
            zzdpqVar = zzcrc.zza(this.zzb, zza2.zzF(), zzfetVar);
        } else {
            zzdpqVar = new zzdpq(this.zzb, zza2.zzF(), (com.google.android.gms.ads.internal.util.zzat) this.zzf.apply(zzfetVar));
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).booleanValue()) {
            e.m(this.zzg.zza(), zzdrv.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        final zzcpe zza3 = this.zza.zza(new zzcsg(zzfffVar, zzfetVar, null), new zzcpk(zzdpqVar, zza2, new zzcro() { // from class: com.google.android.gms.internal.ads.zzefw
            @Override // com.google.android.gms.internal.ads.zzcro
            public final com.google.android.gms.ads.internal.client.zzeb zza() {
                return zzcfk.this.zzq();
            }
        }, zzffu.zzb(zza)));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).booleanValue()) {
            e.m(this.zzg.zza(), zzdrv.RENDERING_AD_COMPONENT_CREATION_END.zza());
        }
        zza3.zzh().zzi(zza2, false, null, this.zzg.zza());
        zzcxe zzc = zza3.zzc();
        zzcxg zzcxgVar = new zzcxg() { // from class: com.google.android.gms.internal.ads.zzefx
            @Override // com.google.android.gms.internal.ads.zzcxg
            public final void zzr() {
                zzcfk zzcfkVar = zzcfk.this;
                if (zzcfkVar.zzN() != null) {
                    zzcfkVar.zzN().zzr();
                }
            }
        };
        zzges zzgesVar = zzcaj.zzf;
        zzc.zzo(zzcxgVar, zzgesVar);
        String str = zzfetVar.zzs.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfe)).booleanValue() && zza3.zzi().zze(true)) {
            str = zzcgv.zzb(str, zzcgv.zza(zzfetVar));
        }
        zza3.zzh();
        ua.b zzj = zzdpm.zzj(zza2, zzfetVar.zzs.zzb, str, this.zzg.zza());
        if (zzfetVar.zzM) {
            zzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefy
                @Override // java.lang.Runnable
                public final void run() {
                    zzcfk.this.zzah();
                }
            }, this.zze);
        }
        zzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefz
            @Override // java.lang.Runnable
            public final void run() {
                zzegc.this.zzd(zza2);
            }
        }, this.zze);
        return zzgei.zzm(zzj, new zzfwh() { // from class: com.google.android.gms.internal.ads.zzega
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj2) {
                return zzcpe.this.zza();
            }
        }, zzgesVar);
    }

    public final /* synthetic */ void zzd(zzcfk zzcfkVar) {
        zzcfkVar.zzab();
        zzffo zzffoVar = this.zzd;
        zzcgm zzq = zzcfkVar.zzq();
        com.google.android.gms.ads.internal.client.zzga zzgaVar = zzffoVar.zza;
        if (zzgaVar != null && zzq != null) {
            zzq.zzs(zzgaVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbp)).booleanValue() && !zzcfkVar.isAttachedToWindow()) {
            zzcfkVar.onPause();
            zzcfkVar.zzav(true);
        }
    }
}
