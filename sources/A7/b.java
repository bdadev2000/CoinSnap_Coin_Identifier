package a7;

import B4.e;
import G7.j;
import J1.m;
import N1.f;
import N1.i;
import P1.C0232f;
import P1.F;
import P1.g;
import Q7.n0;
import T.C0275i0;
import T.InterfaceC0292x;
import T1.t;
import W1.B;
import W1.p;
import W1.y;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import androidx.core.view.ViewCompat;
import androidx.viewpager.widget.ViewPager;
import com.bumptech.glide.load.data.d;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.internal.play_billing.zzai;
import com.tools.arruler.ui.component.onboarding.OnBoardingActivity;
import d1.C2161b;
import e8.C2235j;
import e8.C2241p;
import j5.C2400c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import k.C2425n;
import k.w;
import l0.C2435a;
import l5.k;
import n1.C2475f;
import o1.C2493b;
import org.json.JSONObject;
import p.MenuC2533l;
import q4.C2643b;
import u4.C2778w;
import u6.AbstractC2799o;
import x.l;

/* loaded from: classes3.dex */
public class b implements InterfaceC0292x, d, T7.b, p, o.a {

    /* renamed from: f, reason: collision with root package name */
    public static b f4076f;
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4077c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4078d;

    public b(int i9) {
        this.b = i9;
        switch (i9) {
            case 21:
                this.f4077c = new AtomicReference();
                this.f4078d = new l();
                return;
            default:
                C2475f c2475f = new C2475f(9);
                this.f4077c = c2475f;
                this.f4078d = new C2400c(c2475f, 11);
                return;
        }
    }

    public static void i(k kVar, e eVar) {
        l(kVar, "X-CRASHLYTICS-GOOGLE-APP-ID", eVar.f324a);
        l(kVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        l(kVar, "X-CRASHLYTICS-API-CLIENT-VERSION", "19.0.3");
        l(kVar, "Accept", "application/json");
        l(kVar, "X-CRASHLYTICS-DEVICE-MODEL", eVar.b);
        l(kVar, "X-CRASHLYTICS-OS-BUILD-VERSION", eVar.f325c);
        l(kVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", eVar.f326d);
        l(kVar, "X-CRASHLYTICS-INSTALLATION-ID", ((C2778w) eVar.f327e).c().f23111a);
    }

    public static void l(k kVar, String str, String str2) {
        if (str2 != null) {
            ((HashMap) kVar.f21619a).put(str, str2);
        }
    }

    public static B n(ImageDecoder.Source source, int i9, int i10, i iVar) {
        Drawable m = V1.b.m(source, new V1.d(i9, i10, iVar));
        if (V1.b.x(m)) {
            return new B(V1.b.k(m), 2);
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + m);
    }

    public static HashMap q(e eVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", eVar.f330h);
        hashMap.put("display_version", eVar.f329g);
        hashMap.put("source", Integer.toString(eVar.f331i));
        String str = eVar.f328f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[Catch: IOException -> 0x005b, TryCatch #0 {IOException -> 0x005b, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:13:0x0042, B:15:0x003a, B:16:0x003d, B:27:0x0047, B:29:0x004a, B:32:0x005d), top: B:1:0x0000 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, w8.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static a7.b u(java.lang.String... r12) {
        /*
            int r0 = r12.length     // Catch: java.io.IOException -> L5b
            w8.i[] r0 = new w8.i[r0]     // Catch: java.io.IOException -> L5b
            w8.f r1 = new w8.f     // Catch: java.io.IOException -> L5b
            r1.<init>()     // Catch: java.io.IOException -> L5b
            r2 = 0
            r3 = r2
        La:
            int r4 = r12.length     // Catch: java.io.IOException -> L5b
            if (r3 >= r4) goto L5d
            r4 = r12[r3]     // Catch: java.io.IOException -> L5b
            java.lang.String[] r5 = G1.c.f1250g     // Catch: java.io.IOException -> L5b
            r6 = 34
            r1.n(r6)     // Catch: java.io.IOException -> L5b
            int r7 = r4.length()     // Catch: java.io.IOException -> L5b
            r8 = r2
            r9 = r8
        L1c:
            if (r8 >= r7) goto L45
            char r10 = r4.charAt(r8)     // Catch: java.io.IOException -> L5b
            r11 = 128(0x80, float:1.8E-43)
            if (r10 >= r11) goto L2b
            r10 = r5[r10]     // Catch: java.io.IOException -> L5b
            if (r10 != 0) goto L38
            goto L42
        L2b:
            r11 = 8232(0x2028, float:1.1535E-41)
            if (r10 != r11) goto L32
            java.lang.String r10 = "\\u2028"
            goto L38
        L32:
            r11 = 8233(0x2029, float:1.1537E-41)
            if (r10 != r11) goto L42
            java.lang.String r10 = "\\u2029"
        L38:
            if (r9 >= r8) goto L3d
            r1.t(r9, r8, r4)     // Catch: java.io.IOException -> L5b
        L3d:
            r1.u(r10)     // Catch: java.io.IOException -> L5b
            int r9 = r8 + 1
        L42:
            int r8 = r8 + 1
            goto L1c
        L45:
            if (r9 >= r7) goto L4a
            r1.t(r9, r7, r4)     // Catch: java.io.IOException -> L5b
        L4a:
            r1.n(r6)     // Catch: java.io.IOException -> L5b
            r1.readByte()     // Catch: java.io.IOException -> L5b
            long r4 = r1.f24014c     // Catch: java.io.IOException -> L5b
            w8.i r4 = r1.readByteString(r4)     // Catch: java.io.IOException -> L5b
            r0[r3] = r4     // Catch: java.io.IOException -> L5b
            int r3 = r3 + 1
            goto La
        L5b:
            r12 = move-exception
            goto L6e
        L5d:
            a7.b r1 = new a7.b     // Catch: java.io.IOException -> L5b
            java.lang.Object r12 = r12.clone()     // Catch: java.io.IOException -> L5b
            java.lang.String[] r12 = (java.lang.String[]) r12     // Catch: java.io.IOException -> L5b
            w8.q r0 = w4.v0.y(r0)     // Catch: java.io.IOException -> L5b
            r2 = 3
            r1.<init>(r2, r12, r0)     // Catch: java.io.IOException -> L5b
            return r1
        L6e:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.b.u(java.lang.String[]):a7.b");
    }

    public void A(String str, boolean z8) {
        ((SharedPreferences) this.f4078d).edit().putBoolean(str, z8).commit();
    }

    public void B(M7.c cVar, Object obj) {
        j.e(cVar, "property");
        if (!j.a(this.f4078d, obj)) {
            this.f4078d = obj;
            ((F7.a) this.f4077c).invoke();
        }
    }

    @Override // o.a
    public boolean a(o.b bVar, MenuItem menuItem) {
        return ((o.a) this.f4077c).a(bVar, menuItem);
    }

    @Override // W1.p
    public void b(Q1.a aVar, Bitmap bitmap) {
        IOException iOException = ((j2.e) this.f4078d).f21018c;
        if (iOException != null) {
            if (bitmap != null) {
                aVar.d(bitmap);
                throw iOException;
            }
            throw iOException;
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void c(Exception exc) {
        F f9 = (F) this.f4078d;
        t tVar = (t) this.f4077c;
        t tVar2 = f9.f2291h;
        if (tVar2 != null && tVar2 == tVar) {
            F f10 = (F) this.f4078d;
            t tVar3 = (t) this.f4077c;
            g gVar = f10.f2287c;
            C0232f c0232f = f10.f2292i;
            com.bumptech.glide.load.data.e eVar = tVar3.f2994c;
            gVar.a(c0232f, exc, eVar, eVar.d());
        }
    }

    @Override // o.a
    public boolean d(o.b bVar, Menu menu) {
        ViewCompat.requestApplyInsets(((w) this.f4078d).f21347C);
        return ((o.a) this.f4077c).d(bVar, menu);
    }

    @Override // o.a
    public boolean e(o.b bVar, MenuC2533l menuC2533l) {
        return ((o.a) this.f4077c).e(bVar, menuC2533l);
    }

    @Override // W1.p
    public void f() {
        y yVar = (y) this.f4077c;
        synchronized (yVar) {
            yVar.f3606d = yVar.b.length;
        }
    }

    @Override // o.a
    public void g(o.b bVar) {
        ((o.a) this.f4077c).g(bVar);
        w wVar = (w) this.f4078d;
        if (wVar.f21389y != null) {
            wVar.f21378n.getDecorView().removeCallbacks(wVar.f21390z);
        }
        if (wVar.f21388x != null) {
            C0275i0 c0275i0 = wVar.f21345A;
            if (c0275i0 != null) {
                c0275i0.b();
            }
            C0275i0 animate = ViewCompat.animate(wVar.f21388x);
            animate.a(0.0f);
            wVar.f21345A = animate;
            animate.d(new C2425n(this, 2));
        }
        wVar.f21387w = null;
        ViewCompat.requestApplyInsets(wVar.f21347C);
        wVar.H();
    }

    @Override // com.bumptech.glide.load.data.d
    public void h(Object obj) {
        F f9 = (F) this.f4078d;
        t tVar = (t) this.f4077c;
        t tVar2 = f9.f2291h;
        if (tVar2 != null && tVar2 == tVar) {
            F f10 = (F) this.f4078d;
            t tVar3 = (t) this.f4077c;
            P1.l lVar = f10.b.f2317p;
            if (obj != null && lVar.c(tVar3.f2994c.d())) {
                f10.f2290g = obj;
                f10.f2287c.c();
            } else {
                g gVar = f10.f2287c;
                f fVar = tVar3.f2993a;
                com.bumptech.glide.load.data.e eVar = tVar3.f2994c;
                gVar.d(fVar, obj, eVar, eVar.d(), f10.f2292i);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011d  */
    @Override // T.InterfaceC0292x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public T.G0 j(android.view.View r17, T.G0 r18) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.b.j(android.view.View, T.G0):T.G0");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // T7.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object k(T7.c r6, w7.f r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof T7.e
            if (r0 == 0) goto L13
            r0 = r7
            T7.e r0 = (T7.e) r0
            int r1 = r0.f3042g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3042g = r1
            goto L18
        L13:
            T7.e r0 = new T7.e
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f3041f
            x7.a r1 = x7.EnumC2928a.b
            int r2 = r0.f3042g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            t7.AbstractC2712a.f(r7)
            goto L65
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            T7.c r6 = r0.f3045j
            a7.b r2 = r0.f3044i
            t7.AbstractC2712a.f(r7)
            goto L4f
        L3a:
            t7.AbstractC2712a.f(r7)
            r0.f3044i = r5
            r0.f3045j = r6
            r0.f3042g = r4
            java.lang.Object r7 = r5.f4077c
            T7.b r7 = (T7.b) r7
            java.io.Serializable r7 = T7.s.a(r7, r6, r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            r2 = r5
        L4f:
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            if (r7 == 0) goto L65
            java.lang.Object r2 = r2.f4078d
            F7.q r2 = (F7.q) r2
            r4 = 0
            r0.f3044i = r4
            r0.f3045j = r4
            r0.f3042g = r3
            java.lang.Object r6 = r2.b(r6, r7, r0)
            if (r6 != r1) goto L65
            return r1
        L65:
            t7.y r6 = t7.y.f23029a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.b.k(T7.c, w7.f):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, J1.e] */
    public J1.e m() {
        boolean z8;
        boolean z9;
        boolean z10;
        zzai zzk;
        ArrayList arrayList = (ArrayList) this.f4077c;
        if (arrayList != null && !arrayList.isEmpty()) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            J1.c cVar = (J1.c) ((ArrayList) this.f4077c).get(0);
            for (int i9 = 0; i9 < ((ArrayList) this.f4077c).size(); i9++) {
                J1.c cVar2 = (J1.c) ((ArrayList) this.f4077c).get(i9);
                if (cVar2 != null) {
                    if (i9 != 0) {
                        m mVar = cVar2.f1511a;
                        if (!mVar.f1530d.equals(cVar.f1511a.f1530d) && !mVar.f1530d.equals("play_pass_subs")) {
                            throw new IllegalArgumentException("All products should have same ProductType.");
                        }
                    }
                } else {
                    throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                }
            }
            String optString = cVar.f1511a.b.optString("packageName");
            Iterator it = ((ArrayList) this.f4077c).iterator();
            while (it.hasNext()) {
                J1.c cVar3 = (J1.c) it.next();
                if (!cVar.f1511a.f1530d.equals("play_pass_subs") && !cVar3.f1511a.f1530d.equals("play_pass_subs") && !optString.equals(cVar3.f1511a.b.optString("packageName"))) {
                    throw new IllegalArgumentException("All products must have the same package name.");
                }
            }
            ?? obj = new Object();
            if (z8 && !((J1.c) ((ArrayList) this.f4077c).get(0)).f1511a.b.optString("packageName").isEmpty()) {
                z9 = true;
            } else {
                z9 = false;
            }
            obj.f1513a = z9;
            obj.b = null;
            obj.f1514c = null;
            J1.d dVar = (J1.d) this.f4078d;
            dVar.getClass();
            if (!TextUtils.isEmpty(null) || !TextUtils.isEmpty(null)) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean isEmpty = true ^ TextUtils.isEmpty(null);
            if (z10 && isEmpty) {
                throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
            }
            if (!dVar.f1512a && !z10 && !isEmpty) {
                throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
            }
            D0.l lVar = new D0.l((byte) 0, 1);
            lVar.f626c = null;
            lVar.b = 0;
            lVar.f627d = null;
            obj.f1515d = lVar;
            obj.f1517f = new ArrayList();
            obj.f1518g = false;
            ArrayList arrayList2 = (ArrayList) this.f4077c;
            if (arrayList2 != null) {
                zzk = zzai.zzj(arrayList2);
            } else {
                zzk = zzai.zzk();
            }
            obj.f1516e = zzk;
            return obj;
        }
        throw new IllegalArgumentException("Details of the products must be provided.");
    }

    public a8.b o(M7.b bVar) {
        Object putIfAbsent;
        switch (this.b) {
            case 22:
                return ((C2235j) A0.b.n((C2241p) this.f4078d, com.facebook.appevents.g.n(bVar))).f20170a;
            default:
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f4078d;
                Class n2 = com.facebook.appevents.g.n(bVar);
                Object obj = concurrentHashMap.get(n2);
                if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(n2, (obj = new C2235j((a8.b) ((F7.l) this.f4077c).invoke(bVar))))) != null) {
                    obj = putIfAbsent;
                }
                return ((C2235j) obj).f20170a;
        }
    }

    public ArrayList p(String str) {
        D0.m c9 = D0.m.c(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            c9.i(1);
        } else {
            c9.j(1, str);
        }
        D0.j jVar = (D0.j) this.f4077c;
        jVar.b();
        Cursor g9 = jVar.g(c9);
        try {
            ArrayList arrayList = new ArrayList(g9.getCount());
            while (g9.moveToNext()) {
                arrayList.add(g9.getString(0));
            }
            return arrayList;
        } finally {
            g9.close();
            c9.release();
        }
    }

    public Object r(M7.c cVar, Object obj) {
        j.e(cVar, "property");
        return this.f4078d;
    }

    public JSONObject s(J1.f fVar) {
        StringBuilder sb = new StringBuilder("Settings response code was: ");
        int i9 = fVar.f1519a;
        sb.append(i9);
        String sb2 = sb.toString();
        r4.d dVar = r4.d.f22842a;
        dVar.f(sb2);
        String str = (String) this.f4077c;
        if (i9 != 200 && i9 != 201 && i9 != 202 && i9 != 203) {
            String str2 = "Settings request failed; (status: " + i9 + ") from " + str;
            if (!dVar.b(6)) {
                return null;
            }
            Log.e("FirebaseCrashlytics", str2, null);
            return null;
        }
        String str3 = fVar.b;
        try {
            return new JSONObject(str3);
        } catch (Exception e4) {
            dVar.g("Failed to parse settings JSON from " + str, e4);
            dVar.g("Settings response " + str3, null);
            return null;
        }
    }

    public boolean t(String str) {
        boolean z8 = true;
        D0.m c9 = D0.m.c(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        if (str == null) {
            c9.i(1);
        } else {
            c9.j(1, str);
        }
        D0.j jVar = (D0.j) this.f4077c;
        jVar.b();
        Cursor g9 = jVar.g(c9);
        try {
            boolean z9 = false;
            if (g9.moveToFirst()) {
                if (g9.getInt(0) == 0) {
                    z8 = false;
                }
                z9 = z8;
            }
            return z9;
        } finally {
            g9.close();
            c9.release();
        }
    }

    public void v() {
        C2493b c2493b = (C2493b) this.f4078d;
        OnBoardingActivity onBoardingActivity = (OnBoardingActivity) this.f4077c;
        if (c2493b == null) {
            ShimmerFrameLayout shimmerFrameLayout = ((AbstractC2799o) onBoardingActivity.k()).f23370u.f23197q;
            j.d(shimmerFrameLayout, "shimmerNativeLarge");
            com.bumptech.glide.d.M(shimmerFrameLayout);
        } else {
            ShimmerFrameLayout shimmerFrameLayout2 = ((AbstractC2799o) onBoardingActivity.k()).f23370u.f23197q;
            j.d(shimmerFrameLayout2, "shimmerNativeLarge");
            com.bumptech.glide.d.a0(shimmerFrameLayout2);
        }
    }

    public void w() {
        int i9 = OnBoardingActivity.f19676j;
        ((OnBoardingActivity) this.f4077c).u((C2493b) this.f4078d);
    }

    public void x(int i9, Bundle bundle) {
        s4.b bVar;
        Locale locale = Locale.US;
        String str = "Analytics listener received message. ID: " + i9 + ", Extras: " + bundle;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            if ("clx".equals(bundle2.getString("_o"))) {
                bVar = (s4.b) this.f4077c;
            } else {
                bVar = (s4.b) this.f4078d;
            }
            if (bVar != null) {
                bVar.f(bundle2, string);
            }
        }
    }

    public void y(Q.e eVar) {
        int i9 = eVar.b;
        Handler handler = (Handler) this.f4078d;
        E1.c cVar = (E1.c) this.f4077c;
        if (i9 == 0) {
            handler.post(new f4.b(6, cVar, eVar.f2457a));
        } else {
            handler.post(new Q.a(i9, 0, cVar));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x022b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void z(android.content.Context r12, android.content.res.XmlResourceParser r13) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.b.z(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public /* synthetic */ b(int i9, Object obj, Object obj2) {
        this.b = i9;
        this.f4077c = obj;
        this.f4078d = obj2;
    }

    public /* synthetic */ b(int i9, Object obj, Object obj2, boolean z8) {
        this.b = i9;
        this.f4077c = obj2;
        this.f4078d = obj;
    }

    public /* synthetic */ b(int i9, boolean z8) {
        this.b = i9;
    }

    public /* synthetic */ b(Object obj, int i9) {
        this.b = i9;
        this.f4078d = obj;
    }

    public b(Context context, int i9) {
        this.b = i9;
        switch (i9) {
            case 10:
                this.f4077c = context;
                this.f4078d = "image_manager_disk_cache";
                return;
            default:
                j.e(context, "context");
                this.f4077c = context;
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.tools.arruler.photomeasure.camera.ruler", 0);
                j.d(sharedPreferences, "getSharedPreferences(...)");
                this.f4078d = sharedPreferences;
                return;
        }
    }

    public b(D0.j jVar, int i9) {
        this.b = i9;
        switch (i9) {
            case 20:
                this.f4077c = jVar;
                this.f4078d = new C2161b(jVar, 3);
                return;
            default:
                this.f4077c = jVar;
                this.f4078d = new C2161b(jVar, 0);
                return;
        }
    }

    public b(int i9, F7.l lVar) {
        this.b = i9;
        switch (i9) {
            case 23:
                this.f4077c = lVar;
                this.f4078d = new ConcurrentHashMap();
                return;
            default:
                this.f4077c = lVar;
                this.f4078d = new C2241p(this);
                return;
        }
    }

    public b(N4.b bVar) {
        this.b = 27;
        this.f4078d = n0.q();
        this.f4077c = bVar;
    }

    public b(String str, C2643b c2643b) {
        this.b = 1;
        if (str != null) {
            this.f4078d = c2643b;
            this.f4077c = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.text.Editable$Factory, l0.a] */
    public b(EditText editText) {
        this.b = 26;
        this.f4077c = editText;
        l0.i iVar = new l0.i(editText);
        this.f4078d = iVar;
        editText.addTextChangedListener(iVar);
        if (C2435a.b == null) {
            synchronized (C2435a.f21540a) {
                try {
                    if (C2435a.b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            C2435a.f21541c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C2435a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        C2435a.b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(C2435a.b);
    }

    public b(ViewPager viewPager) {
        this.b = 16;
        this.f4078d = viewPager;
        this.f4077c = new Rect();
    }
}
