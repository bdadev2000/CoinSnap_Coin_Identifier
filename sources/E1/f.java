package e1;

import Q7.n0;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.webkit.WebView;
import android.widget.EdgeEffect;
import h.C2310a;
import java.io.File;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public abstract class f {
    public static void a(String str, Exception exc) {
        Log.e("OMIDLIB", str, exc);
    }

    public static F2.f b(JSONObject jSONObject) {
        String string;
        String string2;
        String optString;
        int i9;
        float[] fArr;
        if (jSONObject != null) {
            try {
                string = jSONObject.getString("use_case");
                string2 = jSONObject.getString("asset_uri");
                optString = jSONObject.optString("rules_uri", null);
                i9 = jSONObject.getInt("version_id");
                F2.g gVar = F2.g.f1140a;
                JSONArray jSONArray = jSONObject.getJSONArray("thresholds");
                if (!O2.a.b(F2.g.class)) {
                    try {
                    } catch (Throwable th) {
                        O2.a.a(F2.g.class, th);
                    }
                    if (!O2.a.b(gVar) && jSONArray != null) {
                        try {
                            fArr = new float[jSONArray.length()];
                            int length = jSONArray.length();
                            if (length > 0) {
                                int i10 = 0;
                                while (true) {
                                    int i11 = i10 + 1;
                                    try {
                                        String string3 = jSONArray.getString(i10);
                                        G7.j.d(string3, "jsonArray.getString(i)");
                                        fArr[i10] = Float.parseFloat(string3);
                                    } catch (JSONException unused) {
                                    }
                                    if (i11 >= length) {
                                        break;
                                    }
                                    i10 = i11;
                                }
                            }
                        } catch (Throwable th2) {
                            O2.a.a(gVar, th2);
                        }
                        G7.j.d(string, "useCase");
                        G7.j.d(string2, "assetUri");
                    }
                }
                fArr = null;
                G7.j.d(string, "useCase");
                G7.j.d(string2, "assetUri");
            } catch (Exception unused2) {
                return null;
            }
        }
        return new F2.f(string, string2, optString, i9, fArr);
    }

    public static int d(int i9, int i10) {
        if (i10 >= 0) {
            if (i9 < 0) {
                return 0;
            }
            if (i9 > i10) {
                return i10;
            }
            return i9;
        }
        throw new IllegalArgumentException(n0.f(i10, "Cannot coerce value to an empty range: maximum ", " is less than minimum 0."));
    }

    public static long e(long j7) {
        if (j7 < -4611686018427387903L) {
            return -4611686018427387903L;
        }
        if (j7 > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j7;
    }

    public static int f(String str, int i9, int i10, boolean z8) {
        boolean z9;
        while (i9 < i10) {
            int i11 = i9 + 1;
            char charAt = str.charAt(i9);
            if ((charAt >= ' ' || charAt == '\t') && charAt < 127 && ((charAt > '9' || '0' > charAt) && ((charAt > 'z' || 'a' > charAt) && ((charAt > 'Z' || 'A' > charAt) && charAt != ':')))) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z9 == (!z8)) {
                return i9;
            }
            i9 = i11;
        }
        return i10;
    }

    public static void h(F2.f fVar, ArrayList arrayList) {
        File[] listFiles;
        File b = F2.i.b();
        int i9 = fVar.f1135d;
        String str = fVar.f1133a;
        if (b != null && (listFiles = b.listFiles()) != null && listFiles.length != 0) {
            String str2 = str + '_' + i9;
            int length = listFiles.length;
            int i10 = 0;
            while (i10 < length) {
                File file = listFiles[i10];
                i10++;
                String name = file.getName();
                G7.j.d(name, "name");
                if (O7.o.C(name, str, false) && !O7.o.C(name, str2, false)) {
                    file.delete();
                }
            }
        }
        String str3 = str + '_' + i9;
        F2.d dVar = new F2.d(arrayList, 0);
        String str4 = fVar.b;
        File file2 = new File(F2.i.b(), str3);
        if (str4 != null && !file2.exists()) {
            new E2.j(str4, file2, dVar).execute(new String[0]);
        } else {
            dVar.c(file2);
        }
    }

    public static InvocationHandler i() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = U0.e.b();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
            } catch (IllegalAccessException e4) {
                throw new RuntimeException(e4);
            } catch (NoSuchMethodException e9) {
                throw new RuntimeException(e9);
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static String j(Context context) {
        G7.j.e(context, "context");
        if (com.facebook.appevents.l.a() == null) {
            synchronized (com.facebook.appevents.l.c()) {
                if (com.facebook.appevents.l.a() == null) {
                    String string = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
                    if (!O2.a.b(com.facebook.appevents.l.class)) {
                        try {
                            com.facebook.appevents.l.f13495f = string;
                        } catch (Throwable th) {
                            O2.a.a(com.facebook.appevents.l.class, th);
                        }
                    }
                    if (com.facebook.appevents.l.a() == null) {
                        UUID randomUUID = UUID.randomUUID();
                        G7.j.d(randomUUID, "randomUUID()");
                        String j7 = G7.j.j(randomUUID, "XZ");
                        if (!O2.a.b(com.facebook.appevents.l.class)) {
                            try {
                                com.facebook.appevents.l.f13495f = j7;
                            } catch (Throwable th2) {
                                O2.a.a(com.facebook.appevents.l.class, th2);
                            }
                        }
                        context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", com.facebook.appevents.l.a()).apply();
                    }
                }
            }
        }
        String a6 = com.facebook.appevents.l.a();
        if (a6 != null) {
            return a6;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public static float k(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Z.e.b(edgeEffect);
        }
        return 0.0f;
    }

    public static Object m(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            return P.d.a(bundle, str, C2310a.class);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (!C2310a.class.isInstance(parcelable)) {
            return null;
        }
        return parcelable;
    }

    public static float o(EdgeEffect edgeEffect, float f9, float f10) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Z.e.c(edgeEffect, f9, f10);
        }
        Z.d.a(edgeEffect, f9, f10);
        return f9;
    }

    public static long p(int i9, String str) {
        int f9 = f(str, 0, i9, false);
        Matcher matcher = i8.p.m.matcher(str);
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        while (f9 < i9) {
            int f10 = f(str, f9 + 1, i9, true);
            matcher.region(f9, f10);
            if (i11 == -1 && matcher.usePattern(i8.p.m).matches()) {
                String group = matcher.group(1);
                G7.j.d(group, "matcher.group(1)");
                i11 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                G7.j.d(group2, "matcher.group(2)");
                i14 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                G7.j.d(group3, "matcher.group(3)");
                i15 = Integer.parseInt(group3);
            } else if (i12 == -1 && matcher.usePattern(i8.p.l).matches()) {
                String group4 = matcher.group(1);
                G7.j.d(group4, "matcher.group(1)");
                i12 = Integer.parseInt(group4);
            } else {
                if (i13 == -1) {
                    Pattern pattern = i8.p.f20862k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        G7.j.d(group5, "matcher.group(1)");
                        Locale locale = Locale.US;
                        G7.j.d(locale, "US");
                        String lowerCase = group5.toLowerCase(locale);
                        G7.j.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        String pattern2 = pattern.pattern();
                        G7.j.d(pattern2, "MONTH_PATTERN.pattern()");
                        i13 = O7.g.J(pattern2, lowerCase, 0, false, 6) / 4;
                    }
                }
                if (i10 == -1 && matcher.usePattern(i8.p.f20861j).matches()) {
                    String group6 = matcher.group(1);
                    G7.j.d(group6, "matcher.group(1)");
                    i10 = Integer.parseInt(group6);
                }
            }
            f9 = f(str, f10 + 1, i9, false);
        }
        if (70 <= i10 && i10 < 100) {
            i10 += 1900;
        }
        if (i10 >= 0 && i10 < 70) {
            i10 += 2000;
        }
        if (i10 >= 1601) {
            if (i13 != -1) {
                if (1 <= i12 && i12 < 32) {
                    if (i11 >= 0 && i11 < 24) {
                        if (i14 >= 0 && i14 < 60) {
                            if (i15 >= 0 && i15 < 60) {
                                GregorianCalendar gregorianCalendar = new GregorianCalendar(j8.b.f21217e);
                                gregorianCalendar.setLenient(false);
                                gregorianCalendar.set(1, i10);
                                gregorianCalendar.set(2, i13 - 1);
                                gregorianCalendar.set(5, i12);
                                gregorianCalendar.set(11, i11);
                                gregorianCalendar.set(12, i14);
                                gregorianCalendar.set(13, i15);
                                gregorianCalendar.set(14, 0);
                                return gregorianCalendar.getTimeInMillis();
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static L7.a s(L7.c cVar, int i9) {
        boolean z8;
        G7.j.e(cVar, "<this>");
        if (i9 > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        Integer valueOf = Integer.valueOf(i9);
        if (z8) {
            if (cVar.f1831d <= 0) {
                i9 = -i9;
            }
            return new L7.a(cVar.b, cVar.f1830c, i9);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [L7.c, L7.a] */
    public static L7.c t(int i9, int i10) {
        if (i10 <= Integer.MIN_VALUE) {
            L7.c cVar = L7.c.f1835f;
            return L7.c.f1835f;
        }
        return new L7.a(i9, i10 - 1, 1);
    }

    public abstract List c(List list, String str);

    public void g(androidx.work.p pVar) {
        List singletonList = Collections.singletonList(pVar);
        V0.k kVar = (V0.k) this;
        if (!singletonList.isEmpty()) {
            V0.e eVar = new V0.e(kVar, singletonList);
            if (!eVar.f3404n) {
                ((C.c) kVar.f3419d).p(new RunnableC2212d(eVar));
                return;
            } else {
                androidx.work.o.e().h(V0.e.f3401o, AbstractC2914a.e("Already enqueued work ids (", TextUtils.join(", ", eVar.l), ")"), new Throwable[0]);
                return;
            }
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public abstract InputFilter[] l(InputFilter[] inputFilterArr);

    public abstract boolean n();

    public abstract void q(boolean z8);

    public abstract void r(boolean z8);

    public abstract TransformationMethod u(TransformationMethod transformationMethod);
}
