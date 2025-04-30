package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ChapterTocFrame;
import java.util.Arrays;

/* renamed from: com.applovin.impl.d3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0686d3 extends ua {
    public static final Parcelable.Creator<C0686d3> CREATOR = new a();
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7170c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7171d;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f7172f;

    /* renamed from: g, reason: collision with root package name */
    private final ua[] f7173g;

    /* renamed from: com.applovin.impl.d3$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0686d3[] newArray(int i9) {
            return new C0686d3[i9];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0686d3 createFromParcel(Parcel parcel) {
            return new C0686d3(parcel);
        }
    }

    public C0686d3(Parcel parcel) {
        super(ChapterTocFrame.ID);
        this.b = (String) yp.a((Object) parcel.readString());
        this.f7170c = parcel.readByte() != 0;
        this.f7171d = parcel.readByte() != 0;
        this.f7172f = (String[]) yp.a((Object) parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f7173g = new ua[readInt];
        for (int i9 = 0; i9 < readInt; i9++) {
            this.f7173g[i9] = (ua) parcel.readParcelable(ua.class.getClassLoader());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0686d3.class != obj.getClass()) {
            return false;
        }
        C0686d3 c0686d3 = (C0686d3) obj;
        if (this.f7170c == c0686d3.f7170c && this.f7171d == c0686d3.f7171d && yp.a((Object) this.b, (Object) c0686d3.b) && Arrays.equals(this.f7172f, c0686d3.f7172f) && Arrays.equals(this.f7173g, c0686d3.f7173g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i9;
        int i10 = ((((this.f7170c ? 1 : 0) + 527) * 31) + (this.f7171d ? 1 : 0)) * 31;
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
        parcel.writeByte(this.f7170c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f7171d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f7172f);
        parcel.writeInt(this.f7173g.length);
        for (ua uaVar : this.f7173g) {
            parcel.writeParcelable(uaVar, 0);
        }
    }

    public C0686d3(String str, boolean z8, boolean z9, String[] strArr, ua[] uaVarArr) {
        super(ChapterTocFrame.ID);
        this.b = str;
        this.f7170c = z8;
        this.f7171d = z9;
        this.f7172f = strArr;
        this.f7173g = uaVarArr;
    }
}
