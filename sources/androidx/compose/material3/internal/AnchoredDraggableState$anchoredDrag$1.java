package androidx.compose.material3.internal;

import h0.g;
import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.material3.internal.AnchoredDraggableState", f = "AnchoredDraggable.kt", l = {520}, m = "anchoredDrag")
/* loaded from: classes3.dex */
public final class AnchoredDraggableState$anchoredDrag$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public AnchoredDraggableState f12833a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12834b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableState f12835c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$anchoredDrag$1(AnchoredDraggableState anchoredDraggableState, g gVar) {
        super(gVar);
        this.f12835c = anchoredDraggableState;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f12834b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f12835c.a(null, null, this);
    }
}
