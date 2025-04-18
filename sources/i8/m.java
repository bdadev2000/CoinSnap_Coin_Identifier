package i8;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f19346f = {0, 0, 1};
    public boolean a;

    /* renamed from: b, reason: collision with root package name */
    public int f19347b;

    /* renamed from: c, reason: collision with root package name */
    public int f19348c;

    /* renamed from: d, reason: collision with root package name */
    public int f19349d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f19350e = new byte[128];

    public final void a(byte[] bArr, int i10, int i11) {
        if (!this.a) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = this.f19350e;
        int length = bArr2.length;
        int i13 = this.f19348c;
        if (length < i13 + i12) {
            this.f19350e = Arrays.copyOf(bArr2, (i13 + i12) * 2);
        }
        System.arraycopy(bArr, i10, this.f19350e, this.f19348c, i12);
        this.f19348c += i12;
    }
}
