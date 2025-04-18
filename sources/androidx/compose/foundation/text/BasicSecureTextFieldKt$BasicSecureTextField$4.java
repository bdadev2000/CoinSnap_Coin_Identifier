package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes4.dex */
final class BasicSecureTextFieldKt$BasicSecureTextField$4 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldState f5433a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f5434b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5435c;
    public final /* synthetic */ InputTransformation d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TextStyle f5436f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ KeyboardOptions f5437g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ KeyboardActionHandler f5438h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f5439i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f5440j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Brush f5441k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TextFieldDecorator f5442l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f5443m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ char f5444n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f5445o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f5446p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f5447q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicSecureTextFieldKt$BasicSecureTextField$4(TextFieldState textFieldState, Modifier modifier, boolean z2, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, p pVar, MutableInteractionSource mutableInteractionSource, Brush brush, TextFieldDecorator textFieldDecorator, int i2, char c2, int i3, int i4, int i5) {
        super(2);
        this.f5433a = textFieldState;
        this.f5434b = modifier;
        this.f5435c = z2;
        this.d = inputTransformation;
        this.f5436f = textStyle;
        this.f5437g = keyboardOptions;
        this.f5438h = keyboardActionHandler;
        this.f5439i = pVar;
        this.f5440j = mutableInteractionSource;
        this.f5441k = brush;
        this.f5442l = textFieldDecorator;
        this.f5443m = i2;
        this.f5444n = c2;
        this.f5445o = i3;
        this.f5446p = i4;
        this.f5447q = i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0247 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0270 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x028e A[ADDED_TO_REGION] */
    @Override // q0.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r36, java.lang.Object r37) {
        /*
            Method dump skipped, instructions count: 784
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$4.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
