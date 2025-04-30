package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzgvt implements zzhbs {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);

    private static final zzhbt zzh = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzgvs
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i9) {
            return zzgvt.zzb(i9);
        }
    };
    private final int zzj;

    zzgvt(int i9) {
        this.zzj = i9;
    }

    public static zzgvt zzb(int i9) {
        if (i9 == 0) {
            return UNKNOWN_HASH;
        }
        if (i9 == 1) {
            return SHA1;
        }
        if (i9 == 2) {
            return SHA384;
        }
        if (i9 == 3) {
            return SHA256;
        }
        if (i9 == 4) {
            return SHA512;
        }
        if (i9 != 5) {
            return null;
        }
        return SHA224;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzj;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
