package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.d9;
import com.applovin.impl.we;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class u7 implements we.b {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8358b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8359c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8360d;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f8361f;

    /* renamed from: g, reason: collision with root package name */
    private int f8362g;

    /* renamed from: h, reason: collision with root package name */
    private static final d9 f8356h = new d9.b().f(MimeTypes.APPLICATION_ID3).a();

    /* renamed from: i, reason: collision with root package name */
    private static final d9 f8357i = new d9.b().f(MimeTypes.APPLICATION_SCTE35).a();
    public static final Parcelable.Creator<u7> CREATOR = new a();

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u7[] newArray(int i10) {
            return new u7[i10];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u7 createFromParcel(Parcel parcel) {
            return new u7(parcel);
        }
    }

    public u7(Parcel parcel) {
        this.a = (String) yp.a((Object) parcel.readString());
        this.f8358b = (String) yp.a((Object) parcel.readString());
        this.f8359c = parcel.readLong();
        this.f8360d = parcel.readLong();
        this.f8361f = (byte[]) yp.a((Object) parcel.createByteArray());
    }

    @Override // com.applovin.impl.we.b
    public byte[] a() {
        if (b() != null) {
            return this.f8361f;
        }
        return null;
    }

    @Override // com.applovin.impl.we.b
    public d9 b() {
        String str = this.a;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c10 = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return f8357i;
            case 1:
            case 2:
                return f8356h;
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
        if (this.f8359c == u7Var.f8359c && this.f8360d == u7Var.f8360d && yp.a((Object) this.a, (Object) u7Var.a) && yp.a((Object) this.f8358b, (Object) u7Var.f8358b) && Arrays.equals(this.f8361f, u7Var.f8361f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        if (this.f8362g == 0) {
            String str = this.a;
            int i11 = 0;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            int i12 = (i10 + 527) * 31;
            String str2 = this.f8358b;
            if (str2 != null) {
                i11 = str2.hashCode();
            }
            int i13 = (i12 + i11) * 31;
            long j3 = this.f8359c;
            int i14 = (i13 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            long j10 = this.f8360d;
            this.f8362g = Arrays.hashCode(this.f8361f) + ((i14 + ((int) (j10 ^ (j10 >>> 32)))) * 31);
        }
        return this.f8362g;
    }

    public String toString() {
        return "EMSG: scheme=" + this.a + ", id=" + this.f8360d + ", durationMs=" + this.f8359c + ", value=" + this.f8358b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.a);
        parcel.writeString(this.f8358b);
        parcel.writeLong(this.f8359c);
        parcel.writeLong(this.f8360d);
        parcel.writeByteArray(this.f8361f);
    }

    public u7(String str, String str2, long j3, long j10, byte[] bArr) {
        this.a = str;
        this.f8358b = str2;
        this.f8359c = j3;
        this.f8360d = j10;
        this.f8361f = bArr;
    }
}
