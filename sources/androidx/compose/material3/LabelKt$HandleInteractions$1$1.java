package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import b1.d0;
import d0.b0;
import e1.h;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.p;

@e(c = "androidx.compose.material3.LabelKt$HandleInteractions$1$1", f = "Label.kt", l = {112}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class LabelKt$HandleInteractions$1$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f9630a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f9631b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TooltipState f9632c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.material3.LabelKt$HandleInteractions$1$1$1", f = "Label.kt", l = {Opcodes.LNEG}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.LabelKt$HandleInteractions$1$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f9633a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f9634b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TooltipState f9635c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TooltipState tooltipState, g gVar) {
            super(2, gVar);
            this.f9635c = tooltipState;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f9635c, gVar);
            anonymousClass1.f9634b = obj;
            return anonymousClass1;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((Interaction) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f9633a;
            if (i2 == 0) {
                q.m(obj);
                Interaction interaction = (Interaction) this.f9634b;
                boolean z2 = interaction instanceof PressInteraction.Press;
                TooltipState tooltipState = this.f9635c;
                if (z2 || (interaction instanceof DragInteraction.Start) || (interaction instanceof HoverInteraction.Enter)) {
                    MutatePriority mutatePriority = MutatePriority.f2812b;
                    this.f9633a = 1;
                    if (tooltipState.b(mutatePriority, this) == aVar) {
                        return aVar;
                    }
                } else if ((interaction instanceof PressInteraction.Release) || (interaction instanceof DragInteraction.Stop) || (interaction instanceof HoverInteraction.Exit)) {
                    tooltipState.dismiss();
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelKt$HandleInteractions$1$1(MutableInteractionSource mutableInteractionSource, TooltipState tooltipState, g gVar) {
        super(2, gVar);
        this.f9631b = mutableInteractionSource;
        this.f9632c = tooltipState;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new LabelKt$HandleInteractions$1$1(this.f9631b, this.f9632c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((LabelKt$HandleInteractions$1$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f9630a;
        if (i2 == 0) {
            q.m(obj);
            h c2 = this.f9631b.c();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f9632c, null);
            this.f9630a = 1;
            if (p0.a.D(c2, anonymousClass1, this) == aVar) {
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
