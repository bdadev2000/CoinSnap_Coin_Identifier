package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.InputTransformationKt;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.TextStyle;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes4.dex */
final class BasicSecureTextFieldKt$BasicSecureTextField$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldState f5420a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f5421b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5422c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InputTransformation f5423f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SecureTextFieldController f5424g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ TextStyle f5425h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ KeyboardOptions f5426i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ KeyboardActionHandler f5427j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p f5428k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f5429l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Brush f5430m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ CodepointTransformation f5431n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ TextFieldDecorator f5432o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicSecureTextFieldKt$BasicSecureTextField$3(TextFieldState textFieldState, Modifier modifier, boolean z2, boolean z3, InputTransformation inputTransformation, SecureTextFieldController secureTextFieldController, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, p pVar, MutableInteractionSource mutableInteractionSource, Brush brush, CodepointTransformation codepointTransformation, TextFieldDecorator textFieldDecorator) {
        super(2);
        this.f5420a = textFieldState;
        this.f5421b = modifier;
        this.f5422c = z2;
        this.d = z3;
        this.f5423f = inputTransformation;
        this.f5424g = secureTextFieldController;
        this.f5425h = textStyle;
        this.f5426i = keyboardOptions;
        this.f5427j = keyboardActionHandler;
        this.f5428k = pVar;
        this.f5429l = mutableInteractionSource;
        this.f5430m = brush;
        this.f5431n = codepointTransformation;
        this.f5432o = textFieldDecorator;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            TextFieldState textFieldState = this.f5420a;
            Modifier modifier = this.f5421b;
            boolean z2 = this.f5422c;
            boolean z3 = this.d;
            InputTransformation inputTransformation = this.f5423f;
            if (z3) {
                PasswordInputTransformation passwordInputTransformation = this.f5424g.f6096b;
                if (inputTransformation == null) {
                    inputTransformation = passwordInputTransformation;
                } else if (passwordInputTransformation != null) {
                    inputTransformation = InputTransformationKt.a(inputTransformation, passwordInputTransformation);
                }
            }
            BasicTextFieldKt.a(textFieldState, modifier, z2, false, inputTransformation, this.f5425h, this.f5426i, this.f5427j, TextFieldLineLimits.SingleLine.f6305b, this.f5428k, this.f5429l, this.f5430m, this.f5431n, null, this.f5432o, null, true, composer, 100666368, 1572864, 40960);
        }
        return b0.f30125a;
    }
}
