package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzejo implements zzehl {
    private final Context zza;
    private final zzdsd zzb;
    private final zzdjh zzc;
    private final zzfho zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbls zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziT)).booleanValue();
    private final zzegk zzi;

    public zzejo(Context context, VersionInfoParcel versionInfoParcel, zzfho zzfhoVar, Executor executor, zzdjh zzdjhVar, zzdsd zzdsdVar, zzbls zzblsVar, zzegk zzegkVar) {
        this.zza = context;
        this.zzd = zzfhoVar;
        this.zzc = zzdjhVar;
        this.zze = executor;
        this.zzf = versionInfoParcel;
        this.zzb = zzdsdVar;
        this.zzg = zzblsVar;
        this.zzi = zzegkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehl
    public final f4.c zza(final zzfhf zzfhfVar, final zzfgt zzfgtVar) {
        final zzdsh zzdshVar = new zzdsh();
        f4.c zzn = zzgft.zzn(zzgft.zzh(null), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzejl
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                return zzejo.this.zzc(zzfgtVar, zzfhfVar, zzdshVar, obj);
            }
        }, this.zze);
        zzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejm
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
        zzcvf zzcvfVar = new zzcvf(zzfhfVar, zzfgtVar, null);
        zzfho zzfhoVar = this.zzd;
        boolean z8 = this.zzh;
        final zzdih zze = this.zzc.zze(zzcvfVar, new zzdik(new zzejn(this.zza, this.zzf, zzccnVar, zzfgtVar, zza, zzfhoVar, z8, this.zzg, this.zzi), zza));
        zzccnVar.zzc(zze);
        zze.zzc().zzo(new zzdaf() { // from class: com.google.android.gms.internal.ads.zzejj
            @Override // com.google.android.gms.internal.ads.zzdaf
            public final void zzr() {
                zzchd zzchdVar = zzchd.this;
                if (zzchdVar.zzN() != null) {
                    zzchdVar.zzN().zzr();
                }
            }
        }, zzcci.zzf);
        String str = zzfgtVar.zzt.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfc)).booleanValue() && zze.zzl().zze(true)) {
            str = zzcio.zzb(str, zzcio.zza(zzfgtVar));
        }
        zzdsc zzi = zze.zzi();
        if (this.zzh) {
            zzblsVar = this.zzg;
        } else {
            zzblsVar = null;
        }
        zzi.zzi(zza, true, zzblsVar);
        zze.zzi();
        return zzgft.zzm(zzdsc.zzj(zza, zzfgtVar.zzt.zzb, str), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzejk
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj2) {
                zzchd zzchdVar = zza;
                if (zzfgtVar.zzN) {
                    zzchdVar.zzah();
                }
                zzdih zzdihVar = zze;
                zzchdVar.zzab();
                zzchdVar.onPause();
                return zzdihVar.zzg();
            }
        }, this.zze);
    }
}
