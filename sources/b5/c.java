package b5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new E3.b(23);
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f5321c;

    public c(String str) {
        this.b = str;
        this.f5321c = new AtomicLong(0L);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.b);
        parcel.writeLong(this.f5321c.get());
    }

    public c(Parcel parcel) {
        this.b = parcel.readString();
        this.f5321c = new AtomicLong(parcel.readLong());
    }
}
