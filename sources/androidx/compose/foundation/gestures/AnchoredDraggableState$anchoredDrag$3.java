package androidx.compose.foundation.gestures;

import h0.g;
import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.AnchoredDraggableState", f = "AnchoredDraggable.kt", l = {880}, m = "anchoredDrag")
/* loaded from: classes3.dex */
public final class AnchoredDraggableState$anchoredDrag$3 extends c {

    /* renamed from: a, reason: collision with root package name */
    public AnchoredDraggableState f3081a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3082b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableState f3083c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$anchoredDrag$3(AnchoredDraggableState anchoredDraggableState, g gVar) {
        super(gVar);
        this.f3083c = anchoredDraggableState;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f3082b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f3083c.a(null, null, null, this);
    }
}
