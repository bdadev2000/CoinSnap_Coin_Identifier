package androidx.compose.material3;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableIntState;
import b1.d0;
import d0.b0;
import e1.h;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.material3.SegmentedButtonKt$interactionCountAsState$1$1", f = "SegmentedButton.kt", l = {400}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SegmentedButtonKt$interactionCountAsState$1$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f11143a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InteractionSource f11144b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutableIntState f11145c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedButtonKt$interactionCountAsState$1$1(InteractionSource interactionSource, MutableIntState mutableIntState, g gVar) {
        super(2, gVar);
        this.f11144b = interactionSource;
        this.f11145c = mutableIntState;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new SegmentedButtonKt$interactionCountAsState$1$1(this.f11144b, this.f11145c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((SegmentedButtonKt$interactionCountAsState$1$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f11143a;
        if (i2 == 0) {
            q.m(obj);
            h c2 = this.f11144b.c();
            final MutableIntState mutableIntState = this.f11145c;
            e1.i iVar = new e1.i() { // from class: androidx.compose.material3.SegmentedButtonKt$interactionCountAsState$1$1.1
                @Override // e1.i
                public final Object emit(Object obj2, g gVar) {
                    Interaction interaction = (Interaction) obj2;
                    boolean z2 = interaction instanceof PressInteraction.Press;
                    MutableIntState mutableIntState2 = MutableIntState.this;
                    if (z2 || (interaction instanceof FocusInteraction.Focus)) {
                        mutableIntState2.b(mutableIntState2.g() + 1);
                    } else if ((interaction instanceof PressInteraction.Release) || (interaction instanceof FocusInteraction.Unfocus) || (interaction instanceof PressInteraction.Cancel)) {
                        mutableIntState2.b(mutableIntState2.g() - 1);
                    }
                    return b0.f30125a;
                }
            };
            this.f11143a = 1;
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
