package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import d0.b0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TextFieldSelectionState$detectCursorHandleDragGestures$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f6773a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6774b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f6775c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectCursorHandleDragGestures$2(TextFieldSelectionState textFieldSelectionState, e0 e0Var, e0 e0Var2) {
        super(1);
        this.f6773a = e0Var;
        this.f6774b = textFieldSelectionState;
        this.f6775c = e0Var2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        long j2 = ((Offset) obj).f14913a;
        TextFieldSelectionState textFieldSelectionState = this.f6774b;
        long a2 = SelectionHandlesKt.a(textFieldSelectionState.n().c());
        e0 e0Var = this.f6773a;
        e0Var.f30927a = a2;
        this.f6775c.f30927a = 0L;
        textFieldSelectionState.f6722k.setValue(Boolean.TRUE);
        LayoutCoordinates s2 = textFieldSelectionState.s();
        textFieldSelectionState.f6724m.setValue(new Offset(s2 != null ? s2.M(0L) : 9205357640488583168L));
        textFieldSelectionState.C(Handle.f5964a, e0Var.f30927a);
        return b0.f30125a;
    }
}
