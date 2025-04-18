package androidx.compose.foundation.lazy.staggeredgrid;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import b1.f0;
import e0.n;
import e0.q;
import e0.u;
import java.util.Arrays;

@StabilityInferred
/* loaded from: classes.dex */
public final class LazyStaggeredGridLaneInfo {

    /* renamed from: a, reason: collision with root package name */
    public int f4963a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f4964b = new int[16];

    /* renamed from: c, reason: collision with root package name */
    public final n f4965c = new n();

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    /* loaded from: classes.dex */
    public static final class SpannedItem {

        /* renamed from: a, reason: collision with root package name */
        public final int f4968a;

        /* renamed from: b, reason: collision with root package name */
        public int[] f4969b;

        public SpannedItem(int i2, int[] iArr) {
            this.f4968a = i2;
            this.f4969b = iArr;
        }
    }

    public final boolean a(int i2, int i3) {
        int f2 = f(i2);
        return f2 == i3 || f2 == -1 || f2 == -2;
    }

    public final void b(int i2, int i3) {
        if (i2 > 131072) {
            throw new IllegalArgumentException(d.j("Requested item capacity ", i2, " is larger than max supported: 131072!").toString());
        }
        int[] iArr = this.f4964b;
        if (iArr.length < i2) {
            int length = iArr.length;
            while (length < i2) {
                length *= 2;
            }
            int[] iArr2 = new int[length];
            q.S(this.f4964b, iArr2, i3, 0, 12);
            this.f4964b = iArr2;
        }
    }

    public final void c(int i2) {
        n nVar;
        int i3 = this.f4963a;
        int i4 = i2 - i3;
        if (i4 < 0 || i4 >= 131072) {
            int max = Math.max(i2 - (this.f4964b.length / 2), 0);
            this.f4963a = max;
            int i5 = max - i3;
            if (i5 >= 0) {
                int[] iArr = this.f4964b;
                if (i5 < iArr.length) {
                    q.O(0, i5, iArr.length, iArr, iArr);
                }
                int[] iArr2 = this.f4964b;
                Arrays.fill(iArr2, Math.max(0, iArr2.length - i5), this.f4964b.length, 0);
            } else {
                int i6 = -i5;
                int[] iArr3 = this.f4964b;
                if (iArr3.length + i6 < 131072) {
                    b(iArr3.length + i6 + 1, i6);
                } else {
                    if (i6 < iArr3.length) {
                        q.O(i6, 0, iArr3.length - i6, iArr3, iArr3);
                    }
                    int[] iArr4 = this.f4964b;
                    Arrays.fill(iArr4, 0, Math.min(iArr4.length, i6), 0);
                }
            }
        } else {
            b(i4 + 1, 0);
        }
        while (true) {
            nVar = this.f4965c;
            if (!(!nVar.isEmpty()) || ((SpannedItem) nVar.first()).f4968a >= this.f4963a) {
                break;
            } else {
                nVar.removeFirst();
            }
        }
        while ((!nVar.isEmpty()) && ((SpannedItem) nVar.last()).f4968a > this.f4963a + this.f4964b.length) {
            nVar.removeLast();
        }
    }

    public final int d(int i2, int i3) {
        do {
            i2--;
            if (-1 >= i2) {
                return -1;
            }
        } while (!a(i2, i3));
        return i2;
    }

    public final int[] e(int i2) {
        Integer valueOf = Integer.valueOf(i2);
        n nVar = this.f4965c;
        SpannedItem spannedItem = (SpannedItem) u.G0(f0.c(0, nVar.b(), nVar, new LazyStaggeredGridLaneInfo$getGaps$$inlined$binarySearchBy$default$1(valueOf)), nVar);
        if (spannedItem != null) {
            return spannedItem.f4969b;
        }
        return null;
    }

    public final int f(int i2) {
        int i3 = this.f4963a;
        if (i2 < i3) {
            return -1;
        }
        if (i2 >= this.f4964b.length + i3) {
            return -1;
        }
        return r1[i2 - i3] - 1;
    }

    public final void g() {
        q.X(this.f4964b, 0, 0, 6);
        this.f4965c.clear();
    }

    public final void h(int i2, int[] iArr) {
        Integer valueOf = Integer.valueOf(i2);
        n nVar = this.f4965c;
        int c2 = f0.c(0, nVar.b(), nVar, new LazyStaggeredGridLaneInfo$setGaps$$inlined$binarySearchBy$default$1(valueOf));
        if (c2 < 0) {
            if (iArr == null) {
                return;
            }
            nVar.add(-(c2 + 1), new SpannedItem(i2, iArr));
        } else if (iArr == null) {
            nVar.c(c2);
        } else {
            ((SpannedItem) nVar.get(c2)).f4969b = iArr;
        }
    }

    public final void i(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Negative lanes are not supported".toString());
        }
        c(i2);
        this.f4964b[i2 - this.f4963a] = i3 + 1;
    }
}
