package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.state.ToggleableState;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class CheckboxKt$TriStateCheckbox$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ToggleableState f8223a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0.a f8224b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f8225c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CheckboxColors f8226f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f8227g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8228h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f8229i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckboxKt$TriStateCheckbox$1(ToggleableState toggleableState, q0.a aVar, Modifier modifier, boolean z2, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, int i2, int i3) {
        super(2);
        this.f8223a = toggleableState;
        this.f8224b = aVar;
        this.f8225c = modifier;
        this.d = z2;
        this.f8226f = checkboxColors;
        this.f8227g = mutableInteractionSource;
        this.f8228h = i2;
        this.f8229i = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        CheckboxKt.b(this.f8223a, this.f8224b, this.f8225c, this.d, this.f8226f, this.f8227g, (Composer) obj, RecomposeScopeImplKt.a(this.f8228h | 1), this.f8229i);
        return b0.f30125a;
    }
}
