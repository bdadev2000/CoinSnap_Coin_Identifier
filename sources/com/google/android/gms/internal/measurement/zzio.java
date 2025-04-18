package com.google.android.gms.internal.measurement;

import eb.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzio extends zziv {
    private final int zzc;
    private final int zzd;

    public zzio(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzik.zza(i10, i10 + i11, bArr.length);
        this.zzc = i10;
        this.zzd = i11;
    }

    @Override // com.google.android.gms.internal.measurement.zziv, com.google.android.gms.internal.measurement.zzik
    public final byte zza(int i10) {
        int zzb = zzb();
        if (((zzb - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException(j.i("Index < 0: ", i10));
            }
            throw new ArrayIndexOutOfBoundsException(a4.j.e("Index > length: ", i10, ", ", zzb));
        }
        return this.zzb[this.zzc + i10];
    }

    @Override // com.google.android.gms.internal.measurement.zziv, com.google.android.gms.internal.measurement.zzik
    public final byte zzb(int i10) {
        return this.zzb[this.zzc + i10];
    }

    @Override // com.google.android.gms.internal.measurement.zziv
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zziv, com.google.android.gms.internal.measurement.zzik
    public final int zzb() {
        return this.zzd;
    }
}
