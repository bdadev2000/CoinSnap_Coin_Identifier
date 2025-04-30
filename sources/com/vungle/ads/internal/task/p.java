package com.vungle.ads.internal.task;

import android.content.Context;
import android.os.Bundle;
import com.vungle.ads.ServiceLocator$Companion;
import com.vungle.ads.f1;
import com.vungle.ads.internal.network.y;
import com.vungle.ads.internal.util.x;
import t7.AbstractC2712a;
import t7.EnumC2718g;
import t7.InterfaceC2717f;

/* loaded from: classes3.dex */
public final class p implements d {
    public static final m Companion = new m(null);
    public static final String TAG = "ResendTpatJob";
    private final Context context;
    private final x pathProvider;

    public p(Context context, x xVar) {
        G7.j.e(context, "context");
        G7.j.e(xVar, "pathProvider");
        this.context = context;
        this.pathProvider = xVar;
    }

    /* renamed from: onRunJob$lambda-0, reason: not valid java name */
    private static final y m79onRunJob$lambda0(InterfaceC2717f interfaceC2717f) {
        return (y) interfaceC2717f.getValue();
    }

    /* renamed from: onRunJob$lambda-1, reason: not valid java name */
    private static final com.vungle.ads.internal.executor.a m80onRunJob$lambda1(InterfaceC2717f interfaceC2717f) {
        return (com.vungle.ads.internal.executor.a) interfaceC2717f.getValue();
    }

    public final Context getContext() {
        return this.context;
    }

    public final x getPathProvider() {
        return this.pathProvider;
    }

    @Override // com.vungle.ads.internal.task.d
    public int onRunJob(Bundle bundle, j jVar) {
        G7.j.e(bundle, "bundle");
        G7.j.e(jVar, "jobRunner");
        ServiceLocator$Companion serviceLocator$Companion = f1.Companion;
        Context context = this.context;
        EnumC2718g enumC2718g = EnumC2718g.b;
        InterfaceC2717f c9 = AbstractC2712a.c(enumC2718g, new n(context));
        InterfaceC2717f c10 = AbstractC2712a.c(enumC2718g, new o(this.context));
        new com.vungle.ads.internal.network.l(m79onRunJob$lambda0(c9), null, null, null, ((com.vungle.ads.internal.executor.f) m80onRunJob$lambda1(c10)).getIoExecutor(), this.pathProvider, null, 64, null).resendStoredTpats$vungle_ads_release(((com.vungle.ads.internal.executor.f) m80onRunJob$lambda1(c10)).getJobExecutor());
        return 0;
    }
}
