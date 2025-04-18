package androidx.compose.ui.input.rotary;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes4.dex */
public final class RotaryScrollEvent {

    /* renamed from: a, reason: collision with root package name */
    public final float f15688a;

    /* renamed from: b, reason: collision with root package name */
    public final float f15689b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15690c;
    public final int d;

    public RotaryScrollEvent(float f2, float f3, long j2, int i2) {
        this.f15688a = f2;
        this.f15689b = f3;
        this.f15690c = j2;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof RotaryScrollEvent) {
            RotaryScrollEvent rotaryScrollEvent = (RotaryScrollEvent) obj;
            if (rotaryScrollEvent.f15688a == this.f15688a && rotaryScrollEvent.f15689b == this.f15689b && rotaryScrollEvent.f15690c == this.f15690c && rotaryScrollEvent.d == this.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + d.d(this.f15690c, d.b(this.f15689b, Float.hashCode(this.f15688a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RotaryScrollEvent(verticalScrollPixels=");
        sb.append(this.f15688a);
        sb.append(",horizontalScrollPixels=");
        sb.append(this.f15689b);
        sb.append(",uptimeMillis=");
        sb.append(this.f15690c);
        sb.append(",deviceId=");
        return d.o(sb, this.d, ')');
    }
}
