package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import b1.d0;
import b1.o0;
import d0.b0;
import g1.u;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.p;

@e(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {Opcodes.BASTORE}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f20063a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f20064b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f20065c;
    public final /* synthetic */ Lifecycle.State d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f20066f;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {Opcodes.IF_ACMPNE}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public f0 f20067a;

        /* renamed from: b, reason: collision with root package name */
        public f0 f20068b;

        /* renamed from: c, reason: collision with root package name */
        public d0 f20069c;
        public p d;

        /* renamed from: f, reason: collision with root package name */
        public int f20070f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Lifecycle f20071g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Lifecycle.State f20072h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ d0 f20073i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ p f20074j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, d0 d0Var, p pVar, g gVar) {
            super(2, gVar);
            this.f20071g = lifecycle;
            this.f20072h = state;
            this.f20073i = d0Var;
            this.f20074j = pVar;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass1(this.f20071g, this.f20072h, this.f20073i, this.f20074j, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.jvm.internal.f0] */
        /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.jvm.internal.f0] */
        @Override // j0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r1 = r17
                i0.a r0 = i0.a.f30806a
                int r2 = r1.f20070f
                d0.b0 r3 = d0.b0.f30125a
                androidx.lifecycle.Lifecycle r5 = r1.f20071g
                r6 = 1
                if (r2 == 0) goto L22
                if (r2 != r6) goto L1a
                kotlin.jvm.internal.f0 r2 = r1.f20068b
                kotlin.jvm.internal.f0 r6 = r1.f20067a
                kotlin.jvm.internal.q.m(r18)     // Catch: java.lang.Throwable -> L17
                goto L7f
            L17:
                r0 = move-exception
                goto L96
            L1a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L22:
                kotlin.jvm.internal.q.m(r18)
                androidx.lifecycle.Lifecycle$State r2 = r5.b()
                androidx.lifecycle.Lifecycle$State r7 = androidx.lifecycle.Lifecycle.State.f19987a
                if (r2 != r7) goto L2e
                return r3
            L2e:
                kotlin.jvm.internal.f0 r2 = new kotlin.jvm.internal.f0
                r2.<init>()
                kotlin.jvm.internal.f0 r7 = new kotlin.jvm.internal.f0
                r7.<init>()
                androidx.lifecycle.Lifecycle$State r8 = r1.f20072h     // Catch: java.lang.Throwable -> L93
                b1.d0 r11 = r1.f20073i     // Catch: java.lang.Throwable -> L93
                q0.p r15 = r1.f20074j     // Catch: java.lang.Throwable -> L93
                r1.f20067a = r2     // Catch: java.lang.Throwable -> L93
                r1.f20068b = r7     // Catch: java.lang.Throwable -> L93
                r1.f20069c = r11     // Catch: java.lang.Throwable -> L93
                r1.d = r15     // Catch: java.lang.Throwable -> L93
                r1.f20070f = r6     // Catch: java.lang.Throwable -> L93
                b1.l r14 = new b1.l     // Catch: java.lang.Throwable -> L93
                h0.g r9 = b1.f0.r(r17)     // Catch: java.lang.Throwable -> L93
                r14.<init>(r6, r9)     // Catch: java.lang.Throwable -> L93
                r14.p()     // Catch: java.lang.Throwable -> L93
                androidx.lifecycle.Lifecycle$Event$Companion r6 = androidx.lifecycle.Lifecycle.Event.Companion     // Catch: java.lang.Throwable -> L93
                r6.getClass()     // Catch: java.lang.Throwable -> L93
                androidx.lifecycle.Lifecycle$Event r9 = androidx.lifecycle.Lifecycle.Event.Companion.c(r8)     // Catch: java.lang.Throwable -> L93
                androidx.lifecycle.Lifecycle$Event r12 = androidx.lifecycle.Lifecycle.Event.Companion.a(r8)     // Catch: java.lang.Throwable -> L93
                i1.d r6 = i1.e.a()     // Catch: java.lang.Throwable -> L93
                androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 r13 = new androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1     // Catch: java.lang.Throwable -> L93
                r8 = r13
                r10 = r2
                r4 = r13
                r13 = r14
                r16 = r14
                r14 = r6
                r8.<init>()     // Catch: java.lang.Throwable -> L93
                r7.f30930a = r4     // Catch: java.lang.Throwable -> L93
                r5.a(r4)     // Catch: java.lang.Throwable -> L93
                java.lang.Object r4 = r16.o()     // Catch: java.lang.Throwable -> L93
                if (r4 != r0) goto L7d
                return r0
            L7d:
                r6 = r2
                r2 = r7
            L7f:
                java.lang.Object r0 = r6.f30930a
                b1.h1 r0 = (b1.h1) r0
                if (r0 == 0) goto L89
                r4 = 0
                r0.a(r4)
            L89:
                java.lang.Object r0 = r2.f30930a
                androidx.lifecycle.LifecycleEventObserver r0 = (androidx.lifecycle.LifecycleEventObserver) r0
                if (r0 == 0) goto L92
                r5.d(r0)
            L92:
                return r3
            L93:
                r0 = move-exception
                r6 = r2
                r2 = r7
            L96:
                java.lang.Object r3 = r6.f30930a
                b1.h1 r3 = (b1.h1) r3
                if (r3 == 0) goto La0
                r4 = 0
                r3.a(r4)
            La0:
                java.lang.Object r2 = r2.f30930a
                androidx.lifecycle.LifecycleEventObserver r2 = (androidx.lifecycle.LifecycleEventObserver) r2
                if (r2 == 0) goto La9
                r5.d(r2)
            La9:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(Lifecycle lifecycle, Lifecycle.State state, p pVar, g gVar) {
        super(2, gVar);
        this.f20065c = lifecycle;
        this.d = state;
        this.f20066f = pVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.f20065c, this.d, this.f20066f, gVar);
        repeatOnLifecycleKt$repeatOnLifecycle$3.f20064b = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f20063a;
        if (i2 == 0) {
            q.m(obj);
            d0 d0Var = (d0) this.f20064b;
            h1.d dVar = o0.f22355a;
            c1.e eVar = ((c1.e) u.f30639a).f22411g;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f20065c, this.d, d0Var, this.f20066f, null);
            this.f20063a = 1;
            if (kotlin.jvm.internal.e.G(this, eVar, anonymousClass1) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0.f30125a;
    }
}
