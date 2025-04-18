package s8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class e extends b {
    public static final Parcelable.Creator<e> CREATOR = new r8.b(5);

    /* renamed from: b, reason: collision with root package name */
    public final long f24906b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f24907c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f24908d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f24909f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f24910g;

    /* renamed from: h, reason: collision with root package name */
    public final long f24911h;

    /* renamed from: i, reason: collision with root package name */
    public final long f24912i;

    /* renamed from: j, reason: collision with root package name */
    public final List f24913j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f24914k;

    /* renamed from: l, reason: collision with root package name */
    public final long f24915l;

    /* renamed from: m, reason: collision with root package name */
    public final int f24916m;

    /* renamed from: n, reason: collision with root package name */
    public final int f24917n;

    /* renamed from: o, reason: collision with root package name */
    public final int f24918o;

    public e(long j3, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, List list, boolean z14, long j12, int i10, int i11, int i12) {
        this.f24906b = j3;
        this.f24907c = z10;
        this.f24908d = z11;
        this.f24909f = z12;
        this.f24910g = z13;
        this.f24911h = j10;
        this.f24912i = j11;
        this.f24913j = Collections.unmodifiableList(list);
        this.f24914k = z14;
        this.f24915l = j12;
        this.f24916m = i10;
        this.f24917n = i11;
        this.f24918o = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f24906b);
        parcel.writeByte(this.f24907c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f24908d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f24909f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f24910g ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f24911h);
        parcel.writeLong(this.f24912i);
        List list = this.f24913j;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            d dVar = (d) list.get(i11);
            parcel.writeInt(dVar.a);
            parcel.writeLong(dVar.f24904b);
            parcel.writeLong(dVar.f24905c);
        }
        parcel.writeByte(this.f24914k ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f24915l);
        parcel.writeInt(this.f24916m);
        parcel.writeInt(this.f24917n);
        parcel.writeInt(this.f24918o);
    }

    public e(Parcel parcel) {
        this.f24906b = parcel.readLong();
        this.f24907c = parcel.readByte() == 1;
        this.f24908d = parcel.readByte() == 1;
        this.f24909f = parcel.readByte() == 1;
        this.f24910g = parcel.readByte() == 1;
        this.f24911h = parcel.readLong();
        this.f24912i = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(new d(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f24913j = Collections.unmodifiableList(arrayList);
        this.f24914k = parcel.readByte() == 1;
        this.f24915l = parcel.readLong();
        this.f24916m = parcel.readInt();
        this.f24917n = parcel.readInt();
        this.f24918o = parcel.readInt();
    }
}
