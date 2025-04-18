package androidx.compose.runtime;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes2.dex */
final class CompositionLocalKt$CompositionLocalProvider$4 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CompositionLocalContext f13767a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f13768b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13769c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompositionLocalKt$CompositionLocalProvider$4(CompositionLocalContext compositionLocalContext, p pVar, int i2) {
        super(2);
        this.f13767a = compositionLocalContext;
        this.f13768b = pVar;
        this.f13769c = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f13769c | 1);
        ComposerImpl g2 = ((Composer) obj).g(1853897736);
        int i3 = a2 & 6;
        CompositionLocalContext compositionLocalContext = this.f13767a;
        if (i3 == 0) {
            i2 = (g2.I(compositionLocalContext) ? 4 : 2) | a2;
        } else {
            i2 = a2;
        }
        int i4 = a2 & 48;
        p pVar = this.f13768b;
        if (i4 == 0) {
            i2 |= g2.w(pVar) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !g2.i()) {
            compositionLocalContext.getClass();
            throw null;
        }
        g2.A();
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new CompositionLocalKt$CompositionLocalProvider$4(compositionLocalContext, pVar, a2);
        }
        return b0.f30125a;
    }
}
