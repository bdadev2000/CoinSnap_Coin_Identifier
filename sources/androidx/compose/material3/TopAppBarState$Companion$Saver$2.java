package androidx.compose.material3;

import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
public final class TopAppBarState$Companion$Saver$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final TopAppBarState$Companion$Saver$2 f12613a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        List list = (List) obj;
        return new TopAppBarState(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue(), ((Number) list.get(2)).floatValue());
    }
}
