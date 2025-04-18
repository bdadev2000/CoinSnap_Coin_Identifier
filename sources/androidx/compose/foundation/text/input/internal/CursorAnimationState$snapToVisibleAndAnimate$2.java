package androidx.compose.foundation.text.input.internal;

import b1.a2;
import b1.d0;
import b1.h1;
import d0.b0;
import h0.g;
import j0.i;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypeReference;
import q0.p;

@j0.e(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2", f = "CursorAnimationState.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CursorAnimationState$snapToVisibleAndAnimate$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6394a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CursorAnimationState f6395b;

    /* JADX INFO: Access modifiers changed from: package-private */
    @j0.e(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1", f = "CursorAnimationState.kt", l = {TypeReference.CONSTRUCTOR_REFERENCE, 77, Opcodes.IASTORE}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f6396a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h1 f6397b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CursorAnimationState f6398c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(h1 h1Var, CursorAnimationState cursorAnimationState, g gVar) {
            super(2, gVar);
            this.f6397b = h1Var;
            this.f6398c = cursorAnimationState;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass1(this.f6397b, this.f6398c, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:13:0x005c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x004c A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x005a -> B:6:0x003b). Please report as a decompilation issue!!! */
        @Override // j0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                i0.a r0 = i0.a.f30806a
                int r1 = r9.f6396a
                r2 = 0
                r3 = 500(0x1f4, double:2.47E-321)
                r5 = 3
                r6 = 2
                r7 = 1
                if (r1 == 0) goto L2a
                if (r1 == r7) goto L26
                if (r1 == r6) goto L21
                if (r1 != r5) goto L19
                kotlin.jvm.internal.q.m(r10)     // Catch: java.lang.Throwable -> L16
                goto L3a
            L16:
                r10 = move-exception
                r0 = r9
                goto L61
            L19:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L21:
                kotlin.jvm.internal.q.m(r10)     // Catch: java.lang.Throwable -> L16
                r10 = r9
                goto L4d
            L26:
                kotlin.jvm.internal.q.m(r10)
                goto L3a
            L2a:
                kotlin.jvm.internal.q.m(r10)
                b1.h1 r10 = r9.f6397b
                if (r10 == 0) goto L3a
                r9.f6396a = r7
                java.lang.Object r10 = kotlin.jvm.internal.e.i(r10, r9)
                if (r10 != r0) goto L3a
                return r0
            L3a:
                r10 = r9
            L3b:
                androidx.compose.foundation.text.input.internal.CursorAnimationState r1 = r10.f6398c     // Catch: java.lang.Throwable -> L5d
                androidx.compose.runtime.ParcelableSnapshotMutableFloatState r1 = r1.f6393b     // Catch: java.lang.Throwable -> L5d
                r7 = 1065353216(0x3f800000, float:1.0)
                r1.n(r7)     // Catch: java.lang.Throwable -> L5d
                r10.f6396a = r6     // Catch: java.lang.Throwable -> L5d
                java.lang.Object r1 = p0.a.L(r3, r10)     // Catch: java.lang.Throwable -> L5d
                if (r1 != r0) goto L4d
                return r0
            L4d:
                androidx.compose.foundation.text.input.internal.CursorAnimationState r1 = r10.f6398c     // Catch: java.lang.Throwable -> L5d
                androidx.compose.runtime.ParcelableSnapshotMutableFloatState r1 = r1.f6393b     // Catch: java.lang.Throwable -> L5d
                r1.n(r2)     // Catch: java.lang.Throwable -> L5d
                r10.f6396a = r5     // Catch: java.lang.Throwable -> L5d
                java.lang.Object r1 = p0.a.L(r3, r10)     // Catch: java.lang.Throwable -> L5d
                if (r1 != r0) goto L3b
                return r0
            L5d:
                r0 = move-exception
                r8 = r0
                r0 = r10
                r10 = r8
            L61:
                androidx.compose.foundation.text.input.internal.CursorAnimationState r0 = r0.f6398c
                androidx.compose.runtime.ParcelableSnapshotMutableFloatState r0 = r0.f6393b
                r0.n(r2)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CursorAnimationState$snapToVisibleAndAnimate$2(CursorAnimationState cursorAnimationState, g gVar) {
        super(2, gVar);
        this.f6395b = cursorAnimationState;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        CursorAnimationState$snapToVisibleAndAnimate$2 cursorAnimationState$snapToVisibleAndAnimate$2 = new CursorAnimationState$snapToVisibleAndAnimate$2(this.f6395b, gVar);
        cursorAnimationState$snapToVisibleAndAnimate$2.f6394a = obj;
        return cursorAnimationState$snapToVisibleAndAnimate$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((CursorAnimationState$snapToVisibleAndAnimate$2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        q.m(obj);
        d0 d0Var = (d0) this.f6394a;
        CursorAnimationState cursorAnimationState = this.f6395b;
        h1 h1Var = (h1) cursorAnimationState.f6392a.getAndSet(null);
        AtomicReference atomicReference = cursorAnimationState.f6392a;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(h1Var, cursorAnimationState, null);
        boolean z2 = false;
        a2 v2 = kotlin.jvm.internal.e.v(d0Var, null, 0, anonymousClass1, 3);
        while (true) {
            if (atomicReference.compareAndSet(null, v2)) {
                z2 = true;
                break;
            }
            if (atomicReference.get() != null) {
                break;
            }
        }
        return Boolean.valueOf(z2);
    }
}
