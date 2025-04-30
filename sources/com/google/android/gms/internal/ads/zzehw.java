package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzehw implements zzehl {
    private final zzcrt zza;
    private final Context zzb;
    private final zzdsd zzc;
    private final zzfho zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbls zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziT)).booleanValue();
    private final zzegk zzi;

    public zzehw(zzcrt zzcrtVar, Context context, Executor executor, zzdsd zzdsdVar, zzfho zzfhoVar, VersionInfoParcel versionInfoParcel, zzbls zzblsVar, zzegk zzegkVar) {
        this.zzb = context;
        this.zza = zzcrtVar;
        this.zze = executor;
        this.zzc = zzdsdVar;
        this.zzd = zzfhoVar;
        this.zzf = versionInfoParcel;
        this.zzg = zzblsVar;
        this.zzi = zzegkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehl
    public final f4.c zza(final zzfhf zzfhfVar, final zzfgt zzfgtVar) {
        final zzdsh zzdshVar = new zzdsh();
        f4.c zzn = zzgft.zzn(zzgft.zzh(null), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzehs
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                return zzehw.this.zzc(zzfgtVar, zzfhfVar, zzdshVar, obj);
            }
        }, this.zze);
        zzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeht
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
        final zzchd zza = this.zzc.zza(this.zzd.zze, zzfgtVar, zzfhfVar.zzb.zzb);
        zza.zzac(zzfgtVar.zzX);
        zzdshVar.zza(this.zzb, (View) zza);
        zzccn zzccnVar = new zzccn();
        final zzcrq zza2 = this.zza.zza(new zzcvf(zzfhfVar, zzfgtVar, null), new zzdik(new zzehy(this.zzf, zzccnVar, zzfgtVar, zza, this.zzd, this.zzh, this.zzg, this.zzi), zza), new zzcrr(zzfgtVar.zzab));
        zzdsc zzh = zza2.zzh();
        if (this.zzh) {
            zzblsVar = this.zzg;
        } else {
            zzblsVar = null;
        }
        zzh.zzi(zza, false, zzblsVar);
        zzccnVar.zzc(zza2);
        zza2.zzc().zzo(new zzdaf() { // from class: com.google.android.gms.internal.ads.zzehu
            @Override // com.google.android.gms.internal.ads.zzdaf
            public final void zzr() {
                zzchd zzchdVar = zzchd.this;
                if (zzchdVar.zzN() != null) {
                    zzchdVar.zzN().zzr();
                }
            }
        }, zzcci.zzf);
        String str = zzfgtVar.zzt.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfc)).booleanValue() && zza2.zzi().zze(true)) {
            str = zzcio.zzb(str, zzcio.zza(zzfgtVar));
        }
        zza2.zzh();
        return zzgft.zzm(zzdsc.zzj(zza, zzfgtVar.zzt.zzb, str), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzehv
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj2) {
                zzchd zzchdVar = zza;
                if (zzfgtVar.zzN) {
                    zzchdVar.zzah();
                }
                zzcrq zzcrqVar = zza2;
                zzchdVar.zzab();
                zzchdVar.onPause();
                return zzcrqVar.zza();
            }
        }, this.zze);
    }
}
