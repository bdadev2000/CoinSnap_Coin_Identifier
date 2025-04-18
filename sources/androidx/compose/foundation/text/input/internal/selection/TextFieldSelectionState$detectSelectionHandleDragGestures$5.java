package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import d0.b0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TextFieldSelectionState$detectSelectionHandleDragGestures$5 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f6801a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6802b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Handle f6803c;
    public final /* synthetic */ e0 d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f6804f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectSelectionHandleDragGestures$5(Handle handle, TextFieldSelectionState textFieldSelectionState, e0 e0Var, e0 e0Var2, boolean z2) {
        super(2);
        this.f6801a = e0Var;
        this.f6802b = textFieldSelectionState;
        this.f6803c = handle;
        this.d = e0Var2;
        this.f6804f = z2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        int e;
        long j2 = ((Offset) obj2).f14913a;
        e0 e0Var = this.f6801a;
        e0Var.f30927a = Offset.k(e0Var.f30927a, j2);
        TextFieldSelectionState textFieldSelectionState = this.f6802b;
        TextLayoutResult b2 = textFieldSelectionState.f6715b.b();
        if (b2 != null) {
            textFieldSelectionState.C(this.f6803c, Offset.k(this.d.f30927a, e0Var.f30927a));
            TransformedTextFieldState transformedTextFieldState = textFieldSelectionState.f6714a;
            boolean z2 = this.f6804f;
            MultiParagraph multiParagraph = b2.f17047b;
            if (z2) {
                i2 = multiParagraph.e(textFieldSelectionState.p());
            } else {
                long j3 = transformedTextFieldState.d().f6298b;
                int i3 = TextRange.f17057c;
                i2 = (int) (j3 >> 32);
            }
            int i4 = i2;
            if (z2) {
                long j4 = transformedTextFieldState.d().f6298b;
                int i5 = TextRange.f17057c;
                e = (int) (j4 & 4294967295L);
            } else {
                e = multiParagraph.e(textFieldSelectionState.p());
            }
            int i6 = e;
            long j5 = transformedTextFieldState.d().f6298b;
            long D = textFieldSelectionState.D(transformedTextFieldState.d(), i4, i6, this.f6804f, SelectionAdjustment.Companion.e, false, false);
            if (TextRange.c(j5) || !TextRange.c(D)) {
                transformedTextFieldState.j(D);
            }
        }
        return b0.f30125a;
    }
}
