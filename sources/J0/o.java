package j0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public int f20983a = 1;
    public final r b;

    /* renamed from: c, reason: collision with root package name */
    public r f20984c;

    /* renamed from: d, reason: collision with root package name */
    public r f20985d;

    /* renamed from: e, reason: collision with root package name */
    public int f20986e;

    /* renamed from: f, reason: collision with root package name */
    public int f20987f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f20988g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f20989h;

    public o(r rVar, boolean z8, int[] iArr) {
        this.b = rVar;
        this.f20984c = rVar;
        this.f20988g = z8;
        this.f20989h = iArr;
    }

    public final void a() {
        this.f20983a = 1;
        this.f20984c = this.b;
        this.f20987f = 0;
    }

    public final boolean b() {
        int[] iArr;
        k0.a c9 = this.f20984c.b.c();
        int a6 = c9.a(6);
        if ((a6 != 0 && c9.b.get(a6 + c9.f21396a) != 0) || this.f20986e == 65039) {
            return true;
        }
        if (this.f20988g && ((iArr = this.f20989h) == null || Arrays.binarySearch(iArr, this.f20984c.b.a(0)) < 0)) {
            return true;
        }
        return false;
    }
}
