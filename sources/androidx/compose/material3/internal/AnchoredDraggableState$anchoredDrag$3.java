package androidx.compose.material3.internal;

import h0.g;
import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.material3.internal.AnchoredDraggableState", f = "AnchoredDraggable.kt", l = {567}, m = "anchoredDrag")
/* loaded from: classes3.dex */
public final class AnchoredDraggableState$anchoredDrag$3 extends c {

    /* renamed from: a, reason: collision with root package name */
    public AnchoredDraggableState f12843a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12844b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableState f12845c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$anchoredDrag$3(AnchoredDraggableState anchoredDraggableState, g gVar) {
        super(gVar);
        this.f12845c = anchoredDraggableState;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f12844b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f12845c.b(null, null, null, this);
    }
}
