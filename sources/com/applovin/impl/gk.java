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

    /* renamed from: a */
    public final List f7919a;

    public gk(List list) {
        this.f7919a = list;
        AbstractC0669a1.a(!a(list));
    }

    private static boolean a(List list) {
        if (list.isEmpty()) {
            return false;
        }
        long j7 = ((b) list.get(0)).b;
        for (int i9 = 1; i9 < list.size(); i9++) {
            if (((b) list.get(i9)).f7921a < j7) {
                return true;
            }
            j7 = ((b) list.get(i9)).b;
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
            return this.f7919a.equals(((gk) obj).f7919a);
        }
        return false;
    }

    public int hashCode() {
        return this.f7919a.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f7919a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeList(this.f7919a);
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
        public gk[] newArray(int i9) {
            return new gk[i9];
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable {

        /* renamed from: a */
        public final long f7921a;
        public final long b;

        /* renamed from: c */
        public final int f7922c;

        /* renamed from: d */
        public static final Comparator f7920d = new X(6);
        public static final Parcelable.Creator<b> CREATOR = new a();

        public b(long j7, long j9, int i9) {
            boolean z8;
            if (j7 < j9) {
                z8 = true;
            } else {
                z8 = false;
            }
            AbstractC0669a1.a(z8);
            this.f7921a = j7;
            this.b = j9;
            this.f7922c = i9;
        }

        public static /* synthetic */ int a(b bVar, b bVar2) {
            return w3.e().a(bVar.f7921a, bVar2.f7921a).a(bVar.b, bVar2.b).a(bVar.f7922c, bVar2.f7922c).d();
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
            if (this.f7921a == bVar.f7921a && this.b == bVar.b && this.f7922c == bVar.f7922c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(Long.valueOf(this.f7921a), Long.valueOf(this.b), Integer.valueOf(this.f7922c));
        }

        public String toString() {
            return yp.a("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f7921a), Long.valueOf(this.b), Integer.valueOf(this.f7922c));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i9) {
            parcel.writeLong(this.f7921a);
            parcel.writeLong(this.b);
            parcel.writeInt(this.f7922c);
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
            public b[] newArray(int i9) {
                return new b[i9];
            }
        }
    }
}
