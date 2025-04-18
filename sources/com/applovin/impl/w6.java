package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class w6 implements Comparator, Parcelable {
    public static final Parcelable.Creator<w6> CREATOR = new a();
    private final b[] a;

    /* renamed from: b, reason: collision with root package name */
    private int f8729b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8730c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8731d;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public w6[] newArray(int i10) {
            return new w6[i10];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public w6 createFromParcel(Parcel parcel) {
            return new w6(parcel);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();
        private int a;

        /* renamed from: b, reason: collision with root package name */
        public final UUID f8732b;

        /* renamed from: c, reason: collision with root package name */
        public final String f8733c;

        /* renamed from: d, reason: collision with root package name */
        public final String f8734d;

        /* renamed from: f, reason: collision with root package name */
        public final byte[] f8735f;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }
        }

        public b(Parcel parcel) {
            this.f8732b = new UUID(parcel.readLong(), parcel.readLong());
            this.f8733c = parcel.readString();
            this.f8734d = (String) yp.a((Object) parcel.readString());
            this.f8735f = parcel.createByteArray();
        }

        public boolean a(UUID uuid) {
            return r2.a.equals(this.f8732b) || uuid.equals(this.f8732b);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            if (!yp.a((Object) this.f8733c, (Object) bVar.f8733c) || !yp.a((Object) this.f8734d, (Object) bVar.f8734d) || !yp.a(this.f8732b, bVar.f8732b) || !Arrays.equals(this.f8735f, bVar.f8735f)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode;
            if (this.a == 0) {
                int hashCode2 = this.f8732b.hashCode() * 31;
                String str = this.f8733c;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                this.a = Arrays.hashCode(this.f8735f) + vd.e.c(this.f8734d, (hashCode2 + hashCode) * 31, 31);
            }
            return this.a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f8732b.getMostSignificantBits());
            parcel.writeLong(this.f8732b.getLeastSignificantBits());
            parcel.writeString(this.f8733c);
            parcel.writeString(this.f8734d);
            parcel.writeByteArray(this.f8735f);
        }

        public b a(byte[] bArr) {
            return new b(this.f8732b, this.f8733c, this.f8734d, bArr);
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f8732b = (UUID) a1.a(uuid);
            this.f8733c = str;
            this.f8734d = (String) a1.a((Object) str2);
            this.f8735f = bArr;
        }

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }
    }

    public w6(Parcel parcel) {
        this.f8730c = parcel.readString();
        b[] bVarArr = (b[]) yp.a(parcel.createTypedArray(b.CREATOR));
        this.a = bVarArr;
        this.f8731d = bVarArr.length;
    }

    public w6 a(String str) {
        return yp.a((Object) this.f8730c, (Object) str) ? this : new w6(str, false, this.a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w6.class != obj.getClass()) {
            return false;
        }
        w6 w6Var = (w6) obj;
        if (yp.a((Object) this.f8730c, (Object) w6Var.f8730c) && Arrays.equals(this.a, w6Var.a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        if (this.f8729b == 0) {
            String str = this.f8730c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f8729b = (hashCode * 31) + Arrays.hashCode(this.a);
        }
        return this.f8729b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8730c);
        parcel.writeTypedArray(this.a, 0);
    }

    public b a(int i10) {
        return this.a[i10];
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(b bVar, b bVar2) {
        UUID uuid = r2.a;
        if (uuid.equals(bVar.f8732b)) {
            return uuid.equals(bVar2.f8732b) ? 0 : 1;
        }
        return bVar.f8732b.compareTo(bVar2.f8732b);
    }

    private w6(String str, boolean z10, b... bVarArr) {
        this.f8730c = str;
        bVarArr = z10 ? (b[]) bVarArr.clone() : bVarArr;
        this.a = bVarArr;
        this.f8731d = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    public w6(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    public w6(List list) {
        this(null, false, (b[]) list.toArray(new b[0]));
    }

    public w6(b... bVarArr) {
        this(null, bVarArr);
    }
}
