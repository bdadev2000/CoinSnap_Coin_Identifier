package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ChapterFrame;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c3 extends ua {
    public static final Parcelable.Creator<c3> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f3978b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3979c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3980d;

    /* renamed from: f, reason: collision with root package name */
    public final long f3981f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3982g;

    /* renamed from: h, reason: collision with root package name */
    private final ua[] f3983h;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c3[] newArray(int i10) {
            return new c3[i10];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c3 createFromParcel(Parcel parcel) {
            return new c3(parcel);
        }
    }

    public c3(Parcel parcel) {
        super(ChapterFrame.ID);
        this.f3978b = (String) yp.a((Object) parcel.readString());
        this.f3979c = parcel.readInt();
        this.f3980d = parcel.readInt();
        this.f3981f = parcel.readLong();
        this.f3982g = parcel.readLong();
        int readInt = parcel.readInt();
        this.f3983h = new ua[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f3983h[i10] = (ua) parcel.readParcelable(ua.class.getClassLoader());
        }
    }

    @Override // com.applovin.impl.ua, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c3.class != obj.getClass()) {
            return false;
        }
        c3 c3Var = (c3) obj;
        if (this.f3979c == c3Var.f3979c && this.f3980d == c3Var.f3980d && this.f3981f == c3Var.f3981f && this.f3982g == c3Var.f3982g && yp.a((Object) this.f3978b, (Object) c3Var.f3978b) && Arrays.equals(this.f3983h, c3Var.f3983h)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = (((((((this.f3979c + 527) * 31) + this.f3980d) * 31) + ((int) this.f3981f)) * 31) + ((int) this.f3982g)) * 31;
        String str = this.f3978b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f3978b);
        parcel.writeInt(this.f3979c);
        parcel.writeInt(this.f3980d);
        parcel.writeLong(this.f3981f);
        parcel.writeLong(this.f3982g);
        parcel.writeInt(this.f3983h.length);
        for (ua uaVar : this.f3983h) {
            parcel.writeParcelable(uaVar, 0);
        }
    }

    public c3(String str, int i10, int i11, long j3, long j10, ua[] uaVarArr) {
        super(ChapterFrame.ID);
        this.f3978b = str;
        this.f3979c = i10;
        this.f3980d = i11;
        this.f3981f = j3;
        this.f3982g = j10;
        this.f3983h = uaVarArr;
    }
}
