package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.LayoutIdKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* loaded from: classes2.dex */
final class NavigationBarKt$NavigationBarItem$2$indicator$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ State f9984a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavigationBarItemColors f9985b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationBarKt$NavigationBarItem$2$indicator$1(State state, NavigationBarItemColors navigationBarItemColors) {
        super(2);
        this.f9984a = state;
        this.f9985b = navigationBarItemColors;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            Modifier b2 = LayoutIdKt.b(Modifier.Companion.f14687a, "indicator");
            State state = this.f9984a;
            boolean I = composer.I(state);
            Object u2 = composer.u();
            if (I || u2 == Composer.Companion.f13690a) {
                u2 = new NavigationBarKt$NavigationBarItem$2$indicator$1$1$1(state);
                composer.o(u2);
            }
            Modifier a2 = GraphicsLayerModifierKt.a(b2, (l) u2);
            long j2 = this.f9985b.f9966c;
            float f2 = NavigationBarTokens.f13440a;
            BoxKt.a(BackgroundKt.a(a2, j2, ShapesKt.a(ShapeKeyTokens.f13512f, composer)), composer, 0);
        }
        return b0.f30125a;
    }
}
