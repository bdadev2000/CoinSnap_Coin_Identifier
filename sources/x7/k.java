package x7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new com.facebook.login.l(10);

    /* renamed from: b, reason: collision with root package name */
    public int f27482b;

    /* renamed from: c, reason: collision with root package name */
    public final UUID f27483c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27484d;

    /* renamed from: f, reason: collision with root package name */
    public final String f27485f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f27486g;

    public k(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f27483c = uuid;
        this.f27484d = str;
        str2.getClass();
        this.f27485f = str2;
        this.f27486g = bArr;
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = s7.j.a;
        UUID uuid3 = this.f27483c;
        return uuid2.equals(uuid3) || uuid.equals(uuid3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        k kVar = (k) obj;
        if (!n9.h0.a(this.f27484d, kVar.f27484d) || !n9.h0.a(this.f27485f, kVar.f27485f) || !n9.h0.a(this.f27483c, kVar.f27483c) || !Arrays.equals(this.f27486g, kVar.f27486g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f27482b == 0) {
            int hashCode2 = this.f27483c.hashCode() * 31;
            String str = this.f27484d;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f27482b = Arrays.hashCode(this.f27486g) + vd.e.c(this.f27485f, (hashCode2 + hashCode) * 31, 31);
        }
        return this.f27482b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        UUID uuid = this.f27483c;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f27484d);
        parcel.writeString(this.f27485f);
        parcel.writeByteArray(this.f27486g);
    }

    public k(Parcel parcel) {
        this.f27483c = new UUID(parcel.readLong(), parcel.readLong());
        this.f27484d = parcel.readString();
        String readString = parcel.readString();
        int i10 = n9.h0.a;
        this.f27485f = readString;
        this.f27486g = parcel.createByteArray();
    }
}
