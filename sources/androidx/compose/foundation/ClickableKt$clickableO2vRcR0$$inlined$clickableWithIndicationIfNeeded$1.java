package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.Role;
import kotlin.jvm.internal.r;
import q0.a;
import q0.q;

/* renamed from: androidx.compose.foundation.ClickableKt$clickable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class ClickableKt$clickableO2vRcR0$$inlined$clickableWithIndicationIfNeeded$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Indication f2622a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2623b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2624c;
    public final /* synthetic */ Role d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a f2625f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$clickableO2vRcR0$$inlined$clickableWithIndicationIfNeeded$1(Indication indication, boolean z2, String str, Role role, a aVar) {
        super(3);
        this.f2622a = indication;
        this.f2623b = z2;
        this.f2624c = str;
        this.d = role;
        this.f2625f = aVar;
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
        Modifier T0 = IndicationKt.a(Modifier.Companion.f14687a, mutableInteractionSource, this.f2622a).T0(new ClickableElement(mutableInteractionSource, null, this.f2623b, this.f2624c, this.d, this.f2625f));
        composer.D();
        return T0;
    }
}
