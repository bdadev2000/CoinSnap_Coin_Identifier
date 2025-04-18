package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.ui.geometry.Offset;
import d0.b0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TextFieldSelectionState$detectSelectionHandleDragGestures$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f6791a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6792b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f6793c;
    public final /* synthetic */ Handle d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e0 f6794f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectSelectionHandleDragGestures$2(Handle handle, TextFieldSelectionState textFieldSelectionState, e0 e0Var, e0 e0Var2, boolean z2) {
        super(1);
        this.f6791a = e0Var;
        this.f6792b = textFieldSelectionState;
        this.f6793c = z2;
        this.d = handle;
        this.f6794f = e0Var2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        long j2 = ((Offset) obj).f14913a;
        boolean z2 = this.f6793c;
        TextFieldSelectionState textFieldSelectionState = this.f6792b;
        long a2 = SelectionHandlesKt.a(textFieldSelectionState.q(z2));
        this.f6791a.f30927a = a2;
        textFieldSelectionState.C(this.d, a2);
        this.f6794f.f30927a = 0L;
        textFieldSelectionState.f6731t = -1;
        return b0.f30125a;
    }
}
