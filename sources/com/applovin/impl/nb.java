package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.InternalFrame;

/* loaded from: classes.dex */
public final class nb extends ua {
    public static final Parcelable.Creator<nb> CREATOR = new a();
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9326c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9327d;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public nb[] newArray(int i9) {
            return new nb[i9];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public nb createFromParcel(Parcel parcel) {
            return new nb(parcel);
        }
    }

    public nb(Parcel parcel) {
        super(InternalFrame.ID);
        this.b = (String) yp.a((Object) parcel.readString());
        this.f9326c = (String) yp.a((Object) parcel.readString());
        this.f9327d = (String) yp.a((Object) parcel.readString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nb.class != obj.getClass()) {
            return false;
        }
        nb nbVar = (nb) obj;
        if (yp.a((Object) this.f9326c, (Object) nbVar.f9326c) && yp.a((Object) this.b, (Object) nbVar.b) && yp.a((Object) this.f9327d, (Object) nbVar.f9327d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i9;
        int i10;
        String str = this.b;
        int i11 = 0;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i12 = (i9 + 527) * 31;
        String str2 = this.f9326c;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i12 + i10) * 31;
        String str3 = this.f9327d;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return i13 + i11;
    }

    @Override // com.applovin.impl.ua
    public String toString() {
        return this.f11577a + ": domain=" + this.b + ", description=" + this.f9326c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f11577a);
        parcel.writeString(this.b);
        parcel.writeString(this.f9327d);
    }

    public nb(String str, String str2, String str3) {
        super(InternalFrame.ID);
        this.b = str;
        this.f9326c = str2;
        this.f9327d = str3;
    }
}
