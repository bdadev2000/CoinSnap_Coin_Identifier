package androidx.compose.foundation.interaction;

import androidx.compose.runtime.Stable;
import d0.b0;
import e1.h;
import e1.s0;
import e1.t0;
import h0.g;
import i0.a;

/* JADX INFO: Access modifiers changed from: package-private */
@Stable
/* loaded from: classes.dex */
public final class MutableInteractionSourceImpl implements MutableInteractionSource {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f3739a = t0.b(0, 16, 2, 1);

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    public final Object a(Interaction interaction, g gVar) {
        Object emit = this.f3739a.emit(interaction, gVar);
        return emit == a.f30806a ? emit : b0.f30125a;
    }

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    public final boolean b(Interaction interaction) {
        return this.f3739a.b(interaction);
    }

    @Override // androidx.compose.foundation.interaction.InteractionSource
    public final h c() {
        return this.f3739a;
    }
}
