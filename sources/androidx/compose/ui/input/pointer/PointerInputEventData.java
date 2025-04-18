package androidx.compose.ui.input.pointer;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import java.util.ArrayList;
import java.util.List;
import p0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class PointerInputEventData {

    /* renamed from: a, reason: collision with root package name */
    public final long f15606a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15607b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15608c;
    public final long d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final float f15609f;

    /* renamed from: g, reason: collision with root package name */
    public final int f15610g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f15611h;

    /* renamed from: i, reason: collision with root package name */
    public final List f15612i;

    /* renamed from: j, reason: collision with root package name */
    public final long f15613j;

    /* renamed from: k, reason: collision with root package name */
    public final long f15614k;

    public PointerInputEventData(long j2, long j3, long j4, long j5, boolean z2, float f2, int i2, boolean z3, ArrayList arrayList, long j6, long j7) {
        this.f15606a = j2;
        this.f15607b = j3;
        this.f15608c = j4;
        this.d = j5;
        this.e = z2;
        this.f15609f = f2;
        this.f15610g = i2;
        this.f15611h = z3;
        this.f15612i = arrayList;
        this.f15613j = j6;
        this.f15614k = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerInputEventData)) {
            return false;
        }
        PointerInputEventData pointerInputEventData = (PointerInputEventData) obj;
        return PointerId.a(this.f15606a, pointerInputEventData.f15606a) && this.f15607b == pointerInputEventData.f15607b && Offset.d(this.f15608c, pointerInputEventData.f15608c) && Offset.d(this.d, pointerInputEventData.d) && this.e == pointerInputEventData.e && Float.compare(this.f15609f, pointerInputEventData.f15609f) == 0 && PointerType.a(this.f15610g, pointerInputEventData.f15610g) && this.f15611h == pointerInputEventData.f15611h && a.g(this.f15612i, pointerInputEventData.f15612i) && Offset.d(this.f15613j, pointerInputEventData.f15613j) && Offset.d(this.f15614k, pointerInputEventData.f15614k);
    }

    public final int hashCode() {
        return Long.hashCode(this.f15614k) + d.d(this.f15613j, d.f(this.f15612i, d.g(this.f15611h, d.c(this.f15610g, d.b(this.f15609f, d.g(this.e, d.d(this.d, d.d(this.f15608c, d.d(this.f15607b, Long.hashCode(this.f15606a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) PointerId.b(this.f15606a)) + ", uptime=" + this.f15607b + ", positionOnScreen=" + ((Object) Offset.m(this.f15608c)) + ", position=" + ((Object) Offset.m(this.d)) + ", down=" + this.e + ", pressure=" + this.f15609f + ", type=" + ((Object) PointerType.b(this.f15610g)) + ", activeHover=" + this.f15611h + ", historical=" + this.f15612i + ", scrollDelta=" + ((Object) Offset.m(this.f15613j)) + ", originalEventPosition=" + ((Object) Offset.m(this.f15614k)) + ')';
    }
}
