package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.d9;
import com.applovin.impl.we;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class u7 implements we.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f11571a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11572c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11573d;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f11574f;

    /* renamed from: g, reason: collision with root package name */
    private int f11575g;

    /* renamed from: h, reason: collision with root package name */
    private static final d9 f11569h = new d9.b().f(MimeTypes.APPLICATION_ID3).a();

    /* renamed from: i, reason: collision with root package name */
    private static final d9 f11570i = new d9.b().f(MimeTypes.APPLICATION_SCTE35).a();
    public static final Parcelable.Creator<u7> CREATOR = new a();

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u7[] newArray(int i9) {
            return new u7[i9];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u7 createFromParcel(Parcel parcel) {
            return new u7(parcel);
        }
    }

    public u7(Parcel parcel) {
        this.f11571a = (String) yp.a((Object) parcel.readString());
        this.b = (String) yp.a((Object) parcel.readString());
        this.f11572c = parcel.readLong();
        this.f11573d = parcel.readLong();
        this.f11574f = (byte[]) yp.a((Object) parcel.createByteArray());
    }

    @Override // com.applovin.impl.we.b
    public byte[] a() {
        if (b() != null) {
            return this.f11574f;
        }
        return null;
    }

    @Override // com.applovin.impl.we.b
    public d9 b() {
        String str = this.f11571a;
        str.getClass();
        char c9 = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c9 = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c9 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c9 = 2;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                return f11570i;
            case 1:
            case 2:
                return f11569h;
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u7.class != obj.getClass()) {
            return false;
        }
        u7 u7Var = (u7) obj;
        if (this.f11572c == u7Var.f11572c && this.f11573d == u7Var.f11573d && yp.a((Object) this.f11571a, (Object) u7Var.f11571a) && yp.a((Object) this.b, (Object) u7Var.b) && Arrays.equals(this.f11574f, u7Var.f11574f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i9;
        if (this.f11575g == 0) {
            String str = this.f11571a;
            int i10 = 0;
            if (str != null) {
                i9 = str.hashCode();
            } else {
                i9 = 0;
            }
            int i11 = (i9 + 527) * 31;
            String str2 = this.b;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            int i12 = (i11 + i10) * 31;
            long j7 = this.f11572c;
            int i13 = (i12 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
            long j9 = this.f11573d;
            this.f11575g = Arrays.hashCode(this.f11574f) + ((i13 + ((int) (j9 ^ (j9 >>> 32)))) * 31);
        }
        return this.f11575g;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f11571a + ", id=" + this.f11573d + ", durationMs=" + this.f11572c + ", value=" + this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f11571a);
        parcel.writeString(this.b);
        parcel.writeLong(this.f11572c);
        parcel.writeLong(this.f11573d);
        parcel.writeByteArray(this.f11574f);
    }

    public u7(String str, String str2, long j7, long j9, byte[] bArr) {
        this.f11571a = str;
        this.b = str2;
        this.f11572c = j7;
        this.f11573d = j9;
        this.f11574f = bArr;
    }
}
