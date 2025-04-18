package com.vungle.ads.internal.task;

import android.content.Context;
import android.os.Bundle;
import com.vungle.ads.ServiceLocator$Companion;
import com.vungle.ads.e3;
import com.vungle.ads.internal.network.y;
import com.vungle.ads.internal.util.x;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p implements d {
    public static final m Companion = new m(null);
    public static final String TAG = "ResendTpatJob";
    private final Context context;
    private final x pathProvider;

    public p(Context context, x pathProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        this.context = context;
        this.pathProvider = pathProvider;
    }

    /* renamed from: onRunJob$lambda-0, reason: not valid java name */
    private static final y m59onRunJob$lambda0(Lazy<y> lazy) {
        return lazy.getValue();
    }

    /* renamed from: onRunJob$lambda-1, reason: not valid java name */
    private static final com.vungle.ads.internal.executor.a m60onRunJob$lambda1(Lazy<? extends com.vungle.ads.internal.executor.a> lazy) {
        return lazy.getValue();
    }

    public final Context getContext() {
        return this.context;
    }

    public final x getPathProvider() {
        return this.pathProvider;
    }

    @Override // com.vungle.ads.internal.task.d
    public int onRunJob(Bundle bundle, j jobRunner) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(jobRunner, "jobRunner");
        ServiceLocator$Companion serviceLocator$Companion = e3.Companion;
        Context context = this.context;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new n(context));
        Lazy lazy2 = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new o(this.context));
        new com.vungle.ads.internal.network.l(m59onRunJob$lambda0(lazy), null, null, null, ((com.vungle.ads.internal.executor.f) m60onRunJob$lambda1(lazy2)).getIoExecutor(), this.pathProvider, null, 64, null).resendStoredTpats$vungle_ads_release(((com.vungle.ads.internal.executor.f) m60onRunJob$lambda1(lazy2)).getJobExecutor());
        return 0;
    }
}
