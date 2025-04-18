package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public final int f11404b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11405c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11406d;

    /* renamed from: f, reason: collision with root package name */
    public final String f11407f;

    /* renamed from: g, reason: collision with root package name */
    public final String f11408g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11409h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f11410i;

    /* renamed from: j, reason: collision with root package name */
    public final String f11411j;

    /* renamed from: k, reason: collision with root package name */
    public final q f11412k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f11402l = new b(6, 0);

    /* renamed from: m, reason: collision with root package name */
    public static final ef.b f11403m = new ef.b(200, 299);

    @JvmField
    public static final Parcelable.Creator<u> CREATOR = new android.support.v4.media.a(23);

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bc, code lost:
    
        if (r1.contains(java.lang.Integer.valueOf(r3)) != false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public u(int r1, int r2, int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.Object r8, com.facebook.q r9, boolean r10) {
        /*
            r0 = this;
            r0.<init>()
            r0.f11404b = r1
            r0.f11405c = r2
            r0.f11406d = r3
            r0.f11407f = r4
            r0.f11408g = r6
            r0.f11409h = r7
            r0.f11410i = r8
            r0.f11411j = r5
            if (r9 == 0) goto L19
            r0.f11412k = r9
            r1 = 1
            goto L25
        L19:
            com.facebook.z r1 = new com.facebook.z
            java.lang.String r4 = r0.c()
            r1.<init>(r0, r4)
            r0.f11412k = r1
            r1 = 0
        L25:
            com.facebook.t r4 = com.facebook.t.OTHER
            com.facebook.b r5 = com.facebook.u.f11402l
            if (r1 == 0) goto L2d
            goto Lbf
        L2d:
            monitor-enter(r5)
            com.facebook.internal.z r1 = com.facebook.internal.z.a     // Catch: java.lang.Throwable -> Le6
            java.lang.String r1 = com.facebook.x.b()     // Catch: java.lang.Throwable -> Le6
            com.facebook.internal.x r1 = com.facebook.internal.z.b(r1)     // Catch: java.lang.Throwable -> Le6
            if (r1 != 0) goto L42
            com.facebook.internal.m r1 = com.facebook.internal.p.f11065d     // Catch: java.lang.Throwable -> Le6
            com.facebook.internal.p r1 = r1.l()     // Catch: java.lang.Throwable -> Le6
            monitor-exit(r5)
            goto L45
        L42:
            com.facebook.internal.p r1 = r1.f11125f     // Catch: java.lang.Throwable -> Le6
            monitor-exit(r5)
        L45:
            com.facebook.t r6 = com.facebook.t.TRANSIENT
            if (r10 == 0) goto L4e
            r1.getClass()
            goto Lbe
        L4e:
            java.util.Map r7 = r1.a
            if (r7 == 0) goto L73
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            boolean r8 = r7.containsKey(r8)
            if (r8 == 0) goto L73
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            java.lang.Object r7 = r7.get(r8)
            java.util.Set r7 = (java.util.Set) r7
            if (r7 == 0) goto Lbf
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            boolean r7 = r7.contains(r8)
            if (r7 == 0) goto L73
            goto Lbf
        L73:
            java.util.Map r7 = r1.f11068c
            if (r7 == 0) goto L9a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            boolean r8 = r7.containsKey(r8)
            if (r8 == 0) goto L9a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            java.lang.Object r7 = r7.get(r8)
            java.util.Set r7 = (java.util.Set) r7
            if (r7 == 0) goto L97
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            boolean r7 = r7.contains(r8)
            if (r7 == 0) goto L9a
        L97:
            com.facebook.t r4 = com.facebook.t.LOGIN_RECOVERABLE
            goto Lbf
        L9a:
            java.util.Map r1 = r1.f11067b
            if (r1 == 0) goto Lbf
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            boolean r7 = r1.containsKey(r7)
            if (r7 == 0) goto Lbf
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r1.get(r2)
            java.util.Set r1 = (java.util.Set) r1
            if (r1 == 0) goto Lbe
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto Lbf
        Lbe:
            r4 = r6
        Lbf:
            monitor-enter(r5)
            com.facebook.internal.z r1 = com.facebook.internal.z.a     // Catch: java.lang.Throwable -> Le3
            java.lang.String r1 = com.facebook.x.b()     // Catch: java.lang.Throwable -> Le3
            com.facebook.internal.x r1 = com.facebook.internal.z.b(r1)     // Catch: java.lang.Throwable -> Le3
            if (r1 != 0) goto Ld4
            com.facebook.internal.m r1 = com.facebook.internal.p.f11065d     // Catch: java.lang.Throwable -> Le3
            com.facebook.internal.p r1 = r1.l()     // Catch: java.lang.Throwable -> Le3
            monitor-exit(r5)
            goto Ld7
        Ld4:
            com.facebook.internal.p r1 = r1.f11125f     // Catch: java.lang.Throwable -> Le3
            monitor-exit(r5)
        Ld7:
            r1.getClass()
            int[] r1 = com.facebook.internal.o.a
            int r2 = r4.ordinal()
            r1 = r1[r2]
            return
        Le3:
            r1 = move-exception
            monitor-exit(r5)
            throw r1
        Le6:
            r1 = move-exception
            monitor-exit(r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.u.<init>(int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Object, com.facebook.q, boolean):void");
    }

    public final String c() {
        String str = this.f11411j;
        if (str != null) {
            return str;
        }
        q qVar = this.f11412k;
        if (qVar == null) {
            return null;
        }
        return qVar.getLocalizedMessage();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str = "{HttpStatus: " + this.f11404b + ", errorCode: " + this.f11405c + ", subErrorCode: " + this.f11406d + ", errorType: " + this.f11407f + ", errorMessage: " + c() + "}";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder(\"{HttpStatus: \")\n        .append(requestStatusCode)\n        .append(\", errorCode: \")\n        .append(errorCode)\n        .append(\", subErrorCode: \")\n        .append(subErrorCode)\n        .append(\", errorType: \")\n        .append(errorType)\n        .append(\", errorMessage: \")\n        .append(errorMessage)\n        .append(\"}\")\n        .toString()");
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.f11404b);
        out.writeInt(this.f11405c);
        out.writeInt(this.f11406d);
        out.writeString(this.f11407f);
        out.writeString(c());
        out.writeString(this.f11408g);
        out.writeString(this.f11409h);
    }

    public u(Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, exc instanceof q ? (q) exc : new q(exc), false);
    }

    public u(int i10, String str, String str2) {
        this(-1, i10, -1, str, str2, null, null, null, null, false);
    }
}
