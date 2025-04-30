package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class p implements Parcelable {
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13792c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13793d;

    /* renamed from: f, reason: collision with root package name */
    public final String f13794f;

    /* renamed from: g, reason: collision with root package name */
    public final String f13795g;

    /* renamed from: h, reason: collision with root package name */
    public final String f13796h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f13797i;

    /* renamed from: j, reason: collision with root package name */
    public final String f13798j;

    /* renamed from: k, reason: collision with root package name */
    public final C1849l f13799k;
    public static final L4.f l = new L4.f(20);
    public static final Parcelable.Creator<p> CREATOR = new E3.b(29);

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a4, code lost:
    
        if (r2.contains(java.lang.Integer.valueOf(r3)) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p(int r1, int r2, int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.Object r8, com.facebook.C1849l r9, boolean r10) {
        /*
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.f13792c = r2
            r0.f13793d = r3
            r0.f13794f = r4
            r0.f13795g = r6
            r0.f13796h = r7
            r0.f13797i = r8
            r0.f13798j = r5
            L4.f r1 = com.facebook.p.l
            com.facebook.o r4 = com.facebook.o.f13789c
            if (r9 == 0) goto L1d
            r0.f13799k = r9
            goto La7
        L1d:
            com.facebook.t r5 = new com.facebook.t
            java.lang.String r6 = r0.c()
            r5.<init>(r0, r6)
            r0.f13799k = r5
            com.facebook.internal.l r5 = r1.k()
            com.facebook.o r6 = com.facebook.o.f13790d
            if (r10 == 0) goto L36
            r5.getClass()
        L33:
            r4 = r6
            goto La7
        L36:
            java.util.Map r7 = r5.f13619a
            if (r7 == 0) goto L5b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            boolean r8 = r7.containsKey(r8)
            if (r8 == 0) goto L5b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            java.lang.Object r7 = r7.get(r8)
            java.util.Set r7 = (java.util.Set) r7
            if (r7 == 0) goto La7
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            boolean r7 = r7.contains(r8)
            if (r7 == 0) goto L5b
            goto La7
        L5b:
            java.util.Map r7 = r5.f13620c
            if (r7 == 0) goto L82
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            boolean r8 = r7.containsKey(r8)
            if (r8 == 0) goto L82
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            java.lang.Object r7 = r7.get(r8)
            java.util.Set r7 = (java.util.Set) r7
            if (r7 == 0) goto L7f
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            boolean r7 = r7.contains(r8)
            if (r7 == 0) goto L82
        L7f:
            com.facebook.o r4 = com.facebook.o.b
            goto La7
        L82:
            java.util.Map r5 = r5.b
            if (r5 == 0) goto La7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            boolean r7 = r5.containsKey(r7)
            if (r7 == 0) goto La7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r5.get(r2)
            java.util.Set r2 = (java.util.Set) r2
            if (r2 == 0) goto L33
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto La7
            goto L33
        La7:
            com.facebook.internal.l r1 = r1.k()
            r1.getClass()
            int[] r1 = com.facebook.internal.AbstractC1842k.f13616a
            int r2 = r4.ordinal()
            r1 = r1[r2]
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p.<init>(int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Object, com.facebook.l, boolean):void");
    }

    public final String c() {
        String str = this.f13798j;
        if (str == null) {
            C1849l c1849l = this.f13799k;
            if (c1849l == null) {
                return null;
            }
            return c1849l.getLocalizedMessage();
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str = "{HttpStatus: " + this.b + ", errorCode: " + this.f13792c + ", subErrorCode: " + this.f13793d + ", errorType: " + this.f13794f + ", errorMessage: " + c() + "}";
        G7.j.d(str, "StringBuilder(\"{HttpStatus: \")\n        .append(requestStatusCode)\n        .append(\", errorCode: \")\n        .append(errorCode)\n        .append(\", subErrorCode: \")\n        .append(subErrorCode)\n        .append(\", errorType: \")\n        .append(errorType)\n        .append(\", errorMessage: \")\n        .append(errorMessage)\n        .append(\"}\")\n        .toString()");
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        G7.j.e(parcel, "out");
        parcel.writeInt(this.b);
        parcel.writeInt(this.f13792c);
        parcel.writeInt(this.f13793d);
        parcel.writeString(this.f13794f);
        parcel.writeString(c());
        parcel.writeString(this.f13795g);
        parcel.writeString(this.f13796h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.facebook.l] */
    /* JADX WARN: Type inference failed for: r10v2 */
    public p(Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, exc instanceof C1849l ? (C1849l) exc : new RuntimeException(exc), false);
    }

    public p(int i9, String str, String str2) {
        this(-1, i9, -1, str, str2, null, null, null, null, false);
    }
}
