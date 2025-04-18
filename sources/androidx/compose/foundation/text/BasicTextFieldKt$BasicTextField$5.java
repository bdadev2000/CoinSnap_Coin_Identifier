package androidx.compose.foundation.text;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.TextStyle;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class BasicTextFieldKt$BasicTextField$5 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldState f5574a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f5575b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5576c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InputTransformation f5577f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ TextStyle f5578g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ KeyboardOptions f5579h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ KeyboardActionHandler f5580i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ TextFieldLineLimits f5581j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p f5582k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f5583l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Brush f5584m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ CodepointTransformation f5585n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ OutputTransformation f5586o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ TextFieldDecorator f5587p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ ScrollState f5588q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f5589r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f5590s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f5591t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f5592u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$BasicTextField$5(TextFieldState textFieldState, Modifier modifier, boolean z2, boolean z3, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, TextFieldLineLimits textFieldLineLimits, p pVar, MutableInteractionSource mutableInteractionSource, Brush brush, CodepointTransformation codepointTransformation, OutputTransformation outputTransformation, TextFieldDecorator textFieldDecorator, ScrollState scrollState, boolean z4, int i2, int i3, int i4) {
        super(2);
        this.f5574a = textFieldState;
        this.f5575b = modifier;
        this.f5576c = z2;
        this.d = z3;
        this.f5577f = inputTransformation;
        this.f5578g = textStyle;
        this.f5579h = keyboardOptions;
        this.f5580i = keyboardActionHandler;
        this.f5581j = textFieldLineLimits;
        this.f5582k = pVar;
        this.f5583l = mutableInteractionSource;
        this.f5584m = brush;
        this.f5585n = codepointTransformation;
        this.f5586o = outputTransformation;
        this.f5587p = textFieldDecorator;
        this.f5588q = scrollState;
        this.f5589r = z4;
        this.f5590s = i2;
        this.f5591t = i3;
        this.f5592u = i4;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        BasicTextFieldKt.a(this.f5574a, this.f5575b, this.f5576c, this.d, this.f5577f, this.f5578g, this.f5579h, this.f5580i, this.f5581j, this.f5582k, this.f5583l, this.f5584m, this.f5585n, this.f5586o, this.f5587p, this.f5588q, this.f5589r, (Composer) obj, RecomposeScopeImplKt.a(this.f5590s | 1), RecomposeScopeImplKt.a(this.f5591t), this.f5592u);
        return b0.f30125a;
    }
}
