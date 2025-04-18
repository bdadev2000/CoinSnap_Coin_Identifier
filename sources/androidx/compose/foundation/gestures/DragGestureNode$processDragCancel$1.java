package androidx.compose.foundation.gestures;

import h0.g;
import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", l = {566}, m = "processDragCancel")
/* loaded from: classes3.dex */
public final class DragGestureNode$processDragCancel$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public DragGestureNode f3317a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3318b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DragGestureNode f3319c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$processDragCancel$1(DragGestureNode dragGestureNode, g gVar) {
        super(gVar);
        this.f3319c = dragGestureNode;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f3318b = obj;
        this.d |= Integer.MIN_VALUE;
        return DragGestureNode.h2(this.f3319c, this);
    }
}
