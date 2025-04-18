package com.google.android.gms.internal.ads;

import com.mbridge.msdk.MBridgeConstans;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzero implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;

    public zzero(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
        this.zzc = zzhgpVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzevz zzb = ((zzens) this.zza).zzb();
        zzevz zzevzVar = (zzeqp) this.zzb.zzb();
        if (true == ((List) this.zzc.zzb()).contains(MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
            zzb = zzevzVar;
        }
        zzhgf.zzb(zzb);
        return zzb;
    }
}
