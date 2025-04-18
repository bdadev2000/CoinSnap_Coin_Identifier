package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.q;

/* loaded from: classes4.dex */
final class OutlinedTextFieldKt$OutlinedTextField$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f10443a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f10444b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Density f10445c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TextFieldColors f10446f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f10447g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l f10448h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f10449i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f10450j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ TextStyle f10451k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ KeyboardOptions f10452l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ KeyboardActions f10453m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f10454n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f10455o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f10456p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ VisualTransformation f10457q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f10458r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p f10459s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p f10460t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p f10461u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p f10462v;
    public final /* synthetic */ p w;
    public final /* synthetic */ p x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Shape f10463y;

    /* renamed from: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f10464a = new r(1);

        @Override // q0.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b0.f30125a;
        }
    }

    /* renamed from: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$1$3, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass3 extends r implements q {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f10465a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f10466b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f10467c;
        public final /* synthetic */ VisualTransformation d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f10468f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f10469g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ p f10470h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ p f10471i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ p f10472j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ p f10473k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ p f10474l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ p f10475m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ p f10476n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ TextFieldColors f10477o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Shape f10478p;

        /* renamed from: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$1$3$1, reason: invalid class name */
        /* loaded from: classes3.dex */
        final class AnonymousClass1 extends r implements p {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ boolean f10479a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean f10480b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ MutableInteractionSource f10481c;
            public final /* synthetic */ TextFieldColors d;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Shape f10482f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(boolean z2, boolean z3, MutableInteractionSource mutableInteractionSource, TextFieldColors textFieldColors, Shape shape) {
                super(2);
                this.f10479a = z2;
                this.f10480b = z3;
                this.f10481c = mutableInteractionSource;
                this.d = textFieldColors;
                this.f10482f = shape;
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
                    composer.A();
                } else {
                    OutlinedTextFieldDefaults.f10396a.a(this.f10479a, this.f10480b, this.f10481c, null, this.d, this.f10482f, 0.0f, 0.0f, composer, 100663296, 200);
                }
                return b0.f30125a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(MutableInteractionSource mutableInteractionSource, TextFieldColors textFieldColors, Shape shape, VisualTransformation visualTransformation, String str, p pVar, p pVar2, p pVar3, p pVar4, p pVar5, p pVar6, p pVar7, boolean z2, boolean z3, boolean z4) {
            super(3);
            this.f10465a = str;
            this.f10466b = z2;
            this.f10467c = z3;
            this.d = visualTransformation;
            this.f10468f = mutableInteractionSource;
            this.f10469g = z4;
            this.f10470h = pVar;
            this.f10471i = pVar2;
            this.f10472j = pVar3;
            this.f10473k = pVar4;
            this.f10474l = pVar5;
            this.f10475m = pVar6;
            this.f10476n = pVar7;
            this.f10477o = textFieldColors;
            this.f10478p = shape;
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
                OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.f10396a;
                String str = this.f10465a;
                boolean z2 = this.f10466b;
                boolean z3 = this.f10467c;
                VisualTransformation visualTransformation = this.d;
                MutableInteractionSource mutableInteractionSource = this.f10468f;
                boolean z4 = this.f10469g;
                p pVar2 = this.f10470h;
                p pVar3 = this.f10471i;
                p pVar4 = this.f10472j;
                p pVar5 = this.f10473k;
                p pVar6 = this.f10474l;
                p pVar7 = this.f10475m;
                p pVar8 = this.f10476n;
                TextFieldColors textFieldColors = this.f10477o;
                outlinedTextFieldDefaults.b(str, pVar, z2, z3, visualTransformation, mutableInteractionSource, z4, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, textFieldColors, null, ComposableLambdaKt.c(2108828640, new AnonymousClass1(z2, z4, mutableInteractionSource, textFieldColors, this.f10478p), composer), composer, (i2 << 3) & 112, 14155776, 32768);
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutlinedTextFieldKt$OutlinedTextField$1(Modifier modifier, p pVar, Density density, boolean z2, TextFieldColors textFieldColors, String str, l lVar, boolean z3, boolean z4, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z5, int i2, int i3, VisualTransformation visualTransformation, MutableInteractionSource mutableInteractionSource, p pVar2, p pVar3, p pVar4, p pVar5, p pVar6, p pVar7, Shape shape) {
        super(2);
        this.f10443a = modifier;
        this.f10444b = pVar;
        this.f10445c = density;
        this.d = z2;
        this.f10446f = textFieldColors;
        this.f10447g = str;
        this.f10448h = lVar;
        this.f10449i = z3;
        this.f10450j = z4;
        this.f10451k = textStyle;
        this.f10452l = keyboardOptions;
        this.f10453m = keyboardActions;
        this.f10454n = z5;
        this.f10455o = i2;
        this.f10456p = i3;
        this.f10457q = visualTransformation;
        this.f10458r = mutableInteractionSource;
        this.f10459s = pVar2;
        this.f10460t = pVar3;
        this.f10461u = pVar4;
        this.f10462v = pVar5;
        this.w = pVar6;
        this.x = pVar7;
        this.f10463y = shape;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            Modifier modifier = Modifier.Companion.f14687a;
            if (this.f10444b != null) {
                modifier = PaddingKt.j(SemanticsModifierKt.b(modifier, true, AnonymousClass1.f10464a), 0.0f, this.f10445c.r(OutlinedTextFieldKt.f10442b), 0.0f, 0.0f, 13);
            }
            Modifier T0 = this.f10443a.T0(modifier);
            String a2 = Strings_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.default_error_message, composer);
            boolean z2 = this.d;
            Modifier a3 = SizeKt.a(TextFieldImplKt.f(T0, z2, a2), OutlinedTextFieldDefaults.f10398c, OutlinedTextFieldDefaults.f10397b);
            TextFieldColors textFieldColors = this.f10446f;
            SolidColor solidColor = new SolidColor(z2 ? textFieldColors.f11991j : textFieldColors.f11990i);
            String str = this.f10447g;
            l lVar = this.f10448h;
            boolean z3 = this.f10449i;
            boolean z4 = this.f10450j;
            TextStyle textStyle = this.f10451k;
            KeyboardOptions keyboardOptions = this.f10452l;
            KeyboardActions keyboardActions = this.f10453m;
            boolean z5 = this.f10454n;
            int i2 = this.f10455o;
            int i3 = this.f10456p;
            VisualTransformation visualTransformation = this.f10457q;
            MutableInteractionSource mutableInteractionSource = this.f10458r;
            BasicTextFieldKt.c(str, lVar, a3, z3, z4, textStyle, keyboardOptions, keyboardActions, z5, i2, i3, visualTransformation, null, mutableInteractionSource, solidColor, ComposableLambdaKt.c(1474611661, new AnonymousClass3(mutableInteractionSource, textFieldColors, this.f10463y, visualTransformation, str, this.f10444b, this.f10459s, this.f10460t, this.f10461u, this.f10462v, this.w, this.x, z3, z5, this.d), composer), composer, 0, 196608, 4096);
        }
        return b0.f30125a;
    }
}
