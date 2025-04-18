package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.we;

/* loaded from: classes.dex */
public final class ra implements we.b {
    public static final Parcelable.Creator<ra> CREATOR = new a();
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7343b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7344c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7345d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7346f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7347g;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ra[] newArray(int i10) {
            return new ra[i10];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ra createFromParcel(Parcel parcel) {
            return new ra(parcel);
        }
    }

    public ra(int i10, String str, String str2, String str3, boolean z10, int i11) {
        a1.a(i11 == -1 || i11 > 0);
        this.a = i10;
        this.f7343b = str;
        this.f7344c = str2;
        this.f7345d = str3;
        this.f7346f = z10;
        this.f7347g = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.applovin.impl.ra a(java.util.Map r14) {
        /*
            java.lang.String r0 = "Invalid metadata interval: "
            java.lang.String r1 = "Invalid bitrate: "
            java.lang.String r2 = "icy-br"
            java.lang.Object r2 = r14.get(r2)
            java.util.List r2 = (java.util.List) r2
            java.lang.String r3 = "IcyHeaders"
            r4 = 1
            r5 = 0
            r6 = -1
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r2.get(r5)
            java.lang.String r2 = (java.lang.String) r2
            int r7 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L33
            int r7 = r7 * 1000
            if (r7 <= 0) goto L23
            r1 = r4
            goto L3a
        L23:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L34
            r8.<init>(r1)     // Catch: java.lang.NumberFormatException -> L34
            r8.append(r2)     // Catch: java.lang.NumberFormatException -> L34
            java.lang.String r1 = r8.toString()     // Catch: java.lang.NumberFormatException -> L34
            com.applovin.impl.kc.d(r3, r1)     // Catch: java.lang.NumberFormatException -> L34
            goto L3c
        L33:
            r7 = r6
        L34:
            java.lang.String r1 = "Invalid bitrate header: "
            a4.j.w(r1, r2, r3)
            r1 = r5
        L3a:
            r8 = r7
            goto L3e
        L3c:
            r1 = r5
            r8 = r6
        L3e:
            java.lang.String r2 = "icy-genre"
            java.lang.Object r2 = r14.get(r2)
            java.util.List r2 = (java.util.List) r2
            r7 = 0
            if (r2 == 0) goto L52
            java.lang.Object r1 = r2.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r9 = r1
            r1 = r4
            goto L53
        L52:
            r9 = r7
        L53:
            java.lang.String r2 = "icy-name"
            java.lang.Object r2 = r14.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L66
            java.lang.Object r1 = r2.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r10 = r1
            r1 = r4
            goto L67
        L66:
            r10 = r7
        L67:
            java.lang.String r2 = "icy-url"
            java.lang.Object r2 = r14.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L7a
            java.lang.Object r1 = r2.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r11 = r1
            r1 = r4
            goto L7b
        L7a:
            r11 = r7
        L7b:
            java.lang.String r2 = "icy-pub"
            java.lang.Object r2 = r14.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L94
            java.lang.Object r1 = r2.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "1"
            boolean r1 = r1.equals(r2)
            r12 = r1
            r1 = r4
            goto L95
        L94:
            r12 = r5
        L95:
            java.lang.String r2 = "icy-metaint"
            java.lang.Object r14 = r14.get(r2)
            java.util.List r14 = (java.util.List) r14
            if (r14 == 0) goto Lc1
            java.lang.Object r14 = r14.get(r5)
            java.lang.String r14 = (java.lang.String) r14
            int r2 = java.lang.Integer.parseInt(r14)     // Catch: java.lang.NumberFormatException -> Lbe
            if (r2 <= 0) goto Lad
            r13 = r2
            goto Lc3
        Lad:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> Lbd
            r4.<init>(r0)     // Catch: java.lang.NumberFormatException -> Lbd
            r4.append(r14)     // Catch: java.lang.NumberFormatException -> Lbd
            java.lang.String r4 = r4.toString()     // Catch: java.lang.NumberFormatException -> Lbd
            com.applovin.impl.kc.d(r3, r4)     // Catch: java.lang.NumberFormatException -> Lbd
            goto Lc1
        Lbd:
            r6 = r2
        Lbe:
            a4.j.w(r0, r14, r3)
        Lc1:
            r4 = r1
            r13 = r6
        Lc3:
            if (r4 == 0) goto Lcb
            com.applovin.impl.ra r14 = new com.applovin.impl.ra
            r7 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13)
        Lcb:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.ra.a(java.util.Map):com.applovin.impl.ra");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ra.class != obj.getClass()) {
            return false;
        }
        ra raVar = (ra) obj;
        if (this.a == raVar.a && yp.a((Object) this.f7343b, (Object) raVar.f7343b) && yp.a((Object) this.f7344c, (Object) raVar.f7344c) && yp.a((Object) this.f7345d, (Object) raVar.f7345d) && this.f7346f == raVar.f7346f && this.f7347g == raVar.f7347g) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12 = (this.a + 527) * 31;
        String str = this.f7343b;
        int i13 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i12 + i10) * 31;
        String str2 = this.f7344c;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 31;
        String str3 = this.f7345d;
        if (str3 != null) {
            i13 = str3.hashCode();
        }
        return ((((i15 + i13) * 31) + (this.f7346f ? 1 : 0)) * 31) + this.f7347g;
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f7344c + "\", genre=\"" + this.f7343b + "\", bitrate=" + this.a + ", metadataInterval=" + this.f7347g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.a);
        parcel.writeString(this.f7343b);
        parcel.writeString(this.f7344c);
        parcel.writeString(this.f7345d);
        yp.a(parcel, this.f7346f);
        parcel.writeInt(this.f7347g);
    }

    public ra(Parcel parcel) {
        this.a = parcel.readInt();
        this.f7343b = parcel.readString();
        this.f7344c = parcel.readString();
        this.f7345d = parcel.readString();
        this.f7346f = yp.a(parcel);
        this.f7347g = parcel.readInt();
    }
}
