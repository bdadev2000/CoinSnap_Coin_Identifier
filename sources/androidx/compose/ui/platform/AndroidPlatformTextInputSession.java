package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.input.TextInputService;
import b1.d0;
import java.util.concurrent.atomic.AtomicReference;

@StabilityInferred
/* loaded from: classes2.dex */
public final class AndroidPlatformTextInputSession implements PlatformTextInputSessionScope, d0 {

    /* renamed from: a, reason: collision with root package name */
    public final View f16354a;

    /* renamed from: b, reason: collision with root package name */
    public final TextInputService f16355b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f16356c;
    public final AtomicReference d = new AtomicReference(null);

    public AndroidPlatformTextInputSession(AndroidComposeView androidComposeView, TextInputService textInputService, d0 d0Var) {
        this.f16354a = androidComposeView;
        this.f16355b = textInputService;
        this.f16356c = d0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // androidx.compose.ui.platform.PlatformTextInputSession
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(androidx.compose.ui.platform.PlatformTextInputMethodRequest r6, h0.g r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1 r0 = (androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1) r0
            int r1 = r0.f16359c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16359c = r1
            goto L18
        L13:
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1 r0 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f16357a
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f16359c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2b:
            kotlin.jvm.internal.q.m(r7)
            goto L48
        L2f:
            kotlin.jvm.internal.q.m(r7)
            java.util.concurrent.atomic.AtomicReference r7 = r5.d
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2 r2 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2
            r2.<init>(r6, r5)
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3 r6 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3
            r4 = 0
            r6.<init>(r5, r4)
            r0.f16359c = r3
            java.lang.Object r6 = androidx.compose.ui.SessionMutex.b(r7, r0, r2, r6)
            if (r6 != r1) goto L48
            return
        L48:
            d0.e r6 = new d0.e
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidPlatformTextInputSession.a(androidx.compose.ui.platform.PlatformTextInputMethodRequest, h0.g):void");
    }

    @Override // b1.d0
    public final h0.l getCoroutineContext() {
        return this.f16356c.getCoroutineContext();
    }

    @Override // androidx.compose.ui.platform.PlatformTextInputSession
    public final View getView() {
        return this.f16354a;
    }
}
