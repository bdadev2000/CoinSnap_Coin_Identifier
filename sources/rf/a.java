package rf;

import a4.j;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import r8.b;

/* loaded from: classes4.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new b(17);

    /* renamed from: b, reason: collision with root package name */
    public final List f24120b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24121c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24122d;

    /* renamed from: f, reason: collision with root package name */
    public final int f24123f;

    /* renamed from: g, reason: collision with root package name */
    public final int f24124g;

    public a(List imageList, int i10, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(imageList, "imageList");
        this.f24120b = imageList;
        this.f24121c = i10;
        this.f24122d = i11;
        this.f24123f = i12;
        this.f24124g = i13;
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
        return Intrinsics.areEqual(this.f24120b, aVar.f24120b) && this.f24121c == aVar.f24121c && this.f24122d == aVar.f24122d && this.f24123f == aVar.f24123f && this.f24124g == aVar.f24124g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24124g) + kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.e(this.f24123f, kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.e(this.f24122d, kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.e(this.f24121c, this.f24120b.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlantDiseaseModel(imageList=");
        sb2.append(this.f24120b);
        sb2.append(", diseaseName=");
        sb2.append(this.f24121c);
        sb2.append(", diseaseSymptoms=");
        sb2.append(this.f24122d);
        sb2.append(", diseaseCause=");
        sb2.append(this.f24123f);
        sb2.append(", diseaseManagement=");
        return j.i(sb2, this.f24124g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        List list = this.f24120b;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeInt(((Number) it.next()).intValue());
        }
        out.writeInt(this.f24121c);
        out.writeInt(this.f24122d);
        out.writeInt(this.f24123f);
        out.writeInt(this.f24124g);
    }
}
