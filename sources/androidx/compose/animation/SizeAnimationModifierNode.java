package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import e0.x;
import kotlin.jvm.internal.e;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class SizeAnimationModifierNode extends LayoutModifierNodeWithPassThroughIntrinsics {

    /* renamed from: o, reason: collision with root package name */
    public AnimationSpec f1943o = null;

    /* renamed from: p, reason: collision with root package name */
    public Alignment f1944p = null;

    /* renamed from: q, reason: collision with root package name */
    public p f1945q = null;

    /* renamed from: r, reason: collision with root package name */
    public long f1946r = AnimationModifierKt.f1772a;

    /* renamed from: s, reason: collision with root package name */
    public long f1947s = ConstraintsKt.b(0, 0, 15);

    /* renamed from: t, reason: collision with root package name */
    public boolean f1948t;

    /* renamed from: u, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f1949u;

    @StabilityInferred
    /* loaded from: classes2.dex */
    public static final class AnimData {

        /* renamed from: a, reason: collision with root package name */
        public final Animatable f1950a;

        /* renamed from: b, reason: collision with root package name */
        public long f1951b;

        public AnimData(Animatable animatable, long j2) {
            this.f1950a = animatable;
            this.f1951b = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnimData)) {
                return false;
            }
            AnimData animData = (AnimData) obj;
            return p0.a.g(this.f1950a, animData.f1950a) && IntSize.b(this.f1951b, animData.f1951b);
        }

        public final int hashCode() {
            return Long.hashCode(this.f1951b) + (this.f1950a.hashCode() * 31);
        }

        public final String toString() {
            return "AnimData(anim=" + this.f1950a + ", startSize=" + ((Object) IntSize.e(this.f1951b)) + ')';
        }
    }

    public SizeAnimationModifierNode() {
        ParcelableSnapshotMutableState f2;
        f2 = SnapshotStateKt.f(null, StructuralEqualityPolicy.f14078a);
        this.f1949u = f2;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void W1() {
        this.f1946r = AnimationModifierKt.f1772a;
        this.f1948t = false;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void Y1() {
        this.f1949u.setValue(null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2) {
        Measurable measurable2;
        long j3;
        Placeable V;
        long e;
        if (measureScope.t0()) {
            this.f1947s = j2;
            this.f1948t = true;
            V = measurable.V(j2);
        } else {
            if (this.f1948t) {
                j3 = this.f1947s;
                measurable2 = measurable;
            } else {
                measurable2 = measurable;
                j3 = j2;
            }
            V = measurable2.V(j3);
        }
        Placeable placeable = V;
        long a2 = IntSizeKt.a(placeable.f15825a, placeable.f15826b);
        if (measureScope.t0()) {
            this.f1946r = a2;
            e = a2;
        } else {
            long j4 = IntSize.b(this.f1946r, AnimationModifierKt.f1772a) ^ true ? this.f1946r : a2;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.f1949u;
            AnimData animData = (AnimData) parcelableSnapshotMutableState.getValue();
            if (animData != null) {
                Animatable animatable = animData.f1950a;
                boolean z2 = (IntSize.b(j4, ((IntSize) animatable.d()).f17493a) || ((Boolean) animatable.d.getValue()).booleanValue()) ? false : true;
                if (!IntSize.b(j4, ((IntSize) animatable.e.getValue()).f17493a) || z2) {
                    animData.f1951b = ((IntSize) animatable.d()).f17493a;
                    e.v(S1(), null, 0, new SizeAnimationModifierNode$animateTo$data$1$1(animData, j4, this, null), 3);
                }
            } else {
                animData = new AnimData(new Animatable(new IntSize(j4), VectorConvertersKt.f2345h, new IntSize(IntSizeKt.a(1, 1)), 8), j4);
            }
            parcelableSnapshotMutableState.setValue(animData);
            e = ConstraintsKt.e(j2, ((IntSize) animData.f1950a.d()).f17493a);
        }
        int i2 = (int) (e >> 32);
        int i3 = (int) (e & 4294967295L);
        return measureScope.T(i2, i3, x.f30219a, new SizeAnimationModifierNode$measure$2(this, a2, i2, i3, measureScope, placeable));
    }
}
