package com.applovin.impl;

import com.android.volley.DefaultRetryPolicy;
import com.applovin.impl.f9;
import com.applovin.impl.gl;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;
import okio.Utf8;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class tg extends gl {

    /* renamed from: o, reason: collision with root package name */
    private static final byte[] f27163o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: n, reason: collision with root package name */
    private boolean f27164n;

    private long a(byte[] bArr) {
        int i2;
        byte b2 = bArr[0];
        int i3 = b2 & UnsignedBytes.MAX_VALUE;
        int i4 = b2 & 3;
        if (i4 != 0) {
            i2 = 2;
            if (i4 != 1 && i4 != 2) {
                i2 = bArr[1] & Utf8.REPLACEMENT_BYTE;
            }
        } else {
            i2 = 1;
        }
        int i5 = i3 >> 3;
        return i2 * (i5 >= 16 ? DefaultRetryPolicy.DEFAULT_TIMEOUT_MS << r0 : i5 >= 12 ? 10000 << (i5 & 1) : (i5 & 3) == 3 ? 60000 : 10000 << r0);
    }

    public static boolean b(bh bhVar) {
        int a2 = bhVar.a();
        byte[] bArr = f27163o;
        if (a2 < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        bhVar.a(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.applovin.impl.gl
    public long a(bh bhVar) {
        return b(a(bhVar.c()));
    }

    @Override // com.applovin.impl.gl
    public boolean a(bh bhVar, long j2, gl.b bVar) {
        if (!this.f27164n) {
            byte[] copyOf = Arrays.copyOf(bhVar.c(), bhVar.e());
            bVar.f24135a = new f9.b().f("audio/opus").c(ug.b(copyOf)).n(48000).a(ug.a(copyOf)).a();
            this.f27164n = true;
            return true;
        }
        b1.a(bVar.f24135a);
        boolean z2 = bhVar.j() == 1332770163;
        bhVar.f(0);
        return z2;
    }

    @Override // com.applovin.impl.gl
    public void a(boolean z2) {
        super.a(z2);
        if (z2) {
            this.f27164n = false;
        }
    }
}
