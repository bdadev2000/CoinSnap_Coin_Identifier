package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MaterialThemeKt$MaterialTheme$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ColorScheme f9724a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Shapes f9725b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Typography f9726c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f9727f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9728g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialThemeKt$MaterialTheme$2(ColorScheme colorScheme, Shapes shapes, Typography typography, p pVar, int i2, int i3) {
        super(2);
        this.f9724a = colorScheme;
        this.f9725b = shapes;
        this.f9726c = typography;
        this.d = pVar;
        this.f9727f = i2;
        this.f9728g = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        MaterialThemeKt.a(this.f9724a, this.f9725b, this.f9726c, this.d, (Composer) obj, RecomposeScopeImplKt.a(this.f9727f | 1), this.f9728g);
        return b0.f30125a;
    }
}
