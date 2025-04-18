package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class y6 implements Comparator, Parcelable {
    public static final Parcelable.Creator<y6> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final b[] f28111a;

    /* renamed from: b, reason: collision with root package name */
    private int f28112b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28113c;
    public final int d;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y6[] newArray(int i2) {
            return new y6[i2];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y6 createFromParcel(Parcel parcel) {
            return new y6(parcel);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private int f28114a;

        /* renamed from: b, reason: collision with root package name */
        public final UUID f28115b;

        /* renamed from: c, reason: collision with root package name */
        public final String f28116c;
        public final String d;

        /* renamed from: f, reason: collision with root package name */
        public final byte[] f28117f;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i2) {
                return new b[i2];
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }
        }

        public b(Parcel parcel) {
            this.f28115b = new UUID(parcel.readLong(), parcel.readLong());
            this.f28116c = parcel.readString();
            this.d = (String) xp.a((Object) parcel.readString());
            this.f28117f = parcel.createByteArray();
        }

        public boolean a(UUID uuid) {
            return t2.f27005a.equals(this.f28115b) || uuid.equals(this.f28115b);
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
            return xp.a((Object) this.f28116c, (Object) bVar.f28116c) && xp.a((Object) this.d, (Object) bVar.d) && xp.a(this.f28115b, bVar.f28115b) && Arrays.equals(this.f28117f, bVar.f28117f);
        }

        public int hashCode() {
            if (this.f28114a == 0) {
                int hashCode = this.f28115b.hashCode() * 31;
                String str = this.f28116c;
                this.f28114a = Arrays.hashCode(this.f28117f) + androidx.compose.foundation.text.input.a.b(this.d, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            }
            return this.f28114a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeLong(this.f28115b.getMostSignificantBits());
            parcel.writeLong(this.f28115b.getLeastSignificantBits());
            parcel.writeString(this.f28116c);
            parcel.writeString(this.d);
            parcel.writeByteArray(this.f28117f);
        }

        public b a(byte[] bArr) {
            return new b(this.f28115b, this.f28116c, this.d, bArr);
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f28115b = (UUID) b1.a(uuid);
            this.f28116c = str;
            this.d = (String) b1.a((Object) str2);
            this.f28117f = bArr;
        }

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }
    }

    public y6(Parcel parcel) {
        this.f28113c = parcel.readString();
        b[] bVarArr = (b[]) xp.a(parcel.createTypedArray(b.CREATOR));
        this.f28111a = bVarArr;
        this.d = bVarArr.length;
    }

    public y6 a(String str) {
        return xp.a((Object) this.f28113c, (Object) str) ? this : new y6(str, false, this.f28111a);
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
        if (obj == null || y6.class != obj.getClass()) {
            return false;
        }
        y6 y6Var = (y6) obj;
        return xp.a((Object) this.f28113c, (Object) y6Var.f28113c) && Arrays.equals(this.f28111a, y6Var.f28111a);
    }

    public int hashCode() {
        if (this.f28112b == 0) {
            String str = this.f28113c;
            this.f28112b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f28111a);
        }
        return this.f28112b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f28113c);
        parcel.writeTypedArray(this.f28111a, 0);
    }

    public b a(int i2) {
        return this.f28111a[i2];
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(b bVar, b bVar2) {
        UUID uuid = t2.f27005a;
        if (uuid.equals(bVar.f28115b)) {
            return uuid.equals(bVar2.f28115b) ? 0 : 1;
        }
        return bVar.f28115b.compareTo(bVar2.f28115b);
    }

    private y6(String str, boolean z2, b... bVarArr) {
        this.f28113c = str;
        bVarArr = z2 ? (b[]) bVarArr.clone() : bVarArr;
        this.f28111a = bVarArr;
        this.d = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    public y6(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    public y6(List list) {
        this(null, false, (b[]) list.toArray(new b[0]));
    }

    public y6(b... bVarArr) {
        this(null, bVarArr);
    }
}
