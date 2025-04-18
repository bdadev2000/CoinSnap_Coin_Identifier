package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n extends a0 {

    @JvmField
    public static final Parcelable.Creator<n> CREATOR = new l(0);

    /* renamed from: d, reason: collision with root package name */
    public k f11251d;

    /* renamed from: f, reason: collision with root package name */
    public final String f11252f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(u loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.f11252f = "get_token";
    }

    @Override // com.facebook.login.a0
    public final void c() {
        k kVar = this.f11251d;
        if (kVar != null) {
            kVar.f11241f = false;
            kVar.f11240d = null;
            this.f11251d = null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.a0
    public final String h() {
        return this.f11252f;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0047 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004a A[Catch: all -> 0x0094, TRY_ENTER, TryCatch #0 {, blocks: (B:7:0x001b, B:27:0x0023, B:33:0x004a, B:37:0x0056, B:44:0x0040, B:41:0x0030), top: B:6:0x001b, inners: #1 }] */
    @Override // com.facebook.login.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int n(com.facebook.login.r r9) {
        /*
            r8 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            com.facebook.login.k r0 = new com.facebook.login.k
            com.facebook.login.u r1 = r8.f()
            androidx.fragment.app.FragmentActivity r1 = r1.h()
            if (r1 != 0) goto L15
            android.content.Context r1 = com.facebook.x.a()
        L15:
            r0.<init>(r1, r9)
            r8.f11251d = r0
            monitor-enter(r0)
            boolean r1 = r0.f11241f     // Catch: java.lang.Throwable -> L94
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L23
            monitor-exit(r0)
            goto L48
        L23:
            com.facebook.internal.g0 r1 = com.facebook.internal.g0.a     // Catch: java.lang.Throwable -> L94
            int r1 = r0.f11246k     // Catch: java.lang.Throwable -> L94
            java.lang.Class<com.facebook.internal.g0> r4 = com.facebook.internal.g0.class
            boolean r5 = m6.a.b(r4)     // Catch: java.lang.Throwable -> L94
            if (r5 == 0) goto L30
            goto L43
        L30:
            com.facebook.internal.g0 r5 = com.facebook.internal.g0.a     // Catch: java.lang.Throwable -> L3f
            java.util.ArrayList r6 = com.facebook.internal.g0.f11035b     // Catch: java.lang.Throwable -> L3f
            int[] r7 = new int[r3]     // Catch: java.lang.Throwable -> L3f
            r7[r2] = r1     // Catch: java.lang.Throwable -> L3f
            androidx.work.p r1 = r5.g(r6, r7)     // Catch: java.lang.Throwable -> L3f
            int r1 = r1.f2227b     // Catch: java.lang.Throwable -> L3f
            goto L44
        L3f:
            r1 = move-exception
            m6.a.a(r4, r1)     // Catch: java.lang.Throwable -> L94
        L43:
            r1 = r2
        L44:
            r4 = -1
            if (r1 != r4) goto L4a
            monitor-exit(r0)
        L48:
            r1 = r2
            goto L5f
        L4a:
            com.facebook.internal.g0 r1 = com.facebook.internal.g0.a     // Catch: java.lang.Throwable -> L94
            android.content.Context r1 = r0.f11238b     // Catch: java.lang.Throwable -> L94
            android.content.Intent r1 = com.facebook.internal.g0.d(r1)     // Catch: java.lang.Throwable -> L94
            if (r1 != 0) goto L56
            r1 = r2
            goto L5e
        L56:
            r0.f11241f = r3     // Catch: java.lang.Throwable -> L94
            android.content.Context r4 = r0.f11238b     // Catch: java.lang.Throwable -> L94
            r4.bindService(r1, r0, r3)     // Catch: java.lang.Throwable -> L94
            r1 = r3
        L5e:
            monitor-exit(r0)
        L5f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L6c
            return r2
        L6c:
            com.facebook.login.u r0 = r8.f()
            com.facebook.login.w r0 = r0.f11299g
            if (r0 != 0) goto L75
            goto L7e
        L75:
            com.facebook.login.x r0 = r0.a
            android.view.View r0 = r0.f11313g
            if (r0 == 0) goto L8d
            r0.setVisibility(r2)
        L7e:
            androidx.fragment.app.e r0 = new androidx.fragment.app.e
            r1 = 8
            r0.<init>(r1, r8, r9)
            com.facebook.login.k r9 = r8.f11251d
            if (r9 != 0) goto L8a
            goto L8c
        L8a:
            r9.f11240d = r0
        L8c:
            return r3
        L8d:
            java.lang.String r9 = "progressBar"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r9)
            r9 = 0
            throw r9
        L94:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.n.n(com.facebook.login.r):int");
    }

    public final void o(Bundle bundle, r request) {
        t q10;
        com.facebook.a j3;
        String str;
        String string;
        com.facebook.l lVar;
        boolean z10;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(bundle, "result");
        try {
            j3 = ni.a.j(bundle, request.f11267f);
            str = request.f11278q;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
        } catch (com.facebook.q e2) {
            q10 = ni.a.q(f().f11301i, null, e2.getMessage(), null);
        }
        if (string != null) {
            boolean z11 = true;
            if (string.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && str != null) {
                if (str.length() != 0) {
                    z11 = false;
                }
                if (!z11) {
                    try {
                        lVar = new com.facebook.l(string, str);
                        q10 = ni.a.o(request, j3, lVar);
                        f().f(q10);
                    } catch (Exception e10) {
                        throw new com.facebook.q(e10.getMessage());
                    }
                }
            }
        }
        lVar = null;
        q10 = ni.a.o(request, j3, lVar);
        f().f(q10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.f11252f = "get_token";
    }
}
