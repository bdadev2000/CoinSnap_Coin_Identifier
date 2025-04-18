package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzcqp implements zzhfx {
    private final zzhgp zza;

    public zzcqp(zzhgp zzhgpVar) {
        this.zza = zzhgpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Boolean zzb() {
        boolean z10 = true;
        if (((zzcwd) this.zza).zza().zza() == null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfy)).booleanValue()) {
                z10 = false;
            }
        }
        return Boolean.valueOf(z10);
    }
}
