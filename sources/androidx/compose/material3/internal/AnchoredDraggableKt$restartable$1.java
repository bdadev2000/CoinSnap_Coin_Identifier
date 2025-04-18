package androidx.compose.material3.internal;

import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.material3.internal.AnchoredDraggableKt", f = "AnchoredDraggable.kt", l = {713}, m = "restartable")
/* loaded from: classes4.dex */
public final class AnchoredDraggableKt$restartable$1<I> extends c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12802a;

    /* renamed from: b, reason: collision with root package name */
    public int f12803b;

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f12802a = obj;
        this.f12803b |= Integer.MIN_VALUE;
        return AnchoredDraggableKt.b(null, null, this);
    }
}
