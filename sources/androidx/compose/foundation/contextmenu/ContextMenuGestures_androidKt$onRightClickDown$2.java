package androidx.compose.foundation.contextmenu;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import d0.b0;
import h0.g;
import j0.e;
import j0.h;
import q0.l;
import q0.p;

@e(c = "androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$onRightClickDown$2", f = "ContextMenuGestures.android.kt", l = {53, 56}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ContextMenuGestures_androidKt$onRightClickDown$2 extends h implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f2931a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2932b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f2933c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextMenuGestures_androidKt$onRightClickDown$2(l lVar, g gVar) {
        super(gVar);
        this.f2933c = lVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        ContextMenuGestures_androidKt$onRightClickDown$2 contextMenuGestures_androidKt$onRightClickDown$2 = new ContextMenuGestures_androidKt$onRightClickDown$2(this.f2933c, gVar);
        contextMenuGestures_androidKt$onRightClickDown$2.f2932b = obj;
        return contextMenuGestures_androidKt$onRightClickDown$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ContextMenuGestures_androidKt$onRightClickDown$2) create((AwaitPointerEventScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0056  */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            i0.a r0 = i0.a.f30806a
            int r1 = r6.f2931a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.jvm.internal.q.m(r7)
            goto L52
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            java.lang.Object r1 = r6.f2932b
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.jvm.internal.q.m(r7)
            goto L33
        L20:
            kotlin.jvm.internal.q.m(r7)
            java.lang.Object r7 = r6.f2932b
            r1 = r7
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            r6.f2932b = r1
            r6.f2931a = r3
            java.lang.Object r7 = androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt.a(r1, r6)
            if (r7 != r0) goto L33
            return r0
        L33:
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            r7.a()
            androidx.compose.ui.geometry.Offset r3 = new androidx.compose.ui.geometry.Offset
            long r4 = r7.f15591c
            r3.<init>(r4)
            q0.l r7 = r6.f2933c
            r7.invoke(r3)
            r7 = 0
            r6.f2932b = r7
            r6.f2931a = r2
            androidx.compose.ui.input.pointer.PointerEventPass r7 = androidx.compose.ui.input.pointer.PointerEventPass.f15573b
            java.lang.Object r7 = androidx.compose.foundation.gestures.TapGestureDetectorKt.g(r1, r7, r6)
            if (r7 != r0) goto L52
            return r0
        L52:
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            if (r7 == 0) goto L59
            r7.a()
        L59:
            d0.b0 r7 = d0.b0.f30125a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$onRightClickDown$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
