package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzazw implements zzhbs {
    UNSUPPORTED(0),
    ARM7(2),
    X86(4),
    ARM64(5),
    X86_64(6),
    RISCV64(7),
    UNKNOWN(999);

    private static final zzhbt zzh = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzazv
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i9) {
            zzazw zzazwVar = zzazw.UNSUPPORTED;
            if (i9 != 0) {
                if (i9 != 2) {
                    if (i9 != 999) {
                        if (i9 != 4) {
                            if (i9 != 5) {
                                if (i9 != 6) {
                                    if (i9 != 7) {
                                        return null;
                                    }
                                    return zzazw.RISCV64;
                                }
                                return zzazw.X86_64;
                            }
                            return zzazw.ARM64;
                        }
                        return zzazw.X86;
                    }
                    return zzazw.UNKNOWN;
                }
                return zzazw.ARM7;
            }
            return zzazw.UNSUPPORTED;
        }
    };
    private final int zzj;

    zzazw(int i9) {
        this.zzj = i9;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final int zza() {
        return this.zzj;
    }
}
