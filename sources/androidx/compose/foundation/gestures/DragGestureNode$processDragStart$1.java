package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.DragInteraction;
import h0.g;
import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", l = {548, 551}, m = "processDragStart")
/* loaded from: classes3.dex */
public final class DragGestureNode$processDragStart$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public DragGestureNode f3320a;

    /* renamed from: b, reason: collision with root package name */
    public DragEvent.DragStarted f3321b;

    /* renamed from: c, reason: collision with root package name */
    public DragInteraction.Start f3322c;
    public /* synthetic */ Object d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ DragGestureNode f3323f;

    /* renamed from: g, reason: collision with root package name */
    public int f3324g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$processDragStart$1(DragGestureNode dragGestureNode, g gVar) {
        super(gVar);
        this.f3323f = dragGestureNode;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f3324g |= Integer.MIN_VALUE;
        return DragGestureNode.i2(this.f3323f, null, this);
    }
}
