package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import d0.b0;
import e0.t;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.r;
import p0.a;
import q0.l;
import q0.p;

/* loaded from: classes3.dex */
final class SubcomposeLayoutState$setMeasurePolicy$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SubcomposeLayoutState f15854a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubcomposeLayoutState$setMeasurePolicy$1(SubcomposeLayoutState subcomposeLayoutState) {
        super(2);
        this.f15854a = subcomposeLayoutState;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        final p pVar = (p) obj2;
        final LayoutNodeSubcompositionsState a2 = this.f15854a.a();
        final String str = a2.f15765q;
        ((LayoutNode) obj).i(new LayoutNode.NoIntrinsicsMeasurePolicy(str) { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo0measure3p2s80s(MeasureScope measureScope, List list, long j2) {
                final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
                layoutNodeSubcompositionsState.f15757i.f15778a = measureScope.getLayoutDirection();
                layoutNodeSubcompositionsState.f15757i.f15779b = measureScope.getDensity();
                layoutNodeSubcompositionsState.f15757i.f15780c = measureScope.x1();
                boolean t02 = measureScope.t0();
                p pVar2 = pVar;
                if (t02 || layoutNodeSubcompositionsState.f15751a.f15944f == null) {
                    layoutNodeSubcompositionsState.d = 0;
                    final MeasureResult measureResult = (MeasureResult) pVar2.invoke(layoutNodeSubcompositionsState.f15757i, new Constraints(j2));
                    final int i2 = layoutNodeSubcompositionsState.d;
                    return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure-3p2s80s$$inlined$createMeasureResult$2
                        @Override // androidx.compose.ui.layout.MeasureResult
                        public final int getHeight() {
                            return measureResult.getHeight();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public final int getWidth() {
                            return measureResult.getWidth();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public final Map q() {
                            return measureResult.q();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public final void r() {
                            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = layoutNodeSubcompositionsState;
                            layoutNodeSubcompositionsState2.d = i2;
                            measureResult.r();
                            layoutNodeSubcompositionsState2.b(layoutNodeSubcompositionsState2.d);
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public final l s() {
                            return measureResult.s();
                        }
                    };
                }
                layoutNodeSubcompositionsState.f15754f = 0;
                final MeasureResult measureResult2 = (MeasureResult) pVar2.invoke(layoutNodeSubcompositionsState.f15758j, new Constraints(j2));
                final int i3 = layoutNodeSubcompositionsState.f15754f;
                return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure-3p2s80s$$inlined$createMeasureResult$1
                    @Override // androidx.compose.ui.layout.MeasureResult
                    public final int getHeight() {
                        return measureResult2.getHeight();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public final int getWidth() {
                        return measureResult2.getWidth();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public final Map q() {
                        return measureResult2.q();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public final void r() {
                        int i4 = i3;
                        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = layoutNodeSubcompositionsState;
                        layoutNodeSubcompositionsState2.f15754f = i4;
                        measureResult2.r();
                        Set entrySet = layoutNodeSubcompositionsState2.f15761m.entrySet();
                        LayoutNodeSubcompositionsState$disposeUnusedSlotsInPostLookahead$1 layoutNodeSubcompositionsState$disposeUnusedSlotsInPostLookahead$1 = new LayoutNodeSubcompositionsState$disposeUnusedSlotsInPostLookahead$1(layoutNodeSubcompositionsState2);
                        a.s(entrySet, "<this>");
                        t.v0(entrySet, layoutNodeSubcompositionsState$disposeUnusedSlotsInPostLookahead$1, true);
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public final l s() {
                        return measureResult2.s();
                    }
                };
            }
        });
        return b0.f30125a;
    }
}
