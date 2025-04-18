package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;

@RestrictTo
/* loaded from: classes2.dex */
class VersionedParcelParcel extends VersionedParcel {
    public final SparseIntArray d;
    public final Parcel e;

    /* renamed from: f, reason: collision with root package name */
    public final int f21727f;

    /* renamed from: g, reason: collision with root package name */
    public final int f21728g;

    /* renamed from: h, reason: collision with root package name */
    public final String f21729h;

    /* renamed from: i, reason: collision with root package name */
    public int f21730i;

    /* renamed from: j, reason: collision with root package name */
    public int f21731j;

    /* renamed from: k, reason: collision with root package name */
    public int f21732k;

    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.collection.SimpleArrayMap, androidx.collection.ArrayMap] */
    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.collection.SimpleArrayMap, androidx.collection.ArrayMap] */
    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.collection.SimpleArrayMap, androidx.collection.ArrayMap] */
    public VersionedParcelParcel(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new SimpleArrayMap(), new SimpleArrayMap(), new SimpleArrayMap());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void a() {
        int i2 = this.f21730i;
        if (i2 >= 0) {
            int i3 = this.d.get(i2);
            Parcel parcel = this.e;
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(dataPosition - i3);
            parcel.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final VersionedParcel b() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.f21731j;
        if (i2 == this.f21727f) {
            i2 = this.f21728g;
        }
        return new VersionedParcelParcel(parcel, dataPosition, i2, d.r(new StringBuilder(), this.f21729h, "  "), this.f21724a, this.f21725b, this.f21726c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final boolean g() {
        return this.e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final byte[] h() {
        Parcel parcel = this.e;
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        parcel.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final CharSequence i() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final boolean j(int i2) {
        while (this.f21731j < this.f21728g) {
            int i3 = this.f21732k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            int i4 = this.f21731j;
            Parcel parcel = this.e;
            parcel.setDataPosition(i4);
            int readInt = parcel.readInt();
            this.f21732k = parcel.readInt();
            this.f21731j += readInt;
        }
        return this.f21732k == i2;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final int k() {
        return this.e.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final Parcelable m() {
        return this.e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final String n() {
        return this.e.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void p(int i2) {
        a();
        this.f21730i = i2;
        this.d.put(i2, this.e.dataPosition());
        u(0);
        u(i2);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void r(boolean z2) {
        this.e.writeInt(z2 ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void s(byte[] bArr) {
        Parcel parcel = this.e;
        if (bArr == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void t(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.e, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void u(int i2) {
        this.e.writeInt(i2);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void w(Parcelable parcelable) {
        this.e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void x(String str) {
        this.e.writeString(str);
    }

    public VersionedParcelParcel(Parcel parcel, int i2, int i3, String str, ArrayMap arrayMap, ArrayMap arrayMap2, ArrayMap arrayMap3) {
        super(arrayMap, arrayMap2, arrayMap3);
        this.d = new SparseIntArray();
        this.f21730i = -1;
        this.f21732k = -1;
        this.e = parcel;
        this.f21727f = i2;
        this.f21728g = i3;
        this.f21731j = i2;
        this.f21729h = str;
    }
}
