package androidx.lifecycle;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final D f4815a;
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public int f4816c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B f4817d;

    public A(B b, D d2) {
        this.f4817d = b;
        this.f4815a = d2;
    }

    public final void a(boolean z8) {
        int i9;
        if (z8 == this.b) {
            return;
        }
        this.b = z8;
        if (z8) {
            i9 = 1;
        } else {
            i9 = -1;
        }
        B b = this.f4817d;
        int i10 = b.f4820c;
        b.f4820c = i9 + i10;
        if (!b.f4821d) {
            b.f4821d = true;
            while (true) {
                try {
                    int i11 = b.f4820c;
                    if (i10 == i11) {
                        break;
                    } else {
                        i10 = i11;
                    }
                } finally {
                    b.f4821d = false;
                }
            }
        }
        if (this.b) {
            b.c(this);
        }
    }
}
