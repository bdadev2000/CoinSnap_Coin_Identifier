package com.google.android.gms.internal.ads;

/* loaded from: classes4.dex */
public final class zzhij implements zzhii, zzhic {
    private static final zzhij zza = new zzhij(null);
    private final Object zzb;

    private zzhij(Object obj) {
        this.zzb = obj;
    }

    public static zzhii zza(Object obj) {
        zzhiq.zza(obj, "instance cannot be null");
        return new zzhij(obj);
    }

    public static zzhii zzc(Object obj) {
        return obj == null ? zza : new zzhij(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final Object zzb() {
        return this.zzb;
    }
}
