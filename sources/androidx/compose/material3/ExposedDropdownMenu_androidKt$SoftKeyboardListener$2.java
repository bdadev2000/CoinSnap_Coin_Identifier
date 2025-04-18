package androidx.compose.material3;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.unit.Density;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ExposedDropdownMenu_androidKt$SoftKeyboardListener$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f9374a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Density f9375b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q0.a f9376c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenu_androidKt$SoftKeyboardListener$2(View view, Density density, q0.a aVar, int i2) {
        super(2);
        this.f9374a = view;
        this.f9375b = density;
        this.f9376c = aVar;
        this.d = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.d | 1);
        Density density = this.f9375b;
        q0.a aVar = this.f9376c;
        ExposedDropdownMenu_androidKt.a(this.f9374a, density, aVar, (Composer) obj, a2);
        return b0.f30125a;
    }
}
