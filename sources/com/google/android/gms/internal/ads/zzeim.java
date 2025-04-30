package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzeim implements zzehl {
    private final zzctg zza;
    private final Context zzb;
    private final zzdsd zzc;
    private final zzfho zzd;
    private final Executor zze;
    private final zzfxu zzf;

    public zzeim(zzctg zzctgVar, Context context, Executor executor, zzdsd zzdsdVar, zzfho zzfhoVar, zzfxu zzfxuVar) {
        this.zzb = context;
        this.zza = zzctgVar;
        this.zze = executor;
        this.zzc = zzdsdVar;
        this.zzd = zzfhoVar;
        this.zzf = zzfxuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehl
    public final f4.c zza(final zzfhf zzfhfVar, final zzfgt zzfgtVar) {
        return zzgft.zzn(zzgft.zzh(null), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzeil
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                return zzeim.this.zzc(zzfhfVar, zzfgtVar, obj);
            }
        }, this.zze);
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
    public final /* synthetic */ f4.c zzc(zzfhf zzfhfVar, zzfgt zzfgtVar, Object obj) throws Exception {
        View zzdsgVar;
        com.google.android.gms.ads.internal.client.zzq zza = zzfhu.zza(this.zzb, zzfgtVar.zzv);
        final zzchd zza2 = this.zzc.zza(zza, zzfgtVar, zzfhfVar.zzb.zzb);
        zza2.zzac(zzfgtVar.zzX);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhU)).booleanValue() && zzfgtVar.zzah) {
            zzdsgVar = zzcub.zza(this.zzb, (View) zza2, zzfgtVar);
        } else {
            zzdsgVar = new zzdsg(this.zzb, (View) zza2, (com.google.android.gms.ads.internal.util.zzau) this.zzf.apply(zzfgtVar));
        }
        final zzcsg zza3 = this.zza.zza(new zzcvf(zzfhfVar, zzfgtVar, null), new zzcsm(zzdsgVar, zza2, new zzcun() { // from class: com.google.android.gms.internal.ads.zzeig
            @Override // com.google.android.gms.internal.ads.zzcun
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                return zzchd.this.zzq();
            }
        }, zzfhu.zzb(zza)));
        zza3.zzh().zzi(zza2, false, null);
        zzdad zzc = zza3.zzc();
        zzdaf zzdafVar = new zzdaf() { // from class: com.google.android.gms.internal.ads.zzeih
            @Override // com.google.android.gms.internal.ads.zzdaf
            public final void zzr() {
                zzchd zzchdVar = zzchd.this;
                if (zzchdVar.zzN() != null) {
                    zzchdVar.zzN().zzr();
                }
            }
        };
        zzgge zzggeVar = zzcci.zzf;
        zzc.zzo(zzdafVar, zzggeVar);
        String str = zzfgtVar.zzt.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfc)).booleanValue() && zza3.zzi().zze(true)) {
            str = zzcio.zzb(str, zzcio.zza(zzfgtVar));
        }
        zza3.zzh();
        f4.c zzj = zzdsc.zzj(zza2, zzfgtVar.zzt.zzb, str);
        if (zzfgtVar.zzN) {
            zzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeii
                @Override // java.lang.Runnable
                public final void run() {
                    zzchd.this.zzah();
                }
            }, this.zze);
        }
        zzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeij
            @Override // java.lang.Runnable
            public final void run() {
                zzeim.this.zzd(zza2);
            }
        }, this.zze);
        return zzgft.zzm(zzj, new zzfxu() { // from class: com.google.android.gms.internal.ads.zzeik
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj2) {
                return zzcsg.this.zza();
            }
        }, zzggeVar);
    }

    public final /* synthetic */ void zzd(zzchd zzchdVar) {
        zzchdVar.zzab();
        zzcif zzq = zzchdVar.zzq();
        com.google.android.gms.ads.internal.client.zzfk zzfkVar = this.zzd.zza;
        if (zzfkVar != null && zzq != null) {
            zzq.zzs(zzfkVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbj)).booleanValue() && !zzchdVar.isAttachedToWindow()) {
            zzchdVar.onPause();
            zzchdVar.zzav(true);
        }
    }
}
