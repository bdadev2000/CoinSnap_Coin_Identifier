package com.google.android.gms.internal.play_billing;

import android.support.v4.media.d;

/* loaded from: classes3.dex */
final class zzdq extends zzdt {
    private final int zzc;

    public zzdq(byte[] bArr, int i2, int i3) {
        super(bArr);
        zzdw.zzj(0, i3, bArr.length);
        this.zzc = i3;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdt, com.google.android.gms.internal.play_billing.zzdw
    public final byte zza(int i2) {
        int i3 = this.zzc;
        if (((i3 - (i2 + 1)) | i2) >= 0) {
            return this.zza[i2];
        }
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(d.i("Index < 0: ", i2));
        }
        throw new ArrayIndexOutOfBoundsException(d.k("Index > length: ", i2, ", ", i3));
    }

    @Override // com.google.android.gms.internal.play_billing.zzdt, com.google.android.gms.internal.play_billing.zzdw
    public final byte zzb(int i2) {
        return this.zza[i2];
    }

    @Override // com.google.android.gms.internal.play_billing.zzdt
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdt, com.google.android.gms.internal.play_billing.zzdw
    public final int zzd() {
        return this.zzc;
    }
}
