package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes4.dex */
final class LazyStaggeredGridDslKt$rememberColumnSlots$1$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f4931a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridCells f4932b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Arrangement.Horizontal f4933c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridDslKt$rememberColumnSlots$1$1(PaddingValues paddingValues, StaggeredGridCells staggeredGridCells, Arrangement.Horizontal horizontal) {
        super(2);
        this.f4931a = paddingValues;
        this.f4932b = staggeredGridCells;
        this.f4933c = horizontal;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Density density = (Density) obj;
        long j2 = ((Constraints) obj2).f17480a;
        if (Constraints.i(j2) == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("LazyVerticalStaggeredGrid's width should be bound by parent.".toString());
        }
        LayoutDirection layoutDirection = LayoutDirection.f17494a;
        PaddingValues paddingValues = this.f4931a;
        int i2 = Constraints.i(j2) - density.F0(PaddingKt.c(paddingValues, layoutDirection) + PaddingKt.d(paddingValues, layoutDirection));
        Arrangement.Horizontal horizontal = this.f4933c;
        int[] a2 = this.f4932b.a(density, i2, density.F0(horizontal.a()));
        int[] iArr = new int[a2.length];
        horizontal.c(density, i2, a2, layoutDirection, iArr);
        return new LazyStaggeredGridSlots(iArr, a2);
    }
}
