package androidx.compose.material3;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.node.DelegatableNodeKt;
import b1.d0;
import d0.b0;
import e1.h;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.material3.ThumbNode$onAttach$1", f = "Switch.kt", l = {220}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ThumbNode$onAttach$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f12306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThumbNode f12307b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThumbNode$onAttach$1(ThumbNode thumbNode, g gVar) {
        super(2, gVar);
        this.f12307b = thumbNode;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new ThumbNode$onAttach$1(this.f12307b, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ThumbNode$onAttach$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f12306a;
        if (i2 == 0) {
            q.m(obj);
            final ?? obj2 = new Object();
            final ThumbNode thumbNode = this.f12307b;
            h c2 = thumbNode.f12290o.c();
            e1.i iVar = new e1.i() { // from class: androidx.compose.material3.ThumbNode$onAttach$1.1
                @Override // e1.i
                public final Object emit(Object obj3, g gVar) {
                    Interaction interaction = (Interaction) obj3;
                    boolean z2 = interaction instanceof PressInteraction.Press;
                    kotlin.jvm.internal.d0 d0Var = kotlin.jvm.internal.d0.this;
                    if (z2) {
                        d0Var.f30925a++;
                    } else if (interaction instanceof PressInteraction.Release) {
                        d0Var.f30925a--;
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        d0Var.f30925a--;
                    }
                    boolean z3 = d0Var.f30925a > 0;
                    ThumbNode thumbNode2 = thumbNode;
                    if (thumbNode2.f12292q != z3) {
                        thumbNode2.f12292q = z3;
                        DelegatableNodeKt.f(thumbNode2).J();
                    }
                    return b0.f30125a;
                }
            };
            this.f12306a = 1;
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
