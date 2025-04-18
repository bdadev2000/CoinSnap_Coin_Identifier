package com.google.android.gms.internal.ads;

import android.content.Context;
import com.applovin.impl.adview.t;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzegv implements zzegk {
    private final zzcqf zza;
    private final Context zzb;
    private final zzdre zzc;
    private final zzfhc zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbjz zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zziw)).booleanValue();
    private final zzefj zzi;
    private final zzdty zzj;

    public zzegv(zzcqf zzcqfVar, Context context, Executor executor, zzdre zzdreVar, zzfhc zzfhcVar, VersionInfoParcel versionInfoParcel, zzbjz zzbjzVar, zzefj zzefjVar, zzdty zzdtyVar) {
        this.zzb = context;
        this.zza = zzcqfVar;
        this.zze = executor;
        this.zzc = zzdreVar;
        this.zzd = zzfhcVar;
        this.zzf = versionInfoParcel;
        this.zzg = zzbjzVar;
        this.zzi = zzefjVar;
        this.zzj = zzdtyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final ListenableFuture zza(final zzfgt zzfgtVar, final zzfgh zzfghVar) {
        final zzdri zzdriVar = new zzdri();
        ListenableFuture zzn = zzgfo.zzn(zzgfo.zzh(null), new zzgev() { // from class: com.google.android.gms.internal.ads.zzegr
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                return zzegv.this.zzc(zzfghVar, zzfgtVar, zzdriVar, obj);
            }
        }, this.zze);
        zzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegs
            @Override // java.lang.Runnable
            public final void run() {
                zzdri.this.zzb();
            }
        }, this.zze);
        return zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final boolean zzb(zzfgt zzfgtVar, zzfgh zzfghVar) {
        zzfgm zzfgmVar = zzfghVar.zzs;
        return (zzfgmVar == null || zzfgmVar.zza == null) ? false : true;
    }

    public final /* synthetic */ ListenableFuture zzc(final zzfgh zzfghVar, zzfgt zzfgtVar, zzdri zzdriVar, Object obj) throws Exception {
        final zzegv zzegvVar;
        zzbcm zzbcmVar = zzbcv.zzch;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcmVar)).booleanValue()) {
            t.t(this.zzj.zza(), zzdtm.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        final zzcfo zza = this.zzc.zza(this.zzd.zze, zzfghVar, zzfgtVar.zzb.zzb);
        zza.zzac(zzfghVar.zzW);
        zzdriVar.zza(this.zzb, zza.zzF());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcmVar)).booleanValue()) {
            t.t(this.zzj.zza(), zzdtm.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        zzcas zzcasVar = new zzcas();
        final zzcqc zza2 = this.zza.zza(new zzctu(zzfgtVar, zzfghVar, null), new zzdhc(new zzegx(this.zzf, zzcasVar, zzfghVar, zza, this.zzd, this.zzh, this.zzg, this.zzi), zza), new zzcqd(zzfghVar.zzaa));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcmVar)).booleanValue()) {
            zzegvVar = this;
            t.t(zzegvVar.zzj.zza(), zzdtm.RENDERING_AD_COMPONENT_CREATION_END.zza());
        } else {
            zzegvVar = this;
        }
        zza2.zzh().zzi(zza, false, zzegvVar.zzh ? zzegvVar.zzg : null, zzegvVar.zzj.zza());
        zzcasVar.zzc(zza2);
        zza2.zzc().zzo(new zzcyu() { // from class: com.google.android.gms.internal.ads.zzegt
            @Override // com.google.android.gms.internal.ads.zzcyu
            public final void zzr() {
                zzcfo zzcfoVar = zzcfo.this;
                if (zzcfoVar.zzN() != null) {
                    zzcfoVar.zzN().zzr();
                }
            }
        }, zzcan.zzf);
        String str = zzfghVar.zzs.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzeX)).booleanValue() && zza2.zzi().zze(true)) {
            str = zzcgz.zzb(str, zzcgz.zza(zzfghVar));
        }
        zza2.zzh();
        return zzgfo.zzm(zzdrd.zzj(zza, zzfghVar.zzs.zzb, str, zzegvVar.zzj.zza()), new zzfxq(zzegvVar) { // from class: com.google.android.gms.internal.ads.zzegu
            @Override // com.google.android.gms.internal.ads.zzfxq
            public final Object apply(Object obj2) {
                zzcfo zzcfoVar = zza;
                if (zzfghVar.zzM) {
                    zzcfoVar.zzah();
                }
                zzcqc zzcqcVar = zza2;
                zzcfoVar.zzab();
                zzcfoVar.onPause();
                return zzcqcVar.zza();
            }
        }, zzegvVar.zze);
    }
}
