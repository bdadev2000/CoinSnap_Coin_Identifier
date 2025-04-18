package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.r;
import q0.l;
import q0.q;

/* loaded from: classes4.dex */
final class TabRowDefaults$tabIndicatorOffset$2 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TabPosition f11816a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowDefaults$tabIndicatorOffset$2(TabPosition tabPosition) {
        super(3);
        this.f11816a = tabPosition;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.J(-1541271084);
        TabPosition tabPosition = this.f11816a;
        float f2 = tabPosition.f11795b;
        TweenSpec tweenSpec = TabRowKt.f11820c;
        State a2 = AnimateAsStateKt.a(f2, tweenSpec, composer, 0);
        State a3 = AnimateAsStateKt.a(tabPosition.f11794a, tweenSpec, composer, 0);
        Modifier u2 = SizeKt.u(SizeKt.d((Modifier) obj, 1.0f), Alignment.Companion.f14663g, 2);
        boolean I = composer.I(a3);
        Object u3 = composer.u();
        if (I || u3 == Composer.Companion.f13690a) {
            u3 = new TabRowDefaults$tabIndicatorOffset$2$1$1(a3);
            composer.o(u3);
        }
        Modifier r2 = SizeKt.r(OffsetKt.a(u2, (l) u3), ((Dp) a2.getValue()).f17486a);
        composer.D();
        return r2;
    }
}
