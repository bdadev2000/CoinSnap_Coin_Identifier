package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TimePickerKt$HorizontalTimePicker$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnalogTimePickerState f12400a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f12401b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TimePickerColors f12402c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f12403f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12404g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$HorizontalTimePicker$2(AnalogTimePickerState analogTimePickerState, Modifier modifier, TimePickerColors timePickerColors, boolean z2, int i2, int i3) {
        super(2);
        this.f12400a = analogTimePickerState;
        this.f12401b = modifier;
        this.f12402c = timePickerColors;
        this.d = z2;
        this.f12403f = i2;
        this.f12404g = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        TimePickerKt.e(this.f12400a, this.f12401b, this.f12402c, this.d, (Composer) obj, RecomposeScopeImplKt.a(this.f12403f | 1), this.f12404g);
        return b0.f30125a;
    }
}
