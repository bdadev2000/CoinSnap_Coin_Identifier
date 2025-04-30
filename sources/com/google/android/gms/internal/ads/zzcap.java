package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcap extends zzcav {
    private final Clock zzb;
    private final zzcap zzc = this;
    private final zzhky zzd;
    private final zzhky zze;
    private final zzhky zzf;
    private final zzhky zzg;
    private final zzhky zzh;
    private final zzhky zzi;
    private final zzhky zzj;
    private final zzhky zzk;

    public /* synthetic */ zzcap(Context context, Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzcau zzcauVar, zzcao zzcaoVar) {
        this.zzb = clock;
        zzhkp zza = zzhkq.zza(context);
        this.zzd = zza;
        zzhkp zza2 = zzhkq.zza(zzgVar);
        this.zze = zza2;
        this.zzf = zzhko.zzc(new zzcah(zza, zza2));
        zzhkp zza3 = zzhkq.zza(clock);
        this.zzg = zza3;
        zzhkp zza4 = zzhkq.zza(zzcauVar);
        this.zzh = zza4;
        zzhky zzc = zzhko.zzc(new zzcaj(zza3, zza2, zza4));
        this.zzi = zzc;
        zzcal zzcalVar = new zzcal(zza3, zzc);
        this.zzj = zzcalVar;
        this.zzk = zzhko.zzc(new zzcba(zza, zzcalVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final zzcag zza() {
        return (zzcag) this.zzf.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final zzcak zzb() {
        return new zzcak(this.zzb, (zzcai) this.zzi.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final zzcaz zzc() {
        return (zzcaz) this.zzk.zzb();
    }
}
