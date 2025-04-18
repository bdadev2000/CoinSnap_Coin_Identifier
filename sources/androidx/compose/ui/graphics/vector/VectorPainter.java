package androidx.compose.ui.graphics.vector;

import android.support.v4.media.d;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;

@StabilityInferred
/* loaded from: classes4.dex */
public final class VectorPainter extends Painter {

    /* renamed from: a, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f15466a;

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f15467b;

    /* renamed from: c, reason: collision with root package name */
    public final VectorComponent f15468c;
    public final ParcelableSnapshotMutableIntState d;

    /* renamed from: f, reason: collision with root package name */
    public float f15469f;

    /* renamed from: g, reason: collision with root package name */
    public ColorFilter f15470g;

    /* renamed from: h, reason: collision with root package name */
    public int f15471h;

    public VectorPainter(GroupComponent groupComponent) {
        ParcelableSnapshotMutableState f2;
        ParcelableSnapshotMutableState f3;
        f2 = SnapshotStateKt.f(new Size(0L), StructuralEqualityPolicy.f14078a);
        this.f15466a = f2;
        f3 = SnapshotStateKt.f(Boolean.FALSE, StructuralEqualityPolicy.f14078a);
        this.f15467b = f3;
        VectorComponent vectorComponent = new VectorComponent(groupComponent);
        vectorComponent.f15392f = new VectorPainter$vector$1$1(this);
        this.f15468c = vectorComponent;
        this.d = SnapshotIntStateKt.a(0);
        this.f15469f = 1.0f;
        this.f15471h = -1;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyAlpha(float f2) {
        this.f15469f = f2;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyColorFilter(ColorFilter colorFilter) {
        this.f15470g = colorFilter;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo2getIntrinsicSizeNHjbRc() {
        return ((Size) this.f15466a.getValue()).f14923a;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void onDraw(DrawScope drawScope) {
        ColorFilter colorFilter = this.f15470g;
        VectorComponent vectorComponent = this.f15468c;
        if (colorFilter == null) {
            colorFilter = (ColorFilter) vectorComponent.f15393g.getValue();
        }
        if (((Boolean) this.f15467b.getValue()).booleanValue() && drawScope.getLayoutDirection() == LayoutDirection.f17495b) {
            long F1 = drawScope.F1();
            CanvasDrawScope$drawContext$1 A1 = drawScope.A1();
            long b2 = A1.b();
            A1.a().p();
            try {
                A1.f15139a.e(F1, -1.0f, 1.0f);
                vectorComponent.e(drawScope, this.f15469f, colorFilter);
            } finally {
                d.A(A1, b2);
            }
        } else {
            vectorComponent.e(drawScope, this.f15469f, colorFilter);
        }
        this.f15471h = this.d.g();
    }
}
