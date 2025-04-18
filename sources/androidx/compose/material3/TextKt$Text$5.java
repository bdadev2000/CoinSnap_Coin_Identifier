package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import d0.b0;
import java.util.Map;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class TextKt$Text$5 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnnotatedString f12248a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f12249b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f12250c;
    public final /* synthetic */ long d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ FontStyle f12251f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ FontWeight f12252g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ FontFamily f12253h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f12254i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ TextDecoration f12255j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ TextAlign f12256k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f12257l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f12258m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f12259n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12260o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f12261p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Map f12262q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l f12263r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ TextStyle f12264s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f12265t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f12266u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f12267v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextKt$Text$5(AnnotatedString annotatedString, Modifier modifier, long j2, long j3, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j4, TextDecoration textDecoration, TextAlign textAlign, long j5, int i2, boolean z2, int i3, int i4, Map map, l lVar, TextStyle textStyle, int i5, int i6, int i7) {
        super(2);
        this.f12248a = annotatedString;
        this.f12249b = modifier;
        this.f12250c = j2;
        this.d = j3;
        this.f12251f = fontStyle;
        this.f12252g = fontWeight;
        this.f12253h = fontFamily;
        this.f12254i = j4;
        this.f12255j = textDecoration;
        this.f12256k = textAlign;
        this.f12257l = j5;
        this.f12258m = i2;
        this.f12259n = z2;
        this.f12260o = i3;
        this.f12261p = i4;
        this.f12262q = map;
        this.f12263r = lVar;
        this.f12264s = textStyle;
        this.f12265t = i5;
        this.f12266u = i6;
        this.f12267v = i7;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        TextKt.c(this.f12248a, this.f12249b, this.f12250c, this.d, this.f12251f, this.f12252g, this.f12253h, this.f12254i, this.f12255j, this.f12256k, this.f12257l, this.f12258m, this.f12259n, this.f12260o, this.f12261p, this.f12262q, this.f12263r, this.f12264s, (Composer) obj, RecomposeScopeImplKt.a(this.f12265t | 1), RecomposeScopeImplKt.a(this.f12266u), this.f12267v);
        return b0.f30125a;
    }
}
