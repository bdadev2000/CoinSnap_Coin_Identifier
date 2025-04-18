package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class c implements Parcelable {

    @Deprecated
    @NotNull
    public static final Parcelable.Creator<c> CREATOR = new android.support.v4.media.j(10);

    /* renamed from: a, reason: collision with root package name */
    public final String f31167a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f31168b;

    public c(String str, Map map) {
        this.f31167a = str;
        this.f31168b = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (p0.a.g(this.f31167a, cVar.f31167a) && p0.a.g(this.f31168b, cVar.f31168b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f31168b.hashCode() + (this.f31167a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.f31167a + ", extras=" + this.f31168b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f31167a);
        Map map = this.f31168b;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }
}
