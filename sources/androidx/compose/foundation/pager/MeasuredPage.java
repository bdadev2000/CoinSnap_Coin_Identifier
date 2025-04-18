package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;

@StabilityInferred
/* loaded from: classes3.dex */
public final class MeasuredPage implements PageInfo {

    /* renamed from: a, reason: collision with root package name */
    public final int f5125a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5126b;

    /* renamed from: c, reason: collision with root package name */
    public final List f5127c;
    public final long d;
    public final Object e;

    /* renamed from: f, reason: collision with root package name */
    public final Alignment.Horizontal f5128f;

    /* renamed from: g, reason: collision with root package name */
    public final Alignment.Vertical f5129g;

    /* renamed from: h, reason: collision with root package name */
    public final LayoutDirection f5130h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f5131i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f5132j;

    /* renamed from: k, reason: collision with root package name */
    public final int f5133k;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f5134l;

    /* renamed from: m, reason: collision with root package name */
    public int f5135m;

    /* renamed from: n, reason: collision with root package name */
    public int f5136n;

    public MeasuredPage(int i2, int i3, List list, long j2, Object obj, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z2) {
        this.f5125a = i2;
        this.f5126b = i3;
        this.f5127c = list;
        this.d = j2;
        this.e = obj;
        this.f5128f = horizontal;
        this.f5129g = vertical;
        this.f5130h = layoutDirection;
        this.f5131i = z2;
        this.f5132j = orientation == Orientation.f3394a;
        int size = list.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            Placeable placeable = (Placeable) list.get(i5);
            i4 = Math.max(i4, !this.f5132j ? placeable.f15826b : placeable.f15825a);
        }
        this.f5133k = i4;
        this.f5134l = new int[this.f5127c.size() * 2];
        this.f5136n = Integer.MIN_VALUE;
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    public final int a() {
        return this.f5135m;
    }

    public final void b(int i2) {
        this.f5135m += i2;
        int[] iArr = this.f5134l;
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            boolean z2 = this.f5132j;
            if ((z2 && i3 % 2 == 1) || (!z2 && i3 % 2 == 0)) {
                iArr[i3] = iArr[i3] + i2;
            }
        }
    }

    public final void c(int i2, int i3, int i4) {
        int i5;
        this.f5135m = i2;
        boolean z2 = this.f5132j;
        this.f5136n = z2 ? i4 : i3;
        List list = this.f5127c;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            Placeable placeable = (Placeable) list.get(i6);
            int i7 = i6 * 2;
            int[] iArr = this.f5134l;
            if (z2) {
                Alignment.Horizontal horizontal = this.f5128f;
                if (horizontal == null) {
                    throw new IllegalArgumentException("null horizontalAlignment".toString());
                }
                iArr[i7] = horizontal.a(placeable.f15825a, i3, this.f5130h);
                iArr[i7 + 1] = i2;
                i5 = placeable.f15826b;
            } else {
                iArr[i7] = i2;
                int i8 = i7 + 1;
                Alignment.Vertical vertical = this.f5129g;
                if (vertical == null) {
                    throw new IllegalArgumentException("null verticalAlignment".toString());
                }
                iArr[i8] = vertical.a(placeable.f15826b, i4);
                i5 = placeable.f15825a;
            }
            i2 += i5;
        }
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    public final int getIndex() {
        return this.f5125a;
    }
}
