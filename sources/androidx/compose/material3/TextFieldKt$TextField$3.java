package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.q;

/* loaded from: classes4.dex */
final class TextFieldKt$TextField$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f12113a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f12114b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextFieldColors f12115c;
    public final /* synthetic */ TextFieldValue d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f12116f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f12117g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f12118h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ TextStyle f12119i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ KeyboardOptions f12120j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ KeyboardActions f12121k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f12122l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f12123m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f12124n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ VisualTransformation f12125o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f12126p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ p f12127q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p f12128r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p f12129s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p f12130t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p f12131u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p f12132v;
    public final /* synthetic */ p w;
    public final /* synthetic */ Shape x;

    /* renamed from: androidx.compose.material3.TextFieldKt$TextField$3$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends r implements q {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextFieldValue f12133a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f12134b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f12135c;
        public final /* synthetic */ VisualTransformation d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f12136f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f12137g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ p f12138h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ p f12139i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ p f12140j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ p f12141k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ p f12142l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ p f12143m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ p f12144n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Shape f12145o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ TextFieldColors f12146p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableInteractionSource mutableInteractionSource, TextFieldColors textFieldColors, Shape shape, TextFieldValue textFieldValue, VisualTransformation visualTransformation, p pVar, p pVar2, p pVar3, p pVar4, p pVar5, p pVar6, p pVar7, boolean z2, boolean z3, boolean z4) {
            super(3);
            this.f12133a = textFieldValue;
            this.f12134b = z2;
            this.f12135c = z3;
            this.d = visualTransformation;
            this.f12136f = mutableInteractionSource;
            this.f12137g = z4;
            this.f12138h = pVar;
            this.f12139i = pVar2;
            this.f12140j = pVar3;
            this.f12141k = pVar4;
            this.f12142l = pVar5;
            this.f12143m = pVar6;
            this.f12144n = pVar7;
            this.f12145o = shape;
            this.f12146p = textFieldColors;
        }

        @Override // q0.q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            p pVar = (p) obj;
            Composer composer = (Composer) obj2;
            int intValue = ((Number) obj3).intValue();
            if ((intValue & 6) == 0) {
                intValue |= composer.w(pVar) ? 4 : 2;
            }
            if ((intValue & 19) == 18 && composer.i()) {
                composer.A();
            } else {
                TextFieldDefaults.f12006a.b(this.f12133a.f17361a.f16880a, pVar, this.f12134b, this.f12135c, this.d, this.f12136f, this.f12137g, this.f12138h, this.f12139i, this.f12140j, this.f12141k, this.f12142l, this.f12143m, this.f12144n, this.f12145o, this.f12146p, null, null, composer, (intValue << 3) & 112, 100663296, 196608);
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldKt$TextField$3(Modifier modifier, boolean z2, TextFieldColors textFieldColors, TextFieldValue textFieldValue, l lVar, boolean z3, boolean z4, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z5, int i2, int i3, VisualTransformation visualTransformation, MutableInteractionSource mutableInteractionSource, p pVar, p pVar2, p pVar3, p pVar4, p pVar5, p pVar6, p pVar7, Shape shape) {
        super(2);
        this.f12113a = modifier;
        this.f12114b = z2;
        this.f12115c = textFieldColors;
        this.d = textFieldValue;
        this.f12116f = lVar;
        this.f12117g = z3;
        this.f12118h = z4;
        this.f12119i = textStyle;
        this.f12120j = keyboardOptions;
        this.f12121k = keyboardActions;
        this.f12122l = z5;
        this.f12123m = i2;
        this.f12124n = i3;
        this.f12125o = visualTransformation;
        this.f12126p = mutableInteractionSource;
        this.f12127q = pVar;
        this.f12128r = pVar2;
        this.f12129s = pVar3;
        this.f12130t = pVar4;
        this.f12131u = pVar5;
        this.f12132v = pVar6;
        this.w = pVar7;
        this.x = shape;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            String a2 = Strings_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.default_error_message, composer);
            Modifier modifier = this.f12113a;
            boolean z2 = this.f12114b;
            Modifier a3 = SizeKt.a(TextFieldImplKt.f(modifier, z2, a2), TextFieldDefaults.f12008c, TextFieldDefaults.f12007b);
            TextFieldColors textFieldColors = this.f12115c;
            SolidColor solidColor = new SolidColor(z2 ? textFieldColors.f11991j : textFieldColors.f11990i);
            TextFieldValue textFieldValue = this.d;
            l lVar = this.f12116f;
            boolean z3 = this.f12117g;
            boolean z4 = this.f12118h;
            TextStyle textStyle = this.f12119i;
            KeyboardOptions keyboardOptions = this.f12120j;
            KeyboardActions keyboardActions = this.f12121k;
            boolean z5 = this.f12122l;
            int i2 = this.f12123m;
            int i3 = this.f12124n;
            VisualTransformation visualTransformation = this.f12125o;
            MutableInteractionSource mutableInteractionSource = this.f12126p;
            BasicTextFieldKt.b(textFieldValue, lVar, a3, z3, z4, textStyle, keyboardOptions, keyboardActions, z5, i2, i3, visualTransformation, null, mutableInteractionSource, solidColor, ComposableLambdaKt.c(1751957978, new AnonymousClass1(mutableInteractionSource, textFieldColors, this.x, textFieldValue, visualTransformation, this.f12127q, this.f12128r, this.f12129s, this.f12130t, this.f12131u, this.f12132v, this.w, z3, z5, this.f12114b), composer), composer, 0, 196608, 4096);
        }
        return b0.f30125a;
    }
}
