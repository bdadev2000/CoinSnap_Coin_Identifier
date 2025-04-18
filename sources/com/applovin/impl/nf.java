package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.bf;

/* loaded from: classes.dex */
public final class nf implements bf.b {
    public static final Parcelable.Creator<nf> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final long f25705a;

    /* renamed from: b, reason: collision with root package name */
    public final long f25706b;

    /* renamed from: c, reason: collision with root package name */
    public final long f25707c;
    public final long d;

    /* renamed from: f, reason: collision with root package name */
    public final long f25708f;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public nf[] newArray(int i2) {
            return new nf[i2];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public nf createFromParcel(Parcel parcel) {
            return new nf(parcel, null);
        }
    }

    public nf(long j2, long j3, long j4, long j5, long j6) {
        this.f25705a = j2;
        this.f25706b = j3;
        this.f25707c = j4;
        this.d = j5;
        this.f25708f = j6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nf.class != obj.getClass()) {
            return false;
        }
        nf nfVar = (nf) obj;
        return this.f25705a == nfVar.f25705a && this.f25706b == nfVar.f25706b && this.f25707c == nfVar.f25707c && this.d == nfVar.d && this.f25708f == nfVar.f25708f;
    }

    public int hashCode() {
        return sc.a(this.f25708f) + ((sc.a(this.d) + ((sc.a(this.f25707c) + ((sc.a(this.f25706b) + ((sc.a(this.f25705a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f25705a + ", photoSize=" + this.f25706b + ", photoPresentationTimestampUs=" + this.f25707c + ", videoStartPosition=" + this.d + ", videoSize=" + this.f25708f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f25705a);
        parcel.writeLong(this.f25706b);
        parcel.writeLong(this.f25707c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.f25708f);
    }

    private nf(Parcel parcel) {
        this.f25705a = parcel.readLong();
        this.f25706b = parcel.readLong();
        this.f25707c = parcel.readLong();
        this.d = parcel.readLong();
        this.f25708f = parcel.readLong();
    }

    public /* synthetic */ nf(Parcel parcel, a aVar) {
        this(parcel);
    }
}
