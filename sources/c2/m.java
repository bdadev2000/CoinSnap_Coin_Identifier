package C2;

import G7.s;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import com.mbridge.msdk.MBridgeConstans;
import f8.q;
import f8.t;
import f8.y;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static Thread f535a;
    public static final /* synthetic */ int b = 0;

    public static final y a(Number number) {
        return new q(number, false);
    }

    public static final y b(String str) {
        if (str == null) {
            return t.b;
        }
        return new q(str, true);
    }

    public static void c(String str, Exception exc) {
        Log.e("OMIDLIB", str, exc);
    }

    public static String d(int i9, int i10, String str) {
        if (i9 < 0) {
            return F2.h.B("%s (%s) must not be negative", str, Integer.valueOf(i9));
        }
        if (i10 >= 0) {
            return F2.h.B("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i9), Integer.valueOf(i10));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i10);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void e(String str, boolean z8) {
        if (z8) {
        } else {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void f(int i9) {
        if (i9 >= 0) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void g(int i9, int i10) {
        String B5;
        if (i9 >= 0 && i9 < i10) {
            return;
        }
        if (i9 >= 0) {
            if (i10 >= 0) {
                B5 = F2.h.B("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i9), Integer.valueOf(i10));
            } else {
                StringBuilder sb = new StringBuilder(26);
                sb.append("negative size: ");
                sb.append(i10);
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            B5 = F2.h.B("%s (%s) must not be negative", "index", Integer.valueOf(i9));
        }
        throw new IndexOutOfBoundsException(B5);
    }

    public static void h(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }

    public static void i(int i9, int i10) {
        if (i9 >= 0 && i9 <= i10) {
        } else {
            throw new IndexOutOfBoundsException(d(i9, i10, "index"));
        }
    }

    public static void j(int i9, int i10, int i11) {
        String d2;
        if (i9 >= 0 && i10 >= i9 && i10 <= i11) {
            return;
        }
        if (i9 >= 0 && i9 <= i11) {
            if (i10 >= 0 && i10 <= i11) {
                d2 = F2.h.B("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i9));
            } else {
                d2 = d(i10, i11, "end index");
            }
        } else {
            d2 = d(i9, i11, "start index");
        }
        throw new IndexOutOfBoundsException(d2);
    }

    public static Object k(int i9) {
        if (i9 >= 2 && i9 <= 1073741824 && Integer.highestOneBit(i9) == i9) {
            if (i9 <= 256) {
                return new byte[i9];
            }
            if (i9 <= 65536) {
                return new short[i9];
            }
            return new int[i9];
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("must be power of 2 between 2^1 and 2^30: ");
        sb.append(i9);
        throw new IllegalArgumentException(sb.toString());
    }

    public static final void l(f8.j jVar, String str) {
        throw new IllegalArgumentException("Element " + s.a(jVar.getClass()) + " is not a " + str);
    }

    public static final Boolean m(y yVar) {
        G7.j.e(yVar, "<this>");
        String b8 = yVar.b();
        String[] strArr = g8.y.f20550a;
        G7.j.e(b8, "<this>");
        if (b8.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (b8.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final Class n(String str) {
        if (O2.a.b(m.class)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th) {
            O2.a.a(m.class, th);
            return null;
        }
    }

    public static final Method o(Class cls, String str, Class... clsArr) {
        if (O2.a.b(m.class)) {
            return null;
        }
        try {
            G7.j.e(clsArr, "args");
            try {
                return cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th) {
            O2.a.a(m.class, th);
            return null;
        }
    }

    public static Set p() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.emptySet();
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }

    public static a7.b q() {
        a7.b bVar = a7.b.f4076f;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalStateException(a7.b.class.getSimpleName().concat(" is not initialized, call initializeInstance(..) method first."));
    }

    public static A2.c r(JSONObject jSONObject) {
        int length;
        String string = jSONObject.getString("event_name");
        String string2 = jSONObject.getString("method");
        G7.j.d(string2, "mapping.getString(\"method\")");
        Locale locale = Locale.ENGLISH;
        G7.j.d(locale, "ENGLISH");
        String upperCase = string2.toUpperCase(locale);
        G7.j.d(upperCase, "(this as java.lang.String).toUpperCase(locale)");
        A2.b valueOf = A2.b.valueOf(upperCase);
        String string3 = jSONObject.getString("event_type");
        G7.j.d(string3, "mapping.getString(\"event_type\")");
        String upperCase2 = string3.toUpperCase(locale);
        G7.j.d(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
        A2.a valueOf2 = A2.a.valueOf(upperCase2);
        String string4 = jSONObject.getString("app_version");
        JSONArray jSONArray = jSONObject.getJSONArray(MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        ArrayList arrayList = new ArrayList();
        int length2 = jSONArray.length();
        int i9 = 0;
        if (length2 > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                G7.j.d(jSONObject2, "jsonPath");
                arrayList.add(new A2.e(jSONObject2));
                if (i11 >= length2) {
                    break;
                }
                i10 = i11;
            }
        }
        String optString = jSONObject.optString("path_type", "absolute");
        JSONArray optJSONArray = jSONObject.optJSONArray("parameters");
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            while (true) {
                int i12 = i9 + 1;
                JSONObject jSONObject3 = optJSONArray.getJSONObject(i9);
                G7.j.d(jSONObject3, "jsonParameter");
                arrayList2.add(new A2.d(jSONObject3));
                if (i12 >= length) {
                    break;
                }
                i9 = i12;
            }
        }
        String optString2 = jSONObject.optString("component_id");
        String optString3 = jSONObject.optString("activity_name");
        G7.j.d(string, "eventName");
        G7.j.d(string4, "appVersion");
        G7.j.d(optString2, "componentId");
        G7.j.d(optString, "pathType");
        G7.j.d(optString3, "activityName");
        return new A2.c(string, valueOf, valueOf2, string4, arrayList, arrayList2, optString2, optString, optString3);
    }

    public static final Method s(Class cls, String str, Class... clsArr) {
        if (O2.a.b(m.class)) {
            return null;
        }
        try {
            G7.j.e(cls, "clazz");
            try {
                return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th) {
            O2.a.a(m.class, th);
            return null;
        }
    }

    public static final Object t(Class cls, Method method, Object obj, Object... objArr) {
        if (O2.a.b(m.class)) {
            return null;
        }
        try {
            G7.j.e(cls, "clazz");
            G7.j.e(method, "method");
            G7.j.e(objArr, "args");
            if (obj != null) {
                obj = cls.cast(obj);
            }
            try {
                return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        } catch (Throwable th) {
            O2.a.a(m.class, th);
            return null;
        }
    }

    public static int u(int i9, int i10, int i11) {
        return (i9 & (~i11)) | (i10 & i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r5 != (-1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        z(r1, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        r13[r5] = u(r13[r5], r9, r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int v(java.lang.Object r9, java.lang.Object r10, int r11, java.lang.Object r12, int[] r13, java.lang.Object[] r14, java.lang.Object[] r15) {
        /*
            int r0 = F2.h.U(r9)
            r1 = r0 & r11
            int r2 = y(r1, r12)
            r3 = -1
            if (r2 != 0) goto Le
            return r3
        Le:
            int r4 = ~r11
            r0 = r0 & r4
            r5 = r3
        L11:
            int r2 = r2 + (-1)
            r6 = r13[r2]
            r7 = r6 & r4
            if (r7 != r0) goto L3c
            r7 = r14[r2]
            boolean r7 = z2.i.h(r9, r7)
            if (r7 == 0) goto L3c
            if (r15 == 0) goto L2b
            r7 = r15[r2]
            boolean r7 = z2.i.h(r10, r7)
            if (r7 == 0) goto L3c
        L2b:
            r9 = r6 & r11
            if (r5 != r3) goto L33
            z(r1, r9, r12)
            goto L3b
        L33:
            r10 = r13[r5]
            int r9 = u(r10, r9, r11)
            r13[r5] = r9
        L3b:
            return r2
        L3c:
            r5 = r6 & r11
            if (r5 != 0) goto L41
            return r3
        L41:
            r8 = r5
            r5 = r2
            r2 = r8
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.m.v(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    public static void w(Activity activity) {
        View b8;
        G7.j.e(activity, "activity");
        int hashCode = activity.hashCode();
        HashMap hashMap = I2.e.f1440f;
        HashMap hashMap2 = null;
        if (!O2.a.b(I2.e.class)) {
            try {
                hashMap2 = I2.e.f1440f;
            } catch (Throwable th) {
                O2.a.a(I2.e.class, th);
            }
        }
        Integer valueOf = Integer.valueOf(hashCode);
        Object obj = hashMap2.get(valueOf);
        if (obj == null) {
            obj = new I2.e(activity);
            hashMap2.put(valueOf, obj);
        }
        I2.e eVar = (I2.e) obj;
        if (!O2.a.b(I2.e.class)) {
            try {
                if (!O2.a.b(eVar)) {
                    try {
                        if (!eVar.f1442d.getAndSet(true) && (b8 = E2.e.b((Activity) eVar.b.get())) != null) {
                            ViewTreeObserver viewTreeObserver = b8.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.addOnGlobalLayoutListener(eVar);
                                eVar.a();
                            }
                        }
                    } catch (Throwable th2) {
                        O2.a.a(eVar, th2);
                    }
                }
            } catch (Throwable th3) {
                O2.a.a(I2.e.class, th3);
            }
        }
    }

    public static void x(Activity activity) {
        View b8;
        G7.j.e(activity, "activity");
        int hashCode = activity.hashCode();
        HashMap hashMap = I2.e.f1440f;
        HashMap hashMap2 = null;
        if (!O2.a.b(I2.e.class)) {
            try {
                hashMap2 = I2.e.f1440f;
            } catch (Throwable th) {
                O2.a.a(I2.e.class, th);
            }
        }
        I2.e eVar = (I2.e) hashMap2.remove(Integer.valueOf(hashCode));
        if (eVar != null && !O2.a.b(I2.e.class)) {
            try {
                if (!O2.a.b(eVar)) {
                    try {
                        if (eVar.f1442d.getAndSet(false) && (b8 = E2.e.b((Activity) eVar.b.get())) != null) {
                            ViewTreeObserver viewTreeObserver = b8.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnGlobalLayoutListener(eVar);
                            }
                        }
                    } catch (Throwable th2) {
                        O2.a.a(eVar, th2);
                    }
                }
            } catch (Throwable th3) {
                O2.a.a(I2.e.class, th3);
            }
        }
    }

    public static int y(int i9, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i9] & 255;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i9] & 65535;
        }
        return ((int[]) obj)[i9];
    }

    public static void z(int i9, int i10, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i9] = (byte) i10;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i9] = (short) i10;
        } else {
            ((int[]) obj)[i9] = i10;
        }
    }
}
