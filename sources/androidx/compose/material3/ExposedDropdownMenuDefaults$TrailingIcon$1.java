package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ExposedDropdownMenuDefaults$TrailingIcon$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExposedDropdownMenuDefaults f9328a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f9329b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f9330c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f9331f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuDefaults$TrailingIcon$1(ExposedDropdownMenuDefaults exposedDropdownMenuDefaults, boolean z2, Modifier modifier, int i2, int i3) {
        super(2);
        this.f9328a = exposedDropdownMenuDefaults;
        this.f9329b = z2;
        this.f9330c = modifier;
        this.d = i2;
        this.f9331f = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.f9328a.a(this.f9329b, this.f9330c, (Composer) obj, RecomposeScopeImplKt.a(this.d | 1), this.f9331f);
        return b0.f30125a;
    }
}
