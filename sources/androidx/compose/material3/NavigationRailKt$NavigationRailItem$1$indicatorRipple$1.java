package androidx.compose.material3;

import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.material3.internal.MappedInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes4.dex */
final class NavigationRailKt$NavigationRailItem$1$indicatorRipple$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Shape f10342a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MappedInteractionSource f10343b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$NavigationRailItem$1$indicatorRipple$1(Shape shape, MappedInteractionSource mappedInteractionSource) {
        super(2);
        this.f10342a = shape;
        this.f10343b = mappedInteractionSource;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            BoxKt.a(IndicationKt.a(ClipKt.a(LayoutIdKt.b(Modifier.Companion.f14687a, "indicatorRipple"), this.f10342a), this.f10343b, RippleKt.a(false, 0.0f, 0L, composer, 0, 7)), composer, 0);
        }
        return b0.f30125a;
    }
}
