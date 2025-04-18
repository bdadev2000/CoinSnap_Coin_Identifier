package i8;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f19326e = {0, 0, 1};
    public boolean a;

    /* renamed from: b, reason: collision with root package name */
    public int f19327b;

    /* renamed from: c, reason: collision with root package name */
    public int f19328c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f19329d = new byte[128];

    public final void a(byte[] bArr, int i10, int i11) {
        if (!this.a) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = this.f19329d;
        int length = bArr2.length;
        int i13 = this.f19327b;
        if (length < i13 + i12) {
            this.f19329d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
        }
        System.arraycopy(bArr, i10, this.f19329d, this.f19327b, i12);
        this.f19327b += i12;
    }
}
