package com.facebook.appevents;

import G7.v;
import Q7.AbstractC0255x;
import Q7.C0247o;
import Q7.n0;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.W;
import androidx.recyclerview.widget.l0;
import com.adjust.sdk.Constants;
import com.facebook.C0785a;
import com.facebook.C1827e;
import com.facebook.C1849l;
import com.facebook.EnumC1828f;
import com.facebook.N;
import com.facebook.internal.H;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.UserMessagingPlatform;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import i6.C2362a;
import java.io.BufferedOutputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipException;
import org.json.JSONArray;
import org.json.JSONObject;
import q7.InterfaceC2648a;
import q7.InterfaceC2649b;
import x7.EnumC2928a;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f13482a;
    public static ConsentInformation b;

    public static void a(int i9) {
        if (2 <= i9 && i9 < 37) {
            return;
        }
        StringBuilder p2 = n0.p(i9, "radix ", " was not in valid range ");
        p2.append(new L7.a(2, 36, 1));
        throw new IllegalArgumentException(p2.toString());
    }

    public static int b(l0 l0Var, OrientationHelper orientationHelper, View view, View view2, W w2, boolean z8) {
        if (w2.getChildCount() != 0 && l0Var.b() != 0 && view != null && view2 != null) {
            if (!z8) {
                return Math.abs(w2.getPosition(view) - w2.getPosition(view2)) + 1;
            }
            return Math.min(orientationHelper.getTotalSpace(), orientationHelper.getDecoratedEnd(view2) - orientationHelper.getDecoratedStart(view));
        }
        return 0;
    }

    public static int c(l0 l0Var, OrientationHelper orientationHelper, View view, View view2, W w2, boolean z8, boolean z9) {
        int max;
        if (w2.getChildCount() == 0 || l0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(w2.getPosition(view), w2.getPosition(view2));
        int max2 = Math.max(w2.getPosition(view), w2.getPosition(view2));
        if (z9) {
            max = Math.max(0, (l0Var.b() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z8) {
            return max;
        }
        return Math.round((max * (Math.abs(orientationHelper.getDecoratedEnd(view2) - orientationHelper.getDecoratedStart(view)) / (Math.abs(w2.getPosition(view) - w2.getPosition(view2)) + 1))) + (orientationHelper.getStartAfterPadding() - orientationHelper.getDecoratedStart(view)));
    }

    public static int d(l0 l0Var, OrientationHelper orientationHelper, View view, View view2, W w2, boolean z8) {
        if (w2.getChildCount() != 0 && l0Var.b() != 0 && view != null && view2 != null) {
            if (!z8) {
                return l0Var.b();
            }
            return (int) (((orientationHelper.getDecoratedEnd(view2) - orientationHelper.getDecoratedStart(view)) / (Math.abs(w2.getPosition(view) - w2.getPosition(view2)) + 1)) * l0Var.b());
        }
        return 0;
    }

    public static C0785a e(JSONObject jSONObject) {
        ArrayList D8;
        if (jSONObject.getInt("version") <= 1) {
            String string = jSONObject.getString(BidResponsed.KEY_TOKEN);
            Date date = new Date(jSONObject.getLong("expires_at"));
            JSONArray jSONArray = jSONObject.getJSONArray("permissions");
            JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
            JSONArray optJSONArray = jSONObject.optJSONArray("expired_permissions");
            Date date2 = new Date(jSONObject.getLong("last_refresh"));
            String string2 = jSONObject.getString("source");
            G7.j.d(string2, "jsonObject.getString(SOURCE_KEY)");
            EnumC1828f valueOf = EnumC1828f.valueOf(string2);
            String string3 = jSONObject.getString("application_id");
            String string4 = jSONObject.getString("user_id");
            Date date3 = new Date(jSONObject.optLong("data_access_expiration_time", 0L));
            String optString = jSONObject.optString("graph_domain", null);
            G7.j.d(string, BidResponsed.KEY_TOKEN);
            G7.j.d(string3, "applicationId");
            G7.j.d(string4, "userId");
            G7.j.d(jSONArray, "permissionsArray");
            ArrayList D9 = H.D(jSONArray);
            G7.j.d(jSONArray2, "declinedPermissionsArray");
            ArrayList D10 = H.D(jSONArray2);
            if (optJSONArray == null) {
                D8 = new ArrayList();
            } else {
                D8 = H.D(optJSONArray);
            }
            return new C0785a(string, string3, string4, D9, D10, D8, valueOf, date, date2, date3, optString);
        }
        throw new C1849l("Unknown AccessToken serialization format.");
    }

    public static void f(d8.d dVar, a8.b bVar, Object obj) {
        G7.j.e(bVar, "serializer");
        if (bVar.getDescriptor().c()) {
            dVar.g(bVar, obj);
        } else if (obj == null) {
            dVar.f();
        } else {
            dVar.getClass();
            dVar.g(bVar, obj);
        }
    }

    public static final boolean g(char c9, char c10, boolean z8) {
        if (c9 == c10) {
            return true;
        }
        if (!z8) {
            return false;
        }
        char upperCase = Character.toUpperCase(c9);
        char upperCase2 = Character.toUpperCase(c10);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, L2.d] */
    public static final void h(Throwable th) {
        HashMap hashMap;
        com.facebook.internal.p pVar;
        if (f13482a && th != null) {
            HashSet hashSet = new HashSet();
            StackTraceElement[] stackTrace = th.getStackTrace();
            G7.j.d(stackTrace, "e.stackTrace");
            for (StackTraceElement stackTraceElement : stackTrace) {
                com.facebook.internal.r rVar = com.facebook.internal.r.f13653a;
                String className = stackTraceElement.getClassName();
                G7.j.d(className, "it.className");
                synchronized (com.facebook.internal.r.f13653a) {
                    hashMap = com.facebook.internal.r.b;
                    if (hashMap.isEmpty()) {
                        hashMap.put(com.facebook.internal.p.AAM, new String[]{"com.facebook.appevents.aam."});
                        hashMap.put(com.facebook.internal.p.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
                        hashMap.put(com.facebook.internal.p.CloudBridge, new String[]{"com.facebook.appevents.cloudbridge."});
                        hashMap.put(com.facebook.internal.p.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
                        hashMap.put(com.facebook.internal.p.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
                        hashMap.put(com.facebook.internal.p.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
                        hashMap.put(com.facebook.internal.p.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
                        hashMap.put(com.facebook.internal.p.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
                        hashMap.put(com.facebook.internal.p.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
                        hashMap.put(com.facebook.internal.p.ProtectedMode, new String[]{"com.facebook.appevents.integrity.ProtectedModeManager"});
                        hashMap.put(com.facebook.internal.p.MACARuleMatching, new String[]{"com.facebook.appevents.integrity.MACARuleMatchingManager"});
                        hashMap.put(com.facebook.internal.p.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
                        hashMap.put(com.facebook.internal.p.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
                        hashMap.put(com.facebook.internal.p.IapLogging, new String[]{"com.facebook.appevents.iap."});
                        hashMap.put(com.facebook.internal.p.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
                    }
                }
                Iterator it = hashMap.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        pVar = (com.facebook.internal.p) entry.getKey();
                        String[] strArr = (String[]) entry.getValue();
                        int length = strArr.length;
                        int i9 = 0;
                        while (i9 < length) {
                            String str = strArr[i9];
                            i9++;
                            if (O7.o.C(className, str, false)) {
                                break;
                            }
                        }
                    } else {
                        pVar = com.facebook.internal.p.Unknown;
                        break;
                    }
                }
                if (pVar != com.facebook.internal.p.Unknown) {
                    com.facebook.internal.r rVar2 = com.facebook.internal.r.f13653a;
                    G7.j.e(pVar, "feature");
                    com.facebook.r.a().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString(G7.j.j(pVar, "FBSDKFeature"), "16.1.3").apply();
                    hashSet.add(pVar.toString());
                }
            }
            com.facebook.r rVar3 = com.facebook.r.f13801a;
            if (N.b() && (!hashSet.isEmpty())) {
                JSONArray jSONArray = new JSONArray((Collection) hashSet);
                ?? obj = new Object();
                obj.b = L2.b.f1710c;
                Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
                obj.f1722g = valueOf;
                obj.f1718c = jSONArray;
                StringBuffer stringBuffer = new StringBuffer("analysis_log_");
                stringBuffer.append(String.valueOf(valueOf));
                stringBuffer.append(".json");
                String stringBuffer2 = stringBuffer.toString();
                G7.j.d(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ANALYSIS_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
                obj.f1717a = stringBuffer2;
                obj.b();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [k5.g, java.lang.Object] */
    public static k5.g i(RandomAccessFile randomAccessFile) {
        long length = randomAccessFile.length();
        long j7 = length - 22;
        long j9 = 0;
        if (j7 >= 0) {
            long j10 = length - 65558;
            if (j10 >= 0) {
                j9 = j10;
            }
            int reverseBytes = Integer.reverseBytes(101010256);
            do {
                randomAccessFile.seek(j7);
                if (randomAccessFile.readInt() == reverseBytes) {
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    ?? obj = new Object();
                    obj.b = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                    obj.f21483a = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                    return obj;
                }
                j7--;
            } while (j7 >= j9);
            throw new ZipException("End Of Central Directory signature not found");
        }
        throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e2, code lost:
    
        if (r7.getClass().getSimpleName().equals((java.lang.String) r10.get(r10.size() - 1)) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f2, code lost:
    
        if (r1.f33c != r7.getId()) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0112, code lost:
    
        if (G7.j.a(r5, r4) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0140, code lost:
    
        if (G7.j.a(r6, r5) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015f, code lost:
    
        if (G7.j.a(r6, r5) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0189, code lost:
    
        if (G7.j.a(r1, r10) == false) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList j(android.view.View r7, java.util.List r8, int r9, int r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.g.j(android.view.View, java.util.List, int, int, java.lang.String):java.util.ArrayList");
    }

    public static ArrayList k(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        int childCount = viewGroup.getChildCount();
        if (childCount > 0) {
            int i9 = 0;
            while (true) {
                int i10 = i9 + 1;
                View childAt = viewGroup.getChildAt(i9);
                if (childAt.getVisibility() == 0) {
                    arrayList.add(childAt);
                }
                if (i10 >= childCount) {
                    break;
                }
                i9 = i10;
            }
        }
        return arrayList;
    }

    public static Object l(Object obj, Class cls) {
        if (obj instanceof InterfaceC2648a) {
            return cls.cast(obj);
        }
        if (obj instanceof InterfaceC2649b) {
            return l(((InterfaceC2649b) obj).a(), cls);
        }
        throw new IllegalStateException("Given component holder " + obj.getClass() + " does not implement " + InterfaceC2648a.class + " or " + InterfaceC2649b.class);
    }

    public static C0785a m() {
        return C1827e.f13531f.s().f13534c;
    }

    public static final Class n(M7.b bVar) {
        G7.j.e(bVar, "<this>");
        Class a6 = ((G7.d) bVar).a();
        G7.j.c(a6, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return a6;
    }

    public static final Class o(M7.b bVar) {
        G7.j.e(bVar, "<this>");
        Class a6 = ((G7.d) bVar).a();
        if (!a6.isPrimitive()) {
            return a6;
        }
        String name = a6.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.class;
                }
                return a6;
            case 104431:
                if (name.equals("int")) {
                    return Integer.class;
                }
                return a6;
            case 3039496:
                if (name.equals("byte")) {
                    return Byte.class;
                }
                return a6;
            case 3052374:
                if (name.equals("char")) {
                    return Character.class;
                }
                return a6;
            case 3327612:
                if (name.equals(Constants.LONG)) {
                    return Long.class;
                }
                return a6;
            case 3625364:
                if (name.equals("void")) {
                    return Void.class;
                }
                return a6;
            case 64711720:
                if (name.equals("boolean")) {
                    return Boolean.class;
                }
                return a6;
            case 97526364:
                if (name.equals("float")) {
                    return Float.class;
                }
                return a6;
            case 109413500:
                if (name.equals("short")) {
                    return Short.class;
                }
                return a6;
            default:
                return a6;
        }
    }

    public static boolean p(int i9, String str) {
        if (str.length() >= i9 && str.charAt(i9 - 1) == '1') {
            return true;
        }
        return false;
    }

    public static boolean q() {
        C0785a c0785a = C1827e.f13531f.s().f13534c;
        if (c0785a != null && !new Date().after(c0785a.b)) {
            return true;
        }
        return false;
    }

    public static boolean r(String str) {
        U0.b bVar = U0.l.f3109a;
        Set<U0.f> unmodifiableSet = Collections.unmodifiableSet(U0.c.f3104c);
        HashSet hashSet = new HashSet();
        for (U0.f fVar : unmodifiableSet) {
            if (((U0.c) fVar).f3105a.equals(str)) {
                hashSet.add(fVar);
            }
        }
        if (!hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                U0.c cVar = (U0.c) ((U0.f) it.next());
                if (cVar.a() || cVar.b()) {
                    return true;
                }
            }
            return false;
        }
        throw new RuntimeException("Unknown feature ".concat(str));
    }

    public static final boolean s(char c9) {
        if (!Character.isWhitespace(c9) && !Character.isSpaceChar(c9)) {
            return false;
        }
        return true;
    }

    public static void t(E1.c cVar) {
        b = UserMessagingPlatform.getConsentInformation(cVar.t());
        ConsentRequestParameters build = new ConsentRequestParameters.Builder().setTagForUnderAgeOfConsent(false).build();
        ConsentInformation consentInformation = b;
        if (consentInformation != null) {
            consentInformation.requestConsentInfoUpdate(cVar.t(), build, new C2362a(cVar), new C2362a(cVar));
        }
    }

    public static void u(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009f A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0003, B:13:0x0025, B:15:0x0028, B:18:0x009f, B:24:0x0036, B:44:0x0074, B:46:0x0077, B:47:0x0089, B:50:0x0082, B:37:0x005e, B:39:0x0061, B:34:0x0070, B:28:0x008a, B:30:0x008d), top: B:3:0x0003, inners: #6, #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final synchronized com.facebook.appevents.r v() {
        /*
            java.lang.Class<com.facebook.appevents.g> r0 = com.facebook.appevents.g.class
            monitor-enter(r0)
            android.content.Context r1 = com.facebook.r.a()     // Catch: java.lang.Throwable -> L32
            r2 = 0
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.FileInputStream r3 = r1.openFileInput(r3)     // Catch: java.io.FileNotFoundException -> L51 java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.String r4 = "context.openFileInput(PERSISTED_EVENTS_FILENAME)"
            G7.j.d(r3, r4)     // Catch: java.io.FileNotFoundException -> L51 java.lang.Throwable -> L53 java.lang.Exception -> L55
            com.facebook.appevents.f r4 = new com.facebook.appevents.f     // Catch: java.io.FileNotFoundException -> L51 java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch: java.io.FileNotFoundException -> L51 java.lang.Throwable -> L53 java.lang.Exception -> L55
            r5.<init>(r3)     // Catch: java.io.FileNotFoundException -> L51 java.lang.Throwable -> L53 java.lang.Exception -> L55
            r4.<init>(r5)     // Catch: java.io.FileNotFoundException -> L51 java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.Object r3 = r4.readObject()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42 java.io.FileNotFoundException -> L8a
            if (r3 == 0) goto L44
            com.facebook.appevents.r r3 = (com.facebook.appevents.r) r3     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42 java.io.FileNotFoundException -> L8a
            com.facebook.internal.H.d(r4)     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r2)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L35
            r1.delete()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L35
            goto L3d
        L32:
            r1 = move-exception
            goto La6
        L35:
            r1 = move-exception
            java.lang.String r2 = "com.facebook.appevents.g"
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r2, r4, r1)     // Catch: java.lang.Throwable -> L32
        L3d:
            r2 = r3
            goto L9d
        L40:
            r2 = move-exception
            goto L74
        L42:
            r3 = move-exception
            goto L57
        L44:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42 java.io.FileNotFoundException -> L8a
            java.lang.String r5 = "null cannot be cast to non-null type com.facebook.appevents.PersistedEvents"
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42 java.io.FileNotFoundException -> L8a
            throw r3     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42 java.io.FileNotFoundException -> L8a
        L4c:
            r4 = r2
            r2 = r3
            goto L74
        L4f:
            r4 = r2
            goto L57
        L51:
            r4 = r2
            goto L8a
        L53:
            r3 = move-exception
            goto L4c
        L55:
            r3 = move-exception
            goto L4f
        L57:
            java.lang.String r5 = "com.facebook.appevents.g"
            java.lang.String r6 = "Got unexpected exception while reading events: "
            android.util.Log.w(r5, r6, r3)     // Catch: java.lang.Throwable -> L40
            com.facebook.internal.H.d(r4)     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L6b
            r1.delete()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L6b
            goto L9d
        L6b:
            r1 = move-exception
            java.lang.String r3 = "com.facebook.appevents.g"
            java.lang.String r4 = "Got unexpected exception when removing events file: "
        L70:
            android.util.Log.w(r3, r4, r1)     // Catch: java.lang.Throwable -> L32
            goto L9d
        L74:
            com.facebook.internal.H.d(r4)     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L81
            r1.delete()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L81
            goto L89
        L81:
            r1 = move-exception
            java.lang.String r3 = "com.facebook.appevents.g"
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r3, r4, r1)     // Catch: java.lang.Throwable -> L32
        L89:
            throw r2     // Catch: java.lang.Throwable -> L32
        L8a:
            com.facebook.internal.H.d(r4)     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L97
            r1.delete()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L97
            goto L9d
        L97:
            r1 = move-exception
            java.lang.String r3 = "com.facebook.appevents.g"
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            goto L70
        L9d:
            if (r2 != 0) goto La4
            com.facebook.appevents.r r2 = new com.facebook.appevents.r     // Catch: java.lang.Throwable -> L32
            r2.<init>()     // Catch: java.lang.Throwable -> L32
        La4:
            monitor-exit(r0)
            return r2
        La6:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.g.v():com.facebook.appevents.r");
    }

    public static final void w(r rVar) {
        Context a6 = com.facebook.r.a();
        ObjectOutputStream objectOutputStream = null;
        try {
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new BufferedOutputStream(a6.openFileOutput("AppEventsLogger.persistedevents", 0)));
            try {
                objectOutputStream2.writeObject(rVar);
                H.d(objectOutputStream2);
            } catch (Throwable th) {
                th = th;
                objectOutputStream = objectOutputStream2;
                try {
                    Log.w("com.facebook.appevents.g", "Got unexpected exception while persisting events: ", th);
                    try {
                        a6.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception unused) {
                    }
                } finally {
                    H.d(objectOutputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static final Object x(V7.t tVar, V7.t tVar2, F7.p pVar) {
        Object c0247o;
        Object L8;
        try {
            v.b(2, pVar);
            c0247o = pVar.g(tVar2, tVar);
        } catch (Throwable th) {
            c0247o = new C0247o(false, th);
        }
        EnumC2928a enumC2928a = EnumC2928a.b;
        if (c0247o != enumC2928a && (L8 = tVar.L(c0247o)) != AbstractC0255x.f2591d) {
            if (!(L8 instanceof C0247o)) {
                return AbstractC0255x.q(L8);
            }
            throw ((C0247o) L8).f2575a;
        }
        return enumC2928a;
    }
}
