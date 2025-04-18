package l8;

import a6.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.login.l;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import java.util.List;
import n9.h0;

/* loaded from: classes3.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new l(11);

    /* renamed from: b, reason: collision with root package name */
    public final a[] f21159b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21160c;

    public b(a... aVarArr) {
        this(C.TIME_UNSET, aVarArr);
    }

    public final b a(a... aVarArr) {
        if (aVarArr.length == 0) {
            return this;
        }
        int i10 = h0.a;
        a[] aVarArr2 = this.f21159b;
        Object[] copyOf = Arrays.copyOf(aVarArr2, aVarArr2.length + aVarArr.length);
        System.arraycopy(aVarArr, 0, copyOf, aVarArr2.length, aVarArr.length);
        return new b(this.f21160c, (a[]) copyOf);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (Arrays.equals(this.f21159b, bVar.f21159b) && this.f21160c == bVar.f21160c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return k.B(this.f21160c) + (Arrays.hashCode(this.f21159b) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("entries=");
        sb2.append(Arrays.toString(this.f21159b));
        long j3 = this.f21160c;
        if (j3 == C.TIME_UNSET) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j3;
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        a[] aVarArr = this.f21159b;
        parcel.writeInt(aVarArr.length);
        for (a aVar : aVarArr) {
            parcel.writeParcelable(aVar, 0);
        }
        parcel.writeLong(this.f21160c);
    }

    public b(long j3, a... aVarArr) {
        this.f21160c = j3;
        this.f21159b = aVarArr;
    }

    public b(List list) {
        this((a[]) list.toArray(new a[0]));
    }

    public b(Parcel parcel) {
        this.f21159b = new a[parcel.readInt()];
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f21159b;
            if (i10 < aVarArr.length) {
                aVarArr[i10] = (a) parcel.readParcelable(a.class.getClassLoader());
                i10++;
            } else {
                this.f21160c = parcel.readLong();
                return;
            }
        }
    }
}
