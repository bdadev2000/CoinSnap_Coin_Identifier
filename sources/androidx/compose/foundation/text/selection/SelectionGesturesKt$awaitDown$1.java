package androidx.compose.foundation.text.selection;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", l = {425}, m = "awaitDown")
/* loaded from: classes4.dex */
public final class SelectionGesturesKt$awaitDown$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public AwaitPointerEventScope f7128a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7129b;

    /* renamed from: c, reason: collision with root package name */
    public int f7130c;

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f7129b = obj;
        this.f7130c |= Integer.MIN_VALUE;
        return SelectionGesturesKt.a(null, this);
    }
}
