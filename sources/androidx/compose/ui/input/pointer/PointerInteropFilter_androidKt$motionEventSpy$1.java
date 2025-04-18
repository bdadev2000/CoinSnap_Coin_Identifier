package androidx.compose.ui.input.pointer;

import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.h;
import j0.i;
import kotlin.jvm.internal.q;
import q0.l;
import q0.p;

@e(c = "androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1", f = "PointerInteropFilter.android.kt", l = {345}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PointerInteropFilter_androidKt$motionEventSpy$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f15631a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f15632b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f15633c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1$1", f = "PointerInteropFilter.android.kt", l = {347}, m = "invokeSuspend")
    /* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass1 extends h implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f15634a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f15635b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l f15636c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(l lVar, g gVar) {
            super(gVar);
            this.f15636c = lVar;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f15636c, gVar);
            anonymousClass1.f15635b = obj;
            return anonymousClass1;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((AwaitPointerEventScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0031 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x003f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0032 -> B:5:0x0037). Please report as a decompilation issue!!! */
        @Override // j0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                i0.a r0 = i0.a.f30806a
                int r1 = r6.f15634a
                r2 = 1
                if (r1 == 0) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r1 = r6.f15635b
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.jvm.internal.q.m(r7)
                r3 = r1
                r1 = r0
                r0 = r6
                goto L37
            L14:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1c:
                kotlin.jvm.internal.q.m(r7)
                java.lang.Object r7 = r6.f15635b
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r7
                r1 = r7
                r7 = r6
            L25:
                androidx.compose.ui.input.pointer.PointerEventPass r3 = androidx.compose.ui.input.pointer.PointerEventPass.f15572a
                r7.f15635b = r1
                r7.f15634a = r2
                java.lang.Object r3 = r1.L1(r3, r7)
                if (r3 != r0) goto L32
                return r0
            L32:
                r5 = r0
                r0 = r7
                r7 = r3
                r3 = r1
                r1 = r5
            L37:
                androidx.compose.ui.input.pointer.PointerEvent r7 = (androidx.compose.ui.input.pointer.PointerEvent) r7
                android.view.MotionEvent r7 = r7.a()
                if (r7 == 0) goto L44
                q0.l r4 = r0.f15636c
                r4.invoke(r7)
            L44:
                r7 = r0
                r0 = r1
                r1 = r3
                goto L25
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerInteropFilter_androidKt$motionEventSpy$1(l lVar, g gVar) {
        super(2, gVar);
        this.f15633c = lVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        PointerInteropFilter_androidKt$motionEventSpy$1 pointerInteropFilter_androidKt$motionEventSpy$1 = new PointerInteropFilter_androidKt$motionEventSpy$1(this.f15633c, gVar);
        pointerInteropFilter_androidKt$motionEventSpy$1.f15632b = obj;
        return pointerInteropFilter_androidKt$motionEventSpy$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((PointerInteropFilter_androidKt$motionEventSpy$1) create((PointerInputScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f15631a;
        if (i2 == 0) {
            q.m(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.f15632b;
            pointerInputScope.b0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f15633c, null);
            this.f15631a = 1;
            if (pointerInputScope.K1(anonymousClass1, this) == aVar) {
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
