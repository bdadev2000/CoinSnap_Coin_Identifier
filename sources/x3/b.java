package x3;

import androidx.fragment.app.z;
import d3.g;
import eb.j;
import java.io.Closeable;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public abstract class b implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f27349g = new String[128];

    /* renamed from: b, reason: collision with root package name */
    public int f27350b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f27351c = new int[32];

    /* renamed from: d, reason: collision with root package name */
    public String[] f27352d = new String[32];

    /* renamed from: f, reason: collision with root package name */
    public int[] f27353f = new int[32];

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f27349g[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f27349g;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract void T();

    public final void U(String str) {
        StringBuilder n10 = j.n(str, " at path ");
        n10.append(z());
        throw new a(n10.toString());
    }

    public abstract void d();

    public abstract void g();

    public abstract void j();

    public abstract void k();

    public abstract boolean p();

    public abstract boolean q();

    public abstract double r();

    public abstract int s();

    public abstract String t();

    public abstract int u();

    public final void v(int i10) {
        int i11 = this.f27350b;
        int[] iArr = this.f27351c;
        if (i11 == iArr.length) {
            if (i11 != 256) {
                this.f27351c = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f27352d;
                this.f27352d = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f27353f;
                this.f27353f = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new z("Nesting too deep at " + z());
            }
        }
        int[] iArr3 = this.f27351c;
        int i12 = this.f27350b;
        this.f27350b = i12 + 1;
        iArr3[i12] = i10;
    }

    public abstract int w(g gVar);

    public abstract void x();

    public final String z() {
        int i10 = this.f27350b;
        int[] iArr = this.f27351c;
        String[] strArr = this.f27352d;
        int[] iArr2 = this.f27353f;
        StringBuilder sb2 = new StringBuilder("$");
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i12 != 1 && i12 != 2) {
                if (i12 == 3 || i12 == 4 || i12 == 5) {
                    sb2.append('.');
                    String str = strArr[i11];
                    if (str != null) {
                        sb2.append(str);
                    }
                }
            } else {
                sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
                sb2.append(iArr2[i11]);
                sb2.append(AbstractJsonLexerKt.END_LIST);
            }
        }
        return sb2.toString();
    }
}
