package h5;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.facebook.y;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new y(19);
    public long b;

    /* renamed from: c, reason: collision with root package name */
    public long f20610c;

    public i() {
        this(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()), TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos()));
    }

    public final long c() {
        return new i().f20610c - this.f20610c;
    }

    public final long d(i iVar) {
        return iVar.f20610c - this.f20610c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long e() {
        return this.b;
    }

    public final void f() {
        this.b = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.f20610c = TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeLong(this.b);
        parcel.writeLong(this.f20610c);
    }

    public i(long j7, long j9) {
        this.b = j7;
        this.f20610c = j9;
    }
}
