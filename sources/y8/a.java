package y8;

import A5.d;
import D5.b;
import F2.h;
import G7.j;
import G7.x;
import M7.f;
import M7.g;
import Q7.B;
import R3.u;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.view.View;
import com.applovin.impl.L;
import com.facebook.login.v;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.tools.arruler.app.ArRulerApplication;
import f4.c;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import x0.AbstractC2914a;
import y.k;

/* loaded from: classes3.dex */
public abstract class a implements d {
    public static int a(boolean[] zArr, int i9, int[] iArr, boolean z8) {
        int i10 = 0;
        for (int i11 : iArr) {
            int i12 = 0;
            while (i12 < i11) {
                zArr[i9] = z8;
                i12++;
                i9++;
            }
            i10 += i11;
            z8 = !z8;
        }
        return i10;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [y.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [y.l, java.lang.Object] */
    public static k b(B b) {
        ?? obj = new Object();
        obj.f24271c = new Object();
        k kVar = new k(obj);
        obj.b = kVar;
        obj.f24270a = AbstractC2914a.class;
        try {
            b.J(false, true, new v(2, obj, b));
            obj.f24270a = "Deferred.asListenableFuture";
        } catch (Exception e4) {
            kVar.f24274c.i(e4);
        }
        return kVar;
    }

    public static Object c(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v2, types: [q4.d] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static j0.q f(android.content.Context r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lc
            j0.c r0 = new j0.c
            r0.<init>()
            goto L11
        Lc:
            q4.d r0 = new q4.d
            r0.<init>()
        L11:
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            java.lang.String r2 = "Package manager required to locate emoji font provider"
            C2.m.h(r1, r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.content.action.LOAD_EMOJI_FONT"
            r2.<init>(r3)
            r3 = 0
            java.util.List r2 = r1.queryIntentContentProviders(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L2a:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L46
            java.lang.Object r4 = r2.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ProviderInfo r4 = r4.providerInfo
            if (r4 == 0) goto L2a
            android.content.pm.ApplicationInfo r6 = r4.applicationInfo
            if (r6 == 0) goto L2a
            int r6 = r6.flags
            r7 = 1
            r6 = r6 & r7
            if (r6 != r7) goto L2a
            goto L47
        L46:
            r4 = r5
        L47:
            if (r4 != 0) goto L4b
        L49:
            r1 = r5
            goto L7a
        L4b:
            java.lang.String r2 = r4.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            java.lang.String r4 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            android.content.pm.Signature[] r0 = r0.w(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            r1.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            int r6 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
        L59:
            if (r3 >= r6) goto L67
            r7 = r0[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            byte[] r7 = r7.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            r1.add(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            int r3 = r3 + 1
            goto L59
        L67:
            java.util.List r0 = java.util.Collections.singletonList(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            F1.i r1 = new F1.i     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            java.lang.String r3 = "emojicompat-emoji-font"
            r1.<init>(r2, r0, r4, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            goto L7a
        L73:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
            goto L49
        L7a:
            if (r1 != 0) goto L7d
            goto L87
        L7d:
            j0.q r5 = new j0.q
            j0.p r0 = new j0.p
            r0.<init>(r8, r1)
            r5.<init>(r0)
        L87:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: y8.a.f(android.content.Context):j0.q");
    }

    public static M6.a i() {
        String str;
        M6.a aVar;
        String language = Resources.getSystem().getConfiguration().getLocales().get(0).getLanguage();
        ArrayList arrayList = new ArrayList();
        arrayList.add("cs");
        arrayList.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR);
        arrayList.add("en");
        arrayList.add("es");
        arrayList.add("fil");
        arrayList.add("fr");
        arrayList.add("hi");
        arrayList.add("hr");
        arrayList.add("in");
        arrayList.add("it");
        arrayList.add("ko");
        arrayList.add("ja");
        arrayList.add("ms");
        arrayList.add("nl");
        arrayList.add("pl");
        arrayList.add("pt");
        arrayList.add("ru");
        arrayList.add("sr");
        arrayList.add("sv");
        arrayList.add("tr");
        arrayList.add("vi");
        arrayList.add("zh");
        if (!arrayList.contains(language)) {
            language = "";
        }
        Iterator it = ((List) ArRulerApplication.f19629h.getValue()).iterator();
        do {
            str = null;
            if (!it.hasNext()) {
                return null;
            }
            aVar = (M6.a) it.next();
            if (aVar != null) {
                str = aVar.f2007c;
            }
        } while (!j.a(language, str));
        return aVar;
    }

    public static Object k(c cVar) {
        Object obj;
        if (cVar.isDone()) {
            boolean z8 = false;
            while (true) {
                try {
                    obj = cVar.get();
                    break;
                } catch (InterruptedException unused) {
                    z8 = true;
                } catch (Throwable th) {
                    if (z8) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z8) {
                Thread.currentThread().interrupt();
            }
            return obj;
        }
        throw new IllegalStateException(h.B("Future was expected to be done: %s", cVar));
    }

    public static SharedPreferences l(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static String m(String str, String str2) {
        return AbstractC2914a.k("https://console.firebase.google.com/project/", str, "/performance/app/android:", str2);
    }

    public static f q(x xVar) {
        return new f(g.b, xVar);
    }

    public static void v(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException(L.i(cls.getDeclaredConstructor(null).newInstance(null), "Expected instanceof GlideModule, but found: "));
            } catch (IllegalAccessException e4) {
                x(cls, e4);
                throw null;
            } catch (InstantiationException e9) {
                x(cls, e9);
                throw null;
            } catch (NoSuchMethodException e10) {
                x(cls, e10);
                throw null;
            } catch (InvocationTargetException e11) {
                x(cls, e11);
                throw null;
            }
        } catch (ClassNotFoundException e12) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e12);
        }
    }

    public static final /* synthetic */ Integer w(int i9) {
        Integer valueOf = Integer.valueOf(i9);
        if (i9 == Integer.MIN_VALUE) {
            return null;
        }
        return valueOf;
    }

    public static void x(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }

    public abstract int d(View view, int i9);

    public abstract int e(View view, int i9);

    public abstract boolean[] g(String str);

    public abstract void h(u uVar, float f9, float f10);

    public int j() {
        return 10;
    }

    @Override // A5.d
    public b n(String str, int i9, EnumMap enumMap) {
        if (!str.isEmpty()) {
            int j7 = j();
            A5.a aVar = A5.a.f68h;
            if (enumMap.containsKey(aVar)) {
                j7 = Integer.parseInt(enumMap.get(aVar).toString());
            }
            boolean[] g9 = g(str);
            int length = g9.length;
            int i10 = j7 + length;
            int max = Math.max(200, i10);
            int max2 = Math.max(1, 200);
            int i11 = max / i10;
            int i12 = (max - (length * i11)) / 2;
            b bVar = new b(max, max2);
            int i13 = 0;
            while (i13 < length) {
                if (g9[i13]) {
                    bVar.c(i12, 0, i11, max2);
                }
                i13++;
                i12 += i11;
            }
            return bVar;
        }
        throw new IllegalArgumentException("Found empty contents");
    }

    public int o(View view) {
        return 0;
    }

    public int p() {
        return 0;
    }

    public abstract void s(int i9);

    public abstract void t(View view, int i9, int i10);

    public abstract void u(View view, float f9, float f10);

    public abstract boolean y(View view, int i9);

    public void r(View view, int i9) {
    }
}
