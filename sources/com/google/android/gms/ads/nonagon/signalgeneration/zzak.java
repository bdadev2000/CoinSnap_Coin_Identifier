package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzbfr;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzcjd;
import com.google.android.gms.internal.ads.zzcjj;
import com.google.android.gms.internal.ads.zzcjv;
import com.google.android.gms.internal.ads.zzdvh;
import com.google.android.gms.internal.ads.zzfhs;
import com.google.android.gms.internal.ads.zzfin;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkx;
import com.google.android.gms.internal.ads.zzhlg;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzak implements zzhkp {
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
    private final zzhlg zzk;
    private final zzhlg zzl;

    public zzak(zzhlg zzhlgVar, zzhlg zzhlgVar2, zzhlg zzhlgVar3, zzhlg zzhlgVar4, zzhlg zzhlgVar5, zzhlg zzhlgVar6, zzhlg zzhlgVar7, zzhlg zzhlgVar8, zzhlg zzhlgVar9, zzhlg zzhlgVar10, zzhlg zzhlgVar11, zzhlg zzhlgVar12) {
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
        this.zzk = zzhlgVar11;
        this.zzl = zzhlgVar12;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcjd zzcjdVar = (zzcjd) this.zza.zzb();
        Context zza = ((zzcjj) this.zzb).zza();
        zzaxd zzaxdVar = (zzaxd) this.zzc.zzb();
        zzfin zzfinVar = (zzfin) this.zzd.zzb();
        zzgge zzggeVar = zzcci.zza;
        zzhkx.zzb(zzggeVar);
        return new zzaj(zzcjdVar, zza, zzaxdVar, zzfinVar, zzggeVar, (ScheduledExecutorService) this.zzf.zzb(), (zzdvh) this.zzg.zzb(), (zzfoe) this.zzh.zzb(), ((zzcjv) this.zzi).zza(), ((zzbfr) this.zzj).zzb(), (zzfhs) this.zzk.zzb(), (zze) this.zzl.zzb());
    }
}
