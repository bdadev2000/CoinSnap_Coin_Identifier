package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.input.VisualTransformation;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TextFieldDefaults$DecorationBox$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldDefaults f12030a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12031b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f12032c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f12033f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ VisualTransformation f12034g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InteractionSource f12035h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f12036i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f12037j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p f12038k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f12039l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p f12040m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p f12041n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p f12042o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p f12043p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Shape f12044q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ TextFieldColors f12045r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f12046s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p f12047t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f12048u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f12049v;
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDefaults$DecorationBox$2(TextFieldDefaults textFieldDefaults, String str, p pVar, boolean z2, boolean z3, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z4, p pVar2, p pVar3, p pVar4, p pVar5, p pVar6, p pVar7, p pVar8, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, p pVar9, int i2, int i3, int i4) {
        super(2);
        this.f12030a = textFieldDefaults;
        this.f12031b = str;
        this.f12032c = pVar;
        this.d = z2;
        this.f12033f = z3;
        this.f12034g = visualTransformation;
        this.f12035h = interactionSource;
        this.f12036i = z4;
        this.f12037j = pVar2;
        this.f12038k = pVar3;
        this.f12039l = pVar4;
        this.f12040m = pVar5;
        this.f12041n = pVar6;
        this.f12042o = pVar7;
        this.f12043p = pVar8;
        this.f12044q = shape;
        this.f12045r = textFieldColors;
        this.f12046s = paddingValues;
        this.f12047t = pVar9;
        this.f12048u = i2;
        this.f12049v = i3;
        this.w = i4;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.f12030a.b(this.f12031b, this.f12032c, this.d, this.f12033f, this.f12034g, this.f12035h, this.f12036i, this.f12037j, this.f12038k, this.f12039l, this.f12040m, this.f12041n, this.f12042o, this.f12043p, this.f12044q, this.f12045r, this.f12046s, this.f12047t, (Composer) obj, RecomposeScopeImplKt.a(this.f12048u | 1), RecomposeScopeImplKt.a(this.f12049v), this.w);
        return b0.f30125a;
    }
}
