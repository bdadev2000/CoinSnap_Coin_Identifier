package androidx.compose.animation.core;

import androidx.compose.runtime.State;
import b1.d0;
import d0.b0;
import d1.f;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", l = {419}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class AnimateAsStateKt$animateValueAsState$3$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public d1.a f2012a;

    /* renamed from: b, reason: collision with root package name */
    public int f2013b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f2014c;
    public final /* synthetic */ f d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Animatable f2015f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ State f2016g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ State f2017h;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1", f = "AnimateAsState.kt", l = {428}, m = "invokeSuspend")
    /* renamed from: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f2018a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f2019b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Animatable f2020c;
        public final /* synthetic */ State d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ State f2021f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Object obj, Animatable animatable, State state, State state2, g gVar) {
            super(2, gVar);
            this.f2019b = obj;
            this.f2020c = animatable;
            this.d = state;
            this.f2021f = state2;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass1(this.f2019b, this.f2020c, this.d, this.f2021f, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f2018a;
            Animatable animatable = this.f2020c;
            if (i2 == 0) {
                q.m(obj);
                if (!p0.a.g(this.f2019b, animatable.e.getValue())) {
                    Animatable animatable2 = this.f2020c;
                    Object obj2 = this.f2019b;
                    SpringSpec springSpec = AnimateAsStateKt.f2009a;
                    AnimationSpec animationSpec = (AnimationSpec) this.d.getValue();
                    this.f2018a = 1;
                    if (Animatable.c(animatable2, obj2, animationSpec, null, null, this, 12) == aVar) {
                        return aVar;
                    }
                }
                return b0.f30125a;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
            SpringSpec springSpec2 = AnimateAsStateKt.f2009a;
            l lVar = (l) this.f2021f.getValue();
            if (lVar != null) {
                lVar.invoke(animatable.d());
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimateAsStateKt$animateValueAsState$3$1(f fVar, Animatable animatable, State state, State state2, g gVar) {
        super(2, gVar);
        this.d = fVar;
        this.f2015f = animatable;
        this.f2016g = state;
        this.f2017h = state2;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        AnimateAsStateKt$animateValueAsState$3$1 animateAsStateKt$animateValueAsState$3$1 = new AnimateAsStateKt$animateValueAsState$3$1(this.d, this.f2015f, this.f2016g, this.f2017h, gVar);
        animateAsStateKt$animateValueAsState$3$1.f2014c = obj;
        return animateAsStateKt$animateValueAsState$3$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((AnimateAsStateKt$animateValueAsState$3$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0048  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003d -> B:5:0x0040). Please report as a decompilation issue!!! */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f2013b
            r3 = 1
            if (r2 == 0) goto L20
            if (r2 != r3) goto L18
            d1.a r2 = r0.f2012a
            java.lang.Object r4 = r0.f2014c
            b1.d0 r4 = (b1.d0) r4
            kotlin.jvm.internal.q.m(r18)
            r6 = r18
            r5 = r0
            goto L40
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L20:
            kotlin.jvm.internal.q.m(r18)
            java.lang.Object r2 = r0.f2014c
            b1.d0 r2 = (b1.d0) r2
            d1.f r4 = r0.d
            d1.a r4 = r4.iterator()
            r5 = r0
            r16 = r4
            r4 = r2
            r2 = r16
        L33:
            r5.f2014c = r4
            r5.f2012a = r2
            r5.f2013b = r3
            java.lang.Object r6 = r2.b(r5)
            if (r6 != r1) goto L40
            return r1
        L40:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L71
            java.lang.Object r6 = r2.c()
            d1.f r7 = r5.d
            java.lang.Object r7 = r7.d()
            boolean r8 = r7 instanceof d1.h
            r9 = 0
            if (r8 != 0) goto L58
            goto L59
        L58:
            r7 = r9
        L59:
            if (r7 != 0) goto L5d
            r11 = r6
            goto L5e
        L5d:
            r11 = r7
        L5e:
            androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1 r6 = new androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1
            androidx.compose.animation.core.Animatable r12 = r5.f2015f
            androidx.compose.runtime.State r13 = r5.f2016g
            androidx.compose.runtime.State r14 = r5.f2017h
            r15 = 0
            r10 = r6
            r10.<init>(r11, r12, r13, r14, r15)
            r7 = 3
            r8 = 0
            kotlin.jvm.internal.e.v(r4, r9, r8, r6, r7)
            goto L33
        L71:
            d0.b0 r1 = d0.b0.f30125a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
