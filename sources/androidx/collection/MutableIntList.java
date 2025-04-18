package androidx.collection;

import android.support.v4.media.d;
import e0.q;
import java.util.Arrays;
import p0.a;

/* loaded from: classes.dex */
public final class MutableIntList extends IntList {
    public MutableIntList(int i2) {
        int[] iArr;
        if (i2 == 0) {
            iArr = IntSetKt.f1446a;
        } else {
            iArr = new int[i2];
        }
        this.f1433a = iArr;
    }

    public final void b(int i2) {
        c(this.f1434b + 1);
        int[] iArr = this.f1433a;
        int i3 = this.f1434b;
        iArr[i3] = i2;
        this.f1434b = i3 + 1;
    }

    public final void c(int i2) {
        int[] iArr = this.f1433a;
        if (iArr.length < i2) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i2, (iArr.length * 3) / 2));
            a.r(copyOf, "copyOf(this, newSize)");
            this.f1433a = copyOf;
        }
    }

    public final int d(int i2) {
        int i3;
        if (i2 < 0 || i2 >= (i3 = this.f1434b)) {
            StringBuilder t2 = d.t("Index ", i2, " must be in 0..");
            t2.append(this.f1434b - 1);
            throw new IndexOutOfBoundsException(t2.toString());
        }
        int[] iArr = this.f1433a;
        int i4 = iArr[i2];
        if (i2 != i3 - 1) {
            q.O(i2, i2 + 1, i3, iArr, iArr);
        }
        this.f1434b--;
        return i4;
    }

    public final void e(int i2, int i3) {
        if (i2 < 0 || i2 >= this.f1434b) {
            StringBuilder t2 = d.t("set index ", i2, " must be between 0 .. ");
            t2.append(this.f1434b - 1);
            throw new IndexOutOfBoundsException(t2.toString());
        }
        int[] iArr = this.f1433a;
        int i4 = iArr[i2];
        iArr[i2] = i3;
    }

    public /* synthetic */ MutableIntList() {
        this(16);
    }
}
