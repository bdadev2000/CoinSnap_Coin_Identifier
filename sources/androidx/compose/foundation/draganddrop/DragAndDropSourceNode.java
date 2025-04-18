package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.draganddrop.DragAndDropModifierNode;
import androidx.compose.ui.draganddrop.DragAndDropNode;
import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.platform.ViewConfiguration;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.p;

@StabilityInferred
@ExperimentalFoundationApi
/* loaded from: classes4.dex */
public final class DragAndDropSourceNode extends DelegatingNode implements LayoutAwareModifierNode {

    /* renamed from: q, reason: collision with root package name */
    public p f2994q;

    @e(c = "androidx.compose.foundation.draganddrop.DragAndDropSourceNode$1", f = "DragAndDropSource.kt", l = {Opcodes.LREM}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.draganddrop.DragAndDropSourceNode$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f2995a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f2996b;
        public final /* synthetic */ DragAndDropModifierNode d;

        /* renamed from: androidx.compose.foundation.draganddrop.DragAndDropSourceNode$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public final class C00091 implements DragAndDropSourceScope, PointerInputScope {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ PointerInputScope f2998a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DragAndDropModifierNode f2999b;

            public C00091(PointerInputScope pointerInputScope, DragAndDropModifierNode dragAndDropModifierNode) {
                this.f2999b = dragAndDropModifierNode;
                this.f2998a = pointerInputScope;
            }

            @Override // androidx.compose.ui.unit.Density
            public final int C1(long j2) {
                return this.f2998a.C1(j2);
            }

            @Override // androidx.compose.ui.unit.Density
            public final int F0(float f2) {
                return this.f2998a.F0(f2);
            }

            @Override // androidx.compose.ui.unit.Density
            public final float H(int i2) {
                return this.f2998a.H(i2);
            }

            @Override // androidx.compose.ui.unit.Density
            public final float I(float f2) {
                return this.f2998a.I(f2);
            }

            @Override // androidx.compose.ui.unit.Density
            public final float J0(long j2) {
                return this.f2998a.J0(j2);
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputScope
            public final Object K1(p pVar, g gVar) {
                return this.f2998a.K1(pVar, gVar);
            }

            @Override // androidx.compose.ui.unit.Density
            public final long L(long j2) {
                return this.f2998a.L(j2);
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputScope
            public final void b0() {
                this.f2998a.b0();
            }

            @Override // androidx.compose.ui.unit.Density
            public final float getDensity() {
                return this.f2998a.getDensity();
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputScope
            public final ViewConfiguration getViewConfiguration() {
                return this.f2998a.getViewConfiguration();
            }

            @Override // androidx.compose.ui.unit.FontScaling
            public final long o(float f2) {
                return this.f2998a.o(f2);
            }

            @Override // androidx.compose.ui.unit.Density
            public final long p(long j2) {
                return this.f2998a.p(j2);
            }

            @Override // androidx.compose.ui.unit.FontScaling
            public final float r(long j2) {
                return this.f2998a.r(j2);
            }

            @Override // androidx.compose.ui.unit.Density
            public final long u(float f2) {
                return this.f2998a.u(f2);
            }

            @Override // androidx.compose.ui.unit.FontScaling
            public final float x1() {
                return this.f2998a.x1();
            }

            @Override // androidx.compose.ui.unit.Density
            public final float y1(float f2) {
                return this.f2998a.y1(f2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DragAndDropModifierNode dragAndDropModifierNode, g gVar) {
            super(2, gVar);
            this.d = dragAndDropModifierNode;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.d, gVar);
            anonymousClass1.f2996b = obj;
            return anonymousClass1;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((PointerInputScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f30806a;
            int i2 = this.f2995a;
            if (i2 == 0) {
                q.m(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.f2996b;
                p pVar = DragAndDropSourceNode.this.f2994q;
                C00091 c00091 = new C00091(pointerInputScope, this.d);
                this.f2995a = 1;
                if (pVar.invoke(c00091, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.m(obj);
            }
            return b0.f30125a;
        }
    }

    public DragAndDropSourceNode(p pVar) {
        this.f2994q = pVar;
        DragAndDropNode a2 = DragAndDropNodeKt.a();
        e2(a2);
        e2(SuspendingPointerInputFilterKt.a(new AnonymousClass1(a2, null)));
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void n(long j2) {
    }
}
