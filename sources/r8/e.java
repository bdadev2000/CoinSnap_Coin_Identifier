package r8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import v8.u0;

/* loaded from: classes3.dex */
public final class e implements l8.a {
    public static final Parcelable.Creator<e> CREATOR = new b(1);

    /* renamed from: b, reason: collision with root package name */
    public final List f24017b;

    public e(ArrayList arrayList) {
        this.f24017b = arrayList;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            long j3 = ((d) arrayList.get(0)).f24015c;
            int i10 = 1;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (((d) arrayList.get(i10)).f24014b < j3) {
                    z10 = true;
                    break;
                } else {
                    j3 = ((d) arrayList.get(i10)).f24015c;
                    i10++;
                }
            }
        }
        u0.d(!z10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            return this.f24017b.equals(((e) obj).f24017b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24017b.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f24017b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f24017b);
    }
}
