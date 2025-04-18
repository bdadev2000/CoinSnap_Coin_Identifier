package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbyu extends zzbza {
    private final Clock zzb;
    private final zzhir zzc;
    private final zzhir zzd;
    private final zzhir zze;
    private final zzhir zzf;
    private final zzhir zzg;
    private final zzhir zzh;
    private final zzhir zzi;
    private final zzhir zzj;

    public /* synthetic */ zzbyu(Context context, Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzbyz zzbyzVar, zzbyt zzbytVar) {
        this.zzb = clock;
        zzhii zza = zzhij.zza(context);
        this.zzc = zza;
        zzhii zza2 = zzhij.zza(zzgVar);
        this.zzd = zza2;
        this.zze = zzhih.zzc(new zzbym(zza, zza2));
        zzhii zza3 = zzhij.zza(clock);
        this.zzf = zza3;
        zzhii zza4 = zzhij.zza(zzbyzVar);
        this.zzg = zza4;
        zzhir zzc = zzhih.zzc(new zzbyo(zza3, zza2, zza4));
        this.zzh = zzc;
        zzbyq zzbyqVar = new zzbyq(zza3, zzc);
        this.zzi = zzbyqVar;
        this.zzj = zzhih.zzc(new zzbzf(zza, zzbyqVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final zzbyl zza() {
        return (zzbyl) this.zze.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final zzbyp zzb() {
        return new zzbyp(this.zzb, (zzbyn) this.zzh.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final zzbze zzc() {
        return (zzbze) this.zzj.zzb();
    }
}
