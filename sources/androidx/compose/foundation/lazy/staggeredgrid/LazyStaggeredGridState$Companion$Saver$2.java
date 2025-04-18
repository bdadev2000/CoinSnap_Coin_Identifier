package androidx.compose.foundation.lazy.staggeredgrid;

import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
public final class LazyStaggeredGridState$Companion$Saver$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final LazyStaggeredGridState$Companion$Saver$2 f5068a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        List list = (List) obj;
        return new LazyStaggeredGridState((int[]) list.get(0), (int[]) list.get(1));
    }
}
