package a1;

import android.support.v4.media.d;
import kotlin.jvm.internal.e;
import okhttp3.internal.http2.Http2Connection;
import org.objectweb.asm.signature.SignatureVisitor;
import w0.f;
import w0.h;

/* loaded from: classes4.dex */
public final class a implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final long f58b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f59c;
    public static final /* synthetic */ int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f60a;

    static {
        int i2 = b.f61a;
        f58b = e.k(4611686018427387903L);
        f59c = e.k(-4611686018427387903L);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [w0.j, w0.h] */
    public static final long a(long j2, long j3) {
        long j4 = 1000000;
        long j5 = j3 / j4;
        long j6 = j2 + j5;
        if (!new h(-4611686018426L, 4611686018426L).b(j6)) {
            return e.k(p0.a.B(j6, -4611686018427387903L, 4611686018427387903L));
        }
        long j7 = ((j6 * j4) + (j3 - (j5 * j4))) << 1;
        int i2 = b.f61a;
        return j7;
    }

    public static final void b(StringBuilder sb, int i2, int i3, int i4, String str, boolean z2) {
        CharSequence charSequence;
        sb.append(i2);
        if (i3 != 0) {
            sb.append('.');
            String valueOf = String.valueOf(i3);
            p0.a.s(valueOf, "<this>");
            if (i4 < 0) {
                throw new IllegalArgumentException(d.j("Desired length ", i4, " is less than zero."));
            }
            if (i4 <= valueOf.length()) {
                charSequence = valueOf.subSequence(0, valueOf.length());
            } else {
                StringBuilder sb2 = new StringBuilder(i4);
                f it = new w0.e(1, i4 - valueOf.length(), 1).iterator();
                while (it.f31411c) {
                    it.b();
                    sb2.append('0');
                }
                sb2.append((CharSequence) valueOf);
                charSequence = sb2;
            }
            String obj = charSequence.toString();
            int i5 = -1;
            int length = obj.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i6 = length - 1;
                    if (obj.charAt(length) != '0') {
                        i5 = length;
                        break;
                    } else if (i6 < 0) {
                        break;
                    } else {
                        length = i6;
                    }
                }
            }
            int i7 = i5 + 1;
            if (z2 || i7 >= 3) {
                sb.append((CharSequence) obj, 0, ((i5 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) obj, 0, i7);
            }
        }
        sb.append(str);
    }

    public static int c(long j2, long j3) {
        long j4 = j2 ^ j3;
        if (j4 < 0 || (((int) j4) & 1) == 0) {
            return p0.a.F(j2, j3);
        }
        int i2 = (((int) j2) & 1) - (((int) j3) & 1);
        return j2 < 0 ? -i2 : i2;
    }

    public static final int e(long j2) {
        if (f(j2)) {
            return 0;
        }
        return (int) ((((int) j2) & 1) == 1 ? ((j2 >> 1) % 1000) * 1000000 : (j2 >> 1) % Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
    }

    public static final boolean f(long j2) {
        return j2 == f58b || j2 == f59c;
    }

    public static final double g(long j2, c cVar) {
        p0.a.s(cVar, "unit");
        if (j2 == f58b) {
            return Double.POSITIVE_INFINITY;
        }
        if (j2 == f59c) {
            return Double.NEGATIVE_INFINITY;
        }
        double d2 = j2 >> 1;
        c cVar2 = (((int) j2) & 1) == 0 ? c.f62b : c.f63c;
        p0.a.s(cVar2, "sourceUnit");
        long convert = cVar.f68a.convert(1L, cVar2.f68a);
        return convert > 0 ? d2 * convert : d2 / r9.convert(1L, r10);
    }

    public static final long h(long j2, c cVar) {
        p0.a.s(cVar, "unit");
        if (j2 == f58b) {
            return Long.MAX_VALUE;
        }
        if (j2 == f59c) {
            return Long.MIN_VALUE;
        }
        long j3 = j2 >> 1;
        c cVar2 = (((int) j2) & 1) == 0 ? c.f62b : c.f63c;
        p0.a.s(cVar2, "sourceUnit");
        return cVar.f68a.convert(j3, cVar2.f68a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return c(this.f60a, ((a) obj).f60a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f60a == ((a) obj).f60a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f60a);
    }

    public final String toString() {
        int i2;
        long j2 = this.f60a;
        if (j2 == 0) {
            return "0s";
        }
        if (j2 == f58b) {
            return "Infinity";
        }
        if (j2 == f59c) {
            return "-Infinity";
        }
        boolean z2 = j2 < 0;
        StringBuilder sb = new StringBuilder();
        if (z2) {
            sb.append(SignatureVisitor.SUPER);
        }
        if (j2 < 0) {
            j2 = (((int) j2) & 1) + ((-(j2 >> 1)) << 1);
            int i3 = b.f61a;
        }
        long h2 = h(j2, c.f66h);
        int h3 = f(j2) ? 0 : (int) (h(j2, c.f65g) % 24);
        int h4 = f(j2) ? 0 : (int) (h(j2, c.f64f) % 60);
        int h5 = f(j2) ? 0 : (int) (h(j2, c.d) % 60);
        int e = e(j2);
        boolean z3 = h2 != 0;
        boolean z4 = h3 != 0;
        boolean z5 = h4 != 0;
        boolean z6 = (h5 == 0 && e == 0) ? false : true;
        if (z3) {
            sb.append(h2);
            sb.append('d');
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (z4 || (z3 && (z5 || z6))) {
            int i4 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(h3);
            sb.append('h');
            i2 = i4;
        }
        if (z5 || (z6 && (z4 || z3))) {
            int i5 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(h4);
            sb.append('m');
            i2 = i5;
        }
        if (z6) {
            int i6 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            if (h5 != 0 || z3 || z4 || z5) {
                b(sb, h5, e, 9, "s", false);
            } else if (e >= 1000000) {
                b(sb, e / 1000000, e % 1000000, 6, "ms", false);
            } else if (e >= 1000) {
                b(sb, e / 1000, e % 1000, 3, "us", false);
            } else {
                sb.append(e);
                sb.append("ns");
            }
            i2 = i6;
        }
        if (z2 && i2 > 1) {
            sb.insert(1, '(').append(')');
        }
        String sb2 = sb.toString();
        p0.a.r(sb2, "toString(...)");
        return sb2;
    }
}
