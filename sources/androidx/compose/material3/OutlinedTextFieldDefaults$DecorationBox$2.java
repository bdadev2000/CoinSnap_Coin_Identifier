package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.text.input.VisualTransformation;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class OutlinedTextFieldDefaults$DecorationBox$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OutlinedTextFieldDefaults f10421a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10422b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f10423c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f10424f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ VisualTransformation f10425g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InteractionSource f10426h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f10427i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f10428j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p f10429k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f10430l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p f10431m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p f10432n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p f10433o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p f10434p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ TextFieldColors f10435q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f10436r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p f10437s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f10438t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f10439u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f10440v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutlinedTextFieldDefaults$DecorationBox$2(OutlinedTextFieldDefaults outlinedTextFieldDefaults, String str, p pVar, boolean z2, boolean z3, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z4, p pVar2, p pVar3, p pVar4, p pVar5, p pVar6, p pVar7, p pVar8, TextFieldColors textFieldColors, PaddingValues paddingValues, p pVar9, int i2, int i3, int i4) {
        super(2);
        this.f10421a = outlinedTextFieldDefaults;
        this.f10422b = str;
        this.f10423c = pVar;
        this.d = z2;
        this.f10424f = z3;
        this.f10425g = visualTransformation;
        this.f10426h = interactionSource;
        this.f10427i = z4;
        this.f10428j = pVar2;
        this.f10429k = pVar3;
        this.f10430l = pVar4;
        this.f10431m = pVar5;
        this.f10432n = pVar6;
        this.f10433o = pVar7;
        this.f10434p = pVar8;
        this.f10435q = textFieldColors;
        this.f10436r = paddingValues;
        this.f10437s = pVar9;
        this.f10438t = i2;
        this.f10439u = i3;
        this.f10440v = i4;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.f10421a.b(this.f10422b, this.f10423c, this.d, this.f10424f, this.f10425g, this.f10426h, this.f10427i, this.f10428j, this.f10429k, this.f10430l, this.f10431m, this.f10432n, this.f10433o, this.f10434p, this.f10435q, this.f10436r, this.f10437s, (Composer) obj, RecomposeScopeImplKt.a(this.f10438t | 1), RecomposeScopeImplKt.a(this.f10439u), this.f10440v);
        return b0.f30125a;
    }
}
