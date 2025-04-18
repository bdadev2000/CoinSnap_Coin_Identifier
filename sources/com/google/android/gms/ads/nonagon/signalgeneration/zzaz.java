package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzcan;
import com.google.android.gms.internal.ads.zzcxe;
import com.google.android.gms.internal.ads.zzcxf;
import com.google.android.gms.internal.ads.zzdgp;
import com.google.android.gms.internal.ads.zzfkl;
import com.google.android.gms.internal.ads.zzfla;
import com.google.android.gms.internal.ads.zzflg;
import com.google.android.gms.internal.ads.zzgfo;
import com.google.android.gms.internal.ads.zzhii;
import com.google.android.gms.internal.ads.zzhja;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class zzaz implements zzhii {
    private final zzhja zza;
    private final zzhja zzb;
    private final zzhja zzc;
    private final zzhja zzd;

    public zzaz(zzhja zzhjaVar, zzhja zzhjaVar2, zzhja zzhjaVar3, zzhja zzhjaVar4) {
        this.zza = zzhjaVar;
        this.zzb = zzhjaVar2;
        this.zzc = zzhjaVar3;
        this.zzd = zzhjaVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzflg zzflgVar = (zzflg) this.zza.zzb();
        zzbb zzb = ((zzbc) this.zzb).zzb();
        zzcxe zzb2 = ((zzcxf) this.zzc).zzb();
        zzdgp zzdgpVar = (zzdgp) this.zzd.zzb();
        zzfkl zza = zzflgVar.zzb(zzfla.GENERATE_SIGNALS, zzb2.zzc()).zzf(zzb).zzi(((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzfq)).intValue(), TimeUnit.SECONDS).zza();
        zzgfo.zzr(zza, new zzar(zzdgpVar), zzcan.zza);
        return zza;
    }
}
