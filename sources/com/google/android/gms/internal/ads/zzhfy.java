package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhfy implements zzhfx, zzhfr {
    private static final zzhfy zza = new zzhfy(null);
    private final Object zzb;

    private zzhfy(Object obj) {
        this.zzb = obj;
    }

    public static zzhfx zza(Object obj) {
        zzhgf.zza(obj, "instance cannot be null");
        return new zzhfy(obj);
    }

    public static zzhfx zzc(Object obj) {
        return obj == null ? zza : new zzhfy(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final Object zzb() {
        return this.zzb;
    }
}
