package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
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
/* loaded from: classes2.dex */
public final class SearchBar_androidKt$SearchBar$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f10971a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10972b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f10973c;
    public final /* synthetic */ Modifier d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Shape f10974f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SearchBarColors f10975g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f10976h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f10977i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ WindowInsets f10978j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q f10979k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f10980l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f10981m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBar_androidKt$SearchBar$3(p pVar, boolean z2, l lVar, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f2, float f3, WindowInsets windowInsets, q qVar, int i2, int i3) {
        super(2);
        this.f10971a = pVar;
        this.f10972b = z2;
        this.f10973c = lVar;
        this.d = modifier;
        this.f10974f = shape;
        this.f10975g = searchBarColors;
        this.f10976h = f2;
        this.f10977i = f3;
        this.f10978j = windowInsets;
        this.f10979k = qVar;
        this.f10980l = i2;
        this.f10981m = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        SearchBar_androidKt.b(this.f10971a, this.f10972b, this.f10973c, this.d, this.f10974f, this.f10975g, this.f10976h, this.f10977i, this.f10978j, this.f10979k, (Composer) obj, RecomposeScopeImplKt.a(this.f10980l | 1), this.f10981m);
        return b0.f30125a;
    }
}
