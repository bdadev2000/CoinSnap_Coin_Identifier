package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final /* synthetic */ class zzgmy {
    static final /* synthetic */ int[] zza;
    static final /* synthetic */ int[] zzb;

    static {
        int[] iArr = new int[zzgty.values().length];
        zzb = iArr;
        try {
            iArr[zzgty.SYMMETRIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            zzb[zzgty.ASYMMETRIC_PRIVATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[zzgve.values().length];
        zza = iArr2;
        try {
            iArr2[zzgve.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            zza[zzgve.LEGACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            zza[zzgve.RAW.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            zza[zzgve.CRUNCHY.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
