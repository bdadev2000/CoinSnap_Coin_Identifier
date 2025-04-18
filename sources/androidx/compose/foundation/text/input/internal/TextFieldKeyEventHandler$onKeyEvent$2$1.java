package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelection;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class TextFieldKeyEventHandler$onKeyEvent$2$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final TextFieldKeyEventHandler$onKeyEvent$2$1 f6614a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        TextFieldPreparedSelection textFieldPreparedSelection = (TextFieldPreparedSelection) obj;
        textFieldPreparedSelection.d.f6713a = Float.NaN;
        if (textFieldPreparedSelection.f6712g.length() > 0) {
            if (textFieldPreparedSelection.c()) {
                textFieldPreparedSelection.h();
            } else {
                textFieldPreparedSelection.f();
            }
        }
        return b0.f30125a;
    }
}
