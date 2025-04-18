package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$contextMenuGestures$1", f = "ContextMenuGestures.android.kt", l = {44}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ContextMenuGestures_androidKt$contextMenuGestures$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f2927a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2928b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ContextMenuState f2929c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$contextMenuGestures$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ContextMenuState f2930a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ContextMenuState contextMenuState) {
            super(1);
            this.f2930a = contextMenuState;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            this.f2930a.f2956a.setValue(new ContextMenuState.Status.Open(((Offset) obj).f14913a));
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextMenuGestures_androidKt$contextMenuGestures$1(ContextMenuState contextMenuState, g gVar) {
        super(2, gVar);
        this.f2929c = contextMenuState;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        ContextMenuGestures_androidKt$contextMenuGestures$1 contextMenuGestures_androidKt$contextMenuGestures$1 = new ContextMenuGestures_androidKt$contextMenuGestures$1(this.f2929c, gVar);
        contextMenuGestures_androidKt$contextMenuGestures$1.f2928b = obj;
        return contextMenuGestures_androidKt$contextMenuGestures$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ContextMenuGestures_androidKt$contextMenuGestures$1) create((PointerInputScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f2927a;
        b0 b0Var = b0.f30125a;
        if (i2 == 0) {
            q.m(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.f2928b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f2929c);
            this.f2927a = 1;
            Object b2 = ForEachGestureKt.b(pointerInputScope, new ContextMenuGestures_androidKt$onRightClickDown$2(anonymousClass1, null), this);
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
