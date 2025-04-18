package retrofit2;

import b1.f0;
import b1.k;
import b1.l;
import com.google.firebase.analytics.FirebaseAnalytics;
import h0.g;
import java.lang.reflect.Method;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class KotlinExtensions {
    @Nullable
    public static final <T> Object await(@NotNull Call<T> call, @NotNull g gVar) {
        final l lVar = new l(1, f0.r(gVar));
        lVar.z(new KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$1(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$2$2
            @Override // retrofit2.Callback
            public void onFailure(@NotNull Call<T> call2, @NotNull Throwable th) {
                p0.a.t(call2, "call");
                p0.a.t(th, "t");
                k.this.resumeWith(q.d(th));
            }

            @Override // retrofit2.Callback
            public void onResponse(@NotNull Call<T> call2, @NotNull Response<T> response) {
                p0.a.t(call2, "call");
                p0.a.t(response, "response");
                if (!response.isSuccessful()) {
                    k.this.resumeWith(q.d(new HttpException(response)));
                    return;
                }
                T body = response.body();
                if (body != null) {
                    k.this.resumeWith(body);
                    return;
                }
                Object tag = call2.request().tag(Invocation.class);
                if (tag == null) {
                    NullPointerException nullPointerException = new NullPointerException();
                    p0.a.v0(p0.a.class.getName(), nullPointerException);
                    throw nullPointerException;
                }
                Method method = ((Invocation) tag).method();
                StringBuilder sb = new StringBuilder("Response from ");
                p0.a.o(method, FirebaseAnalytics.Param.METHOD);
                Class<?> declaringClass = method.getDeclaringClass();
                p0.a.o(declaringClass, "method.declaringClass");
                sb.append(declaringClass.getName());
                sb.append('.');
                sb.append(method.getName());
                sb.append(" was null but response body type was declared as non-null");
                k.this.resumeWith(q.d(new NullPointerException(sb.toString())));
            }
        });
        Object o2 = lVar.o();
        i0.a aVar = i0.a.f30806a;
        return o2;
    }

    @Nullable
    public static final <T> Object awaitNullable(@NotNull Call<T> call, @NotNull g gVar) {
        final l lVar = new l(1, f0.r(gVar));
        lVar.z(new KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$2(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$4$2
            @Override // retrofit2.Callback
            public void onFailure(@NotNull Call<T> call2, @NotNull Throwable th) {
                p0.a.t(call2, "call");
                p0.a.t(th, "t");
                k.this.resumeWith(q.d(th));
            }

            @Override // retrofit2.Callback
            public void onResponse(@NotNull Call<T> call2, @NotNull Response<T> response) {
                p0.a.t(call2, "call");
                p0.a.t(response, "response");
                if (response.isSuccessful()) {
                    k.this.resumeWith(response.body());
                } else {
                    k.this.resumeWith(q.d(new HttpException(response)));
                }
            }
        });
        Object o2 = lVar.o();
        i0.a aVar = i0.a.f30806a;
        return o2;
    }

    @Nullable
    public static final <T> Object awaitResponse(@NotNull Call<T> call, @NotNull g gVar) {
        final l lVar = new l(1, f0.r(gVar));
        lVar.z(new KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$awaitResponse$2$2
            @Override // retrofit2.Callback
            public void onFailure(@NotNull Call<T> call2, @NotNull Throwable th) {
                p0.a.t(call2, "call");
                p0.a.t(th, "t");
                k.this.resumeWith(q.d(th));
            }

            @Override // retrofit2.Callback
            public void onResponse(@NotNull Call<T> call2, @NotNull Response<T> response) {
                p0.a.t(call2, "call");
                p0.a.t(response, "response");
                k.this.resumeWith(response);
            }
        });
        Object o2 = lVar.o();
        i0.a aVar = i0.a.f30806a;
        return o2;
    }

    public static final <T> T create(@NotNull Retrofit retrofit) {
        p0.a.t(retrofit, "$this$create");
        p0.a.A0();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object suspendAndThrow(@org.jetbrains.annotations.NotNull final java.lang.Exception r4, @org.jetbrains.annotations.NotNull h0.g r5) {
        /*
            boolean r0 = r5 instanceof retrofit2.KotlinExtensions$suspendAndThrow$1
            if (r0 == 0) goto L13
            r0 = r5
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = (retrofit2.KotlinExtensions$suspendAndThrow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = new retrofit2.KotlinExtensions$suspendAndThrow$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            i0.a r1 = i0.a.f30806a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            java.lang.Exception r4 = (java.lang.Exception) r4
            kotlin.jvm.internal.q.m(r5)
            d0.b0 r4 = d0.b0.f30125a
            return r4
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.jvm.internal.q.m(r5)
            r0.L$0 = r4
            r0.label = r3
            h1.d r5 = b1.o0.f22355a
            h0.l r2 = r0.getContext()
            retrofit2.KotlinExtensions$suspendAndThrow$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1 r3 = new retrofit2.KotlinExtensions$suspendAndThrow$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1
            r3.<init>()
            r5.h0(r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.KotlinExtensions.suspendAndThrow(java.lang.Exception, h0.g):java.lang.Object");
    }
}
