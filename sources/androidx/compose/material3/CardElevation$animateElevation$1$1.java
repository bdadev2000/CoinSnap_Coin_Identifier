package androidx.compose.material3;

import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import b1.d0;
import d0.b0;
import e1.h;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.material3.CardElevation$animateElevation$1$1", f = "Card.kt", l = {674}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CardElevation$animateElevation$1$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f8121a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InteractionSource f8122b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SnapshotStateList f8123c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardElevation$animateElevation$1$1(InteractionSource interactionSource, SnapshotStateList snapshotStateList, g gVar) {
        super(2, gVar);
        this.f8122b = interactionSource;
        this.f8123c = snapshotStateList;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new CardElevation$animateElevation$1$1(this.f8122b, this.f8123c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((CardElevation$animateElevation$1$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f8121a;
        if (i2 == 0) {
            q.m(obj);
            h c2 = this.f8122b.c();
            final SnapshotStateList snapshotStateList = this.f8123c;
            e1.i iVar = new e1.i() { // from class: androidx.compose.material3.CardElevation$animateElevation$1$1.1
                @Override // e1.i
                public final Object emit(Object obj2, g gVar) {
                    Interaction interaction = (Interaction) obj2;
                    boolean z2 = interaction instanceof HoverInteraction.Enter;
                    SnapshotStateList snapshotStateList2 = SnapshotStateList.this;
                    if (z2) {
                        snapshotStateList2.add(interaction);
                    } else if (interaction instanceof HoverInteraction.Exit) {
                        snapshotStateList2.remove(((HoverInteraction.Exit) interaction).f3733a);
                    } else if (interaction instanceof FocusInteraction.Focus) {
                        snapshotStateList2.add(interaction);
                    } else if (interaction instanceof FocusInteraction.Unfocus) {
                        snapshotStateList2.remove(((FocusInteraction.Unfocus) interaction).f3727a);
                    } else if (interaction instanceof PressInteraction.Press) {
                        snapshotStateList2.add(interaction);
                    } else if (interaction instanceof PressInteraction.Release) {
                        snapshotStateList2.remove(((PressInteraction.Release) interaction).f3742a);
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        snapshotStateList2.remove(((PressInteraction.Cancel) interaction).f3740a);
                    } else if (interaction instanceof DragInteraction.Start) {
                        snapshotStateList2.add(interaction);
                    } else if (interaction instanceof DragInteraction.Stop) {
                        snapshotStateList2.remove(((DragInteraction.Stop) interaction).f3721a);
                    } else if (interaction instanceof DragInteraction.Cancel) {
                        snapshotStateList2.remove(((DragInteraction.Cancel) interaction).f3720a);
                    }
                    return b0.f30125a;
                }
            };
            this.f8121a = 1;
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
