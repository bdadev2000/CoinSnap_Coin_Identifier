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
import androidx.compose.ui.text.input.VisualTransformation;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.q;

/* loaded from: classes4.dex */
final class TextFieldKt$TextField$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f12057a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f12058b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextFieldColors f12059c;
    public final /* synthetic */ String d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f12060f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f12061g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f12062h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ TextStyle f12063i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ KeyboardOptions f12064j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ KeyboardActions f12065k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f12066l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f12067m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f12068n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ VisualTransformation f12069o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f12070p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ p f12071q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p f12072r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p f12073s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p f12074t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p f12075u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p f12076v;
    public final /* synthetic */ p w;
    public final /* synthetic */ Shape x;

    /* renamed from: androidx.compose.material3.TextFieldKt$TextField$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends r implements q {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f12077a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f12078b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f12079c;
        public final /* synthetic */ VisualTransformation d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f12080f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f12081g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ p f12082h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ p f12083i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ p f12084j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ p f12085k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ p f12086l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ p f12087m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ p f12088n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Shape f12089o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ TextFieldColors f12090p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableInteractionSource mutableInteractionSource, TextFieldColors textFieldColors, Shape shape, VisualTransformation visualTransformation, String str, p pVar, p pVar2, p pVar3, p pVar4, p pVar5, p pVar6, p pVar7, boolean z2, boolean z3, boolean z4) {
            super(3);
            this.f12077a = str;
            this.f12078b = z2;
            this.f12079c = z3;
            this.d = visualTransformation;
            this.f12080f = mutableInteractionSource;
            this.f12081g = z4;
            this.f12082h = pVar;
            this.f12083i = pVar2;
            this.f12084j = pVar3;
            this.f12085k = pVar4;
            this.f12086l = pVar5;
            this.f12087m = pVar6;
            this.f12088n = pVar7;
            this.f12089o = shape;
            this.f12090p = textFieldColors;
        }

        @Override // q0.q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            p pVar = (p) obj;
            Composer composer = (Composer) obj2;
            int intValue = ((Number) obj3).intValue();
            if ((intValue & 6) == 0) {
                intValue |= composer.w(pVar) ? 4 : 2;
            }
            int i2 = intValue;
            if ((i2 & 19) == 18 && composer.i()) {
                composer.A();
            } else {
                TextFieldDefaults.f12006a.b(this.f12077a, pVar, this.f12078b, this.f12079c, this.d, this.f12080f, this.f12081g, this.f12082h, this.f12083i, this.f12084j, this.f12085k, this.f12086l, this.f12087m, this.f12088n, this.f12089o, this.f12090p, null, null, composer, (i2 << 3) & 112, 100663296, 196608);
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldKt$TextField$1(Modifier modifier, boolean z2, TextFieldColors textFieldColors, String str, l lVar, boolean z3, boolean z4, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z5, int i2, int i3, VisualTransformation visualTransformation, MutableInteractionSource mutableInteractionSource, p pVar, p pVar2, p pVar3, p pVar4, p pVar5, p pVar6, p pVar7, Shape shape) {
        super(2);
        this.f12057a = modifier;
        this.f12058b = z2;
        this.f12059c = textFieldColors;
        this.d = str;
        this.f12060f = lVar;
        this.f12061g = z3;
        this.f12062h = z4;
        this.f12063i = textStyle;
        this.f12064j = keyboardOptions;
        this.f12065k = keyboardActions;
        this.f12066l = z5;
        this.f12067m = i2;
        this.f12068n = i3;
        this.f12069o = visualTransformation;
        this.f12070p = mutableInteractionSource;
        this.f12071q = pVar;
        this.f12072r = pVar2;
        this.f12073s = pVar3;
        this.f12074t = pVar4;
        this.f12075u = pVar5;
        this.f12076v = pVar6;
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
            Modifier modifier = this.f12057a;
            boolean z2 = this.f12058b;
            Modifier a3 = SizeKt.a(TextFieldImplKt.f(modifier, z2, a2), TextFieldDefaults.f12008c, TextFieldDefaults.f12007b);
            TextFieldColors textFieldColors = this.f12059c;
            SolidColor solidColor = new SolidColor(z2 ? textFieldColors.f11991j : textFieldColors.f11990i);
            String str = this.d;
            l lVar = this.f12060f;
            boolean z3 = this.f12061g;
            boolean z4 = this.f12062h;
            TextStyle textStyle = this.f12063i;
            KeyboardOptions keyboardOptions = this.f12064j;
            KeyboardActions keyboardActions = this.f12065k;
            boolean z5 = this.f12066l;
            int i2 = this.f12067m;
            int i3 = this.f12068n;
            VisualTransformation visualTransformation = this.f12069o;
            MutableInteractionSource mutableInteractionSource = this.f12070p;
            BasicTextFieldKt.c(str, lVar, a3, z3, z4, textStyle, keyboardOptions, keyboardActions, z5, i2, i3, visualTransformation, null, mutableInteractionSource, solidColor, ComposableLambdaKt.c(-288211827, new AnonymousClass1(mutableInteractionSource, textFieldColors, this.x, visualTransformation, str, this.f12071q, this.f12072r, this.f12073s, this.f12074t, this.f12075u, this.f12076v, this.w, z3, z5, this.f12058b), composer), composer, 0, 196608, 4096);
        }
        return b0.f30125a;
    }
}
