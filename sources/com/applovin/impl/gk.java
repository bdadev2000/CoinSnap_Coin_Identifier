package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.we;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final class gk implements we.b {
    public static final Parcelable.Creator<gk> CREATOR = new a();
    public final List a;

    public gk(List list) {
        this.a = list;
        a1.a(!a(list));
    }

    private static boolean a(List list) {
        if (list.isEmpty()) {
            return false;
        }
        long j3 = ((b) list.get(0)).f4945b;
        for (int i10 = 1; i10 < list.size(); i10++) {
            if (((b) list.get(i10)).a < j3) {
                return true;
            }
            j3 = ((b) list.get(i10)).f4945b;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gk.class == obj.getClass()) {
            return this.a.equals(((gk) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.a);
    }

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public gk createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, b.class.getClassLoader());
            return new gk(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public gk[] newArray(int i10) {
            return new gk[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable {
        public final long a;

        /* renamed from: b */
        public final long f4945b;

        /* renamed from: c */
        public final int f4946c;

        /* renamed from: d */
        public static final Comparator f4944d = new et(6);
        public static final Parcelable.Creator<b> CREATOR = new a();

        public b(long j3, long j10, int i10) {
            boolean z10;
            if (j3 < j10) {
                z10 = true;
            } else {
                z10 = false;
            }
            a1.a(z10);
            this.a = j3;
            this.f4945b = j10;
            this.f4946c = i10;
        }

        public static /* synthetic */ int a(b bVar, b bVar2) {
            return w3.e().a(bVar.a, bVar2.a).a(bVar.f4945b, bVar2.f4945b).a(bVar.f4946c, bVar2.f4946c).d();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a == bVar.a && this.f4945b == bVar.f4945b && this.f4946c == bVar.f4946c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(Long.valueOf(this.a), Long.valueOf(this.f4945b), Integer.valueOf(this.f4946c));
        }

        public String toString() {
            return yp.a("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.a), Long.valueOf(this.f4945b), Integer.valueOf(this.f4946c));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.a);
            parcel.writeLong(this.f4945b);
            parcel.writeInt(this.f4946c);
        }

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }
    }
}
