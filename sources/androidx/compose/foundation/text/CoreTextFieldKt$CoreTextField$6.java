package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class CoreTextFieldKt$CoreTextField$6 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldValue f5856a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f5857b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f5858c;
    public final /* synthetic */ TextStyle d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ VisualTransformation f5859f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f5860g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f5861h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Brush f5862i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f5863j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5864k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5865l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ImeOptions f5866m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ KeyboardActions f5867n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f5868o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f5869p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ q f5870q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5871r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f5872s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f5873t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$6(TextFieldValue textFieldValue, l lVar, Modifier modifier, TextStyle textStyle, VisualTransformation visualTransformation, l lVar2, MutableInteractionSource mutableInteractionSource, Brush brush, boolean z2, int i2, int i3, ImeOptions imeOptions, KeyboardActions keyboardActions, boolean z3, boolean z4, q qVar, int i4, int i5, int i6) {
        super(2);
        this.f5856a = textFieldValue;
        this.f5857b = lVar;
        this.f5858c = modifier;
        this.d = textStyle;
        this.f5859f = visualTransformation;
        this.f5860g = lVar2;
        this.f5861h = mutableInteractionSource;
        this.f5862i = brush;
        this.f5863j = z2;
        this.f5864k = i2;
        this.f5865l = i3;
        this.f5866m = imeOptions;
        this.f5867n = keyboardActions;
        this.f5868o = z3;
        this.f5869p = z4;
        this.f5870q = qVar;
        this.f5871r = i4;
        this.f5872s = i5;
        this.f5873t = i6;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        CoreTextFieldKt.a(this.f5856a, this.f5857b, this.f5858c, this.d, this.f5859f, this.f5860g, this.f5861h, this.f5862i, this.f5863j, this.f5864k, this.f5865l, this.f5866m, this.f5867n, this.f5868o, this.f5869p, this.f5870q, (Composer) obj, RecomposeScopeImplKt.a(this.f5871r | 1), RecomposeScopeImplKt.a(this.f5872s), this.f5873t);
        return b0.f30125a;
    }
}
