package androidx.compose.foundation.text.selection;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", l = {351, 377}, m = "mouseSelectionBtf2")
/* loaded from: classes4.dex */
public final class SelectionGesturesKt$mouseSelectionBtf2$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public AwaitPointerEventScope f7136a;

    /* renamed from: b, reason: collision with root package name */
    public MouseSelectionObserver f7137b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f7138c;
    public int d;

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f7138c = obj;
        this.d |= Integer.MIN_VALUE;
        return SelectionGesturesKt.c(null, null, null, null, this);
    }
}
