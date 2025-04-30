package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.we;

/* loaded from: classes.dex */
public final class ra implements we.b {
    public static final Parcelable.Creator<ra> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f10477a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10478c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10479d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f10480f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10481g;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ra[] newArray(int i9) {
            return new ra[i9];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ra createFromParcel(Parcel parcel) {
            return new ra(parcel);
        }
    }

    public ra(int i9, String str, String str2, String str3, boolean z8, int i10) {
        AbstractC0669a1.a(i10 == -1 || i10 > 0);
        this.f10477a = i9;
        this.b = str;
        this.f10478c = str2;
        this.f10479d = str3;
        this.f10480f = z8;
        this.f10481g = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.applovin.impl.ra a(java.util.Map r15) {
        /*
            java.lang.String r0 = "Invalid metadata interval: "
            java.lang.String r1 = "Invalid bitrate: "
            java.lang.String r2 = "icy-br"
            java.lang.Object r2 = r15.get(r2)
            java.util.List r2 = (java.util.List) r2
            java.lang.String r3 = "IcyHeaders"
            r4 = 1
            r5 = 0
            r6 = -1
            if (r2 == 0) goto L33
            java.lang.Object r2 = r2.get(r5)
            java.lang.String r2 = (java.lang.String) r2
            int r7 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L36
            int r7 = r7 * 1000
            if (r7 <= 0) goto L24
            r1 = r4
        L22:
            r9 = r7
            goto L3e
        L24:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L37
            r8.<init>(r1)     // Catch: java.lang.NumberFormatException -> L37
            r8.append(r2)     // Catch: java.lang.NumberFormatException -> L37
            java.lang.String r1 = r8.toString()     // Catch: java.lang.NumberFormatException -> L37
            com.applovin.impl.kc.d(r3, r1)     // Catch: java.lang.NumberFormatException -> L37
        L33:
            r1 = r5
            r9 = r6
            goto L3e
        L36:
            r7 = r6
        L37:
            java.lang.String r1 = "Invalid bitrate header: "
            com.applovin.impl.L.u(r1, r2, r3)
            r1 = r5
            goto L22
        L3e:
            java.lang.String r2 = "icy-genre"
            java.lang.Object r2 = r15.get(r2)
            java.util.List r2 = (java.util.List) r2
            r7 = 0
            if (r2 == 0) goto L52
            java.lang.Object r1 = r2.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r10 = r1
            r1 = r4
            goto L53
        L52:
            r10 = r7
        L53:
            java.lang.String r2 = "icy-name"
            java.lang.Object r2 = r15.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L66
            java.lang.Object r1 = r2.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r11 = r1
            r1 = r4
            goto L67
        L66:
            r11 = r7
        L67:
            java.lang.String r2 = "icy-url"
            java.lang.Object r2 = r15.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L7a
            java.lang.Object r1 = r2.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r12 = r1
            r1 = r4
            goto L7b
        L7a:
            r12 = r7
        L7b:
            java.lang.String r2 = "icy-pub"
            java.lang.Object r2 = r15.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L94
            java.lang.Object r1 = r2.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "1"
            boolean r1 = r1.equals(r2)
            r13 = r1
            r1 = r4
            goto L95
        L94:
            r13 = r5
        L95:
            java.lang.String r2 = "icy-metaint"
            java.lang.Object r15 = r15.get(r2)
            java.util.List r15 = (java.util.List) r15
            if (r15 == 0) goto Lbc
            java.lang.Object r15 = r15.get(r5)
            java.lang.String r15 = (java.lang.String) r15
            int r2 = java.lang.Integer.parseInt(r15)     // Catch: java.lang.NumberFormatException -> Lc0
            if (r2 <= 0) goto Lad
            r14 = r2
            goto Lc4
        Lad:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> Lbf
            r4.<init>(r0)     // Catch: java.lang.NumberFormatException -> Lbf
            r4.append(r15)     // Catch: java.lang.NumberFormatException -> Lbf
            java.lang.String r4 = r4.toString()     // Catch: java.lang.NumberFormatException -> Lbf
            com.applovin.impl.kc.d(r3, r4)     // Catch: java.lang.NumberFormatException -> Lbf
        Lbc:
            r4 = r1
            r14 = r6
            goto Lc4
        Lbf:
            r6 = r2
        Lc0:
            com.applovin.impl.L.u(r0, r15, r3)
            goto Lbc
        Lc4:
            if (r4 == 0) goto Lcc
            com.applovin.impl.ra r7 = new com.applovin.impl.ra
            r8 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14)
        Lcc:
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
        if (this.f10477a == raVar.f10477a && yp.a((Object) this.b, (Object) raVar.b) && yp.a((Object) this.f10478c, (Object) raVar.f10478c) && yp.a((Object) this.f10479d, (Object) raVar.f10479d) && this.f10480f == raVar.f10480f && this.f10481g == raVar.f10481g) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i9;
        int i10;
        int i11 = (this.f10477a + 527) * 31;
        String str = this.b;
        int i12 = 0;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i13 = (i11 + i9) * 31;
        String str2 = this.f10478c;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i13 + i10) * 31;
        String str3 = this.f10479d;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return ((((i14 + i12) * 31) + (this.f10480f ? 1 : 0)) * 31) + this.f10481g;
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f10478c + "\", genre=\"" + this.b + "\", bitrate=" + this.f10477a + ", metadataInterval=" + this.f10481g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f10477a);
        parcel.writeString(this.b);
        parcel.writeString(this.f10478c);
        parcel.writeString(this.f10479d);
        yp.a(parcel, this.f10480f);
        parcel.writeInt(this.f10481g);
    }

    public ra(Parcel parcel) {
        this.f10477a = parcel.readInt();
        this.b = parcel.readString();
        this.f10478c = parcel.readString();
        this.f10479d = parcel.readString();
        this.f10480f = yp.a(parcel);
        this.f10481g = parcel.readInt();
    }
}
