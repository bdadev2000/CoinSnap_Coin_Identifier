package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import e0.u;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class LazyGridDslKt$rememberColumnWidthSums$1$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f4474a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GridCells f4475b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Arrangement.Horizontal f4476c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridDslKt$rememberColumnWidthSums$1$1(PaddingValues paddingValues, GridCells gridCells, Arrangement.Horizontal horizontal) {
        super(2);
        this.f4474a = paddingValues;
        this.f4475b = gridCells;
        this.f4476c = horizontal;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Density density = (Density) obj;
        long j2 = ((Constraints) obj2).f17480a;
        if (Constraints.i(j2) == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("LazyVerticalGrid's width should be bound by parent.".toString());
        }
        LayoutDirection layoutDirection = LayoutDirection.f17494a;
        PaddingValues paddingValues = this.f4474a;
        int i2 = Constraints.i(j2) - density.F0(PaddingKt.c(paddingValues, layoutDirection) + PaddingKt.d(paddingValues, layoutDirection));
        Arrangement.Horizontal horizontal = this.f4476c;
        int[] Y0 = u.Y0(this.f4475b.a(density, i2, density.F0(horizontal.a())));
        int[] iArr = new int[Y0.length];
        horizontal.c(density, i2, Y0, layoutDirection, iArr);
        return new LazyGridSlots(Y0, iArr);
    }
}
