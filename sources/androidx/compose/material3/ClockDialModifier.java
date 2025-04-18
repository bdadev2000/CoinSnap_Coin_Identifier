package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.jvm.internal.e;

@StabilityInferred
/* loaded from: classes2.dex */
public final class ClockDialModifier extends ModifierNodeElement<ClockDialNode> {

    /* renamed from: a, reason: collision with root package name */
    public final AnalogTimePickerState f8475a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8476b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8477c;

    public ClockDialModifier(AnalogTimePickerState analogTimePickerState, boolean z2, int i2) {
        this.f8475a = analogTimePickerState;
        this.f8476b = z2;
        this.f8477c = i2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new ClockDialNode(this.f8475a, this.f8476b, this.f8477c);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ClockDialNode clockDialNode = (ClockDialNode) node;
        AnalogTimePickerState analogTimePickerState = this.f8475a;
        clockDialNode.f8478q = analogTimePickerState;
        clockDialNode.f8479r = this.f8476b;
        int i2 = clockDialNode.f8480s;
        int i3 = this.f8477c;
        if (TimePickerSelectionMode.a(i2, i3)) {
            return;
        }
        clockDialNode.f8480s = i3;
        e.v(clockDialNode.S1(), null, 0, new ClockDialNode$updateNode$1(analogTimePickerState, null), 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClockDialModifier)) {
            return false;
        }
        ClockDialModifier clockDialModifier = (ClockDialModifier) obj;
        return p0.a.g(this.f8475a, clockDialModifier.f8475a) && this.f8476b == clockDialModifier.f8476b && TimePickerSelectionMode.a(this.f8477c, clockDialModifier.f8477c);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8477c) + d.g(this.f8476b, this.f8475a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClockDialModifier(state=");
        sb.append(this.f8475a);
        sb.append(", autoSwitchToMinute=");
        sb.append(this.f8476b);
        sb.append(", selection=");
        int i2 = this.f8477c;
        sb.append((Object) (TimePickerSelectionMode.a(i2, 0) ? "Hour" : TimePickerSelectionMode.a(i2, 1) ? "Minute" : ""));
        sb.append(')');
        return sb.toString();
    }
}
