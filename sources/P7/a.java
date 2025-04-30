package P7;

import G7.j;
import Q7.n0;
import e1.f;
import r8.k;

/* loaded from: classes3.dex */
public final class a implements Comparable {

    /* renamed from: c, reason: collision with root package name */
    public static final long f2438c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f2439d;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f2440f = 0;
    public final long b;

    static {
        int i9 = b.f2441a;
        f2438c = k.i(4611686018427387903L);
        f2439d = k.i(-4611686018427387903L);
    }

    public static final long a(long j7, long j9) {
        long j10 = 1000000;
        long j11 = j9 / j10;
        long j12 = j7 + j11;
        if (-4611686018426L <= j12 && j12 < 4611686018427L) {
            return k.k((j12 * j10) + (j9 - (j11 * j10)));
        }
        return k.i(f.e(j12));
    }

    public static final void b(StringBuilder sb, int i9, int i10, int i11, String str, boolean z8) {
        CharSequence charSequence;
        sb.append(i9);
        if (i10 != 0) {
            sb.append('.');
            String valueOf = String.valueOf(i10);
            j.e(valueOf, "<this>");
            if (i11 >= 0) {
                if (i11 <= valueOf.length()) {
                    charSequence = valueOf.subSequence(0, valueOf.length());
                } else {
                    StringBuilder sb2 = new StringBuilder(i11);
                    int length = i11 - valueOf.length();
                    int i12 = 1;
                    if (1 <= length) {
                        while (true) {
                            sb2.append('0');
                            if (i12 == length) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                    }
                    sb2.append((CharSequence) valueOf);
                    charSequence = sb2;
                }
                String obj = charSequence.toString();
                int i13 = -1;
                int length2 = obj.length() - 1;
                if (length2 >= 0) {
                    while (true) {
                        int i14 = length2 - 1;
                        if (obj.charAt(length2) != '0') {
                            i13 = length2;
                            break;
                        } else if (i14 < 0) {
                            break;
                        } else {
                            length2 = i14;
                        }
                    }
                }
                int i15 = i13 + 1;
                if (!z8 && i15 < 3) {
                    sb.append((CharSequence) obj, 0, i15);
                } else {
                    sb.append((CharSequence) obj, 0, ((i13 + 3) / 3) * 3);
                }
            } else {
                throw new IllegalArgumentException(n0.f(i11, "Desired length ", " is less than zero."));
            }
        }
        sb.append(str);
    }

    public static final int c(long j7) {
        long j9;
        boolean z8 = false;
        if (d(j7)) {
            return 0;
        }
        if ((((int) j7) & 1) == 1) {
            z8 = true;
        }
        if (z8) {
            j9 = ((j7 >> 1) % 1000) * 1000000;
        } else {
            j9 = (j7 >> 1) % 1000000000;
        }
        return (int) j9;
    }

    public static final boolean d(long j7) {
        if (j7 != f2438c && j7 != f2439d) {
            return false;
        }
        return true;
    }

    public static final long e(long j7, long j9) {
        if (d(j7)) {
            if (!(!d(j9)) && (j9 ^ j7) < 0) {
                throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
            }
            return j7;
        }
        if (d(j9)) {
            return j9;
        }
        int i9 = ((int) j7) & 1;
        if (i9 == (((int) j9) & 1)) {
            long j10 = (j7 >> 1) + (j9 >> 1);
            if (i9 == 0) {
                if (-4611686018426999999L <= j10 && j10 < 4611686018427000000L) {
                    return k.k(j10);
                }
                return k.i(j10 / 1000000);
            }
            return k.j(j10);
        }
        if (i9 == 1) {
            return a(j7 >> 1, j9 >> 1);
        }
        return a(j9 >> 1, j7 >> 1);
    }

    public static final long f(long j7, c cVar) {
        c cVar2;
        j.e(cVar, "unit");
        if (j7 == f2438c) {
            return Long.MAX_VALUE;
        }
        if (j7 == f2439d) {
            return Long.MIN_VALUE;
        }
        long j9 = j7 >> 1;
        if ((((int) j7) & 1) == 0) {
            cVar2 = c.NANOSECONDS;
        } else {
            cVar2 = c.MILLISECONDS;
        }
        j.e(cVar2, "sourceUnit");
        return cVar.b.convert(j9, cVar2.b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j7 = ((a) obj).b;
        long j9 = this.b;
        long j10 = j9 ^ j7;
        if (j10 >= 0 && (((int) j10) & 1) != 0) {
            int i9 = (((int) j9) & 1) - (((int) j7) & 1);
            if (j9 < 0) {
                return -i9;
            }
            return i9;
        }
        return j.g(j9, j7);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (this.b != ((a) obj).b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        boolean z8;
        boolean z9;
        int f9;
        int f10;
        int f11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i9;
        StringBuilder sb;
        long j7 = this.b;
        if (j7 == 0) {
            return "0s";
        }
        if (j7 == f2438c) {
            return "Infinity";
        }
        if (j7 == f2439d) {
            return "-Infinity";
        }
        if (j7 < 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        StringBuilder sb2 = new StringBuilder();
        if (z8) {
            sb2.append('-');
        }
        if (j7 < 0) {
            j7 = (((int) j7) & 1) + ((-(j7 >> 1)) << 1);
            int i10 = b.f2441a;
        }
        long f12 = f(j7, c.DAYS);
        if (d(j7)) {
            z9 = z8;
            f9 = 0;
        } else {
            z9 = z8;
            f9 = (int) (f(j7, c.HOURS) % 24);
        }
        if (d(j7)) {
            f10 = 0;
        } else {
            f10 = (int) (f(j7, c.MINUTES) % 60);
        }
        if (d(j7)) {
            f11 = 0;
        } else {
            f11 = (int) (f(j7, c.SECONDS) % 60);
        }
        int c9 = c(j7);
        if (f12 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (f9 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (f10 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (f11 == 0 && c9 == 0) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (z10) {
            sb2.append(f12);
            sb2.append('d');
            i9 = 1;
        } else {
            i9 = 0;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i11 = i9 + 1;
            if (i9 > 0) {
                sb2.append(' ');
            }
            sb2.append(f9);
            sb2.append('h');
            i9 = i11;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i12 = i9 + 1;
            if (i9 > 0) {
                sb2.append(' ');
            }
            sb2.append(f10);
            sb2.append('m');
            i9 = i12;
        }
        if (z13) {
            int i13 = i9 + 1;
            if (i9 > 0) {
                sb2.append(' ');
            }
            if (f11 != 0 || z10 || z11 || z12) {
                sb = sb2;
                b(sb, f11, c9, 9, "s", false);
            } else if (c9 >= 1000000) {
                sb = sb2;
                b(sb2, c9 / 1000000, c9 % 1000000, 6, "ms", false);
            } else {
                sb = sb2;
                if (c9 >= 1000) {
                    b(sb, c9 / 1000, c9 % 1000, 3, "us", false);
                } else {
                    sb.append(c9);
                    sb.append("ns");
                }
            }
            i9 = i13;
        } else {
            sb = sb2;
        }
        if (z9 && i9 > 1) {
            sb.insert(1, '(').append(')');
        }
        String sb3 = sb.toString();
        j.d(sb3, "toString(...)");
        return sb3;
    }
}
