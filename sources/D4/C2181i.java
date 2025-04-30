package d4;

import java.util.Arrays;
import java.util.Objects;

/* renamed from: d4.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2181i {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f19868a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19869c;

    public C2181i() {
        z2.i.c(4, "initialCapacity");
        this.f19868a = new Object[4];
        this.b = 0;
    }

    public static int d(int i9, int i10) {
        if (i10 >= 0) {
            int i11 = i9 + (i9 >> 1) + 1;
            if (i11 < i10) {
                i11 = Integer.highestOneBit(i10 - 1) << 1;
            }
            if (i11 < 0) {
                return Integer.MAX_VALUE;
            }
            return i11;
        }
        throw new AssertionError("cannot store more than MAX_VALUE elements");
    }

    public final void a(Object... objArr) {
        int length = objArr.length;
        R2.b.i(length, objArr);
        e(this.b + length);
        System.arraycopy(objArr, 0, this.f19868a, this.b, length);
        this.b += length;
    }

    public void b(Object obj) {
        obj.getClass();
        e(this.b + 1);
        Object[] objArr = this.f19868a;
        int i9 = this.b;
        this.b = i9 + 1;
        objArr[i9] = obj;
    }

    public u c() {
        int i9 = this.b;
        if (i9 != 0) {
            if (i9 != 1) {
                u j7 = u.j(i9, this.f19868a);
                this.b = j7.size();
                this.f19869c = true;
                return j7;
            }
            Object obj = this.f19868a[0];
            Objects.requireNonNull(obj);
            int i10 = u.f19883d;
            return new M(obj);
        }
        int i11 = u.f19883d;
        return K.l;
    }

    public final void e(int i9) {
        Object[] objArr = this.f19868a;
        if (objArr.length < i9) {
            this.f19868a = Arrays.copyOf(objArr, d(objArr.length, i9));
            this.f19869c = false;
        } else if (this.f19869c) {
            this.f19868a = (Object[]) objArr.clone();
            this.f19869c = false;
        }
    }
}
