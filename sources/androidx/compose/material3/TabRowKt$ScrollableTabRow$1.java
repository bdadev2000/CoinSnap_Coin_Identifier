package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.q;

/* loaded from: classes.dex */
final class TabRowKt$ScrollableTabRow$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11841a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowKt$ScrollableTabRow$1(int i2) {
        super(3);
        this.f11841a = i2;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        TabRowDefaults tabRowDefaults = TabRowDefaults.f11797a;
        tabRowDefaults.b(0.0f, 3072, 6, 0L, (Composer) obj2, ComposedModifierKt.a(Modifier.Companion.f14687a, new TabRowDefaults$tabIndicatorOffset$2((TabPosition) ((List) obj).get(this.f11841a))));
        return b0.f30125a;
    }
}
