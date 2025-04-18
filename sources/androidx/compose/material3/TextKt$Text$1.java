package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class TextKt$Text$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12209a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f12210b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f12211c;
    public final /* synthetic */ long d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ FontStyle f12212f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ FontWeight f12213g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ FontFamily f12214h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f12215i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ TextDecoration f12216j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ TextAlign f12217k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f12218l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f12219m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f12220n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12221o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f12222p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ l f12223q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ TextStyle f12224r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12225s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f12226t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f12227u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextKt$Text$1(String str, Modifier modifier, long j2, long j3, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j4, TextDecoration textDecoration, TextAlign textAlign, long j5, int i2, boolean z2, int i3, int i4, l lVar, TextStyle textStyle, int i5, int i6, int i7) {
        super(2);
        this.f12209a = str;
        this.f12210b = modifier;
        this.f12211c = j2;
        this.d = j3;
        this.f12212f = fontStyle;
        this.f12213g = fontWeight;
        this.f12214h = fontFamily;
        this.f12215i = j4;
        this.f12216j = textDecoration;
        this.f12217k = textAlign;
        this.f12218l = j5;
        this.f12219m = i2;
        this.f12220n = z2;
        this.f12221o = i3;
        this.f12222p = i4;
        this.f12223q = lVar;
        this.f12224r = textStyle;
        this.f12225s = i5;
        this.f12226t = i6;
        this.f12227u = i7;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        TextKt.b(this.f12209a, this.f12210b, this.f12211c, this.d, this.f12212f, this.f12213g, this.f12214h, this.f12215i, this.f12216j, this.f12217k, this.f12218l, this.f12219m, this.f12220n, this.f12221o, this.f12222p, this.f12223q, this.f12224r, (Composer) obj, RecomposeScopeImplKt.a(this.f12225s | 1), RecomposeScopeImplKt.a(this.f12226t), this.f12227u);
        return b0.f30125a;
    }
}
