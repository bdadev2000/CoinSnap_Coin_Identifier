package com.google.android.gms.internal.ads;

import android.content.Context;
import com.applovin.impl.mediation.ads.e;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzefm implements zzefb {
    private final zzcor zza;
    private final Context zzb;
    private final zzdpn zzc;
    private final zzffo zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbju zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziy)).booleanValue();
    private final zzeea zzi;
    private final zzdsh zzj;

    public zzefm(zzcor zzcorVar, Context context, Executor executor, zzdpn zzdpnVar, zzffo zzffoVar, VersionInfoParcel versionInfoParcel, zzbju zzbjuVar, zzeea zzeeaVar, zzdsh zzdshVar) {
        this.zzb = context;
        this.zza = zzcorVar;
        this.zze = executor;
        this.zzc = zzdpnVar;
        this.zzd = zzffoVar;
        this.zzf = versionInfoParcel;
        this.zzg = zzbjuVar;
        this.zzi = zzeeaVar;
        this.zzj = zzdshVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final ua.b zza(final zzfff zzfffVar, final zzfet zzfetVar) {
        final zzdpr zzdprVar = new zzdpr();
        ua.b zzn = zzgei.zzn(zzgei.zzh(null), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzefi
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzefm.this.zzc(zzfetVar, zzfffVar, zzdprVar, obj);
            }
        }, this.zze);
        zzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefj
            @Override // java.lang.Runnable
            public final void run() {
                zzdpr.this.zzb();
            }
        }, this.zze);
        return zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final boolean zzb(zzfff zzfffVar, zzfet zzfetVar) {
        zzfey zzfeyVar = zzfetVar.zzs;
        return (zzfeyVar == null || zzfeyVar.zza == null) ? false : true;
    }

    public final /* synthetic */ ua.b zzc(final zzfet zzfetVar, zzfff zzfffVar, zzdpr zzdprVar, Object obj) throws Exception {
        final zzefm zzefmVar;
        zzbju zzbjuVar;
        zzbce zzbceVar = zzbcn.zzck;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).booleanValue()) {
            e.m(this.zzj.zza(), zzdrv.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        final zzcfk zza = this.zzc.zza(this.zzd.zze, zzfetVar, zzfffVar.zzb.zzb);
        zza.zzac(zzfetVar.zzW);
        zzdprVar.zza(this.zzb, zza.zzF());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).booleanValue()) {
            e.m(this.zzj.zza(), zzdrv.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        zzcao zzcaoVar = new zzcao();
        final zzcoo zza2 = this.zza.zza(new zzcsg(zzfffVar, zzfetVar, null), new zzdfn(new zzefo(this.zzf, zzcaoVar, zzfetVar, zza, this.zzd, this.zzh, this.zzg, this.zzi), zza), new zzcop(zzfetVar.zzaa));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).booleanValue()) {
            zzefmVar = this;
            e.m(zzefmVar.zzj.zza(), zzdrv.RENDERING_AD_COMPONENT_CREATION_END.zza());
        } else {
            zzefmVar = this;
        }
        zzdpm zzh = zza2.zzh();
        if (zzefmVar.zzh) {
            zzbjuVar = zzefmVar.zzg;
        } else {
            zzbjuVar = null;
        }
        zzh.zzi(zza, false, zzbjuVar, zzefmVar.zzj.zza());
        zzcaoVar.zzc(zza2);
        zza2.zzc().zzo(new zzcxg() { // from class: com.google.android.gms.internal.ads.zzefk
            @Override // com.google.android.gms.internal.ads.zzcxg
            public final void zzr() {
                zzcfk zzcfkVar = zzcfk.this;
                if (zzcfkVar.zzN() != null) {
                    zzcfkVar.zzN().zzr();
                }
            }
        }, zzcaj.zzf);
        String str = zzfetVar.zzs.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfe)).booleanValue() && zza2.zzi().zze(true)) {
            str = zzcgv.zzb(str, zzcgv.zza(zzfetVar));
        }
        zza2.zzh();
        return zzgei.zzm(zzdpm.zzj(zza, zzfetVar.zzs.zzb, str, zzefmVar.zzj.zza()), new zzfwh(zzefmVar) { // from class: com.google.android.gms.internal.ads.zzefl
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj2) {
                zzcfk zzcfkVar = zza;
                if (zzfetVar.zzM) {
                    zzcfkVar.zzah();
                }
                zzcoo zzcooVar = zza2;
                zzcfkVar.zzab();
                zzcfkVar.onPause();
                return zzcooVar.zza();
            }
        }, zzefmVar.zze);
    }
}
