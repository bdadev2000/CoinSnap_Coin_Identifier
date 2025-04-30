package C2;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import com.applovin.sdk.AppLovinEventParameters;
import com.facebook.r;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f519a = new Object();
    public static final HashMap b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f520c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final String f521d = r.a().getPackageName();

    /* renamed from: e, reason: collision with root package name */
    public static final SharedPreferences f522e = r.a().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);

    /* renamed from: f, reason: collision with root package name */
    public static final SharedPreferences f523f = r.a().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    public static final ArrayList f(Context context, Object obj) {
        if (O2.a.b(i.class)) {
            return null;
        }
        try {
            i iVar = f519a;
            return iVar.a(iVar.e(context, "inapp", obj));
        } catch (Throwable th) {
            O2.a.a(i.class, th);
            return null;
        }
    }

    public final ArrayList a(ArrayList arrayList) {
        SharedPreferences sharedPreferences = f523f;
        if (O2.a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList2 = new ArrayList();
            SharedPreferences.Editor edit = sharedPreferences.edit();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String string = jSONObject.getString("productId");
                    long j7 = jSONObject.getLong("purchaseTime");
                    String string2 = jSONObject.getString("purchaseToken");
                    if (currentTimeMillis - (j7 / 1000) <= 86400 && !G7.j.a(sharedPreferences.getString(string, ""), string2)) {
                        edit.putString(string, string2);
                        arrayList2.add(str);
                    }
                } catch (JSONException unused) {
                }
            }
            edit.apply();
            return arrayList2;
        } catch (Throwable th) {
            O2.a.a(this, th);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:7:0x000a, B:10:0x0013, B:14:0x002d, B:22:0x0027, B:18:0x001d), top: B:6:0x000a, inners: #1, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Class b(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            boolean r0 = O2.a.b(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.HashMap r0 = C2.i.f520c
            java.lang.Object r2 = r0.get(r6)     // Catch: java.lang.Throwable -> L31
            java.lang.Class r2 = (java.lang.Class) r2     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L13
            return r2
        L13:
            java.lang.Class<C2.m> r2 = C2.m.class
            boolean r3 = O2.a.b(r2)     // Catch: java.lang.Throwable -> L31
            if (r3 == 0) goto L1d
        L1b:
            r5 = r1
            goto L2b
        L1d:
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L1b java.lang.Throwable -> L26
            java.lang.Class r5 = r5.loadClass(r6)     // Catch: java.lang.ClassNotFoundException -> L1b java.lang.Throwable -> L26
            goto L2b
        L26:
            r5 = move-exception
            O2.a.a(r2, r5)     // Catch: java.lang.Throwable -> L31
            goto L1b
        L2b:
            if (r5 == 0) goto L33
            r0.put(r6, r5)     // Catch: java.lang.Throwable -> L31
            goto L33
        L31:
            r5 = move-exception
            goto L34
        L33:
            return r5
        L34:
            O2.a.a(r4, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.i.b(android.content.Context, java.lang.String):java.lang.Class");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final Method c(Class cls, String str) {
        Class[] clsArr;
        Method o3;
        if (O2.a.b(this)) {
            return null;
        }
        try {
            HashMap hashMap = b;
            Method method = (Method) hashMap.get(str);
            if (method != null) {
                return method;
            }
            switch (str.hashCode()) {
                case -1801122596:
                    if (str.equals("getPurchases")) {
                        Class cls2 = Integer.TYPE;
                        G7.j.d(cls2, "TYPE");
                        clsArr = new Class[]{cls2, String.class, String.class, String.class};
                        break;
                    }
                    clsArr = null;
                    break;
                case -1450694211:
                    if (str.equals("isBillingSupported")) {
                        Class cls3 = Integer.TYPE;
                        G7.j.d(cls3, "TYPE");
                        clsArr = new Class[]{cls3, String.class, String.class};
                        break;
                    } else {
                        clsArr = null;
                        break;
                    }
                case -1123215065:
                    if (str.equals("asInterface")) {
                        clsArr = new Class[]{IBinder.class};
                        break;
                    } else {
                        clsArr = null;
                        break;
                    }
                case -594356707:
                    if (str.equals("getPurchaseHistory")) {
                        Class cls4 = Integer.TYPE;
                        G7.j.d(cls4, "TYPE");
                        clsArr = new Class[]{cls4, String.class, String.class, String.class, Bundle.class};
                        break;
                    } else {
                        clsArr = null;
                        break;
                    }
                case -573310373:
                    if (str.equals("getSkuDetails")) {
                        Class cls5 = Integer.TYPE;
                        G7.j.d(cls5, "TYPE");
                        clsArr = new Class[]{cls5, String.class, String.class, Bundle.class};
                        break;
                    } else {
                        clsArr = null;
                        break;
                    }
                default:
                    clsArr = null;
                    break;
            }
            if (clsArr == null) {
                o3 = m.o(cls, str, null);
            } else {
                o3 = m.o(cls, str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            }
            if (o3 != null) {
                hashMap.put(str, o3);
            }
            return o3;
        } catch (Throwable th) {
            O2.a.a(this, th);
            return null;
        }
    }

    public final ArrayList d(Context context, Object obj) {
        ArrayList<String> stringArrayList;
        if (O2.a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (i(context, "inapp", obj)) {
                int i9 = 0;
                boolean z8 = false;
                String str = null;
                do {
                    Object h6 = h(context, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, new Object[]{6, f521d, "inapp", str, new Bundle()});
                    if (h6 != null) {
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle = (Bundle) h6;
                        if (bundle.getInt("RESPONSE_CODE") == 0 && (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) != null) {
                            Iterator<String> it = stringArrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                String next = it.next();
                                if (currentTimeMillis - (new JSONObject(next).getLong("purchaseTime") / 1000) > 1200) {
                                    z8 = true;
                                    break;
                                }
                                arrayList.add(next);
                                i9++;
                            }
                            str = bundle.getString("INAPP_CONTINUATION_TOKEN");
                            if (i9 < 30 || str == null) {
                                break;
                                break;
                            }
                        }
                    }
                    str = null;
                    if (i9 < 30) {
                        break;
                    }
                } while (!z8);
            }
            return arrayList;
        } catch (Throwable th) {
            O2.a.a(this, th);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a A[EDGE_INSN: B:24:0x005a->B:28:0x005a BREAK  A[LOOP:0: B:12:0x0018->B:23:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList e(android.content.Context r13, java.lang.String r14, java.lang.Object r15) {
        /*
            r12 = this;
            boolean r0 = O2.a.b(r12)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L51
            r0.<init>()     // Catch: java.lang.Throwable -> L51
            if (r15 != 0) goto L10
            return r0
        L10:
            boolean r2 = r12.i(r13, r14, r15)     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L5a
            r2 = 0
            r3 = r1
        L18:
            r4 = 3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L51
            java.lang.String r5 = C2.i.f521d     // Catch: java.lang.Throwable -> L51
            java.lang.Object[] r11 = new java.lang.Object[]{r4, r5, r14, r3}     // Catch: java.lang.Throwable -> L51
            java.lang.String r8 = "com.android.vending.billing.IInAppBillingService"
            java.lang.String r9 = "getPurchases"
            r6 = r12
            r7 = r13
            r10 = r15
            java.lang.Object r3 = r6.h(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L51
            if (r3 == 0) goto L53
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch: java.lang.Throwable -> L51
            java.lang.String r4 = "RESPONSE_CODE"
            int r4 = r3.getInt(r4)     // Catch: java.lang.Throwable -> L51
            if (r4 != 0) goto L53
            java.lang.String r4 = "INAPP_PURCHASE_DATA_LIST"
            java.util.ArrayList r4 = r3.getStringArrayList(r4)     // Catch: java.lang.Throwable -> L51
            if (r4 == 0) goto L5a
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L51
            int r2 = r2 + r5
            r0.addAll(r4)     // Catch: java.lang.Throwable -> L51
            java.lang.String r4 = "INAPP_CONTINUATION_TOKEN"
            java.lang.String r3 = r3.getString(r4)     // Catch: java.lang.Throwable -> L51
            goto L54
        L51:
            r13 = move-exception
            goto L5b
        L53:
            r3 = r1
        L54:
            r4 = 30
            if (r2 >= r4) goto L5a
            if (r3 != 0) goto L18
        L5a:
            return r0
        L5b:
            O2.a.a(r12, r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.i.e(android.content.Context, java.lang.String, java.lang.Object):java.util.ArrayList");
    }

    public final LinkedHashMap g(Context context, ArrayList arrayList, Object obj, boolean z8) {
        String str;
        int size;
        if (O2.a.b(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (obj != null && !arrayList.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
                String str2 = f521d;
                if (z8) {
                    str = "subs";
                } else {
                    str = "inapp";
                }
                Object h6 = h(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, new Object[]{3, str2, str, bundle});
                if (h6 != null) {
                    Bundle bundle2 = (Bundle) h6;
                    if (bundle2.getInt("RESPONSE_CODE") == 0) {
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList != null && arrayList.size() == stringArrayList.size() && arrayList.size() - 1 >= 0) {
                            int i9 = 0;
                            while (true) {
                                int i10 = i9 + 1;
                                Object obj2 = arrayList.get(i9);
                                G7.j.d(obj2, "skuList[i]");
                                String str3 = stringArrayList.get(i9);
                                G7.j.d(str3, "skuDetailsList[i]");
                                linkedHashMap.put(obj2, str3);
                                if (i10 > size) {
                                    break;
                                }
                                i9 = i10;
                            }
                        }
                        k(linkedHashMap);
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            O2.a.a(this, th);
            return null;
        }
    }

    public final Object h(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method c9;
        if (O2.a.b(this)) {
            return null;
        }
        try {
            Class b8 = b(context, str);
            if (b8 == null || (c9 = c(b8, str2)) == null) {
                return null;
            }
            return m.t(b8, c9, obj, Arrays.copyOf(objArr, objArr.length));
        } catch (Throwable th) {
            O2.a.a(this, th);
            return null;
        }
    }

    public final boolean i(Context context, String str, Object obj) {
        if (O2.a.b(this) || obj == null) {
            return false;
        }
        try {
            Object h6 = h(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, f521d, str});
            if (h6 == null) {
                return false;
            }
            if (((Integer) h6).intValue() != 0) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            O2.a.a(this, th);
            return false;
        }
    }

    public final LinkedHashMap j(ArrayList arrayList) {
        if (O2.a.b(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                String string = f522e.getString(str, null);
                if (string != null) {
                    List V8 = O7.g.V(string, new String[]{";"}, 2, 2);
                    if (currentTimeMillis - Long.parseLong((String) V8.get(0)) < 43200) {
                        G7.j.d(str, AppLovinEventParameters.PRODUCT_IDENTIFIER);
                        linkedHashMap.put(str, V8.get(1));
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            O2.a.a(this, th);
            return null;
        }
    }

    public final void k(LinkedHashMap linkedHashMap) {
        if (O2.a.b(this)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor edit = f522e.edit();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                edit.putString((String) entry.getKey(), currentTimeMillis + ';' + ((String) entry.getValue()));
            }
            edit.apply();
        } catch (Throwable th) {
            O2.a.a(this, th);
        }
    }
}
