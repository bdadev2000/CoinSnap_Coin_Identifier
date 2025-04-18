package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.VisualTransformation;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class BasicTextFieldKt$BasicTextField$9 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5599a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f5600b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f5601c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f5602f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ TextStyle f5603g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ KeyboardOptions f5604h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ KeyboardActions f5605i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f5606j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5607k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5608l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ VisualTransformation f5609m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l f5610n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f5611o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Brush f5612p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ q f5613q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5614r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f5615s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f5616t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$BasicTextField$9(String str, l lVar, Modifier modifier, boolean z2, boolean z3, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i2, int i3, VisualTransformation visualTransformation, l lVar2, MutableInteractionSource mutableInteractionSource, Brush brush, q qVar, int i4, int i5, int i6) {
        super(2);
        this.f5599a = str;
        this.f5600b = lVar;
        this.f5601c = modifier;
        this.d = z2;
        this.f5602f = z3;
        this.f5603g = textStyle;
        this.f5604h = keyboardOptions;
        this.f5605i = keyboardActions;
        this.f5606j = z4;
        this.f5607k = i2;
        this.f5608l = i3;
        this.f5609m = visualTransformation;
        this.f5610n = lVar2;
        this.f5611o = mutableInteractionSource;
        this.f5612p = brush;
        this.f5613q = qVar;
        this.f5614r = i4;
        this.f5615s = i5;
        this.f5616t = i6;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        BasicTextFieldKt.c(this.f5599a, this.f5600b, this.f5601c, this.d, this.f5602f, this.f5603g, this.f5604h, this.f5605i, this.f5606j, this.f5607k, this.f5608l, this.f5609m, this.f5610n, this.f5611o, this.f5612p, this.f5613q, (Composer) obj, RecomposeScopeImplKt.a(this.f5614r | 1), RecomposeScopeImplKt.a(this.f5615s), this.f5616t);
        return b0.f30125a;
    }
}
