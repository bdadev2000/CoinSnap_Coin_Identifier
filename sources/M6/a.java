package M6;

import E3.b;
import G7.j;
import android.os.Parcel;
import android.os.Parcelable;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new b(1);
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2007c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2008d;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f2009f;

    public a(String str, String str2, boolean z8, Integer num) {
        j.e(str, "languageName");
        j.e(str2, "isoLanguage");
        this.b = str;
        this.f2007c = str2;
        this.f2008d = z8;
        this.f2009f = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (j.a(this.b, aVar.b) && j.a(this.f2007c, aVar.f2007c) && this.f2008d == aVar.f2008d && j.a(this.f2009f, aVar.f2009f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (Boolean.hashCode(this.f2008d) + AbstractC2914a.b(this.b.hashCode() * 31, 31, this.f2007c)) * 31;
        Integer num = this.f2009f;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "LanguageModel(languageName=" + this.b + ", isoLanguage=" + this.f2007c + ", isCheck=" + this.f2008d + ", image=" + this.f2009f + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int intValue;
        j.e(parcel, "dest");
        parcel.writeString(this.b);
        parcel.writeString(this.f2007c);
        parcel.writeInt(this.f2008d ? 1 : 0);
        Integer num = this.f2009f;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
    }
}
