package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import d0.b0;
import org.objectweb.asm.Opcodes;

/* JADX INFO: Access modifiers changed from: package-private */
@j0.e(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", l = {Opcodes.LNEG, Opcodes.LSHR}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 extends j0.i implements q0.p {

    /* renamed from: a, reason: collision with root package name */
    public d1.a f16678a;

    /* renamed from: b, reason: collision with root package name */
    public int f16679b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f16680c;
    public final /* synthetic */ ContentResolver d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Uri f16681f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 f16682g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d1.f f16683h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Context f16684i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(ContentResolver contentResolver, Uri uri, WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1, d1.f fVar, Context context, h0.g gVar) {
        super(2, gVar);
        this.d = contentResolver;
        this.f16681f = uri;
        this.f16682g = windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1;
        this.f16683h = fVar;
        this.f16684i = context;
    }

    @Override // j0.a
    public final h0.g create(Object obj, h0.g gVar) {
        WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 = new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(this.d, this.f16681f, this.f16682g, this.f16683h, this.f16684i, gVar);
        windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.f16680c = obj;
        return windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1) create((e1.i) obj, (h0.g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #0 {all -> 0x0084, blocks: (B:11:0x0047, B:16:0x0057, B:18:0x005f), top: B:10:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0082 -> B:10:0x0047). Please report as a decompilation issue!!! */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            i0.a r0 = i0.a.f30806a
            int r1 = r9.f16679b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2f
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1b
            d1.a r1 = r9.f16678a
            java.lang.Object r4 = r9.f16680c
            e1.i r4 = (e1.i) r4
            kotlin.jvm.internal.q.m(r10)     // Catch: java.lang.Throwable -> L17
            r10 = r4
            goto L46
        L17:
            r10 = move-exception
            r4 = r9
            goto L90
        L1b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L23:
            d1.a r1 = r9.f16678a
            java.lang.Object r4 = r9.f16680c
            e1.i r4 = (e1.i) r4
            kotlin.jvm.internal.q.m(r10)     // Catch: java.lang.Throwable -> L17
            r5 = r4
            r4 = r9
            goto L57
        L2f:
            kotlin.jvm.internal.q.m(r10)
            java.lang.Object r10 = r9.f16680c
            e1.i r10 = (e1.i) r10
            android.content.ContentResolver r1 = r9.d
            android.net.Uri r4 = r9.f16681f
            r5 = 0
            androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 r6 = r9.f16682g
            r1.registerContentObserver(r4, r5, r6)
            d1.f r1 = r9.f16683h     // Catch: java.lang.Throwable -> L17
            d1.a r1 = r1.iterator()     // Catch: java.lang.Throwable -> L17
        L46:
            r4 = r9
        L47:
            r4.f16680c = r10     // Catch: java.lang.Throwable -> L84
            r4.f16678a = r1     // Catch: java.lang.Throwable -> L84
            r4.f16679b = r3     // Catch: java.lang.Throwable -> L84
            java.lang.Object r5 = r1.b(r4)     // Catch: java.lang.Throwable -> L84
            if (r5 != r0) goto L54
            return r0
        L54:
            r8 = r5
            r5 = r10
            r10 = r8
        L57:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L84
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L84
            if (r10 == 0) goto L86
            r1.c()     // Catch: java.lang.Throwable -> L84
            android.content.Context r10 = r4.f16684i     // Catch: java.lang.Throwable -> L84
            android.content.ContentResolver r10 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L84
            java.lang.String r6 = "animator_duration_scale"
            r7 = 1065353216(0x3f800000, float:1.0)
            float r10 = android.provider.Settings.Global.getFloat(r10, r6, r7)     // Catch: java.lang.Throwable -> L84
            java.lang.Float r6 = new java.lang.Float     // Catch: java.lang.Throwable -> L84
            r6.<init>(r10)     // Catch: java.lang.Throwable -> L84
            r4.f16680c = r5     // Catch: java.lang.Throwable -> L84
            r4.f16678a = r1     // Catch: java.lang.Throwable -> L84
            r4.f16679b = r2     // Catch: java.lang.Throwable -> L84
            java.lang.Object r10 = r5.emit(r6, r4)     // Catch: java.lang.Throwable -> L84
            if (r10 != r0) goto L82
            return r0
        L82:
            r10 = r5
            goto L47
        L84:
            r10 = move-exception
            goto L90
        L86:
            android.content.ContentResolver r10 = r4.d
            androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 r0 = r4.f16682g
            r10.unregisterContentObserver(r0)
            d0.b0 r10 = d0.b0.f30125a
            return r10
        L90:
            android.content.ContentResolver r0 = r4.d
            androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 r1 = r4.f16682g
            r0.unregisterContentObserver(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
