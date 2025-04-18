package h2;

import android.os.Parcel;
import android.util.SparseIntArray;
import vd.e;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f18713d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f18714e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18715f;

    /* renamed from: g, reason: collision with root package name */
    public final int f18716g;

    /* renamed from: h, reason: collision with root package name */
    public final String f18717h;

    /* renamed from: i, reason: collision with root package name */
    public int f18718i;

    /* renamed from: j, reason: collision with root package name */
    public int f18719j;

    /* renamed from: k, reason: collision with root package name */
    public int f18720k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new r.b(), new r.b(), new r.b());
    }

    @Override // h2.a
    public final b a() {
        Parcel parcel = this.f18714e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f18719j;
        if (i10 == this.f18715f) {
            i10 = this.f18716g;
        }
        return new b(parcel, dataPosition, i10, e.h(new StringBuilder(), this.f18717h, "  "), this.a, this.f18711b, this.f18712c);
    }

    @Override // h2.a
    public final boolean e(int i10) {
        while (this.f18719j < this.f18716g) {
            int i11 = this.f18720k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            int i12 = this.f18719j;
            Parcel parcel = this.f18714e;
            parcel.setDataPosition(i12);
            int readInt = parcel.readInt();
            this.f18720k = parcel.readInt();
            this.f18719j += readInt;
        }
        if (this.f18720k == i10) {
            return true;
        }
        return false;
    }

    @Override // h2.a
    public final void i(int i10) {
        int i11 = this.f18718i;
        SparseIntArray sparseIntArray = this.f18713d;
        Parcel parcel = this.f18714e;
        if (i11 >= 0) {
            int i12 = sparseIntArray.get(i11);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i12);
            parcel.writeInt(dataPosition - i12);
            parcel.setDataPosition(dataPosition);
        }
        this.f18718i = i10;
        sparseIntArray.put(i10, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i10);
    }

    public b(Parcel parcel, int i10, int i11, String str, r.b bVar, r.b bVar2, r.b bVar3) {
        super(bVar, bVar2, bVar3);
        this.f18713d = new SparseIntArray();
        this.f18718i = -1;
        this.f18720k = -1;
        this.f18714e = parcel;
        this.f18715f = i10;
        this.f18716g = i11;
        this.f18719j = i10;
        this.f18717h = str;
    }
}
