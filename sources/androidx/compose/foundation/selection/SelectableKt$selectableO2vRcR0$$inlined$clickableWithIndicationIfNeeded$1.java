package androidx.compose.foundation.selection;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.Role;
import kotlin.jvm.internal.r;
import q0.a;
import q0.q;

/* renamed from: androidx.compose.foundation.selection.SelectableKt$selectable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class SelectableKt$selectableO2vRcR0$$inlined$clickableWithIndicationIfNeeded$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Indication f5361a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5362b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5363c;
    public final /* synthetic */ Role d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a f5364f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectableKt$selectableO2vRcR0$$inlined$clickableWithIndicationIfNeeded$1(Indication indication, boolean z2, boolean z3, Role role, a aVar) {
        super(3);
        this.f5361a = indication;
        this.f5362b = z2;
        this.f5363c = z3;
        this.d = role;
        this.f5364f = aVar;
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
        Modifier T0 = IndicationKt.a(Modifier.Companion.f14687a, mutableInteractionSource, this.f5361a).T0(new SelectableElement(this.f5362b, mutableInteractionSource, null, this.f5363c, this.d, this.f5364f));
        composer.D();
        return T0;
    }
}
