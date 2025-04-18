package x7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class l implements Comparator, Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new com.facebook.login.l(9);

    /* renamed from: b, reason: collision with root package name */
    public final k[] f27487b;

    /* renamed from: c, reason: collision with root package name */
    public int f27488c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27489d;

    /* renamed from: f, reason: collision with root package name */
    public final int f27490f;

    public l(String str, ArrayList arrayList) {
        this(str, false, (k[]) arrayList.toArray(new k[0]));
    }

    public final l a(String str) {
        if (n9.h0.a(this.f27489d, str)) {
            return this;
        }
        return new l(str, false, this.f27487b);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        k kVar = (k) obj;
        k kVar2 = (k) obj2;
        UUID uuid = s7.j.a;
        if (uuid.equals(kVar.f27483c)) {
            if (uuid.equals(kVar2.f27483c)) {
                return 0;
            }
            return 1;
        }
        return kVar.f27483c.compareTo(kVar2.f27483c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (n9.h0.a(this.f27489d, lVar.f27489d) && Arrays.equals(this.f27487b, lVar.f27487b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f27488c == 0) {
            String str = this.f27489d;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f27488c = (hashCode * 31) + Arrays.hashCode(this.f27487b);
        }
        return this.f27488c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f27489d);
        parcel.writeTypedArray(this.f27487b, 0);
    }

    public l(String str, boolean z10, k... kVarArr) {
        this.f27489d = str;
        kVarArr = z10 ? (k[]) kVarArr.clone() : kVarArr;
        this.f27487b = kVarArr;
        this.f27490f = kVarArr.length;
        Arrays.sort(kVarArr, this);
    }

    public l(Parcel parcel) {
        this.f27489d = parcel.readString();
        k[] kVarArr = (k[]) parcel.createTypedArray(k.CREATOR);
        int i10 = n9.h0.a;
        this.f27487b = kVarArr;
        this.f27490f = kVarArr.length;
    }
}
