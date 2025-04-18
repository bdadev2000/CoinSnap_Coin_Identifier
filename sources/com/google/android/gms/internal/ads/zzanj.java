package com.google.android.gms.internal.ads;

import kotlin.UByte;

/* loaded from: classes3.dex */
final class zzanj extends zzacc {
    public zzanj(zzek zzekVar, long j3, long j10) {
        super(new zzabx(), new zzanh(zzekVar, null), j3, 0L, j3 + 1, 0L, j10, 188L, 1000);
    }

    public static /* bridge */ /* synthetic */ int zzh(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & UByte.MAX_VALUE) | ((bArr[i10] & UByte.MAX_VALUE) << 24) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 8);
    }
}
