package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* loaded from: classes2.dex */
final class NavigationRailKt$NavigationRailItem$1$indicator$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ State f10338a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavigationRailItemColors f10339b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Shape f10340c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$NavigationRailItem$1$indicator$1(State state, NavigationRailItemColors navigationRailItemColors, Shape shape) {
        super(2);
        this.f10338a = state;
        this.f10339b = navigationRailItemColors;
        this.f10340c = shape;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            Modifier b2 = LayoutIdKt.b(Modifier.Companion.f14687a, "indicator");
            State state = this.f10338a;
            boolean I = composer.I(state);
            Object u2 = composer.u();
            if (I || u2 == Composer.Companion.f13690a) {
                u2 = new NavigationRailKt$NavigationRailItem$1$indicator$1$1$1(state);
                composer.o(u2);
            }
            BoxKt.a(BackgroundKt.a(GraphicsLayerModifierKt.a(b2, (l) u2), this.f10339b.f10318c, this.f10340c), composer, 0);
        }
        return b0.f30125a;
    }
}
