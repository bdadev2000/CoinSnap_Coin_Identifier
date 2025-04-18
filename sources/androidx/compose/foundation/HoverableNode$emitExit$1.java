package androidx.compose.foundation;

import h0.g;
import j0.c;
import j0.e;
import org.objectweb.asm.Opcodes;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", l = {Opcodes.DNEG}, m = "emitExit")
/* loaded from: classes2.dex */
public final class HoverableNode$emitExit$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public Object f2734a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2735b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HoverableNode f2736c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverableNode$emitExit$1(HoverableNode hoverableNode, g gVar) {
        super(gVar);
        this.f2736c = hoverableNode;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f2735b = obj;
        this.d |= Integer.MIN_VALUE;
        return HoverableNode.f2(this.f2736c, this);
    }
}
