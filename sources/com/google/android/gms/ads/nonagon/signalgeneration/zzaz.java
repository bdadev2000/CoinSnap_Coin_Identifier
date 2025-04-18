package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzcaj;
import com.google.android.gms.internal.ads.zzcvq;
import com.google.android.gms.internal.ads.zzcvr;
import com.google.android.gms.internal.ads.zzdfa;
import com.google.android.gms.internal.ads.zzfix;
import com.google.android.gms.internal.ads.zzfjl;
import com.google.android.gms.internal.ads.zzfjr;
import com.google.android.gms.internal.ads.zzgei;
import com.google.android.gms.internal.ads.zzhfx;
import com.google.android.gms.internal.ads.zzhgp;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzaz implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;
    private final zzhgp zzd;

    public zzaz(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
        this.zzc = zzhgpVar3;
        this.zzd = zzhgpVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfjr zzfjrVar = (zzfjr) this.zza.zzb();
        zzbb zzb = ((zzbc) this.zzb).zzb();
        zzcvq zzb2 = ((zzcvr) this.zzc).zzb();
        zzdfa zzdfaVar = (zzdfa) this.zzd.zzb();
        zzfix zza = zzfjrVar.zzb(zzfjl.GENERATE_SIGNALS, zzb2.zzc()).zzf(zzb).zzi(((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfx)).intValue(), TimeUnit.SECONDS).zza();
        zzgei.zzr(zza, new zzar(zzdfaVar), zzcaj.zza);
        return zza;
    }
}
