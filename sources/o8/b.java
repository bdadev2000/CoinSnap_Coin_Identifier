package o8;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.login.l;
import n9.h0;
import s7.k1;
import vd.e;

/* loaded from: classes3.dex */
public class b implements l8.a {
    public static final Parcelable.Creator<b> CREATOR = new l(15);

    /* renamed from: b, reason: collision with root package name */
    public final String f23169b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23170c;

    public b(String str, String str2) {
        this.f23169b = str;
        this.f23170c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f23169b.equals(bVar.f23169b) && this.f23170c.equals(bVar.f23170c)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // l8.a
    public final void g(k1 k1Var) {
        char c10;
        String str = this.f23169b;
        str.getClass();
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        String str2 = this.f23170c;
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        if (c10 == 4) {
                            k1Var.f24471b = str2;
                            return;
                        }
                        return;
                    }
                    k1Var.f24473d = str2;
                    return;
                }
                k1Var.f24476g = str2;
                return;
            }
            k1Var.a = str2;
            return;
        }
        k1Var.f24472c = str2;
    }

    public final int hashCode() {
        return this.f23170c.hashCode() + e.c(this.f23169b, 527, 31);
    }

    public final String toString() {
        return "VC: " + this.f23169b + "=" + this.f23170c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f23169b);
        parcel.writeString(this.f23170c);
    }

    public b(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = h0.a;
        this.f23169b = readString;
        this.f23170c = parcel.readString();
    }
}
