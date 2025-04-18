package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class CoreTextFieldKt$CoreTextField$pointerModifier$2$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LegacyTextFieldState f5898a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FocusRequester f5899b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5900c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f5901f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ OffsetMapping f5902g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$pointerModifier$2$1(LegacyTextFieldState legacyTextFieldState, FocusRequester focusRequester, boolean z2, boolean z3, TextFieldSelectionManager textFieldSelectionManager, OffsetMapping offsetMapping) {
        super(1);
        this.f5898a = legacyTextFieldState;
        this.f5899b = focusRequester;
        this.f5900c = z2;
        this.d = z3;
        this.f5901f = textFieldSelectionManager;
        this.f5902g = offsetMapping;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SoftwareKeyboardController softwareKeyboardController;
        long j2 = ((Offset) obj).f14913a;
        boolean z2 = !this.f5900c;
        LegacyTextFieldState legacyTextFieldState = this.f5898a;
        if (!legacyTextFieldState.b()) {
            this.f5899b.b();
        } else if (z2 && (softwareKeyboardController = legacyTextFieldState.f6023c) != null) {
            softwareKeyboardController.show();
        }
        if (legacyTextFieldState.b() && this.d) {
            if (legacyTextFieldState.a() != HandleState.f5968b) {
                TextLayoutResultProxy d = legacyTextFieldState.d();
                if (d != null) {
                    l lVar = legacyTextFieldState.f6038t;
                    int a2 = this.f5902g.a(d.b(j2, true));
                    ((LegacyTextFieldState$onValueChange$1) lVar).invoke(TextFieldValue.a(legacyTextFieldState.d.f17320a, null, TextRangeKt.a(a2, a2), 5));
                    if (legacyTextFieldState.f6021a.f6107a.f16880a.length() > 0) {
                        legacyTextFieldState.f6029k.setValue(HandleState.f5969c);
                    }
                }
            } else {
                this.f5901f.g(new Offset(j2));
            }
        }
        return b0.f30125a;
    }
}
