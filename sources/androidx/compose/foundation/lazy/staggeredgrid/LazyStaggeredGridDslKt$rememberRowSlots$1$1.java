package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes4.dex */
final class LazyStaggeredGridDslKt$rememberRowSlots$1$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f4934a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridCells f4935b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Arrangement.Vertical f4936c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridDslKt$rememberRowSlots$1$1(PaddingValues paddingValues, StaggeredGridCells staggeredGridCells, Arrangement.Vertical vertical) {
        super(2);
        this.f4934a = paddingValues;
        this.f4935b = staggeredGridCells;
        this.f4936c = vertical;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Density density = (Density) obj;
        long j2 = ((Constraints) obj2).f17480a;
        if (Constraints.h(j2) == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("LazyHorizontalStaggeredGrid's height should be bound by parent.".toString());
        }
        PaddingValues paddingValues = this.f4934a;
        int h2 = Constraints.h(j2) - density.F0(paddingValues.a() + paddingValues.d());
        Arrangement.Vertical vertical = this.f4936c;
        int[] a2 = this.f4935b.a(density, h2, density.F0(vertical.a()));
        int[] iArr = new int[a2.length];
        vertical.b(density, h2, a2, iArr);
        return new LazyStaggeredGridSlots(iArr, a2);
    }
}
