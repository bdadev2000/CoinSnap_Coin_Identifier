package androidx.compose.foundation.text.selection;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import j0.c;
import j0.e;
import org.objectweb.asm.Opcodes;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", l = {158, Opcodes.PUTFIELD}, m = "mouseSelection")
/* loaded from: classes3.dex */
public final class SelectionGesturesKt$mouseSelection$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public AwaitPointerEventScope f7131a;

    /* renamed from: b, reason: collision with root package name */
    public MouseSelectionObserver f7132b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f7133c;
    public int d;

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f7133c = obj;
        this.d |= Integer.MIN_VALUE;
        return SelectionGesturesKt.b(null, null, null, null, this);
    }
}
