package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import b1.d0;
import d0.b0;
import d1.f;
import h0.g;
import j0.e;
import j0.i;
import java.util.concurrent.CancellationException;
import q0.a;
import q0.l;
import q0.p;
import q0.q;

@e(c = "androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1", f = "Draggable.kt", l = {524}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DragGestureNode$initializePointerInputNode$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f3298a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3299b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DragGestureNode f3300c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$1", f = "Draggable.kt", l = {526}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f3301a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f3302b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ DragGestureNode f3303c;
        public final /* synthetic */ PointerInputScope d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ q f3304f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ l f3305g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ a f3306h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ a f3307i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ p f3308j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DragGestureNode dragGestureNode, PointerInputScope pointerInputScope, q qVar, l lVar, a aVar, a aVar2, p pVar, g gVar) {
            super(2, gVar);
            this.f3303c = dragGestureNode;
            this.d = pointerInputScope;
            this.f3304f = qVar;
            this.f3305g = lVar;
            this.f3306h = aVar;
            this.f3307i = aVar2;
            this.f3308j = pVar;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f3303c, this.d, this.f3304f, this.f3305g, this.f3306h, this.f3307i, this.f3308j, gVar);
            anonymousClass1.f3302b = obj;
            return anonymousClass1;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1, types: [b1.d0] */
        /* JADX WARN: Type inference failed for: r2v11, types: [b1.d0] */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v6 */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.jvm.internal.e0, java.lang.Object] */
        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            ?? r2 = this.f3301a;
            b0 b0Var = b0.f30125a;
            DragGestureNode dragGestureNode = this.f3303c;
            try {
                if (r2 == 0) {
                    kotlin.jvm.internal.q.m(obj);
                    d0 d0Var = (d0) this.f3302b;
                    Orientation orientation = dragGestureNode.f3292q;
                    PointerInputScope pointerInputScope = this.d;
                    q qVar = this.f3304f;
                    l lVar = this.f3305g;
                    a aVar2 = this.f3306h;
                    a aVar3 = this.f3307i;
                    p pVar = this.f3308j;
                    this.f3302b = d0Var;
                    this.f3301a = 1;
                    float f2 = DragGestureDetectorKt.f3174a;
                    Object b2 = ForEachGestureKt.b(pointerInputScope, new DragGestureDetectorKt$detectDragGestures$9(aVar3, new Object(), orientation, qVar, pVar, aVar2, lVar, null), this);
                    r2 = b2;
                    if (b2 != aVar) {
                        r2 = b0Var;
                    }
                    if (r2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (r2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r2 = (d0) this.f3302b;
                    kotlin.jvm.internal.q.m(obj);
                }
            } catch (CancellationException e) {
                f fVar = dragGestureNode.f3296u;
                if (fVar != null) {
                    fVar.b(DragEvent.DragCancelled.f3170a);
                }
                if (!p0.a.n0(r2)) {
                    throw e;
                }
            }
            return b0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$initializePointerInputNode$1(DragGestureNode dragGestureNode, g gVar) {
        super(2, gVar);
        this.f3300c = dragGestureNode;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        DragGestureNode$initializePointerInputNode$1 dragGestureNode$initializePointerInputNode$1 = new DragGestureNode$initializePointerInputNode$1(this.f3300c, gVar);
        dragGestureNode$initializePointerInputNode$1.f3299b = obj;
        return dragGestureNode$initializePointerInputNode$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((DragGestureNode$initializePointerInputNode$1) create((PointerInputScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f3298a;
        if (i2 == 0) {
            kotlin.jvm.internal.q.m(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.f3299b;
            VelocityTracker velocityTracker = new VelocityTracker();
            DragGestureNode dragGestureNode = this.f3300c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dragGestureNode, pointerInputScope, new DragGestureNode$initializePointerInputNode$1$onDragStart$1(dragGestureNode, velocityTracker), new DragGestureNode$initializePointerInputNode$1$onDragEnd$1(dragGestureNode, velocityTracker), new DragGestureNode$initializePointerInputNode$1$onDragCancel$1(dragGestureNode), new DragGestureNode$initializePointerInputNode$1$shouldAwaitTouchSlop$1(dragGestureNode), new DragGestureNode$initializePointerInputNode$1$onDrag$1(dragGestureNode, velocityTracker), null);
            this.f3298a = 1;
            if (p0.a.J(anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.jvm.internal.q.m(obj);
        }
        return b0.f30125a;
    }
}
