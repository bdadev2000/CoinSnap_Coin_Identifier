package androidx.compose.foundation.gestures;

import androidx.compose.runtime.SnapshotStateKt;
import b1.d0;
import d0.b0;
import e1.j;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;
import q0.a;
import q0.p;

@e(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", l = {1114}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AnchoredDraggableKt$restartable$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f3030a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3031b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f3032c;
    public final /* synthetic */ p d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1<T> implements e1.i {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f0 f3033a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d0 f3034b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p f3035c;

        /* JADX INFO: Access modifiers changed from: package-private */
        @e(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", l = {1120}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2, reason: invalid class name */
        /* loaded from: classes3.dex */
        public final class AnonymousClass2 extends i implements p {

            /* renamed from: a, reason: collision with root package name */
            public int f3036a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f3037b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f3038c;
            public final /* synthetic */ d0 d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(p pVar, Object obj, d0 d0Var, g gVar) {
                super(2, gVar);
                this.f3037b = pVar;
                this.f3038c = obj;
                this.d = d0Var;
            }

            @Override // j0.a
            public final g create(Object obj, g gVar) {
                return new AnonymousClass2(this.f3037b, this.f3038c, this.d, gVar);
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
            }

            @Override // j0.a
            public final Object invokeSuspend(Object obj) {
                i0.a aVar = i0.a.f30806a;
                int i2 = this.f3036a;
                if (i2 == 0) {
                    q.m(obj);
                    this.f3036a = 1;
                    if (this.f3037b.invoke(this.f3038c, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q.m(obj);
                }
                p0.a.m(this.d, new AnchoredDragFinishedSignal());
                return b0.f30125a;
            }
        }

        public AnonymousClass1(f0 f0Var, d0 d0Var, p pVar) {
            this.f3033a = f0Var;
            this.f3034b = d0Var;
            this.f3035c = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // e1.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r6, h0.g r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1
                if (r0 == 0) goto L13
                r0 = r7
                androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1) r0
                int r1 = r0.f3042f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f3042f = r1
                goto L18
            L13:
                androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f3041c
                i0.a r1 = i0.a.f30806a
                int r2 = r0.f3042f
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r6 = r0.f3040b
                java.lang.Object r0 = r0.f3039a
                androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2.AnonymousClass1) r0
                kotlin.jvm.internal.q.m(r7)
                goto L59
            L2d:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L35:
                kotlin.jvm.internal.q.m(r7)
                kotlin.jvm.internal.f0 r7 = r5.f3033a
                java.lang.Object r7 = r7.f30930a
                b1.h1 r7 = (b1.h1) r7
                if (r7 == 0) goto L58
                androidx.compose.foundation.gestures.AnchoredDragFinishedSignal r2 = new androidx.compose.foundation.gestures.AnchoredDragFinishedSignal
                r2.<init>()
                r7.a(r2)
                r0.f3039a = r5
                r0.f3040b = r6
                r0.getClass()
                r0.f3042f = r3
                java.lang.Object r7 = r7.v(r0)
                if (r7 != r1) goto L58
                return r1
            L58:
                r0 = r5
            L59:
                kotlin.jvm.internal.f0 r7 = r0.f3033a
                androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2 r1 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2
                q0.p r2 = r0.f3035c
                b1.d0 r0 = r0.f3034b
                r4 = 0
                r1.<init>(r2, r6, r0, r4)
                r6 = 4
                b1.a2 r6 = kotlin.jvm.internal.e.v(r0, r4, r6, r1, r3)
                r7.f30930a = r6
                d0.b0 r6 = d0.b0.f30125a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2.AnonymousClass1.emit(java.lang.Object, h0.g):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$restartable$2(a aVar, p pVar, g gVar) {
        super(2, gVar);
        this.f3032c = aVar;
        this.d = pVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        AnchoredDraggableKt$restartable$2 anchoredDraggableKt$restartable$2 = new AnchoredDraggableKt$restartable$2(this.f3032c, this.d, gVar);
        anchoredDraggableKt$restartable$2.f3031b = obj;
        return anchoredDraggableKt$restartable$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((AnchoredDraggableKt$restartable$2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f3030a;
        if (i2 == 0) {
            q.m(obj);
            d0 d0Var = (d0) this.f3031b;
            ?? obj2 = new Object();
            j l2 = SnapshotStateKt.l(this.f3032c);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(obj2, d0Var, this.d);
            this.f3030a = 1;
            if (l2.collect(anonymousClass1, this) == aVar) {
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
