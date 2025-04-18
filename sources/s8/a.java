package s8;

import android.os.Parcel;
import android.os.Parcelable;
import n9.h0;

/* loaded from: classes3.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new r8.b(4);

    /* renamed from: b, reason: collision with root package name */
    public final long f24898b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24899c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f24900d;

    public a(long j3, byte[] bArr, long j10) {
        this.f24898b = j10;
        this.f24899c = j3;
        this.f24900d = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f24898b);
        parcel.writeLong(this.f24899c);
        parcel.writeByteArray(this.f24900d);
    }

    public a(Parcel parcel) {
        this.f24898b = parcel.readLong();
        this.f24899c = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        int i10 = h0.a;
        this.f24900d = createByteArray;
    }
}
