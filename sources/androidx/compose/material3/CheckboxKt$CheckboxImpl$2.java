package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.state.ToggleableState;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class CheckboxKt$CheckboxImpl$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f8217a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ToggleableState f8218b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f8219c;
    public final /* synthetic */ CheckboxColors d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f8220f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckboxKt$CheckboxImpl$2(boolean z2, ToggleableState toggleableState, Modifier modifier, CheckboxColors checkboxColors, int i2) {
        super(2);
        this.f8217a = z2;
        this.f8218b = toggleableState;
        this.f8219c = modifier;
        this.d = checkboxColors;
        this.f8220f = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        CheckboxKt.a(this.f8217a, this.f8218b, this.f8219c, this.d, (Composer) obj, RecomposeScopeImplKt.a(this.f8220f | 1));
        return b0.f30125a;
    }
}
