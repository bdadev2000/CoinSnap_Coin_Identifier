package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class wk extends sk {
    public static final Parcelable.Creator<wk> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final List f27728a;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public wk[] newArray(int i2) {
            return new wk[i2];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public wk createFromParcel(Parcel parcel) {
            return new wk(parcel, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f27729a;

        /* renamed from: b, reason: collision with root package name */
        public final long f27730b;

        private b(int i2, long j2) {
            this.f27729a = i2;
            this.f27730b = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b b(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(Parcel parcel) {
            parcel.writeInt(this.f27729a);
            parcel.writeLong(this.f27730b);
        }

        public /* synthetic */ b(int i2, long j2, a aVar) {
            this(i2, j2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final long f27731a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f27732b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f27733c;
        public final boolean d;
        public final long e;

        /* renamed from: f, reason: collision with root package name */
        public final List f27734f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f27735g;

        /* renamed from: h, reason: collision with root package name */
        public final long f27736h;

        /* renamed from: i, reason: collision with root package name */
        public final int f27737i;

        /* renamed from: j, reason: collision with root package name */
        public final int f27738j;

        /* renamed from: k, reason: collision with root package name */
        public final int f27739k;

        private c(long j2, boolean z2, boolean z3, boolean z4, List list, long j3, boolean z5, long j4, int i2, int i3, int i4) {
            this.f27731a = j2;
            this.f27732b = z2;
            this.f27733c = z3;
            this.d = z4;
            this.f27734f = Collections.unmodifiableList(list);
            this.e = j3;
            this.f27735g = z5;
            this.f27736h = j4;
            this.f27737i = i2;
            this.f27738j = i3;
            this.f27739k = i4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c b(bh bhVar) {
            ArrayList arrayList;
            boolean z2;
            long j2;
            boolean z3;
            long j3;
            int i2;
            int i3;
            int i4;
            boolean z4;
            boolean z5;
            long j4;
            long y2 = bhVar.y();
            boolean z6 = (bhVar.w() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z6) {
                arrayList = arrayList2;
                z2 = false;
                j2 = -9223372036854775807L;
                z3 = false;
                j3 = -9223372036854775807L;
                i2 = 0;
                i3 = 0;
                i4 = 0;
                z4 = false;
            } else {
                int w = bhVar.w();
                boolean z7 = (w & 128) != 0;
                boolean z8 = (w & 64) != 0;
                boolean z9 = (w & 32) != 0;
                long y3 = z8 ? bhVar.y() : -9223372036854775807L;
                if (!z8) {
                    int w2 = bhVar.w();
                    ArrayList arrayList3 = new ArrayList(w2);
                    for (int i5 = 0; i5 < w2; i5++) {
                        arrayList3.add(new b(bhVar.w(), bhVar.y(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z9) {
                    long w3 = bhVar.w();
                    boolean z10 = (128 & w3) != 0;
                    j4 = ((((w3 & 1) << 32) | bhVar.y()) * 1000) / 90;
                    z5 = z10;
                } else {
                    z5 = false;
                    j4 = -9223372036854775807L;
                }
                int C = bhVar.C();
                int w4 = bhVar.w();
                z4 = z8;
                i4 = bhVar.w();
                j3 = j4;
                arrayList = arrayList2;
                long j5 = y3;
                i2 = C;
                i3 = w4;
                j2 = j5;
                boolean z11 = z7;
                z3 = z5;
                z2 = z11;
            }
            return new c(y2, z6, z2, z4, arrayList, j2, z3, j3, i2, i3, i4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(Parcel parcel) {
            parcel.writeLong(this.f27731a);
            parcel.writeByte(this.f27732b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f27733c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
            int size = this.f27734f.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                ((b) this.f27734f.get(i2)).c(parcel);
            }
            parcel.writeLong(this.e);
            parcel.writeByte(this.f27735g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f27736h);
            parcel.writeInt(this.f27737i);
            parcel.writeInt(this.f27738j);
            parcel.writeInt(this.f27739k);
        }

        private c(Parcel parcel) {
            this.f27731a = parcel.readLong();
            this.f27732b = parcel.readByte() == 1;
            this.f27733c = parcel.readByte() == 1;
            this.d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i2 = 0; i2 < readInt; i2++) {
                arrayList.add(b.b(parcel));
            }
            this.f27734f = Collections.unmodifiableList(arrayList);
            this.e = parcel.readLong();
            this.f27735g = parcel.readByte() == 1;
            this.f27736h = parcel.readLong();
            this.f27737i = parcel.readInt();
            this.f27738j = parcel.readInt();
            this.f27739k = parcel.readInt();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c b(Parcel parcel) {
            return new c(parcel);
        }
    }

    private wk(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(c.b(parcel));
        }
        this.f27728a = Collections.unmodifiableList(arrayList);
    }

    public static wk a(bh bhVar) {
        int w = bhVar.w();
        ArrayList arrayList = new ArrayList(w);
        for (int i2 = 0; i2 < w; i2++) {
            arrayList.add(c.b(bhVar));
        }
        return new wk(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int size = this.f27728a.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            ((c) this.f27728a.get(i3)).c(parcel);
        }
    }

    public /* synthetic */ wk(Parcel parcel, a aVar) {
        this(parcel);
    }

    private wk(List list) {
        this.f27728a = Collections.unmodifiableList(list);
    }
}
