package androidx.compose.runtime;

import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", l = {1054}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class Recomposer$recompositionRunner$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public androidx.compose.runtime.snapshots.a f13913a;

    /* renamed from: b, reason: collision with root package name */
    public int f13914b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f13915c;
    public final /* synthetic */ Recomposer d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f13916f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MonotonicFrameClock f13917g;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$3", f = "Recomposer.kt", l = {1055}, m = "invokeSuspend")
    /* renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2$3, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass3 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f13918a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f13919b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q f13920c;
        public final /* synthetic */ MonotonicFrameClock d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(q qVar, MonotonicFrameClock monotonicFrameClock, g gVar) {
            super(2, gVar);
            this.f13920c = qVar;
            this.d = monotonicFrameClock;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.f13920c, this.d, gVar);
            anonymousClass3.f13919b = obj;
            return anonymousClass3;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f13918a;
            if (i2 == 0) {
                kotlin.jvm.internal.q.m(obj);
                d0 d0Var = (d0) this.f13919b;
                this.f13918a = 1;
                if (this.f13920c.invoke(d0Var, this.d, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.jvm.internal.q.m(obj);
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$recompositionRunner$2(Recomposer recomposer, q qVar, MonotonicFrameClock monotonicFrameClock, g gVar) {
        super(2, gVar);
        this.d = recomposer;
        this.f13916f = qVar;
        this.f13917g = monotonicFrameClock;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        Recomposer$recompositionRunner$2 recomposer$recompositionRunner$2 = new Recomposer$recompositionRunner$2(this.d, this.f13916f, this.f13917g, gVar);
        recomposer$recompositionRunner$2.f13915c = obj;
        return recomposer$recompositionRunner$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((Recomposer$recompositionRunner$2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$recompositionRunner$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
