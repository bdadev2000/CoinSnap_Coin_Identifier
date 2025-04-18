package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.InternalFrame;

/* loaded from: classes.dex */
public final class nb extends ua {
    public static final Parcelable.Creator<nb> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f6390b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6391c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6392d;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public nb[] newArray(int i10) {
            return new nb[i10];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public nb createFromParcel(Parcel parcel) {
            return new nb(parcel);
        }
    }

    public nb(Parcel parcel) {
        super(InternalFrame.ID);
        this.f6390b = (String) yp.a((Object) parcel.readString());
        this.f6391c = (String) yp.a((Object) parcel.readString());
        this.f6392d = (String) yp.a((Object) parcel.readString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nb.class != obj.getClass()) {
            return false;
        }
        nb nbVar = (nb) obj;
        if (yp.a((Object) this.f6391c, (Object) nbVar.f6391c) && yp.a((Object) this.f6390b, (Object) nbVar.f6390b) && yp.a((Object) this.f6392d, (Object) nbVar.f6392d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        String str = this.f6390b;
        int i12 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i10 + 527) * 31;
        String str2 = this.f6391c;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f6392d;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }

    @Override // com.applovin.impl.ua
    public String toString() {
        return this.a + ": domain=" + this.f6390b + ", description=" + this.f6391c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.a);
        parcel.writeString(this.f6390b);
        parcel.writeString(this.f6392d);
    }

    public nb(String str, String str2, String str3) {
        super(InternalFrame.ID);
        this.f6390b = str;
        this.f6391c = str2;
        this.f6392d = str3;
    }
}
