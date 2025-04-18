package a6;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import com.facebook.x;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class g {
    public static final g a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f277b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f278c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final String f279d = x.a().getPackageName();

    /* renamed from: e, reason: collision with root package name */
    public static final SharedPreferences f280e = x.a().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);

    /* renamed from: f, reason: collision with root package name */
    public static final SharedPreferences f281f = x.a().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    public static final ArrayList f(Context context, Object obj) {
        if (m6.a.b(g.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            g gVar = a;
            return gVar.a(gVar.e(context, "inapp", obj));
        } catch (Throwable th2) {
            m6.a.a(g.class, th2);
            return null;
        }
    }

    public final ArrayList a(ArrayList arrayList) {
        SharedPreferences sharedPreferences = f281f;
        if (m6.a.b(this)) {
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
                    long j3 = jSONObject.getLong("purchaseTime");
                    String string2 = jSONObject.getString("purchaseToken");
                    if (currentTimeMillis - (j3 / 1000) <= 86400 && !Intrinsics.areEqual(sharedPreferences.getString(string, ""), string2)) {
                        edit.putString(string, string2);
                        arrayList2.add(str);
                    }
                } catch (JSONException unused) {
                }
            }
            edit.apply();
            return arrayList2;
        } catch (Throwable th2) {
            m6.a.a(this, th2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036 A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #1 {all -> 0x003a, blocks: (B:7:0x000a, B:10:0x0013, B:14:0x0036, B:24:0x0030, B:18:0x001c, B:20:0x0026), top: B:6:0x000a, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Class b(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            boolean r0 = m6.a.b(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.HashMap r0 = a6.g.f278c
            java.lang.Object r2 = r0.get(r6)     // Catch: java.lang.Throwable -> L3a
            java.lang.Class r2 = (java.lang.Class) r2     // Catch: java.lang.Throwable -> L3a
            if (r2 == 0) goto L13
            return r2
        L13:
            java.lang.Class<a6.k> r2 = a6.k.class
            boolean r3 = m6.a.b(r2)     // Catch: java.lang.Throwable -> L3a
            if (r3 == 0) goto L1c
            goto L33
        L1c:
            java.lang.String r3 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = "className"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)     // Catch: java.lang.Throwable -> L2f
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch: java.lang.Throwable -> L2f java.lang.ClassNotFoundException -> L33
            java.lang.Class r5 = r5.loadClass(r6)     // Catch: java.lang.Throwable -> L2f java.lang.ClassNotFoundException -> L33
            goto L34
        L2f:
            r5 = move-exception
            m6.a.a(r2, r5)     // Catch: java.lang.Throwable -> L3a
        L33:
            r5 = r1
        L34:
            if (r5 == 0) goto L39
            r0.put(r6, r5)     // Catch: java.lang.Throwable -> L3a
        L39:
            return r5
        L3a:
            r5 = move-exception
            m6.a.a(r4, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.g.b(android.content.Context, java.lang.String):java.lang.Class");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final Method c(Class cls, String str) {
        Class[] clsArr;
        Method w10;
        if (m6.a.b(this)) {
            return null;
        }
        try {
            HashMap hashMap = f277b;
            Method method = (Method) hashMap.get(str);
            if (method != null) {
                return method;
            }
            switch (str.hashCode()) {
                case -1801122596:
                    if (str.equals("getPurchases")) {
                        Class TYPE = Integer.TYPE;
                        Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
                        clsArr = new Class[]{TYPE, String.class, String.class, String.class};
                        break;
                    } else {
                        clsArr = null;
                        break;
                    }
                case -1450694211:
                    if (str.equals("isBillingSupported")) {
                        Class TYPE2 = Integer.TYPE;
                        Intrinsics.checkNotNullExpressionValue(TYPE2, "TYPE");
                        clsArr = new Class[]{TYPE2, String.class, String.class};
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
                        Class TYPE3 = Integer.TYPE;
                        Intrinsics.checkNotNullExpressionValue(TYPE3, "TYPE");
                        clsArr = new Class[]{TYPE3, String.class, String.class, String.class, Bundle.class};
                        break;
                    } else {
                        clsArr = null;
                        break;
                    }
                case -573310373:
                    if (str.equals("getSkuDetails")) {
                        Class TYPE4 = Integer.TYPE;
                        Intrinsics.checkNotNullExpressionValue(TYPE4, "TYPE");
                        clsArr = new Class[]{TYPE4, String.class, String.class, Bundle.class};
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
                w10 = k.w(cls, str, null);
            } else {
                w10 = k.w(cls, str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            }
            if (w10 != null) {
                hashMap.put(str, w10);
            }
            return w10;
        } catch (Throwable th2) {
            m6.a.a(this, th2);
            return null;
        }
    }

    public final ArrayList d(Context context, Object obj) {
        ArrayList<String> stringArrayList;
        if (m6.a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (i(context, "inapp", obj)) {
                char c10 = 0;
                String str = null;
                int i10 = 0;
                boolean z10 = false;
                while (true) {
                    Object[] objArr = new Object[5];
                    objArr[c10] = 6;
                    objArr[1] = f279d;
                    objArr[2] = "inapp";
                    objArr[3] = str;
                    objArr[4] = new Bundle();
                    Object h10 = h(context, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, objArr);
                    if (h10 != null) {
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle = (Bundle) h10;
                        if (bundle.getInt("RESPONSE_CODE") == 0 && (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) != null) {
                            Iterator<String> it = stringArrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                String next = it.next();
                                if (currentTimeMillis - (new JSONObject(next).getLong("purchaseTime") / 1000) > 1200) {
                                    z10 = true;
                                    break;
                                }
                                arrayList.add(next);
                                i10++;
                            }
                            str = bundle.getString("INAPP_CONTINUATION_TOKEN");
                            if (i10 < 30 || str == null || z10) {
                                break;
                                break;
                            }
                            c10 = 0;
                        }
                    }
                    str = null;
                    if (i10 < 30) {
                        break;
                    }
                    c10 = 0;
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            m6.a.a(this, th2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062 A[EDGE_INSN: B:24:0x0062->B:28:0x0062 BREAK  A[LOOP:0: B:12:0x0019->B:23:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList e(android.content.Context r13, java.lang.String r14, java.lang.Object r15) {
        /*
            r12 = this;
            boolean r0 = m6.a.b(r12)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L63
            r0.<init>()     // Catch: java.lang.Throwable -> L63
            if (r15 != 0) goto L10
            return r0
        L10:
            boolean r2 = r12.i(r13, r14, r15)     // Catch: java.lang.Throwable -> L63
            if (r2 == 0) goto L62
            r2 = 0
            r3 = r1
            r4 = r2
        L19:
            r5 = 4
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L63
            r5 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L63
            r11[r2] = r6     // Catch: java.lang.Throwable -> L63
            java.lang.String r6 = a6.g.f279d     // Catch: java.lang.Throwable -> L63
            r7 = 1
            r11[r7] = r6     // Catch: java.lang.Throwable -> L63
            r6 = 2
            r11[r6] = r14     // Catch: java.lang.Throwable -> L63
            r11[r5] = r3     // Catch: java.lang.Throwable -> L63
            java.lang.String r8 = "com.android.vending.billing.IInAppBillingService"
            java.lang.String r9 = "getPurchases"
            r6 = r12
            r7 = r13
            r10 = r15
            java.lang.Object r3 = r6.h(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L63
            if (r3 == 0) goto L5b
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch: java.lang.Throwable -> L63
            java.lang.String r5 = "RESPONSE_CODE"
            int r5 = r3.getInt(r5)     // Catch: java.lang.Throwable -> L63
            if (r5 != 0) goto L5b
            java.lang.String r5 = "INAPP_PURCHASE_DATA_LIST"
            java.util.ArrayList r5 = r3.getStringArrayList(r5)     // Catch: java.lang.Throwable -> L63
            if (r5 == 0) goto L62
            int r6 = r5.size()     // Catch: java.lang.Throwable -> L63
            int r4 = r4 + r6
            r0.addAll(r5)     // Catch: java.lang.Throwable -> L63
            java.lang.String r5 = "INAPP_CONTINUATION_TOKEN"
            java.lang.String r3 = r3.getString(r5)     // Catch: java.lang.Throwable -> L63
            goto L5c
        L5b:
            r3 = r1
        L5c:
            r5 = 30
            if (r4 >= r5) goto L62
            if (r3 != 0) goto L19
        L62:
            return r0
        L63:
            r13 = move-exception
            m6.a.a(r12, r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.g.e(android.content.Context, java.lang.String, java.lang.Object):java.util.ArrayList");
    }

    public final LinkedHashMap g(Context context, ArrayList arrayList, Object obj, boolean z10) {
        Object obj2;
        int size;
        if (m6.a.b(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (obj != null && !arrayList.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
                Object[] objArr = new Object[4];
                int i10 = 0;
                objArr[0] = 3;
                objArr[1] = f279d;
                if (z10) {
                    obj2 = "subs";
                } else {
                    obj2 = "inapp";
                }
                objArr[2] = obj2;
                objArr[3] = bundle;
                Object h10 = h(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, objArr);
                if (h10 != null) {
                    Bundle bundle2 = (Bundle) h10;
                    if (bundle2.getInt("RESPONSE_CODE") == 0) {
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList != null && arrayList.size() == stringArrayList.size() && arrayList.size() - 1 >= 0) {
                            while (true) {
                                int i11 = i10 + 1;
                                Object obj3 = arrayList.get(i10);
                                Intrinsics.checkNotNullExpressionValue(obj3, "skuList[i]");
                                String str = stringArrayList.get(i10);
                                Intrinsics.checkNotNullExpressionValue(str, "skuDetailsList[i]");
                                linkedHashMap.put(obj3, str);
                                if (i11 > size) {
                                    break;
                                }
                                i10 = i11;
                            }
                        }
                        k(linkedHashMap);
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            m6.a.a(this, th2);
            return null;
        }
    }

    public final Object h(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method c10;
        if (m6.a.b(this)) {
            return null;
        }
        try {
            Class b3 = b(context, str);
            if (b3 == null || (c10 = c(b3, str2)) == null) {
                return null;
            }
            return k.D(b3, obj, c10, Arrays.copyOf(objArr, objArr.length));
        } catch (Throwable th2) {
            m6.a.a(this, th2);
            return null;
        }
    }

    public final boolean i(Context context, String str, Object obj) {
        if (m6.a.b(this) || obj == null) {
            return false;
        }
        try {
            Object h10 = h(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, f279d, str});
            if (h10 == null) {
                return false;
            }
            if (((Integer) h10).intValue() != 0) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            m6.a.a(this, th2);
            return false;
        }
    }

    public final LinkedHashMap j(ArrayList arrayList) {
        List split$default;
        if (m6.a.b(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String sku = (String) it.next();
                String string = f280e.getString(sku, null);
                if (string != null) {
                    split$default = StringsKt__StringsKt.split$default(string, new String[]{";"}, false, 2, 2, (Object) null);
                    if (currentTimeMillis - Long.parseLong((String) split$default.get(0)) < 43200) {
                        Intrinsics.checkNotNullExpressionValue(sku, "sku");
                        linkedHashMap.put(sku, split$default.get(1));
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            m6.a.a(this, th2);
            return null;
        }
    }

    public final void k(LinkedHashMap linkedHashMap) {
        if (m6.a.b(this)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor edit = f280e.edit();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                edit.putString((String) entry.getKey(), currentTimeMillis + ';' + ((String) entry.getValue()));
            }
            edit.apply();
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
    }
}
