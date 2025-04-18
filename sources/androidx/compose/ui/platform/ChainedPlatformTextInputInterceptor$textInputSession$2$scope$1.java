package androidx.compose.ui.platform;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1 implements PlatformTextInputSessionScope {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PlatformTextInputSessionScope f16410a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlatformTextInputSessionScope f16411b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f16412c;
    public final /* synthetic */ ChainedPlatformTextInputInterceptor d;

    public ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1(PlatformTextInputSessionScope platformTextInputSessionScope, AtomicReference atomicReference, ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor) {
        this.f16411b = platformTextInputSessionScope;
        this.f16412c = atomicReference;
        this.d = chainedPlatformTextInputInterceptor;
        this.f16410a = platformTextInputSessionScope;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // androidx.compose.ui.platform.PlatformTextInputSession
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(androidx.compose.ui.platform.PlatformTextInputMethodRequest r8, h0.g r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1 r0 = (androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1) r0
            int r1 = r0.f16415c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16415c = r1
            goto L18
        L13:
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1 r0 = new androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f16413a
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f16415c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2b:
            kotlin.jvm.internal.q.m(r9)
            goto L49
        L2f:
            kotlin.jvm.internal.q.m(r9)
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2 r9 = androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2.f16416a
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3 r2 = new androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3
            r4 = 0
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor r5 = r7.d
            androidx.compose.ui.platform.PlatformTextInputSessionScope r6 = r7.f16411b
            r2.<init>(r5, r8, r6, r4)
            r0.f16415c = r3
            java.util.concurrent.atomic.AtomicReference r8 = r7.f16412c
            java.lang.Object r8 = androidx.compose.ui.SessionMutex.b(r8, r0, r9, r2)
            if (r8 != r1) goto L49
            return
        L49:
            d0.e r8 = new d0.e
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1.a(androidx.compose.ui.platform.PlatformTextInputMethodRequest, h0.g):void");
    }

    @Override // b1.d0
    public final h0.l getCoroutineContext() {
        return this.f16410a.getCoroutineContext();
    }

    @Override // androidx.compose.ui.platform.PlatformTextInputSession
    public final View getView() {
        return this.f16410a.getView();
    }
}
