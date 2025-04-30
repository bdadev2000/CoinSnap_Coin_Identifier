package com.apm.insight.l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.l.e;
import com.apm.insight.nativecrash.NativeImpl;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private static final StackTraceElement f5943a = new StackTraceElement("", "", "", 0);

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f5944a;
        public int b;

        public a(int i9, int i10) {
            this.f5944a = i9;
            this.b = i10;
        }

        public JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("start", this.f5944a);
                jSONObject.put(TtmlNode.END, this.b);
            } catch (Throwable unused) {
            }
            return jSONObject;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r8) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.io.File r0 = new java.io.File
            r0.<init>(r8)
            boolean r8 = r0.exists()
            if (r8 != 0) goto L14
            return r1
        L14:
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 10
            r5 = 0
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L5c
            java.io.FileReader r7 = new java.io.FileReader     // Catch: java.lang.Throwable -> L5c
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L5c
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L5c
            r0 = r5
        L31:
            java.lang.String r1 = r6.readLine()     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L58
            r7 = 256(0x100, float:3.59E-43)
            if (r0 > r7) goto L47
            r8.add(r1)     // Catch: java.lang.Throwable -> L45
            r3.append(r1)     // Catch: java.lang.Throwable -> L45
            r3.append(r4)     // Catch: java.lang.Throwable -> L45
            goto L55
        L45:
            r1 = r6
            goto L5c
        L47:
            r2.add(r1)     // Catch: java.lang.Throwable -> L45
            int r1 = r2.size()     // Catch: java.lang.Throwable -> L45
            if (r1 <= r7) goto L55
            r2.poll()     // Catch: java.lang.Throwable -> L45
            int r5 = r5 + 1
        L55:
            int r0 = r0 + 1
            goto L31
        L58:
            com.apm.insight.l.k.a(r6)
            goto L5f
        L5c:
            com.apm.insight.l.k.a(r1)
        L5f:
            boolean r8 = r2.isEmpty()
            if (r8 != 0) goto L8b
            if (r5 == 0) goto L74
            java.lang.String r8 = "\t... skip "
            r3.append(r8)
            r3.append(r5)
            java.lang.String r8 = " lines\n"
            r3.append(r8)
        L74:
            java.util.Iterator r8 = r2.iterator()
        L78:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L8b
            java.lang.Object r0 = r8.next()
            java.lang.String r0 = (java.lang.String) r0
            r3.append(r0)
            r3.append(r4)
            goto L78
        L8b:
            java.lang.String r8 = r3.toString()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.l.v.a(java.lang.String):java.lang.String");
    }

    @Nullable
    public static JSONObject b(String str) {
        try {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            JSONObject jSONObject = new JSONObject();
            if (allStackTraces == null) {
                return null;
            }
            jSONObject.put("thread_all_count", allStackTraces.size());
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
                JSONObject jSONObject2 = new JSONObject();
                Thread key = entry.getKey();
                String name = key.getName();
                if (!c(name) && (str == null || (!str.equals(name) && !name.startsWith(str) && !name.endsWith(str)))) {
                    jSONObject2.put("thread_name", key.getName() + "(" + key.getId() + ")");
                    StackTraceElement[] value = entry.getValue();
                    if (value != null) {
                        JSONArray jSONArray2 = new JSONArray();
                        for (StackTraceElement stackTraceElement : value) {
                            jSONArray2.put(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + "(" + stackTraceElement.getLineNumber() + ")");
                        }
                        jSONObject2.put("thread_stack", jSONArray2);
                        if (jSONArray2.length() > 0) {
                        }
                    }
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("thread_stacks", jSONArray);
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void c(Throwable th, int i9) {
        if (th == null || i9 <= 0) {
            return;
        }
        b(th, i9);
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            a(stackTraceElement, i9);
        }
        for (Throwable th2 : th.getSuppressed()) {
            a(th2, i9, "Suppressed: ", "\t");
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            a(cause, i9, "Caused by: ", "");
        }
    }

    public static boolean d(Throwable th) {
        if (th == null) {
            return false;
        }
        int i9 = 0;
        while (th != null) {
            try {
                if ((th instanceof OutOfMemoryError) && (th.getMessage().contains("allocate") || th.getMessage().contains("thrown"))) {
                    return true;
                }
                if (i9 > 20) {
                    return false;
                }
                i9++;
                th = th.getCause();
            } catch (Throwable unused) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @NonNull
    public static String a(@NonNull Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            a(th, printWriter);
            String stringWriter2 = stringWriter.toString();
            printWriter.close();
            return stringWriter2;
        } catch (Throwable unused) {
            printWriter.close();
            return "";
        }
    }

    private static void b(Throwable th, int i9) {
        th.getClass();
        String localizedMessage = th.getLocalizedMessage();
        try {
            a(th.getClass().getName(), i9);
            if (localizedMessage != null) {
                a(": ", i9);
                a(localizedMessage, i9);
            }
            a("\n", i9);
        } catch (Throwable unused) {
        }
    }

    private static boolean c(String str) {
        Set<String> a6 = j.a();
        if (a6.contains(str)) {
            return true;
        }
        for (String str2 : a6) {
            if (!TextUtils.isEmpty(str) && str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public static String a(@NonNull Throwable th, Thread thread, PrintStream printStream, e.a aVar) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance(SameMD5.TAG);
        } catch (Throwable unused) {
            messageDigest = null;
        }
        e eVar = new e(printStream, messageDigest, aVar);
        try {
            a(th, eVar);
        } catch (Throwable unused2) {
        }
        eVar.close();
        if (messageDigest != null) {
            return a(messageDigest.digest());
        }
        return null;
    }

    public static StackTraceElement[] b(@NonNull Throwable th) {
        ArrayList arrayList = new ArrayList();
        try {
            a(th, arrayList);
        } catch (Throwable unused) {
        }
        return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[arrayList.size()]);
    }

    public static boolean c(Throwable th) {
        if (th == null) {
            return false;
        }
        int i9 = 0;
        while (th != null) {
            try {
                if (th instanceof OutOfMemoryError) {
                    return true;
                }
                if (i9 > 20) {
                    return false;
                }
                i9++;
                th = th.getCause();
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    private static String a(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[bArr.length * 2];
        int i9 = 0;
        for (byte b : bArr) {
            int i10 = i9 + 1;
            cArr2[i9] = cArr[(b >>> 4) & 15];
            i9 += 2;
            cArr2[i10] = cArr[b & Ascii.SI];
        }
        return new String(cArr2);
    }

    public static String a(StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            a(stackTraceElement, sb);
        }
        return sb.toString();
    }

    public static StringBuilder a(StackTraceElement stackTraceElement, StringBuilder sb) {
        String className = stackTraceElement.getClassName();
        sb.append("  at ");
        sb.append(className);
        sb.append(".");
        sb.append(stackTraceElement.getMethodName());
        sb.append("(");
        sb.append(stackTraceElement.getFileName());
        sb.append(":");
        sb.append(stackTraceElement.getLineNumber());
        sb.append(")\n");
        return sb;
    }

    public static JSONArray a(StackTraceElement[] stackTraceElementArr, String[] strArr) {
        a aVar = new a(-1, -1);
        JSONArray jSONArray = new JSONArray();
        for (int i9 = 0; i9 < stackTraceElementArr.length; i9++) {
            if (aVar.f5944a == -1) {
                if (a(stackTraceElementArr[i9].getClassName(), strArr)) {
                    aVar.f5944a = i9;
                    aVar.b = i9;
                }
            } else if (!a(stackTraceElementArr[i9].getClassName(), strArr)) {
                aVar.b = i9;
                jSONArray.put(aVar.a());
                aVar = new a(-1, -1);
            }
        }
        if (aVar.f5944a != -1) {
            aVar.b = stackTraceElementArr.length;
            jSONArray.put(aVar.a());
        }
        return jSONArray;
    }

    public static JSONArray a(String[] strArr, String[] strArr2) {
        a aVar = new a(-1, -1);
        JSONArray jSONArray = new JSONArray();
        for (int i9 = 0; i9 < strArr.length; i9++) {
            if (aVar.f5944a == -1) {
                if (a(strArr[i9], strArr2)) {
                    aVar.f5944a = i9;
                    aVar.b = i9;
                }
            } else if (!a(strArr[i9], strArr2)) {
                aVar.b = i9;
                jSONArray.put(aVar.a());
                aVar = new a(-1, -1);
            }
        }
        if (aVar.f5944a != -1) {
            aVar.b = strArr.length;
            jSONArray.put(aVar.a());
        }
        return jSONArray;
    }

    private static void a(StackTraceElement stackTraceElement, int i9) {
        String str;
        String valueOf;
        try {
            a("\tat ", i9);
            a(stackTraceElement.getClassName(), i9);
            a(".", i9);
            a(stackTraceElement.getMethodName(), i9);
            if (!stackTraceElement.isNativeMethod()) {
                if (stackTraceElement.getFileName() != null) {
                    if (stackTraceElement.getLineNumber() >= 0) {
                        a("(", i9);
                        a(stackTraceElement.getFileName(), i9);
                        a(":", i9);
                        valueOf = String.valueOf(stackTraceElement.getLineNumber());
                    } else {
                        a("(", i9);
                        valueOf = stackTraceElement.getFileName();
                    }
                } else if (stackTraceElement.getLineNumber() >= 0) {
                    a("(Unknown Source:", i9);
                    valueOf = String.valueOf(stackTraceElement.getLineNumber());
                } else {
                    str = "(Unknown Source)";
                }
                a(valueOf, i9);
                a(")", i9);
                a("\n", i9);
            }
            str = "(Native Method)";
            a(str, i9);
            a("\n", i9);
        } catch (Throwable unused) {
        }
    }

    private static void a(String str, int i9) {
        NativeImpl.a(i9, str);
    }

    public static void a(@NonNull Throwable th, int i9) {
        try {
            c(th, i9);
        } catch (Throwable unused) {
        }
    }

    private static void a(Throwable th, int i9, String str, String str2) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        try {
            NativeImpl.a(i9, str2);
            NativeImpl.a(i9, str);
        } catch (Throwable unused) {
        }
        b(th, i9);
        for (StackTraceElement stackTraceElement : stackTrace) {
            a(stackTraceElement, i9);
        }
        for (Throwable th2 : th.getSuppressed()) {
            a(th2, i9, "Suppressed: ", com.mbridge.msdk.foundation.entity.o.j(str2, "\t"));
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            a(cause, i9, "Caused by: ", str2);
        }
    }

    private static void a(Throwable th, PrintWriter printWriter) {
        if (th == null || printWriter == null) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        newSetFromMap.add(th);
        printWriter.println(th);
        StackTraceElement[] stackTrace = th.getStackTrace();
        boolean z8 = stackTrace.length > 384;
        int length = stackTrace.length;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i9 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i9];
            if (z8 && i10 > 256) {
                StringBuilder sb = new StringBuilder("\t... skip ");
                sb.append((stackTrace.length - i10) - 128);
                sb.append(" lines");
                printWriter.println(sb.toString());
                break;
            }
            printWriter.println("\tat " + stackTraceElement);
            i10++;
            i9++;
        }
        if (z8) {
            for (int length2 = stackTrace.length - 128; length2 < stackTrace.length; length2++) {
                printWriter.println("\tat " + stackTrace[length2]);
            }
        }
        for (Throwable th2 : th.getSuppressed()) {
            a(th2, printWriter, stackTrace, "Suppressed: ", "\t", (Set<Throwable>) newSetFromMap, 128);
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            a(cause, printWriter, stackTrace, "Caused by: ", "", (Set<Throwable>) newSetFromMap, 128);
        }
    }

    private static void a(Throwable th, PrintWriter printWriter, StackTraceElement[] stackTraceElementArr, String str, String str2, Set<Throwable> set, int i9) {
        if (set.contains(th)) {
            printWriter.println("\t[CIRCULAR REFERENCE:" + th + "]");
            return;
        }
        set.add(th);
        StackTraceElement[] stackTrace = th.getStackTrace();
        boolean z8 = stackTrace.length > i9;
        printWriter.println(str2 + str + th);
        int length = stackTrace.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i10];
            if (z8 && i11 > i9) {
                printWriter.println("\t... skip " + ((stackTrace.length - i11) - (i9 / 2)) + " lines");
                break;
            }
            printWriter.println("\tat " + stackTraceElement);
            i11++;
            i10++;
        }
        if (z8) {
            for (int length2 = stackTrace.length - (i9 / 2); length2 < stackTrace.length; length2++) {
                printWriter.println("\tat " + stackTrace[length2]);
            }
        }
        for (Throwable th2 : th.getSuppressed()) {
            int i12 = i9 / 2;
            a(th2, printWriter, stackTrace, "Suppressed: ", com.mbridge.msdk.foundation.entity.o.j(str2, "\t"), set, i12 > 10 ? i12 : 10);
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            int i13 = i9 / 2;
            a(cause, printWriter, stackTrace, "Caused by: ", str2, set, i13 > 10 ? i13 : 10);
        }
    }

    private static void a(Throwable th, List<StackTraceElement> list) {
        if (th == null || list == null) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        newSetFromMap.add(th);
        list.add(f5943a);
        StackTraceElement[] stackTrace = th.getStackTrace();
        boolean z8 = stackTrace.length > 384;
        int length = stackTrace.length;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i9 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i9];
            if (z8 && i10 > 256) {
                list.add(f5943a);
                break;
            } else {
                list.add(stackTraceElement);
                i10++;
                i9++;
            }
        }
        if (z8) {
            for (int length2 = stackTrace.length - 128; length2 < stackTrace.length; length2++) {
                list.add(stackTrace[length2]);
            }
        }
        for (Throwable th2 : th.getSuppressed()) {
            a(th2, list, stackTrace, "Suppressed: ", "\t", (Set<Throwable>) newSetFromMap, 128);
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            a(cause, list, stackTrace, "Caused by: ", "", (Set<Throwable>) newSetFromMap, 128);
        }
    }

    private static void a(Throwable th, List<StackTraceElement> list, StackTraceElement[] stackTraceElementArr, String str, String str2, Set<Throwable> set, int i9) {
        if (set.contains(th)) {
            list.add(f5943a);
            return;
        }
        set.add(th);
        StackTraceElement[] stackTrace = th.getStackTrace();
        boolean z8 = stackTrace.length > i9;
        list.add(f5943a);
        int length = stackTrace.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i10];
            if (z8 && i11 > i9) {
                list.add(f5943a);
                break;
            } else {
                list.add(stackTraceElement);
                i11++;
                i10++;
            }
        }
        if (z8) {
            for (int length2 = stackTrace.length - (i9 / 2); length2 < stackTrace.length; length2++) {
                list.add(stackTrace[length2]);
            }
        }
        for (Throwable th2 : th.getSuppressed()) {
            int i12 = i9 / 2;
            a(th2, list, stackTrace, "Suppressed: ", com.mbridge.msdk.foundation.entity.o.j(str2, "\t"), set, i12 > 10 ? i12 : 10);
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            int i13 = i9 / 2;
            a(cause, list, stackTrace, "Caused by: ", str2, set, i13 > 10 ? i13 : 10);
        }
    }

    public static boolean a(String str, String[] strArr) {
        if (strArr != null && !TextUtils.isEmpty(str)) {
            for (String str2 : strArr) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
