package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class uk extends sk {
    public static final Parcelable.Creator<uk> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final long f27352a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f27353b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f27354c;
    public final boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f27355f;

    /* renamed from: g, reason: collision with root package name */
    public final long f27356g;

    /* renamed from: h, reason: collision with root package name */
    public final long f27357h;

    /* renamed from: i, reason: collision with root package name */
    public final List f27358i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f27359j;

    /* renamed from: k, reason: collision with root package name */
    public final long f27360k;

    /* renamed from: l, reason: collision with root package name */
    public final int f27361l;

    /* renamed from: m, reason: collision with root package name */
    public final int f27362m;

    /* renamed from: n, reason: collision with root package name */
    public final int f27363n;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public uk[] newArray(int i2) {
            return new uk[i2];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public uk createFromParcel(Parcel parcel) {
            return new uk(parcel, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f27364a;

        /* renamed from: b, reason: collision with root package name */
        public final long f27365b;

        /* renamed from: c, reason: collision with root package name */
        public final long f27366c;

        private b(int i2, long j2, long j3) {
            this.f27364a = i2;
            this.f27365b = j2;
            this.f27366c = j3;
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.f27364a);
            parcel.writeLong(this.f27365b);
            parcel.writeLong(this.f27366c);
        }

        public /* synthetic */ b(int i2, long j2, long j3, a aVar) {
            this(i2, j2, j3);
        }
    }

    private uk(long j2, boolean z2, boolean z3, boolean z4, boolean z5, long j3, long j4, List list, boolean z6, long j5, int i2, int i3, int i4) {
        this.f27352a = j2;
        this.f27353b = z2;
        this.f27354c = z3;
        this.d = z4;
        this.f27355f = z5;
        this.f27356g = j3;
        this.f27357h = j4;
        this.f27358i = Collections.unmodifiableList(list);
        this.f27359j = z6;
        this.f27360k = j5;
        this.f27361l = i2;
        this.f27362m = i3;
        this.f27363n = i4;
    }

    public static uk a(bh bhVar, long j2, ho hoVar) {
        List list;
        boolean z2;
        boolean z3;
        long j3;
        boolean z4;
        long j4;
        int i2;
        int i3;
        int i4;
        boolean z5;
        boolean z6;
        long j5;
        long y2 = bhVar.y();
        boolean z7 = (bhVar.w() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (z7) {
            list = emptyList;
            z2 = false;
            z3 = false;
            j3 = -9223372036854775807L;
            z4 = false;
            j4 = -9223372036854775807L;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            z5 = false;
        } else {
            int w = bhVar.w();
            boolean z8 = (w & 128) != 0;
            boolean z9 = (w & 64) != 0;
            boolean z10 = (w & 32) != 0;
            boolean z11 = (w & 16) != 0;
            long a2 = (!z9 || z11) ? -9223372036854775807L : Cdo.a(bhVar, j2);
            if (!z9) {
                int w2 = bhVar.w();
                ArrayList arrayList = new ArrayList(w2);
                for (int i5 = 0; i5 < w2; i5++) {
                    int w3 = bhVar.w();
                    long a3 = !z11 ? Cdo.a(bhVar, j2) : -9223372036854775807L;
                    arrayList.add(new b(w3, a3, hoVar.b(a3), null));
                }
                emptyList = arrayList;
            }
            if (z10) {
                long w4 = bhVar.w();
                boolean z12 = (128 & w4) != 0;
                j5 = ((((w4 & 1) << 32) | bhVar.y()) * 1000) / 90;
                z6 = z12;
            } else {
                z6 = false;
                j5 = -9223372036854775807L;
            }
            i2 = bhVar.C();
            z5 = z9;
            i3 = bhVar.w();
            i4 = bhVar.w();
            list = emptyList;
            long j6 = a2;
            z4 = z6;
            j4 = j5;
            z3 = z11;
            z2 = z8;
            j3 = j6;
        }
        return new uk(y2, z7, z2, z5, z3, j3, hoVar.b(j3), list, z4, j4, i2, i3, i4);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f27352a);
        parcel.writeByte(this.f27353b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f27354c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f27355f ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f27356g);
        parcel.writeLong(this.f27357h);
        int size = this.f27358i.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            ((b) this.f27358i.get(i3)).b(parcel);
        }
        parcel.writeByte(this.f27359j ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f27360k);
        parcel.writeInt(this.f27361l);
        parcel.writeInt(this.f27362m);
        parcel.writeInt(this.f27363n);
    }

    private uk(Parcel parcel) {
        this.f27352a = parcel.readLong();
        this.f27353b = parcel.readByte() == 1;
        this.f27354c = parcel.readByte() == 1;
        this.d = parcel.readByte() == 1;
        this.f27355f = parcel.readByte() == 1;
        this.f27356g = parcel.readLong();
        this.f27357h = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(b.a(parcel));
        }
        this.f27358i = Collections.unmodifiableList(arrayList);
        this.f27359j = parcel.readByte() == 1;
        this.f27360k = parcel.readLong();
        this.f27361l = parcel.readInt();
        this.f27362m = parcel.readInt();
        this.f27363n = parcel.readInt();
    }

    public /* synthetic */ uk(Parcel parcel, a aVar) {
        this(parcel);
    }
}
