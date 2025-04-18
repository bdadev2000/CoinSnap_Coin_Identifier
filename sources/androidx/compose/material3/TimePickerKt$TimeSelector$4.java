package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class TimePickerKt$TimeSelector$4 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f12469a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12470b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TimePickerState f12471c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TimePickerColors f12472f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12473g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimeSelector$4(int i2, int i3, int i4, TimePickerColors timePickerColors, TimePickerState timePickerState, Modifier modifier) {
        super(2);
        this.f12469a = modifier;
        this.f12470b = i2;
        this.f12471c = timePickerState;
        this.d = i3;
        this.f12472f = timePickerColors;
        this.f12473g = i4;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        Modifier modifier = this.f12469a;
        int i2 = this.f12470b;
        TimePickerState timePickerState = this.f12471c;
        int i3 = this.d;
        TimePickerColors timePickerColors = this.f12472f;
        TimePickerKt.h(i2, i3, RecomposeScopeImplKt.a(this.f12473g | 1), timePickerColors, timePickerState, (Composer) obj, modifier);
        return b0.f30125a;
    }
}
