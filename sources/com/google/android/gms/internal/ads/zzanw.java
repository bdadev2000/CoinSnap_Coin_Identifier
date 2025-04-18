package com.google.android.gms.internal.ads;

import com.google.common.primitives.UnsignedBytes;

/* loaded from: classes2.dex */
final class zzanw extends zzacm {
    public zzanw(zzer zzerVar, long j2, long j3) {
        super(new zzach(), new zzanv(zzerVar, null), j2, 0L, j2 + 1, 0L, j3, 188L, 1000);
    }

    public static /* bridge */ /* synthetic */ int zzh(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & UnsignedBytes.MAX_VALUE) | ((bArr[i2] & UnsignedBytes.MAX_VALUE) << 24) | ((bArr[i2 + 1] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[i2 + 2] & UnsignedBytes.MAX_VALUE) << 8);
    }
}
