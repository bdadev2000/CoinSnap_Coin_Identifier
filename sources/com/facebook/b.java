package com.facebook;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import com.adjust.sdk.Constants;
import com.android.installreferrer.api.InstallReferrerClient;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b implements n.a, x4.a, i4.a, j4.d, k4.z, e4.c, k4.o, n4.o, n4.d0, e4.p, com.bumptech.glide.manager.g, com.bumptech.glide.manager.f, x4.c, r5.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10983b;

    public /* synthetic */ b(int i10) {
        this.f10983b = i10;
    }

    public static String A() {
        g6.a callback = new g6.a();
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!x.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false)) {
            InstallReferrerClient build = InstallReferrerClient.newBuilder(x.a()).build();
            try {
                build.startConnection(new com.facebook.internal.c0(build, callback));
            } catch (Exception unused) {
            }
        }
        return x.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString(Constants.INSTALL_REFERRER, null);
    }

    public static void D(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (com.facebook.internal.d.a() != null) {
            com.facebook.internal.d.a();
            return;
        }
        com.facebook.internal.d dVar = new com.facebook.internal.d(context);
        if (!m6.a.b(com.facebook.internal.d.class)) {
            try {
                if (!m6.a.b(dVar)) {
                    try {
                        m1.b a = m1.b.a(dVar.a);
                        Intrinsics.checkNotNullExpressionValue(a, "getInstance(applicationContext)");
                        a.b(dVar, new IntentFilter("com.parse.bolts.measurement_event"));
                    } catch (Throwable th2) {
                        m6.a.a(dVar, th2);
                    }
                }
            } catch (Throwable th3) {
                m6.a.a(com.facebook.internal.d.class, th3);
            }
        }
        if (!m6.a.b(com.facebook.internal.d.class)) {
            try {
                com.facebook.internal.d.f11029b = dVar;
            } catch (Throwable th4) {
                m6.a.a(com.facebook.internal.d.class, th4);
            }
        }
        com.facebook.internal.d.a();
    }

    public static y5.c E(JSONObject mapping) {
        int length;
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        String eventName = mapping.getString("event_name");
        String string = mapping.getString("method");
        Intrinsics.checkNotNullExpressionValue(string, "mapping.getString(\"method\")");
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String upperCase = string.toUpperCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase(locale)");
        y5.b valueOf = y5.b.valueOf(upperCase);
        String string2 = mapping.getString("event_type");
        Intrinsics.checkNotNullExpressionValue(string2, "mapping.getString(\"event_type\")");
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String upperCase2 = string2.toUpperCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
        y5.a valueOf2 = y5.a.valueOf(upperCase2);
        String appVersion = mapping.getString("app_version");
        JSONArray jSONArray = mapping.getJSONArray(MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        ArrayList arrayList = new ArrayList();
        int length2 = jSONArray.length();
        int i10 = 0;
        if (length2 > 0) {
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                JSONObject jsonPath = jSONArray.getJSONObject(i11);
                Intrinsics.checkNotNullExpressionValue(jsonPath, "jsonPath");
                arrayList.add(new y5.e(jsonPath));
                if (i12 >= length2) {
                    break;
                }
                i11 = i12;
            }
        }
        String pathType = mapping.optString("path_type", "absolute");
        JSONArray optJSONArray = mapping.optJSONArray("parameters");
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            while (true) {
                int i13 = i10 + 1;
                JSONObject jsonParameter = optJSONArray.getJSONObject(i10);
                Intrinsics.checkNotNullExpressionValue(jsonParameter, "jsonParameter");
                arrayList2.add(new y5.d(jsonParameter));
                if (i13 >= length) {
                    break;
                }
                i10 = i13;
            }
        }
        String componentId = mapping.optString("component_id");
        String activityName = mapping.optString("activity_name");
        Intrinsics.checkNotNullExpressionValue(eventName, "eventName");
        Intrinsics.checkNotNullExpressionValue(appVersion, "appVersion");
        Intrinsics.checkNotNullExpressionValue(componentId, "componentId");
        Intrinsics.checkNotNullExpressionValue(pathType, "pathType");
        Intrinsics.checkNotNullExpressionValue(activityName, "activityName");
        return new y5.c(eventName, valueOf, valueOf2, appVersion, arrayList, arrayList2, componentId, pathType, activityName);
    }

    public static String F(String name, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        if (jSONObject.has(name)) {
            return jSONObject.getString(name);
        }
        return null;
    }

    public static Bundle G(y5.c cVar, View rootView, View hostView) {
        ArrayList o10;
        boolean z10;
        boolean z11;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        Bundle bundle = new Bundle();
        if (cVar == null) {
            return bundle;
        }
        List<y5.d> unmodifiableList = Collections.unmodifiableList(cVar.f27915c);
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(parameters)");
        if (unmodifiableList != null) {
            for (y5.d dVar : unmodifiableList) {
                String str = dVar.f27917b;
                String str2 = dVar.a;
                if (str != null) {
                    if (str.length() > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        bundle.putString(str2, dVar.f27917b);
                    }
                }
                ArrayList arrayList = dVar.f27918c;
                if (arrayList.size() > 0) {
                    if (Intrinsics.areEqual(dVar.f27919d, "relative")) {
                        String simpleName = hostView.getClass().getSimpleName();
                        Intrinsics.checkNotNullExpressionValue(simpleName, "hostView.javaClass.simpleName");
                        o10 = c.o(hostView, arrayList, 0, -1, simpleName);
                    } else {
                        String simpleName2 = rootView.getClass().getSimpleName();
                        Intrinsics.checkNotNullExpressionValue(simpleName2, "rootView.javaClass.simpleName");
                        o10 = c.o(rootView, arrayList, 0, -1, simpleName2);
                    }
                    Iterator it = o10.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            x5.e eVar = (x5.e) it.next();
                            if (eVar.a() != null) {
                                y5.g gVar = y5.g.a;
                                String i10 = y5.g.i(eVar.a());
                                if (i10.length() > 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    bundle.putString(str2, i10);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return bundle;
    }

    public static Path H(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(f10, f11);
        path.lineTo(f12, f13);
        return path;
    }

    public static a2.c I(kc.c refHolder, SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(refHolder, "refHolder");
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        a2.c cVar = (a2.c) refHolder.f20640c;
        if (cVar != null) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            if (Intrinsics.areEqual(cVar.f50b, sqLiteDatabase)) {
                return cVar;
            }
        }
        a2.c cVar2 = new a2.c(sqLiteDatabase);
        refHolder.f20640c = cVar2;
        return cVar2;
    }

    public static void J() {
        synchronized (com.facebook.appevents.l.c()) {
            if (com.facebook.appevents.l.b() != null) {
                return;
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
            if (!m6.a.b(com.facebook.appevents.l.class)) {
                try {
                    com.facebook.appevents.l.f10952d = scheduledThreadPoolExecutor;
                } catch (Throwable th2) {
                    m6.a.a(com.facebook.appevents.l.class, th2);
                }
            }
            Unit unit = Unit.INSTANCE;
            com.applovin.impl.sdk.g0 g0Var = new com.applovin.impl.sdk.g0(4);
            ScheduledThreadPoolExecutor b3 = com.facebook.appevents.l.b();
            if (b3 != null) {
                b3.scheduleAtFixedRate(g0Var, 0L, 86400L, TimeUnit.SECONDS);
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    public static boolean K(Context context) {
        Method r6 = com.facebook.internal.m0.r("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (r6 == null) {
            return false;
        }
        Object u = com.facebook.internal.m0.u(null, r6, context);
        if ((u instanceof Integer) && Intrinsics.areEqual(u, (Object) 0)) {
            return true;
        }
        return false;
    }

    public static void M(Activity activity) {
        View q10;
        Intrinsics.checkNotNullParameter(activity, "activity");
        int hashCode = activity.hashCode();
        b bVar = g6.e.f18218f;
        HashMap hashMap = null;
        if (!m6.a.b(g6.e.class)) {
            try {
                hashMap = g6.e.f18219g;
            } catch (Throwable th2) {
                m6.a.a(g6.e.class, th2);
            }
        }
        g6.e eVar = (g6.e) hashMap.remove(Integer.valueOf(hashCode));
        if (eVar != null && !m6.a.b(g6.e.class)) {
            try {
                if (!m6.a.b(eVar)) {
                    try {
                        if (eVar.f18222d.getAndSet(false) && (q10 = c6.c.q((Activity) eVar.f18220b.get())) != null) {
                            ViewTreeObserver viewTreeObserver = q10.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnGlobalLayoutListener(eVar);
                            }
                        }
                    } catch (Throwable th3) {
                        m6.a.a(eVar, th3);
                    }
                }
            } catch (Throwable th4) {
                m6.a.a(g6.e.class, th4);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078 A[Catch: all -> 0x0087, TRY_LEAVE, TryCatch #3 {all -> 0x0087, blocks: (B:10:0x0047, B:14:0x006c, B:20:0x0078, B:28:0x0067, B:23:0x005c), top: B:9:0x0047, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void s(com.facebook.appevents.e r8, com.facebook.appevents.b r9) {
        /*
            java.lang.String r0 = com.facebook.appevents.l.f10951c
            kc.c r0 = com.facebook.appevents.h.a
            java.lang.Class<com.facebook.appevents.h> r0 = com.facebook.appevents.h.class
            boolean r1 = m6.a.b(r0)
            r2 = 1
            if (r1 == 0) goto Le
            goto L27
        Le:
            java.lang.String r1 = "accessTokenAppId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = "appEvent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)     // Catch: java.lang.Throwable -> L23
            java.util.concurrent.ScheduledExecutorService r1 = com.facebook.appevents.h.f10943b     // Catch: java.lang.Throwable -> L23
            com.facebook.r0 r3 = new com.facebook.r0     // Catch: java.lang.Throwable -> L23
            r3.<init>(r2, r9, r8)     // Catch: java.lang.Throwable -> L23
            r1.execute(r3)     // Catch: java.lang.Throwable -> L23
            goto L27
        L23:
            r1 = move-exception
            m6.a.a(r0, r1)
        L27:
            com.facebook.internal.v r0 = com.facebook.internal.v.a
            com.facebook.internal.t r0 = com.facebook.internal.t.OnDevicePostInstallEventProcessing
            boolean r0 = com.facebook.internal.v.c(r0)
            java.lang.String r1 = r8.f10935f
            boolean r3 = r8.f10933c
            r4 = 0
            if (r0 == 0) goto L8b
            boolean r0 = e6.b.a()
            if (r0 == 0) goto L8b
            java.lang.String r9 = r9.f10923b
            java.lang.Class<e6.b> r0 = e6.b.class
            boolean r5 = m6.a.b(r0)
            if (r5 == 0) goto L47
            goto L8b
        L47:
            java.lang.String r5 = "applicationId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r5)     // Catch: java.lang.Throwable -> L87
            java.lang.String r5 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r5)     // Catch: java.lang.Throwable -> L87
            e6.b r5 = e6.b.a     // Catch: java.lang.Throwable -> L87
            boolean r6 = m6.a.b(r5)     // Catch: java.lang.Throwable -> L87
            if (r6 == 0) goto L5a
            goto L73
        L5a:
            if (r3 == 0) goto L6b
            java.util.Set r6 = e6.b.f17115b     // Catch: java.lang.Throwable -> L66
            boolean r5 = r6.contains(r1)     // Catch: java.lang.Throwable -> L66
            if (r5 == 0) goto L6b
            r5 = r2
            goto L6c
        L66:
            r6 = move-exception
            m6.a.a(r5, r6)     // Catch: java.lang.Throwable -> L87
            goto L73
        L6b:
            r5 = r4
        L6c:
            r6 = r3 ^ 1
            if (r6 != 0) goto L75
            if (r5 == 0) goto L73
            goto L75
        L73:
            r5 = r4
            goto L76
        L75:
            r5 = r2
        L76:
            if (r5 == 0) goto L8b
            java.util.concurrent.Executor r5 = com.facebook.x.c()     // Catch: java.lang.Throwable -> L87
            com.facebook.r0 r6 = new com.facebook.r0     // Catch: java.lang.Throwable -> L87
            r7 = 10
            r6.<init>(r7, r9, r8)     // Catch: java.lang.Throwable -> L87
            r5.execute(r6)     // Catch: java.lang.Throwable -> L87
            goto L8b
        L87:
            r8 = move-exception
            m6.a.a(r0, r8)
        L8b:
            if (r3 != 0) goto Lc3
            java.lang.String r8 = com.facebook.appevents.l.f10951c
            java.lang.Class<com.facebook.appevents.l> r8 = com.facebook.appevents.l.class
            boolean r9 = m6.a.b(r8)
            if (r9 == 0) goto L98
            goto L9f
        L98:
            boolean r4 = com.facebook.appevents.l.f10955g     // Catch: java.lang.Throwable -> L9b
            goto L9f
        L9b:
            r9 = move-exception
            m6.a.a(r8, r9)
        L9f:
            if (r4 != 0) goto Lc3
            java.lang.String r9 = "fb_mobile_activate_app"
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r9)
            if (r9 == 0) goto Lb8
            boolean r9 = m6.a.b(r8)
            if (r9 == 0) goto Lb0
            goto Lc3
        Lb0:
            com.facebook.appevents.l.f10955g = r2     // Catch: java.lang.Throwable -> Lb3
            goto Lc3
        Lb3:
            r9 = move-exception
            m6.a.a(r8, r9)
            goto Lc3
        Lb8:
            com.facebook.internal.m r8 = com.facebook.internal.d0.f11030d
            com.facebook.m0 r8 = com.facebook.m0.APP_EVENTS
            java.lang.String r9 = "AppEvents"
            java.lang.String r0 = "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events."
            com.facebook.internal.m.n(r8, r9, r0)
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.b.s(com.facebook.appevents.e, com.facebook.appevents.b):void");
    }

    public static final String t(String str) {
        HashSet hashSet = com.facebook.appevents.e.f10931h;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            Charset forName = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(forName, "Charset.forName(charsetName)");
            if (str != null) {
                byte[] bytes = str.getBytes(forName);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                messageDigest.update(bytes, 0, bytes.length);
                byte[] digest = messageDigest.digest();
                Intrinsics.checkNotNullExpressionValue(digest, "digest.digest()");
                return c6.c.a(digest);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (UnsupportedEncodingException unused) {
            x xVar = x.a;
            return "1";
        } catch (NoSuchAlgorithmException unused2) {
            x xVar2 = x.a;
            return "0";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r3.equals("r5") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        r4 = new kotlin.text.Regex("[^a-z]+").replace(r4, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r3.equals("r4") == false) goto L34;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void u(java.util.HashMap r2, java.lang.String r3, java.lang.String r4) {
        /*
            com.facebook.b r0 = v5.d.f26036g
            int r0 = r3.hashCode()
            switch(r0) {
                case 3585: goto L5e;
                case 3586: goto L47;
                case 3587: goto L3e;
                case 3588: goto Lb;
                default: goto L9;
            }
        L9:
            goto L84
        Lb:
            java.lang.String r0 = "r6"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L15
            goto L84
        L15:
            java.lang.String r0 = "-"
            boolean r1 = kotlin.text.StringsKt.d(r4, r0)
            if (r1 == 0) goto L84
            kotlin.text.Regex r1 = new kotlin.text.Regex
            r1.<init>(r0)
            r0 = 0
            java.util.List r4 = r1.split(r4, r0)
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.Object[] r4 = r4.toArray(r1)
            if (r4 == 0) goto L36
            java.lang.String[] r4 = (java.lang.String[]) r4
            r4 = r4[r0]
            goto L84
        L36:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T>"
            r2.<init>(r3)
            throw r2
        L3e:
            java.lang.String r0 = "r5"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L50
            goto L84
        L47:
            java.lang.String r0 = "r4"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L50
            goto L84
        L50:
            kotlin.text.Regex r0 = new kotlin.text.Regex
            java.lang.String r1 = "[^a-z]+"
            r0.<init>(r1)
            java.lang.String r1 = ""
            java.lang.String r4 = r0.replace(r4, r1)
            goto L84
        L5e:
            java.lang.String r0 = "r3"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L67
            goto L84
        L67:
            java.lang.String r0 = "m"
            boolean r1 = kotlin.text.StringsKt.z(r4, r0)
            if (r1 != 0) goto L83
            java.lang.String r1 = "b"
            boolean r1 = kotlin.text.StringsKt.z(r4, r1)
            if (r1 != 0) goto L83
            java.lang.String r1 = "ge"
            boolean r4 = kotlin.text.StringsKt.z(r4, r1)
            if (r4 == 0) goto L80
            goto L83
        L80:
            java.lang.String r4 = "f"
            goto L84
        L83:
            r4 = r0
        L84:
            r2.put(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.b.u(java.util.HashMap, java.lang.String, java.lang.String):void");
    }

    public static final void v(String str) {
        boolean z10;
        boolean contains;
        HashSet hashSet = com.facebook.appevents.e.f10931h;
        if (str != null) {
            if (str.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && str.length() <= 40) {
                HashSet hashSet2 = com.facebook.appevents.e.f10931h;
                synchronized (hashSet2) {
                    contains = hashSet2.contains(str);
                    Unit unit = Unit.INSTANCE;
                }
                if (!contains) {
                    if (new Regex("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").matches(str)) {
                        synchronized (hashSet2) {
                            hashSet2.add(str);
                        }
                        return;
                    } else {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        throw new q(com.applovin.impl.mediation.ads.e.h(new Object[]{str}, 1, "Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", "java.lang.String.format(format, *args)"));
                    }
                }
                return;
            }
        }
        if (str == null) {
            str = "<None Provided>";
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{str, 40}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
        throw new q(format);
    }

    public static g0 w(String str, a aVar, String str2) {
        String str3;
        Intrinsics.checkNotNullParameter("app_indexing", "requestType");
        String str4 = g0.f11000j;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        int i10 = 1;
        String format = String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{str2}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
        g0 A = c.A(aVar, format, null, null);
        Bundle bundle = A.f11006d;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("tree", str);
        Context a = x.a();
        try {
            str3 = a.getPackageManager().getPackageInfo(a.getPackageName(), 0).versionName;
            Intrinsics.checkNotNullExpressionValue(str3, "{\n      val packageInfo = context.packageManager.getPackageInfo(context.packageName, 0)\n      packageInfo.versionName\n    }");
        } catch (PackageManager.NameNotFoundException unused) {
            str3 = "";
        }
        bundle.putString("app_version", str3);
        bundle.putString("platform", "android");
        bundle.putString("request_type", "app_indexing");
        if (Intrinsics.areEqual("app_indexing", "app_indexing")) {
            bundle.putString("device_session_id", x5.d.a());
        }
        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
        A.f11006d = bundle;
        A.j(new w5.c(i10));
        return A;
    }

    public static v3.a x(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new v3.a(httpURLConnection);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6 A[Catch: all -> 0x0152, Exception -> 0x01bb, TryCatch #8 {Exception -> 0x01bb, all -> 0x0152, blocks: (B:31:0x00c8, B:33:0x00d6, B:35:0x00da, B:38:0x00e9, B:40:0x0103, B:42:0x0112, B:44:0x0133, B:48:0x0145, B:50:0x0149, B:52:0x0155, B:75:0x013b, B:77:0x011b, B:79:0x012a, B:81:0x01b3, B:82:0x01ba), top: B:30:0x00c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0145 A[Catch: all -> 0x0152, Exception -> 0x01bb, TryCatch #8 {Exception -> 0x01bb, all -> 0x0152, blocks: (B:31:0x00c8, B:33:0x00d6, B:35:0x00da, B:38:0x00e9, B:40:0x0103, B:42:0x0112, B:44:0x0133, B:48:0x0145, B:50:0x0149, B:52:0x0155, B:75:0x013b, B:77:0x011b, B:79:0x012a, B:81:0x01b3, B:82:0x01ba), top: B:30:0x00c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0149 A[Catch: all -> 0x0152, Exception -> 0x01bb, TryCatch #8 {Exception -> 0x01bb, all -> 0x0152, blocks: (B:31:0x00c8, B:33:0x00d6, B:35:0x00da, B:38:0x00e9, B:40:0x0103, B:42:0x0112, B:44:0x0133, B:48:0x0145, B:50:0x0149, B:52:0x0155, B:75:0x013b, B:77:0x011b, B:79:0x012a, B:81:0x01b3, B:82:0x01ba), top: B:30:0x00c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0155 A[Catch: all -> 0x0152, Exception -> 0x01bb, TRY_LEAVE, TryCatch #8 {Exception -> 0x01bb, all -> 0x0152, blocks: (B:31:0x00c8, B:33:0x00d6, B:35:0x00da, B:38:0x00e9, B:40:0x0103, B:42:0x0112, B:44:0x0133, B:48:0x0145, B:50:0x0149, B:52:0x0155, B:75:0x013b, B:77:0x011b, B:79:0x012a, B:81:0x01b3, B:82:0x01ba), top: B:30:0x00c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013b A[Catch: all -> 0x0152, Exception -> 0x01bb, TryCatch #8 {Exception -> 0x01bb, all -> 0x0152, blocks: (B:31:0x00c8, B:33:0x00d6, B:35:0x00da, B:38:0x00e9, B:40:0x0103, B:42:0x0112, B:44:0x0133, B:48:0x0145, B:50:0x0149, B:52:0x0155, B:75:0x013b, B:77:0x011b, B:79:0x012a, B:81:0x01b3, B:82:0x01ba), top: B:30:0x00c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b3 A[Catch: all -> 0x0152, Exception -> 0x01bb, TRY_ENTER, TryCatch #8 {Exception -> 0x01bb, all -> 0x0152, blocks: (B:31:0x00c8, B:33:0x00d6, B:35:0x00da, B:38:0x00e9, B:40:0x0103, B:42:0x0112, B:44:0x0133, B:48:0x0145, B:50:0x0149, B:52:0x0155, B:75:0x013b, B:77:0x011b, B:79:0x012a, B:81:0x01b3, B:82:0x01ba), top: B:30:0x00c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.internal.c y(android.content.Context r17) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.b.y(android.content.Context):com.facebook.internal.c");
    }

    public static com.facebook.appevents.j z() {
        com.facebook.appevents.j jVar;
        synchronized (com.facebook.appevents.l.c()) {
            if (!m6.a.b(com.facebook.appevents.l.class)) {
                try {
                    jVar = com.facebook.appevents.j.AUTO;
                } catch (Throwable th2) {
                    m6.a.a(com.facebook.appevents.l.class, th2);
                }
            }
            jVar = null;
        }
        return jVar;
    }

    public j B() {
        j jVar;
        j jVar2 = j.f11146g;
        if (jVar2 == null) {
            synchronized (this) {
                jVar = j.f11146g;
                if (jVar == null) {
                    m1.b a = m1.b.a(x.a());
                    Intrinsics.checkNotNullExpressionValue(a, "getInstance(applicationContext)");
                    j jVar3 = new j(a, new d());
                    j.f11146g = jVar3;
                    jVar = jVar3;
                }
            }
            return jVar;
        }
        return jVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044 A[Catch: all -> 0x002e, TRY_ENTER, TryCatch #3 {all -> 0x002e, blocks: (B:3:0x0001, B:8:0x0018, B:14:0x002a, B:15:0x0030, B:28:0x003d, B:21:0x0044, B:22:0x004b, B:33:0x0012, B:30:0x000e, B:11:0x0026, B:25:0x0039), top: B:2:0x0001, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018 A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #3 {all -> 0x002e, blocks: (B:3:0x0001, B:8:0x0018, B:14:0x002a, B:15:0x0030, B:28:0x003d, B:21:0x0044, B:22:0x004b, B:33:0x0012, B:30:0x000e, B:11:0x0026, B:25:0x0039), top: B:2:0x0001, inners: #0, #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized x5.g C() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.facebook.b r0 = x5.g.f27387f     // Catch: java.lang.Throwable -> L2e
            java.lang.Class<x5.g> r0 = x5.g.class
            boolean r1 = m6.a.b(r0)     // Catch: java.lang.Throwable -> L2e
            r2 = 0
            if (r1 == 0) goto Le
        Lc:
            r0 = r2
            goto L16
        Le:
            x5.g r0 = x5.g.f27388g     // Catch: java.lang.Throwable -> L11
            goto L16
        L11:
            r1 = move-exception
            m6.a.a(r0, r1)     // Catch: java.lang.Throwable -> L2e
            goto Lc
        L16:
            if (r0 != 0) goto L30
            x5.g r0 = new x5.g     // Catch: java.lang.Throwable -> L2e
            r0.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.Class<x5.g> r1 = x5.g.class
            boolean r3 = m6.a.b(r1)     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L26
            goto L30
        L26:
            x5.g.f27388g = r0     // Catch: java.lang.Throwable -> L29
            goto L30
        L29:
            r0 = move-exception
            m6.a.a(r1, r0)     // Catch: java.lang.Throwable -> L2e
            goto L30
        L2e:
            r0 = move-exception
            goto L4c
        L30:
            java.lang.Class<x5.g> r0 = x5.g.class
            boolean r1 = m6.a.b(r0)     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L39
            goto L40
        L39:
            x5.g r2 = x5.g.f27388g     // Catch: java.lang.Throwable -> L3c
            goto L40
        L3c:
            r1 = move-exception
            m6.a.a(r0, r1)     // Catch: java.lang.Throwable -> L2e
        L40:
            if (r2 == 0) goto L44
            monitor-exit(r4)
            return r2
        L44:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2e
            throw r0     // Catch: java.lang.Throwable -> L2e
        L4c:
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.b.C():x5.g");
    }

    public void L(Activity activity) {
        View q10;
        View q11;
        HashMap hashMap = null;
        switch (this.f10983b) {
            case 18:
                Intrinsics.checkNotNullParameter(activity, "activity");
                int hashCode = activity.hashCode();
                b bVar = v5.d.f26036g;
                if (!m6.a.b(v5.d.class)) {
                    try {
                        hashMap = v5.d.f26037h;
                    } catch (Throwable th2) {
                        m6.a.a(v5.d.class, th2);
                    }
                }
                Integer valueOf = Integer.valueOf(hashCode);
                Object obj = hashMap.get(valueOf);
                if (obj == null) {
                    obj = new v5.d(activity);
                    hashMap.put(valueOf, obj);
                }
                v5.d dVar = (v5.d) obj;
                if (!m6.a.b(v5.d.class)) {
                    try {
                        if (!m6.a.b(dVar)) {
                            try {
                                if (!dVar.f26041f.getAndSet(true) && (q11 = c6.c.q((Activity) dVar.f26040d.get())) != null) {
                                    ViewTreeObserver viewTreeObserver = q11.getViewTreeObserver();
                                    if (viewTreeObserver.isAlive()) {
                                        viewTreeObserver.addOnGlobalFocusChangeListener(dVar);
                                    }
                                }
                            } catch (Throwable th3) {
                                m6.a.a(dVar, th3);
                            }
                        }
                        return;
                    } catch (Throwable th4) {
                        m6.a.a(v5.d.class, th4);
                        return;
                    }
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(activity, "activity");
                int hashCode2 = activity.hashCode();
                b bVar2 = g6.e.f18218f;
                if (!m6.a.b(g6.e.class)) {
                    try {
                        hashMap = g6.e.f18219g;
                    } catch (Throwable th5) {
                        m6.a.a(g6.e.class, th5);
                    }
                }
                Integer valueOf2 = Integer.valueOf(hashCode2);
                Object obj2 = hashMap.get(valueOf2);
                if (obj2 == null) {
                    obj2 = new g6.e(activity);
                    hashMap.put(valueOf2, obj2);
                }
                g6.e eVar = (g6.e) obj2;
                if (!m6.a.b(g6.e.class)) {
                    try {
                        if (!m6.a.b(eVar)) {
                            try {
                                if (!eVar.f18222d.getAndSet(true) && (q10 = c6.c.q((Activity) eVar.f18220b.get())) != null) {
                                    ViewTreeObserver viewTreeObserver2 = q10.getViewTreeObserver();
                                    if (viewTreeObserver2.isAlive()) {
                                        viewTreeObserver2.addOnGlobalLayoutListener(eVar);
                                        eVar.a();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Throwable th6) {
                                m6.a.a(eVar, th6);
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th7) {
                        m6.a.a(g6.e.class, th7);
                        return;
                    }
                }
                return;
        }
    }

    @Override // k4.o
    public Class a() {
        return ParcelFileDescriptor.class;
    }

    @Override // n.a, o7.h
    public Object apply(Object obj) {
        List list = (List) obj;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        a4.j.t(it.next());
        throw null;
    }

    @Override // k4.o
    public void b(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }

    @Override // k4.z
    public k4.y c(k4.d0 d0Var) {
        int i10 = 0;
        switch (this.f10983b) {
            case 13:
                return new k4.e(new v3.c(this, 17), i10);
            case 17:
                return new k4.f0(d0Var.b(Uri.class, ParcelFileDescriptor.class), i10);
            default:
                return new k4.j0(d0Var.b(k4.p.class, InputStream.class));
        }
    }

    @Override // com.bumptech.glide.manager.f
    public void d() {
    }

    @Override // com.bumptech.glide.manager.g
    public void e(com.bumptech.glide.manager.h hVar) {
    }

    @Override // x4.a
    public Object f() {
        return new g4.f0();
    }

    @Override // i4.a
    public File g(e4.j jVar) {
        return null;
    }

    @Override // e4.p
    public int h(e4.m mVar) {
        return 1;
    }

    @Override // n4.o
    public void i(Bitmap bitmap, h4.d dVar) {
    }

    @Override // i4.a
    public void j(e4.j jVar, g4.k kVar) {
    }

    @Override // com.bumptech.glide.manager.g
    public void k(com.bumptech.glide.manager.h hVar) {
        hVar.onStart();
    }

    @Override // k4.o
    public Object l(File file) {
        return ParcelFileDescriptor.open(file, 268435456);
    }

    @Override // n4.d0
    public void m(MediaExtractor mediaExtractor, Object obj) {
        switch (this.f10983b) {
            case 20:
                mediaExtractor.setDataSource(new n4.c0((ByteBuffer) obj));
                return;
            default:
                mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                return;
        }
    }

    @Override // n4.o
    public void n() {
    }

    @Override // j4.d
    public void o(Throwable th2) {
        if (Log.isLoggable("GlideExecutor", 6)) {
            Log.e("GlideExecutor", "Request threw uncaught throwable", th2);
        }
    }

    @Override // e4.c
    public boolean p(Object obj, File file, e4.m mVar) {
        switch (this.f10983b) {
            case 14:
                try {
                    w4.b.d((ByteBuffer) obj, file);
                    return true;
                } catch (IOException e2) {
                    if (!Log.isLoggable("ByteBufferEncoder", 3)) {
                        return false;
                    }
                    Log.d("ByteBufferEncoder", "Failed to write data", e2);
                    return false;
                }
            default:
                try {
                    w4.b.d(((d4.e) ((p4.c) ((g4.g0) obj).get()).f23419b.a.a).f16839d.asReadOnlyBuffer(), file);
                    return true;
                } catch (IOException e10) {
                    if (!Log.isLoggable("GifEncoder", 5)) {
                        return false;
                    }
                    Log.w("GifEncoder", "Failed to encode GIF drawable data", e10);
                    return false;
                }
        }
    }

    @Override // n4.d0
    public void q(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        switch (this.f10983b) {
            case 20:
                mediaMetadataRetriever.setDataSource(new n4.c0((ByteBuffer) obj));
                return;
            default:
                mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                return;
        }
    }

    public void r(Context context, p5.c cVar, r5.b bVar) {
        ConcurrentHashMap concurrentHashMap = g5.b.a;
        synchronized (g5.b.class) {
            if (cVar != null) {
                ConcurrentHashMap concurrentHashMap2 = g5.b.a;
                g5.a aVar = (g5.a) concurrentHashMap2.get(cVar.pDU());
                if (aVar == null) {
                    aVar = new g5.a(context, cVar);
                    concurrentHashMap2.put(cVar.pDU(), aVar);
                    cVar.tN();
                    cVar.pDU();
                }
                aVar.e(bVar);
                cVar.tN();
                cVar.pDU();
            }
        }
        o5.a aVar2 = c6.k.f2654n;
        if (aVar2 != null) {
            ((m2.l) aVar2).a();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, int i11) {
        this(29);
        this.f10983b = i10;
        switch (i10) {
            case 1:
                this(1);
                return;
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
                this(0);
                return;
        }
    }

    public /* synthetic */ b(JSONObject jSONObject, int i10) {
        this.f10983b = i10;
        if (i10 != 7) {
            jSONObject.getInt("percentageDiscount");
        } else {
            jSONObject.getLong("preorderReleaseTimeMillis");
            jSONObject.getLong("preorderPresaleEndTimeMillis");
        }
    }

    public /* synthetic */ b() {
        this.f10983b = 3;
    }
}
