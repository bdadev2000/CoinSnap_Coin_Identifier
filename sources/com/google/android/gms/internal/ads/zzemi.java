package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzemi implements zzehl {
    private final Context zza;
    private final zzdsd zzb;
    private final zzdrm zzc;
    private final zzfho zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbls zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziT)).booleanValue();
    private final zzegk zzi;

    public zzemi(Context context, VersionInfoParcel versionInfoParcel, zzfho zzfhoVar, Executor executor, zzdrm zzdrmVar, zzdsd zzdsdVar, zzbls zzblsVar, zzegk zzegkVar) {
        this.zza = context;
        this.zzd = zzfhoVar;
        this.zzc = zzdrmVar;
        this.zze = executor;
        this.zzf = versionInfoParcel;
        this.zzb = zzdsdVar;
        this.zzg = zzblsVar;
        this.zzi = zzegkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehl
    public final f4.c zza(final zzfhf zzfhfVar, final zzfgt zzfgtVar) {
        final zzdsh zzdshVar = new zzdsh();
        f4.c zzn = zzgft.zzn(zzgft.zzh(null), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzemb
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                return zzemi.this.zzc(zzfgtVar, zzfhfVar, zzdshVar, obj);
            }
        }, this.zze);
        zzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzemc
            @Override // java.lang.Runnable
            public final void run() {
                zzdsh.this.zzb();
            }
        }, this.zze);
        return zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzehl
    public final boolean zzb(zzfhf zzfhfVar, zzfgt zzfgtVar) {
        zzfgy zzfgyVar = zzfgtVar.zzt;
        if (zzfgyVar != null && zzfgyVar.zza != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ f4.c zzc(final zzfgt zzfgtVar, zzfhf zzfhfVar, zzdsh zzdshVar, Object obj) throws Exception {
        zzbls zzblsVar;
        final zzchd zza = this.zzb.zza(this.zzd.zze, zzfgtVar, zzfhfVar.zzb.zzb);
        zza.zzac(zzfgtVar.zzX);
        zzdshVar.zza(this.zza, (View) zza);
        zzccn zzccnVar = new zzccn();
        final zzdri zze = this.zzc.zze(new zzcvf(zzfhfVar, zzfgtVar, null), new zzdrj(new zzemh(this.zza, this.zzb, this.zzd, this.zzf, zzfgtVar, zzccnVar, zza, this.zzg, this.zzh, this.zzi), zza));
        zzccnVar.zzc(zze);
        zzbmh.zzb(zza, zze.zzg());
        zze.zzc().zzo(new zzdaf() { // from class: com.google.android.gms.internal.ads.zzemd
            @Override // com.google.android.gms.internal.ads.zzdaf
            public final void zzr() {
                zzchd zzchdVar = zzchd.this;
                if (zzchdVar.zzN() != null) {
                    zzchdVar.zzN().zzr();
                }
            }
        }, zzcci.zzf);
        zzdsc zzl = zze.zzl();
        if (this.zzh) {
            zzblsVar = this.zzg;
        } else {
            zzblsVar = null;
        }
        zzl.zzi(zza, true, zzblsVar);
        String str = zzfgtVar.zzt.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfc)).booleanValue() && zze.zzm().zze(true)) {
            str = zzcio.zzb(str, zzcio.zza(zzfgtVar));
        }
        zze.zzl();
        return zzgft.zzm(zzdsc.zzj(zza, zzfgtVar.zzt.zzb, str), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzeme
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj2) {
                zzchd zzchdVar = zza;
                if (zzfgtVar.zzN) {
                    zzchdVar.zzah();
                }
                zzdri zzdriVar = zze;
                zzchdVar.zzab();
                zzchdVar.onPause();
                return zzdriVar.zzi();
            }
        }, this.zze);
    }
}
