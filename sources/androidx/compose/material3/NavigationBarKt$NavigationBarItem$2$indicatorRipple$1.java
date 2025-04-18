package androidx.compose.material3;

import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.material3.internal.MappedInteractionSource;
import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.LayoutIdKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes2.dex */
final class NavigationBarKt$NavigationBarItem$2$indicatorRipple$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MappedInteractionSource f9987a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationBarKt$NavigationBarItem$2$indicatorRipple$1(MappedInteractionSource mappedInteractionSource) {
        super(2);
        this.f9987a = mappedInteractionSource;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            Modifier b2 = LayoutIdKt.b(Modifier.Companion.f14687a, "indicatorRipple");
            float f2 = NavigationBarTokens.f13440a;
            BoxKt.a(IndicationKt.a(ClipKt.a(b2, ShapesKt.a(ShapeKeyTokens.f13512f, composer)), this.f9987a, RippleKt.a(false, 0.0f, 0L, composer, 0, 7)), composer, 0);
        }
        return b0.f30125a;
    }
}
