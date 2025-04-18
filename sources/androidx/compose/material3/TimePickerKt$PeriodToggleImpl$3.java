package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class TimePickerKt$PeriodToggleImpl$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f12408a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TimePickerState f12409b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TimePickerColors f12410c;
    public final /* synthetic */ MeasurePolicy d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Shape f12411f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Shape f12412g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f12413h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$PeriodToggleImpl$3(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, MeasurePolicy measurePolicy, Shape shape, Shape shape2, int i2) {
        super(2);
        this.f12408a = modifier;
        this.f12409b = timePickerState;
        this.f12410c = timePickerColors;
        this.d = measurePolicy;
        this.f12411f = shape;
        this.f12412g = shape2;
        this.f12413h = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        TimePickerKt.f(this.f12408a, this.f12409b, this.f12410c, this.d, this.f12411f, this.f12412g, (Composer) obj, RecomposeScopeImplKt.a(this.f12413h | 1));
        return b0.f30125a;
    }
}
