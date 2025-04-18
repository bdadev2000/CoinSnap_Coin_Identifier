package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import h0.g;
import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", l = {558}, m = "processDragStop")
/* loaded from: classes2.dex */
public final class DragGestureNode$processDragStop$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public DragGestureNode f3325a;

    /* renamed from: b, reason: collision with root package name */
    public DragEvent.DragStopped f3326b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3327c;
    public final /* synthetic */ DragGestureNode d;

    /* renamed from: f, reason: collision with root package name */
    public int f3328f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$processDragStop$1(DragGestureNode dragGestureNode, g gVar) {
        super(gVar);
        this.d = dragGestureNode;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f3327c = obj;
        this.f3328f |= Integer.MIN_VALUE;
        return DragGestureNode.j2(this.d, null, this);
    }
}
