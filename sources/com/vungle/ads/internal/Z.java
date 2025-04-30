package com.vungle.ads.internal;

import android.content.Context;
import c3.C0605c;
import com.vungle.ads.AbstractC2123k0;
import com.vungle.ads.B0;
import com.vungle.ads.C2084i0;
import com.vungle.ads.C2137s;
import com.vungle.ads.F0;
import com.vungle.ads.InterfaceC2072c0;
import com.vungle.ads.M0;
import com.vungle.ads.N0;
import com.vungle.ads.P0;
import com.vungle.ads.ServiceLocator$Companion;
import com.vungle.ads.f1;
import com.vungle.ads.h1;
import com.vungle.ads.o1;
import f7.C2275b;
import g7.C2309c;
import java.util.concurrent.atomic.AtomicBoolean;
import t7.AbstractC2712a;
import t7.EnumC2718g;
import t7.InterfaceC2717f;

/* loaded from: classes3.dex */
public final class Z {
    public static final M Companion = new M(null);
    private static final String TAG = "VungleInitializer";
    private boolean isInitialized;
    private AtomicBoolean isInitializing = new AtomicBoolean(false);
    private h1 initRequestToResponseMetric = new h1(com.vungle.ads.internal.protos.n.INIT_REQUEST_TO_RESPONSE_DURATION_MS);

    public static /* synthetic */ void a(InterfaceC2072c0 interfaceC2072c0, o1 o1Var) {
        m35onInitError$lambda14(interfaceC2072c0, o1Var);
    }

    public static /* synthetic */ void b(InterfaceC2072c0 interfaceC2072c0) {
        m36onInitSuccess$lambda15(interfaceC2072c0);
    }

    public static /* synthetic */ void c(Context context, String str, Z z8, InterfaceC2072c0 interfaceC2072c0, InterfaceC2717f interfaceC2717f) {
        m33init$lambda3(context, str, z8, interfaceC2072c0, interfaceC2717f);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00f0 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:3:0x0014, B:5:0x0024, B:7:0x002e, B:10:0x003e, B:12:0x0044, B:14:0x0051, B:16:0x005e, B:18:0x0066, B:20:0x0073, B:22:0x00af, B:24:0x00b8, B:27:0x00cc, B:30:0x00d3, B:31:0x00ea, B:33:0x00f0, B:34:0x0100, B:36:0x0106, B:38:0x010f, B:40:0x00df), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0106 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:3:0x0014, B:5:0x0024, B:7:0x002e, B:10:0x003e, B:12:0x0044, B:14:0x0051, B:16:0x005e, B:18:0x0066, B:20:0x0073, B:22:0x00af, B:24:0x00b8, B:27:0x00cc, B:30:0x00d3, B:31:0x00ea, B:33:0x00f0, B:34:0x0100, B:36:0x0106, B:38:0x010f, B:40:0x00df), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010f A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #0 {all -> 0x003b, blocks: (B:3:0x0014, B:5:0x0024, B:7:0x002e, B:10:0x003e, B:12:0x0044, B:14:0x0051, B:16:0x005e, B:18:0x0066, B:20:0x0073, B:22:0x00af, B:24:0x00b8, B:27:0x00cc, B:30:0x00d3, B:31:0x00ea, B:33:0x00f0, B:34:0x0100, B:36:0x0106, B:38:0x010f, B:40:0x00df), top: B:2:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void configure(android.content.Context r18, com.vungle.ads.InterfaceC2072c0 r19) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.Z.configure(android.content.Context, com.vungle.ads.c0):void");
    }

    /* renamed from: configure$lambda-10 */
    private static final e7.d m22configure$lambda10(InterfaceC2717f interfaceC2717f) {
        return (e7.d) interfaceC2717f.getValue();
    }

    /* renamed from: configure$lambda-11 */
    private static final com.vungle.ads.internal.task.j m23configure$lambda11(InterfaceC2717f interfaceC2717f) {
        return (com.vungle.ads.internal.task.j) interfaceC2717f.getValue();
    }

    /* renamed from: configure$lambda-12 */
    private static final com.vungle.ads.internal.util.x m24configure$lambda12(InterfaceC2717f interfaceC2717f) {
        return (com.vungle.ads.internal.util.x) interfaceC2717f.getValue();
    }

    /* renamed from: configure$lambda-13 */
    private static final com.vungle.ads.internal.downloader.p m25configure$lambda13(InterfaceC2717f interfaceC2717f) {
        return (com.vungle.ads.internal.downloader.p) interfaceC2717f.getValue();
    }

    /* renamed from: configure$lambda-5 */
    private static final com.vungle.ads.internal.network.y m26configure$lambda5(InterfaceC2717f interfaceC2717f) {
        return (com.vungle.ads.internal.network.y) interfaceC2717f.getValue();
    }

    /* renamed from: configure$lambda-6 */
    private static final com.vungle.ads.internal.executor.a m27configure$lambda6(InterfaceC2717f interfaceC2717f) {
        return (com.vungle.ads.internal.executor.a) interfaceC2717f.getValue();
    }

    /* renamed from: configure$lambda-7 */
    private static final com.vungle.ads.internal.signals.j m28configure$lambda7(InterfaceC2717f interfaceC2717f) {
        return (com.vungle.ads.internal.signals.j) interfaceC2717f.getValue();
    }

    /* renamed from: configure$lambda-8 */
    private static final C2275b m29configure$lambda8(InterfaceC2717f interfaceC2717f) {
        return (C2275b) interfaceC2717f.getValue();
    }

    public static /* synthetic */ void d(Z z8, InterfaceC2072c0 interfaceC2072c0) {
        m34init$lambda4(z8, interfaceC2072c0);
    }

    /* renamed from: init$lambda-0 */
    private static final com.vungle.ads.internal.platform.d m30init$lambda0(InterfaceC2717f interfaceC2717f) {
        return (com.vungle.ads.internal.platform.d) interfaceC2717f.getValue();
    }

    /* renamed from: init$lambda-1 */
    private static final com.vungle.ads.internal.executor.a m31init$lambda1(InterfaceC2717f interfaceC2717f) {
        return (com.vungle.ads.internal.executor.a) interfaceC2717f.getValue();
    }

    /* renamed from: init$lambda-2 */
    private static final com.vungle.ads.internal.network.y m32init$lambda2(InterfaceC2717f interfaceC2717f) {
        return (com.vungle.ads.internal.network.y) interfaceC2717f.getValue();
    }

    /* renamed from: init$lambda-3 */
    public static final void m33init$lambda3(Context context, String str, Z z8, InterfaceC2072c0 interfaceC2072c0, InterfaceC2717f interfaceC2717f) {
        G7.j.e(context, "$context");
        G7.j.e(str, "$appId");
        G7.j.e(z8, "this$0");
        G7.j.e(interfaceC2072c0, "$initializationCallback");
        G7.j.e(interfaceC2717f, "$vungleApiClient$delegate");
        C2309c.INSTANCE.init(context);
        m32init$lambda2(interfaceC2717f).initialize(str);
        z8.configure(context, interfaceC2072c0);
    }

    /* renamed from: init$lambda-4 */
    public static final void m34init$lambda4(Z z8, InterfaceC2072c0 interfaceC2072c0) {
        G7.j.e(z8, "this$0");
        G7.j.e(interfaceC2072c0, "$initializationCallback");
        z8.onInitError(interfaceC2072c0, new F0("Config: Out of Memory").logError$vungle_ads_release());
    }

    private final boolean isAppIdInvalid(String str) {
        return O7.g.L(str);
    }

    public static /* synthetic */ void isInitialized$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void isInitializing$vungle_ads_release$annotations() {
    }

    private final void onInitError(InterfaceC2072c0 interfaceC2072c0, o1 o1Var) {
        this.isInitializing.set(false);
        com.vungle.ads.internal.util.C.INSTANCE.runOnUiThread(new com.facebook.appevents.k(5, interfaceC2072c0, o1Var));
        String localizedMessage = o1Var.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "Exception code is " + o1Var.getCode();
        }
        com.vungle.ads.internal.util.v.Companion.e(TAG, localizedMessage);
    }

    /* renamed from: onInitError$lambda-14 */
    public static final void m35onInitError$lambda14(InterfaceC2072c0 interfaceC2072c0, o1 o1Var) {
        G7.j.e(interfaceC2072c0, "$initCallback");
        G7.j.e(o1Var, "$exception");
        ((C0605c) interfaceC2072c0).onError(o1Var);
    }

    private final void onInitSuccess(InterfaceC2072c0 interfaceC2072c0) {
        this.isInitializing.set(false);
        com.vungle.ads.internal.util.C.INSTANCE.runOnUiThread(new com.vungle.ads.L(interfaceC2072c0, 1));
        C2137s.INSTANCE.logMetric$vungle_ads_release((AbstractC2123k0) this.initRequestToResponseMetric, (r13 & 2) != 0 ? null : null, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : com.vungle.ads.internal.network.y.Companion.getBASE_URL$vungle_ads_release());
    }

    /* renamed from: onInitSuccess$lambda-15 */
    public static final void m36onInitSuccess$lambda15(InterfaceC2072c0 interfaceC2072c0) {
        G7.j.e(interfaceC2072c0, "$initCallback");
        com.vungle.ads.internal.util.v.Companion.d(TAG, "onSuccess");
        ((C0605c) interfaceC2072c0).onSuccess();
    }

    public final void deInit$vungle_ads_release() {
        f1.Companion.deInit();
        com.vungle.ads.internal.network.y.Companion.reset$vungle_ads_release();
        this.isInitialized = false;
        this.isInitializing.set(false);
    }

    public final void init(String str, Context context, InterfaceC2072c0 interfaceC2072c0) {
        G7.j.e(str, "appId");
        G7.j.e(context, "context");
        G7.j.e(interfaceC2072c0, "initializationCallback");
        if (isAppIdInvalid(str)) {
            onInitError(interfaceC2072c0, new C2084i0().logError$vungle_ads_release());
            return;
        }
        ServiceLocator$Companion serviceLocator$Companion = f1.Companion;
        EnumC2718g enumC2718g = EnumC2718g.b;
        if (!((com.vungle.ads.internal.platform.b) m30init$lambda0(AbstractC2712a.c(enumC2718g, new W(context)))).isAtLeastMinimumSDK()) {
            com.vungle.ads.internal.util.v.Companion.e(TAG, "SDK is supported only for API versions 21 and above");
            onInitError(interfaceC2072c0, new P0().logError$vungle_ads_release());
            return;
        }
        if (isInitialized()) {
            com.vungle.ads.internal.util.v.Companion.d(TAG, "init already complete");
            new M0().logErrorNoReturnValue$vungle_ads_release();
            onInitSuccess(interfaceC2072c0);
        } else if (this.isInitializing.getAndSet(true)) {
            com.vungle.ads.internal.util.v.Companion.d(TAG, "init ongoing");
            onInitError(interfaceC2072c0, new N0().logError$vungle_ads_release());
        } else if (z2.i.a(context, "android.permission.ACCESS_NETWORK_STATE") == 0 && z2.i.a(context, "android.permission.INTERNET") == 0) {
            ((com.vungle.ads.internal.executor.f) m31init$lambda1(AbstractC2712a.c(enumC2718g, new X(context)))).getBackgroundExecutor().execute(new R2.a((Object) context, str, (Object) this, (Object) interfaceC2072c0, (Object) AbstractC2712a.c(enumC2718g, new Y(context)), 4), new com.facebook.appevents.k(4, this, interfaceC2072c0));
        } else {
            com.vungle.ads.internal.util.v.Companion.e(TAG, "Network permissions not granted");
            onInitError(interfaceC2072c0, new B0());
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

    public final void setInitialized$vungle_ads_release(boolean z8) {
        this.isInitialized = z8;
    }

    public final void setInitializing$vungle_ads_release(AtomicBoolean atomicBoolean) {
        G7.j.e(atomicBoolean, "<set-?>");
        this.isInitializing = atomicBoolean;
    }
}
