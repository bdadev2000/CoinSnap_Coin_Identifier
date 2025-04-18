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
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class OutlinedTextFieldKt$OutlinedTextField$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f10505a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f10506b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Density f10507c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TextFieldColors f10508f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ TextFieldValue f10509g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l f10510h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f10511i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f10512j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ TextStyle f10513k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ KeyboardOptions f10514l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ KeyboardActions f10515m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f10516n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f10517o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f10518p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ VisualTransformation f10519q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f10520r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p f10521s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p f10522t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p f10523u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p f10524v;
    public final /* synthetic */ p w;
    public final /* synthetic */ p x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Shape f10525y;

    /* renamed from: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$3$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f10526a = new r(1);

        @Override // q0.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b0.f30125a;
        }
    }

    /* renamed from: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$3$3, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass3 extends r implements q {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextFieldValue f10527a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f10528b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f10529c;
        public final /* synthetic */ VisualTransformation d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f10530f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f10531g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ p f10532h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ p f10533i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ p f10534j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ p f10535k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ p f10536l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ p f10537m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ p f10538n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ TextFieldColors f10539o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Shape f10540p;

        /* renamed from: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$3$3$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        final class AnonymousClass1 extends r implements p {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ boolean f10541a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean f10542b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ MutableInteractionSource f10543c;
            public final /* synthetic */ TextFieldColors d;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Shape f10544f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(boolean z2, boolean z3, MutableInteractionSource mutableInteractionSource, TextFieldColors textFieldColors, Shape shape) {
                super(2);
                this.f10541a = z2;
                this.f10542b = z3;
                this.f10543c = mutableInteractionSource;
                this.d = textFieldColors;
                this.f10544f = shape;
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
                    composer.A();
                } else {
                    OutlinedTextFieldDefaults.f10396a.a(this.f10541a, this.f10542b, this.f10543c, null, this.d, this.f10544f, 0.0f, 0.0f, composer, 100663296, 200);
                }
                return b0.f30125a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(MutableInteractionSource mutableInteractionSource, TextFieldColors textFieldColors, Shape shape, TextFieldValue textFieldValue, VisualTransformation visualTransformation, p pVar, p pVar2, p pVar3, p pVar4, p pVar5, p pVar6, p pVar7, boolean z2, boolean z3, boolean z4) {
            super(3);
            this.f10527a = textFieldValue;
            this.f10528b = z2;
            this.f10529c = z3;
            this.d = visualTransformation;
            this.f10530f = mutableInteractionSource;
            this.f10531g = z4;
            this.f10532h = pVar;
            this.f10533i = pVar2;
            this.f10534j = pVar3;
            this.f10535k = pVar4;
            this.f10536l = pVar5;
            this.f10537m = pVar6;
            this.f10538n = pVar7;
            this.f10539o = textFieldColors;
            this.f10540p = shape;
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
                OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.f10396a;
                String str = this.f10527a.f17361a.f16880a;
                boolean z2 = this.f10528b;
                boolean z3 = this.f10529c;
                VisualTransformation visualTransformation = this.d;
                MutableInteractionSource mutableInteractionSource = this.f10530f;
                boolean z4 = this.f10531g;
                p pVar2 = this.f10532h;
                p pVar3 = this.f10533i;
                p pVar4 = this.f10534j;
                p pVar5 = this.f10535k;
                p pVar6 = this.f10536l;
                p pVar7 = this.f10537m;
                p pVar8 = this.f10538n;
                TextFieldColors textFieldColors = this.f10539o;
                outlinedTextFieldDefaults.b(str, pVar, z2, z3, visualTransformation, mutableInteractionSource, z4, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, textFieldColors, null, ComposableLambdaKt.c(255570733, new AnonymousClass1(z2, z4, mutableInteractionSource, textFieldColors, this.f10540p), composer), composer, (intValue << 3) & 112, 14155776, 32768);
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutlinedTextFieldKt$OutlinedTextField$3(Modifier modifier, p pVar, Density density, boolean z2, TextFieldColors textFieldColors, TextFieldValue textFieldValue, l lVar, boolean z3, boolean z4, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z5, int i2, int i3, VisualTransformation visualTransformation, MutableInteractionSource mutableInteractionSource, p pVar2, p pVar3, p pVar4, p pVar5, p pVar6, p pVar7, Shape shape) {
        super(2);
        this.f10505a = modifier;
        this.f10506b = pVar;
        this.f10507c = density;
        this.d = z2;
        this.f10508f = textFieldColors;
        this.f10509g = textFieldValue;
        this.f10510h = lVar;
        this.f10511i = z3;
        this.f10512j = z4;
        this.f10513k = textStyle;
        this.f10514l = keyboardOptions;
        this.f10515m = keyboardActions;
        this.f10516n = z5;
        this.f10517o = i2;
        this.f10518p = i3;
        this.f10519q = visualTransformation;
        this.f10520r = mutableInteractionSource;
        this.f10521s = pVar2;
        this.f10522t = pVar3;
        this.f10523u = pVar4;
        this.f10524v = pVar5;
        this.w = pVar6;
        this.x = pVar7;
        this.f10525y = shape;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            Modifier modifier = Modifier.Companion.f14687a;
            if (this.f10506b != null) {
                modifier = PaddingKt.j(SemanticsModifierKt.b(modifier, true, AnonymousClass1.f10526a), 0.0f, this.f10507c.r(OutlinedTextFieldKt.f10442b), 0.0f, 0.0f, 13);
            }
            Modifier T0 = this.f10505a.T0(modifier);
            String a2 = Strings_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.default_error_message, composer);
            boolean z2 = this.d;
            Modifier a3 = SizeKt.a(TextFieldImplKt.f(T0, z2, a2), OutlinedTextFieldDefaults.f10398c, OutlinedTextFieldDefaults.f10397b);
            TextFieldColors textFieldColors = this.f10508f;
            SolidColor solidColor = new SolidColor(z2 ? textFieldColors.f11991j : textFieldColors.f11990i);
            TextFieldValue textFieldValue = this.f10509g;
            l lVar = this.f10510h;
            boolean z3 = this.f10511i;
            boolean z4 = this.f10512j;
            TextStyle textStyle = this.f10513k;
            KeyboardOptions keyboardOptions = this.f10514l;
            KeyboardActions keyboardActions = this.f10515m;
            boolean z5 = this.f10516n;
            int i2 = this.f10517o;
            int i3 = this.f10518p;
            VisualTransformation visualTransformation = this.f10519q;
            MutableInteractionSource mutableInteractionSource = this.f10520r;
            BasicTextFieldKt.b(textFieldValue, lVar, a3, z3, z4, textStyle, keyboardOptions, keyboardActions, z5, i2, i3, visualTransformation, null, mutableInteractionSource, solidColor, ComposableLambdaKt.c(-757328870, new AnonymousClass3(mutableInteractionSource, textFieldColors, this.f10525y, textFieldValue, visualTransformation, this.f10506b, this.f10521s, this.f10522t, this.f10523u, this.f10524v, this.w, this.x, z3, z5, this.d), composer), composer, 0, 196608, 4096);
        }
        return b0.f30125a;
    }
}
