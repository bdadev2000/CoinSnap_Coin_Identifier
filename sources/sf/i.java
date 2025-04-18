package sf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class i extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f25038b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f25039c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, Continuation continuation) {
        super(2, continuation);
        this.f25039c = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.f25039c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x002e -> B:5:0x0031). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f25038b
            r2 = 1
            if (r1 == 0) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = r7
            goto L31
        L10:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L18:
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = r7
        L1c:
            sf.j r1 = r8.f25039c
            long r3 = r1.f25042f
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L3e
            r8.f25038b = r2
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r1 = kotlinx.coroutines.DelayKt.delay(r3, r8)
            if (r1 != r0) goto L31
            return r0
        L31:
            sf.j r1 = r8.f25039c
            long r3 = r1.f25042f
            r5 = -1
            long r3 = r3 + r5
            r1.f25042f = r3
            r1.f(r3)
            goto L1c
        L3e:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: sf.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
