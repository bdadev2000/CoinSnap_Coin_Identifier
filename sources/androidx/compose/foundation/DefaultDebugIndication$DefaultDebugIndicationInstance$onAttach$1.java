package androidx.compose.foundation;

import androidx.compose.foundation.DefaultDebugIndication;
import b1.d0;
import d0.b0;
import e1.h;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1", f = "Indication.kt", l = {240}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f2680a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultDebugIndication.DefaultDebugIndicationInstance f2681b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(DefaultDebugIndication.DefaultDebugIndicationInstance defaultDebugIndicationInstance, g gVar) {
        super(2, gVar);
        this.f2681b = defaultDebugIndicationInstance;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(this.f2681b, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f2680a;
        if (i2 == 0) {
            q.m(obj);
            final ?? obj2 = new Object();
            final ?? obj3 = new Object();
            final ?? obj4 = new Object();
            final DefaultDebugIndication.DefaultDebugIndicationInstance defaultDebugIndicationInstance = this.f2681b;
            h c2 = defaultDebugIndicationInstance.f2676o.c();
            e1.i iVar = new e1.i() { // from class: androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1.1
                /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
                
                    if (r3 != false) goto L46;
                 */
                @Override // e1.i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, h0.g r7) {
                    /*
                        r5 = this;
                        androidx.compose.foundation.interaction.Interaction r6 = (androidx.compose.foundation.interaction.Interaction) r6
                        boolean r7 = r6 instanceof androidx.compose.foundation.interaction.PressInteraction.Press
                        kotlin.jvm.internal.d0 r0 = r3
                        kotlin.jvm.internal.d0 r1 = r2
                        kotlin.jvm.internal.d0 r2 = kotlin.jvm.internal.d0.this
                        r3 = 1
                        if (r7 == 0) goto L13
                        int r6 = r2.f30925a
                        int r6 = r6 + r3
                        r2.f30925a = r6
                        goto L52
                    L13:
                        boolean r7 = r6 instanceof androidx.compose.foundation.interaction.PressInteraction.Release
                        if (r7 == 0) goto L1e
                        int r6 = r2.f30925a
                        int r6 = r6 + (-1)
                        r2.f30925a = r6
                        goto L52
                    L1e:
                        boolean r7 = r6 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel
                        if (r7 == 0) goto L29
                        int r6 = r2.f30925a
                        int r6 = r6 + (-1)
                        r2.f30925a = r6
                        goto L52
                    L29:
                        boolean r7 = r6 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter
                        if (r7 == 0) goto L33
                        int r6 = r1.f30925a
                        int r6 = r6 + r3
                        r1.f30925a = r6
                        goto L52
                    L33:
                        boolean r7 = r6 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit
                        if (r7 == 0) goto L3e
                        int r6 = r1.f30925a
                        int r6 = r6 + (-1)
                        r1.f30925a = r6
                        goto L52
                    L3e:
                        boolean r7 = r6 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus
                        if (r7 == 0) goto L48
                        int r6 = r0.f30925a
                        int r6 = r6 + r3
                        r0.f30925a = r6
                        goto L52
                    L48:
                        boolean r6 = r6 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus
                        if (r6 == 0) goto L52
                        int r6 = r0.f30925a
                        int r6 = r6 + (-1)
                        r0.f30925a = r6
                    L52:
                        int r6 = r2.f30925a
                        r7 = 0
                        if (r6 <= 0) goto L59
                        r6 = r3
                        goto L5a
                    L59:
                        r6 = r7
                    L5a:
                        int r1 = r1.f30925a
                        if (r1 <= 0) goto L60
                        r1 = r3
                        goto L61
                    L60:
                        r1 = r7
                    L61:
                        int r0 = r0.f30925a
                        if (r0 <= 0) goto L67
                        r0 = r3
                        goto L68
                    L67:
                        r0 = r7
                    L68:
                        androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance r2 = r4
                        boolean r4 = r2.f2677p
                        if (r4 == r6) goto L71
                        r2.f2677p = r6
                        r7 = r3
                    L71:
                        boolean r6 = r2.f2678q
                        if (r6 == r1) goto L78
                        r2.f2678q = r1
                        goto L79
                    L78:
                        r3 = r7
                    L79:
                        boolean r6 = r2.f2679r
                        if (r6 == r0) goto L80
                        r2.f2679r = r0
                        goto L82
                    L80:
                        if (r3 == 0) goto L85
                    L82:
                        androidx.compose.ui.node.DrawModifierNodeKt.a(r2)
                    L85:
                        d0.b0 r6 = d0.b0.f30125a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1.AnonymousClass1.emit(java.lang.Object, h0.g):java.lang.Object");
                }
            };
            this.f2680a = 1;
            if (c2.collect(iVar, this) == aVar) {
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
