package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import com.applovin.impl.sdk.utils.JsonUtils;
import e0.q;
import java.util.Arrays;
import org.objectweb.asm.signature.SignatureVisitor;
import p0.a;

/* loaded from: classes2.dex */
public class LongSparseArray<E> implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f1466a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f1467b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f1468c;
    public /* synthetic */ int d;

    public LongSparseArray() {
        this((Object) null);
    }

    public final void a() {
        int i2 = this.d;
        Object[] objArr = this.f1468c;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.d = 0;
        this.f1466a = false;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final LongSparseArray clone() {
        Object clone = super.clone();
        a.q(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        LongSparseArray longSparseArray = (LongSparseArray) clone;
        longSparseArray.f1467b = (long[]) this.f1467b.clone();
        longSparseArray.f1468c = (Object[]) this.f1468c.clone();
        return longSparseArray;
    }

    public final Object c(long j2) {
        Object obj;
        int b2 = ContainerHelpersKt.b(this.f1467b, this.d, j2);
        if (b2 < 0 || (obj = this.f1468c[b2]) == LongSparseArrayKt.f1469a) {
            return null;
        }
        return obj;
    }

    public final Object d(long j2, Long l2) {
        Object obj;
        int b2 = ContainerHelpersKt.b(this.f1467b, this.d, j2);
        return (b2 < 0 || (obj = this.f1468c[b2]) == LongSparseArrayKt.f1469a) ? l2 : obj;
    }

    public final int f(long j2) {
        if (this.f1466a) {
            int i2 = this.d;
            long[] jArr = this.f1467b;
            Object[] objArr = this.f1468c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != LongSparseArrayKt.f1469a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f1466a = false;
            this.d = i3;
        }
        return ContainerHelpersKt.b(this.f1467b, this.d, j2);
    }

    public final long g(int i2) {
        if (!(i2 >= 0 && i2 < this.d)) {
            RuntimeHelpersKt.a("Expected index to be within 0..size()-1, but was " + i2);
            throw null;
        }
        if (this.f1466a) {
            int i3 = this.d;
            long[] jArr = this.f1467b;
            Object[] objArr = this.f1468c;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                Object obj = objArr[i5];
                if (obj != LongSparseArrayKt.f1469a) {
                    if (i5 != i4) {
                        jArr[i4] = jArr[i5];
                        objArr[i4] = obj;
                        objArr[i5] = null;
                    }
                    i4++;
                }
            }
            this.f1466a = false;
            this.d = i4;
        }
        return this.f1467b[i2];
    }

    public final void h(long j2, Object obj) {
        int b2 = ContainerHelpersKt.b(this.f1467b, this.d, j2);
        if (b2 >= 0) {
            this.f1468c[b2] = obj;
            return;
        }
        int i2 = ~b2;
        int i3 = this.d;
        if (i2 < i3) {
            Object[] objArr = this.f1468c;
            if (objArr[i2] == LongSparseArrayKt.f1469a) {
                this.f1467b[i2] = j2;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.f1466a) {
            long[] jArr = this.f1467b;
            if (i3 >= jArr.length) {
                Object[] objArr2 = this.f1468c;
                int i4 = 0;
                for (int i5 = 0; i5 < i3; i5++) {
                    Object obj2 = objArr2[i5];
                    if (obj2 != LongSparseArrayKt.f1469a) {
                        if (i5 != i4) {
                            jArr[i4] = jArr[i5];
                            objArr2[i4] = obj2;
                            objArr2[i5] = null;
                        }
                        i4++;
                    }
                }
                this.f1466a = false;
                this.d = i4;
                i2 = ~ContainerHelpersKt.b(this.f1467b, i4, j2);
            }
        }
        int i6 = this.d;
        if (i6 >= this.f1467b.length) {
            int i7 = (i6 + 1) * 8;
            int i8 = 4;
            while (true) {
                if (i8 >= 32) {
                    break;
                }
                int i9 = (1 << i8) - 12;
                if (i7 <= i9) {
                    i7 = i9;
                    break;
                }
                i8++;
            }
            int i10 = i7 / 8;
            long[] copyOf = Arrays.copyOf(this.f1467b, i10);
            a.r(copyOf, "copyOf(this, newSize)");
            this.f1467b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f1468c, i10);
            a.r(copyOf2, "copyOf(this, newSize)");
            this.f1468c = copyOf2;
        }
        int i11 = this.d - i2;
        if (i11 != 0) {
            long[] jArr2 = this.f1467b;
            int i12 = i2 + 1;
            a.s(jArr2, "<this>");
            System.arraycopy(jArr2, i2, jArr2, i12, i11);
            Object[] objArr3 = this.f1468c;
            q.P(i12, i2, objArr3, this.d, objArr3);
        }
        this.f1467b[i2] = j2;
        this.f1468c[i2] = obj;
        this.d++;
    }

    public final void i(long j2) {
        int b2 = ContainerHelpersKt.b(this.f1467b, this.d, j2);
        if (b2 >= 0) {
            Object[] objArr = this.f1468c;
            Object obj = objArr[b2];
            Object obj2 = LongSparseArrayKt.f1469a;
            if (obj != obj2) {
                objArr[b2] = obj2;
                this.f1466a = true;
            }
        }
    }

    public final int j() {
        if (this.f1466a) {
            int i2 = this.d;
            long[] jArr = this.f1467b;
            Object[] objArr = this.f1468c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != LongSparseArrayKt.f1469a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f1466a = false;
            this.d = i3;
        }
        return this.d;
    }

    public final Object k(int i2) {
        if (!(i2 >= 0 && i2 < this.d)) {
            RuntimeHelpersKt.a("Expected index to be within 0..size()-1, but was " + i2);
            throw null;
        }
        if (this.f1466a) {
            int i3 = this.d;
            long[] jArr = this.f1467b;
            Object[] objArr = this.f1468c;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                Object obj = objArr[i5];
                if (obj != LongSparseArrayKt.f1469a) {
                    if (i5 != i4) {
                        jArr[i4] = jArr[i5];
                        objArr[i4] = obj;
                        objArr[i5] = null;
                    }
                    i4++;
                }
            }
            this.f1466a = false;
            this.d = i4;
        }
        return this.f1468c[i2];
    }

    public final String toString() {
        if (j() <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        int i2 = this.d;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(g(i3));
            sb.append(SignatureVisitor.INSTANCEOF);
            Object k2 = k(i3);
            if (k2 != sb) {
                sb.append(k2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        a.r(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public LongSparseArray(int i2) {
        if (i2 == 0) {
            this.f1467b = ContainerHelpersKt.f1618b;
            this.f1468c = ContainerHelpersKt.f1619c;
            return;
        }
        int i3 = i2 * 8;
        int i4 = 4;
        while (true) {
            if (i4 >= 32) {
                break;
            }
            int i5 = (1 << i4) - 12;
            if (i3 <= i5) {
                i3 = i5;
                break;
            }
            i4++;
        }
        int i6 = i3 / 8;
        this.f1467b = new long[i6];
        this.f1468c = new Object[i6];
    }

    public /* synthetic */ LongSparseArray(Object obj) {
        this(10);
    }
}
