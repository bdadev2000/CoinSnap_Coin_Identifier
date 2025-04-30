package com.google.android.gms.internal.measurement;

import Q7.n0;
import com.mbridge.msdk.foundation.entity.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzie extends zzij {
    private final int zzc;
    private final int zzd;

    public zzie(byte[] bArr, int i9, int i10) {
        super(bArr);
        zzia.zza(i9, i9 + i10, bArr.length);
        this.zzc = i9;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.measurement.zzij, com.google.android.gms.internal.measurement.zzia
    public final byte zza(int i9) {
        int zzb = zzb();
        if (((zzb - (i9 + 1)) | i9) < 0) {
            if (i9 < 0) {
                throw new ArrayIndexOutOfBoundsException(o.h(i9, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(n0.e(i9, zzb, "Index > length: ", ", "));
        }
        return this.zzb[this.zzc + i9];
    }

    @Override // com.google.android.gms.internal.measurement.zzij, com.google.android.gms.internal.measurement.zzia
    public final byte zzb(int i9) {
        return this.zzb[this.zzc + i9];
    }

    @Override // com.google.android.gms.internal.measurement.zzij
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzij, com.google.android.gms.internal.measurement.zzia
    public final int zzb() {
        return this.zzd;
    }
}
