package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.bf;

/* loaded from: classes2.dex */
public final class va implements bf.b {
    public static final Parcelable.Creator<va> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f27512a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27513b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27514c;
    public final String d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f27515f;

    /* renamed from: g, reason: collision with root package name */
    public final int f27516g;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public va[] newArray(int i2) {
            return new va[i2];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public va createFromParcel(Parcel parcel) {
            return new va(parcel);
        }
    }

    public va(int i2, String str, String str2, String str3, boolean z2, int i3) {
        b1.a(i3 == -1 || i3 > 0);
        this.f27512a = i2;
        this.f27513b = str;
        this.f27514c = str2;
        this.d = str3;
        this.f27515f = z2;
        this.f27516g = i3;
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
    public static com.applovin.impl.va a(java.util.Map r15) {
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
            com.applovin.impl.pc.d(r3, r1)     // Catch: java.lang.NumberFormatException -> L37
        L33:
            r1 = r5
            r9 = r6
            goto L3e
        L36:
            r7 = r6
        L37:
            java.lang.String r1 = "Invalid bitrate header: "
            androidx.compose.foundation.text.input.a.x(r1, r2, r3)
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
            com.applovin.impl.pc.d(r3, r4)     // Catch: java.lang.NumberFormatException -> Lbf
        Lbc:
            r4 = r1
            r14 = r6
            goto Lc4
        Lbf:
            r6 = r2
        Lc0:
            androidx.compose.foundation.text.input.a.x(r0, r15, r3)
            goto Lbc
        Lc4:
            if (r4 == 0) goto Lcc
            com.applovin.impl.va r7 = new com.applovin.impl.va
            r8 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14)
        Lcc:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.va.a(java.util.Map):com.applovin.impl.va");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || va.class != obj.getClass()) {
            return false;
        }
        va vaVar = (va) obj;
        return this.f27512a == vaVar.f27512a && xp.a((Object) this.f27513b, (Object) vaVar.f27513b) && xp.a((Object) this.f27514c, (Object) vaVar.f27514c) && xp.a((Object) this.d, (Object) vaVar.d) && this.f27515f == vaVar.f27515f && this.f27516g == vaVar.f27516g;
    }

    public int hashCode() {
        int i2 = (this.f27512a + 527) * 31;
        String str = this.f27513b;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f27514c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f27515f ? 1 : 0)) * 31) + this.f27516g;
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f27514c + "\", genre=\"" + this.f27513b + "\", bitrate=" + this.f27512a + ", metadataInterval=" + this.f27516g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f27512a);
        parcel.writeString(this.f27513b);
        parcel.writeString(this.f27514c);
        parcel.writeString(this.d);
        xp.a(parcel, this.f27515f);
        parcel.writeInt(this.f27516g);
    }

    public va(Parcel parcel) {
        this.f27512a = parcel.readInt();
        this.f27513b = parcel.readString();
        this.f27514c = parcel.readString();
        this.d = parcel.readString();
        this.f27515f = xp.a(parcel);
        this.f27516g = parcel.readInt();
    }
}
