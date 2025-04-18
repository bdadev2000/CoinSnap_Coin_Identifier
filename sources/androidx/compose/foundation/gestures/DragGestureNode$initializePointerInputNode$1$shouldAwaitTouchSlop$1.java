package androidx.compose.foundation.gestures;

import kotlin.jvm.internal.r;
import q0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DragGestureNode$initializePointerInputNode$1$shouldAwaitTouchSlop$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DragGestureNode f3316a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$initializePointerInputNode$1$shouldAwaitTouchSlop$1(DragGestureNode dragGestureNode) {
        super(0);
        this.f3316a = dragGestureNode;
    }

    @Override // q0.a
    public final Object invoke() {
        return Boolean.valueOf(!this.f3316a.o2());
    }
}
