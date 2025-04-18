package androidx.compose.foundation;

import android.support.v4.media.d;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.LayoutDirection;
import b1.a2;
import com.google.android.gms.common.api.Api;
import e0.x;
import kotlin.jvm.internal.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MarqueeModifierNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, FocusEventModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public int f2787o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f2788p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f2789q = 0;

    /* renamed from: r, reason: collision with root package name */
    public float f2790r = 0.0f;

    /* renamed from: s, reason: collision with root package name */
    public final ParcelableSnapshotMutableIntState f2791s = SnapshotIntStateKt.a(0);

    /* renamed from: t, reason: collision with root package name */
    public final ParcelableSnapshotMutableIntState f2792t = SnapshotIntStateKt.a(0);

    /* renamed from: u, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f2793u;

    /* renamed from: v, reason: collision with root package name */
    public a2 f2794v;
    public final ParcelableSnapshotMutableState w;
    public final ParcelableSnapshotMutableState x;

    /* renamed from: y, reason: collision with root package name */
    public final Animatable f2795y;

    /* renamed from: z, reason: collision with root package name */
    public final State f2796z;

    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MarqueeModifierNode() {
        ParcelableSnapshotMutableState f2;
        ParcelableSnapshotMutableState f3;
        ParcelableSnapshotMutableState f4;
        f2 = SnapshotStateKt.f(Boolean.FALSE, StructuralEqualityPolicy.f14078a);
        this.f2793u = f2;
        f3 = SnapshotStateKt.f(null, StructuralEqualityPolicy.f14078a);
        this.w = f3;
        f4 = SnapshotStateKt.f(new MarqueeAnimationMode(), StructuralEqualityPolicy.f14078a);
        this.x = f4;
        this.f2795y = AnimatableKt.a(0.0f);
        this.f2796z = SnapshotStateKt.e(new MarqueeModifierNode$spacingPx$2(this));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int A(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.K(Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int E(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return 0;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int K(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.S(i2);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void W1() {
        g2();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void X1() {
        a2 a2Var = this.f2794v;
        if (a2Var != null) {
            a2Var.a(null);
        }
        this.f2794v = null;
    }

    public final float e2() {
        float signum = Math.signum(this.f2790r);
        int ordinal = DelegatableNodeKt.f(this).f15960v.ordinal();
        int i2 = 1;
        if (ordinal != 0) {
            if (ordinal != 1) {
                throw new RuntimeException();
            }
            i2 = -1;
        }
        return signum * i2;
    }

    public final int f2() {
        return ((Number) this.f2796z.getValue()).intValue();
    }

    public final void g2() {
        a2 a2Var = this.f2794v;
        if (a2Var != null) {
            a2Var.a(null);
        }
        if (this.f14699n) {
            this.f2794v = e.v(S1(), null, 0, new MarqueeModifierNode$restartAnimation$1(a2Var, this, null), 3);
        }
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable V = measurable.V(Constraints.b(j2, 0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, 0, 13));
        int h2 = ConstraintsKt.h(V.f15825a, j2);
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.f2792t;
        parcelableSnapshotMutableIntState.b(h2);
        this.f2791s.b(V.f15825a);
        return measureScope.T(parcelableSnapshotMutableIntState.g(), V.f15826b, x.f30219a, new MarqueeModifierNode$measure$1(V, this));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int q(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.s(Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public final void v(FocusStateImpl focusStateImpl) {
        this.f2793u.setValue(Boolean.valueOf(focusStateImpl.b()));
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void z(ContentDrawScope contentDrawScope) {
        Animatable animatable = this.f2795y;
        float floatValue = ((Number) animatable.d()).floatValue() * e2();
        float e2 = e2();
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.f2792t;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = this.f2791s;
        boolean z2 = e2 != 1.0f ? ((Number) animatable.d()).floatValue() < ((float) parcelableSnapshotMutableIntState.g()) : ((Number) animatable.d()).floatValue() < ((float) parcelableSnapshotMutableIntState2.g());
        boolean z3 = e2() != 1.0f ? ((Number) animatable.d()).floatValue() > ((float) f2()) : ((Number) animatable.d()).floatValue() > ((float) ((parcelableSnapshotMutableIntState2.g() + f2()) - parcelableSnapshotMutableIntState.g()));
        float g2 = e2() == 1.0f ? parcelableSnapshotMutableIntState2.g() + f2() : (-parcelableSnapshotMutableIntState2.g()) - f2();
        float g3 = floatValue + parcelableSnapshotMutableIntState.g();
        float b2 = Size.b(contentDrawScope.b());
        CanvasDrawScope$drawContext$1 A1 = contentDrawScope.A1();
        long b3 = A1.b();
        A1.a().p();
        try {
            A1.f15139a.b(floatValue, 0.0f, g3, b2, 1);
            if (z2) {
                contentDrawScope.P1();
            }
            if (z3) {
                contentDrawScope.A1().f15139a.g(g2, 0.0f);
                try {
                    contentDrawScope.P1();
                    contentDrawScope.A1().f15139a.g(-g2, -0.0f);
                } catch (Throwable th) {
                    contentDrawScope.A1().f15139a.g(-g2, -0.0f);
                    throw th;
                }
            }
            d.A(A1, b3);
        } catch (Throwable th2) {
            d.A(A1, b3);
            throw th2;
        }
    }
}
