package com.google.android.gms.internal.ads;

import android.content.Context;
import com.applovin.impl.mediation.ads.e;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzejy implements zzefb {
    private final Context zza;
    private final zzdpn zzb;
    private final zzdow zzc;
    private final zzffo zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbju zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziy)).booleanValue();
    private final zzeea zzi;
    private final zzdsh zzj;

    public zzejy(Context context, VersionInfoParcel versionInfoParcel, zzffo zzffoVar, Executor executor, zzdow zzdowVar, zzdpn zzdpnVar, zzbju zzbjuVar, zzeea zzeeaVar, zzdsh zzdshVar) {
        this.zza = context;
        this.zzd = zzffoVar;
        this.zzc = zzdowVar;
        this.zze = executor;
        this.zzf = versionInfoParcel;
        this.zzb = zzdpnVar;
        this.zzg = zzbjuVar;
        this.zzi = zzeeaVar;
        this.zzj = zzdshVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final ua.b zza(final zzfff zzfffVar, final zzfet zzfetVar) {
        final zzdpr zzdprVar = new zzdpr();
        ua.b zzn = zzgei.zzn(zzgei.zzh(null), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzejr
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzejy.this.zzc(zzfetVar, zzfffVar, zzdprVar, obj);
            }
        }, this.zze);
        zzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejs
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
        final zzejy zzejyVar;
        zzbju zzbjuVar;
        zzbce zzbceVar = zzbcn.zzck;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).booleanValue()) {
            e.m(this.zzj.zza(), zzdrv.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        final zzcfk zza = this.zzb.zza(this.zzd.zze, zzfetVar, zzfffVar.zzb.zzb);
        zza.zzac(zzfetVar.zzW);
        zzdprVar.zza(this.zza, zza.zzF());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).booleanValue()) {
            e.m(this.zzj.zza(), zzdrv.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        zzcao zzcaoVar = new zzcao();
        final zzdos zze = this.zzc.zze(new zzcsg(zzfffVar, zzfetVar, null), new zzdot(new zzejx(this.zza, this.zzb, this.zzd, this.zzf, zzfetVar, zzcaoVar, zza, this.zzg, this.zzh, this.zzi, this.zzj), zza));
        zzcaoVar.zzc(zze);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).booleanValue()) {
            zzejyVar = this;
            e.m(zzejyVar.zzj.zza(), zzdrv.RENDERING_AD_COMPONENT_CREATION_END.zza());
        } else {
            zzejyVar = this;
        }
        zzbkj.zzb(zza, zze.zzg());
        zze.zzc().zzo(new zzcxg() { // from class: com.google.android.gms.internal.ads.zzejt
            @Override // com.google.android.gms.internal.ads.zzcxg
            public final void zzr() {
                zzcfk zzcfkVar = zzcfk.this;
                if (zzcfkVar.zzN() != null) {
                    zzcfkVar.zzN().zzr();
                }
            }
        }, zzcaj.zzf);
        zzdpm zzl = zze.zzl();
        if (zzejyVar.zzh) {
            zzbjuVar = zzejyVar.zzg;
        } else {
            zzbjuVar = null;
        }
        zzl.zzi(zza, true, zzbjuVar, zzejyVar.zzj.zza());
        String str = zzfetVar.zzs.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfe)).booleanValue() && zze.zzm().zze(true)) {
            str = zzcgv.zzb(str, zzcgv.zza(zzfetVar));
        }
        zze.zzl();
        return zzgei.zzm(zzdpm.zzj(zza, zzfetVar.zzs.zzb, str, zzejyVar.zzj.zza()), new zzfwh(zzejyVar) { // from class: com.google.android.gms.internal.ads.zzeju
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj2) {
                zzcfk zzcfkVar = zza;
                if (zzfetVar.zzM) {
                    zzcfkVar.zzah();
                }
                zzdos zzdosVar = zze;
                zzcfkVar.zzab();
                zzcfkVar.onPause();
                return zzdosVar.zzi();
            }
        }, zzejyVar.zze);
    }
}
