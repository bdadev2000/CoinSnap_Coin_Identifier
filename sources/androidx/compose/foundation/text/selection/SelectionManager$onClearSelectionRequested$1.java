package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

@e(c = "androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1", f = "SelectionManager.kt", l = {746}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SelectionManager$onClearSelectionRequested$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f7250a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7251b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SelectionManager f7252c;
    public final /* synthetic */ q0.a d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q0.a f7253a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(q0.a aVar) {
            super(1);
            this.f7253a = aVar;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            long j2 = ((Offset) obj).f14913a;
            this.f7253a.invoke();
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionManager$onClearSelectionRequested$1(SelectionManager selectionManager, q0.a aVar, g gVar) {
        super(2, gVar);
        this.f7252c = selectionManager;
        this.d = aVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        SelectionManager$onClearSelectionRequested$1 selectionManager$onClearSelectionRequested$1 = new SelectionManager$onClearSelectionRequested$1(this.f7252c, this.d, gVar);
        selectionManager$onClearSelectionRequested$1.f7251b = obj;
        return selectionManager$onClearSelectionRequested$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((SelectionManager$onClearSelectionRequested$1) create((PointerInputScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f7250a;
        b0 b0Var = b0.f30125a;
        if (i2 == 0) {
            q.m(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.f7251b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.d);
            this.f7250a = 1;
            this.f7252c.getClass();
            Object b2 = ForEachGestureKt.b(pointerInputScope, new SelectionManager$detectNonConsumingTap$2(anonymousClass1, null), this);
            if (b2 != aVar) {
                b2 = b0Var;
            }
            if (b2 == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0Var;
    }
}
