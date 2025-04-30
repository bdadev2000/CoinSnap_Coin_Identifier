package d4;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class u extends AbstractC2180h implements Set {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f19883d = 0;

    /* renamed from: c, reason: collision with root package name */
    public transient AbstractC2186n f19884c;

    public static int h(int i9) {
        int max = Math.max(i9, 2);
        boolean z8 = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z8 = false;
        }
        if (z8) {
            return 1073741824;
        }
        throw new IllegalArgumentException("collection too large");
    }

    public static u j(int i9, Object... objArr) {
        if (i9 != 0) {
            if (i9 != 1) {
                int h6 = h(i9);
                Object[] objArr2 = new Object[h6];
                int i10 = h6 - 1;
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 0; i13 < i9; i13++) {
                    Object obj = objArr[i13];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int T2 = F2.h.T(hashCode);
                        while (true) {
                            int i14 = T2 & i10;
                            Object obj2 = objArr2[i14];
                            if (obj2 == null) {
                                objArr[i12] = obj;
                                objArr2[i14] = obj;
                                i11 += hashCode;
                                i12++;
                                break;
                            }
                            if (obj2.equals(obj)) {
                                break;
                            }
                            T2++;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder(20);
                        sb.append("at index ");
                        sb.append(i13);
                        throw new NullPointerException(sb.toString());
                    }
                }
                Arrays.fill(objArr, i12, i9, (Object) null);
                if (i12 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new M(obj3);
                }
                if (h(i12) < h6 / 2) {
                    return j(i12, objArr);
                }
                int length = objArr.length;
                if (i12 < (length >> 1) + (length >> 2)) {
                    objArr = Arrays.copyOf(objArr, i12);
                }
                return new K(objArr, i11, objArr2, i10, i12);
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new M(obj4);
        }
        return K.l;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof u) && (this instanceof K)) {
            u uVar = (u) obj;
            uVar.getClass();
            if ((uVar instanceof K) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int i9;
        int i10 = 0;
        for (Object obj : this) {
            if (obj != null) {
                i9 = obj.hashCode();
            } else {
                i9 = 0;
            }
            i10 = ~(~(i10 + i9));
        }
        return i10;
    }

    @Override // d4.AbstractC2180h
    public Object writeReplace() {
        return new t(toArray(AbstractC2180h.b));
    }
}
