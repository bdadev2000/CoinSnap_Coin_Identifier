package q1;

import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.RequiresPermission;
import com.facebook.internal.i;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes.dex */
public final class g extends h {
    public final com.bumptech.glide.e a;

    public g(s1.b mMeasurementManager) {
        Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
        this.a = mMeasurementManager;
    }

    @Override // q1.h
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public ua.b b() {
        Deferred async$default;
        async$default = BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new b(this, null), 3, null);
        return i.g(async$default);
    }

    @Override // q1.h
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public ua.b c(Uri attributionSource, InputEvent inputEvent) {
        Deferred async$default;
        Intrinsics.checkNotNullParameter(attributionSource, "attributionSource");
        async$default = BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new c(this, attributionSource, inputEvent, null), 3, null);
        return i.g(async$default);
    }

    @Override // q1.h
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public ua.b d(Uri trigger) {
        Deferred async$default;
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        async$default = BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new d(this, trigger, null), 3, null);
        return i.g(async$default);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public ua.b e(s1.a deletionRequest) {
        Deferred async$default;
        Intrinsics.checkNotNullParameter(deletionRequest, "deletionRequest");
        async$default = BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new a(this, null), 3, null);
        return i.g(async$default);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public ua.b f(s1.c request) {
        Deferred async$default;
        Intrinsics.checkNotNullParameter(request, "request");
        async$default = BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new e(this, null), 3, null);
        return i.g(async$default);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public ua.b g(s1.d request) {
        Deferred async$default;
        Intrinsics.checkNotNullParameter(request, "request");
        async$default = BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new f(this, null), 3, null);
        return i.g(async$default);
    }
}
