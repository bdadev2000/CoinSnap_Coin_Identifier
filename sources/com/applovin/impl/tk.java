package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class tk extends pk {
    public static final Parcelable.Creator<tk> CREATOR = new a();
    public final List a;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public tk[] newArray(int i10) {
            return new tk[i10];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public tk createFromParcel(Parcel parcel) {
            return new tk(parcel, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final int a;

        /* renamed from: b, reason: collision with root package name */
        public final long f8273b;

        private b(int i10, long j3) {
            this.a = i10;
            this.f8273b = j3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b b(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(Parcel parcel) {
            parcel.writeInt(this.a);
            parcel.writeLong(this.f8273b);
        }

        public /* synthetic */ b(int i10, long j3, a aVar) {
            this(i10, j3);
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public final long a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f8274b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f8275c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f8276d;

        /* renamed from: e, reason: collision with root package name */
        public final long f8277e;

        /* renamed from: f, reason: collision with root package name */
        public final List f8278f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f8279g;

        /* renamed from: h, reason: collision with root package name */
        public final long f8280h;

        /* renamed from: i, reason: collision with root package name */
        public final int f8281i;

        /* renamed from: j, reason: collision with root package name */
        public final int f8282j;

        /* renamed from: k, reason: collision with root package name */
        public final int f8283k;

        private c(long j3, boolean z10, boolean z11, boolean z12, List list, long j10, boolean z13, long j11, int i10, int i11, int i12) {
            this.a = j3;
            this.f8274b = z10;
            this.f8275c = z11;
            this.f8276d = z12;
            this.f8278f = Collections.unmodifiableList(list);
            this.f8277e = j10;
            this.f8279g = z13;
            this.f8280h = j11;
            this.f8281i = i10;
            this.f8282j = i11;
            this.f8283k = i12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c b(yg ygVar) {
            ArrayList arrayList;
            boolean z10;
            long j3;
            boolean z11;
            long j10;
            int i10;
            int i11;
            int i12;
            boolean z12;
            boolean z13;
            long j11;
            long y4 = ygVar.y();
            boolean z14 = (ygVar.w() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z14) {
                arrayList = arrayList2;
                z10 = false;
                j3 = C.TIME_UNSET;
                z11 = false;
                j10 = C.TIME_UNSET;
                i10 = 0;
                i11 = 0;
                i12 = 0;
                z12 = false;
            } else {
                int w10 = ygVar.w();
                boolean z15 = (w10 & 128) != 0;
                boolean z16 = (w10 & 64) != 0;
                boolean z17 = (w10 & 32) != 0;
                long y10 = z16 ? ygVar.y() : C.TIME_UNSET;
                if (!z16) {
                    int w11 = ygVar.w();
                    ArrayList arrayList3 = new ArrayList(w11);
                    for (int i13 = 0; i13 < w11; i13++) {
                        arrayList3.add(new b(ygVar.w(), ygVar.y(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z17) {
                    long w12 = ygVar.w();
                    boolean z18 = (128 & w12) != 0;
                    j11 = ((((w12 & 1) << 32) | ygVar.y()) * 1000) / 90;
                    z13 = z18;
                } else {
                    z13 = false;
                    j11 = C.TIME_UNSET;
                }
                int C = ygVar.C();
                int w13 = ygVar.w();
                z12 = z16;
                i12 = ygVar.w();
                j10 = j11;
                arrayList = arrayList2;
                long j12 = y10;
                i10 = C;
                i11 = w13;
                j3 = j12;
                boolean z19 = z15;
                z11 = z13;
                z10 = z19;
            }
            return new c(y4, z14, z10, z12, arrayList, j3, z11, j10, i10, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(Parcel parcel) {
            parcel.writeLong(this.a);
            parcel.writeByte(this.f8274b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f8275c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f8276d ? (byte) 1 : (byte) 0);
            int size = this.f8278f.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                ((b) this.f8278f.get(i10)).c(parcel);
            }
            parcel.writeLong(this.f8277e);
            parcel.writeByte(this.f8279g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f8280h);
            parcel.writeInt(this.f8281i);
            parcel.writeInt(this.f8282j);
            parcel.writeInt(this.f8283k);
        }

        private c(Parcel parcel) {
            this.a = parcel.readLong();
            this.f8274b = parcel.readByte() == 1;
            this.f8275c = parcel.readByte() == 1;
            this.f8276d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                arrayList.add(b.b(parcel));
            }
            this.f8278f = Collections.unmodifiableList(arrayList);
            this.f8277e = parcel.readLong();
            this.f8279g = parcel.readByte() == 1;
            this.f8280h = parcel.readLong();
            this.f8281i = parcel.readInt();
            this.f8282j = parcel.readInt();
            this.f8283k = parcel.readInt();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c b(Parcel parcel) {
            return new c(parcel);
        }
    }

    private tk(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(c.b(parcel));
        }
        this.a = Collections.unmodifiableList(arrayList);
    }

    public static tk a(yg ygVar) {
        int w10 = ygVar.w();
        ArrayList arrayList = new ArrayList(w10);
        for (int i10 = 0; i10 < w10; i10++) {
            arrayList.add(c.b(ygVar));
        }
        return new tk(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int size = this.a.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            ((c) this.a.get(i11)).c(parcel);
        }
    }

    public /* synthetic */ tk(Parcel parcel, a aVar) {
        this(parcel);
    }

    private tk(List list) {
        this.a = Collections.unmodifiableList(list);
    }
}
