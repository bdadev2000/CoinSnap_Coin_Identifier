package androidx.compose.ui.layout;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import java.util.Map;
import q0.l;

@MeasureScopeMarker
/* loaded from: classes2.dex */
public interface MeasureScope extends IntrinsicMeasureScope {

    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
    }

    default MeasureResult T(int i2, int i3, Map map, l lVar) {
        return r0(i2, i3, map, lVar);
    }

    default MeasureResult r0(final int i2, final int i3, final Map map, final l lVar) {
        if ((i2 & (-16777216)) == 0 && ((-16777216) & i3) == 0) {
            return new MeasureResult(i2, i3, map, this, lVar) { // from class: androidx.compose.ui.layout.MeasureScope$layout$1

                /* renamed from: a, reason: collision with root package name */
                public final int f15800a;

                /* renamed from: b, reason: collision with root package name */
                public final int f15801b;

                /* renamed from: c, reason: collision with root package name */
                public final Map f15802c;
                public final l d = null;
                public final /* synthetic */ int e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ MeasureScope f15803f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ l f15804g;

                {
                    this.e = i2;
                    this.f15803f = this;
                    this.f15804g = lVar;
                    this.f15800a = i2;
                    this.f15801b = i3;
                    this.f15802c = map;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public final int getHeight() {
                    return this.f15801b;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public final int getWidth() {
                    return this.f15800a;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public final Map q() {
                    return this.f15802c;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public final void r() {
                    MeasureScope measureScope = this.f15803f;
                    boolean z2 = measureScope instanceof LookaheadCapablePlaceable;
                    l lVar2 = this.f15804g;
                    if (z2) {
                        lVar2.invoke(((LookaheadCapablePlaceable) measureScope).f16056j);
                    } else {
                        lVar2.invoke(new SimplePlacementScope(this.e, measureScope.getLayoutDirection()));
                    }
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public final l s() {
                    return this.d;
                }
            };
        }
        InlineClassHelperKt.b("Size(" + i2 + " x " + i3 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }
}
