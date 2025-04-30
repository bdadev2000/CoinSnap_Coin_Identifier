package com.facebook.login;

import M0.C0219j;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.C0785a;
import com.facebook.C1829g;
import com.facebook.C1849l;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m extends z {
    public static final Parcelable.Creator<m> CREATOR = new com.facebook.y(5);

    /* renamed from: d, reason: collision with root package name */
    public l f13733d;

    /* renamed from: f, reason: collision with root package name */
    public final String f13734f;

    public m(t tVar) {
        this.f13788c = tVar;
        this.f13734f = "get_token";
    }

    @Override // com.facebook.login.z
    public final void c() {
        l lVar = this.f13733d;
        if (lVar != null) {
            lVar.f13727f = false;
            lVar.f13726d = null;
            this.f13733d = null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.z
    public final String f() {
        return this.f13734f;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0047 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0049 A[Catch: all -> 0x0094, TRY_ENTER, TryCatch #0 {, blocks: (B:7:0x001b, B:27:0x0024, B:33:0x0049, B:37:0x0055, B:44:0x0040, B:41:0x0032), top: B:6:0x001b, inners: #1 }] */
    @Override // com.facebook.login.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int l(com.facebook.login.q r7) {
        /*
            r6 = this;
            java.lang.String r0 = "request"
            G7.j.e(r7, r0)
            com.facebook.login.l r0 = new com.facebook.login.l
            com.facebook.login.t r1 = r6.e()
            androidx.fragment.app.FragmentActivity r1 = r1.f()
            if (r1 != 0) goto L15
            android.content.Context r1 = com.facebook.r.a()
        L15:
            r0.<init>(r1, r7)
            r6.f13733d = r0
            monitor-enter(r0)
            boolean r1 = r0.f13727f     // Catch: java.lang.Throwable -> L94
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L24
            monitor-exit(r0)
        L22:
            r1 = r2
            goto L5e
        L24:
            com.facebook.internal.B r1 = com.facebook.internal.B.f13569a     // Catch: java.lang.Throwable -> L94
            int r1 = r0.f13732k     // Catch: java.lang.Throwable -> L94
            java.lang.Class<com.facebook.internal.B> r4 = com.facebook.internal.B.class
            boolean r5 = O2.a.b(r4)     // Catch: java.lang.Throwable -> L94
            if (r5 == 0) goto L32
        L30:
            r1 = r2
            goto L44
        L32:
            com.facebook.internal.B r5 = com.facebook.internal.B.f13569a     // Catch: java.lang.Throwable -> L3f
            int[] r1 = new int[]{r1}     // Catch: java.lang.Throwable -> L3f
            androidx.work.o r1 = r5.g(r1)     // Catch: java.lang.Throwable -> L3f
            int r1 = r1.b     // Catch: java.lang.Throwable -> L3f
            goto L44
        L3f:
            r1 = move-exception
            O2.a.a(r4, r1)     // Catch: java.lang.Throwable -> L94
            goto L30
        L44:
            r4 = -1
            if (r1 != r4) goto L49
            monitor-exit(r0)
            goto L22
        L49:
            com.facebook.internal.B r1 = com.facebook.internal.B.f13569a     // Catch: java.lang.Throwable -> L94
            android.content.Context r1 = r0.b     // Catch: java.lang.Throwable -> L94
            android.content.Intent r1 = com.facebook.internal.B.d(r1)     // Catch: java.lang.Throwable -> L94
            if (r1 != 0) goto L55
            r1 = r2
            goto L5d
        L55:
            r0.f13727f = r3     // Catch: java.lang.Throwable -> L94
            android.content.Context r4 = r0.b     // Catch: java.lang.Throwable -> L94
            r4.bindService(r1, r0, r3)     // Catch: java.lang.Throwable -> L94
            r1 = r3
        L5d:
            monitor-exit(r0)
        L5e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6b
            return r2
        L6b:
            com.facebook.login.t r0 = r6.e()
            n1.f r0 = r0.f13773g
            if (r0 != 0) goto L74
            goto L7f
        L74:
            java.lang.Object r0 = r0.f21833c
            com.facebook.login.w r0 = (com.facebook.login.w) r0
            android.view.View r0 = r0.f13784g
            if (r0 == 0) goto L8d
            r0.setVisibility(r2)
        L7f:
            F2.e r0 = new F2.e
            r1 = 4
            r0.<init>(r1, r6, r7)
            com.facebook.login.l r7 = r6.f13733d
            if (r7 != 0) goto L8a
            goto L8c
        L8a:
            r7.f13726d = r0
        L8c:
            return r3
        L8d:
            java.lang.String r7 = "progressBar"
            G7.j.k(r7)
            r7 = 0
            throw r7
        L94:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.m.l(com.facebook.login.q):int");
    }

    public final void m(q qVar, Bundle bundle) {
        s sVar;
        C0785a l;
        String str;
        String string;
        C1829g c1829g;
        G7.j.e(qVar, com.vungle.ads.internal.ui.i.REQUEST_KEY_EXTRA);
        G7.j.e(bundle, "result");
        try {
            l = C0219j.l(bundle, qVar.f13746f);
            str = qVar.f13755q;
            string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
        } catch (C1849l e4) {
            q qVar2 = e().f13775i;
            String message = e4.getMessage();
            ArrayList arrayList = new ArrayList();
            if (message != null) {
                arrayList.add(message);
            }
            sVar = new s(qVar2, r.ERROR, null, null, TextUtils.join(": ", arrayList), null);
        }
        if (string != null && string.length() != 0 && str != null && str.length() != 0) {
            try {
                c1829g = new C1829g(string, str);
                sVar = new s(qVar, r.SUCCESS, l, c1829g, null, null);
                e().e(sVar);
            } catch (Exception e9) {
                throw new C1849l(e9.getMessage());
            }
        }
        c1829g = null;
        sVar = new s(qVar, r.SUCCESS, l, c1829g, null, null);
        e().e(sVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Parcel parcel) {
        super(parcel);
        G7.j.e(parcel, "source");
        this.f13734f = "get_token";
    }
}
