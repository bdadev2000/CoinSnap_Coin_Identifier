package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import e0.u;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes.dex */
final class LazyGridDslKt$rememberRowHeightSums$1$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f4477a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GridCells f4478b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Arrangement.Vertical f4479c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridDslKt$rememberRowHeightSums$1$1(PaddingValues paddingValues, GridCells gridCells, Arrangement.Vertical vertical) {
        super(2);
        this.f4477a = paddingValues;
        this.f4478b = gridCells;
        this.f4479c = vertical;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Density density = (Density) obj;
        long j2 = ((Constraints) obj2).f17480a;
        if (Constraints.h(j2) == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("LazyHorizontalGrid's height should be bound by parent.".toString());
        }
        PaddingValues paddingValues = this.f4477a;
        int h2 = Constraints.h(j2) - density.F0(paddingValues.a() + paddingValues.d());
        Arrangement.Vertical vertical = this.f4479c;
        int[] Y0 = u.Y0(this.f4478b.a(density, h2, density.F0(vertical.a())));
        int[] iArr = new int[Y0.length];
        vertical.b(density, h2, Y0, iArr);
        return new LazyGridSlots(Y0, iArr);
    }
}
