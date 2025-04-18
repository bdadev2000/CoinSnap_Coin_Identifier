package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.h;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2", f = "ForEachGesture.kt", l = {77}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ForEachGestureKt$awaitAllPointersUp$2 extends h implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f3381a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3382b;

    /* JADX WARN: Type inference failed for: r0v0, types: [j0.h, h0.g, androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2] */
    @Override // j0.a
    public final g create(Object obj, g gVar) {
        ?? hVar = new h(gVar);
        hVar.f3382b = obj;
        return hVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ForEachGestureKt$awaitAllPointersUp$2) create((AwaitPointerEventScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f3381a;
        if (i2 == 0) {
            q.m(obj);
            AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.f3382b;
            this.f3381a = 1;
            if (ForEachGestureKt.a(awaitPointerEventScope, this) == aVar) {
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
