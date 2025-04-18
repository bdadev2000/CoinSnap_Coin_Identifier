package androidx.compose.material3.internal;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.text.input.VisualTransformation;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TextFieldImplKt$CommonDecorationBox$4 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldType f13074a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13075b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f13076c;
    public final /* synthetic */ VisualTransformation d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f13077f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f13078g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p f13079h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f13080i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f13081j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p f13082k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f13083l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f13084m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f13085n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f13086o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InteractionSource f13087p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f13088q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ TextFieldColors f13089r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p f13090s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f13091t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f13092u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f13093v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$4(TextFieldType textFieldType, String str, p pVar, VisualTransformation visualTransformation, p pVar2, p pVar3, p pVar4, p pVar5, p pVar6, p pVar7, p pVar8, boolean z2, boolean z3, boolean z4, InteractionSource interactionSource, PaddingValues paddingValues, TextFieldColors textFieldColors, p pVar9, int i2, int i3, int i4) {
        super(2);
        this.f13074a = textFieldType;
        this.f13075b = str;
        this.f13076c = pVar;
        this.d = visualTransformation;
        this.f13077f = pVar2;
        this.f13078g = pVar3;
        this.f13079h = pVar4;
        this.f13080i = pVar5;
        this.f13081j = pVar6;
        this.f13082k = pVar7;
        this.f13083l = pVar8;
        this.f13084m = z2;
        this.f13085n = z3;
        this.f13086o = z4;
        this.f13087p = interactionSource;
        this.f13088q = paddingValues;
        this.f13089r = textFieldColors;
        this.f13090s = pVar9;
        this.f13091t = i2;
        this.f13092u = i3;
        this.f13093v = i4;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        TextFieldImplKt.a(this.f13074a, this.f13075b, this.f13076c, this.d, this.f13077f, this.f13078g, this.f13079h, this.f13080i, this.f13081j, this.f13082k, this.f13083l, this.f13084m, this.f13085n, this.f13086o, this.f13087p, this.f13088q, this.f13089r, this.f13090s, (Composer) obj, RecomposeScopeImplKt.a(this.f13091t | 1), RecomposeScopeImplKt.a(this.f13092u), this.f13093v);
        return b0.f30125a;
    }
}
