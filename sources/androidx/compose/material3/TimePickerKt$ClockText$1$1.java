package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class TimePickerKt$ClockText$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MutableState f12365a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableState f12366b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$ClockText$1$1(MutableState mutableState, MutableState mutableState2) {
        super(1);
        this.f12365a = mutableState;
        this.f12366b = mutableState2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
        LayoutCoordinates z2 = layoutCoordinates.z();
        long b2 = z2 != null ? IntSizeKt.b(z2.a()) : 0L;
        float f2 = TimePickerKt.f12322a;
        this.f12365a.setValue(new IntOffset(b2));
        this.f12366b.setValue(new Offset(LayoutCoordinatesKt.a(layoutCoordinates).d()));
        return b0.f30125a;
    }
}
