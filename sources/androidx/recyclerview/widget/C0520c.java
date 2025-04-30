package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0520c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4958a;
    public long b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4959c;

    public C0520c(w8.h hVar) {
        this.f4958a = 1;
        G7.j.e(hVar, "source");
        this.f4959c = hVar;
        this.b = 262144L;
    }

    public void a(int i9) {
        if (i9 >= 64) {
            C0520c c0520c = (C0520c) this.f4959c;
            if (c0520c != null) {
                c0520c.a(i9 - 64);
                return;
            }
            return;
        }
        this.b &= ~(1 << i9);
    }

    public int b(int i9) {
        C0520c c0520c = (C0520c) this.f4959c;
        if (c0520c == null) {
            if (i9 >= 64) {
                return Long.bitCount(this.b);
            }
            return Long.bitCount(this.b & ((1 << i9) - 1));
        }
        if (i9 < 64) {
            return Long.bitCount(this.b & ((1 << i9) - 1));
        }
        return Long.bitCount(this.b) + c0520c.b(i9 - 64);
    }

    public void c() {
        if (((C0520c) this.f4959c) == null) {
            this.f4959c = new C0520c();
        }
    }

    public boolean d(int i9) {
        if (i9 >= 64) {
            c();
            return ((C0520c) this.f4959c).d(i9 - 64);
        }
        if ((this.b & (1 << i9)) != 0) {
            return true;
        }
        return false;
    }

    public void e(int i9, boolean z8) {
        boolean z9;
        if (i9 >= 64) {
            c();
            ((C0520c) this.f4959c).e(i9 - 64, z8);
            return;
        }
        long j7 = this.b;
        if ((Long.MIN_VALUE & j7) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        long j9 = (1 << i9) - 1;
        this.b = ((j7 & (~j9)) << 1) | (j7 & j9);
        if (z8) {
            h(i9);
        } else {
            a(i9);
        }
        if (z9 || ((C0520c) this.f4959c) != null) {
            c();
            ((C0520c) this.f4959c).e(0, z9);
        }
    }

    public boolean f(int i9) {
        boolean z8;
        if (i9 >= 64) {
            c();
            return ((C0520c) this.f4959c).f(i9 - 64);
        }
        long j7 = 1 << i9;
        long j9 = this.b;
        if ((j9 & j7) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        long j10 = j9 & (~j7);
        this.b = j10;
        long j11 = j7 - 1;
        this.b = (j10 & j11) | Long.rotateRight((~j11) & j10, 1);
        C0520c c0520c = (C0520c) this.f4959c;
        if (c0520c != null) {
            if (c0520c.d(0)) {
                h(63);
            }
            ((C0520c) this.f4959c).f(0);
        }
        return z8;
    }

    public void g() {
        this.b = 0L;
        C0520c c0520c = (C0520c) this.f4959c;
        if (c0520c != null) {
            c0520c.g();
        }
    }

    public void h(int i9) {
        if (i9 >= 64) {
            c();
            ((C0520c) this.f4959c).h(i9 - 64);
        } else {
            this.b |= 1 << i9;
        }
    }

    public String toString() {
        switch (this.f4958a) {
            case 0:
                if (((C0520c) this.f4959c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((C0520c) this.f4959c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    public C0520c() {
        this.f4958a = 0;
        this.b = 0L;
    }
}
