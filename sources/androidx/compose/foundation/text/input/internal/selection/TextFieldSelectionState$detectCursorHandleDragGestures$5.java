package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.pointer.PointerInputChange;
import d0.b0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TextFieldSelectionState$detectCursorHandleDragGestures$5 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f6782a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6783b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f6784c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectCursorHandleDragGestures$5(TextFieldSelectionState textFieldSelectionState, e0 e0Var, e0 e0Var2) {
        super(2);
        this.f6782a = e0Var;
        this.f6783b = textFieldSelectionState;
        this.f6784c = e0Var2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        PointerInputChange pointerInputChange = (PointerInputChange) obj;
        long j2 = ((Offset) obj2).f14913a;
        e0 e0Var = this.f6782a;
        long k2 = Offset.k(e0Var.f30927a, j2);
        e0Var.f30927a = k2;
        Handle handle = Handle.f5964a;
        long k3 = Offset.k(this.f6784c.f30927a, k2);
        TextFieldSelectionState textFieldSelectionState = this.f6783b;
        textFieldSelectionState.C(handle, k3);
        if (TextFieldSelectionState.c(textFieldSelectionState, textFieldSelectionState.p())) {
            pointerInputChange.a();
            HapticFeedback hapticFeedback = textFieldSelectionState.f6719h;
            if (hapticFeedback != null) {
                hapticFeedback.a();
            }
        }
        return b0.f30125a;
    }
}
