package yg;

import java.io.Closeable;
import java.util.Arrays;

/* loaded from: classes4.dex */
public abstract class p implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public int f28243b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f28244c = new int[32];

    /* renamed from: d, reason: collision with root package name */
    public String[] f28245d = new String[32];

    /* renamed from: f, reason: collision with root package name */
    public int[] f28246f = new int[32];

    public abstract void T();

    public final void U(String str) {
        StringBuilder n10 = eb.j.n(str, " at path ");
        n10.append(z());
        throw new x3.a(n10.toString());
    }

    public abstract void d();

    public abstract void g();

    public abstract void j();

    public abstract void k();

    public abstract boolean p();

    public abstract double q();

    public abstract int r();

    public abstract void s();

    public abstract String t();

    public abstract int u();

    public final void v(int i10) {
        int i11 = this.f28243b;
        int[] iArr = this.f28244c;
        if (i11 == iArr.length) {
            if (i11 != 256) {
                this.f28244c = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f28245d;
                this.f28245d = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f28246f;
                this.f28246f = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new androidx.fragment.app.z("Nesting too deep at " + z());
            }
        }
        int[] iArr3 = this.f28244c;
        int i12 = this.f28243b;
        this.f28243b = i12 + 1;
        iArr3[i12] = i10;
    }

    public abstract int w(o oVar);

    public abstract void x();

    public final String z() {
        return com.bumptech.glide.e.B(this.f28243b, this.f28244c, this.f28246f, this.f28245d);
    }
}
