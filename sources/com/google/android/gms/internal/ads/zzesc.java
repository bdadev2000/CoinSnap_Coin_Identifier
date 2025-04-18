package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zzesc implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;

    public zzesc(zzhgp zzhgpVar, zzhgp zzhgpVar2) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfzt zzn;
        zzesz zzb = ((zzetb) this.zza).zzb();
        Context zza = ((zzchq) this.zzb).zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkZ)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzq();
            if (com.google.android.gms.ads.internal.util.zzs.zzB(zza)) {
                zzn = zzfzt.zzo(zzb);
                zzhgf.zzb(zzn);
                return zzn;
            }
        }
        zzn = zzfzt.zzn();
        zzhgf.zzb(zzn);
        return zzn;
    }
}
