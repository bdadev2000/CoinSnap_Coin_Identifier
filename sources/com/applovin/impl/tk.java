package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class tk extends pk {
    public static final Parcelable.Creator<tk> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final List f11489a;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public tk[] newArray(int i9) {
            return new tk[i9];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public tk createFromParcel(Parcel parcel) {
            return new tk(parcel, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f11490a;
        public final long b;

        private b(int i9, long j7) {
            this.f11490a = i9;
            this.b = j7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b b(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(Parcel parcel) {
            parcel.writeInt(this.f11490a);
            parcel.writeLong(this.b);
        }

        public /* synthetic */ b(int i9, long j7, a aVar) {
            this(i9, j7);
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final long f11491a;
        public final boolean b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f11492c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f11493d;

        /* renamed from: e, reason: collision with root package name */
        public final long f11494e;

        /* renamed from: f, reason: collision with root package name */
        public final List f11495f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f11496g;

        /* renamed from: h, reason: collision with root package name */
        public final long f11497h;

        /* renamed from: i, reason: collision with root package name */
        public final int f11498i;

        /* renamed from: j, reason: collision with root package name */
        public final int f11499j;

        /* renamed from: k, reason: collision with root package name */
        public final int f11500k;

        private c(long j7, boolean z8, boolean z9, boolean z10, List list, long j9, boolean z11, long j10, int i9, int i10, int i11) {
            this.f11491a = j7;
            this.b = z8;
            this.f11492c = z9;
            this.f11493d = z10;
            this.f11495f = Collections.unmodifiableList(list);
            this.f11494e = j9;
            this.f11496g = z11;
            this.f11497h = j10;
            this.f11498i = i9;
            this.f11499j = i10;
            this.f11500k = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c b(yg ygVar) {
            ArrayList arrayList;
            boolean z8;
            long j7;
            boolean z9;
            long j9;
            int i9;
            int i10;
            int i11;
            boolean z10;
            boolean z11;
            long j10;
            long y4 = ygVar.y();
            boolean z12 = (ygVar.w() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z12) {
                arrayList = arrayList2;
                z8 = false;
                j7 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                z9 = false;
                j9 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                i9 = 0;
                i10 = 0;
                i11 = 0;
                z10 = false;
            } else {
                int w2 = ygVar.w();
                boolean z13 = (w2 & 128) != 0;
                boolean z14 = (w2 & 64) != 0;
                boolean z15 = (w2 & 32) != 0;
                long y6 = z14 ? ygVar.y() : com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                if (!z14) {
                    int w9 = ygVar.w();
                    ArrayList arrayList3 = new ArrayList(w9);
                    for (int i12 = 0; i12 < w9; i12++) {
                        arrayList3.add(new b(ygVar.w(), ygVar.y(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z15) {
                    long w10 = ygVar.w();
                    boolean z16 = (128 & w10) != 0;
                    j10 = ((((w10 & 1) << 32) | ygVar.y()) * 1000) / 90;
                    z11 = z16;
                } else {
                    z11 = false;
                    j10 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                }
                int C8 = ygVar.C();
                int w11 = ygVar.w();
                z10 = z14;
                i11 = ygVar.w();
                j9 = j10;
                arrayList = arrayList2;
                long j11 = y6;
                i9 = C8;
                i10 = w11;
                j7 = j11;
                boolean z17 = z13;
                z9 = z11;
                z8 = z17;
            }
            return new c(y4, z12, z8, z10, arrayList, j7, z9, j9, i9, i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(Parcel parcel) {
            parcel.writeLong(this.f11491a);
            parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f11492c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f11493d ? (byte) 1 : (byte) 0);
            int size = this.f11495f.size();
            parcel.writeInt(size);
            for (int i9 = 0; i9 < size; i9++) {
                ((b) this.f11495f.get(i9)).c(parcel);
            }
            parcel.writeLong(this.f11494e);
            parcel.writeByte(this.f11496g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f11497h);
            parcel.writeInt(this.f11498i);
            parcel.writeInt(this.f11499j);
            parcel.writeInt(this.f11500k);
        }

        private c(Parcel parcel) {
            this.f11491a = parcel.readLong();
            this.b = parcel.readByte() == 1;
            this.f11492c = parcel.readByte() == 1;
            this.f11493d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i9 = 0; i9 < readInt; i9++) {
                arrayList.add(b.b(parcel));
            }
            this.f11495f = Collections.unmodifiableList(arrayList);
            this.f11494e = parcel.readLong();
            this.f11496g = parcel.readByte() == 1;
            this.f11497h = parcel.readLong();
            this.f11498i = parcel.readInt();
            this.f11499j = parcel.readInt();
            this.f11500k = parcel.readInt();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c b(Parcel parcel) {
            return new c(parcel);
        }
    }

    private tk(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i9 = 0; i9 < readInt; i9++) {
            arrayList.add(c.b(parcel));
        }
        this.f11489a = Collections.unmodifiableList(arrayList);
    }

    public static tk a(yg ygVar) {
        int w2 = ygVar.w();
        ArrayList arrayList = new ArrayList(w2);
        for (int i9 = 0; i9 < w2; i9++) {
            arrayList.add(c.b(ygVar));
        }
        return new tk(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int size = this.f11489a.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            ((c) this.f11489a.get(i10)).c(parcel);
        }
    }

    public /* synthetic */ tk(Parcel parcel, a aVar) {
        this(parcel);
    }

    private tk(List list) {
        this.f11489a = Collections.unmodifiableList(list);
    }
}
