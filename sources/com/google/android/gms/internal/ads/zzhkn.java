package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhkn implements zzhkp {
    private zzhky zza;

    public static void zza(zzhky zzhkyVar, zzhky zzhkyVar2) {
        zzhkn zzhknVar = (zzhkn) zzhkyVar;
        if (zzhknVar.zza == null) {
            zzhknVar.zza = zzhkyVar2;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final Object zzb() {
        zzhky zzhkyVar = this.zza;
        if (zzhkyVar != null) {
            return zzhkyVar.zzb();
        }
        throw new IllegalStateException();
    }
}
