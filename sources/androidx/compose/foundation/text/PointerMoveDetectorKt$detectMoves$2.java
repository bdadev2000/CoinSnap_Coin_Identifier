package androidx.compose.foundation.text;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputScope;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.h;
import j0.i;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;
import q0.l;
import q0.p;

@e(c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2", f = "PointerMoveDetector.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PointerMoveDetectorKt$detectMoves$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f6087a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PointerInputScope f6088b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PointerEventPass f6089c;
    public final /* synthetic */ l d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1", f = "PointerMoveDetector.kt", l = {44}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends h implements p {

        /* renamed from: a, reason: collision with root package name */
        public f0 f6090a;

        /* renamed from: b, reason: collision with root package name */
        public int f6091b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f6092c;
        public final /* synthetic */ h0.l d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ PointerEventPass f6093f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ l f6094g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(h0.l lVar, PointerEventPass pointerEventPass, l lVar2, g gVar) {
            super(gVar);
            this.d = lVar;
            this.f6093f = pointerEventPass;
            this.f6094g = lVar2;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.d, this.f6093f, this.f6094g, gVar);
            anonymousClass1.f6092c = obj;
            return anonymousClass1;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((AwaitPointerEventScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0044 -> B:5:0x004a). Please report as a decompilation issue!!! */
        @Override // j0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                i0.a r0 = i0.a.f30806a
                int r1 = r10.f6091b
                r2 = 1
                if (r1 == 0) goto L1f
                if (r1 != r2) goto L17
                kotlin.jvm.internal.f0 r1 = r10.f6090a
                java.lang.Object r3 = r10.f6092c
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r3
                kotlin.jvm.internal.q.m(r11)
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r10
                goto L4a
            L17:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1f:
                kotlin.jvm.internal.q.m(r11)
                java.lang.Object r11 = r10.f6092c
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r11 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r11
                kotlin.jvm.internal.f0 r1 = new kotlin.jvm.internal.f0
                r1.<init>()
                r3 = r11
                r11 = r10
            L2d:
                h0.l r4 = r11.d
                boolean r4 = kotlin.jvm.internal.e.p(r4)
                if (r4 == 0) goto L9f
                r11.f6092c = r3
                r11.f6090a = r1
                r11.f6091b = r2
                androidx.compose.ui.input.pointer.PointerEventPass r4 = r11.f6093f
                java.lang.Object r4 = r3.L1(r4, r11)
                if (r4 != r0) goto L44
                return r0
            L44:
                r9 = r0
                r0 = r11
                r11 = r4
                r4 = r3
                r3 = r1
                r1 = r9
            L4a:
                androidx.compose.ui.input.pointer.PointerEvent r11 = (androidx.compose.ui.input.pointer.PointerEvent) r11
                int r5 = r11.d
                r6 = 3
                boolean r6 = androidx.compose.ui.input.pointer.PointerEventType.a(r5, r6)
                if (r6 == 0) goto L56
                goto L65
            L56:
                r6 = 4
                boolean r6 = androidx.compose.ui.input.pointer.PointerEventType.a(r5, r6)
                if (r6 == 0) goto L5e
                goto L65
            L5e:
                r6 = 5
                boolean r5 = androidx.compose.ui.input.pointer.PointerEventType.a(r5, r6)
                if (r5 == 0) goto L9a
            L65:
                java.util.List r11 = r11.f15569a
                java.lang.Object r11 = e0.u.E0(r11)
                androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
                long r5 = r11.f15591c
                androidx.compose.ui.geometry.Offset r11 = new androidx.compose.ui.geometry.Offset
                r11.<init>(r5)
                java.lang.Object r7 = r3.f30930a
                boolean r8 = r7 instanceof androidx.compose.ui.geometry.Offset
                if (r8 != 0) goto L7b
                goto L85
            L7b:
                androidx.compose.ui.geometry.Offset r7 = (androidx.compose.ui.geometry.Offset) r7
                long r7 = r7.f14913a
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 == 0) goto L84
                goto L85
            L84:
                r11 = 0
            L85:
                if (r11 == 0) goto L9a
                androidx.compose.ui.geometry.Offset r5 = new androidx.compose.ui.geometry.Offset
                long r6 = r11.f14913a
                r5.<init>(r6)
                r3.f30930a = r5
                androidx.compose.ui.geometry.Offset r11 = new androidx.compose.ui.geometry.Offset
                r11.<init>(r6)
                q0.l r5 = r0.f6094g
                r5.invoke(r11)
            L9a:
                r11 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L2d
            L9f:
                d0.b0 r11 = d0.b0.f30125a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerMoveDetectorKt$detectMoves$2(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, l lVar, g gVar) {
        super(2, gVar);
        this.f6088b = pointerInputScope;
        this.f6089c = pointerEventPass;
        this.d = lVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new PointerMoveDetectorKt$detectMoves$2(this.f6088b, this.f6089c, this.d, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((PointerMoveDetectorKt$detectMoves$2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f6087a;
        if (i2 == 0) {
            q.m(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(getContext(), this.f6089c, this.d, null);
            this.f6087a = 1;
            if (this.f6088b.K1(anonymousClass1, this) == aVar) {
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
