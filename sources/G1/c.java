package G1;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public abstract class c implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f1250g = new String[128];
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f1251c;

    /* renamed from: d, reason: collision with root package name */
    public String[] f1252d;

    /* renamed from: f, reason: collision with root package name */
    public int[] f1253f;

    static {
        for (int i9 = 0; i9 <= 31; i9++) {
            f1250g[i9] = String.format("\\u%04x", Integer.valueOf(i9));
        }
        String[] strArr = f1250g;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract void a();

    public abstract void b();

    public abstract void c();

    public abstract void h();

    public final String i() {
        int i9 = this.b;
        int[] iArr = this.f1251c;
        String[] strArr = this.f1252d;
        int[] iArr2 = this.f1253f;
        StringBuilder sb = new StringBuilder("$");
        for (int i10 = 0; i10 < i9; i10++) {
            int i11 = iArr[i10];
            if (i11 != 1 && i11 != 2) {
                if (i11 == 3 || i11 == 4 || i11 == 5) {
                    sb.append('.');
                    String str = strArr[i10];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            } else {
                sb.append('[');
                sb.append(iArr2[i10]);
                sb.append(']');
            }
        }
        return sb.toString();
    }

    public abstract boolean j();

    public abstract boolean k();

    public abstract double l();

    public abstract int m();

    public abstract String n();

    public abstract int o();

    public final void p(int i9) {
        int i10 = this.b;
        int[] iArr = this.f1251c;
        if (i10 == iArr.length) {
            if (i10 != 256) {
                this.f1251c = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f1252d;
                this.f1252d = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f1253f;
                this.f1253f = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new RuntimeException("Nesting too deep at " + i());
            }
        }
        int[] iArr3 = this.f1251c;
        int i11 = this.b;
        this.b = i11 + 1;
        iArr3[i11] = i9;
    }

    public abstract int q(a7.b bVar);

    public abstract void r();

    public abstract void s();

    public final void t(String str) {
        StringBuilder c9 = AbstractC2965e.c(str, " at path ");
        c9.append(i());
        throw new IOException(c9.toString());
    }
}
