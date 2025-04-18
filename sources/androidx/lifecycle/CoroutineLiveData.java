package androidx.lifecycle;

import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class CoroutineLiveData<T> extends MediatorLiveData<T> {

    /* renamed from: l, reason: collision with root package name */
    public EmittedSource f19944l;

    /* renamed from: androidx.lifecycle.CoroutineLiveData$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends r implements q0.a {
        @Override // q0.a
        public final Object invoke() {
            throw null;
        }
    }

    @Override // androidx.lifecycle.MediatorLiveData, androidx.lifecycle.LiveData
    public final void e() {
        throw null;
    }

    @Override // androidx.lifecycle.MediatorLiveData, androidx.lifecycle.LiveData
    public final void f() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(h0.g r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.lifecycle.CoroutineLiveData$clearSource$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.lifecycle.CoroutineLiveData$clearSource$1 r0 = (androidx.lifecycle.CoroutineLiveData$clearSource$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.lifecycle.CoroutineLiveData$clearSource$1 r0 = new androidx.lifecycle.CoroutineLiveData$clearSource$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f19946b
            i0.a r1 = i0.a.f30806a
            int r2 = r0.d
            d0.b0 r3 = d0.b0.f30125a
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L34
            if (r2 != r5) goto L2c
            androidx.lifecycle.CoroutineLiveData r0 = r0.f19945a
            kotlin.jvm.internal.q.m(r7)
            goto L58
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            kotlin.jvm.internal.q.m(r7)
            androidx.lifecycle.EmittedSource r7 = r6.f19944l
            if (r7 == 0) goto L57
            r0.f19945a = r6
            r0.d = r5
            h1.d r2 = b1.o0.f22355a
            b1.u1 r2 = g1.u.f30639a
            c1.e r2 = (c1.e) r2
            c1.e r2 = r2.f22411g
            androidx.lifecycle.EmittedSource$disposeNow$2 r5 = new androidx.lifecycle.EmittedSource$disposeNow$2
            r5.<init>(r7, r4)
            java.lang.Object r7 = kotlin.jvm.internal.e.G(r0, r2, r5)
            if (r7 != r1) goto L53
            goto L54
        L53:
            r7 = r3
        L54:
            if (r7 != r1) goto L57
            return r1
        L57:
            r0 = r6
        L58:
            r0.f19944l = r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.CoroutineLiveData.j(h0.g):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(androidx.lifecycle.LiveData r6, h0.g r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.lifecycle.CoroutineLiveData$emitSource$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.lifecycle.CoroutineLiveData$emitSource$1 r0 = (androidx.lifecycle.CoroutineLiveData$emitSource$1) r0
            int r1 = r0.f19951f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19951f = r1
            goto L18
        L13:
            androidx.lifecycle.CoroutineLiveData$emitSource$1 r0 = new androidx.lifecycle.CoroutineLiveData$emitSource$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f19950c
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f19951f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            androidx.lifecycle.CoroutineLiveData r6 = r0.f19948a
            kotlin.jvm.internal.q.m(r7)
            goto L6b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            androidx.lifecycle.LiveData r6 = r0.f19949b
            androidx.lifecycle.CoroutineLiveData r2 = r0.f19948a
            kotlin.jvm.internal.q.m(r7)
            r7 = r6
            r6 = r2
            goto L50
        L3e:
            kotlin.jvm.internal.q.m(r7)
            r0.f19948a = r5
            r0.f19949b = r6
            r0.f19951f = r4
            java.lang.Object r7 = r5.j(r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            r7 = r6
            r6 = r5
        L50:
            r0.f19948a = r6
            r2 = 0
            r0.f19949b = r2
            r0.f19951f = r3
            h1.d r3 = b1.o0.f22355a
            b1.u1 r3 = g1.u.f30639a
            c1.e r3 = (c1.e) r3
            c1.e r3 = r3.f22411g
            androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2 r4 = new androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2
            r4.<init>(r6, r7, r2)
            java.lang.Object r7 = kotlin.jvm.internal.e.G(r0, r3, r4)
            if (r7 != r1) goto L6b
            return r1
        L6b:
            androidx.lifecycle.EmittedSource r7 = (androidx.lifecycle.EmittedSource) r7
            r6.f19944l = r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.CoroutineLiveData.k(androidx.lifecycle.LiveData, h0.g):java.lang.Object");
    }
}
