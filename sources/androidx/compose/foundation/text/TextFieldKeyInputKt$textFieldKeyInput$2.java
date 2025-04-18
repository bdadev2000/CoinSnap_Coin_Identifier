package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.r;
import q0.l;
import q0.q;
import x0.f;

/* loaded from: classes3.dex */
final class TextFieldKeyInputKt$textFieldKeyInput$2 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LegacyTextFieldState f6155a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f6156b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextFieldValue f6157c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f6158f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ OffsetMapping f6159g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ UndoManager f6160h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f6161i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f6162j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldKeyInputKt$textFieldKeyInput$2(LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z2, boolean z3, OffsetMapping offsetMapping, UndoManager undoManager, l lVar, int i2) {
        super(3);
        this.f6155a = legacyTextFieldState;
        this.f6156b = textFieldSelectionManager;
        this.f6157c = textFieldValue;
        this.d = z2;
        this.f6158f = z3;
        this.f6159g = offsetMapping;
        this.f6160h = undoManager;
        this.f6161i = lVar;
        this.f6162j = i2;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.J(851809892);
        Object u2 = composer.u();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
        if (u2 == composer$Companion$Empty$1) {
            u2 = new Object();
            composer.o(u2);
        }
        TextPreparedSelectionState textPreparedSelectionState = (TextPreparedSelectionState) u2;
        Object u3 = composer.u();
        if (u3 == composer$Companion$Empty$1) {
            u3 = new Object();
            composer.o(u3);
        }
        TextFieldKeyInput textFieldKeyInput = new TextFieldKeyInput(this.f6155a, this.f6156b, this.f6157c, this.d, this.f6158f, textPreparedSelectionState, this.f6159g, this.f6160h, (DeadKeyCombiner) u3, this.f6161i, this.f6162j);
        Modifier.Companion companion = Modifier.Companion.f14687a;
        boolean w = composer.w(textFieldKeyInput);
        Object u4 = composer.u();
        if (w || u4 == composer$Companion$Empty$1) {
            u4 = new n(1, textFieldKeyInput, TextFieldKeyInput.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
            composer.o(u4);
        }
        Modifier a2 = KeyInputModifierKt.a(companion, (l) ((f) u4));
        composer.D();
        return a2;
    }
}
