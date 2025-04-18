package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.q;

/* loaded from: classes2.dex */
final class TabRowKt$SecondaryTabRow$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11924a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowKt$SecondaryTabRow$1(int i2) {
        super(3);
        this.f11924a = i2;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TabIndicatorScope tabIndicatorScope = (TabIndicatorScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= (intValue & 8) == 0 ? composer.I(tabIndicatorScope) : composer.w(tabIndicatorScope) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && composer.i()) {
            composer.A();
        } else {
            TabRowDefaults.f11797a.b(0.0f, 3072, 6, 0L, composer, tabIndicatorScope.a(this.f11924a, false));
        }
        return b0.f30125a;
    }
}
