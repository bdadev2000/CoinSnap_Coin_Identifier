package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.unit.Density;
import d0.b0;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class BasicTextFieldKt$BasicTextField$2$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransformedTextFieldState f5535a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputTransformation f5536b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f5537c;
    public final /* synthetic */ HapticFeedback d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ClipboardManager f5538f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ TextToolbar f5539g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Density f5540h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f5541i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f5542j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f5543k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$BasicTextField$2$1(TransformedTextFieldState transformedTextFieldState, InputTransformation inputTransformation, TextFieldSelectionState textFieldSelectionState, HapticFeedback hapticFeedback, ClipboardManager clipboardManager, TextToolbar textToolbar, Density density, boolean z2, boolean z3, boolean z4) {
        super(0);
        this.f5535a = transformedTextFieldState;
        this.f5536b = inputTransformation;
        this.f5537c = textFieldSelectionState;
        this.d = hapticFeedback;
        this.f5538f = clipboardManager;
        this.f5539g = textToolbar;
        this.f5540h = density;
        this.f5541i = z2;
        this.f5542j = z3;
        this.f5543k = z4;
    }

    @Override // q0.a
    public final Object invoke() {
        this.f5535a.f6652b = this.f5536b;
        TextFieldSelectionState textFieldSelectionState = this.f5537c;
        boolean z2 = this.f5541i;
        if (!z2) {
            textFieldSelectionState.u();
        }
        textFieldSelectionState.f6719h = this.d;
        textFieldSelectionState.f6721j = this.f5538f;
        textFieldSelectionState.f6720i = this.f5539g;
        textFieldSelectionState.f6716c = this.f5540h;
        textFieldSelectionState.d = z2;
        textFieldSelectionState.e = this.f5542j;
        textFieldSelectionState.f6718g = this.f5543k;
        return b0.f30125a;
    }
}
