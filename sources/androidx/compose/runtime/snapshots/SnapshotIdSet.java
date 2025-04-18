package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Immutable;
import e0.p;
import e0.q;
import e0.u;
import java.util.ArrayList;
import java.util.Iterator;

@Immutable
/* loaded from: classes3.dex */
public final class SnapshotIdSet implements Iterable<Integer>, r0.a {

    /* renamed from: f, reason: collision with root package name */
    public static final SnapshotIdSet f14561f = new SnapshotIdSet(0, 0, 0, null);

    /* renamed from: a, reason: collision with root package name */
    public final long f14562a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14563b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14564c;
    public final int[] d;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public SnapshotIdSet(long j2, long j3, int i2, int[] iArr) {
        this.f14562a = j2;
        this.f14563b = j3;
        this.f14564c = i2;
        this.d = iArr;
    }

    public final SnapshotIdSet b(SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSet2;
        int[] iArr;
        SnapshotIdSet snapshotIdSet3 = f14561f;
        if (snapshotIdSet == snapshotIdSet3) {
            return this;
        }
        if (this == snapshotIdSet3) {
            return snapshotIdSet3;
        }
        int i2 = snapshotIdSet.f14564c;
        int i3 = this.f14564c;
        int[] iArr2 = snapshotIdSet.d;
        long j2 = snapshotIdSet.f14563b;
        long j3 = snapshotIdSet.f14562a;
        if (i2 == i3 && iArr2 == (iArr = this.d)) {
            return new SnapshotIdSet((~j3) & this.f14562a, this.f14563b & (~j2), i3, iArr);
        }
        if (iArr2 != null) {
            snapshotIdSet2 = this;
            for (int i4 : iArr2) {
                snapshotIdSet2 = snapshotIdSet2.c(i4);
            }
        } else {
            snapshotIdSet2 = this;
        }
        int i5 = snapshotIdSet.f14564c;
        if (j2 != 0) {
            for (int i6 = 0; i6 < 64; i6++) {
                if (((1 << i6) & j2) != 0) {
                    snapshotIdSet2 = snapshotIdSet2.c(i6 + i5);
                }
            }
        }
        if (j3 != 0) {
            for (int i7 = 0; i7 < 64; i7++) {
                if (((1 << i7) & j3) != 0) {
                    snapshotIdSet2 = snapshotIdSet2.c(i7 + 64 + i5);
                }
            }
        }
        return snapshotIdSet2;
    }

    public final SnapshotIdSet c(int i2) {
        int[] iArr;
        int a2;
        int i3 = this.f14564c;
        int i4 = i2 - i3;
        if (i4 >= 0 && i4 < 64) {
            long j2 = 1 << i4;
            long j3 = this.f14563b;
            if ((j3 & j2) != 0) {
                return new SnapshotIdSet(this.f14562a, j3 & (~j2), i3, this.d);
            }
        } else if (i4 >= 64 && i4 < 128) {
            long j4 = 1 << (i4 - 64);
            long j5 = this.f14562a;
            if ((j5 & j4) != 0) {
                return new SnapshotIdSet(j5 & (~j4), this.f14563b, i3, this.d);
            }
        } else if (i4 < 0 && (iArr = this.d) != null && (a2 = SnapshotIdSetKt.a(i2, iArr)) >= 0) {
            int length = iArr.length;
            int i5 = length - 1;
            if (i5 == 0) {
                return new SnapshotIdSet(this.f14562a, this.f14563b, this.f14564c, null);
            }
            int[] iArr2 = new int[i5];
            if (a2 > 0) {
                q.O(0, 0, a2, iArr, iArr2);
            }
            if (a2 < i5) {
                q.O(a2, a2 + 1, length, iArr, iArr2);
            }
            return new SnapshotIdSet(this.f14562a, this.f14563b, this.f14564c, iArr2);
        }
        return this;
    }

    public final boolean d(int i2) {
        int[] iArr;
        int i3 = i2 - this.f14564c;
        if (i3 >= 0 && i3 < 64) {
            return ((1 << i3) & this.f14563b) != 0;
        }
        if (i3 >= 64 && i3 < 128) {
            return ((1 << (i3 - 64)) & this.f14562a) != 0;
        }
        if (i3 <= 0 && (iArr = this.d) != null) {
            return SnapshotIdSetKt.a(i2, iArr) >= 0;
        }
        return false;
    }

    public final SnapshotIdSet e(SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSet2;
        int[] iArr;
        SnapshotIdSet snapshotIdSet3 = snapshotIdSet;
        SnapshotIdSet snapshotIdSet4 = f14561f;
        if (snapshotIdSet3 == snapshotIdSet4) {
            return this;
        }
        if (this == snapshotIdSet4) {
            return snapshotIdSet3;
        }
        int i2 = snapshotIdSet3.f14564c;
        int i3 = this.f14564c;
        long j2 = this.f14563b;
        long j3 = this.f14562a;
        int[] iArr2 = snapshotIdSet3.d;
        long j4 = snapshotIdSet3.f14563b;
        long j5 = snapshotIdSet3.f14562a;
        if (i2 == i3 && iArr2 == (iArr = this.d)) {
            return new SnapshotIdSet(j3 | j5, j4 | j2, i3, iArr);
        }
        int[] iArr3 = this.d;
        if (iArr3 == null) {
            if (iArr3 != null) {
                for (int i4 : iArr3) {
                    snapshotIdSet3 = snapshotIdSet3.f(i4);
                }
            }
            int i5 = this.f14564c;
            if (j2 != 0) {
                for (int i6 = 0; i6 < 64; i6++) {
                    if (((1 << i6) & j2) != 0) {
                        snapshotIdSet3 = snapshotIdSet3.f(i6 + i5);
                    }
                }
            }
            if (j3 == 0) {
                return snapshotIdSet3;
            }
            for (int i7 = 0; i7 < 64; i7++) {
                if (((1 << i7) & j3) != 0) {
                    snapshotIdSet3 = snapshotIdSet3.f(i7 + 64 + i5);
                }
            }
            return snapshotIdSet3;
        }
        if (iArr2 != null) {
            snapshotIdSet2 = this;
            for (int i8 : iArr2) {
                snapshotIdSet2 = snapshotIdSet2.f(i8);
            }
        } else {
            snapshotIdSet2 = this;
        }
        int i9 = snapshotIdSet3.f14564c;
        if (j4 != 0) {
            for (int i10 = 0; i10 < 64; i10++) {
                if (((1 << i10) & j4) != 0) {
                    snapshotIdSet2 = snapshotIdSet2.f(i10 + i9);
                }
            }
        }
        if (j5 != 0) {
            for (int i11 = 0; i11 < 64; i11++) {
                if (((1 << i11) & j5) != 0) {
                    snapshotIdSet2 = snapshotIdSet2.f(i11 + 64 + i9);
                }
            }
        }
        return snapshotIdSet2;
    }

    public final SnapshotIdSet f(int i2) {
        long j2;
        int i3;
        int i4 = this.f14564c;
        int i5 = i2 - i4;
        long j3 = this.f14563b;
        if (i5 < 0 || i5 >= 64) {
            long j4 = this.f14562a;
            if (i5 < 64 || i5 >= 128) {
                int[] iArr = this.d;
                if (i5 < 128) {
                    if (iArr == null) {
                        return new SnapshotIdSet(j4, j3, i4, new int[]{i2});
                    }
                    int a2 = SnapshotIdSetKt.a(i2, iArr);
                    if (a2 < 0) {
                        int i6 = -(a2 + 1);
                        int length = iArr.length;
                        int[] iArr2 = new int[length + 1];
                        q.O(0, 0, i6, iArr, iArr2);
                        q.O(i6 + 1, i6, length, iArr, iArr2);
                        iArr2[i6] = i2;
                        return new SnapshotIdSet(this.f14562a, this.f14563b, this.f14564c, iArr2);
                    }
                } else if (!d(i2)) {
                    int i7 = ((i2 + 1) / 64) * 64;
                    int i8 = this.f14564c;
                    ArrayList arrayList = null;
                    long j5 = j4;
                    while (true) {
                        if (i8 >= i7) {
                            j2 = j3;
                            i3 = i8;
                            break;
                        }
                        if (j3 != 0) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                if (iArr != null) {
                                    for (int i9 : iArr) {
                                        arrayList.add(Integer.valueOf(i9));
                                    }
                                }
                            }
                            for (int i10 = 0; i10 < 64; i10++) {
                                if (((1 << i10) & j3) != 0) {
                                    arrayList.add(Integer.valueOf(i10 + i8));
                                }
                            }
                        }
                        if (j5 == 0) {
                            i3 = i7;
                            j2 = 0;
                            break;
                        }
                        i8 += 64;
                        j3 = j5;
                        j5 = 0;
                    }
                    if (arrayList != null) {
                        iArr = u.Y0(arrayList);
                    }
                    return new SnapshotIdSet(j5, j2, i3, iArr).f(i2);
                }
            } else {
                long j6 = 1 << (i5 - 64);
                if ((j4 & j6) == 0) {
                    return new SnapshotIdSet(j4 | j6, j3, i4, this.d);
                }
            }
        } else {
            long j7 = 1 << i5;
            if ((j3 & j7) == 0) {
                return new SnapshotIdSet(this.f14562a, j3 | j7, i4, this.d);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator<Integer> iterator() {
        return new p(new SnapshotIdSet$iterator$1(this, null), 3).iterator();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(q.M(this, 10));
        Iterator<Integer> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().intValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = arrayList.get(i3);
            i2++;
            if (i2 > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj == null || (obj instanceof CharSequence)) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) String.valueOf(obj));
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
