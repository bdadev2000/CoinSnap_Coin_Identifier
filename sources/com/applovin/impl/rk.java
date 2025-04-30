package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class rk extends pk {
    public static final Parcelable.Creator<rk> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final long f10497a;
    public final boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10498c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10499d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f10500f;

    /* renamed from: g, reason: collision with root package name */
    public final long f10501g;

    /* renamed from: h, reason: collision with root package name */
    public final long f10502h;

    /* renamed from: i, reason: collision with root package name */
    public final List f10503i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f10504j;

    /* renamed from: k, reason: collision with root package name */
    public final long f10505k;
    public final int l;
    public final int m;

    /* renamed from: n, reason: collision with root package name */
    public final int f10506n;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rk[] newArray(int i9) {
            return new rk[i9];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rk createFromParcel(Parcel parcel) {
            return new rk(parcel, null);
        }
    }

    private rk(long j7, boolean z8, boolean z9, boolean z10, boolean z11, long j9, long j10, List list, boolean z12, long j11, int i9, int i10, int i11) {
        this.f10497a = j7;
        this.b = z8;
        this.f10498c = z9;
        this.f10499d = z10;
        this.f10500f = z11;
        this.f10501g = j9;
        this.f10502h = j10;
        this.f10503i = Collections.unmodifiableList(list);
        this.f10504j = z12;
        this.f10505k = j11;
        this.l = i9;
        this.m = i10;
        this.f10506n = i11;
    }

    public static rk a(yg ygVar, long j7, io ioVar) {
        boolean z8;
        List list;
        boolean z9;
        boolean z10;
        long j9;
        boolean z11;
        long j10;
        int i9;
        int i10;
        int i11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        long j11;
        boolean z17;
        long j12;
        boolean z18;
        long j13;
        long y4 = ygVar.y();
        if ((ygVar.w() & 128) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        List emptyList = Collections.emptyList();
        if (!z8) {
            int w2 = ygVar.w();
            if ((w2 & 128) != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if ((w2 & 64) != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            if ((w2 & 32) != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            if ((w2 & 16) != 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (z14 && !z16) {
                j11 = eo.a(ygVar, j7);
            } else {
                j11 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            }
            if (!z14) {
                int w9 = ygVar.w();
                ArrayList arrayList = new ArrayList(w9);
                for (int i12 = 0; i12 < w9; i12++) {
                    int w10 = ygVar.w();
                    if (!z16) {
                        j13 = eo.a(ygVar, j7);
                    } else {
                        j13 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                    }
                    arrayList.add(new b(w10, j13, ioVar.b(j13), null));
                }
                emptyList = arrayList;
            }
            if (z15) {
                long w11 = ygVar.w();
                if ((128 & w11) != 0) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                j12 = ((((w11 & 1) << 32) | ygVar.y()) * 1000) / 90;
                z17 = z18;
            } else {
                z17 = false;
                j12 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            }
            i9 = ygVar.C();
            z12 = z14;
            i10 = ygVar.w();
            i11 = ygVar.w();
            list = emptyList;
            long j14 = j11;
            z11 = z17;
            j10 = j12;
            z10 = z16;
            z9 = z13;
            j9 = j14;
        } else {
            list = emptyList;
            z9 = false;
            z10 = false;
            j9 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            z11 = false;
            j10 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            i9 = 0;
            i10 = 0;
            i11 = 0;
            z12 = false;
        }
        return new rk(y4, z8, z9, z12, z10, j9, ioVar.b(j9), list, z11, j10, i9, i10, i11);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeLong(this.f10497a);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f10498c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f10499d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f10500f ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f10501g);
        parcel.writeLong(this.f10502h);
        int size = this.f10503i.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            ((b) this.f10503i.get(i10)).b(parcel);
        }
        parcel.writeByte(this.f10504j ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f10505k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        parcel.writeInt(this.f10506n);
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f10507a;
        public final long b;

        /* renamed from: c, reason: collision with root package name */
        public final long f10508c;

        private b(int i9, long j7, long j9) {
            this.f10507a = i9;
            this.b = j7;
            this.f10508c = j9;
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.f10507a);
            parcel.writeLong(this.b);
            parcel.writeLong(this.f10508c);
        }

        public /* synthetic */ b(int i9, long j7, long j9, a aVar) {
            this(i9, j7, j9);
        }
    }

    private rk(Parcel parcel) {
        this.f10497a = parcel.readLong();
        this.b = parcel.readByte() == 1;
        this.f10498c = parcel.readByte() == 1;
        this.f10499d = parcel.readByte() == 1;
        this.f10500f = parcel.readByte() == 1;
        this.f10501g = parcel.readLong();
        this.f10502h = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i9 = 0; i9 < readInt; i9++) {
            arrayList.add(b.a(parcel));
        }
        this.f10503i = Collections.unmodifiableList(arrayList);
        this.f10504j = parcel.readByte() == 1;
        this.f10505k = parcel.readLong();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
        this.f10506n = parcel.readInt();
    }

    public /* synthetic */ rk(Parcel parcel, a aVar) {
        this(parcel);
    }
}
