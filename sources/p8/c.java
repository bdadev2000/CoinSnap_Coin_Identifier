package p8;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.login.l;
import java.util.Arrays;
import s7.k1;

/* loaded from: classes3.dex */
public final class c implements l8.a {
    public static final Parcelable.Creator<c> CREATOR = new l(17);

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f23491b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23492c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23493d;

    public c(byte[] bArr, String str, String str2) {
        this.f23491b = bArr;
        this.f23492c = str;
        this.f23493d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            return Arrays.equals(this.f23491b, ((c) obj).f23491b);
        }
        return false;
    }

    @Override // l8.a
    public final void g(k1 k1Var) {
        String str = this.f23492c;
        if (str != null) {
            k1Var.a = str;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f23491b);
    }

    public final String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f23492c, this.f23493d, Integer.valueOf(this.f23491b.length));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f23491b);
        parcel.writeString(this.f23492c);
        parcel.writeString(this.f23493d);
    }

    public c(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.f23491b = createByteArray;
        this.f23492c = parcel.readString();
        this.f23493d = parcel.readString();
    }
}
