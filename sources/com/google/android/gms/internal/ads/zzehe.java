package com.google.android.gms.internal.ads;

import android.content.Context;
import com.applovin.impl.mediation.ads.e;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzehe implements zzefb {
    private final Context zza;
    private final zzdpn zzb;
    private final zzdgn zzc;
    private final zzffo zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbju zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziy)).booleanValue();
    private final zzeea zzi;
    private final zzdsh zzj;

    public zzehe(Context context, VersionInfoParcel versionInfoParcel, zzffo zzffoVar, Executor executor, zzdgn zzdgnVar, zzdpn zzdpnVar, zzbju zzbjuVar, zzeea zzeeaVar, zzdsh zzdshVar) {
        this.zza = context;
        this.zzd = zzffoVar;
        this.zzc = zzdgnVar;
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
        ua.b zzn = zzgei.zzn(zzgei.zzh(null), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzehb
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzehe.this.zzc(zzfetVar, zzfffVar, zzdprVar, obj);
            }
        }, this.zze);
        zzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehc
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
        final zzehe zzeheVar;
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
        final zzdfk zze = this.zzc.zze(new zzcsg(zzfffVar, zzfetVar, null), new zzdfn(new zzehd(this.zza, this.zzf, zzcaoVar, zzfetVar, zza, this.zzd, this.zzh, this.zzg, this.zzi), zza));
        zzcaoVar.zzc(zze);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).booleanValue()) {
            zzeheVar = this;
            e.m(zzeheVar.zzj.zza(), zzdrv.RENDERING_AD_COMPONENT_CREATION_END.zza());
        } else {
            zzeheVar = this;
        }
        zze.zzc().zzo(new zzcxg() { // from class: com.google.android.gms.internal.ads.zzegz
            @Override // com.google.android.gms.internal.ads.zzcxg
            public final void zzr() {
                zzcfk zzcfkVar = zzcfk.this;
                if (zzcfkVar.zzN() != null) {
                    zzcfkVar.zzN().zzr();
                }
            }
        }, zzcaj.zzf);
        String str = zzfetVar.zzs.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfe)).booleanValue() && zze.zzl().zze(true)) {
            str = zzcgv.zzb(str, zzcgv.zza(zzfetVar));
        }
        zzdpm zzi = zze.zzi();
        if (zzeheVar.zzh) {
            zzbjuVar = zzeheVar.zzg;
        } else {
            zzbjuVar = null;
        }
        zzi.zzi(zza, true, zzbjuVar, zzeheVar.zzj.zza());
        zze.zzi();
        return zzgei.zzm(zzdpm.zzj(zza, zzfetVar.zzs.zzb, str, zzeheVar.zzj.zza()), new zzfwh(zzeheVar) { // from class: com.google.android.gms.internal.ads.zzeha
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj2) {
                zzcfk zzcfkVar = zza;
                if (zzfetVar.zzM) {
                    zzcfkVar.zzah();
                }
                zzdfk zzdfkVar = zze;
                zzcfkVar.zzab();
                zzcfkVar.onPause();
                return zzdfkVar.zzg();
            }
        }, zzeheVar.zze);
    }
}
