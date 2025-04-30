package com.google.android.gms.internal.play_billing;

import Q7.n0;
import com.mbridge.msdk.foundation.entity.o;

/* loaded from: classes2.dex */
final class zzbj extends zzbn {
    private final int zzc;

    public zzbj(byte[] bArr, int i9, int i10) {
        super(bArr);
        zzbq.zzj(0, i10, bArr.length);
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbn, com.google.android.gms.internal.play_billing.zzbq
    public final byte zza(int i9) {
        int i10 = this.zzc;
        if (((i10 - (i9 + 1)) | i9) < 0) {
            if (i9 < 0) {
                throw new ArrayIndexOutOfBoundsException(o.h(i9, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(n0.e(i9, i10, "Index > length: ", ", "));
        }
        return this.zza[i9];
    }

    @Override // com.google.android.gms.internal.play_billing.zzbn, com.google.android.gms.internal.play_billing.zzbq
    public final byte zzb(int i9) {
        return this.zza[i9];
    }

    @Override // com.google.android.gms.internal.play_billing.zzbn
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbn, com.google.android.gms.internal.play_billing.zzbq
    public final int zzd() {
        return this.zzc;
    }
}
