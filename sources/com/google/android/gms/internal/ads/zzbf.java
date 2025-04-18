package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzbf {
    public final int zza;

    public zzbf(int i10, int i11) {
        this.zza = i11;
    }

    public final int zza() {
        int i10 = this.zza;
        if (i10 == 2) {
            return 10;
        }
        if (i10 == 5) {
            return 11;
        }
        if (i10 == 29) {
            return 12;
        }
        if (i10 == 42) {
            return 16;
        }
        if (i10 != 22) {
            return i10 != 23 ? 0 : 15;
        }
        return 1073741824;
    }
}
