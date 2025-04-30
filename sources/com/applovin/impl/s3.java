package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.CommentFrame;

/* loaded from: classes.dex */
public final class s3 extends ua {
    public static final Parcelable.Creator<s3> CREATOR = new a();
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10566c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10567d;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public s3[] newArray(int i9) {
            return new s3[i9];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public s3 createFromParcel(Parcel parcel) {
            return new s3(parcel);
        }
    }

    public s3(Parcel parcel) {
        super(CommentFrame.ID);
        this.b = (String) yp.a((Object) parcel.readString());
        this.f10566c = (String) yp.a((Object) parcel.readString());
        this.f10567d = (String) yp.a((Object) parcel.readString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s3.class != obj.getClass()) {
            return false;
        }
        s3 s3Var = (s3) obj;
        if (yp.a((Object) this.f10566c, (Object) s3Var.f10566c) && yp.a((Object) this.b, (Object) s3Var.b) && yp.a((Object) this.f10567d, (Object) s3Var.f10567d)) {
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
        String str2 = this.f10566c;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i12 + i10) * 31;
        String str3 = this.f10567d;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return i13 + i11;
    }

    @Override // com.applovin.impl.ua
    public String toString() {
        return this.f11577a + ": language=" + this.b + ", description=" + this.f10566c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f11577a);
        parcel.writeString(this.b);
        parcel.writeString(this.f10567d);
    }

    public s3(String str, String str2, String str3) {
        super(CommentFrame.ID);
        this.b = str;
        this.f10566c = str2;
        this.f10567d = str3;
    }
}
