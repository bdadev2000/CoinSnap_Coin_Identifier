package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class rk extends pk {
    public static final Parcelable.Creator<rk> CREATOR = new a();
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7358b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7359c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7360d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7361f;

    /* renamed from: g, reason: collision with root package name */
    public final long f7362g;

    /* renamed from: h, reason: collision with root package name */
    public final long f7363h;

    /* renamed from: i, reason: collision with root package name */
    public final List f7364i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f7365j;

    /* renamed from: k, reason: collision with root package name */
    public final long f7366k;

    /* renamed from: l, reason: collision with root package name */
    public final int f7367l;

    /* renamed from: m, reason: collision with root package name */
    public final int f7368m;

    /* renamed from: n, reason: collision with root package name */
    public final int f7369n;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rk[] newArray(int i10) {
            return new rk[i10];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rk createFromParcel(Parcel parcel) {
            return new rk(parcel, null);
        }
    }

    private rk(long j3, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, List list, boolean z14, long j12, int i10, int i11, int i12) {
        this.a = j3;
        this.f7358b = z10;
        this.f7359c = z11;
        this.f7360d = z12;
        this.f7361f = z13;
        this.f7362g = j10;
        this.f7363h = j11;
        this.f7364i = Collections.unmodifiableList(list);
        this.f7365j = z14;
        this.f7366k = j12;
        this.f7367l = i10;
        this.f7368m = i11;
        this.f7369n = i12;
    }

    public static rk a(yg ygVar, long j3, io ioVar) {
        boolean z10;
        List list;
        boolean z11;
        boolean z12;
        long j10;
        boolean z13;
        long j11;
        int i10;
        int i11;
        int i12;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        long j12;
        boolean z19;
        long j13;
        boolean z20;
        long j14;
        long y4 = ygVar.y();
        if ((ygVar.w() & 128) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        List emptyList = Collections.emptyList();
        if (!z10) {
            int w10 = ygVar.w();
            if ((w10 & 128) != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            if ((w10 & 64) != 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            if ((w10 & 32) != 0) {
                z17 = true;
            } else {
                z17 = false;
            }
            if ((w10 & 16) != 0) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (z16 && !z18) {
                j12 = eo.a(ygVar, j3);
            } else {
                j12 = C.TIME_UNSET;
            }
            if (!z16) {
                int w11 = ygVar.w();
                ArrayList arrayList = new ArrayList(w11);
                for (int i13 = 0; i13 < w11; i13++) {
                    int w12 = ygVar.w();
                    if (!z18) {
                        j14 = eo.a(ygVar, j3);
                    } else {
                        j14 = C.TIME_UNSET;
                    }
                    arrayList.add(new b(w12, j14, ioVar.b(j14), null));
                }
                emptyList = arrayList;
            }
            if (z17) {
                long w13 = ygVar.w();
                if ((128 & w13) != 0) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                j13 = ((((w13 & 1) << 32) | ygVar.y()) * 1000) / 90;
                z19 = z20;
            } else {
                z19 = false;
                j13 = C.TIME_UNSET;
            }
            i10 = ygVar.C();
            z14 = z16;
            i11 = ygVar.w();
            i12 = ygVar.w();
            list = emptyList;
            long j15 = j12;
            z13 = z19;
            j11 = j13;
            z12 = z18;
            z11 = z15;
            j10 = j15;
        } else {
            list = emptyList;
            z11 = false;
            z12 = false;
            j10 = C.TIME_UNSET;
            z13 = false;
            j11 = C.TIME_UNSET;
            i10 = 0;
            i11 = 0;
            i12 = 0;
            z14 = false;
        }
        return new rk(y4, z10, z11, z14, z12, j10, ioVar.b(j10), list, z13, j11, i10, i11, i12);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.a);
        parcel.writeByte(this.f7358b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f7359c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f7360d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f7361f ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f7362g);
        parcel.writeLong(this.f7363h);
        int size = this.f7364i.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            ((b) this.f7364i.get(i11)).b(parcel);
        }
        parcel.writeByte(this.f7365j ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f7366k);
        parcel.writeInt(this.f7367l);
        parcel.writeInt(this.f7368m);
        parcel.writeInt(this.f7369n);
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final int a;

        /* renamed from: b, reason: collision with root package name */
        public final long f7370b;

        /* renamed from: c, reason: collision with root package name */
        public final long f7371c;

        private b(int i10, long j3, long j10) {
            this.a = i10;
            this.f7370b = j3;
            this.f7371c = j10;
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.a);
            parcel.writeLong(this.f7370b);
            parcel.writeLong(this.f7371c);
        }

        public /* synthetic */ b(int i10, long j3, long j10, a aVar) {
            this(i10, j3, j10);
        }
    }

    private rk(Parcel parcel) {
        this.a = parcel.readLong();
        this.f7358b = parcel.readByte() == 1;
        this.f7359c = parcel.readByte() == 1;
        this.f7360d = parcel.readByte() == 1;
        this.f7361f = parcel.readByte() == 1;
        this.f7362g = parcel.readLong();
        this.f7363h = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(b.a(parcel));
        }
        this.f7364i = Collections.unmodifiableList(arrayList);
        this.f7365j = parcel.readByte() == 1;
        this.f7366k = parcel.readLong();
        this.f7367l = parcel.readInt();
        this.f7368m = parcel.readInt();
        this.f7369n = parcel.readInt();
    }

    public /* synthetic */ rk(Parcel parcel, a aVar) {
        this(parcel);
    }
}
