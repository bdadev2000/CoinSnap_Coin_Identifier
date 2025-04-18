package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.a;
import q0.p;

/* loaded from: classes4.dex */
final class LazyLayoutKt$LazyLayout$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyLayoutItemProvider f4798a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f4799b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LazyLayoutPrefetchState f4800c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4801f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4802g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutKt$LazyLayout$2(LazyLayoutItemProvider lazyLayoutItemProvider, Modifier modifier, LazyLayoutPrefetchState lazyLayoutPrefetchState, p pVar, int i2, int i3) {
        super(2);
        this.f4798a = lazyLayoutItemProvider;
        this.f4799b = modifier;
        this.f4800c = lazyLayoutPrefetchState;
        this.d = pVar;
        this.f4801f = i2;
        this.f4802g = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        Modifier modifier;
        LazyLayoutPrefetchState lazyLayoutPrefetchState;
        ((Number) obj2).intValue();
        LazyLayoutItemProvider lazyLayoutItemProvider = this.f4798a;
        p pVar = this.d;
        int a2 = RecomposeScopeImplKt.a(this.f4801f | 1);
        int i3 = this.f4802g;
        ComposerImpl g2 = ((Composer) obj).g(852831187);
        if ((i3 & 1) != 0) {
            i2 = a2 | 6;
        } else if ((a2 & 6) == 0) {
            i2 = (g2.I(lazyLayoutItemProvider) ? 4 : 2) | a2;
        } else {
            i2 = a2;
        }
        int i4 = i3 & 2;
        Modifier modifier2 = this.f4799b;
        if (i4 != 0) {
            i2 |= 48;
        } else if ((a2 & 48) == 0) {
            i2 |= g2.I(modifier2) ? 32 : 16;
        }
        int i5 = i3 & 4;
        LazyLayoutPrefetchState lazyLayoutPrefetchState2 = this.f4800c;
        if (i5 != 0) {
            i2 |= 384;
        } else if ((a2 & 384) == 0) {
            i2 |= g2.I(lazyLayoutPrefetchState2) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i2 |= 3072;
        } else if ((a2 & 3072) == 0) {
            i2 |= g2.w(pVar) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i2 & 1171) == 1170 && g2.i()) {
            g2.A();
            modifier = modifier2;
            lazyLayoutPrefetchState = lazyLayoutPrefetchState2;
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.Companion.f14687a;
            }
            Modifier modifier3 = modifier2;
            if (i5 != 0) {
                lazyLayoutPrefetchState2 = null;
            }
            LazyLayoutPrefetchState lazyLayoutPrefetchState3 = lazyLayoutPrefetchState2;
            boolean z2 = (i2 & 14) == 4;
            Object u2 = g2.u();
            if (z2 || u2 == Composer.Companion.f13690a) {
                u2 = new LazyLayoutKt$LazyLayout$1$1(lazyLayoutItemProvider);
                g2.o(u2);
            }
            LazyLayoutKt.a((a) u2, modifier3, lazyLayoutPrefetchState3, pVar, g2, (i2 & 112) | (i2 & 896) | (i2 & 7168), 0);
            modifier = modifier3;
            lazyLayoutPrefetchState = lazyLayoutPrefetchState3;
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new LazyLayoutKt$LazyLayout$2(lazyLayoutItemProvider, modifier, lazyLayoutPrefetchState, pVar, a2, i3);
        }
        return b0.f30125a;
    }
}
