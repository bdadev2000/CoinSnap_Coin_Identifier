package O0;

import android.os.Parcel;
import android.util.SparseIntArray;
import x.l;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f2139d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f2140e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2141f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2142g;

    /* renamed from: h, reason: collision with root package name */
    public final String f2143h;

    /* renamed from: i, reason: collision with root package name */
    public int f2144i;

    /* renamed from: j, reason: collision with root package name */
    public int f2145j;

    /* renamed from: k, reason: collision with root package name */
    public int f2146k;

    /* JADX WARN: Type inference failed for: r5v0, types: [x.l, x.b] */
    /* JADX WARN: Type inference failed for: r6v0, types: [x.l, x.b] */
    /* JADX WARN: Type inference failed for: r7v0, types: [x.l, x.b] */
    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new l(), new l(), new l());
    }

    @Override // O0.a
    public final b a() {
        Parcel parcel = this.f2140e;
        int dataPosition = parcel.dataPosition();
        int i9 = this.f2145j;
        if (i9 == this.f2141f) {
            i9 = this.f2142g;
        }
        return new b(parcel, dataPosition, i9, AbstractC2914a.h(new StringBuilder(), this.f2143h, "  "), this.f2137a, this.b, this.f2138c);
    }

    @Override // O0.a
    public final boolean e(int i9) {
        while (this.f2145j < this.f2142g) {
            int i10 = this.f2146k;
            if (i10 == i9) {
                return true;
            }
            if (String.valueOf(i10).compareTo(String.valueOf(i9)) > 0) {
                return false;
            }
            int i11 = this.f2145j;
            Parcel parcel = this.f2140e;
            parcel.setDataPosition(i11);
            int readInt = parcel.readInt();
            this.f2146k = parcel.readInt();
            this.f2145j += readInt;
        }
        if (this.f2146k != i9) {
            return false;
        }
        return true;
    }

    @Override // O0.a
    public final void i(int i9) {
        int i10 = this.f2144i;
        SparseIntArray sparseIntArray = this.f2139d;
        Parcel parcel = this.f2140e;
        if (i10 >= 0) {
            int i11 = sparseIntArray.get(i10);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i11);
            parcel.writeInt(dataPosition - i11);
            parcel.setDataPosition(dataPosition);
        }
        this.f2144i = i9;
        sparseIntArray.put(i9, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i9);
    }

    public b(Parcel parcel, int i9, int i10, String str, x.b bVar, x.b bVar2, x.b bVar3) {
        super(bVar, bVar2, bVar3);
        this.f2139d = new SparseIntArray();
        this.f2144i = -1;
        this.f2146k = -1;
        this.f2140e = parcel;
        this.f2141f = i9;
        this.f2142g = i10;
        this.f2145j = i9;
        this.f2143h = str;
    }
}
