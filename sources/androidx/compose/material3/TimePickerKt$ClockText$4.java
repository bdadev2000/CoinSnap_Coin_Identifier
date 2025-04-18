package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class TimePickerKt$ClockText$4 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f12384a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalogTimePickerState f12385b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12386c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f12387f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$ClockText$4(Modifier modifier, AnalogTimePickerState analogTimePickerState, int i2, boolean z2, int i3) {
        super(2);
        this.f12384a = modifier;
        this.f12385b = analogTimePickerState;
        this.f12386c = i2;
        this.d = z2;
        this.f12387f = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        TimePickerKt.n(this.f12384a, this.f12385b, this.f12386c, this.d, (Composer) obj, RecomposeScopeImplKt.a(this.f12387f | 1));
        return b0.f30125a;
    }
}
