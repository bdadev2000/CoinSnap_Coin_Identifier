package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SearchBar_androidKt$DockedSearchBar$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f10912a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10913b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f10914c;
    public final /* synthetic */ Modifier d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Shape f10915f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SearchBarColors f10916g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f10917h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f10918i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f10919j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f10920k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f10921l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBar_androidKt$DockedSearchBar$3(p pVar, boolean z2, l lVar, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f2, float f3, q qVar, int i2, int i3) {
        super(2);
        this.f10912a = pVar;
        this.f10913b = z2;
        this.f10914c = lVar;
        this.d = modifier;
        this.f10915f = shape;
        this.f10916g = searchBarColors;
        this.f10917h = f2;
        this.f10918i = f3;
        this.f10919j = qVar;
        this.f10920k = i2;
        this.f10921l = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        SearchBar_androidKt.a(this.f10912a, this.f10913b, this.f10914c, this.d, this.f10915f, this.f10916g, this.f10917h, this.f10918i, this.f10919j, (Composer) obj, RecomposeScopeImplKt.a(this.f10920k | 1), this.f10921l);
        return b0.f30125a;
    }
}
