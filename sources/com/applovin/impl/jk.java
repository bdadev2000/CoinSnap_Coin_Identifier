package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.bf;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final class jk implements bf.b {
    public static final Parcelable.Creator<jk> CREATOR = new a();

    /* renamed from: a */
    public final List f24701a;

    public jk(List list) {
        this.f24701a = list;
        b1.a(!a(list));
    }

    private static boolean a(List list) {
        if (list.isEmpty()) {
            return false;
        }
        long j2 = ((b) list.get(0)).f24703b;
        for (int i2 = 1; i2 < list.size(); i2++) {
            if (((b) list.get(i2)).f24702a < j2) {
                return true;
            }
            j2 = ((b) list.get(i2)).f24703b;
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
        if (obj == null || jk.class != obj.getClass()) {
            return false;
        }
        return this.f24701a.equals(((jk) obj).f24701a);
    }

    public int hashCode() {
        return this.f24701a.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f24701a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeList(this.f24701a);
    }

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public jk createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, b.class.getClassLoader());
            return new jk(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public jk[] newArray(int i2) {
            return new jk[i2];
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable {

        /* renamed from: a */
        public final long f24702a;

        /* renamed from: b */
        public final long f24703b;

        /* renamed from: c */
        public final int f24704c;
        public static final Comparator d = new ns(6);
        public static final Parcelable.Creator<b> CREATOR = new a();

        public b(long j2, long j3, int i2) {
            b1.a(j2 < j3);
            this.f24702a = j2;
            this.f24703b = j3;
            this.f24704c = i2;
        }

        public static /* synthetic */ int a(b bVar, b bVar2) {
            return y3.e().a(bVar.f24702a, bVar2.f24702a).a(bVar.f24703b, bVar2.f24703b).a(bVar.f24704c, bVar2.f24704c).d();
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
            return this.f24702a == bVar.f24702a && this.f24703b == bVar.f24703b && this.f24704c == bVar.f24704c;
        }

        public int hashCode() {
            return Objects.hashCode(Long.valueOf(this.f24702a), Long.valueOf(this.f24703b), Integer.valueOf(this.f24704c));
        }

        public String toString() {
            return xp.a("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f24702a), Long.valueOf(this.f24703b), Integer.valueOf(this.f24704c));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeLong(this.f24702a);
            parcel.writeLong(this.f24703b);
            parcel.writeInt(this.f24704c);
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
            public b[] newArray(int i2) {
                return new b[i2];
            }
        }
    }
}
