package y0;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.SharingStartedKt;

/* loaded from: classes.dex */
public final class u0 implements j {
    public final k1 a;

    /* renamed from: b, reason: collision with root package name */
    public final c f27851b;

    /* renamed from: c, reason: collision with root package name */
    public final CoroutineScope f27852c;

    /* renamed from: d, reason: collision with root package name */
    public final SharedFlow f27853d;

    /* renamed from: e, reason: collision with root package name */
    public final Flow f27854e;

    /* renamed from: f, reason: collision with root package name */
    public final Flow f27855f;

    /* renamed from: g, reason: collision with root package name */
    public final kc.c f27856g;

    /* renamed from: h, reason: collision with root package name */
    public final o f27857h;

    /* renamed from: i, reason: collision with root package name */
    public final Lazy f27858i;

    /* renamed from: j, reason: collision with root package name */
    public final Lazy f27859j;

    /* renamed from: k, reason: collision with root package name */
    public final e1 f27860k;

    public u0(a1.e storage, List initTasksList, c corruptionHandler, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.a = storage;
        this.f27851b = corruptionHandler;
        this.f27852c = scope;
        Flow flow = FlowKt.flow(new n0(this, null));
        SharingStarted.Companion companion = SharingStarted.INSTANCE;
        Duration.Companion companion2 = Duration.INSTANCE;
        SharingStarted m1701WhileSubscribed5qebJ5I = SharingStartedKt.m1701WhileSubscribed5qebJ5I(companion, companion2.m1587getZEROUwyO8pc(), companion2.m1587getZEROUwyO8pc());
        int i10 = 0;
        this.f27853d = FlowKt.shareIn(flow, scope, m1701WhileSubscribed5qebJ5I, 0);
        this.f27854e = FlowKt.flow(new c0(this, null));
        this.f27855f = FlowKt.channelFlow(new v(this, null));
        this.f27856g = new kc.c(8);
        this.f27857h = new o(this, initTasksList);
        this.f27858i = LazyKt.lazy(new p(this, 1));
        this.f27859j = LazyKt.lazy(new p(this, i10));
        this.f27860k = new e1(scope, new p0(this, i10), q0.f27828c, new r0(this, null));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(7:5|6|7|(6:(1:(1:(2:12|13))(2:15|16))|32|33|22|23|24)(4:34|35|36|(6:38|(2:40|41)|21|22|23|24)(3:42|(1:44)(1:60)|(2:46|(2:48|(1:51)(1:50))(2:52|53))(2:54|(2:56|57)(2:58|59))))|17|18|(1:26)(5:20|21|22|23|24)))|64|6|7|(0)(0)|17|18|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bf, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c0, code lost:
    
        r11 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x004d, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, y0.u0] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(y0.u0 r9, y0.x0 r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.u0.b(y0.u0, y0.x0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(y0.u0 r8, boolean r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.u0.c(y0.u0, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(4:5|6|7|8))|86|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0113, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0114, code lost:
    
        r6 = r9;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0025. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014d A[Catch: all -> 0x0177, TryCatch #4 {all -> 0x0177, blocks: (B:27:0x013b, B:29:0x014d, B:33:0x0155), top: B:26:0x013b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0155 A[Catch: all -> 0x0177, TRY_LEAVE, TryCatch #4 {all -> 0x0177, blocks: (B:27:0x013b, B:29:0x014d, B:33:0x0155), top: B:26:0x013b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a5 A[Catch: b -> 0x0113, TryCatch #3 {b -> 0x0113, blocks: (B:51:0x0070, B:52:0x00ea, B:66:0x008b, B:68:0x00a5, B:69:0x00ab, B:76:0x0094, B:80:0x00d7), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(y0.u0 r9, boolean r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.u0.d(y0.u0, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // y0.j
    public final Object a(Function2 function2, Continuation continuation) {
        p1 p1Var = (p1) continuation.getContext().get(o1.f27820b);
        if (p1Var != null) {
            p1Var.a(this);
        }
        return BuildersKt.withContext(new p1(p1Var, this), new o0(this, function2, null), continuation);
    }

    public final i1 e() {
        return (i1) this.f27859j.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof y0.d0
            if (r0 == 0) goto L13
            r0 = r6
            y0.d0 r0 = (y0.d0) r0
            int r1 = r0.f27707g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27707g = r1
            goto L18
        L13:
            y0.d0 r0 = new y0.d0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f27705d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f27707g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            int r1 = r0.f27704c
            y0.u0 r0 = r0.f27703b
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L30
            goto L68
        L30:
            r6 = move-exception
            goto L6f
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3a:
            y0.u0 r2 = r0.f27703b
            kotlin.ResultKt.throwOnFailure(r6)
            goto L53
        L40:
            kotlin.ResultKt.throwOnFailure(r6)
            y0.i1 r6 = r5.e()
            r0.f27703b = r5
            r0.f27707g = r4
            java.lang.Integer r6 = r6.a()
            if (r6 != r1) goto L52
            return r1
        L52:
            r2 = r5
        L53:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            y0.o r4 = r2.f27857h     // Catch: java.lang.Throwable -> L6b
            r0.f27703b = r2     // Catch: java.lang.Throwable -> L6b
            r0.f27704c = r6     // Catch: java.lang.Throwable -> L6b
            r0.f27707g = r3     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r6 = r4.b(r0)     // Catch: java.lang.Throwable -> L6b
            if (r6 != r1) goto L68
            return r1
        L68:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L6b:
            r0 = move-exception
            r1 = r6
            r6 = r0
            r0 = r2
        L6f:
            kc.c r0 = r0.f27856g
            y0.y0 r2 = new y0.y0
            r2.<init>(r6, r1)
            r0.v(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.u0.f(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object g(Continuation continuation) {
        return ((a1.h) ((l1) this.f27858i.getValue())).a(new m1(null), continuation);
    }

    @Override // y0.j
    public final Flow getData() {
        return this.f27855f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(java.lang.Object r12, boolean r13, kotlin.coroutines.Continuation r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof y0.s0
            if (r0 == 0) goto L13
            r0 = r14
            y0.s0 r0 = (y0.s0) r0
            int r1 = r0.f27840f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27840f = r1
            goto L18
        L13:
            y0.s0 r0 = new y0.s0
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f27838c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f27840f
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.jvm.internal.Ref$IntRef r12 = r0.f27837b
            kotlin.ResultKt.throwOnFailure(r14)
            goto L5c
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            kotlin.ResultKt.throwOnFailure(r14)
            kotlin.jvm.internal.Ref$IntRef r14 = new kotlin.jvm.internal.Ref$IntRef
            r14.<init>()
            kotlin.Lazy r2 = r11.f27858i
            java.lang.Object r2 = r2.getValue()
            y0.l1 r2 = (y0.l1) r2
            y0.t0 r10 = new y0.t0
            r9 = 0
            r4 = r10
            r5 = r14
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f27837b = r14
            r0.f27840f = r3
            a1.h r2 = (a1.h) r2
            java.lang.Object r12 = r2.b(r10, r0)
            if (r12 != r1) goto L5b
            return r1
        L5b:
            r12 = r14
        L5c:
            int r12 = r12.element
            java.lang.Integer r12 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.u0.h(java.lang.Object, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
