package androidx.compose.foundation;

import androidx.compose.foundation.interaction.HoverInteraction;
import h0.g;
import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", l = {111}, m = "emitEnter")
/* loaded from: classes3.dex */
public final class HoverableNode$emitEnter$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public Object f2730a;

    /* renamed from: b, reason: collision with root package name */
    public HoverInteraction.Enter f2731b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f2732c;
    public final /* synthetic */ HoverableNode d;

    /* renamed from: f, reason: collision with root package name */
    public int f2733f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverableNode$emitEnter$1(HoverableNode hoverableNode, g gVar) {
        super(gVar);
        this.d = hoverableNode;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f2732c = obj;
        this.f2733f |= Integer.MIN_VALUE;
        return HoverableNode.e2(this.d, this);
    }
}
