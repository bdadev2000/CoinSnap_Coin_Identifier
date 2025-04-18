package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.q;

/* loaded from: classes.dex */
final class TabRowKt$TabRow$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11933a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowKt$TabRow$1(int i2) {
        super(3);
        this.f11933a = i2;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        List list = (List) obj;
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        int size = list.size();
        int i2 = this.f11933a;
        if (i2 < size) {
            TabRowDefaults.f11797a.b(0.0f, 3072, 6, 0L, composer, ComposedModifierKt.a(Modifier.Companion.f14687a, new TabRowDefaults$tabIndicatorOffset$2((TabPosition) list.get(i2))));
        }
        return b0.f30125a;
    }
}
