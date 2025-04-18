package g;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;

/* loaded from: classes3.dex */
public final class e extends kotlin.jvm.internal.r implements q0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f30526a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f30527b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f30528c;
    public final /* synthetic */ Alignment d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ContentScale f30529f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f30530g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ColorFilter f30531h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f30532i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f30533j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Modifier modifier, t tVar, String str, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter, boolean z2, int i2) {
        super(2);
        this.f30526a = modifier;
        this.f30527b = tVar;
        this.f30528c = str;
        this.d = alignment;
        this.f30529f = contentScale;
        this.f30530g = f2;
        this.f30531h = colorFilter;
        this.f30532i = z2;
        this.f30533j = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        f.b(this.f30526a, this.f30527b, this.f30528c, this.d, this.f30529f, this.f30530g, this.f30531h, this.f30532i, (Composer) obj, RecomposeScopeImplKt.a(this.f30533j | 1));
        return d0.b0.f30125a;
    }
}
