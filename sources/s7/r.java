package s7;

import com.google.android.gms.location.GeofenceStatusCodes;

/* loaded from: classes3.dex */
public final class r extends z1 {

    /* renamed from: d, reason: collision with root package name */
    public final int f24687d;

    /* renamed from: f, reason: collision with root package name */
    public final String f24688f;

    /* renamed from: g, reason: collision with root package name */
    public final int f24689g;

    /* renamed from: h, reason: collision with root package name */
    public final r0 f24690h;

    /* renamed from: i, reason: collision with root package name */
    public final int f24691i;

    /* renamed from: j, reason: collision with root package name */
    public final v8.x f24692j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f24693k;

    static {
        n9.h0.E(1001);
        n9.h0.E(1002);
        n9.h0.E(1003);
        n9.h0.E(1004);
        n9.h0.E(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT);
        n9.h0.E(1006);
    }

    public r(int i10, Throwable th2, int i11) {
        this(i10, th2, i11, null, -1, null, 4, false);
    }

    public final r a(v8.z zVar) {
        return new r(getMessage(), getCause(), this.f24894b, this.f24687d, this.f24688f, this.f24689g, this.f24690h, this.f24691i, zVar, this.f24895c, this.f24693k);
    }

    public r(String str, Throwable th2, int i10, int i11, String str2, int i12, r0 r0Var, int i13, v8.z zVar, long j3, boolean z10) {
        super(str, th2, i10, j3);
        v8.u0.d(!z10 || i11 == 1);
        v8.u0.d(th2 != null || i11 == 3);
        this.f24687d = i11;
        this.f24688f = str2;
        this.f24689g = i12;
        this.f24690h = r0Var;
        this.f24691i = i13;
        this.f24692j = zVar;
        this.f24693k = z10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public r(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, s7.r0 r19, int r20, boolean r21) {
        /*
            r13 = this;
            r4 = r14
            r8 = r20
            if (r4 == 0) goto L64
            r0 = 3
            r1 = 1
            if (r4 == r1) goto L17
            if (r4 == r0) goto Le
            java.lang.String r0 = "Unexpected runtime error"
            goto L10
        Le:
            java.lang.String r0 = "Remote error"
        L10:
            r5 = r17
            r6 = r18
            r7 = r19
            goto L6c
        L17:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = r17
            r2.append(r5)
            java.lang.String r3 = " error, index="
            r2.append(r3)
            r6 = r18
            r2.append(r6)
            java.lang.String r3 = ", format="
            r2.append(r3)
            r7 = r19
            r2.append(r7)
            java.lang.String r3 = ", format_supported="
            r2.append(r3)
            int r3 = n9.h0.a
            if (r8 == 0) goto L5a
            if (r8 == r1) goto L57
            r1 = 2
            if (r8 == r1) goto L54
            if (r8 == r0) goto L51
            r0 = 4
            if (r8 != r0) goto L4b
            java.lang.String r0 = "YES"
            goto L5c
        L4b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L51:
            java.lang.String r0 = "NO_EXCEEDS_CAPABILITIES"
            goto L5c
        L54:
            java.lang.String r0 = "NO_UNSUPPORTED_DRM"
            goto L5c
        L57:
            java.lang.String r0 = "NO_UNSUPPORTED_TYPE"
            goto L5c
        L5a:
            java.lang.String r0 = "NO"
        L5c:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L6c
        L64:
            r5 = r17
            r6 = r18
            r7 = r19
            java.lang.String r0 = "Source error"
        L6c:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L79
            java.lang.String r1 = ": null"
            java.lang.String r0 = eb.j.k(r0, r1)
        L79:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r16
            r4 = r14
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r12 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.r.<init>(int, java.lang.Throwable, int, java.lang.String, int, s7.r0, int, boolean):void");
    }
}
