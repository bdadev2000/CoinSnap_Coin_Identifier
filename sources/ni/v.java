package ni;

import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes5.dex */
public final class v implements f {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation f22891b;

    public /* synthetic */ v(CancellableContinuationImpl cancellableContinuationImpl, int i10) {
        this.a = i10;
        this.f22891b = cancellableContinuationImpl;
    }

    @Override // ni.f
    public final void onFailure(c call, Throwable t5) {
        int i10 = this.a;
        CancellableContinuation cancellableContinuation = this.f22891b;
        switch (i10) {
            case 0:
                Intrinsics.checkParameterIsNotNull(call, "call");
                Intrinsics.checkParameterIsNotNull(t5, "t");
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m145constructorimpl(ResultKt.createFailure(t5)));
                return;
            case 1:
                Intrinsics.checkParameterIsNotNull(call, "call");
                Intrinsics.checkParameterIsNotNull(t5, "t");
                Result.Companion companion2 = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m145constructorimpl(ResultKt.createFailure(t5)));
                return;
            default:
                Intrinsics.checkParameterIsNotNull(call, "call");
                Intrinsics.checkParameterIsNotNull(t5, "t");
                Result.Companion companion3 = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m145constructorimpl(ResultKt.createFailure(t5)));
                return;
        }
    }

    @Override // ni.f
    public final void onResponse(c call, s0 response) {
        int i10 = this.a;
        CancellableContinuation cancellableContinuation = this.f22891b;
        switch (i10) {
            case 0:
                Intrinsics.checkParameterIsNotNull(call, "call");
                Intrinsics.checkParameterIsNotNull(response, "response");
                if (response.a.j()) {
                    Object obj = response.f22877b;
                    if (obj == null) {
                        wh.o0 request = call.request();
                        request.getClass();
                        Intrinsics.checkNotNullParameter(t.class, "type");
                        Object cast = t.class.cast(request.f27154e.get(t.class));
                        if (cast == null) {
                            Intrinsics.throwNpe();
                        }
                        Intrinsics.checkExpressionValueIsNotNull(cast, "call.request().tag(Invocation::class.java)!!");
                        Method method = ((t) cast).a;
                        StringBuilder sb2 = new StringBuilder("Response from ");
                        Intrinsics.checkExpressionValueIsNotNull(method, "method");
                        Class<?> declaringClass = method.getDeclaringClass();
                        Intrinsics.checkExpressionValueIsNotNull(declaringClass, "method.declaringClass");
                        sb2.append(declaringClass.getName());
                        sb2.append('.');
                        sb2.append(method.getName());
                        sb2.append(" was null but response body type was declared as non-null");
                        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException(sb2.toString());
                        Result.Companion companion = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m145constructorimpl(ResultKt.createFailure(kotlinNullPointerException)));
                        return;
                    }
                    cancellableContinuation.resumeWith(Result.m145constructorimpl(obj));
                    return;
                }
                p pVar = new p(response);
                Result.Companion companion2 = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m145constructorimpl(ResultKt.createFailure(pVar)));
                return;
            case 1:
                Intrinsics.checkParameterIsNotNull(call, "call");
                Intrinsics.checkParameterIsNotNull(response, "response");
                if (response.a.j()) {
                    cancellableContinuation.resumeWith(Result.m145constructorimpl(response.f22877b));
                    return;
                }
                p pVar2 = new p(response);
                Result.Companion companion3 = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m145constructorimpl(ResultKt.createFailure(pVar2)));
                return;
            default:
                Intrinsics.checkParameterIsNotNull(call, "call");
                Intrinsics.checkParameterIsNotNull(response, "response");
                cancellableContinuation.resumeWith(Result.m145constructorimpl(response));
                return;
        }
    }
}
