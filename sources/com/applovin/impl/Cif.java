package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.we;

/* renamed from: com.applovin.impl.if, reason: invalid class name */
/* loaded from: classes.dex */
public final class Cif implements we.b {
    public static final Parcelable.Creator<Cif> CREATOR = new a();
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5326b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5327c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5328d;

    /* renamed from: f, reason: collision with root package name */
    public final long f5329f;

    /* renamed from: com.applovin.impl.if$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cif[] newArray(int i10) {
            return new Cif[i10];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cif createFromParcel(Parcel parcel) {
            return new Cif(parcel, null);
        }
    }

    public Cif(long j3, long j10, long j11, long j12, long j13) {
        this.a = j3;
        this.f5326b = j10;
        this.f5327c = j11;
        this.f5328d = j12;
        this.f5329f = j13;
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
        if (this.a == cif.a && this.f5326b == cif.f5326b && this.f5327c == cif.f5327c && this.f5328d == cif.f5328d && this.f5329f == cif.f5329f) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return nc.a(this.f5329f) + ((nc.a(this.f5328d) + ((nc.a(this.f5327c) + ((nc.a(this.f5326b) + ((nc.a(this.a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.a + ", photoSize=" + this.f5326b + ", photoPresentationTimestampUs=" + this.f5327c + ", videoStartPosition=" + this.f5328d + ", videoSize=" + this.f5329f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.f5326b);
        parcel.writeLong(this.f5327c);
        parcel.writeLong(this.f5328d);
        parcel.writeLong(this.f5329f);
    }

    private Cif(Parcel parcel) {
        this.a = parcel.readLong();
        this.f5326b = parcel.readLong();
        this.f5327c = parcel.readLong();
        this.f5328d = parcel.readLong();
        this.f5329f = parcel.readLong();
    }

    public /* synthetic */ Cif(Parcel parcel, a aVar) {
        this(parcel);
    }
}
