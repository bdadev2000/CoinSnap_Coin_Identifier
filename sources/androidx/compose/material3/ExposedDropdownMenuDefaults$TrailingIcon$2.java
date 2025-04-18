package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes3.dex */
final class ExposedDropdownMenuDefaults$TrailingIcon$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExposedDropdownMenuDefaults f9332a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f9333b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9334c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuDefaults$TrailingIcon$2(ExposedDropdownMenuDefaults exposedDropdownMenuDefaults, boolean z2, int i2) {
        super(2);
        this.f9332a = exposedDropdownMenuDefaults;
        this.f9333b = z2;
        this.f9334c = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        ((Number) obj2).intValue();
        boolean z2 = this.f9333b;
        int a2 = RecomposeScopeImplKt.a(this.f9334c | 1);
        ExposedDropdownMenuDefaults exposedDropdownMenuDefaults = this.f9332a;
        exposedDropdownMenuDefaults.getClass();
        ComposerImpl g2 = ((Composer) obj).g(-473088613);
        if ((a2 & 6) == 0) {
            i2 = (g2.a(z2) ? 4 : 2) | a2;
        } else {
            i2 = a2;
        }
        if ((a2 & 48) == 0) {
            i2 |= g2.I(exposedDropdownMenuDefaults) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && g2.i()) {
            g2.A();
        } else {
            exposedDropdownMenuDefaults.a(z2, Modifier.Companion.f14687a, g2, (i2 & 14) | 48 | ((i2 << 3) & 896), 0);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ExposedDropdownMenuDefaults$TrailingIcon$2(exposedDropdownMenuDefaults, z2, a2);
        }
        return b0.f30125a;
    }
}
