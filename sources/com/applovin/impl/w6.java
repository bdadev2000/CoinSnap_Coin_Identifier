package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class w6 implements Comparator, Parcelable {
    public static final Parcelable.Creator<w6> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final b[] f11942a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11943c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11944d;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public w6[] newArray(int i9) {
            return new w6[i9];
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

        /* renamed from: a, reason: collision with root package name */
        private int f11945a;
        public final UUID b;

        /* renamed from: c, reason: collision with root package name */
        public final String f11946c;

        /* renamed from: d, reason: collision with root package name */
        public final String f11947d;

        /* renamed from: f, reason: collision with root package name */
        public final byte[] f11948f;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i9) {
                return new b[i9];
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }
        }

        public b(Parcel parcel) {
            this.b = new UUID(parcel.readLong(), parcel.readLong());
            this.f11946c = parcel.readString();
            this.f11947d = (String) yp.a((Object) parcel.readString());
            this.f11948f = parcel.createByteArray();
        }

        public boolean a(UUID uuid) {
            return AbstractC0744r2.f10444a.equals(this.b) || uuid.equals(this.b);
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
            if (!yp.a((Object) this.f11946c, (Object) bVar.f11946c) || !yp.a((Object) this.f11947d, (Object) bVar.f11947d) || !yp.a(this.b, bVar.b) || !Arrays.equals(this.f11948f, bVar.f11948f)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode;
            if (this.f11945a == 0) {
                int hashCode2 = this.b.hashCode() * 31;
                String str = this.f11946c;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                this.f11945a = Arrays.hashCode(this.f11948f) + AbstractC2914a.b((hashCode2 + hashCode) * 31, 31, this.f11947d);
            }
            return this.f11945a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i9) {
            parcel.writeLong(this.b.getMostSignificantBits());
            parcel.writeLong(this.b.getLeastSignificantBits());
            parcel.writeString(this.f11946c);
            parcel.writeString(this.f11947d);
            parcel.writeByteArray(this.f11948f);
        }

        public b a(byte[] bArr) {
            return new b(this.b, this.f11946c, this.f11947d, bArr);
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.b = (UUID) AbstractC0669a1.a(uuid);
            this.f11946c = str;
            this.f11947d = (String) AbstractC0669a1.a((Object) str2);
            this.f11948f = bArr;
        }

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }
    }

    public w6(Parcel parcel) {
        this.f11943c = parcel.readString();
        b[] bVarArr = (b[]) yp.a(parcel.createTypedArray(b.CREATOR));
        this.f11942a = bVarArr;
        this.f11944d = bVarArr.length;
    }

    public w6 a(String str) {
        return yp.a((Object) this.f11943c, (Object) str) ? this : new w6(str, false, this.f11942a);
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
        if (yp.a((Object) this.f11943c, (Object) w6Var.f11943c) && Arrays.equals(this.f11942a, w6Var.f11942a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        if (this.b == 0) {
            String str = this.f11943c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.b = (hashCode * 31) + Arrays.hashCode(this.f11942a);
        }
        return this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f11943c);
        parcel.writeTypedArray(this.f11942a, 0);
    }

    public b a(int i9) {
        return this.f11942a[i9];
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(b bVar, b bVar2) {
        UUID uuid = AbstractC0744r2.f10444a;
        if (uuid.equals(bVar.b)) {
            return uuid.equals(bVar2.b) ? 0 : 1;
        }
        return bVar.b.compareTo(bVar2.b);
    }

    private w6(String str, boolean z8, b... bVarArr) {
        this.f11943c = str;
        bVarArr = z8 ? (b[]) bVarArr.clone() : bVarArr;
        this.f11942a = bVarArr;
        this.f11944d = bVarArr.length;
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
