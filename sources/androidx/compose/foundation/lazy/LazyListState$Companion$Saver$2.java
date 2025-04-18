package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
public final class LazyListState$Companion$Saver$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final LazyListState$Companion$Saver$2 f4412a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        List list = (List) obj;
        return new LazyListState(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
    }
}
