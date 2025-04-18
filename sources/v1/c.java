package v1;

import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;

/* loaded from: classes.dex */
public final class c extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public ChannelIterator f25839b;

    /* renamed from: c, reason: collision with root package name */
    public int f25840c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f0 f25841d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f25842f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Channel f25843g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Callable f25844h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Channel f25845i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f0 f0Var, d dVar, Channel channel, Callable callable, Channel channel2, Continuation continuation) {
        super(2, continuation);
        this.f25841d = f0Var;
        this.f25842f = dVar;
        this.f25843g = channel;
        this.f25844h = callable;
        this.f25845i = channel2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f25841d, this.f25842f, this.f25843g, this.f25844h, this.f25845i, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052 A[Catch: all -> 0x006c, TRY_LEAVE, TryCatch #1 {all -> 0x006c, blocks: (B:16:0x004a, B:18:0x0052), top: B:15:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0068 -> B:9:0x003a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f25840c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L25
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            kotlinx.coroutines.channels.ChannelIterator r1 = r7.f25839b
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L81
            goto L39
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            kotlinx.coroutines.channels.ChannelIterator r1 = r7.f25839b
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L81
            r4 = r1
            r1 = r0
            r0 = r7
            goto L4a
        L25:
            kotlin.ResultKt.throwOnFailure(r8)
            v1.f0 r8 = r7.f25841d
            v1.u r8 = r8.getInvalidationTracker()
            v1.d r1 = r7.f25842f
            r8.a(r1)
            kotlinx.coroutines.channels.Channel r8 = r7.f25843g     // Catch: java.lang.Throwable -> L81
            kotlinx.coroutines.channels.ChannelIterator r1 = r8.iterator()     // Catch: java.lang.Throwable -> L81
        L39:
            r8 = r7
        L3a:
            r8.f25839b = r1     // Catch: java.lang.Throwable -> L7c
            r8.f25840c = r3     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r4 = r1.hasNext(r8)     // Catch: java.lang.Throwable -> L7c
            if (r4 != r0) goto L45
            return r0
        L45:
            r6 = r0
            r0 = r8
            r8 = r4
            r4 = r1
            r1 = r6
        L4a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L6c
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L6c
            if (r8 == 0) goto L6e
            r4.next()     // Catch: java.lang.Throwable -> L6c
            java.util.concurrent.Callable r8 = r0.f25844h     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r8 = r8.call()     // Catch: java.lang.Throwable -> L6c
            kotlinx.coroutines.channels.Channel r5 = r0.f25845i     // Catch: java.lang.Throwable -> L6c
            r0.f25839b = r4     // Catch: java.lang.Throwable -> L6c
            r0.f25840c = r2     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r8 = r5.send(r8, r0)     // Catch: java.lang.Throwable -> L6c
            if (r8 != r1) goto L68
            return r1
        L68:
            r8 = r0
            r0 = r1
            r1 = r4
            goto L3a
        L6c:
            r8 = move-exception
            goto L83
        L6e:
            v1.f0 r8 = r0.f25841d
            v1.u r8 = r8.getInvalidationTracker()
            v1.d r0 = r0.f25842f
            r8.d(r0)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L7c:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
            goto L83
        L81:
            r8 = move-exception
            r0 = r7
        L83:
            v1.f0 r1 = r0.f25841d
            v1.u r1 = r1.getInvalidationTracker()
            v1.d r0 = r0.f25842f
            r1.d(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
