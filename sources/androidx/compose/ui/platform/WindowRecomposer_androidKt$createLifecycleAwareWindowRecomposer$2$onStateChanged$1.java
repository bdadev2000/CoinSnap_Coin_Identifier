package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.lifecycle.LifecycleOwner;
import b1.d0;
import d0.b0;
import kotlin.jvm.internal.f0;

@j0.e(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", l = {396}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 extends j0.i implements q0.p {

    /* renamed from: a, reason: collision with root package name */
    public int f16668a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f16669b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f16670c;
    public final /* synthetic */ Recomposer d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f16671f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 f16672g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ View f16673h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(f0 f0Var, Recomposer recomposer, LifecycleOwner lifecycleOwner, WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2, View view, h0.g gVar) {
        super(2, gVar);
        this.f16670c = f0Var;
        this.d = recomposer;
        this.f16671f = lifecycleOwner;
        this.f16672g = windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;
        this.f16673h = view;
    }

    @Override // j0.a
    public final h0.g create(Object obj, h0.g gVar) {
        WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 = new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(this.f16670c, this.d, this.f16671f, this.f16672g, this.f16673h, gVar);
        windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1.f16669b = obj;
        return windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1) create((d0) obj, (h0.g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            i0.a r0 = i0.a.f30806a
            int r1 = r10.f16668a
            r2 = 0
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r3 = r10.f16672g
            androidx.lifecycle.LifecycleOwner r4 = r10.f16671f
            r5 = 1
            if (r1 == 0) goto L20
            if (r1 != r5) goto L18
            java.lang.Object r0 = r10.f16669b
            b1.h1 r0 = (b1.h1) r0
            kotlin.jvm.internal.q.m(r11)     // Catch: java.lang.Throwable -> L16
            goto L6a
        L16:
            r11 = move-exception
            goto L7d
        L18:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L20:
            kotlin.jvm.internal.q.m(r11)
            java.lang.Object r11 = r10.f16669b
            b1.d0 r11 = (b1.d0) r11
            kotlin.jvm.internal.f0 r1 = r10.f16670c     // Catch: java.lang.Throwable -> L58
            java.lang.Object r1 = r1.f30930a     // Catch: java.lang.Throwable -> L58
            androidx.compose.ui.platform.MotionDurationScaleImpl r1 = (androidx.compose.ui.platform.MotionDurationScaleImpl) r1     // Catch: java.lang.Throwable -> L58
            if (r1 == 0) goto L5b
            android.view.View r6 = r10.f16673h     // Catch: java.lang.Throwable -> L58
            android.content.Context r6 = r6.getContext()     // Catch: java.lang.Throwable -> L58
            android.content.Context r6 = r6.getApplicationContext()     // Catch: java.lang.Throwable -> L58
            e1.g1 r6 = androidx.compose.ui.platform.WindowRecomposer_androidKt.a(r6)     // Catch: java.lang.Throwable -> L58
            java.lang.Object r7 = r6.getValue()     // Catch: java.lang.Throwable -> L58
            java.lang.Number r7 = (java.lang.Number) r7     // Catch: java.lang.Throwable -> L58
            float r7 = r7.floatValue()     // Catch: java.lang.Throwable -> L58
            androidx.compose.runtime.ParcelableSnapshotMutableFloatState r8 = r1.f16531a     // Catch: java.lang.Throwable -> L58
            r8.n(r7)     // Catch: java.lang.Throwable -> L58
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1 r7 = new androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1     // Catch: java.lang.Throwable -> L58
            r7.<init>(r6, r1, r2)     // Catch: java.lang.Throwable -> L58
            r1 = 3
            r6 = 0
            b1.a2 r11 = kotlin.jvm.internal.e.v(r11, r2, r6, r7, r1)     // Catch: java.lang.Throwable -> L58
            goto L5c
        L58:
            r11 = move-exception
            r0 = r2
            goto L7d
        L5b:
            r11 = r2
        L5c:
            androidx.compose.runtime.Recomposer r1 = r10.d     // Catch: java.lang.Throwable -> L79
            r10.f16669b = r11     // Catch: java.lang.Throwable -> L79
            r10.f16668a = r5     // Catch: java.lang.Throwable -> L79
            java.lang.Object r1 = r1.N(r10)     // Catch: java.lang.Throwable -> L79
            if (r1 != r0) goto L69
            return r0
        L69:
            r0 = r11
        L6a:
            if (r0 == 0) goto L6f
            r0.a(r2)
        L6f:
            androidx.lifecycle.Lifecycle r11 = r4.getLifecycle()
            r11.d(r3)
            d0.b0 r11 = d0.b0.f30125a
            return r11
        L79:
            r0 = move-exception
            r9 = r0
            r0 = r11
            r11 = r9
        L7d:
            if (r0 == 0) goto L82
            r0.a(r2)
        L82:
            androidx.lifecycle.Lifecycle r0 = r4.getLifecycle()
            r0.d(r3)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
