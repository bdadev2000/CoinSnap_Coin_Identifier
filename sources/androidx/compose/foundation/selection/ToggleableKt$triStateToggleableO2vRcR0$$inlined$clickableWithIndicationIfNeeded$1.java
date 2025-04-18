package androidx.compose.foundation.selection;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import kotlin.jvm.internal.r;
import q0.a;
import q0.q;

/* renamed from: androidx.compose.foundation.selection.ToggleableKt$triStateToggleable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class ToggleableKt$triStateToggleableO2vRcR0$$inlined$clickableWithIndicationIfNeeded$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Indication f5374a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ToggleableState f5375b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5376c;
    public final /* synthetic */ Role d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a f5377f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleableKt$triStateToggleableO2vRcR0$$inlined$clickableWithIndicationIfNeeded$1(Indication indication, ToggleableState toggleableState, boolean z2, Role role, a aVar) {
        super(3);
        this.f5374a = indication;
        this.f5375b = toggleableState;
        this.f5376c = z2;
        this.d = role;
        this.f5377f = aVar;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.J(-1525724089);
        Object u2 = composer.u();
        if (u2 == Composer.Companion.f13690a) {
            u2 = InteractionSourceKt.a();
            composer.o(u2);
        }
        MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) u2;
        Modifier T0 = IndicationKt.a(Modifier.Companion.f14687a, mutableInteractionSource, this.f5374a).T0(new TriStateToggleableElement(this.f5375b, mutableInteractionSource, null, this.f5376c, this.d, this.f5377f));
        composer.D();
        return T0;
    }
}
