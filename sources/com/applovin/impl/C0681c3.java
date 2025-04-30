package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ChapterFrame;
import java.util.Arrays;

/* renamed from: com.applovin.impl.c3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0681c3 extends ua {
    public static final Parcelable.Creator<C0681c3> CREATOR = new a();
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6949c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6950d;

    /* renamed from: f, reason: collision with root package name */
    public final long f6951f;

    /* renamed from: g, reason: collision with root package name */
    public final long f6952g;

    /* renamed from: h, reason: collision with root package name */
    private final ua[] f6953h;

    /* renamed from: com.applovin.impl.c3$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0681c3[] newArray(int i9) {
            return new C0681c3[i9];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0681c3 createFromParcel(Parcel parcel) {
            return new C0681c3(parcel);
        }
    }

    public C0681c3(Parcel parcel) {
        super(ChapterFrame.ID);
        this.b = (String) yp.a((Object) parcel.readString());
        this.f6949c = parcel.readInt();
        this.f6950d = parcel.readInt();
        this.f6951f = parcel.readLong();
        this.f6952g = parcel.readLong();
        int readInt = parcel.readInt();
        this.f6953h = new ua[readInt];
        for (int i9 = 0; i9 < readInt; i9++) {
            this.f6953h[i9] = (ua) parcel.readParcelable(ua.class.getClassLoader());
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
        if (obj == null || C0681c3.class != obj.getClass()) {
            return false;
        }
        C0681c3 c0681c3 = (C0681c3) obj;
        if (this.f6949c == c0681c3.f6949c && this.f6950d == c0681c3.f6950d && this.f6951f == c0681c3.f6951f && this.f6952g == c0681c3.f6952g && yp.a((Object) this.b, (Object) c0681c3.b) && Arrays.equals(this.f6953h, c0681c3.f6953h)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i9;
        int i10 = (((((((this.f6949c + 527) * 31) + this.f6950d) * 31) + ((int) this.f6951f)) * 31) + ((int) this.f6952g)) * 31;
        String str = this.b;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        return i10 + i9;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.b);
        parcel.writeInt(this.f6949c);
        parcel.writeInt(this.f6950d);
        parcel.writeLong(this.f6951f);
        parcel.writeLong(this.f6952g);
        parcel.writeInt(this.f6953h.length);
        for (ua uaVar : this.f6953h) {
            parcel.writeParcelable(uaVar, 0);
        }
    }

    public C0681c3(String str, int i9, int i10, long j7, long j9, ua[] uaVarArr) {
        super(ChapterFrame.ID);
        this.b = str;
        this.f6949c = i9;
        this.f6950d = i10;
        this.f6951f = j7;
        this.f6952g = j9;
        this.f6953h = uaVarArr;
    }
}
