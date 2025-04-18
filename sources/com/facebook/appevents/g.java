package com.facebook.appevents;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.core.view.ViewCompat;
import com.facebook.b0;
import com.facebook.g0;
import com.facebook.internal.m0;
import com.facebook.x;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s7.h1;
import vc.e1;

/* loaded from: classes3.dex */
public abstract class g {
    public static final float[][] a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b, reason: collision with root package name */
    public static final float[][] f10937b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c, reason: collision with root package name */
    public static final float[] f10938c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d, reason: collision with root package name */
    public static final float[][] f10939d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* renamed from: e, reason: collision with root package name */
    public static final Type[] f10940e = new Type[0];

    /* renamed from: f, reason: collision with root package name */
    public static final jd.b f10941f = new jd.b(1);

    /* renamed from: g, reason: collision with root package name */
    public static int f10942g = 2;

    /* JADX WARN: Code restructure failed: missing block: B:127:0x01ef, code lost:
    
        return 5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A(java.lang.String r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.g.A(java.lang.String, int, int):int");
    }

    public static IllegalArgumentException B(Method method, Exception exc, String str, Object... objArr) {
        StringBuilder n10 = eb.j.n(String.format(str, objArr), "\n    for method ");
        n10.append(method.getDeclaringClass().getSimpleName());
        n10.append(".");
        n10.append(method.getName());
        return new IllegalArgumentException(n10.toString(), exc);
    }

    public static IllegalArgumentException C(Method method, int i10, String str, Object... objArr) {
        StringBuilder n10 = eb.j.n(str, " (parameter #");
        n10.append(i10 + 1);
        n10.append(")");
        return B(method, null, n10.toString(), objArr);
    }

    public static IllegalArgumentException D(Method method, Exception exc, int i10, String str, Object... objArr) {
        StringBuilder n10 = eb.j.n(str, " (parameter #");
        n10.append(i10 + 1);
        n10.append(")");
        return B(method, exc, n10.toString(), objArr);
    }

    public static BigDecimal E(String str) {
        c(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0066: MOVE (r2 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:103), block:B:45:0x0065 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0094 A[Catch: all -> 0x009b, TRY_LEAVE, TryCatch #6 {, blocks: (B:4:0x0003, B:12:0x0025, B:14:0x0028, B:17:0x0094, B:23:0x0033, B:37:0x0051, B:39:0x0054, B:34:0x008f, B:46:0x0067, B:48:0x006a, B:49:0x007c, B:52:0x0075, B:27:0x007e, B:29:0x0081), top: B:3:0x0003, inners: #7, #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final synchronized com.facebook.appevents.t F() {
        /*
            java.lang.Class<com.facebook.appevents.g> r0 = com.facebook.appevents.g.class
            monitor-enter(r0)
            android.content.Context r1 = com.facebook.x.a()     // Catch: java.lang.Throwable -> L9b
            r2 = 0
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.FileInputStream r3 = r1.openFileInput(r3)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48 java.io.FileNotFoundException -> L7d
            java.lang.String r4 = "context.openFileInput(PERSISTED_EVENTS_FILENAME)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48 java.io.FileNotFoundException -> L7d
            com.facebook.appevents.f r4 = new com.facebook.appevents.f     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48 java.io.FileNotFoundException -> L7d
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48 java.io.FileNotFoundException -> L7d
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48 java.io.FileNotFoundException -> L7d
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48 java.io.FileNotFoundException -> L7d
            java.lang.Object r3 = r4.readObject()     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L64 java.io.FileNotFoundException -> L7e
            if (r3 == 0) goto L3c
            com.facebook.appevents.t r3 = (com.facebook.appevents.t) r3     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L64 java.io.FileNotFoundException -> L7e
            com.facebook.internal.m0.d(r4)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r2)     // Catch: java.lang.Exception -> L32 java.lang.Throwable -> L9b
            r1.delete()     // Catch: java.lang.Exception -> L32 java.lang.Throwable -> L9b
            goto L3a
        L32:
            r1 = move-exception
            java.lang.String r2 = "com.facebook.appevents.g"
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r2, r4, r1)     // Catch: java.lang.Throwable -> L9b
        L3a:
            r2 = r3
            goto L92
        L3c:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L64 java.io.FileNotFoundException -> L7e
            java.lang.String r5 = "null cannot be cast to non-null type com.facebook.appevents.PersistedEvents"
            r3.<init>(r5)     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L64 java.io.FileNotFoundException -> L7e
            throw r3     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L64 java.io.FileNotFoundException -> L7e
        L44:
            r3 = move-exception
            goto L4a
        L46:
            r3 = move-exception
            goto L67
        L48:
            r3 = move-exception
            r4 = r2
        L4a:
            java.lang.String r5 = "com.facebook.appevents.g"
            java.lang.String r6 = "Got unexpected exception while reading events: "
            android.util.Log.w(r5, r6, r3)     // Catch: java.lang.Throwable -> L64
            com.facebook.internal.m0.d(r4)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L9b
            r1.delete()     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L9b
            goto L92
        L5e:
            r1 = move-exception
            java.lang.String r3 = "com.facebook.appevents.g"
        L61:
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            goto L8f
        L64:
            r2 = move-exception
            r3 = r2
            r2 = r4
        L67:
            com.facebook.internal.m0.d(r2)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r2)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L9b
            r1.delete()     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L9b
            goto L7c
        L74:
            r1 = move-exception
            java.lang.String r2 = "com.facebook.appevents.g"
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r2, r4, r1)     // Catch: java.lang.Throwable -> L9b
        L7c:
            throw r3     // Catch: java.lang.Throwable -> L9b
        L7d:
            r4 = r2
        L7e:
            com.facebook.internal.m0.d(r4)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L9b
            r1.delete()     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L9b
            goto L92
        L8b:
            r1 = move-exception
            java.lang.String r3 = "com.facebook.appevents.g"
            goto L61
        L8f:
            android.util.Log.w(r3, r4, r1)     // Catch: java.lang.Throwable -> L9b
        L92:
            if (r2 != 0) goto L99
            com.facebook.appevents.t r2 = new com.facebook.appevents.t     // Catch: java.lang.Throwable -> L9b
            r2.<init>()     // Catch: java.lang.Throwable -> L9b
        L99:
            monitor-exit(r0)
            return r2
        L9b:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.g.F():com.facebook.appevents.t");
    }

    public static final JSONObject G(String str) {
        File l10 = l();
        if (l10 != null && str != null) {
            try {
                return new JSONObject(m0.I(new FileInputStream(new File(l10, str))));
            } catch (Exception unused) {
                e(str);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r10 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043 A[LOOP:0: B:1:0x0000->B:18:0x0043, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.reflect.Type H(java.lang.reflect.Type r8, java.lang.Class r9, java.lang.reflect.Type r10) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.g.H(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    public static final void I(t tVar) {
        ObjectOutputStream objectOutputStream;
        Context a10 = x.a();
        try {
            objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(a10.openFileOutput("AppEventsLogger.persistedevents", 0)));
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream = null;
        }
        try {
            objectOutputStream.writeObject(tVar);
        } catch (Throwable th3) {
            th = th3;
            try {
                Log.w("com.facebook.appevents.g", "Got unexpected exception while persisting events: ", th);
                try {
                    a10.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                } catch (Exception unused) {
                }
            } finally {
                m0.d(objectOutputStream);
            }
        }
    }

    public static final void J(String str, JSONArray reports, b0 b0Var) {
        Intrinsics.checkNotNullParameter(reports, "reports");
        if (reports.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, reports.toString());
            JSONObject n10 = m0.n();
            if (n10 != null) {
                Iterator<String> keys = n10.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, n10.get(next));
                }
            }
            String str2 = g0.f11000j;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{x.b()}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            com.facebook.c.A(null, format, jSONObject, b0Var).d();
        } catch (JSONException unused) {
        }
    }

    public static void K(Throwable th2) {
        if (!(th2 instanceof VirtualMachineError)) {
            if (!(th2 instanceof ThreadDeath)) {
                if (!(th2 instanceof LinkageError)) {
                    return;
                } else {
                    throw ((LinkageError) th2);
                }
            }
            throw ((ThreadDeath) th2);
        }
        throw ((VirtualMachineError) th2);
    }

    public static String L(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static void M(com.google.gson.p pVar, zc.b bVar) {
        e1.f26442z.c(bVar, pVar);
    }

    public static final void N(String str, String str2) {
        File l10 = l();
        if (l10 != null && str != null && str2 != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(l10, str));
                byte[] bytes = str2.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                fileOutputStream.write(bytes);
                fileOutputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    public static float O() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public static int a(e1.b bVar, boolean z10) {
        int i10;
        int i11;
        byte b3;
        if (z10) {
            i10 = bVar.f17070c;
        } else {
            i10 = bVar.f17069b;
        }
        if (z10) {
            i11 = bVar.f17069b;
        } else {
            i11 = bVar.f17070c;
        }
        byte[][] bArr = (byte[][]) bVar.f17071d;
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            byte b10 = -1;
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                if (z10) {
                    b3 = bArr[i13][i15];
                } else {
                    b3 = bArr[i15][i13];
                }
                if (b3 == b10) {
                    i14++;
                } else {
                    if (i14 >= 5) {
                        i12 = a4.j.a(i14, -5, 3, i12);
                    }
                    i14 = 1;
                    b10 = b3;
                }
            }
            if (i14 >= 5) {
                i12 = a4.j.a(i14, -5, 3, i12);
            }
        }
        return i12;
    }

    public static void b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(String str) {
        if (str.length() <= 10000) {
            return;
        }
        throw new NumberFormatException("Number string too large: " + str.substring(0, 30) + "...");
    }

    public static db.a d(String str, String str2) {
        kc.a aVar = new kc.a(str, str2);
        h1 b3 = db.a.b(kc.a.class);
        b3.f24387c = 1;
        b3.f24390f = new androidx.core.app.h(aVar, 0);
        return b3.b();
    }

    public static final void e(String str) {
        File l10 = l();
        if (l10 != null && str != null) {
            new File(l10, str).delete();
        }
    }

    public static void f(ArrayList arrayList) {
        boolean z10;
        boolean z11;
        boolean z12;
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i10 = 0;
            if (it.hasNext()) {
                db.a aVar = (db.a) it.next();
                db.h hVar = new db.h(aVar);
                for (db.s sVar : aVar.f16939b) {
                    if (aVar.f16942e == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean z13 = !z12;
                    db.i iVar = new db.i(sVar, z13);
                    if (!hashMap.containsKey(iVar)) {
                        hashMap.put(iVar, new HashSet());
                    }
                    Set set = (Set) hashMap.get(iVar);
                    if (!set.isEmpty() && !z13) {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", sVar));
                    }
                    set.add(hVar);
                }
            } else {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (db.h hVar2 : (Set) it2.next()) {
                        for (db.j jVar : hVar2.a.f16940c) {
                            if (jVar.f16957c == 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                if (jVar.f16956b == 2) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                Set<db.h> set2 = (Set) hashMap.get(new db.i(jVar.a, z11));
                                if (set2 != null) {
                                    for (db.h hVar3 : set2) {
                                        hVar2.f16953b.add(hVar3);
                                        hVar3.f16954c.add(hVar2);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    db.h hVar4 = (db.h) it4.next();
                    if (hVar4.f16954c.isEmpty()) {
                        hashSet2.add(hVar4);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    db.h hVar5 = (db.h) hashSet2.iterator().next();
                    hashSet2.remove(hVar5);
                    i10++;
                    Iterator it5 = hVar5.f16953b.iterator();
                    while (it5.hasNext()) {
                        db.h hVar6 = (db.h) it5.next();
                        hVar6.f16954c.remove(hVar5);
                        if (hVar6.f16954c.isEmpty()) {
                            hashSet2.add(hVar6);
                        }
                    }
                }
                if (i10 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    db.h hVar7 = (db.h) it6.next();
                    if (!hVar7.f16954c.isEmpty() && !hVar7.f16953b.isEmpty()) {
                        arrayList2.add(hVar7.a);
                    }
                }
                throw new db.k(arrayList2);
            }
        }
    }

    public static boolean g(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            if ((ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return true;
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return g(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return true;
            }
            return false;
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        if (typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName())) {
            return true;
        }
        return false;
    }

    public static String h(androidx.datastore.preferences.protobuf.k kVar) {
        kc.c cVar = new kc.c(kVar, 9);
        StringBuilder sb2 = new StringBuilder(((androidx.datastore.preferences.protobuf.k) cVar.f20640c).size());
        for (int i10 = 0; i10 < ((androidx.datastore.preferences.protobuf.k) cVar.f20640c).size(); i10++) {
            byte a10 = ((androidx.datastore.preferences.protobuf.k) cVar.f20640c).a(i10);
            if (a10 != 34) {
                if (a10 != 39) {
                    if (a10 != 92) {
                        switch (a10) {
                            case 7:
                                sb2.append("\\a");
                                break;
                            case 8:
                                sb2.append("\\b");
                                break;
                            case 9:
                                sb2.append("\\t");
                                break;
                            case 10:
                                sb2.append("\\n");
                                break;
                            case 11:
                                sb2.append("\\v");
                                break;
                            case 12:
                                sb2.append("\\f");
                                break;
                            case 13:
                                sb2.append("\\r");
                                break;
                            default:
                                if (a10 >= 32 && a10 <= 126) {
                                    sb2.append((char) a10);
                                    break;
                                } else {
                                    sb2.append(AbstractJsonLexerKt.STRING_ESC);
                                    sb2.append((char) (((a10 >>> 6) & 3) + 48));
                                    sb2.append((char) (((a10 >>> 3) & 7) + 48));
                                    sb2.append((char) ((a10 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb2.append("\\\\");
                    }
                } else {
                    sb2.append("\\'");
                }
            } else {
                sb2.append("\\\"");
            }
        }
        return sb2.toString();
    }

    public static int i(float[] fArr, int[] iArr, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < 6; i11++) {
            int ceil = (int) Math.ceil(fArr[i11]);
            iArr[i11] = ceil;
            if (i10 > ceil) {
                Arrays.fill(bArr, (byte) 0);
                i10 = ceil;
            }
            if (i10 == ceil) {
                bArr[i11] = (byte) (bArr[i11] + 1);
            }
        }
        return i10;
    }

    public static db.a j(String str, n0.h hVar) {
        h1 b3 = db.a.b(kc.a.class);
        b3.f24387c = 1;
        b3.a(db.j.b(Context.class));
        b3.f24390f = new kc.d(str, hVar, 0);
        return b3.b();
    }

    public static Type k(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i10 = 0; i10 < length; i10++) {
                Class<?> cls3 = interfaces[i10];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i10];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return k(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return k(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static final File l() {
        File file = new File(x.a().getCacheDir(), "instrument");
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        return file;
    }

    public static Type m(int i10, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i10 >= 0 && i10 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i10];
            if (type instanceof WildcardType) {
                return ((WildcardType) type).getUpperBounds()[0];
            }
            return type;
        }
        StringBuilder m10 = a4.j.m("Index ", i10, " not in range [0,");
        m10.append(actualTypeArguments.length);
        m10.append(") for ");
        m10.append(parameterizedType);
        throw new IllegalArgumentException(m10.toString());
    }

    public static SharedPreferences n(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static Class o(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) o(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return o(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    public static Type p(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return H(type, cls, k(type, cls, Map.class));
        }
        throw new IllegalArgumentException();
    }

    public static boolean q(Type type) {
        String name;
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (q(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return q(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        if (type == null) {
            name = AbstractJsonLexerKt.NULL;
        } else {
            name = type.getClass().getName();
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
    }

    public static void r(char c10) {
        String hexString = Integer.toHexString(c10);
        throw new IllegalArgumentException("Illegal character: " + c10 + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    public static int s(float f10) {
        if (f10 < 1.0f) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        if (f10 > 99.0f) {
            return -1;
        }
        float f11 = (f10 + 16.0f) / 116.0f;
        float f12 = (f10 > 8.0f ? 1 : (f10 == 8.0f ? 0 : -1)) > 0 ? f11 * f11 * f11 : f10 / 903.2963f;
        float f13 = f11 * f11 * f11;
        boolean z10 = f13 > 0.008856452f;
        float f14 = z10 ? f13 : ((f11 * 116.0f) - 16.0f) / 903.2963f;
        if (!z10) {
            f13 = ((f11 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f10938c;
        return g0.d.a(f14 * fArr[0], f12 * fArr[1], f13 * fArr[2]);
    }

    public static boolean t(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static boolean u(char c10) {
        return c10 >= 128 && c10 <= 255;
    }

    public static final boolean v(StackTraceElement element) {
        boolean startsWith$default;
        boolean startsWith$default2;
        Intrinsics.checkNotNullParameter(element, "element");
        String className = element.getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "element.className");
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(className, "com.facebook", false, 2, null);
        if (!startsWith$default) {
            String className2 = element.getClassName();
            Intrinsics.checkNotNullExpressionValue(className2, "element.className");
            startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(className2, "com.meta", false, 2, null);
            if (!startsWith$default2) {
                return false;
            }
        }
        return true;
    }

    public static boolean w(char c10) {
        return (c10 == '\r' || c10 == '*' || c10 == '>') || c10 == ' ' || (c10 >= '0' && c10 <= '9') || (c10 >= 'A' && c10 <= 'Z');
    }

    public static boolean x(byte b3) {
        return b3 > -65;
    }

    public static final boolean y(Thread thread) {
        boolean startsWith$default;
        boolean startsWith$default2;
        boolean startsWith$default3;
        boolean startsWith$default4;
        boolean startsWith$default5;
        StackTraceElement[] stackTrace = thread.getStackTrace();
        if (stackTrace != null) {
            for (StackTraceElement element : stackTrace) {
                Intrinsics.checkNotNullExpressionValue(element, "element");
                if (v(element)) {
                    String className = element.getClassName();
                    Intrinsics.checkNotNullExpressionValue(className, "element.className");
                    startsWith$default = StringsKt__StringsJVMKt.startsWith$default(className, "com.facebook.appevents.codeless", false, 2, null);
                    if (!startsWith$default) {
                        String className2 = element.getClassName();
                        Intrinsics.checkNotNullExpressionValue(className2, "element.className");
                        startsWith$default5 = StringsKt__StringsJVMKt.startsWith$default(className2, "com.facebook.appevents.suggestedevents", false, 2, null);
                        if (!startsWith$default5) {
                            return true;
                        }
                    }
                    String methodName = element.getMethodName();
                    Intrinsics.checkNotNullExpressionValue(methodName, "element.methodName");
                    startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(methodName, "onClick", false, 2, null);
                    if (startsWith$default2) {
                        continue;
                    } else {
                        String methodName2 = element.getMethodName();
                        Intrinsics.checkNotNullExpressionValue(methodName2, "element.methodName");
                        startsWith$default3 = StringsKt__StringsJVMKt.startsWith$default(methodName2, "onItemClick", false, 2, null);
                        if (startsWith$default3) {
                            continue;
                        } else {
                            String methodName3 = element.getMethodName();
                            Intrinsics.checkNotNullExpressionValue(methodName3, "element.methodName");
                            startsWith$default4 = StringsKt__StringsJVMKt.startsWith$default(methodName3, "onTouch", false, 2, null);
                            if (!startsWith$default4) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static float z(int i10) {
        float f10 = i10 / 255.0f;
        return (f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }
}
