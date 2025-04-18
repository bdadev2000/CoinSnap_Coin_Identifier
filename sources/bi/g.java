package bi;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g extends WeakReference {
    public final Object a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i referent, Object obj) {
        super(referent);
        Intrinsics.checkNotNullParameter(referent, "referent");
        this.a = obj;
    }
}
