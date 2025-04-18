package com.google.android.gms.internal.ads;

import android.content.Context;
import com.applovin.impl.adview.t;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzelh implements zzegk {
    private final Context zza;
    private final zzdre zzb;
    private final zzdqn zzc;
    private final zzfhc zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbjz zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zziw)).booleanValue();
    private final zzefj zzi;
    private final zzdty zzj;

    public zzelh(Context context, VersionInfoParcel versionInfoParcel, zzfhc zzfhcVar, Executor executor, zzdqn zzdqnVar, zzdre zzdreVar, zzbjz zzbjzVar, zzefj zzefjVar, zzdty zzdtyVar) {
        this.zza = context;
        this.zzd = zzfhcVar;
        this.zzc = zzdqnVar;
        this.zze = executor;
        this.zzf = versionInfoParcel;
        this.zzb = zzdreVar;
        this.zzg = zzbjzVar;
        this.zzi = zzefjVar;
        this.zzj = zzdtyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final ListenableFuture zza(final zzfgt zzfgtVar, final zzfgh zzfghVar) {
        final zzdri zzdriVar = new zzdri();
        ListenableFuture zzn = zzgfo.zzn(zzgfo.zzh(null), new zzgev() { // from class: com.google.android.gms.internal.ads.zzela
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                return zzelh.this.zzc(zzfghVar, zzfgtVar, zzdriVar, obj);
            }
        }, this.zze);
        zzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzelb
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
        final zzelh zzelhVar;
        zzbcm zzbcmVar = zzbcv.zzch;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcmVar)).booleanValue()) {
            t.t(this.zzj.zza(), zzdtm.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        final zzcfo zza = this.zzb.zza(this.zzd.zze, zzfghVar, zzfgtVar.zzb.zzb);
        zza.zzac(zzfghVar.zzW);
        zzdriVar.zza(this.zza, zza.zzF());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcmVar)).booleanValue()) {
            t.t(this.zzj.zza(), zzdtm.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        zzcas zzcasVar = new zzcas();
        final zzdqj zze = this.zzc.zze(new zzctu(zzfgtVar, zzfghVar, null), new zzdqk(new zzelg(this.zza, this.zzb, this.zzd, this.zzf, zzfghVar, zzcasVar, zza, this.zzg, this.zzh, this.zzi, this.zzj), zza));
        zzcasVar.zzc(zze);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcmVar)).booleanValue()) {
            zzelhVar = this;
            t.t(zzelhVar.zzj.zza(), zzdtm.RENDERING_AD_COMPONENT_CREATION_END.zza());
        } else {
            zzelhVar = this;
        }
        zzbko.zzb(zza, zze.zzg());
        zze.zzc().zzo(new zzcyu() { // from class: com.google.android.gms.internal.ads.zzelc
            @Override // com.google.android.gms.internal.ads.zzcyu
            public final void zzr() {
                zzcfo zzcfoVar = zzcfo.this;
                if (zzcfoVar.zzN() != null) {
                    zzcfoVar.zzN().zzr();
                }
            }
        }, zzcan.zzf);
        zze.zzl().zzi(zza, true, zzelhVar.zzh ? zzelhVar.zzg : null, zzelhVar.zzj.zza());
        String str = zzfghVar.zzs.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzeX)).booleanValue() && zze.zzm().zze(true)) {
            str = zzcgz.zzb(str, zzcgz.zza(zzfghVar));
        }
        zze.zzl();
        return zzgfo.zzm(zzdrd.zzj(zza, zzfghVar.zzs.zzb, str, zzelhVar.zzj.zza()), new zzfxq(zzelhVar) { // from class: com.google.android.gms.internal.ads.zzeld
            @Override // com.google.android.gms.internal.ads.zzfxq
            public final Object apply(Object obj2) {
                zzcfo zzcfoVar = zza;
                if (zzfghVar.zzM) {
                    zzcfoVar.zzah();
                }
                zzdqj zzdqjVar = zze;
                zzcfoVar.zzab();
                zzcfoVar.onPause();
                return zzdqjVar.zzi();
            }
        }, zzelhVar.zze);
    }
}
