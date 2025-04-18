package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.CommentFrame;

/* loaded from: classes.dex */
public final class s3 extends ua {
    public static final Parcelable.Creator<s3> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f7441b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7442c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7443d;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public s3[] newArray(int i10) {
            return new s3[i10];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public s3 createFromParcel(Parcel parcel) {
            return new s3(parcel);
        }
    }

    public s3(Parcel parcel) {
        super(CommentFrame.ID);
        this.f7441b = (String) yp.a((Object) parcel.readString());
        this.f7442c = (String) yp.a((Object) parcel.readString());
        this.f7443d = (String) yp.a((Object) parcel.readString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s3.class != obj.getClass()) {
            return false;
        }
        s3 s3Var = (s3) obj;
        if (yp.a((Object) this.f7442c, (Object) s3Var.f7442c) && yp.a((Object) this.f7441b, (Object) s3Var.f7441b) && yp.a((Object) this.f7443d, (Object) s3Var.f7443d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        String str = this.f7441b;
        int i12 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i10 + 527) * 31;
        String str2 = this.f7442c;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f7443d;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }

    @Override // com.applovin.impl.ua
    public String toString() {
        return this.a + ": language=" + this.f7441b + ", description=" + this.f7442c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.a);
        parcel.writeString(this.f7441b);
        parcel.writeString(this.f7443d);
    }

    public s3(String str, String str2, String str3) {
        super(CommentFrame.ID);
        this.f7441b = str;
        this.f7442c = str2;
        this.f7443d = str3;
    }
}
