package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import com.applovin.impl.sdk.utils.JsonUtils;
import e0.q;
import java.util.Arrays;
import org.objectweb.asm.signature.SignatureVisitor;
import p0.a;

/* loaded from: classes4.dex */
public class SparseArrayCompat<E> implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f1609a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ int[] f1610b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f1611c;
    public /* synthetic */ int d;

    public SparseArrayCompat() {
        this(0);
    }

    public final void a(int i2, Object obj) {
        int i3 = this.d;
        if (i3 != 0 && i2 <= this.f1610b[i3 - 1]) {
            f(i2, obj);
            return;
        }
        if (this.f1609a && i3 >= this.f1610b.length) {
            SparseArrayCompatKt.a(this);
        }
        int i4 = this.d;
        if (i4 >= this.f1610b.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            int[] copyOf = Arrays.copyOf(this.f1610b, i8);
            a.r(copyOf, "copyOf(this, newSize)");
            this.f1610b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f1611c, i8);
            a.r(copyOf2, "copyOf(this, newSize)");
            this.f1611c = copyOf2;
        }
        this.f1610b[i4] = i2;
        this.f1611c[i4] = obj;
        this.d = i4 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final SparseArrayCompat clone() {
        Object clone = super.clone();
        a.q(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        SparseArrayCompat sparseArrayCompat = (SparseArrayCompat) clone;
        sparseArrayCompat.f1610b = (int[]) this.f1610b.clone();
        sparseArrayCompat.f1611c = (Object[]) this.f1611c.clone();
        return sparseArrayCompat;
    }

    public final Object c(int i2) {
        Object obj;
        Object obj2 = SparseArrayCompatKt.f1612a;
        int a2 = ContainerHelpersKt.a(this.d, i2, this.f1610b);
        if (a2 < 0 || (obj = this.f1611c[a2]) == SparseArrayCompatKt.f1612a) {
            return null;
        }
        return obj;
    }

    public final int d(int i2) {
        if (this.f1609a) {
            SparseArrayCompatKt.a(this);
        }
        return this.f1610b[i2];
    }

    public final void f(int i2, Object obj) {
        int a2 = ContainerHelpersKt.a(this.d, i2, this.f1610b);
        if (a2 >= 0) {
            this.f1611c[a2] = obj;
            return;
        }
        int i3 = ~a2;
        int i4 = this.d;
        if (i3 < i4) {
            Object[] objArr = this.f1611c;
            if (objArr[i3] == SparseArrayCompatKt.f1612a) {
                this.f1610b[i3] = i2;
                objArr[i3] = obj;
                return;
            }
        }
        if (this.f1609a && i4 >= this.f1610b.length) {
            SparseArrayCompatKt.a(this);
            i3 = ~ContainerHelpersKt.a(this.d, i2, this.f1610b);
        }
        int i5 = this.d;
        if (i5 >= this.f1610b.length) {
            int i6 = (i5 + 1) * 4;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 4;
            int[] copyOf = Arrays.copyOf(this.f1610b, i9);
            a.r(copyOf, "copyOf(this, newSize)");
            this.f1610b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f1611c, i9);
            a.r(copyOf2, "copyOf(this, newSize)");
            this.f1611c = copyOf2;
        }
        int i10 = this.d;
        if (i10 - i3 != 0) {
            int[] iArr = this.f1610b;
            int i11 = i3 + 1;
            q.O(i11, i3, i10, iArr, iArr);
            Object[] objArr2 = this.f1611c;
            q.P(i11, i3, objArr2, this.d, objArr2);
        }
        this.f1610b[i3] = i2;
        this.f1611c[i3] = obj;
        this.d++;
    }

    public final int g() {
        if (this.f1609a) {
            SparseArrayCompatKt.a(this);
        }
        return this.d;
    }

    public final Object h(int i2) {
        if (this.f1609a) {
            SparseArrayCompatKt.a(this);
        }
        return this.f1611c[i2];
    }

    public final String toString() {
        if (g() <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        int i2 = this.d;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(d(i3));
            sb.append(SignatureVisitor.INSTANCEOF);
            Object h2 = h(i3);
            if (h2 != this) {
                sb.append(h2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        a.r(sb2, "buffer.toString()");
        return sb2;
    }

    public SparseArrayCompat(int i2) {
        int i3;
        int i4 = 4;
        while (true) {
            i3 = 40;
            if (i4 >= 32) {
                break;
            }
            int i5 = (1 << i4) - 12;
            if (40 <= i5) {
                i3 = i5;
                break;
            }
            i4++;
        }
        int i6 = i3 / 4;
        this.f1610b = new int[i6];
        this.f1611c = new Object[i6];
    }
}
