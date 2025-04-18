package r1;

import androidx.annotation.RequiresPermission;
import com.facebook.internal.i;
import jb.g;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import t1.d;

/* loaded from: classes.dex */
public final class b {
    public final g a;

    public b(d mTopicsManager) {
        Intrinsics.checkNotNullParameter(mTopicsManager, "mTopicsManager");
        this.a = mTopicsManager;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    public ua.b a(t1.a request) {
        Deferred async$default;
        Intrinsics.checkNotNullParameter(request, "request");
        async$default = BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new a(this, request, null), 3, null);
        return i.g(async$default);
    }
}
