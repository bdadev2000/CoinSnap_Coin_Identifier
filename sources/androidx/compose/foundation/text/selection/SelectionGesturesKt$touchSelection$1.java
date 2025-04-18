package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", l = {124, 128}, m = "touchSelection")
/* loaded from: classes4.dex */
public final class SelectionGesturesKt$touchSelection$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public AwaitPointerEventScope f7152a;

    /* renamed from: b, reason: collision with root package name */
    public TextDragObserver f7153b;

    /* renamed from: c, reason: collision with root package name */
    public PointerInputChange f7154c;
    public /* synthetic */ Object d;

    /* renamed from: f, reason: collision with root package name */
    public int f7155f;

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f7155f |= Integer.MIN_VALUE;
        return SelectionGesturesKt.d(null, null, null, this);
    }
}
