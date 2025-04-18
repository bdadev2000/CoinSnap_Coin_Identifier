package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import d0.b0;
import h0.g;
import j0.e;
import j0.h;
import kotlin.jvm.internal.q;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGesturePointerInputBtf2$2", f = "SelectionGestures.kt", l = {209, 217, 220, 221}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SelectionGesturesKt$selectionGesturePointerInputBtf2$2 extends h implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f7148a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7149b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ClicksCounter f7150c;
    public final /* synthetic */ MouseSelectionObserver d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TextDragObserver f7151f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionGesturesKt$selectionGesturePointerInputBtf2$2(TextDragObserver textDragObserver, ClicksCounter clicksCounter, MouseSelectionObserver mouseSelectionObserver, g gVar) {
        super(gVar);
        this.f7150c = clicksCounter;
        this.d = mouseSelectionObserver;
        this.f7151f = textDragObserver;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        SelectionGesturesKt$selectionGesturePointerInputBtf2$2 selectionGesturesKt$selectionGesturePointerInputBtf2$2 = new SelectionGesturesKt$selectionGesturePointerInputBtf2$2(this.f7151f, this.f7150c, this.d, gVar);
        selectionGesturesKt$selectionGesturePointerInputBtf2$2.f7149b = obj;
        return selectionGesturesKt$selectionGesturePointerInputBtf2$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((SelectionGesturesKt$selectionGesturePointerInputBtf2$2) create((AwaitPointerEventScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        AwaitPointerEventScope awaitPointerEventScope;
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f7148a;
        if (i2 == 0) {
            q.m(obj);
            awaitPointerEventScope = (AwaitPointerEventScope) this.f7149b;
            this.f7149b = awaitPointerEventScope;
            this.f7148a = 1;
            obj = SelectionGesturesKt.a(awaitPointerEventScope, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2 && i2 != 3 && i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.m(obj);
                return b0.f30125a;
            }
            awaitPointerEventScope = (AwaitPointerEventScope) this.f7149b;
            q.m(obj);
        }
        PointerEvent pointerEvent = (PointerEvent) obj;
        ClicksCounter clicksCounter = this.f7150c;
        clicksCounter.a(pointerEvent);
        boolean h2 = SelectionGesturesKt.h(pointerEvent);
        if (h2 && (pointerEvent.f15571c & 33) != 0) {
            int size = pointerEvent.f15569a.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (!((PointerInputChange) r9.get(i3)).b()) {
                }
            }
            this.f7149b = null;
            this.f7148a = 2;
            if (SelectionGesturesKt.c(awaitPointerEventScope, this.d, clicksCounter, pointerEvent, this) == aVar) {
                return aVar;
            }
            return b0.f30125a;
        }
        if (!h2) {
            int i4 = clicksCounter.f7051b;
            TextDragObserver textDragObserver = this.f7151f;
            if (i4 == 1) {
                this.f7149b = null;
                this.f7148a = 3;
                if (SelectionGesturesKt.e(awaitPointerEventScope, textDragObserver, pointerEvent, this) == aVar) {
                    return aVar;
                }
            } else {
                this.f7149b = null;
                this.f7148a = 4;
                if (SelectionGesturesKt.f(awaitPointerEventScope, textDragObserver, pointerEvent, this) == aVar) {
                    return aVar;
                }
            }
        }
        return b0.f30125a;
    }
}
