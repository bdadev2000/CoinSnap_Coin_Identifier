package androidx.compose.foundation.interaction;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.runtime.MutableState;
import b1.d0;
import d0.b0;
import e1.h;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.q;
import org.objectweb.asm.TypeReference;
import q0.p;

@e(c = "androidx.compose.foundation.interaction.FocusInteractionKt$collectIsFocusedAsState$1$1", f = "FocusInteraction.kt", l = {TypeReference.CONSTRUCTOR_REFERENCE}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FocusInteractionKt$collectIsFocusedAsState$1$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f3728a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InteractionSource f3729b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutableState f3730c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusInteractionKt$collectIsFocusedAsState$1$1(InteractionSource interactionSource, MutableState mutableState, g gVar) {
        super(2, gVar);
        this.f3729b = interactionSource;
        this.f3730c = mutableState;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new FocusInteractionKt$collectIsFocusedAsState$1$1(this.f3729b, this.f3730c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((FocusInteractionKt$collectIsFocusedAsState$1$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f3728a;
        if (i2 == 0) {
            q.m(obj);
            final ArrayList arrayList = new ArrayList();
            h c2 = this.f3729b.c();
            final MutableState mutableState = this.f3730c;
            e1.i iVar = new e1.i() { // from class: androidx.compose.foundation.interaction.FocusInteractionKt$collectIsFocusedAsState$1$1.1
                @Override // e1.i
                public final Object emit(Object obj2, g gVar) {
                    Interaction interaction = (Interaction) obj2;
                    boolean z2 = interaction instanceof FocusInteraction.Focus;
                    List list = arrayList;
                    if (z2) {
                        list.add(interaction);
                    } else if (interaction instanceof FocusInteraction.Unfocus) {
                        list.remove(((FocusInteraction.Unfocus) interaction).f3727a);
                    }
                    mutableState.setValue(Boolean.valueOf(!list.isEmpty()));
                    return b0.f30125a;
                }
            };
            this.f3728a = 1;
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
