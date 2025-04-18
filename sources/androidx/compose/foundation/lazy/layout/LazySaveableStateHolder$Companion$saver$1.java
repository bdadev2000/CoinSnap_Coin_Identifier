package androidx.compose.foundation.lazy.layout;

import java.util.Map;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes3.dex */
final class LazySaveableStateHolder$Companion$saver$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final LazySaveableStateHolder$Companion$saver$1 f4867a = new r(2);

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Map d = ((LazySaveableStateHolder) obj2).d();
        if (d.isEmpty()) {
            return null;
        }
        return d;
    }
}
