package androidx.compose.foundation.text;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes3.dex */
final class BasicTextFieldKt$BasicTextField$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldState f5461a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f5462b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5463c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InputTransformation f5464f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ TextStyle f5465g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ KeyboardOptions f5466h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ KeyboardActionHandler f5467i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ TextFieldLineLimits f5468j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p f5469k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f5470l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Brush f5471m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ OutputTransformation f5472n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ TextFieldDecorator f5473o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ScrollState f5474p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f5475q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5476r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f5477s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$BasicTextField$1(TextFieldState textFieldState, Modifier modifier, boolean z2, boolean z3, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, TextFieldLineLimits textFieldLineLimits, p pVar, MutableInteractionSource mutableInteractionSource, Brush brush, OutputTransformation outputTransformation, TextFieldDecorator textFieldDecorator, ScrollState scrollState, int i2, int i3, int i4) {
        super(2);
        this.f5461a = textFieldState;
        this.f5462b = modifier;
        this.f5463c = z2;
        this.d = z3;
        this.f5464f = inputTransformation;
        this.f5465g = textStyle;
        this.f5466h = keyboardOptions;
        this.f5467i = keyboardActionHandler;
        this.f5468j = textFieldLineLimits;
        this.f5469k = pVar;
        this.f5470l = mutableInteractionSource;
        this.f5471m = brush;
        this.f5472n = outputTransformation;
        this.f5473o = textFieldDecorator;
        this.f5474p = scrollState;
        this.f5475q = i2;
        this.f5476r = i3;
        this.f5477s = i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0285  */
    @Override // q0.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r41, java.lang.Object r42) {
        /*
            Method dump skipped, instructions count: 832
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
