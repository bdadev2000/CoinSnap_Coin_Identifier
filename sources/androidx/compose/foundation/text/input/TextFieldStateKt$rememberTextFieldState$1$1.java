package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.internal.undo.UndoManager;
import e0.w;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
final class TextFieldStateKt$rememberTextFieldState$1$1 extends r implements q0.a {
    @Override // q0.a
    public final Object invoke() {
        w wVar = w.f30218a;
        return new TextFieldState(null, 0L, new TextUndoManager(null, new UndoManager(wVar, wVar, 100)));
    }
}
