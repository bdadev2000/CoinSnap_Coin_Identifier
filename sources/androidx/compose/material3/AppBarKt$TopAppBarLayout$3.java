package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class AppBarKt$TopAppBarLayout$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f7813a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScrolledOffset f7814b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f7815c;
    public final /* synthetic */ long d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f7816f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f7817g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ TextStyle f7818h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f7819i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Arrangement.Vertical f7820j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Arrangement.Horizontal f7821k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f7822l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f7823m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p f7824n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p f7825o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f7826p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7827q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$TopAppBarLayout$3(Modifier modifier, ScrolledOffset scrolledOffset, long j2, long j3, long j4, p pVar, TextStyle textStyle, float f2, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, int i2, boolean z2, p pVar2, p pVar3, int i3, int i4) {
        super(2);
        this.f7813a = modifier;
        this.f7814b = scrolledOffset;
        this.f7815c = j2;
        this.d = j3;
        this.f7816f = j4;
        this.f7817g = pVar;
        this.f7818h = textStyle;
        this.f7819i = f2;
        this.f7820j = vertical;
        this.f7821k = horizontal;
        this.f7822l = i2;
        this.f7823m = z2;
        this.f7824n = pVar2;
        this.f7825o = pVar3;
        this.f7826p = i3;
        this.f7827q = i4;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AppBarKt.i(this.f7813a, this.f7814b, this.f7815c, this.d, this.f7816f, this.f7817g, this.f7818h, this.f7819i, this.f7820j, this.f7821k, this.f7822l, this.f7823m, this.f7824n, this.f7825o, (Composer) obj, RecomposeScopeImplKt.a(this.f7826p | 1), RecomposeScopeImplKt.a(this.f7827q));
        return b0.f30125a;
    }
}
