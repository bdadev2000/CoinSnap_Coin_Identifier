package androidx.compose.foundation.gestures;

import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.f0;
import q0.l;
import q0.p;

@e(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1", f = "Draggable.kt", l = {431, 433, 435, 442, 444, 447}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DragGestureNode$startListeningForEvents$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public f0 f3329a;

    /* renamed from: b, reason: collision with root package name */
    public f0 f3330b;

    /* renamed from: c, reason: collision with root package name */
    public int f3331c;
    public /* synthetic */ Object d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ DragGestureNode f3332f;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1", f = "Draggable.kt", l = {438}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public f0 f3333a;

        /* renamed from: b, reason: collision with root package name */
        public int f3334b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f3335c;
        public final /* synthetic */ f0 d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ DragGestureNode f3336f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(f0 f0Var, DragGestureNode dragGestureNode, g gVar) {
            super(2, gVar);
            this.d = f0Var;
            this.f3336f = dragGestureNode;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.d, this.f3336f, gVar);
            anonymousClass1.f3335c = obj;
            return anonymousClass1;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((l) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0046 -> B:6:0x0062). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0055 -> B:5:0x005b). Please report as a decompilation issue!!! */
        @Override // j0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                i0.a r0 = i0.a.f30806a
                int r1 = r8.f3334b
                r2 = 1
                if (r1 == 0) goto L1f
                if (r1 != r2) goto L17
                kotlin.jvm.internal.f0 r1 = r8.f3333a
                java.lang.Object r3 = r8.f3335c
                q0.l r3 = (q0.l) r3
                kotlin.jvm.internal.q.m(r9)
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r8
                goto L5b
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                kotlin.jvm.internal.q.m(r9)
                java.lang.Object r9 = r8.f3335c
                q0.l r9 = (q0.l) r9
                r3 = r9
                r9 = r8
            L28:
                kotlin.jvm.internal.f0 r1 = r9.d
                java.lang.Object r4 = r1.f30930a
                boolean r5 = r4 instanceof androidx.compose.foundation.gestures.DragEvent.DragStopped
                if (r5 != 0) goto L65
                boolean r5 = r4 instanceof androidx.compose.foundation.gestures.DragEvent.DragCancelled
                if (r5 != 0) goto L65
                boolean r5 = r4 instanceof androidx.compose.foundation.gestures.DragEvent.DragDelta
                r6 = 0
                if (r5 == 0) goto L3c
                androidx.compose.foundation.gestures.DragEvent$DragDelta r4 = (androidx.compose.foundation.gestures.DragEvent.DragDelta) r4
                goto L3d
            L3c:
                r4 = r6
            L3d:
                if (r4 == 0) goto L42
                r3.invoke(r4)
            L42:
                androidx.compose.foundation.gestures.DragGestureNode r4 = r9.f3336f
                d1.f r4 = r4.f3296u
                if (r4 == 0) goto L62
                r9.f3335c = r3
                r9.f3333a = r1
                r9.f3334b = r2
                java.lang.Object r4 = r4.g(r9)
                if (r4 != r0) goto L55
                return r0
            L55:
                r7 = r0
                r0 = r9
                r9 = r4
                r4 = r3
                r3 = r1
                r1 = r7
            L5b:
                r6 = r9
                androidx.compose.foundation.gestures.DragEvent r6 = (androidx.compose.foundation.gestures.DragEvent) r6
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
            L62:
                r1.f30930a = r6
                goto L28
            L65:
                d0.b0 r9 = d0.b0.f30125a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$startListeningForEvents$1(DragGestureNode dragGestureNode, g gVar) {
        super(2, gVar);
        this.f3332f = dragGestureNode;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$1 = new DragGestureNode$startListeningForEvents$1(this.f3332f, gVar);
        dragGestureNode$startListeningForEvents$1.d = obj;
        return dragGestureNode$startListeningForEvents$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((DragGestureNode$startListeningForEvents$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:27|28|29|30|(2:35|(2:37|(1:39)))(2:32|(1:34))|8|(2:50|51)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e9, code lost:
    
        r1 = r0;
        r0 = r8;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d2 A[Catch: CancellationException -> 0x00e9, TryCatch #2 {CancellationException -> 0x00e9, blocks: (B:30:0x00cc, B:32:0x00d2, B:35:0x00ec, B:37:0x00f0), top: B:29:0x00cc }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ec A[Catch: CancellationException -> 0x00e9, TryCatch #2 {CancellationException -> 0x00e9, blocks: (B:30:0x00cc, B:32:0x00d2, B:35:0x00ec, B:37:0x00f0), top: B:29:0x00cc }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0110 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011a  */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00e6 -> B:8:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00ee -> B:8:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00fd -> B:8:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0111 -> B:8:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0115 -> B:8:0x0065). Please report as a decompilation issue!!! */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
