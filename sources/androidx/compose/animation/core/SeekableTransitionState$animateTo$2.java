package androidx.compose.animation.core;

import b1.d0;
import d0.b0;
import h0.g;
import i1.d;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2", f = "Transition.kt", l = {623}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SeekableTransitionState$animateTo$2 extends i implements l {

    /* renamed from: a, reason: collision with root package name */
    public int f2186a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Transition f2187b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SeekableTransitionState f2188c;
    public final /* synthetic */ Object d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ FiniteAnimationSpec f2189f;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1", f = "Transition.kt", l = {2191, 636, 638, 690, 692}, m = "invokeSuspend")
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public d f2190a;

        /* renamed from: b, reason: collision with root package name */
        public SeekableTransitionState f2191b;

        /* renamed from: c, reason: collision with root package name */
        public int f2192c;
        public final /* synthetic */ SeekableTransitionState d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Object f2193f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Transition f2194g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ FiniteAnimationSpec f2195h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FiniteAnimationSpec finiteAnimationSpec, SeekableTransitionState seekableTransitionState, Transition transition, Object obj, g gVar) {
            super(2, gVar);
            this.d = seekableTransitionState;
            this.f2193f = obj;
            this.f2194g = transition;
            this.f2195h = finiteAnimationSpec;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            SeekableTransitionState seekableTransitionState = this.d;
            Object obj2 = this.f2193f;
            return new AnonymousClass1(this.f2195h, seekableTransitionState, this.f2194g, obj2, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v11 java.lang.Object, still in use, count: 2, list:
              (r2v11 java.lang.Object) from 0x00ac: IF  (r2v11 java.lang.Object) == (r0v0 i0.a)  -> B:76:0x00ae A[HIDDEN]
              (r2v11 java.lang.Object) from 0x00ae: PHI (r2v12 java.lang.Object) = (r2v11 java.lang.Object), (r2v13 java.lang.Object), (r2v15 java.lang.Object) binds: [B:79:0x00ac, B:75:0x00a6, B:74:0x00a3] A[DONT_GENERATE, DONT_INLINE]
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
            	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
            	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
            	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:53)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
            */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0197 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0198  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0141  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0165  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x018a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x016a  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x00b9 A[RETURN] */
        /* JADX WARN: Type inference failed for: r2v21 */
        /* JADX WARN: Type inference failed for: r2v22, types: [androidx.compose.animation.core.SeekableTransitionState, i1.d] */
        /* JADX WARN: Type inference failed for: r2v26 */
        @Override // j0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instructions count: 420
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState$animateTo$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$animateTo$2(FiniteAnimationSpec finiteAnimationSpec, SeekableTransitionState seekableTransitionState, Transition transition, Object obj, g gVar) {
        super(1, gVar);
        this.f2187b = transition;
        this.f2188c = seekableTransitionState;
        this.d = obj;
        this.f2189f = finiteAnimationSpec;
    }

    @Override // j0.a
    public final g create(g gVar) {
        Transition transition = this.f2187b;
        return new SeekableTransitionState$animateTo$2(this.f2189f, this.f2188c, transition, this.d, gVar);
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return ((SeekableTransitionState$animateTo$2) create((g) obj)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f2186a;
        if (i2 == 0) {
            q.m(obj);
            SeekableTransitionState seekableTransitionState = this.f2188c;
            Object obj2 = this.d;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f2189f, seekableTransitionState, this.f2187b, obj2, null);
            this.f2186a = 1;
            if (p0.a.J(anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        this.f2187b.i();
        return b0.f30125a;
    }
}
