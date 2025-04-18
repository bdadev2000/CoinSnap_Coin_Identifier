package androidx.compose.material3.internal;

import android.support.v4.media.d;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.internal.AnchorAlignmentOffsetPosition;
import androidx.compose.material3.internal.MenuPosition;
import androidx.compose.material3.internal.WindowAlignmentMarginPosition;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.AbsoluteAlignment;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import b1.f0;
import d0.b0;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.p;

@Immutable
/* loaded from: classes4.dex */
public final class DropdownMenuPositionProvider implements PopupPositionProvider {

    /* renamed from: a, reason: collision with root package name */
    public final long f12974a;

    /* renamed from: b, reason: collision with root package name */
    public final Density f12975b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12976c;
    public final p d;
    public final AnchorAlignmentOffsetPosition.Horizontal e;

    /* renamed from: f, reason: collision with root package name */
    public final AnchorAlignmentOffsetPosition.Horizontal f12977f;

    /* renamed from: g, reason: collision with root package name */
    public final WindowAlignmentMarginPosition.Horizontal f12978g;

    /* renamed from: h, reason: collision with root package name */
    public final WindowAlignmentMarginPosition.Horizontal f12979h;

    /* renamed from: i, reason: collision with root package name */
    public final AnchorAlignmentOffsetPosition.Vertical f12980i;

    /* renamed from: j, reason: collision with root package name */
    public final AnchorAlignmentOffsetPosition.Vertical f12981j;

    /* renamed from: k, reason: collision with root package name */
    public final AnchorAlignmentOffsetPosition.Vertical f12982k;

    /* renamed from: l, reason: collision with root package name */
    public final WindowAlignmentMarginPosition.Vertical f12983l;

    /* renamed from: m, reason: collision with root package name */
    public final WindowAlignmentMarginPosition.Vertical f12984m;

    /* renamed from: androidx.compose.material3.internal.DropdownMenuPositionProvider$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass2 extends r implements p {
        @Override // q0.p
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b0.f30125a;
        }
    }

    public DropdownMenuPositionProvider(long j2, Density density, p pVar) {
        int F0 = density.F0(MenuKt.f9737a);
        this.f12974a = j2;
        this.f12975b = density;
        this.f12976c = F0;
        this.d = pVar;
        int F02 = density.F0(Float.intBitsToFloat((int) (j2 >> 32)));
        BiasAlignment.Horizontal horizontal = Alignment.Companion.f14669m;
        this.e = new AnchorAlignmentOffsetPosition.Horizontal(horizontal, horizontal, F02);
        BiasAlignment.Horizontal horizontal2 = Alignment.Companion.f14671o;
        this.f12977f = new AnchorAlignmentOffsetPosition.Horizontal(horizontal2, horizontal2, F02);
        this.f12978g = new WindowAlignmentMarginPosition.Horizontal(AbsoluteAlignment.f14657c, 0);
        this.f12979h = new WindowAlignmentMarginPosition.Horizontal(AbsoluteAlignment.d, 0);
        int F03 = density.F0(Float.intBitsToFloat((int) (j2 & 4294967295L)));
        BiasAlignment.Vertical vertical = Alignment.Companion.f14666j;
        BiasAlignment.Vertical vertical2 = Alignment.Companion.f14668l;
        this.f12980i = new AnchorAlignmentOffsetPosition.Vertical(vertical, vertical2, F03);
        this.f12981j = new AnchorAlignmentOffsetPosition.Vertical(vertical2, vertical, F03);
        this.f12982k = new AnchorAlignmentOffsetPosition.Vertical(Alignment.Companion.f14667k, vertical, F03);
        this.f12983l = new WindowAlignmentMarginPosition.Vertical(vertical, F0);
        this.f12984m = new WindowAlignmentMarginPosition.Vertical(vertical2, F0);
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    public final long a(IntRect intRect, long j2, LayoutDirection layoutDirection, long j3) {
        int i2;
        int i3;
        int i4;
        MenuPosition.Horizontal[] horizontalArr = new MenuPosition.Horizontal[3];
        horizontalArr[0] = this.e;
        horizontalArr[1] = this.f12977f;
        char c2 = ' ';
        int i5 = (int) (j2 >> 32);
        horizontalArr[2] = ((int) (intRect.a() >> 32)) < i5 / 2 ? this.f12978g : this.f12979h;
        List v2 = f0.v(horizontalArr);
        int size = v2.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                i2 = 0;
                break;
            }
            int i7 = (int) (j3 >> c2);
            int i8 = size;
            int i9 = i6;
            List list = v2;
            int i10 = i5;
            i2 = ((MenuPosition.Horizontal) v2.get(i6)).a(intRect, j2, i7, layoutDirection);
            if (i9 == f0.p(list) || (i2 >= 0 && i7 + i2 <= i10)) {
                break;
            }
            i6 = i9 + 1;
            size = i8;
            i5 = i10;
            v2 = list;
            c2 = ' ';
        }
        MenuPosition.Vertical[] verticalArr = new MenuPosition.Vertical[4];
        verticalArr[0] = this.f12980i;
        verticalArr[1] = this.f12981j;
        verticalArr[2] = this.f12982k;
        int i11 = (int) (j2 & 4294967295L);
        verticalArr[3] = ((int) (intRect.a() & 4294967295L)) < i11 / 2 ? this.f12983l : this.f12984m;
        List v3 = f0.v(verticalArr);
        int size2 = v3.size();
        int i12 = 0;
        while (i12 < size2) {
            int i13 = i11;
            int i14 = (int) (j3 & 4294967295L);
            int a2 = ((MenuPosition.Vertical) v3.get(i12)).a(intRect, j2, i14);
            if (i12 == f0.p(v3) || (a2 >= (i4 = this.f12976c) && i14 + a2 <= i13 - i4)) {
                i3 = a2;
                break;
            }
            i12++;
            i11 = i13;
        }
        i3 = 0;
        long a3 = IntOffsetKt.a(i2, i3);
        this.d.invoke(intRect, IntRectKt.a(a3, j3));
        return a3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DropdownMenuPositionProvider)) {
            return false;
        }
        DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) obj;
        return this.f12974a == dropdownMenuPositionProvider.f12974a && p0.a.g(this.f12975b, dropdownMenuPositionProvider.f12975b) && this.f12976c == dropdownMenuPositionProvider.f12976c && p0.a.g(this.d, dropdownMenuPositionProvider.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + d.c(this.f12976c, (this.f12975b.hashCode() + (Long.hashCode(this.f12974a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) DpOffset.a(this.f12974a)) + ", density=" + this.f12975b + ", verticalMargin=" + this.f12976c + ", onPositionCalculated=" + this.d + ')';
    }
}
