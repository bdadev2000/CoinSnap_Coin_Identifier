package androidx.compose.material3;

import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
public final class BottomAppBarState$Companion$Saver$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final BottomAppBarState$Companion$Saver$2 f7915a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        List list = (List) obj;
        float floatValue = ((Number) list.get(0)).floatValue();
        float floatValue2 = ((Number) list.get(1)).floatValue();
        float floatValue3 = ((Number) list.get(2)).floatValue();
        float f2 = AppBarKt.f7649a;
        return new BottomAppBarStateImpl(floatValue, floatValue2, floatValue3);
    }
}
