package e8;

import kotlin.UByte;
import y7.m;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f17198d = {128, 64, 32, 16, 8, 4, 2, 1};
    public final byte[] a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public int f17199b;

    /* renamed from: c, reason: collision with root package name */
    public int f17200c;

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j3 = bArr[0] & 255;
        if (z10) {
            j3 &= ~f17198d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j3 = (j3 << 8) | (bArr[i11] & 255);
        }
        return j3;
    }

    public final long b(m mVar, boolean z10, boolean z11, int i10) {
        int i11;
        int i12 = this.f17199b;
        byte[] bArr = this.a;
        if (i12 == 0) {
            if (!mVar.readFully(bArr, 0, 1, z10)) {
                return -1L;
            }
            int i13 = bArr[0] & UByte.MAX_VALUE;
            int i14 = 0;
            while (true) {
                if (i14 < 8) {
                    if ((f17198d[i14] & i13) != 0) {
                        i11 = i14 + 1;
                        break;
                    }
                    i14++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            this.f17200c = i11;
            if (i11 != -1) {
                this.f17199b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i15 = this.f17200c;
        if (i15 > i10) {
            this.f17199b = 0;
            return -2L;
        }
        if (i15 != 1) {
            mVar.readFully(bArr, 1, i15 - 1);
        }
        this.f17199b = 0;
        return a(bArr, this.f17200c, z11);
    }
}
