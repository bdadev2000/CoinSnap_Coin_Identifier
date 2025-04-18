package i8;

import java.util.Arrays;
import v8.u0;

/* loaded from: classes3.dex */
public final class w {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19470b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19471c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f19472d;

    /* renamed from: e, reason: collision with root package name */
    public int f19473e;

    public w(int i10) {
        this.a = i10;
        byte[] bArr = new byte[131];
        this.f19472d = bArr;
        bArr[2] = 1;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        if (!this.f19470b) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = this.f19472d;
        int length = bArr2.length;
        int i13 = this.f19473e;
        if (length < i13 + i12) {
            this.f19472d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
        }
        System.arraycopy(bArr, i10, this.f19472d, this.f19473e, i12);
        this.f19473e += i12;
    }

    public final boolean b(int i10) {
        if (!this.f19470b) {
            return false;
        }
        this.f19473e -= i10;
        this.f19470b = false;
        this.f19471c = true;
        return true;
    }

    public final void c() {
        this.f19470b = false;
        this.f19471c = false;
    }

    public final void d(int i10) {
        boolean z10 = true;
        u0.m(!this.f19470b);
        if (i10 != this.a) {
            z10 = false;
        }
        this.f19470b = z10;
        if (z10) {
            this.f19473e = 3;
            this.f19471c = false;
        }
    }
}
