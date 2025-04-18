package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TimePickerKt$TimeInputImpl$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f12433a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TimePickerColors f12434b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TimePickerState f12435c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimeInputImpl$2(int i2, TimePickerColors timePickerColors, TimePickerState timePickerState, Modifier modifier) {
        super(2);
        this.f12433a = modifier;
        this.f12434b = timePickerColors;
        this.f12435c = timePickerState;
        this.d = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.d | 1);
        TimePickerState timePickerState = this.f12435c;
        Modifier modifier = this.f12433a;
        TimePickerKt.g(a2, this.f12434b, timePickerState, (Composer) obj, modifier);
        return b0.f30125a;
    }
}
