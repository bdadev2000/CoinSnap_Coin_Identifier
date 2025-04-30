package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.we;

/* renamed from: com.applovin.impl.if, reason: invalid class name */
/* loaded from: classes.dex */
public final class Cif implements we.b {
    public static final Parcelable.Creator<Cif> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final long f8290a;
    public final long b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8291c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8292d;

    /* renamed from: f, reason: collision with root package name */
    public final long f8293f;

    /* renamed from: com.applovin.impl.if$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cif[] newArray(int i9) {
            return new Cif[i9];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cif createFromParcel(Parcel parcel) {
            return new Cif(parcel, null);
        }
    }

    public Cif(long j7, long j9, long j10, long j11, long j12) {
        this.f8290a = j7;
        this.b = j9;
        this.f8291c = j10;
        this.f8292d = j11;
        this.f8293f = j12;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Cif.class != obj.getClass()) {
            return false;
        }
        Cif cif = (Cif) obj;
        if (this.f8290a == cif.f8290a && this.b == cif.b && this.f8291c == cif.f8291c && this.f8292d == cif.f8292d && this.f8293f == cif.f8293f) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return nc.a(this.f8293f) + ((nc.a(this.f8292d) + ((nc.a(this.f8291c) + ((nc.a(this.b) + ((nc.a(this.f8290a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f8290a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.f8291c + ", videoStartPosition=" + this.f8292d + ", videoSize=" + this.f8293f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeLong(this.f8290a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.f8291c);
        parcel.writeLong(this.f8292d);
        parcel.writeLong(this.f8293f);
    }

    private Cif(Parcel parcel) {
        this.f8290a = parcel.readLong();
        this.b = parcel.readLong();
        this.f8291c = parcel.readLong();
        this.f8292d = parcel.readLong();
        this.f8293f = parcel.readLong();
    }

    public /* synthetic */ Cif(Parcel parcel, a aVar) {
        this(parcel);
    }
}
