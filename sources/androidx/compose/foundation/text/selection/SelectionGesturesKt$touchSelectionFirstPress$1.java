package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", l = {238, 241}, m = "touchSelectionFirstPress")
/* loaded from: classes2.dex */
public final class SelectionGesturesKt$touchSelectionFirstPress$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public AwaitPointerEventScope f7157a;

    /* renamed from: b, reason: collision with root package name */
    public TextDragObserver f7158b;

    /* renamed from: c, reason: collision with root package name */
    public PointerInputChange f7159c;
    public /* synthetic */ Object d;

    /* renamed from: f, reason: collision with root package name */
    public int f7160f;

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f7160f |= Integer.MIN_VALUE;
        return SelectionGesturesKt.e(null, null, null, this);
    }
}
