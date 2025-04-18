package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.Shape;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TimePickerKt$ToggleItem$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f12475a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Shape f12476b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q0.a f12477c;
    public final /* synthetic */ TimePickerColors d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f12478f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12479g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$ToggleItem$2(boolean z2, Shape shape, q0.a aVar, TimePickerColors timePickerColors, q qVar, int i2) {
        super(2);
        this.f12475a = z2;
        this.f12476b = shape;
        this.f12477c = aVar;
        this.d = timePickerColors;
        this.f12478f = qVar;
        this.f12479g = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        TimePickerKt.i(this.f12475a, this.f12476b, this.f12477c, this.d, this.f12478f, (Composer) obj, RecomposeScopeImplKt.a(this.f12479g | 1));
        return b0.f30125a;
    }
}
