package androidx.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.facebook.g0;
import h.c0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONObject;
import s7.s2;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f567b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f568c;

    public /* synthetic */ d(Object obj, int i10) {
        this.f567b = i10;
        this.f568c = obj;
    }

    private final void a() {
        String a;
        Locale locale;
        String str = (String) this.f568c;
        x5.d dVar = x5.d.a;
        String str2 = "0";
        if (!m6.a.b(x5.d.class)) {
            try {
                Bundle bundle = new Bundle();
                com.facebook.internal.c y4 = com.facebook.b.y(com.facebook.x.a());
                JSONArray jSONArray = new JSONArray();
                String str3 = Build.MODEL;
                if (str3 == null) {
                    str3 = "";
                }
                jSONArray.put(str3);
                if (y4 == null) {
                    a = null;
                } else {
                    a = y4.a();
                }
                if (a != null) {
                    jSONArray.put(y4.a());
                } else {
                    jSONArray.put("");
                }
                jSONArray.put("0");
                if (c6.c.t()) {
                    str2 = "1";
                }
                jSONArray.put(str2);
                try {
                    locale = com.facebook.x.a().getResources().getConfiguration().locale;
                } catch (Exception unused) {
                    locale = null;
                }
                if (locale == null) {
                    locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
                }
                jSONArray.put(locale.getLanguage() + '_' + ((Object) locale.getCountry()));
                String jSONArray2 = jSONArray.toString();
                Intrinsics.checkNotNullExpressionValue(jSONArray2, "extInfoArray.toString()");
                bundle.putString("device_session_id", x5.d.a());
                bundle.putString("extinfo", jSONArray2);
                String str4 = g0.f11000j;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                boolean z10 = true;
                String format = String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{str}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                JSONObject jSONObject = com.facebook.c.B(format, bundle, null).c().f11167b;
                AtomicBoolean atomicBoolean = x5.d.f27380g;
                if (jSONObject == null || !jSONObject.optBoolean("is_app_indexing_enabled", false)) {
                    z10 = false;
                }
                atomicBoolean.set(z10);
                if (!atomicBoolean.get()) {
                    x5.d.f27378e = null;
                } else {
                    x5.k kVar = x5.d.f27377d;
                    if (kVar != null) {
                        kVar.c();
                    }
                }
                x5.d.f27381h = false;
            } catch (Throwable th2) {
                m6.a.a(x5.d.class, th2);
            }
        }
    }

    private final void b() {
        boolean z10;
        g6.e this$0 = (g6.e) this.f568c;
        com.facebook.b bVar = g6.e.f18218f;
        if (!m6.a.b(g6.e.class)) {
            try {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                try {
                    View q10 = c6.c.q((Activity) this$0.f18220b.get());
                    Activity activity = (Activity) this$0.f18220b.get();
                    if (q10 != null && activity != null) {
                        Iterator it = g6.c.a(q10).iterator();
                        while (it.hasNext()) {
                            View view = (View) it.next();
                            if (!y5.f.b(view)) {
                                String d10 = g6.c.d(view);
                                if (d10.length() > 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10 && d10.length() <= 300) {
                                    HashSet hashSet = g6.f.f18223g;
                                    String localClassName = activity.getLocalClassName();
                                    Intrinsics.checkNotNullExpressionValue(localClassName, "activity.localClassName");
                                    com.facebook.c.d(view, q10, localClassName);
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th2) {
                m6.a.a(g6.e.class, th2);
            }
        }
    }

    private final void c() {
        com.facebook.appevents.n nVar = (com.facebook.appevents.n) this.f568c;
        com.facebook.internal.z zVar = com.facebook.internal.z.a;
        nVar.getClass();
    }

    private final void d() {
        com.facebook.login.i this$0 = (com.facebook.login.i) this.f568c;
        int i10 = com.facebook.login.i.f11223n;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.j();
    }

    private final void e() {
        n7.k kVar = (n7.k) this.f568c;
        kVar.getClass();
        ((o7.j) kVar.f22504d).q(new androidx.core.app.h(kVar, 12));
    }

    private final void f() {
        s2 s2Var = (s2) this.f568c;
        int i10 = c0.f18526c;
        s2Var.c();
    }

    private final void g() {
        x7.h hVar = (x7.h) this.f568c;
        if (!hVar.f27454d) {
            x7.n nVar = hVar.f27453c;
            if (nVar != null) {
                nVar.e(hVar.f27452b);
            }
            hVar.f27455f.f27469n.remove(hVar);
            hVar.f27454d = true;
        }
    }

    private final void h() {
        ((x7.d) this.f568c).e(null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:89|(3:142|(2:145|143)|146)|92|(5:(13:97|98|(2:100|(3:101|102|(1:104)(4:105|106|107|108)))|119|120|121|122|123|124|125|126|127|128)|125|126|127|128)|138|98|(0)|119|120|121|122|123|124) */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x067a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x067b, code lost:
    
        r2 = 0;
        r1 = 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0621 A[Catch: IOException -> 0x0686, UnknownHostException -> 0x069b, TRY_LEAVE, TryCatch #9 {UnknownHostException -> 0x069b, blocks: (B:87:0x0594, B:89:0x059f, B:92:0x05ca, B:94:0x05d4, B:98:0x05e4, B:100:0x0621, B:108:0x063c, B:117:0x0645, B:118:0x0648, B:119:0x0649, B:123:0x065c, B:127:0x0667, B:139:0x05a7, B:142:0x05ae, B:143:0x05b4, B:145:0x05ba, B:147:0x067e, B:148:0x0685), top: B:86:0x0594 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x04d2  */
    /* JADX WARN: Type inference failed for: r0v188, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v190, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v76 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 2364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.d.run():void");
    }
}
