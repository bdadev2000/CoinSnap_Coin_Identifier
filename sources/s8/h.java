package s8;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class h {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f24920b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f24921c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f24922d;

    /* renamed from: e, reason: collision with root package name */
    public final long f24923e;

    /* renamed from: f, reason: collision with root package name */
    public final List f24924f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f24925g;

    /* renamed from: h, reason: collision with root package name */
    public final long f24926h;

    /* renamed from: i, reason: collision with root package name */
    public final int f24927i;

    /* renamed from: j, reason: collision with root package name */
    public final int f24928j;

    /* renamed from: k, reason: collision with root package name */
    public final int f24929k;

    public h(long j3, boolean z10, boolean z11, boolean z12, ArrayList arrayList, long j10, boolean z13, long j11, int i10, int i11, int i12) {
        this.a = j3;
        this.f24920b = z10;
        this.f24921c = z11;
        this.f24922d = z12;
        this.f24924f = Collections.unmodifiableList(arrayList);
        this.f24923e = j10;
        this.f24925g = z13;
        this.f24926h = j11;
        this.f24927i = i10;
        this.f24928j = i11;
        this.f24929k = i12;
    }

    public h(Parcel parcel) {
        this.a = parcel.readLong();
        this.f24920b = parcel.readByte() == 1;
        this.f24921c = parcel.readByte() == 1;
        this.f24922d = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(new g(parcel.readInt(), parcel.readLong()));
        }
        this.f24924f = Collections.unmodifiableList(arrayList);
        this.f24923e = parcel.readLong();
        this.f24925g = parcel.readByte() == 1;
        this.f24926h = parcel.readLong();
        this.f24927i = parcel.readInt();
        this.f24928j = parcel.readInt();
        this.f24929k = parcel.readInt();
    }
}
