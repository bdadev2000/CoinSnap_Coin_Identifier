package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class LazyGridState$Companion$saver$4 extends r implements l {
    @Override // q0.l
    public final Object invoke(Object obj) {
        List list = (List) obj;
        return new LazyGridState(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue(), null);
    }
}
