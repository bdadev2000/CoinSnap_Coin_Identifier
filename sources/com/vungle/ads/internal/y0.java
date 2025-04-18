package com.vungle.ads.internal;

import android.content.Context;
import bh.t2;
import bh.u1;
import com.vungle.ads.ServiceLocator$Companion;
import com.vungle.ads.a2;
import com.vungle.ads.d2;
import com.vungle.ads.e3;
import com.vungle.ads.g1;
import com.vungle.ads.g3;
import com.vungle.ads.i1;
import com.vungle.ads.i3;
import com.vungle.ads.k2;
import com.vungle.ads.l2;
import com.vungle.ads.m2;
import com.vungle.ads.n2;
import com.vungle.ads.n3;
import com.vungle.ads.z1;
import java.net.UnknownHostException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class y0 {
    public static final m0 Companion = new m0(null);
    private static final String TAG = "VungleInitializer";
    private boolean isInitialized;
    private AtomicBoolean isInitializing = new AtomicBoolean(false);
    private g3 initRequestToResponseMetric = new g3(com.vungle.ads.internal.protos.n.INIT_REQUEST_TO_RESPONSE_DURATION_MS);

    public static /* synthetic */ void a(com.vungle.ads.a1 a1Var) {
        m93onInitSuccess$lambda15(a1Var);
    }

    public static /* synthetic */ void b(y0 y0Var, com.vungle.ads.a1 a1Var) {
        m91init$lambda4(y0Var, a1Var);
    }

    public static /* synthetic */ void c(Context context, String str, y0 y0Var, com.vungle.ads.a1 a1Var, Lazy lazy) {
        m90init$lambda3(context, str, y0Var, a1Var, lazy);
    }

    private final void configure(Context context, com.vungle.ads.a1 a1Var) {
        com.vungle.ads.internal.network.j jVar;
        u1 u1Var;
        boolean z10;
        ServiceLocator$Companion serviceLocator$Companion = e3.Companion;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new n0(context));
        boolean z11 = true;
        try {
            this.initRequestToResponseMetric.markStart();
            com.vungle.ads.internal.network.a config = m83configure$lambda5(lazy).config();
            if (config != null) {
                jVar = ((com.vungle.ads.internal.network.h) config).execute();
            } else {
                jVar = null;
            }
            if (jVar == null) {
                onInitError(a1Var, new m2().logError$vungle_ads_release());
                return;
            }
            if (!jVar.isSuccessful()) {
                onInitError(a1Var, new com.vungle.ads.u0().logError$vungle_ads_release());
                return;
            }
            this.initRequestToResponseMetric.markEnd();
            t2 t2Var = (t2) jVar.body();
            if (t2Var != null) {
                u1Var = t2Var.getEndpoints();
            } else {
                u1Var = null;
            }
            if (u1Var == null) {
                onInitError(a1Var, new com.vungle.ads.v0().logError$vungle_ads_release());
                return;
            }
            f0 f0Var = f0.INSTANCE;
            f0Var.initWithConfig(t2Var);
            Lazy lazy2 = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new o0(context));
            com.vungle.ads.s.INSTANCE.init$vungle_ads_release(m83configure$lambda5(lazy), ((com.vungle.ads.internal.executor.f) m84configure$lambda6(lazy2)).getLoggerExecutor(), f0Var.getLogLevel(), f0Var.getMetricsEnabled(), m85configure$lambda7(LazyKt.lazy(lazyThreadSafetyMode, (Function0) new p0(context))));
            if (!f0Var.validateEndpoints()) {
                onInitError(a1Var, new com.vungle.ads.u0());
                return;
            }
            Lazy lazy3 = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new q0(context));
            String configExtension = t2Var.getConfigExtension();
            f0Var.updateConfigExtension(configExtension);
            if (configExtension != null && configExtension.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                m86configure$lambda8(lazy3).remove("config_extension").apply();
            } else {
                m86configure$lambda8(lazy3).put("config_extension", configExtension).apply();
            }
            if (f0Var.omEnabled()) {
                m79configure$lambda10(LazyKt.lazy(lazyThreadSafetyMode, (Function0) new r0(context))).init();
            }
            if (f0Var.placements() == null) {
                onInitError(a1Var, new com.vungle.ads.u0());
                return;
            }
            fh.c.INSTANCE.updateDisableAdId(f0Var.shouldDisableAdId());
            Lazy lazy4 = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new s0(context));
            ((com.vungle.ads.internal.task.w) m80configure$lambda11(lazy4)).execute(com.vungle.ads.internal.task.a.makeJobInfo$default(com.vungle.ads.internal.task.c.Companion, null, 1, null));
            ((com.vungle.ads.internal.task.w) m80configure$lambda11(lazy4)).execute(com.vungle.ads.internal.task.p.Companion.makeJobInfo());
            this.isInitialized = true;
            onInitSuccess(a1Var);
            com.vungle.ads.internal.load.o.downloadJs$default(com.vungle.ads.internal.load.o.INSTANCE, m81configure$lambda12(LazyKt.lazy(lazyThreadSafetyMode, (Function0) new t0(context))), m82configure$lambda13(LazyKt.lazy(lazyThreadSafetyMode, (Function0) new u0(context))), ((com.vungle.ads.internal.executor.f) m84configure$lambda6(lazy2)).getBackgroundExecutor(), null, 8, null);
        } catch (Throwable th2) {
            this.isInitialized = false;
            com.vungle.ads.internal.util.v.Companion.e(TAG, "Cannot finish init", th2);
            if (!(th2 instanceof UnknownHostException)) {
                z11 = th2 instanceof SecurityException;
            }
            if (z11) {
                onInitError(a1Var, new a2().logError$vungle_ads_release());
            } else if (th2 instanceof n3) {
                onInitError(a1Var, th2);
            } else {
                onInitError(a1Var, new i3().logError$vungle_ads_release());
            }
        }
    }

    /* renamed from: configure$lambda-10 */
    private static final dh.d m79configure$lambda10(Lazy<dh.d> lazy) {
        return lazy.getValue();
    }

    /* renamed from: configure$lambda-11 */
    private static final com.vungle.ads.internal.task.j m80configure$lambda11(Lazy<? extends com.vungle.ads.internal.task.j> lazy) {
        return lazy.getValue();
    }

    /* renamed from: configure$lambda-12 */
    private static final com.vungle.ads.internal.util.x m81configure$lambda12(Lazy<com.vungle.ads.internal.util.x> lazy) {
        return lazy.getValue();
    }

    /* renamed from: configure$lambda-13 */
    private static final com.vungle.ads.internal.downloader.p m82configure$lambda13(Lazy<? extends com.vungle.ads.internal.downloader.p> lazy) {
        return lazy.getValue();
    }

    /* renamed from: configure$lambda-5 */
    private static final com.vungle.ads.internal.network.y m83configure$lambda5(Lazy<com.vungle.ads.internal.network.y> lazy) {
        return lazy.getValue();
    }

    /* renamed from: configure$lambda-6 */
    private static final com.vungle.ads.internal.executor.a m84configure$lambda6(Lazy<? extends com.vungle.ads.internal.executor.a> lazy) {
        return lazy.getValue();
    }

    /* renamed from: configure$lambda-7 */
    private static final com.vungle.ads.internal.signals.j m85configure$lambda7(Lazy<com.vungle.ads.internal.signals.j> lazy) {
        return lazy.getValue();
    }

    /* renamed from: configure$lambda-8 */
    private static final eh.b m86configure$lambda8(Lazy<eh.b> lazy) {
        return lazy.getValue();
    }

    public static /* synthetic */ void d(com.vungle.ads.a1 a1Var, n3 n3Var) {
        m92onInitError$lambda14(a1Var, n3Var);
    }

    /* renamed from: init$lambda-0 */
    private static final com.vungle.ads.internal.platform.d m87init$lambda0(Lazy<? extends com.vungle.ads.internal.platform.d> lazy) {
        return lazy.getValue();
    }

    /* renamed from: init$lambda-1 */
    private static final com.vungle.ads.internal.executor.a m88init$lambda1(Lazy<? extends com.vungle.ads.internal.executor.a> lazy) {
        return lazy.getValue();
    }

    /* renamed from: init$lambda-2 */
    private static final com.vungle.ads.internal.network.y m89init$lambda2(Lazy<com.vungle.ads.internal.network.y> lazy) {
        return lazy.getValue();
    }

    /* renamed from: init$lambda-3 */
    public static final void m90init$lambda3(Context context, String appId, y0 this$0, com.vungle.ads.a1 initializationCallback, Lazy vungleApiClient$delegate) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(appId, "$appId");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(initializationCallback, "$initializationCallback");
        Intrinsics.checkNotNullParameter(vungleApiClient$delegate, "$vungleApiClient$delegate");
        fh.c.INSTANCE.init(context);
        m89init$lambda2(vungleApiClient$delegate).initialize(appId);
        this$0.configure(context, initializationCallback);
    }

    /* renamed from: init$lambda-4 */
    public static final void m91init$lambda4(y0 this$0, com.vungle.ads.a1 initializationCallback) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(initializationCallback, "$initializationCallback");
        this$0.onInitError(initializationCallback, new d2("Config: Out of Memory").logError$vungle_ads_release());
    }

    private final boolean isAppIdInvalid(String str) {
        return StringsKt.isBlank(str);
    }

    public static /* synthetic */ void isInitialized$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void isInitializing$vungle_ads_release$annotations() {
    }

    private final void onInitError(com.vungle.ads.a1 a1Var, n3 n3Var) {
        this.isInitializing.set(false);
        com.vungle.ads.internal.util.c0.INSTANCE.runOnUiThread(new jb.j(10, a1Var, n3Var));
        String localizedMessage = n3Var.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "Exception code is " + n3Var.getCode();
        }
        com.vungle.ads.internal.util.v.Companion.e(TAG, localizedMessage);
    }

    /* renamed from: onInitError$lambda-14 */
    public static final void m92onInitError$lambda14(com.vungle.ads.a1 initCallback, n3 exception) {
        Intrinsics.checkNotNullParameter(initCallback, "$initCallback");
        Intrinsics.checkNotNullParameter(exception, "$exception");
        ((a7.c) initCallback).onError(exception);
    }

    private final void onInitSuccess(com.vungle.ads.a1 a1Var) {
        this.isInitializing.set(false);
        com.vungle.ads.internal.util.c0.INSTANCE.runOnUiThread(new k8.f(a1Var, 18));
        com.vungle.ads.s.INSTANCE.logMetric$vungle_ads_release((i1) this.initRequestToResponseMetric, (r13 & 2) != 0 ? null : null, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : com.vungle.ads.internal.network.y.Companion.getBASE_URL$vungle_ads_release());
    }

    /* renamed from: onInitSuccess$lambda-15 */
    public static final void m93onInitSuccess$lambda15(com.vungle.ads.a1 initCallback) {
        Intrinsics.checkNotNullParameter(initCallback, "$initCallback");
        com.vungle.ads.internal.util.v.Companion.d(TAG, "onSuccess");
        ((a7.c) initCallback).onSuccess();
    }

    public final void deInit$vungle_ads_release() {
        e3.Companion.deInit();
        com.vungle.ads.internal.network.y.Companion.reset$vungle_ads_release();
        this.isInitialized = false;
        this.isInitializing.set(false);
    }

    public final void init(String appId, Context context, com.vungle.ads.a1 initializationCallback) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initializationCallback, "initializationCallback");
        if (isAppIdInvalid(appId)) {
            onInitError(initializationCallback, new g1().logError$vungle_ads_release());
            return;
        }
        ServiceLocator$Companion serviceLocator$Companion = e3.Companion;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        if (!((com.vungle.ads.internal.platform.b) m87init$lambda0(LazyKt.lazy(lazyThreadSafetyMode, (Function0) new v0(context)))).isAtLeastMinimumSDK()) {
            com.vungle.ads.internal.util.v.Companion.e(TAG, "SDK is supported only for API versions 21 and above");
            onInitError(initializationCallback, new n2().logError$vungle_ads_release());
            return;
        }
        if (isInitialized()) {
            com.vungle.ads.internal.util.v.Companion.d(TAG, "init already complete");
            new k2().logErrorNoReturnValue$vungle_ads_release();
            onInitSuccess(initializationCallback);
        } else if (this.isInitializing.getAndSet(true)) {
            com.vungle.ads.internal.util.v.Companion.d(TAG, "init ongoing");
            onInitError(initializationCallback, new l2().logError$vungle_ads_release());
        } else if (com.bumptech.glide.e.k(context, "android.permission.ACCESS_NETWORK_STATE") == 0 && com.bumptech.glide.e.k(context, "android.permission.INTERNET") == 0) {
            ((com.vungle.ads.internal.executor.f) m88init$lambda1(LazyKt.lazy(lazyThreadSafetyMode, (Function0) new w0(context)))).getBackgroundExecutor().execute(new com.applovin.impl.mediation.h(context, appId, this, initializationCallback, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new x0(context)), 4), new jb.j(11, this, initializationCallback));
        } else {
            com.vungle.ads.internal.util.v.Companion.e(TAG, "Network permissions not granted");
            onInitError(initializationCallback, new z1());
        }
    }

    public final boolean isInitialized() {
        return this.isInitialized;
    }

    public final boolean isInitialized$vungle_ads_release() {
        return this.isInitialized;
    }

    public final AtomicBoolean isInitializing$vungle_ads_release() {
        return this.isInitializing;
    }

    public final void setInitialized$vungle_ads_release(boolean z10) {
        this.isInitialized = z10;
    }

    public final void setInitializing$vungle_ads_release(AtomicBoolean atomicBoolean) {
        Intrinsics.checkNotNullParameter(atomicBoolean, "<set-?>");
        this.isInitializing = atomicBoolean;
    }
}
