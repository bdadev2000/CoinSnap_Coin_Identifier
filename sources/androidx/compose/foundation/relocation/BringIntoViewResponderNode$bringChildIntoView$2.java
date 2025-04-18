package androidx.compose.foundation.relocation;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.TraversableNodeKt;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import q0.a;
import q0.p;

@e(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2", f = "BringIntoViewResponder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class BringIntoViewResponderNode$bringChildIntoView$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5336a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BringIntoViewResponderNode f5337b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LayoutCoordinates f5338c;
    public final /* synthetic */ a d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a f5339f;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$1", f = "BringIntoViewResponder.kt", l = {196}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f5340a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ BringIntoViewResponderNode f5341b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LayoutCoordinates f5342c;
        public final /* synthetic */ a d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public final /* synthetic */ class C00201 extends o implements a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ BringIntoViewResponderNode f5343a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LayoutCoordinates f5344b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f5345c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00201(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, a aVar) {
                super(0, q.class, "localRect", "bringChildIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                this.f5343a = bringIntoViewResponderNode;
                this.f5344b = layoutCoordinates;
                this.f5345c = aVar;
            }

            @Override // q0.a
            public final Object invoke() {
                return BringIntoViewResponderNode.e2(this.f5343a, this.f5344b, this.f5345c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, a aVar, g gVar) {
            super(2, gVar);
            this.f5341b = bringIntoViewResponderNode;
            this.f5342c = layoutCoordinates;
            this.d = aVar;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass1(this.f5341b, this.f5342c, this.d, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f5340a;
            if (i2 == 0) {
                q.m(obj);
                BringIntoViewResponderNode bringIntoViewResponderNode = this.f5341b;
                BringIntoViewResponder bringIntoViewResponder = bringIntoViewResponderNode.f5334o;
                C00201 c00201 = new C00201(bringIntoViewResponderNode, this.f5342c, this.d);
                this.f5340a = 1;
                if (bringIntoViewResponder.Z(c00201, this) == aVar) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$2", f = "BringIntoViewResponder.kt", l = {207}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass2 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f5346a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ BringIntoViewResponderNode f5347b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f5348c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BringIntoViewResponderNode bringIntoViewResponderNode, a aVar, g gVar) {
            super(2, gVar);
            this.f5347b = bringIntoViewResponderNode;
            this.f5348c = aVar;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass2(this.f5347b, this.f5348c, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            BringIntoViewParent bringIntoViewParent;
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f5346a;
            if (i2 == 0) {
                q.m(obj);
                BringIntoViewResponderNode bringIntoViewResponderNode = this.f5347b;
                if (bringIntoViewResponderNode.f14699n) {
                    if (bringIntoViewResponderNode.f14688a.f14699n) {
                        bringIntoViewParent = (BringIntoViewParent) TraversableNodeKt.a(bringIntoViewResponderNode, BringIntoViewResponderNode.f5333q);
                        if (bringIntoViewParent == null) {
                            bringIntoViewParent = new BringIntoViewResponder_androidKt$defaultBringIntoViewParent$1(bringIntoViewResponderNode);
                        }
                    } else {
                        bringIntoViewParent = null;
                    }
                    if (bringIntoViewParent != null) {
                        NodeCoordinator e = DelegatableNodeKt.e(bringIntoViewResponderNode);
                        this.f5346a = 1;
                        if (bringIntoViewParent.z1(e, this.f5348c, this) == aVar) {
                            return aVar;
                        }
                    }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewResponderNode$bringChildIntoView$2(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, a aVar, a aVar2, g gVar) {
        super(2, gVar);
        this.f5337b = bringIntoViewResponderNode;
        this.f5338c = layoutCoordinates;
        this.d = aVar;
        this.f5339f = aVar2;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        BringIntoViewResponderNode$bringChildIntoView$2 bringIntoViewResponderNode$bringChildIntoView$2 = new BringIntoViewResponderNode$bringChildIntoView$2(this.f5337b, this.f5338c, this.d, this.f5339f, gVar);
        bringIntoViewResponderNode$bringChildIntoView$2.f5336a = obj;
        return bringIntoViewResponderNode$bringChildIntoView$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((BringIntoViewResponderNode$bringChildIntoView$2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        q.m(obj);
        d0 d0Var = (d0) this.f5336a;
        BringIntoViewResponderNode bringIntoViewResponderNode = this.f5337b;
        kotlin.jvm.internal.e.v(d0Var, null, 0, new AnonymousClass1(bringIntoViewResponderNode, this.f5338c, this.d, null), 3);
        return kotlin.jvm.internal.e.v(d0Var, null, 0, new AnonymousClass2(bringIntoViewResponderNode, this.f5339f, null), 3);
    }
}
