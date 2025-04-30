package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcsj implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;
    private final zzhlg zze;
    private final zzhlg zzf;
    private final zzhlg zzg;
    private final zzhlg zzh;
    private final zzhlg zzi;
    private final zzhlg zzj;

    public zzcsj(zzhlg zzhlgVar, zzhlg zzhlgVar2, zzhlg zzhlgVar3, zzhlg zzhlgVar4, zzhlg zzhlgVar5, zzhlg zzhlgVar6, zzhlg zzhlgVar7, zzhlg zzhlgVar8, zzhlg zzhlgVar9, zzhlg zzhlgVar10) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
        this.zzc = zzhlgVar3;
        this.zzd = zzhlgVar4;
        this.zze = zzhlgVar5;
        this.zzf = zzhlgVar6;
        this.zzg = zzhlgVar7;
        this.zzh = zzhlgVar8;
        this.zzi = zzhlgVar9;
        this.zzj = zzhlgVar10;
    }

    public static zzcsi zzc(zzcuo zzcuoVar, Context context, zzfgu zzfguVar, View view, zzchd zzchdVar, zzcun zzcunVar, zzdme zzdmeVar, zzdhk zzdhkVar, zzhkj zzhkjVar, Executor executor) {
        return new zzcsi(zzcuoVar, context, zzfguVar, view, zzchdVar, zzcunVar, zzdmeVar, zzdhkVar, zzhkjVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcsi zzb() {
        return new zzcsi(((zzcwz) this.zza).zzb(), (Context) this.zzb.zzb(), ((zzcsp) this.zzc).zza(), ((zzcso) this.zzd).zza(), ((zzctb) this.zze).zza(), ((zzcsq) this.zzf).zza(), ((zzdkb) this.zzg).zza(), (zzdhk) this.zzh.zzb(), zzhko.zza(zzhla.zza(this.zzi)), (Executor) this.zzj.zzb());
    }
}
