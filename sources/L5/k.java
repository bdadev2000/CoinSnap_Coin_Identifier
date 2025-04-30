package l5;

import G7.s;
import G7.v;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.lifecycle.AbstractC0505o;
import androidx.lifecycle.V;
import androidx.lifecycle.Y;
import androidx.lifecycle.b0;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import com.adjust.sdk.Constants;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p5.C2550a;
import p5.C2551b;
import q.C2624t;
import q.S;
import r0.AbstractC2654b;
import r0.C2655c;
import s0.C2692c;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public Object f21619a;
    public Object b;

    /* renamed from: c, reason: collision with root package name */
    public Object f21620c;

    public k(f0 f0Var, d0 d0Var, AbstractC2654b abstractC2654b) {
        G7.j.e(f0Var, "store");
        G7.j.e(abstractC2654b, "extras");
        this.b = f0Var;
        this.f21620c = d0Var;
        this.f21619a = abstractC2654b;
    }

    public static final URL a(k kVar) {
        kVar.getClass();
        Uri.Builder appendPath = new Uri.Builder().scheme(Constants.SCHEME).authority((String) kVar.f21619a).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        C2551b c2551b = (C2551b) kVar.b;
        Uri.Builder appendPath2 = appendPath.appendPath(c2551b.f22307a).appendPath("settings");
        C2550a c2550a = c2551b.f22309d;
        return new URL(appendPath2.appendQueryParameter("build_version", c2550a.f22303c).appendQueryParameter("display_version", c2550a.b).build().toString());
    }

    public static String b(String str, Map map) {
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb.append((String) entry.getKey());
        sb.append("=");
        if (entry.getValue() == null) {
            str2 = "";
        } else {
            str2 = URLEncoder.encode((String) entry.getValue(), "UTF-8");
        }
        sb.append(str2);
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append("&");
            sb.append((String) entry2.getKey());
            sb.append("=");
            if (entry2.getValue() == null) {
                str3 = "";
            } else {
                str3 = URLEncoder.encode((String) entry2.getValue(), "UTF-8");
            }
            sb.append(str3);
        }
        String sb2 = sb.toString();
        if (sb2.isEmpty()) {
            return str;
        }
        if (str.contains("?")) {
            if (!str.endsWith("&")) {
                sb2 = "&".concat(sb2);
            }
            return com.mbridge.msdk.foundation.entity.o.j(str, sb2);
        }
        return com.mbridge.msdk.foundation.entity.o.k(str, "?", sb2);
    }

    public static k i(Context context, AttributeSet attributeSet, int[] iArr, int i9, int i10) {
        return new k(context, context.obtainStyledAttributes(attributeSet, iArr, i9, i10));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, J1.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public J1.f c() {
        /*
            r8 = this;
            java.lang.String r0 = "FirebaseCrashlytics"
            java.lang.String r1 = "GET Request URL: "
            r2 = 0
            java.lang.Object r3 = r8.b     // Catch: java.lang.Throwable -> Lba
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> Lba
            java.lang.Object r4 = r8.f21620c     // Catch: java.lang.Throwable -> Lba
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Throwable -> Lba
            java.lang.String r3 = b(r3, r4)     // Catch: java.lang.Throwable -> Lb5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb5
            r4.<init>(r1)     // Catch: java.lang.Throwable -> Lb5
            r4.append(r3)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> Lb5
            r4 = 2
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L28
            if (r4 == 0) goto L2b
            android.util.Log.v(r0, r1, r2)     // Catch: java.lang.Throwable -> L28
            goto L2b
        L28:
            r0 = move-exception
            goto Lb8
        L2b:
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> Lb5
            r0.<init>(r3)     // Catch: java.lang.Throwable -> Lb5
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Throwable -> Lb5
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0     // Catch: java.lang.Throwable -> Lb5
            r1 = 10000(0x2710, float:1.4013E-41)
            r0.setReadTimeout(r1)     // Catch: java.lang.Throwable -> L6b
            r0.setConnectTimeout(r1)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r1 = "GET"
            r0.setRequestMethod(r1)     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r1 = r8.f21619a     // Catch: java.lang.Throwable -> L6b
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L6b
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L6b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L6b
        L4f:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L6b
            if (r3 == 0) goto L6d
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L6b
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L6b
            r0.addRequestProperty(r4, r3)     // Catch: java.lang.Throwable -> L6b
            goto L4f
        L6b:
            r1 = move-exception
            goto Lbc
        L6d:
            r0.connect()     // Catch: java.lang.Throwable -> L6b
            int r1 = r0.getResponseCode()     // Catch: java.lang.Throwable -> L6b
            java.io.InputStream r3 = r0.getInputStream()     // Catch: java.lang.Throwable -> L6b
            if (r3 == 0) goto La3
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> La0
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> La0
            java.lang.String r5 = "UTF-8"
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> La0
            r2.<init>(r4)     // Catch: java.lang.Throwable -> La0
            r4 = 8192(0x2000, float:1.148E-41)
            char[] r4 = new char[r4]     // Catch: java.lang.Throwable -> La0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La0
            r5.<init>()     // Catch: java.lang.Throwable -> La0
        L8f:
            int r6 = r2.read(r4)     // Catch: java.lang.Throwable -> La0
            r7 = -1
            if (r6 == r7) goto L9b
            r7 = 0
            r5.append(r4, r7, r6)     // Catch: java.lang.Throwable -> La0
            goto L8f
        L9b:
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> La0
            goto La3
        La0:
            r1 = move-exception
            r2 = r3
            goto Lbc
        La3:
            if (r3 == 0) goto La8
            r3.close()
        La8:
            r0.disconnect()
            J1.f r0 = new J1.f
            r0.<init>()
            r0.f1519a = r1
            r0.b = r2
            return r0
        Lb5:
            r1 = move-exception
        Lb6:
            r0 = r2
            goto Lbc
        Lb8:
            r1 = r0
            goto Lb6
        Lba:
            r0 = move-exception
            goto Lb8
        Lbc:
            if (r2 == 0) goto Lc1
            r2.close()
        Lc1:
            if (r0 == 0) goto Lc6
            r0.disconnect()
        Lc6:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.k.c():J1.f");
    }

    public ColorStateList d(int i9) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = (TypedArray) this.b;
        if (typedArray.hasValue(i9) && (resourceId = typedArray.getResourceId(i9, 0)) != 0 && (colorStateList = I.h.getColorStateList((Context) this.f21619a, resourceId)) != null) {
            return colorStateList;
        }
        return typedArray.getColorStateList(i9);
    }

    public Drawable e(int i9) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.b;
        if (typedArray.hasValue(i9) && (resourceId = typedArray.getResourceId(i9, 0)) != 0) {
            return com.facebook.appevents.n.g((Context) this.f21619a, resourceId);
        }
        return typedArray.getDrawable(i9);
    }

    public Drawable f(int i9) {
        int resourceId;
        Drawable f9;
        if (((TypedArray) this.b).hasValue(i9) && (resourceId = ((TypedArray) this.b).getResourceId(i9, 0)) != 0) {
            C2624t a6 = C2624t.a();
            Context context = (Context) this.f21619a;
            synchronized (a6) {
                f9 = a6.f22726a.f(context, resourceId, true);
            }
            return f9;
        }
        return null;
    }

    public Typeface g(int i9, int i10, S s5) {
        int resourceId = ((TypedArray) this.b).getResourceId(i9, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f21620c) == null) {
            this.f21620c = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f21620c;
        ThreadLocal threadLocal = K.o.f1632a;
        Context context = (Context) this.f21619a;
        if (context.isRestricted()) {
            return null;
        }
        return K.o.b(context, resourceId, typedValue, i10, s5, true, false);
    }

    public b0 h(M7.b bVar, String str) {
        boolean isInstance;
        b0 a6;
        G7.j.e(bVar, "modelClass");
        G7.j.e(str, "key");
        f0 f0Var = (f0) this.b;
        f0Var.getClass();
        LinkedHashMap linkedHashMap = f0Var.f4890a;
        b0 b0Var = (b0) linkedHashMap.get(str);
        Class cls = ((G7.e) bVar).f1329a;
        G7.j.e(cls, "jClass");
        Map map = G7.e.b;
        G7.j.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            isInstance = v.c(num.intValue(), b0Var);
        } else {
            if (cls.isPrimitive()) {
                cls = com.facebook.appevents.g.o(s.a(cls));
            }
            isInstance = cls.isInstance(b0Var);
        }
        d0 d0Var = (d0) this.f21620c;
        if (isInstance) {
            if (d0Var instanceof Y) {
                Y y4 = (Y) d0Var;
                G7.j.b(b0Var);
                y4.getClass();
                AbstractC0505o abstractC0505o = y4.f4876d;
                if (abstractC0505o != null) {
                    G0.e eVar = y4.f4877e;
                    G7.j.b(eVar);
                    V.a(b0Var, eVar, abstractC0505o);
                }
            }
            G7.j.c(b0Var, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return b0Var;
        }
        C2655c c2655c = new C2655c((AbstractC2654b) this.f21619a);
        c2655c.f22812a.put(C2692c.f22965a, str);
        G7.j.e(d0Var, "factory");
        try {
            try {
                a6 = d0Var.c(bVar, c2655c);
            } catch (AbstractMethodError unused) {
                a6 = d0Var.a(com.facebook.appevents.g.n(bVar));
            }
        } catch (AbstractMethodError unused2) {
            a6 = d0Var.b(com.facebook.appevents.g.n(bVar), c2655c);
        }
        G7.j.e(a6, "viewModel");
        b0 b0Var2 = (b0) linkedHashMap.put(str, a6);
        if (b0Var2 != null) {
            b0Var2.b();
        }
        return a6;
    }

    public void j() {
        ((TypedArray) this.b).recycle();
    }

    public k(Context context, TypedArray typedArray) {
        this.f21619a = context;
        this.b = typedArray;
    }
}
