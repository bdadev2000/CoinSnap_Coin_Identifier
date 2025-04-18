package com.facebook;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i10) {
        this.a = i10;
    }

    public static g0 A(a aVar, String str, JSONObject jSONObject, b0 b0Var) {
        g0 g0Var = new g0(aVar, str, null, l0.POST, b0Var);
        g0Var.f11005c = jSONObject;
        return g0Var;
    }

    public static g0 B(String str, Bundle bundle, com.facebook.login.e eVar) {
        return new g0(null, str, bundle, l0.POST, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void C(org.json.JSONObject r7, java.lang.String r8, com.facebook.c0 r9) {
        /*
            java.util.regex.Pattern r0 = com.facebook.g0.f11002l
            java.util.regex.Matcher r0 = r0.matcher(r8)
            boolean r1 = r0.matches()
            r2 = 1
            if (r1 == 0) goto L17
            java.lang.String r0 = r0.group(r2)
            java.lang.String r1 = "matcher.group(1)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            goto L18
        L17:
            r0 = r8
        L18:
            java.lang.String r1 = "me/"
            boolean r1 = kotlin.text.StringsKt.z(r0, r1)
            r3 = 0
            if (r1 != 0) goto L2c
            java.lang.String r1 = "/me/"
            boolean r0 = kotlin.text.StringsKt.z(r0, r1)
            if (r0 == 0) goto L2a
            goto L2c
        L2a:
            r0 = r3
            goto L2d
        L2c:
            r0 = r2
        L2d:
            if (r0 == 0) goto L46
            java.lang.String r0 = ":"
            r1 = 6
            int r0 = kotlin.text.StringsKt.k(r8, r0, r3, r1)
            java.lang.String r4 = "?"
            int r8 = kotlin.text.StringsKt.k(r8, r4, r3, r1)
            r1 = 3
            if (r0 <= r1) goto L46
            r1 = -1
            if (r8 == r1) goto L44
            if (r0 >= r8) goto L46
        L44:
            r8 = r2
            goto L47
        L46:
            r8 = r3
        L47:
            java.util.Iterator r0 = r7.keys()
        L4b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L76
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r4 = r7.opt(r1)
            if (r8 == 0) goto L67
            java.lang.String r5 = "image"
            boolean r5 = kotlin.text.StringsKt.i(r1, r5)
            if (r5 == 0) goto L67
            r5 = r2
            goto L68
        L67:
            r5 = r3
        L68:
            java.lang.String r6 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)
            java.lang.String r6 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r6)
            D(r1, r4, r9, r5)
            goto L4b
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.c.C(org.json.JSONObject, java.lang.String, com.facebook.c0):void");
    }

    public static void D(String str, Object obj, c0 c0Var, boolean z10) {
        Class<?> cls = obj.getClass();
        if (JSONObject.class.isAssignableFrom(cls)) {
            JSONObject jSONObject = (JSONObject) obj;
            if (z10) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String h10 = com.applovin.impl.mediation.ads.e.h(new Object[]{str, next}, 2, "%s[%s]", "java.lang.String.format(format, *args)");
                    Object opt = jSONObject.opt(next);
                    Intrinsics.checkNotNullExpressionValue(opt, "jsonObject.opt(propertyName)");
                    D(h10, opt, c0Var, z10);
                }
                return;
            }
            if (jSONObject.has("id")) {
                String optString = jSONObject.optString("id");
                Intrinsics.checkNotNullExpressionValue(optString, "jsonObject.optString(\"id\")");
                D(str, optString, c0Var, z10);
                return;
            } else if (jSONObject.has("url")) {
                String optString2 = jSONObject.optString("url");
                Intrinsics.checkNotNullExpressionValue(optString2, "jsonObject.optString(\"url\")");
                D(str, optString2, c0Var, z10);
                return;
            } else {
                if (jSONObject.has("fbsdk:create_object")) {
                    String jSONObject2 = jSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(jSONObject2, "jsonObject.toString()");
                    D(str, jSONObject2, c0Var, z10);
                    return;
                }
                return;
            }
        }
        if (JSONArray.class.isAssignableFrom(cls)) {
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    String format = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i10)}, 2));
                    Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                    Object opt2 = jSONArray.opt(i10);
                    Intrinsics.checkNotNullExpressionValue(opt2, "jsonArray.opt(i)");
                    D(format, opt2, c0Var, z10);
                    if (i11 < length) {
                        i10 = i11;
                    } else {
                        return;
                    }
                }
            }
        } else {
            if (!String.class.isAssignableFrom(cls) && !Number.class.isAssignableFrom(cls) && !Boolean.class.isAssignableFrom(cls)) {
                if (Date.class.isAssignableFrom(cls)) {
                    String format2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                    Intrinsics.checkNotNullExpressionValue(format2, "iso8601DateFormat.format(date)");
                    c0Var.a(str, format2);
                    return;
                } else {
                    String str2 = g0.f11000j;
                    x xVar = x.a;
                    return;
                }
            }
            c0Var.a(str, obj.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void E(java.lang.String r6, java.lang.String r7, float[] r8) {
        /*
            g6.d r0 = g6.d.a
            java.lang.Class<g6.d> r0 = g6.d.class
            boolean r1 = m6.a.b(r0)
            java.lang.String r2 = "event"
            r3 = 0
            if (r1 == 0) goto Le
            goto L1c
        Le:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)     // Catch: java.lang.Throwable -> L18
            java.util.LinkedHashSet r1 = g6.d.f18216c     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.contains(r6)     // Catch: java.lang.Throwable -> L18
            goto L1d
        L18:
            r1 = move-exception
            m6.a.a(r0, r1)
        L1c:
            r1 = r3
        L1d:
            if (r1 == 0) goto L51
            com.facebook.appevents.r r8 = new com.facebook.appevents.r
            android.content.Context r0 = com.facebook.x.a()
            r8.<init>(r0)
            com.facebook.appevents.l r8 = r8.a
            r8.getClass()
            boolean r0 = m6.a.b(r8)
            if (r0 == 0) goto L35
            goto Ld4
        L35:
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L4b
            r0.<init>()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r1 = "_is_suggested_event"
            java.lang.String r2 = "1"
            r0.putString(r1, r2)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r1 = "_button_text"
            r0.putString(r1, r7)     // Catch: java.lang.Throwable -> L4b
            r8.d(r0, r6)     // Catch: java.lang.Throwable -> L4b
            goto Ld4
        L4b:
            r6 = move-exception
            m6.a.a(r8, r6)
            goto Ld4
        L51:
            g6.d r1 = g6.d.a
            boolean r1 = m6.a.b(r0)
            if (r1 == 0) goto L5a
            goto L68
        L5a:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)     // Catch: java.lang.Throwable -> L64
            java.util.LinkedHashSet r1 = g6.d.f18217d     // Catch: java.lang.Throwable -> L64
            boolean r0 = r1.contains(r6)     // Catch: java.lang.Throwable -> L64
            goto L69
        L64:
            r1 = move-exception
            m6.a.a(r0, r1)
        L68:
            r0 = r3
        L69:
            if (r0 == 0) goto Ld4
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "event_name"
            r0.putString(r1, r6)     // Catch: org.json.JSONException -> Ld4
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> Ld4
            r6.<init>()     // Catch: org.json.JSONException -> Ld4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> Ld4
            r1.<init>()     // Catch: org.json.JSONException -> Ld4
            int r2 = r8.length     // Catch: org.json.JSONException -> Ld4
            r4 = r3
        L81:
            if (r4 >= r2) goto L90
            r5 = r8[r4]     // Catch: org.json.JSONException -> Ld4
            int r4 = r4 + 1
            r1.append(r5)     // Catch: org.json.JSONException -> Ld4
            java.lang.String r5 = ","
            r1.append(r5)     // Catch: org.json.JSONException -> Ld4
            goto L81
        L90:
            java.lang.String r8 = "dense"
            java.lang.String r1 = r1.toString()     // Catch: org.json.JSONException -> Ld4
            r6.put(r8, r1)     // Catch: org.json.JSONException -> Ld4
            java.lang.String r8 = "button_text"
            r6.put(r8, r7)     // Catch: org.json.JSONException -> Ld4
            java.lang.String r7 = "metadata"
            java.lang.String r6 = r6.toString()     // Catch: org.json.JSONException -> Ld4
            r0.putString(r7, r6)     // Catch: org.json.JSONException -> Ld4
            java.lang.String r6 = com.facebook.g0.f11000j     // Catch: org.json.JSONException -> Ld4
            kotlin.jvm.internal.StringCompanionObject r6 = kotlin.jvm.internal.StringCompanionObject.INSTANCE     // Catch: org.json.JSONException -> Ld4
            java.util.Locale r6 = java.util.Locale.US     // Catch: org.json.JSONException -> Ld4
            java.lang.String r7 = "%s/suggested_events"
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch: org.json.JSONException -> Ld4
            java.lang.String r2 = com.facebook.x.b()     // Catch: org.json.JSONException -> Ld4
            r1[r3] = r2     // Catch: org.json.JSONException -> Ld4
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r1, r8)     // Catch: org.json.JSONException -> Ld4
            java.lang.String r6 = java.lang.String.format(r6, r7, r8)     // Catch: org.json.JSONException -> Ld4
            java.lang.String r7 = "java.lang.String.format(locale, format, *args)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)     // Catch: org.json.JSONException -> Ld4
            r7 = 0
            com.facebook.g0 r6 = A(r7, r6, r7, r7)     // Catch: org.json.JSONException -> Ld4
            java.lang.String r7 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r7)     // Catch: org.json.JSONException -> Ld4
            r6.f11006d = r0     // Catch: org.json.JSONException -> Ld4
            r6.c()     // Catch: org.json.JSONException -> Ld4
        Ld4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.c.E(java.lang.String, java.lang.String, float[]):void");
    }

    public static void F(j0 requests, ArrayList responses) {
        Boolean valueOf;
        Intrinsics.checkNotNullParameter(requests, "requests");
        Intrinsics.checkNotNullParameter(responses, "responses");
        int size = requests.size();
        ArrayList arrayList = new ArrayList();
        if (size > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                g0 g0Var = (g0) requests.f11154d.get(i10);
                if (g0Var.f11009g != null) {
                    arrayList.add(new Pair(g0Var.f11009g, responses.get(i10)));
                }
                if (i11 >= size) {
                    break;
                } else {
                    i10 = i11;
                }
            }
        }
        if (arrayList.size() > 0) {
            h.o0 o0Var = new h.o0(29, arrayList, requests);
            Handler handler = requests.f11152b;
            if (handler == null) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(handler.post(o0Var));
            }
            if (valueOf == null) {
                o0Var.run();
            }
        }
    }

    public static void G(HashMap hashMap, e0 e0Var) {
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = g0.f11000j;
            if (w(((a0) entry.getValue()).f10894b)) {
                e0Var.g((String) entry.getKey(), ((a0) entry.getValue()).f10894b, ((a0) entry.getValue()).a);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0376  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void H(com.facebook.j0 r23, java.net.HttpURLConnection r24) {
        /*
            Method dump skipped, instructions count: 890
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.c.H(com.facebook.j0, java.net.HttpURLConnection):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x010d, code lost:
    
        r14 = "com.facebook.appevents.UserDataStore.internalUserData";
        r0 = com.facebook.internal.m0.D(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0117, code lost:
    
        if (m6.a.b(r2) == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x011a, code lost:
    
        com.facebook.x.c().execute(new com.facebook.appevents.v(r14, r0, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0127, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0128, code lost:
    
        m6.a.a(r2, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void I(java.util.HashMap r14) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.c.I(java.util.HashMap):void");
    }

    public static HttpURLConnection J(j0 requests) {
        URL url;
        Intrinsics.checkNotNullParameter(requests, "requests");
        Intrinsics.checkNotNullParameter(requests, "requests");
        Iterator<E> it = requests.iterator();
        while (it.hasNext()) {
            g0 g0Var = (g0) it.next();
            if (l0.GET == g0Var.f11010h && com.facebook.internal.m0.z(g0Var.f11006d.getString("fields"))) {
                com.facebook.internal.m mVar = com.facebook.internal.d0.f11030d;
                m0 m0Var = m0.DEVELOPER_ERRORS;
                StringBuilder sb2 = new StringBuilder("GET requests for /");
                String str = g0Var.f11004b;
                if (str == null) {
                    str = "";
                }
                sb2.append(str);
                sb2.append(" should contain an explicit \"fields\" parameter.");
                com.facebook.internal.m.p(m0Var, "Request", sb2.toString());
            }
        }
        try {
            if (requests.size() == 1) {
                url = new URL(((g0) requests.f11154d.get(0)).g());
            } else {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format("https://graph.%s", Arrays.copyOf(new Object[]{x.e()}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                url = new URL(format);
            }
            HttpURLConnection httpURLConnection = null;
            try {
                httpURLConnection = h(url);
                H(requests, httpURLConnection);
                return httpURLConnection;
            } catch (IOException e2) {
                com.facebook.internal.m0.j(httpURLConnection);
                throw new q("could not construct request body", e2);
            } catch (JSONException e10) {
                com.facebook.internal.m0.j(httpURLConnection);
                throw new q("could not construct request body", e10);
            }
        } catch (MalformedURLException e11) {
            throw new q("could not construct URL for request", e11);
        }
    }

    public static final int a(int[] iArr) {
        boolean z10;
        int i10 = d6.a.f16856d;
        int i11 = 1;
        if (iArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            int i12 = iArr[0];
            int lastIndex = ArraysKt.getLastIndex(iArr);
            if (1 <= lastIndex) {
                while (true) {
                    i12 *= iArr[i11];
                    if (i11 == lastIndex) {
                        break;
                    }
                    i11++;
                }
            }
            return i12;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final String b(Object obj) {
        String str = g0.f11000j;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof Boolean) && !(obj instanceof Number)) {
            if (obj instanceof Date) {
                String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                Intrinsics.checkNotNullExpressionValue(format, "iso8601DateFormat.format(value)");
                return format;
            }
            throw new IllegalArgumentException("Unsupported parameter type.");
        }
        return obj.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0028 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean c(java.lang.String r3, java.lang.String r4) {
        /*
            java.util.HashSet r0 = g6.f.f18223g
            g6.b r0 = g6.b.a
            java.lang.Class<g6.b> r0 = g6.b.class
            boolean r1 = m6.a.b(r0)
            if (r1 == 0) goto Ld
            goto L25
        Ld:
            java.lang.String r1 = "pathID"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)     // Catch: java.lang.Throwable -> L21
            java.util.LinkedHashMap r1 = g6.b.f18211b     // Catch: java.lang.Throwable -> L21
            boolean r2 = r1.containsKey(r3)     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L25
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L21
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L21
            goto L26
        L21:
            r3 = move-exception
            m6.a.a(r0, r3)
        L25:
            r3 = 0
        L26:
            if (r3 != 0) goto L2a
            r3 = 0
            goto L40
        L2a:
            java.lang.String r0 = "other"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
            r1 = 1
            if (r0 != 0) goto L3f
            com.facebook.appevents.v r0 = new com.facebook.appevents.v
            r0.<init>(r3, r4, r1)
            java.util.concurrent.Executor r3 = com.facebook.x.c()     // Catch: java.lang.Exception -> L3f
            r3.execute(r0)     // Catch: java.lang.Exception -> L3f
        L3f:
            r3 = r1
        L40:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.c.c(java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(android.view.View r6, android.view.View r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "hostView"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "rootView"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "activityName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            int r0 = r6.hashCode()
            java.util.HashSet r1 = g6.f.f18223g
            java.lang.Class<g6.f> r1 = g6.f.class
            boolean r2 = m6.a.b(r1)
            r3 = 0
            if (r2 == 0) goto L20
        L1e:
            r2 = r3
            goto L28
        L20:
            java.util.HashSet r2 = g6.f.f18223g     // Catch: java.lang.Throwable -> L23
            goto L28
        L23:
            r2 = move-exception
            m6.a.a(r1, r2)
            goto L1e
        L28:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            boolean r2 = r2.contains(r4)
            if (r2 != 0) goto L9e
            y5.g r2 = y5.g.a
            g6.f r2 = new g6.f
            r2.<init>(r6, r7, r8)
            java.lang.Class<y5.g> r7 = y5.g.class
            boolean r8 = m6.a.b(r7)
            if (r8 == 0) goto L42
            goto L89
        L42:
            java.lang.String r8 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r8)     // Catch: java.lang.Throwable -> L85
            java.lang.String r8 = "android.view.View"
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.Throwable -> L60 java.lang.Throwable -> L85 java.lang.Exception -> L89
            java.lang.String r4 = "mListenerInfo"
            java.lang.reflect.Field r8 = r8.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L60 java.lang.Throwable -> L85 java.lang.Exception -> L89
            java.lang.String r4 = "android.view.View$ListenerInfo"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Throwable -> L61 java.lang.Throwable -> L85 java.lang.Exception -> L89
            java.lang.String r5 = "mOnClickListener"
            java.lang.reflect.Field r4 = r4.getDeclaredField(r5)     // Catch: java.lang.Throwable -> L61 java.lang.Throwable -> L85 java.lang.Exception -> L89
            goto L62
        L60:
            r8 = r3
        L61:
            r4 = r3
        L62:
            if (r8 == 0) goto L81
            if (r4 != 0) goto L67
            goto L81
        L67:
            r5 = 1
            r8.setAccessible(r5)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L89
            r4.setAccessible(r5)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L89
            r8.setAccessible(r5)     // Catch: java.lang.IllegalAccessException -> L76 java.lang.Throwable -> L85 java.lang.Exception -> L89
            java.lang.Object r8 = r8.get(r6)     // Catch: java.lang.IllegalAccessException -> L76 java.lang.Throwable -> L85 java.lang.Exception -> L89
            goto L77
        L76:
            r8 = r3
        L77:
            if (r8 != 0) goto L7d
            r6.setOnClickListener(r2)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L89
            goto L89
        L7d:
            r4.set(r8, r2)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L89
            goto L89
        L81:
            r6.setOnClickListener(r2)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L89
            goto L89
        L85:
            r6 = move-exception
            m6.a.a(r7, r6)
        L89:
            boolean r6 = m6.a.b(r1)
            if (r6 == 0) goto L90
            goto L97
        L90:
            java.util.HashSet r3 = g6.f.f18223g     // Catch: java.lang.Throwable -> L93
            goto L97
        L93:
            r6 = move-exception
            m6.a.a(r1, r6)
        L97:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r3.add(r6)
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.c.d(android.view.View, android.view.View, java.lang.String):void");
    }

    public static d6.e e(JSONObject jSONObject) {
        String useCase;
        String assetUri;
        String optString;
        int i10;
        float[] fArr;
        if (jSONObject != null) {
            try {
                useCase = jSONObject.getString("use_case");
                assetUri = jSONObject.getString("asset_uri");
                optString = jSONObject.optString("rules_uri", null);
                i10 = jSONObject.getInt("version_id");
                d6.f fVar = d6.f.a;
                JSONArray jSONArray = jSONObject.getJSONArray("thresholds");
                if (!m6.a.b(d6.f.class)) {
                    try {
                    } catch (Throwable th2) {
                        m6.a.a(d6.f.class, th2);
                    }
                    if (!m6.a.b(fVar) && jSONArray != null) {
                        try {
                            fArr = new float[jSONArray.length()];
                            int length = jSONArray.length();
                            if (length > 0) {
                                int i11 = 0;
                                while (true) {
                                    int i12 = i11 + 1;
                                    try {
                                        String string = jSONArray.getString(i11);
                                        Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                                        fArr[i11] = Float.parseFloat(string);
                                    } catch (JSONException unused) {
                                    }
                                    if (i12 >= length) {
                                        break;
                                    }
                                    i11 = i12;
                                }
                            }
                        } catch (Throwable th3) {
                            m6.a.a(fVar, th3);
                        }
                        Intrinsics.checkNotNullExpressionValue(useCase, "useCase");
                        Intrinsics.checkNotNullExpressionValue(assetUri, "assetUri");
                    }
                }
                fArr = null;
                Intrinsics.checkNotNullExpressionValue(useCase, "useCase");
                Intrinsics.checkNotNullExpressionValue(assetUri, "assetUri");
            } catch (Exception unused2) {
                return null;
            }
        }
        return new d6.e(useCase, assetUri, optString, i10, fArr);
    }

    public static ArrayList f(List requests, HttpURLConnection httpURLConnection, q qVar) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(requests, "requests");
        List list = requests;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new k0((g0) it.next(), httpURLConnection, new u(qVar)));
        }
        return arrayList;
    }

    public static void g(JSONObject jSONObject) {
        boolean z10;
        List split$default;
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            JSONObject optJSONObject = jSONObject.optJSONObject(key);
            if (optJSONObject != null) {
                String k10 = optJSONObject.optString(CampaignEx.JSON_KEY_AD_K);
                String v10 = optJSONObject.optString("v");
                Intrinsics.checkNotNullExpressionValue(k10, "k");
                if (k10.length() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    CopyOnWriteArraySet a = v5.c.a();
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    split$default = StringsKt__StringsKt.split$default(k10, new String[]{","}, false, 0, 6, (Object) null);
                    Intrinsics.checkNotNullExpressionValue(v10, "v");
                    a.add(new v5.c(key, split$default, v10));
                }
            }
        }
    }

    public static HttpURLConnection h(URL url) {
        URLConnection openConnection = url.openConnection();
        if (openConnection != null) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            if (g0.f11003m == null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                g0.f11003m = com.applovin.impl.mediation.ads.e.h(new Object[]{"FBAndroidSDK", "16.1.3"}, 2, "%s.%s", "java.lang.String.format(format, *args)");
                if (!com.facebook.internal.m0.z(null)) {
                    String format = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[]{g0.f11003m, null}, 2));
                    Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                    g0.f11003m = format;
                }
            }
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, g0.f11003m);
            httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
            httpURLConnection.setChunkedStreamingMode(0);
            return httpURLConnection;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void i(android.content.Context r26) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.c.i(android.content.Context):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00e6 A[Catch: JSONException -> 0x0126, TryCatch #0 {JSONException -> 0x0126, blocks: (B:5:0x001f, B:7:0x0025, B:9:0x002f, B:11:0x0033, B:14:0x003f, B:31:0x00e6, B:66:0x0083, B:67:0x0079, B:68:0x006f, B:69:0x0067, B:70:0x0060, B:71:0x0056, B:72:0x004c, B:73:0x008a, B:76:0x0097, B:78:0x00a0, B:82:0x00b7, B:83:0x00f3, B:88:0x0102, B:90:0x0114, B:91:0x011a), top: B:4:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.k0 j(com.facebook.g0 r23, java.net.HttpURLConnection r24, java.lang.Object r25, java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.c.j(com.facebook.g0, java.net.HttpURLConnection, java.lang.Object, java.lang.Object):com.facebook.k0");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList k(java.io.InputStream r13, java.net.HttpURLConnection r14, com.facebook.j0 r15) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.c.k(java.io.InputStream, java.net.HttpURLConnection, com.facebook.j0):java.util.ArrayList");
    }

    public static void l(String str, String str2, c6.h hVar) {
        File file = new File(d6.h.b(), str2);
        if (str != null && !file.exists()) {
            new c6.i(str, file, hVar).execute(new String[0]);
        } else {
            hVar.a(file);
        }
    }

    public static void m(d6.e master, ArrayList slaves) {
        File[] listFiles;
        boolean z10;
        boolean startsWith$default;
        boolean startsWith$default2;
        Intrinsics.checkNotNullParameter(master, "master");
        Intrinsics.checkNotNullParameter(slaves, "slaves");
        File b3 = d6.h.b();
        String str = master.a;
        int i10 = master.f16877d;
        if (b3 != null && (listFiles = b3.listFiles()) != null) {
            int i11 = 0;
            if (listFiles.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                String str2 = str + '_' + i10;
                int length = listFiles.length;
                while (i11 < length) {
                    File file = listFiles[i11];
                    i11++;
                    String name = file.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "name");
                    startsWith$default = StringsKt__StringsJVMKt.startsWith$default(name, str, false, 2, null);
                    if (startsWith$default) {
                        startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(name, str2, false, 2, null);
                        if (!startsWith$default2) {
                            file.delete();
                        }
                    }
                }
            }
        }
        l(master.f16875b, str + '_' + i10, new d6.d(slaves));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0095 A[Catch: all -> 0x00e6, TryCatch #3 {all -> 0x00e6, blocks: (B:7:0x0017, B:52:0x012a, B:53:0x012d, B:17:0x0085, B:19:0x0095, B:28:0x00d4, B:30:0x00e2, B:31:0x00e8, B:32:0x00a3, B:34:0x00b2, B:36:0x00c1, B:39:0x00fc, B:40:0x0127, B:59:0x012e), top: B:5:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d4 A[Catch: all -> 0x00e6, TryCatch #3 {all -> 0x00e6, blocks: (B:7:0x0017, B:52:0x012a, B:53:0x012d, B:17:0x0085, B:19:0x0095, B:28:0x00d4, B:30:0x00e2, B:31:0x00e8, B:32:0x00a3, B:34:0x00b2, B:36:0x00c1, B:39:0x00fc, B:40:0x0127, B:59:0x012e), top: B:5:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fc A[Catch: all -> 0x00e6, TryCatch #3 {all -> 0x00e6, blocks: (B:7:0x0017, B:52:0x012a, B:53:0x012d, B:17:0x0085, B:19:0x0095, B:28:0x00d4, B:30:0x00e2, B:31:0x00e8, B:32:0x00a3, B:34:0x00b2, B:36:0x00c1, B:39:0x00fc, B:40:0x0127, B:59:0x012e), top: B:5:0x0015 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList n(com.facebook.j0 r12) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.c.n(com.facebook.j0):java.util.ArrayList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d4, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.getClass().getSimpleName(), (java.lang.String) r11.get(r11.size() - 1)) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e4, code lost:
    
        if (r1.f27921c != r8.getId()) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0104, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6, r5) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0132, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7, r6) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0151, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7, r6) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x017b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1, r11) == false) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0182 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList o(android.view.View r8, java.util.List r9, int r10, int r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.c.o(android.view.View, java.util.List, int, int, java.lang.String):java.util.ArrayList");
    }

    public static ArrayList p(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        int childCount = viewGroup.getChildCount();
        if (childCount > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                View child = viewGroup.getChildAt(i10);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    arrayList.add(child);
                }
                if (i11 >= childCount) {
                    break;
                }
                i10 = i11;
            }
        }
        return arrayList;
    }

    public static String q(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = com.facebook.appevents.l.f10951c;
        Intrinsics.checkNotNullParameter(context, "context");
        if (com.facebook.appevents.l.a() == null) {
            synchronized (com.facebook.appevents.l.c()) {
                if (com.facebook.appevents.l.a() == null) {
                    String string = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
                    if (!m6.a.b(com.facebook.appevents.l.class)) {
                        try {
                            com.facebook.appevents.l.f10954f = string;
                        } catch (Throwable th2) {
                            m6.a.a(com.facebook.appevents.l.class, th2);
                        }
                    }
                    if (com.facebook.appevents.l.a() == null) {
                        UUID randomUUID = UUID.randomUUID();
                        Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
                        String stringPlus = Intrinsics.stringPlus("XZ", randomUUID);
                        if (!m6.a.b(com.facebook.appevents.l.class)) {
                            try {
                                com.facebook.appevents.l.f10954f = stringPlus;
                            } catch (Throwable th3) {
                                m6.a.a(com.facebook.appevents.l.class, th3);
                            }
                        }
                        context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", com.facebook.appevents.l.a()).apply();
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        String a = com.facebook.appevents.l.a();
        if (a != null) {
            return a;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public static ConcurrentHashMap t() {
        c cVar = a6.f.f255s;
        if (!m6.a.b(a6.f.class)) {
            try {
                return a6.f.f258w;
            } catch (Throwable th2) {
                m6.a.a(a6.f.class, th2);
            }
        }
        return null;
    }

    public static Uri u(Bundle bundle, String action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return com.facebook.internal.m0.b(bundle, w5.d.c(), x.d() + "/dialog/" + action);
    }

    public static AtomicBoolean v() {
        c cVar = a6.f.f255s;
        if (!m6.a.b(a6.f.class)) {
            try {
                return a6.f.f257v;
            } catch (Throwable th2) {
                m6.a.a(a6.f.class, th2);
            }
        }
        return null;
    }

    public static boolean w(Object obj) {
        if (!(obj instanceof Bitmap) && !(obj instanceof byte[]) && !(obj instanceof Uri) && !(obj instanceof ParcelFileDescriptor) && !(obj instanceof d0)) {
            return false;
        }
        return true;
    }

    public static boolean x(Object obj) {
        return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
    }

    public static g0 y(a aVar, String str, b0 b0Var) {
        return new g0(aVar, str, null, null, b0Var);
    }

    public static com.facebook.appevents.k z(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new com.facebook.appevents.k(context);
    }

    public final com.facebook.appevents.j r() {
        switch (this.a) {
            case 14:
                String str = com.facebook.appevents.l.f10951c;
                return b.z();
            default:
                String str2 = com.facebook.appevents.l.f10951c;
                return b.z();
        }
    }

    public final synchronized p0 s() {
        p0 p0Var;
        try {
            if (p0.f11357e == null) {
                m1.b a = m1.b.a(x.a());
                Intrinsics.checkNotNullExpressionValue(a, "getInstance(applicationContext)");
                p0.f11357e = new p0(a, new o0());
            }
            p0Var = p0.f11357e;
            if (p0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("instance");
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return p0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, int i11) {
        this(29);
        this.a = i10;
        switch (i10) {
            case 2:
                this(2);
                return;
            case 3:
                this(3);
                return;
            case 4:
                this(4);
                return;
            case 5:
                this(5);
                return;
            case 6:
                this(6);
                return;
            case 7:
                this(7);
                return;
            case 8:
                this(8);
                return;
            case 9:
                this(9);
                return;
            case 10:
                this(10);
                return;
            case 11:
                this(11);
                return;
            case 12:
                this(12);
                return;
            case 13:
                this(13);
                return;
            case 14:
                this(14);
                return;
            case 15:
                this(15);
                return;
            case 16:
                this(16);
                return;
            case 17:
                this(17);
                return;
            case 18:
                this(18);
                return;
            case 19:
                this(19);
                return;
            case 20:
                this(20);
                return;
            case 21:
                this(21);
                return;
            case 22:
                this(22);
                return;
            case 23:
                this(23);
                return;
            case 24:
                this(24);
                return;
            case 25:
                this(25);
                return;
            case 26:
                this(26);
                return;
            case 27:
                this(27);
                return;
            case 28:
                this(28);
                return;
            case NOTIFICATION_REDIRECT_VALUE:
                return;
            default:
                this(1);
                return;
        }
    }
}
