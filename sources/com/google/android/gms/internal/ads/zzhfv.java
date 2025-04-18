package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhfv implements zzhfx {
    private zzhgg zza;

    public static void zza(zzhgg zzhggVar, zzhgg zzhggVar2) {
        zzhfv zzhfvVar = (zzhfv) zzhggVar;
        if (zzhfvVar.zza == null) {
            zzhfvVar.zza = zzhggVar2;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final Object zzb() {
        zzhgg zzhggVar = this.zza;
        if (zzhggVar != null) {
            return zzhggVar.zzb();
        }
        throw new IllegalStateException();
    }
}
