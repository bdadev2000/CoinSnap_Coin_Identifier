package dg;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new r8.b(18);

    /* renamed from: b, reason: collision with root package name */
    public final String f17038b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17039c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17040d;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f17041f;

    public e(String languageName, String isoLanguage, boolean z10, Integer num) {
        Intrinsics.checkNotNullParameter(languageName, "languageName");
        Intrinsics.checkNotNullParameter(isoLanguage, "isoLanguage");
        this.f17038b = languageName;
        this.f17039c = isoLanguage;
        this.f17040d = z10;
        this.f17041f = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f17038b, eVar.f17038b) && Intrinsics.areEqual(this.f17039c, eVar.f17039c) && this.f17040d == eVar.f17040d && Intrinsics.areEqual(this.f17041f, eVar.f17041f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int c10 = vd.e.c(this.f17039c, this.f17038b.hashCode() * 31, 31);
        boolean z10 = this.f17040d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (c10 + i10) * 31;
        Integer num = this.f17041f;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return i11 + hashCode;
    }

    public final String toString() {
        return "LanguageModel(languageName=" + this.f17038b + ", isoLanguage=" + this.f17039c + ", isCheck=" + this.f17040d + ", image=" + this.f17041f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        int intValue;
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f17038b);
        out.writeString(this.f17039c);
        out.writeInt(this.f17040d ? 1 : 0);
        Integer num = this.f17041f;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
    }
}
