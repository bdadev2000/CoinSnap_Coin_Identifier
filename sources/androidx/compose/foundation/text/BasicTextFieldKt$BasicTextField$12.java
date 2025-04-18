package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class BasicTextFieldKt$BasicTextField$12 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldValue f5481a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f5482b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f5483c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f5484f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ TextStyle f5485g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ KeyboardOptions f5486h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ KeyboardActions f5487i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f5488j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5489k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5490l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ VisualTransformation f5491m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l f5492n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f5493o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Brush f5494p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ q f5495q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5496r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f5497s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f5498t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$BasicTextField$12(TextFieldValue textFieldValue, l lVar, Modifier modifier, boolean z2, boolean z3, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i2, int i3, VisualTransformation visualTransformation, l lVar2, MutableInteractionSource mutableInteractionSource, Brush brush, q qVar, int i4, int i5, int i6) {
        super(2);
        this.f5481a = textFieldValue;
        this.f5482b = lVar;
        this.f5483c = modifier;
        this.d = z2;
        this.f5484f = z3;
        this.f5485g = textStyle;
        this.f5486h = keyboardOptions;
        this.f5487i = keyboardActions;
        this.f5488j = z4;
        this.f5489k = i2;
        this.f5490l = i3;
        this.f5491m = visualTransformation;
        this.f5492n = lVar2;
        this.f5493o = mutableInteractionSource;
        this.f5494p = brush;
        this.f5495q = qVar;
        this.f5496r = i4;
        this.f5497s = i5;
        this.f5498t = i6;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        BasicTextFieldKt.b(this.f5481a, this.f5482b, this.f5483c, this.d, this.f5484f, this.f5485g, this.f5486h, this.f5487i, this.f5488j, this.f5489k, this.f5490l, this.f5491m, this.f5492n, this.f5493o, this.f5494p, this.f5495q, (Composer) obj, RecomposeScopeImplKt.a(this.f5496r | 1), RecomposeScopeImplKt.a(this.f5497s), this.f5498t);
        return b0.f30125a;
    }
}
