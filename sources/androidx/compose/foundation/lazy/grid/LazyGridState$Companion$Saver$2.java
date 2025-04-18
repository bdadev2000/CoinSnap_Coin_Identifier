package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
public final class LazyGridState$Companion$Saver$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final LazyGridState$Companion$Saver$2 f4622a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        List list = (List) obj;
        return new LazyGridState(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
    }
}
