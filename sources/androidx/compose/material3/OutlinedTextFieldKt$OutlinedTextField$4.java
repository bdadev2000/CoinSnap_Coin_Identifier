package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class OutlinedTextFieldKt$OutlinedTextField$4 extends r implements p {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldValue f10545a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f10546b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f10547c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f10548f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ TextStyle f10549g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p f10550h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f10551i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f10552j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p f10553k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f10554l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p f10555m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p f10556n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f10557o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ VisualTransformation f10558p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ KeyboardOptions f10559q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ KeyboardActions f10560r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f10561s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f10562t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f10563u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f10564v;
    public final /* synthetic */ Shape w;
    public final /* synthetic */ TextFieldColors x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f10565y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f10566z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutlinedTextFieldKt$OutlinedTextField$4(TextFieldValue textFieldValue, l lVar, Modifier modifier, boolean z2, boolean z3, TextStyle textStyle, p pVar, p pVar2, p pVar3, p pVar4, p pVar5, p pVar6, p pVar7, boolean z4, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z5, int i2, int i3, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i4, int i5, int i6, int i7) {
        super(2);
        this.f10545a = textFieldValue;
        this.f10546b = lVar;
        this.f10547c = modifier;
        this.d = z2;
        this.f10548f = z3;
        this.f10549g = textStyle;
        this.f10550h = pVar;
        this.f10551i = pVar2;
        this.f10552j = pVar3;
        this.f10553k = pVar4;
        this.f10554l = pVar5;
        this.f10555m = pVar6;
        this.f10556n = pVar7;
        this.f10557o = z4;
        this.f10558p = visualTransformation;
        this.f10559q = keyboardOptions;
        this.f10560r = keyboardActions;
        this.f10561s = z5;
        this.f10562t = i2;
        this.f10563u = i3;
        this.f10564v = mutableInteractionSource;
        this.w = shape;
        this.x = textFieldColors;
        this.f10565y = i4;
        this.f10566z = i5;
        this.A = i6;
        this.B = i7;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        OutlinedTextFieldKt.a(this.f10545a, this.f10546b, this.f10547c, this.d, this.f10548f, this.f10549g, this.f10550h, this.f10551i, this.f10552j, this.f10553k, this.f10554l, this.f10555m, this.f10556n, this.f10557o, this.f10558p, this.f10559q, this.f10560r, this.f10561s, this.f10562t, this.f10563u, this.f10564v, this.w, this.x, (Composer) obj, RecomposeScopeImplKt.a(this.f10565y | 1), RecomposeScopeImplKt.a(this.f10566z), RecomposeScopeImplKt.a(this.A), this.B);
        return b0.f30125a;
    }
}
