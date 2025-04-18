package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes3.dex */
public final class zzcyd implements zzhfx {
    private final zzhgp zza;

    public zzcyd(zzhgp zzhgpVar) {
        this.zza = zzhgpVar;
    }

    public static zzcyc zzc(Set set) {
        return new zzcyc(set);
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcyc zzb() {
        return new zzcyc(((zzhgl) this.zza).zzb());
    }
}
