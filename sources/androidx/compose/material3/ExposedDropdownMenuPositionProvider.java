package androidx.compose.material3;

import androidx.compose.material3.internal.AnchorAlignmentOffsetPosition;
import androidx.compose.material3.internal.MenuPosition;
import androidx.compose.material3.internal.WindowAlignmentMarginPosition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.AbsoluteAlignment;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import b1.f0;
import d0.b0;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.p;

@Stable
/* loaded from: classes4.dex */
public final class ExposedDropdownMenuPositionProvider implements PopupPositionProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Density f9335a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9336b;

    /* renamed from: c, reason: collision with root package name */
    public final State f9337c;
    public final p d;
    public final AnchorAlignmentOffsetPosition.Horizontal e;

    /* renamed from: f, reason: collision with root package name */
    public final AnchorAlignmentOffsetPosition.Horizontal f9338f;

    /* renamed from: g, reason: collision with root package name */
    public final WindowAlignmentMarginPosition.Horizontal f9339g;

    /* renamed from: h, reason: collision with root package name */
    public final WindowAlignmentMarginPosition.Horizontal f9340h;

    /* renamed from: i, reason: collision with root package name */
    public final AnchorAlignmentOffsetPosition.Vertical f9341i;

    /* renamed from: j, reason: collision with root package name */
    public final AnchorAlignmentOffsetPosition.Vertical f9342j;

    /* renamed from: k, reason: collision with root package name */
    public final WindowAlignmentMarginPosition.Vertical f9343k;

    /* renamed from: l, reason: collision with root package name */
    public final WindowAlignmentMarginPosition.Vertical f9344l;

    /* renamed from: androidx.compose.material3.ExposedDropdownMenuPositionProvider$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass2 extends r implements p {
        @Override // q0.p
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b0.f30125a;
        }
    }

    public ExposedDropdownMenuPositionProvider(Density density, int i2, MutableState mutableState, p pVar) {
        int F0 = density.F0(MenuKt.f9737a);
        this.f9335a = density;
        this.f9336b = i2;
        this.f9337c = mutableState;
        this.d = pVar;
        BiasAlignment.Horizontal horizontal = Alignment.Companion.f14669m;
        this.e = new AnchorAlignmentOffsetPosition.Horizontal(horizontal, horizontal, 0);
        BiasAlignment.Horizontal horizontal2 = Alignment.Companion.f14671o;
        this.f9338f = new AnchorAlignmentOffsetPosition.Horizontal(horizontal2, horizontal2, 0);
        this.f9339g = new WindowAlignmentMarginPosition.Horizontal(AbsoluteAlignment.f14657c, 0);
        this.f9340h = new WindowAlignmentMarginPosition.Horizontal(AbsoluteAlignment.d, 0);
        BiasAlignment.Vertical vertical = Alignment.Companion.f14666j;
        BiasAlignment.Vertical vertical2 = Alignment.Companion.f14668l;
        this.f9341i = new AnchorAlignmentOffsetPosition.Vertical(vertical, vertical2, 0);
        this.f9342j = new AnchorAlignmentOffsetPosition.Vertical(vertical2, vertical, 0);
        this.f9343k = new WindowAlignmentMarginPosition.Vertical(vertical, F0);
        this.f9344l = new WindowAlignmentMarginPosition.Vertical(vertical2, F0);
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    public final long a(IntRect intRect, long j2, LayoutDirection layoutDirection, long j3) {
        int i2;
        int i3;
        int i4;
        int i5;
        State state = this.f9337c;
        if (state != null) {
            state.getValue();
        }
        char c2 = ' ';
        long a2 = IntSizeKt.a((int) (j2 >> 32), ((int) (j2 & 4294967295L)) + this.f9336b);
        int i6 = 3;
        MenuPosition.Horizontal[] horizontalArr = new MenuPosition.Horizontal[3];
        horizontalArr[0] = this.e;
        horizontalArr[1] = this.f9338f;
        int i7 = (int) (a2 >> 32);
        horizontalArr[2] = ((int) (intRect.a() >> 32)) < i7 / 2 ? this.f9339g : this.f9340h;
        List v2 = f0.v(horizontalArr);
        int size = v2.size();
        int i8 = 0;
        while (i8 < size) {
            int i9 = (int) (j3 >> c2);
            int i10 = size;
            int i11 = i8;
            List list = v2;
            int i12 = i7;
            i3 = ((MenuPosition.Horizontal) v2.get(i8)).a(intRect, a2, i9, layoutDirection);
            if (i11 == f0.p(list) || (i3 >= 0 && i9 + i3 <= i12)) {
                i2 = 3;
                break;
            }
            i8 = i11 + 1;
            size = i10;
            i7 = i12;
            v2 = list;
            c2 = ' ';
            i6 = 3;
        }
        i2 = i6;
        i3 = 0;
        MenuPosition.Vertical[] verticalArr = new MenuPosition.Vertical[i2];
        verticalArr[0] = this.f9341i;
        verticalArr[1] = this.f9342j;
        int i13 = (int) (a2 & 4294967295L);
        verticalArr[2] = ((int) (intRect.a() & 4294967295L)) < i13 / 2 ? this.f9343k : this.f9344l;
        List v3 = f0.v(verticalArr);
        int size2 = v3.size();
        int i14 = 0;
        while (i14 < size2) {
            int i15 = i3;
            int i16 = (int) (j3 & 4294967295L);
            i5 = ((MenuPosition.Vertical) v3.get(i14)).a(intRect, a2, i16);
            if (i14 == f0.p(v3) || (i5 >= 0 && i16 + i5 <= i13)) {
                i4 = i15;
                break;
            }
            i14++;
            i3 = i15;
        }
        i4 = i3;
        i5 = 0;
        long a3 = IntOffsetKt.a(i4, i5);
        this.d.invoke(intRect, IntRectKt.a(a3, j3));
        return a3;
    }
}
