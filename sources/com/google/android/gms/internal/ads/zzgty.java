package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public enum zzgty implements zzgzb {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);

    private final int zzh;

    zzgty(int i10) {
        this.zzh = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgzb
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzh;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
