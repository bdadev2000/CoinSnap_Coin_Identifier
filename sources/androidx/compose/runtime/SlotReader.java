package androidx.compose.runtime;

import android.support.v4.media.d;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;

@StabilityInferred
/* loaded from: classes.dex */
public final class SlotReader {

    /* renamed from: a, reason: collision with root package name */
    public final SlotTable f13977a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f13978b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13979c;
    public final Object[] d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13980f;

    /* renamed from: g, reason: collision with root package name */
    public int f13981g;

    /* renamed from: h, reason: collision with root package name */
    public int f13982h;

    /* renamed from: i, reason: collision with root package name */
    public int f13983i;

    /* renamed from: j, reason: collision with root package name */
    public final IntStack f13984j;

    /* renamed from: k, reason: collision with root package name */
    public int f13985k;

    /* renamed from: l, reason: collision with root package name */
    public int f13986l;

    /* renamed from: m, reason: collision with root package name */
    public int f13987m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f13988n;

    public SlotReader(SlotTable slotTable) {
        this.f13977a = slotTable;
        this.f13978b = slotTable.f13989a;
        int i2 = slotTable.f13990b;
        this.f13979c = i2;
        this.d = slotTable.f13991c;
        this.e = slotTable.d;
        this.f13982h = i2;
        this.f13983i = -1;
        this.f13984j = new IntStack();
    }

    public final Anchor a(int i2) {
        ArrayList arrayList = this.f13977a.f13995i;
        int n2 = SlotTableKt.n(arrayList, i2, this.f13979c);
        if (n2 >= 0) {
            return (Anchor) arrayList.get(n2);
        }
        Anchor anchor = new Anchor(i2);
        arrayList.add(-(n2 + 1), anchor);
        return anchor;
    }

    public final Object b(int i2, int[] iArr) {
        int m2;
        if (!SlotTableKt.d(i2, iArr)) {
            return Composer.Companion.f13690a;
        }
        int i3 = i2 * 5;
        if (i3 >= iArr.length) {
            m2 = iArr.length;
        } else {
            m2 = SlotTableKt.m(iArr[i3 + 1] >> 29) + iArr[i3 + 4];
        }
        return this.d[m2];
    }

    public final void c() {
        int i2;
        this.f13980f = true;
        SlotTable slotTable = this.f13977a;
        slotTable.getClass();
        if (this.f13977a != slotTable || (i2 = slotTable.f13992f) <= 0) {
            ComposerKt.c("Unexpected reader close()");
            throw null;
        }
        slotTable.f13992f = i2 - 1;
    }

    public final void d() {
        if (this.f13985k == 0) {
            if (!(this.f13981g == this.f13982h)) {
                ComposerKt.c("endGroup() not called at the end of a group");
                throw null;
            }
            int i2 = this.f13983i;
            int[] iArr = this.f13978b;
            int i3 = SlotTableKt.i(i2, iArr);
            this.f13983i = i3;
            int i4 = this.f13979c;
            this.f13982h = i3 < 0 ? i4 : SlotTableKt.c(i3, iArr) + i3;
            int a2 = this.f13984j.a();
            if (a2 < 0) {
                this.f13986l = 0;
                this.f13987m = 0;
            } else {
                this.f13986l = a2;
                this.f13987m = i3 >= i4 - 1 ? this.e : SlotTableKt.b(i3 + 1, iArr);
            }
        }
    }

    public final Object e() {
        int i2 = this.f13981g;
        if (i2 < this.f13982h) {
            return b(i2, this.f13978b);
        }
        return 0;
    }

    public final int f() {
        int i2 = this.f13981g;
        if (i2 >= this.f13982h) {
            return 0;
        }
        return this.f13978b[i2 * 5];
    }

    public final Object g(int i2, int i3) {
        int[] iArr = this.f13978b;
        int j2 = SlotTableKt.j(i2, iArr);
        int i4 = i2 + 1;
        int i5 = j2 + i3;
        return i5 < (i4 < this.f13979c ? iArr[(i4 * 5) + 4] : this.e) ? this.d[i5] : Composer.Companion.f13690a;
    }

    public final Object h() {
        int i2;
        if (this.f13985k > 0 || (i2 = this.f13986l) >= this.f13987m) {
            this.f13988n = false;
            return Composer.Companion.f13690a;
        }
        this.f13988n = true;
        this.f13986l = i2 + 1;
        return this.d[i2];
    }

    public final Object i(int i2) {
        int[] iArr = this.f13978b;
        if (!SlotTableKt.f(i2, iArr)) {
            return null;
        }
        if (!SlotTableKt.f(i2, iArr)) {
            return Composer.Companion.f13690a;
        }
        return this.d[iArr[(i2 * 5) + 4]];
    }

    public final Object j(int i2, int[] iArr) {
        if (!SlotTableKt.e(i2, iArr)) {
            return null;
        }
        int i3 = i2 * 5;
        return this.d[SlotTableKt.m(iArr[i3 + 1] >> 30) + iArr[i3 + 4]];
    }

    public final void k(int i2) {
        if (!(this.f13985k == 0)) {
            ComposerKt.c("Cannot reposition while in an empty region");
            throw null;
        }
        this.f13981g = i2;
        int[] iArr = this.f13978b;
        int i3 = this.f13979c;
        int i4 = i2 < i3 ? SlotTableKt.i(i2, iArr) : -1;
        this.f13983i = i4;
        if (i4 < 0) {
            this.f13982h = i3;
        } else {
            this.f13982h = SlotTableKt.c(i4, iArr) + i4;
        }
        this.f13986l = 0;
        this.f13987m = 0;
    }

    public final int l() {
        if (!(this.f13985k == 0)) {
            ComposerKt.c("Cannot skip while in an empty region");
            throw null;
        }
        int i2 = this.f13981g;
        int[] iArr = this.f13978b;
        int h2 = SlotTableKt.f(i2, iArr) ? 1 : SlotTableKt.h(this.f13981g, iArr);
        int i3 = this.f13981g;
        this.f13981g = SlotTableKt.c(i3, iArr) + i3;
        return h2;
    }

    public final void m() {
        if (!(this.f13985k == 0)) {
            ComposerKt.c("Cannot skip the enclosing group while in an empty region");
            throw null;
        }
        this.f13981g = this.f13982h;
        this.f13986l = 0;
        this.f13987m = 0;
    }

    public final void n() {
        if (this.f13985k <= 0) {
            int i2 = this.f13983i;
            int i3 = this.f13981g;
            int[] iArr = this.f13978b;
            if (!(SlotTableKt.i(i3, iArr) == i2)) {
                PreconditionsKt.a("Invalid slot table detected");
                throw null;
            }
            int i4 = this.f13986l;
            int i5 = this.f13987m;
            IntStack intStack = this.f13984j;
            if (i4 == 0 && i5 == 0) {
                intStack.b(-1);
            } else {
                intStack.b(i4);
            }
            this.f13983i = i3;
            this.f13982h = SlotTableKt.c(i3, iArr) + i3;
            int i6 = i3 + 1;
            this.f13981g = i6;
            this.f13986l = SlotTableKt.j(i3, iArr);
            this.f13987m = i3 >= this.f13979c - 1 ? this.e : SlotTableKt.b(i6, iArr);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.f13981g);
        sb.append(", key=");
        sb.append(f());
        sb.append(", parent=");
        sb.append(this.f13983i);
        sb.append(", end=");
        return d.o(sb, this.f13982h, ')');
    }
}
