package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;

@e(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1", f = "InfiniteTransition.kt", l = {Opcodes.PUTFIELD, 205}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class InfiniteTransition$run$1$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public c0 f2110a;

    /* renamed from: b, reason: collision with root package name */
    public int f2111b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f2112c;
    public final /* synthetic */ MutableState d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InfiniteTransition f2113f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.animation.core.InfiniteTransition$run$1$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MutableState f2114a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InfiniteTransition f2115b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c0 f2116c;
        public final /* synthetic */ d0 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableState mutableState, InfiniteTransition infiniteTransition, c0 c0Var, d0 d0Var) {
            super(1);
            this.f2114a = mutableState;
            this.f2115b = infiniteTransition;
            this.f2116c = c0Var;
            this.d = d0Var;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            boolean z2;
            long longValue = ((Number) obj).longValue();
            State state = (State) this.f2114a.getValue();
            long longValue2 = state != null ? ((Number) state.getValue()).longValue() : longValue;
            InfiniteTransition infiniteTransition = this.f2115b;
            long j2 = infiniteTransition.f2100c;
            MutableVector mutableVector = infiniteTransition.f2098a;
            d0 d0Var = this.d;
            int i2 = 0;
            c0 c0Var = this.f2116c;
            if (j2 == Long.MIN_VALUE || c0Var.f30922a != SuspendAnimationKt.i(d0Var.getCoroutineContext())) {
                infiniteTransition.f2100c = longValue;
                int i3 = mutableVector.f14144c;
                if (i3 > 0) {
                    Object[] objArr = mutableVector.f14142a;
                    int i4 = 0;
                    do {
                        ((InfiniteTransition.TransitionAnimationState) objArr[i4]).f2107i = true;
                        i4++;
                    } while (i4 < i3);
                }
                c0Var.f30922a = SuspendAnimationKt.i(d0Var.getCoroutineContext());
            }
            float f2 = c0Var.f30922a;
            if (f2 == 0.0f) {
                int i5 = mutableVector.f14144c;
                if (i5 > 0) {
                    Object[] objArr2 = mutableVector.f14142a;
                    do {
                        InfiniteTransition.TransitionAnimationState transitionAnimationState = (InfiniteTransition.TransitionAnimationState) objArr2[i2];
                        transitionAnimationState.d.setValue(transitionAnimationState.f2105g.f2262c);
                        transitionAnimationState.f2107i = true;
                        i2++;
                    } while (i2 < i5);
                }
            } else {
                long j3 = ((float) (longValue2 - infiniteTransition.f2100c)) / f2;
                int i6 = mutableVector.f14144c;
                if (i6 > 0) {
                    Object[] objArr3 = mutableVector.f14142a;
                    z2 = true;
                    int i7 = 0;
                    do {
                        InfiniteTransition.TransitionAnimationState transitionAnimationState2 = (InfiniteTransition.TransitionAnimationState) objArr3[i7];
                        if (!transitionAnimationState2.f2106h) {
                            InfiniteTransition.this.f2099b.setValue(Boolean.FALSE);
                            if (transitionAnimationState2.f2107i) {
                                transitionAnimationState2.f2107i = false;
                                transitionAnimationState2.f2108j = j3;
                            }
                            long j4 = j3 - transitionAnimationState2.f2108j;
                            transitionAnimationState2.d.setValue(transitionAnimationState2.f2105g.f(j4));
                            transitionAnimationState2.f2106h = transitionAnimationState2.f2105g.c(j4);
                        }
                        if (!transitionAnimationState2.f2106h) {
                            z2 = false;
                        }
                        i7++;
                    } while (i7 < i6);
                } else {
                    z2 = true;
                }
                infiniteTransition.d.setValue(Boolean.valueOf(!z2));
            }
            return b0.f30125a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.animation.core.InfiniteTransition$run$1$1$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass2 extends r implements q0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d0 f2117a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(d0 d0Var) {
            super(0);
            this.f2117a = d0Var;
        }

        @Override // q0.a
        public final Object invoke() {
            return Float.valueOf(SuspendAnimationKt.i(this.f2117a.getCoroutineContext()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1$3", f = "InfiniteTransition.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.compose.animation.core.InfiniteTransition$run$1$1$3, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass3 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ float f2118a;

        /* JADX WARN: Type inference failed for: r0v0, types: [j0.i, h0.g, androidx.compose.animation.core.InfiniteTransition$run$1$1$3] */
        @Override // j0.a
        public final g create(Object obj, g gVar) {
            ?? iVar = new i(2, gVar);
            iVar.f2118a = ((Number) obj).floatValue();
            return iVar;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create(Float.valueOf(((Number) obj).floatValue()), (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            q.m(obj);
            return Boolean.valueOf(this.f2118a > 0.0f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfiniteTransition$run$1$1(MutableState mutableState, InfiniteTransition infiniteTransition, g gVar) {
        super(2, gVar);
        this.d = mutableState;
        this.f2113f = infiniteTransition;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        InfiniteTransition$run$1$1 infiniteTransition$run$1$1 = new InfiniteTransition$run$1$1(this.d, this.f2113f, gVar);
        infiniteTransition$run$1$1.f2112c = obj;
        return infiniteTransition$run$1$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((InfiniteTransition$run$1$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0051 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.jvm.internal.c0] */
    /* JADX WARN: Type inference failed for: r6v1, types: [j0.i, q0.p] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0057 -> B:7:0x003c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0072 -> B:7:0x003c). Please report as a decompilation issue!!! */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            i0.a r0 = i0.a.f30806a
            int r1 = r8.f2111b
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L1f
            if (r1 != r3) goto L17
            kotlin.jvm.internal.c0 r1 = r8.f2110a
            java.lang.Object r4 = r8.f2112c
            b1.d0 r4 = (b1.d0) r4
            kotlin.jvm.internal.q.m(r9)
            r9 = r4
            goto L3b
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            kotlin.jvm.internal.c0 r1 = r8.f2110a
            java.lang.Object r4 = r8.f2112c
            b1.d0 r4 = (b1.d0) r4
            kotlin.jvm.internal.q.m(r9)
            r9 = r4
            r4 = r8
            goto L52
        L2b:
            kotlin.jvm.internal.q.m(r9)
            java.lang.Object r9 = r8.f2112c
            b1.d0 r9 = (b1.d0) r9
            kotlin.jvm.internal.c0 r1 = new kotlin.jvm.internal.c0
            r1.<init>()
            r4 = 1065353216(0x3f800000, float:1.0)
            r1.f30922a = r4
        L3b:
            r4 = r8
        L3c:
            androidx.compose.animation.core.InfiniteTransition$run$1$1$1 r5 = new androidx.compose.animation.core.InfiniteTransition$run$1$1$1
            androidx.compose.runtime.MutableState r6 = r4.d
            androidx.compose.animation.core.InfiniteTransition r7 = r4.f2113f
            r5.<init>(r6, r7, r1, r9)
            r4.f2112c = r9
            r4.f2110a = r1
            r4.f2111b = r2
            java.lang.Object r5 = androidx.compose.animation.core.InfiniteAnimationPolicyKt.a(r5, r4)
            if (r5 != r0) goto L52
            return r0
        L52:
            float r5 = r1.f30922a
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L3c
            androidx.compose.animation.core.InfiniteTransition$run$1$1$2 r5 = new androidx.compose.animation.core.InfiniteTransition$run$1$1$2
            r5.<init>(r9)
            e1.j r5 = androidx.compose.runtime.SnapshotStateKt.l(r5)
            androidx.compose.animation.core.InfiniteTransition$run$1$1$3 r6 = new androidx.compose.animation.core.InfiniteTransition$run$1$1$3
            r7 = 0
            r6.<init>(r3, r7)
            r4.f2112c = r9
            r4.f2110a = r1
            r4.f2111b = r3
            java.lang.Object r5 = p0.a.f0(r5, r6, r4)
            if (r5 != r0) goto L3c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.InfiniteTransition$run$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
