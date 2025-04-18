package androidx.compose.foundation.text.selection;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import d0.b0;
import h0.g;
import j0.e;
import j0.h;
import j0.i;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1", f = "SelectionGestures.kt", l = {Opcodes.DUP_X2}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class SelectionGesturesKt$updateSelectionTouchMode$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f7173a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7174b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f7175c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1", f = "SelectionGestures.kt", l = {Opcodes.DUP2_X1}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends h implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f7176a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f7177b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l f7178c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(l lVar, g gVar) {
            super(gVar);
            this.f7178c = lVar;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f7178c, gVar);
            anonymousClass1.f7177b = obj;
            return anonymousClass1;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((AwaitPointerEventScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0031 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0032 -> B:5:0x0037). Please report as a decompilation issue!!! */
        @Override // j0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                i0.a r0 = i0.a.f30806a
                int r1 = r6.f7176a
                r2 = 1
                if (r1 == 0) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r1 = r6.f7177b
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
                java.lang.Object r7 = r6.f7177b
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r7
                r1 = r7
                r7 = r6
            L25:
                androidx.compose.ui.input.pointer.PointerEventPass r3 = androidx.compose.ui.input.pointer.PointerEventPass.f15572a
                r7.f7177b = r1
                r7.f7176a = r2
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
                boolean r7 = androidx.compose.foundation.text.selection.SelectionGesturesKt.h(r7)
                r7 = r7 ^ r2
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
                q0.l r4 = r0.f7178c
                r4.invoke(r7)
                r7 = r0
                r0 = r1
                r1 = r3
                goto L25
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionGesturesKt$updateSelectionTouchMode$1(l lVar, g gVar) {
        super(2, gVar);
        this.f7175c = lVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        SelectionGesturesKt$updateSelectionTouchMode$1 selectionGesturesKt$updateSelectionTouchMode$1 = new SelectionGesturesKt$updateSelectionTouchMode$1(this.f7175c, gVar);
        selectionGesturesKt$updateSelectionTouchMode$1.f7174b = obj;
        return selectionGesturesKt$updateSelectionTouchMode$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((SelectionGesturesKt$updateSelectionTouchMode$1) create((PointerInputScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f7173a;
        if (i2 == 0) {
            q.m(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.f7174b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f7175c, null);
            this.f7173a = 1;
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
