package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.h;
import j0.i;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1", f = "StylusHandwriting.kt", l = {Opcodes.IINC}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class StylusHandwritingNode$suspendingPointerInputModifierNode$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f6280a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6281b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StylusHandwritingNode f6282c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1", f = "StylusHandwriting.kt", l = {Opcodes.I2F, 158, Opcodes.INVOKEDYNAMIC}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends h implements p {

        /* renamed from: a, reason: collision with root package name */
        public PointerInputChange f6283a;

        /* renamed from: b, reason: collision with root package name */
        public PointerEventPass f6284b;

        /* renamed from: c, reason: collision with root package name */
        public int f6285c;
        public /* synthetic */ Object d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ StylusHandwritingNode f6286f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StylusHandwritingNode stylusHandwritingNode, g gVar) {
            super(gVar);
            this.f6286f = stylusHandwritingNode;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f6286f, gVar);
            anonymousClass1.d = obj;
            return anonymousClass1;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((AwaitPointerEventScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0199 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x019a  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0160 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0192 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00d6  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x010a  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0137  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00ca A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0100 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x016c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x015e -> B:7:0x0161). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00c8 -> B:29:0x00cb). Please report as a decompilation issue!!! */
        @Override // j0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 424
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StylusHandwritingNode$suspendingPointerInputModifierNode$1(StylusHandwritingNode stylusHandwritingNode, g gVar) {
        super(2, gVar);
        this.f6282c = stylusHandwritingNode;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        StylusHandwritingNode$suspendingPointerInputModifierNode$1 stylusHandwritingNode$suspendingPointerInputModifierNode$1 = new StylusHandwritingNode$suspendingPointerInputModifierNode$1(this.f6282c, gVar);
        stylusHandwritingNode$suspendingPointerInputModifierNode$1.f6281b = obj;
        return stylusHandwritingNode$suspendingPointerInputModifierNode$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((StylusHandwritingNode$suspendingPointerInputModifierNode$1) create((PointerInputScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f6280a;
        if (i2 == 0) {
            q.m(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.f6281b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f6282c, null);
            this.f6280a = 1;
            if (ForEachGestureKt.b(pointerInputScope, anonymousClass1, this) == aVar) {
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
