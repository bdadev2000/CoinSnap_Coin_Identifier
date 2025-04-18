package com.google.android.gms.internal.ads;

/* loaded from: classes4.dex */
public final class zzhig implements zzhii {
    private zzhir zza;

    public static void zza(zzhir zzhirVar, zzhir zzhirVar2) {
        zzhig zzhigVar = (zzhig) zzhirVar;
        if (zzhigVar.zza != null) {
            throw new IllegalStateException();
        }
        zzhigVar.zza = zzhirVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final Object zzb() {
        zzhir zzhirVar = this.zza;
        if (zzhirVar != null) {
            return zzhirVar.zzb();
        }
        throw new IllegalStateException();
    }
}
