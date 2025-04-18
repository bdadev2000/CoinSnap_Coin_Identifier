package androidx.work.impl.constraints;

/* loaded from: classes3.dex */
public class NetworkState {

    /* renamed from: a, reason: collision with root package name */
    public boolean f22070a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22071b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22072c;
    public boolean d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkState)) {
            return false;
        }
        NetworkState networkState = (NetworkState) obj;
        return this.f22070a == networkState.f22070a && this.f22071b == networkState.f22071b && this.f22072c == networkState.f22072c && this.d == networkState.d;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, boolean] */
    public final int hashCode() {
        boolean z2 = this.f22071b;
        ?? r1 = this.f22070a;
        int i2 = r1;
        if (z2) {
            i2 = r1 + 16;
        }
        int i3 = i2;
        if (this.f22072c) {
            i3 = i2 + 256;
        }
        return this.d ? i3 + 4096 : i3;
    }

    public final String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f22070a), Boolean.valueOf(this.f22071b), Boolean.valueOf(this.f22072c), Boolean.valueOf(this.d));
    }
}
