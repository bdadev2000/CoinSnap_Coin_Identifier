package g;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;

/* loaded from: classes3.dex */
public final class a extends kotlin.jvm.internal.r implements q0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f30503a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f30504b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f30505c;
    public final /* synthetic */ q0.l d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q0.l f30506f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Alignment f30507g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ContentScale f30508h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f30509i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ColorFilter f30510j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f30511k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f30512l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f30513m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f30514n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(w wVar, String str, Modifier modifier, q0.l lVar, q0.l lVar2, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter, int i2, boolean z2, int i3, int i4) {
        super(2);
        this.f30503a = wVar;
        this.f30504b = str;
        this.f30505c = modifier;
        this.d = lVar;
        this.f30506f = lVar2;
        this.f30507g = alignment;
        this.f30508h = contentScale;
        this.f30509i = f2;
        this.f30510j = colorFilter;
        this.f30511k = i2;
        this.f30512l = z2;
        this.f30513m = i3;
        this.f30514n = i4;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        f.a(this.f30503a, this.f30504b, this.f30505c, this.d, this.f30506f, this.f30507g, this.f30508h, this.f30509i, this.f30510j, this.f30511k, this.f30512l, (Composer) obj, RecomposeScopeImplKt.a(this.f30513m | 1), RecomposeScopeImplKt.a(this.f30514n));
        return d0.b0.f30125a;
    }
}
