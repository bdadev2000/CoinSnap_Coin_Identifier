package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ChapterTocFrame;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d3 extends ua {
    public static final Parcelable.Creator<d3> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f4194b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4195c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4196d;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f4197f;

    /* renamed from: g, reason: collision with root package name */
    private final ua[] f4198g;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d3[] newArray(int i10) {
            return new d3[i10];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d3 createFromParcel(Parcel parcel) {
            return new d3(parcel);
        }
    }

    public d3(Parcel parcel) {
        super(ChapterTocFrame.ID);
        this.f4194b = (String) yp.a((Object) parcel.readString());
        this.f4195c = parcel.readByte() != 0;
        this.f4196d = parcel.readByte() != 0;
        this.f4197f = (String[]) yp.a((Object) parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f4198g = new ua[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f4198g[i10] = (ua) parcel.readParcelable(ua.class.getClassLoader());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d3.class != obj.getClass()) {
            return false;
        }
        d3 d3Var = (d3) obj;
        if (this.f4195c == d3Var.f4195c && this.f4196d == d3Var.f4196d && yp.a((Object) this.f4194b, (Object) d3Var.f4194b) && Arrays.equals(this.f4197f, d3Var.f4197f) && Arrays.equals(this.f4198g, d3Var.f4198g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = ((((this.f4195c ? 1 : 0) + 527) * 31) + (this.f4196d ? 1 : 0)) * 31;
        String str = this.f4194b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4194b);
        parcel.writeByte(this.f4195c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f4196d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f4197f);
        parcel.writeInt(this.f4198g.length);
        for (ua uaVar : this.f4198g) {
            parcel.writeParcelable(uaVar, 0);
        }
    }

    public d3(String str, boolean z10, boolean z11, String[] strArr, ua[] uaVarArr) {
        super(ChapterTocFrame.ID);
        this.f4194b = str;
        this.f4195c = z10;
        this.f4196d = z11;
        this.f4197f = strArr;
        this.f4198g = uaVarArr;
    }
}
