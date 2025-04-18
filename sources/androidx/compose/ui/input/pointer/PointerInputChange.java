package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import e0.w;
import java.util.List;

@Immutable
/* loaded from: classes.dex */
public final class PointerInputChange {

    /* renamed from: a, reason: collision with root package name */
    public final long f15589a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15590b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15591c;
    public final boolean d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final long f15592f;

    /* renamed from: g, reason: collision with root package name */
    public final long f15593g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f15594h;

    /* renamed from: i, reason: collision with root package name */
    public final int f15595i;

    /* renamed from: j, reason: collision with root package name */
    public final long f15596j;

    /* renamed from: k, reason: collision with root package name */
    public final List f15597k;

    /* renamed from: l, reason: collision with root package name */
    public final long f15598l;

    /* renamed from: m, reason: collision with root package name */
    public ConsumedData f15599m;

    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, androidx.compose.ui.input.pointer.ConsumedData] */
    public PointerInputChange(long j2, long j3, long j4, boolean z2, float f2, long j5, long j6, boolean z3, boolean z4, int i2, long j7) {
        this.f15589a = j2;
        this.f15590b = j3;
        this.f15591c = j4;
        this.d = z2;
        this.e = f2;
        this.f15592f = j5;
        this.f15593g = j6;
        this.f15594h = z3;
        this.f15595i = i2;
        this.f15596j = j7;
        this.f15598l = 0L;
        ?? obj = new Object();
        obj.f15546a = z4;
        obj.f15547b = z4;
        this.f15599m = obj;
    }

    public final void a() {
        ConsumedData consumedData = this.f15599m;
        consumedData.f15547b = true;
        consumedData.f15546a = true;
    }

    public final boolean b() {
        ConsumedData consumedData = this.f15599m;
        return consumedData.f15547b || consumedData.f15546a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) PointerId.b(this.f15589a));
        sb.append(", uptimeMillis=");
        sb.append(this.f15590b);
        sb.append(", position=");
        sb.append((Object) Offset.m(this.f15591c));
        sb.append(", pressed=");
        sb.append(this.d);
        sb.append(", pressure=");
        sb.append(this.e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f15592f);
        sb.append(", previousPosition=");
        sb.append((Object) Offset.m(this.f15593g));
        sb.append(", previousPressed=");
        sb.append(this.f15594h);
        sb.append(", isConsumed=");
        sb.append(b());
        sb.append(", type=");
        sb.append((Object) PointerType.b(this.f15595i));
        sb.append(", historical=");
        Object obj = this.f15597k;
        if (obj == null) {
            obj = w.f30218a;
        }
        sb.append(obj);
        sb.append(",scrollDelta=");
        sb.append((Object) Offset.m(this.f15596j));
        sb.append(')');
        return sb.toString();
    }

    public PointerInputChange(long j2, long j3, long j4, boolean z2, float f2, long j5, long j6, boolean z3, int i2, List list, long j7, long j8) {
        this(j2, j3, j4, z2, f2, j5, j6, z3, false, i2, j7);
        this.f15597k = list;
        this.f15598l = j8;
    }
}
