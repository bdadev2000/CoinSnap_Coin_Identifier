package y0;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class d1 extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public Function2 f27708b;

    /* renamed from: c, reason: collision with root package name */
    public int f27709c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e1 f27710d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(e1 e1Var, Continuation continuation) {
        super(2, continuation);
        this.f27710d = e1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new d1(this.f27710d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0056 -> B:6:0x0059). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f27709c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = r6
            goto L59
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            kotlin.jvm.functions.Function2 r1 = r6.f27708b
            kotlin.ResultKt.throwOnFailure(r7)
            r4 = r1
            r1 = r7
            r7 = r6
            goto L4d
        L24:
            kotlin.ResultKt.throwOnFailure(r7)
            y0.e1 r7 = r6.f27710d
            fb.c r7 = r7.f27722d
            int r7 = r7.w()
            if (r7 <= 0) goto L33
            r7 = r3
            goto L34
        L33:
            r7 = 0
        L34:
            if (r7 == 0) goto L6a
            r7 = r6
        L37:
            y0.e1 r1 = r7.f27710d
            kotlinx.coroutines.CoroutineScope r4 = r1.a
            kotlinx.coroutines.CoroutineScopeKt.ensureActive(r4)
            kotlin.jvm.functions.Function2 r4 = r1.f27720b
            r7.f27708b = r4
            r7.f27709c = r3
            kotlinx.coroutines.channels.Channel r1 = r1.f27721c
            java.lang.Object r1 = r1.receive(r7)
            if (r1 != r0) goto L4d
            return r0
        L4d:
            r5 = 0
            r7.f27708b = r5
            r7.f27709c = r2
            java.lang.Object r1 = r4.invoke(r1, r7)
            if (r1 != r0) goto L59
            return r0
        L59:
            y0.e1 r1 = r7.f27710d
            fb.c r1 = r1.f27722d
            java.lang.Object r1 = r1.f17773c
            java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1
            int r1 = r1.decrementAndGet()
            if (r1 != 0) goto L37
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L6a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.d1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
