package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.bf;
import com.applovin.impl.f9;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class w7 implements bf.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f27703a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27704b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27705c;
    public final long d;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f27706f;

    /* renamed from: g, reason: collision with root package name */
    private int f27707g;

    /* renamed from: h, reason: collision with root package name */
    private static final f9 f27701h = new f9.b().f("application/id3").a();

    /* renamed from: i, reason: collision with root package name */
    private static final f9 f27702i = new f9.b().f("application/x-scte35").a();
    public static final Parcelable.Creator<w7> CREATOR = new a();

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public w7[] newArray(int i2) {
            return new w7[i2];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public w7 createFromParcel(Parcel parcel) {
            return new w7(parcel);
        }
    }

    public w7(Parcel parcel) {
        this.f27703a = (String) xp.a((Object) parcel.readString());
        this.f27704b = (String) xp.a((Object) parcel.readString());
        this.f27705c = parcel.readLong();
        this.d = parcel.readLong();
        this.f27706f = (byte[]) xp.a((Object) parcel.createByteArray());
    }

    @Override // com.applovin.impl.bf.b
    public byte[] a() {
        if (b() != null) {
            return this.f27706f;
        }
        return null;
    }

    @Override // com.applovin.impl.bf.b
    public f9 b() {
        String str = this.f27703a;
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c2 = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return f27702i;
            case 1:
            case 2:
                return f27701h;
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
        if (obj == null || w7.class != obj.getClass()) {
            return false;
        }
        w7 w7Var = (w7) obj;
        return this.f27705c == w7Var.f27705c && this.d == w7Var.d && xp.a((Object) this.f27703a, (Object) w7Var.f27703a) && xp.a((Object) this.f27704b, (Object) w7Var.f27704b) && Arrays.equals(this.f27706f, w7Var.f27706f);
    }

    public int hashCode() {
        if (this.f27707g == 0) {
            String str = this.f27703a;
            int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
            String str2 = this.f27704b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j2 = this.f27705c;
            int i2 = (hashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.d;
            this.f27707g = Arrays.hashCode(this.f27706f) + ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31);
        }
        return this.f27707g;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f27703a + ", id=" + this.d + ", durationMs=" + this.f27705c + ", value=" + this.f27704b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f27703a);
        parcel.writeString(this.f27704b);
        parcel.writeLong(this.f27705c);
        parcel.writeLong(this.d);
        parcel.writeByteArray(this.f27706f);
    }

    public w7(String str, String str2, long j2, long j3, byte[] bArr) {
        this.f27703a = str;
        this.f27704b = str2;
        this.f27705c = j2;
        this.d = j3;
        this.f27706f = bArr;
    }
}
