package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzdox implements zzhkp {
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
    private final zzhlg zzm;
    private final zzhlg zzn;
    private final zzhlg zzo;
    private final zzhlg zzp;
    private final zzhlg zzq;

    public zzdox(zzhlg zzhlgVar, zzhlg zzhlgVar2, zzhlg zzhlgVar3, zzhlg zzhlgVar4, zzhlg zzhlgVar5, zzhlg zzhlgVar6, zzhlg zzhlgVar7, zzhlg zzhlgVar8, zzhlg zzhlgVar9, zzhlg zzhlgVar10, zzhlg zzhlgVar11, zzhlg zzhlgVar12, zzhlg zzhlgVar13, zzhlg zzhlgVar14, zzhlg zzhlgVar15, zzhlg zzhlgVar16, zzhlg zzhlgVar17) {
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
        this.zzm = zzhlgVar13;
        this.zzn = zzhlgVar14;
        this.zzo = zzhlgVar15;
        this.zzp = zzhlgVar16;
        this.zzq = zzhlgVar17;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdow zzb() {
        Context context = (Context) this.zza.zzb();
        zzdof zzdofVar = (zzdof) this.zzb.zzb();
        zzaxd zzaxdVar = (zzaxd) this.zzc.zzb();
        VersionInfoParcel zza = ((zzcjv) this.zzd).zza();
        zzhlg zzhlgVar = this.zzf;
        com.google.android.gms.ads.internal.zza zza2 = com.google.android.gms.ads.internal.zza.zza();
        zzbdm zzbdmVar = (zzbdm) zzhlgVar.zzb();
        zzgge zzggeVar = zzcci.zza;
        zzhkx.zzb(zzggeVar);
        return new zzdow(context, zzdofVar, zzaxdVar, zza, zza2, zzbdmVar, zzggeVar, ((zzczc) this.zzh).zza(), (zzdpo) this.zzi.zzb(), (zzdsd) this.zzj.zzb(), (ScheduledExecutorService) this.zzk.zzb(), (zzdvc) this.zzl.zzb(), (zzfoe) this.zzm.zzb(), (zzefz) this.zzn.zzb(), (zzdqy) this.zzo.zzb(), (zzegk) this.zzp.zzb(), (zzfhs) this.zzq.zzb());
    }
}
