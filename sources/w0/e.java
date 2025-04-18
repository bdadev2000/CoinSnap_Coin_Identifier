package w0;

import kotlin.jvm.internal.q;

/* loaded from: classes2.dex */
public class e implements Iterable, r0.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f31406a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31407b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31408c;

    public e(int i2, int i3, int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i4 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f31406a = i2;
        this.f31407b = q.f(i2, i3, i4);
        this.f31408c = i4;
    }

    @Override // java.lang.Iterable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final f iterator() {
        return new f(this.f31406a, this.f31407b, this.f31408c);
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            if (!isEmpty() || !((e) obj).isEmpty()) {
                e eVar = (e) obj;
                if (this.f31406a != eVar.f31406a || this.f31407b != eVar.f31407b || this.f31408c != eVar.f31408c) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f31406a * 31) + this.f31407b) * 31) + this.f31408c;
    }

    public boolean isEmpty() {
        int i2 = this.f31408c;
        int i3 = this.f31407b;
        int i4 = this.f31406a;
        if (i2 > 0) {
            if (i4 <= i3) {
                return false;
            }
        } else if (i4 >= i3) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb;
        int i2 = this.f31407b;
        int i3 = this.f31406a;
        int i4 = this.f31408c;
        if (i4 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i2);
            sb.append(" step ");
            sb.append(i4);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i2);
            sb.append(" step ");
            sb.append(-i4);
        }
        return sb.toString();
    }
}
