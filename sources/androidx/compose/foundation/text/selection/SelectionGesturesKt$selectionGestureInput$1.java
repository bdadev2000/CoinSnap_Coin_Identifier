package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import d0.b0;
import h0.g;
import j0.e;
import j0.h;
import j0.i;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1", f = "SelectionGestures.kt", l = {104}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SelectionGesturesKt$selectionGestureInput$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f7141a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7142b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MouseSelectionObserver f7143c;
    public final /* synthetic */ TextDragObserver d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1", f = "SelectionGestures.kt", l = {105, 111, Opcodes.LREM}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends h implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f7144a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f7145b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MouseSelectionObserver f7146c;
        public final /* synthetic */ ClicksCounter d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ TextDragObserver f7147f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TextDragObserver textDragObserver, ClicksCounter clicksCounter, MouseSelectionObserver mouseSelectionObserver, g gVar) {
            super(gVar);
            this.f7146c = mouseSelectionObserver;
            this.d = clicksCounter;
            this.f7147f = textDragObserver;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f7147f, this.d, this.f7146c, gVar);
            anonymousClass1.f7145b = obj;
            return anonymousClass1;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((AwaitPointerEventScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            AwaitPointerEventScope awaitPointerEventScope;
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f7144a;
            if (i2 == 0) {
                q.m(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.f7145b;
                this.f7145b = awaitPointerEventScope;
                this.f7144a = 1;
                obj = SelectionGesturesKt.a(awaitPointerEventScope, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2 && i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q.m(obj);
                    return b0.f30125a;
                }
                awaitPointerEventScope = (AwaitPointerEventScope) this.f7145b;
                q.m(obj);
            }
            PointerEvent pointerEvent = (PointerEvent) obj;
            if (SelectionGesturesKt.h(pointerEvent) && (pointerEvent.f15571c & 33) != 0) {
                int size = pointerEvent.f15569a.size();
                for (int i3 = 0; i3 < size; i3++) {
                    if (!((PointerInputChange) r5.get(i3)).b()) {
                    }
                }
                this.f7145b = null;
                this.f7144a = 2;
                if (SelectionGesturesKt.b(awaitPointerEventScope, this.f7146c, this.d, pointerEvent, this) == aVar) {
                    return aVar;
                }
                return b0.f30125a;
            }
            if (!SelectionGesturesKt.h(pointerEvent)) {
                this.f7145b = null;
                this.f7144a = 3;
                if (SelectionGesturesKt.d(awaitPointerEventScope, this.f7147f, pointerEvent, this) == aVar) {
                    return aVar;
                }
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionGesturesKt$selectionGestureInput$1(MouseSelectionObserver mouseSelectionObserver, TextDragObserver textDragObserver, g gVar) {
        super(2, gVar);
        this.f7143c = mouseSelectionObserver;
        this.d = textDragObserver;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        SelectionGesturesKt$selectionGestureInput$1 selectionGesturesKt$selectionGestureInput$1 = new SelectionGesturesKt$selectionGestureInput$1(this.f7143c, this.d, gVar);
        selectionGesturesKt$selectionGestureInput$1.f7142b = obj;
        return selectionGesturesKt$selectionGestureInput$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((SelectionGesturesKt$selectionGestureInput$1) create((PointerInputScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f7141a;
        if (i2 == 0) {
            q.m(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.f7142b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.d, new ClicksCounter(pointerInputScope.getViewConfiguration()), this.f7143c, null);
            this.f7141a = 1;
            if (ForEachGestureKt.b(pointerInputScope, anonymousClass1, this) == aVar) {
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
