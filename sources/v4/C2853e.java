package v4;

import q4.C2643b;

/* renamed from: v4.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2853e implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final C2643b f23614c = new C2643b(3);

    /* renamed from: a, reason: collision with root package name */
    public final Object f23615a;
    public Object b;

    public C2853e(z4.c cVar) {
        this.f23615a = cVar;
        this.b = f23614c;
    }

    @Override // v4.j
    public void a(i iVar, int i9) {
        int[] iArr = (int[]) this.b;
        try {
            iVar.read((byte[]) this.f23615a, iArr[0], i9);
            iArr[0] = iArr[0] + i9;
        } finally {
            iVar.close();
        }
    }

    public C2853e(byte[] bArr, int[] iArr) {
        this.f23615a = bArr;
        this.b = iArr;
    }
}
