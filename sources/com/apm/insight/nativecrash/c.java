package com.apm.insight.nativecrash;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashFilter;
import com.apm.insight.entity.Header;
import com.apm.insight.i;
import com.apm.insight.l.k;
import com.apm.insight.l.o;
import com.apm.insight.l.w;
import com.apm.insight.runtime.q;
import com.apm.insight.runtime.s;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    private static Boolean f5950d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f5951a;
    private JSONObject b = null;

    /* renamed from: c, reason: collision with root package name */
    private b f5952c;

    /* loaded from: classes.dex */
    public static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static String b(File file) {
            BufferedReader bufferedReader;
            String readLine;
            BufferedReader bufferedReader2 = null;
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
                try {
                    readLine = bufferedReader.readLine();
                } catch (Throwable th) {
                    th = th;
                    bufferedReader2 = bufferedReader;
                    try {
                        com.apm.insight.c.a().a("NPTH_CATCH", th);
                        return "";
                    } finally {
                        k.a(bufferedReader2);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
            if (readLine == null) {
                k.a(bufferedReader);
                return "";
            }
            if (!readLine.startsWith("[FATAL:jni_android.cc") || !readLine.contains("Please include Java exception stack in crash report ttwebview:")) {
                k.a(bufferedReader);
                return "";
            }
            StringBuilder sb = new StringBuilder();
            int indexOf = readLine.indexOf(" ttwebview:");
            sb.append("Caused by: ");
            sb.append("Please include Java exception stack in crash report");
            sb.append("\n");
            sb.append(readLine.substring(indexOf + 11));
            while (true) {
                sb.append("\n");
                String readLine2 = bufferedReader.readLine();
                if (readLine2 == null) {
                    String sb2 = sb.toString();
                    k.a(bufferedReader);
                    return sb2;
                }
                sb.append(readLine2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b {
        private final com.apm.insight.nativecrash.e b;

        /* renamed from: c, reason: collision with root package name */
        private final com.apm.insight.nativecrash.a f5954c;

        /* renamed from: d, reason: collision with root package name */
        private final File f5955d;

        /* renamed from: e, reason: collision with root package name */
        private final File f5956e;

        public b(File file) {
            this.f5955d = file;
            this.f5956e = o.a(i.g(), file.getName());
            com.apm.insight.nativecrash.a aVar = new com.apm.insight.nativecrash.a(file);
            this.f5954c = aVar;
            com.apm.insight.nativecrash.e eVar = new com.apm.insight.nativecrash.e(file);
            this.b = eVar;
            if (aVar.a() && eVar.a() == null) {
                eVar.a(file);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x001c A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:15:0x0008, B:17:0x000e, B:5:0x001c), top: B:14:0x0008 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long a() {
            /*
                r3 = this;
                com.apm.insight.nativecrash.a r0 = r3.f5954c
                java.util.Map r0 = r0.c()
                if (r0 == 0) goto L19
                boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L17
                if (r1 != 0) goto L19
                java.lang.String r1 = "start_time"
                java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L17
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L17
                goto L1a
            L17:
                r0 = move-exception
                goto L21
            L19:
                r0 = 0
            L1a:
                if (r0 == 0) goto L2a
                long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Throwable -> L17
                return r0
            L21:
                com.apm.insight.d r1 = com.apm.insight.c.a()
                java.lang.String r2 = "NPTH_CATCH"
                r1.a(r2, r0)
            L2a:
                long r0 = java.lang.System.currentTimeMillis()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.nativecrash.c.b.a():long");
        }

        public File b() {
            return this.f5955d;
        }

        public boolean c() {
            return this.f5954c.a();
        }
    }

    /* renamed from: com.apm.insight.nativecrash.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0003c extends e {
        public C0003c() {
            super();
            this.f5959c = "Total FD Count:";
            this.b = o.i(c.this.f5952c.b());
            this.f5960d = ":";
            this.f5961e = -2;
        }
    }

    /* loaded from: classes.dex */
    public class d extends e {
        public d() {
            super();
            this.f5959c = "VmSize:";
            this.b = o.k(c.this.f5952c.b());
            this.f5960d = "\\s+";
            this.f5961e = -1;
        }
    }

    /* loaded from: classes.dex */
    public class e {
        protected File b;

        /* renamed from: c, reason: collision with root package name */
        protected String f5959c;

        /* renamed from: d, reason: collision with root package name */
        protected String f5960d;

        /* renamed from: e, reason: collision with root package name */
        protected int f5961e;

        public e() {
        }

        public int a() {
            int i9;
            Throwable th;
            if (!this.b.exists() || !this.b.isFile()) {
                return -1;
            }
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.b));
                int i10 = -1;
                do {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        i10 = a(readLine);
                    } catch (Throwable th2) {
                        th = th2;
                        i9 = i10;
                        bufferedReader = bufferedReader2;
                        try {
                            com.apm.insight.c.a().a("NPTH_CATCH", th);
                            return i9;
                        } finally {
                            if (bufferedReader != null) {
                                k.a(bufferedReader);
                            }
                        }
                    }
                } while (i10 == -1);
                k.a(bufferedReader2);
                return i10;
            } catch (Throwable th3) {
                i9 = -1;
                th = th3;
            }
        }

        public int a(String str) {
            int i9 = this.f5961e;
            if (!str.startsWith(this.f5959c)) {
                return i9;
            }
            try {
                i9 = Integer.parseInt(str.split(this.f5960d)[1].trim());
            } catch (NumberFormatException e4) {
                com.apm.insight.c.a().a("NPTH_CATCH", e4);
            }
            if (i9 < 0) {
                return -2;
            }
            return i9;
        }
    }

    /* loaded from: classes.dex */
    public class f extends e {
        public f() {
            super();
            this.f5959c = "Total Threads Count:";
            this.b = o.j(c.this.f5952c.b());
            this.f5960d = ":";
            this.f5961e = -2;
        }
    }

    public c(Context context) {
        this.f5951a = context;
    }

    private void c(com.apm.insight.entity.a aVar) {
        Map<String, String> b8 = this.f5952c.b.b();
        if (b8.isEmpty()) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (String str : b8.keySet()) {
            String a6 = a(b8.get(str));
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("lib_name", str);
                jSONObject.put("lib_uuid", a6);
                jSONArray.put(jSONObject);
            } catch (JSONException e4) {
                com.apm.insight.c.a().a("NPTH_CATCH", e4);
            }
        }
        aVar.a("crash_lib_uuid", (Object) jSONArray);
    }

    private void f(com.apm.insight.entity.a aVar) {
        File a6 = o.a(this.f5952c.b());
        if (a6.exists()) {
            try {
                aVar.a("native_log", (Object) com.apm.insight.l.i.b(com.apm.insight.l.i.a(a6.getAbsolutePath(), "\n"), "\n"));
            } catch (Throwable th) {
                com.apm.insight.c.a().a("NPTH_CATCH", th);
            }
        }
    }

    private void g(com.apm.insight.entity.a aVar) {
        BufferedReader bufferedReader;
        File h6 = o.h(this.f5952c.b());
        if (!h6.exists()) {
            NativeImpl.a(h6.getAbsolutePath(), String.valueOf(i.i().getLogcatDumpCount()), String.valueOf(i.i().getLogcatLevel()));
        }
        JSONArray jSONArray = new JSONArray();
        String h9 = AbstractC2914a.h(new StringBuilder(" "), this.f5952c.f5954c.c().get("pid"), " ");
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(h6));
        } catch (Throwable unused) {
        }
        try {
            if (h6.length() > 512000) {
                bufferedReader.skip(h6.length() - 512000);
            }
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                if ((readLine.length() > 32 ? readLine.substring(0, 31) : readLine).contains(h9)) {
                    jSONArray.put(readLine);
                }
            }
            k.a(bufferedReader);
        } catch (Throwable unused2) {
            bufferedReader2 = bufferedReader;
            k.a(bufferedReader2);
            aVar.a("logcat", (Object) jSONArray);
        }
        aVar.a("logcat", (Object) jSONArray);
    }

    public static long i() {
        if (NativeImpl.e()) {
            return Long.MAX_VALUE;
        }
        return Header.a() ? 3891200L : 2867200L;
    }

    public static boolean m() {
        Boolean bool = f5950d;
        if (bool != null) {
            return bool.booleanValue();
        }
        String[] strArr = {"/data/local/su", "/data/local/bin/su", "/data/local/xbin/su", "/system/xbin/su", "/system/bin/su", "/system/bin/.ext/su", "/system/bin/failsafe/su", "/system/sd/xbin/su", "/system/usr/we-need-root/su", "/sbin/su", "/su/bin/su"};
        for (int i9 = 0; i9 < 11; i9++) {
            try {
            } catch (Throwable th) {
                com.apm.insight.c.a().a("NPTH_CATCH", th);
            }
            if (new File(strArr[i9]).exists()) {
                f5950d = Boolean.TRUE;
                return true;
            }
            continue;
        }
        f5950d = Boolean.FALSE;
        return false;
    }

    private Header n() {
        Header header = new Header(this.f5951a);
        JSONObject a6 = s.a().a(this.f5952c.a());
        if (a6 != null) {
            header.a(a6);
            header.d();
            header.e();
        }
        Header.b(header);
        return header;
    }

    private int o() {
        return new C0003c().a();
    }

    private int p() {
        return new f().a();
    }

    private int q() {
        return new d().a();
    }

    @Nullable
    public String b() {
        b bVar = this.f5952c;
        if (bVar == null) {
            return null;
        }
        String c9 = bVar.b.c();
        return (c9 == null || c9.isEmpty()) ? this.f5952c.f5954c.b() : c9;
    }

    public JSONObject d() {
        File f9 = o.f(this.f5952c.b());
        if (!f9.exists()) {
            return null;
        }
        try {
            String c9 = com.apm.insight.l.i.c(f9.getAbsolutePath());
            if (c9 != null && !c9.isEmpty()) {
                return new JSONObject(c9);
            }
        } catch (Throwable th) {
            com.apm.insight.c.a().a("NPTH_CATCH", th);
        }
        return null;
    }

    public void e() {
        try {
            File e4 = o.e(this.f5952c.b());
            File file = new File(e4.getAbsolutePath() + ".tmp'");
            if (file.exists()) {
                file.delete();
            }
            int i9 = 0;
            if (e4.exists()) {
                while (i9 < com.apm.insight.nativecrash.b.a()) {
                    File file2 = new File(e4.getAbsolutePath() + '.' + i9);
                    if (file2.exists()) {
                        file2.delete();
                    }
                    i9++;
                }
                return;
            }
            com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
            for (int i10 = 0; i10 < com.apm.insight.nativecrash.b.a(); i10++) {
                File file3 = new File(e4.getAbsolutePath() + '.' + i10);
                if (file3.exists()) {
                    try {
                        String c9 = com.apm.insight.l.i.c(file3.getAbsolutePath());
                        if (!TextUtils.isEmpty(c9)) {
                            JSONObject jSONObject = new JSONObject(c9);
                            if (jSONObject.length() > 0) {
                                aVar.c(jSONObject);
                            }
                        }
                    } catch (JSONException e9) {
                        com.apm.insight.c.a().a("NPTH_CATCH", e9);
                    }
                }
            }
            JSONObject h6 = aVar.h();
            try {
                if (h6.length() != 0 && h6.opt("storage") == null) {
                    com.apm.insight.entity.a.a(h6, w.a(i.g()));
                }
            } catch (Throwable unused) {
            }
            if (h6.length() != 0) {
                this.b = h6;
                com.apm.insight.l.i.b(file, h6, false);
                if (file.renameTo(e4)) {
                    while (i9 < com.apm.insight.nativecrash.b.a()) {
                        File file4 = new File(e4.getAbsolutePath() + '.' + i9);
                        if (file4.exists()) {
                            file4.delete();
                        }
                        i9++;
                    }
                }
            }
        } catch (IOException e10) {
            com.apm.insight.c.a().a("NPTH_CATCH", e10);
        }
    }

    public void h() {
        com.apm.insight.e.a.a().a(com.apm.insight.e.a.a.a(o.f(this.f5952c.b()).getAbsolutePath()));
    }

    public JSONObject j() {
        try {
            com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
            a(aVar);
            h(aVar);
            c(aVar);
            d(aVar);
            e(aVar);
            g(aVar);
            f(aVar);
            b(aVar);
            File f9 = o.f(this.f5952c.b());
            JSONObject h6 = aVar.h();
            com.apm.insight.l.i.a(f9, h6, false);
            return h6;
        } catch (Throwable th) {
            com.apm.insight.c.a().a("NPTH_CATCH", th);
            return null;
        }
    }

    public boolean k() {
        return com.apm.insight.l.i.a(this.f5952c.b());
    }

    public void l() {
        try {
            com.apm.insight.l.i.c(this.f5952c.b().getAbsolutePath(), Environment.getExternalStorageDirectory().getAbsolutePath() + "/localDebug/" + i.g().getPackageName() + "/" + this.f5952c.b().getName() + ".zip");
        } catch (Throwable th) {
            com.apm.insight.c.a().a("NPTH_CATCH", th);
        }
    }

    private String a(String str) {
        StringBuilder sb = new StringBuilder();
        try {
            if (str.length() < 16) {
                sb.append(str);
            } else {
                sb.append(str.charAt(6));
                sb.append(str.charAt(7));
                sb.append(str.charAt(4));
                sb.append(str.charAt(5));
                sb.append(str.charAt(2));
                sb.append(str.charAt(3));
                sb.append(str.charAt(0));
                sb.append(str.charAt(1));
                sb.append(str.charAt(10));
                sb.append(str.charAt(11));
                sb.append(str.charAt(8));
                sb.append(str.charAt(9));
                sb.append(str.charAt(14));
                sb.append(str.charAt(15));
                sb.append(str.charAt(12));
                sb.append(str.charAt(13));
                if (str.length() >= 32) {
                    sb.append((CharSequence) str, 16, 32);
                    sb.append('0');
                }
            }
        } catch (Throwable th) {
            com.apm.insight.c.a().a("NPTH_CATCH", th);
        }
        return sb.toString().toUpperCase();
    }

    private void b(com.apm.insight.entity.a aVar) {
        com.apm.insight.entity.d.b(aVar.h());
        HashMap hashMap = new HashMap();
        if (m()) {
            hashMap.put("is_root", "true");
            aVar.a("is_root", "true");
        } else {
            hashMap.put("is_root", "false");
            aVar.a("is_root", "false");
        }
        a(hashMap);
        int o3 = o();
        if (o3 > 0) {
            if (o3 > 960) {
                hashMap.put("fd_leak", "true");
            } else {
                hashMap.put("fd_leak", "false");
            }
            aVar.a("fd_count", Integer.valueOf(o3));
        }
        int p2 = p();
        if (p2 > 0) {
            if (p2 > 350) {
                hashMap.put("threads_leak", "true");
            } else {
                hashMap.put("threads_leak", "false");
            }
            aVar.a("threads_count", Integer.valueOf(p2));
        }
        int q9 = q();
        if (q9 > 0) {
            if (q9 > i()) {
                hashMap.put("memory_leak", "true");
            } else {
                hashMap.put("memory_leak", "false");
            }
            aVar.a("memory_size", Integer.valueOf(q9));
        }
        hashMap.put("sdk_version", "1.3.8.nourl-alpha.19");
        hashMap.put("has_java_stack", String.valueOf(aVar.h().opt("java_data") != null));
        JSONArray a6 = com.apm.insight.nativecrash.d.a(o.l(this.f5952c.f5955d), o.m(this.f5952c.f5955d));
        hashMap.put("leak_threads_count", String.valueOf(a6.length()));
        if (a6.length() > 0) {
            try {
                com.apm.insight.l.i.a(o.n(this.f5952c.f5955d), a6, false);
            } catch (Throwable unused) {
            }
        }
        aVar.b();
        aVar.c();
        aVar.c(hashMap);
    }

    private void d(com.apm.insight.entity.a aVar) {
        File e4 = o.e(this.f5952c.b());
        if (!e4.exists() && this.b == null) {
            aVar.b(w.a(i.g()));
            aVar.a("has_callback", "false");
            return;
        }
        try {
            JSONObject jSONObject = this.b;
            if (jSONObject == null) {
                jSONObject = new JSONObject(com.apm.insight.l.i.c(e4.getAbsolutePath()));
            }
            aVar.c(jSONObject);
            aVar.a("has_callback", "true");
            if (aVar.h().opt("storage") == null) {
                aVar.b(w.a(i.g()));
            }
            com.apm.insight.l.s.a(aVar, aVar.i(), CrashType.NATIVE);
        } catch (Throwable th) {
            com.apm.insight.c.a().a("NPTH_CATCH", th);
        }
        long j7 = -1;
        long optLong = aVar.h().optLong("crash_time", -1L);
        long optLong2 = aVar.h().optLong("java_end", -1L);
        if (optLong2 != -1 && optLong != -1) {
            j7 = optLong2 - optLong;
        }
        try {
            aVar.b("total_cost", String.valueOf(j7));
            aVar.a("total_cost", String.valueOf(j7 / 1000));
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:11:0x0047, B:13:0x004d), top: B:10:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void e(com.apm.insight.entity.a r5) {
        /*
            r4 = this;
            com.apm.insight.nativecrash.c$b r0 = r4.f5952c
            java.io.File r0 = r0.b()
            java.io.File r0 = com.apm.insight.l.o.g(r0)
            boolean r1 = r0.exists()
            java.lang.String r2 = "NPTH_CATCH"
            if (r1 == 0) goto L23
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = com.apm.insight.l.v.a(r0)     // Catch: java.lang.Throwable -> L1b
            goto L25
        L1b:
            r0 = move-exception
            com.apm.insight.d r1 = com.apm.insight.c.a()
            r1.a(r2, r0)
        L23:
            java.lang.String r0 = ""
        L25:
            com.apm.insight.nativecrash.c$b r1 = r4.f5952c
            java.io.File r1 = r1.b()
            java.io.File r1 = com.apm.insight.l.o.o(r1)
            boolean r3 = r1.exists()
            if (r3 == 0) goto L47
            java.lang.String r1 = com.apm.insight.nativecrash.c.a.a(r1)
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L46
            java.lang.String r3 = "\n"
            java.lang.String r0 = com.mbridge.msdk.foundation.entity.o.k(r0, r3, r1)
            goto L47
        L46:
            r0 = r1
        L47:
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L53
            if (r1 != 0) goto L5b
            java.lang.String r1 = "java_data"
            r5.a(r1, r0)     // Catch: java.lang.Throwable -> L53
            goto L5b
        L53:
            r5 = move-exception
            com.apm.insight.d r0 = com.apm.insight.c.a()
            r0.a(r2, r5)
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.nativecrash.c.e(com.apm.insight.entity.a):void");
    }

    private void h(com.apm.insight.entity.a aVar) {
        Map<String, String> a6 = a();
        if (a6 == null || aVar == null) {
            return;
        }
        String str = a6.get("process_name");
        if (str != null) {
            aVar.a("process_name", (Object) str);
        }
        String str2 = a6.get("start_time");
        if (str2 != null) {
            try {
                aVar.a(Long.decode(str2).longValue());
            } catch (Throwable th) {
                com.apm.insight.c.a().a("NPTH_CATCH", th);
            }
        }
        String str3 = a6.get("pid");
        if (str3 != null) {
            try {
                aVar.a("pid", Long.decode(str3));
            } catch (Throwable th2) {
                com.apm.insight.c.a().a("NPTH_CATCH", th2);
            }
        }
        String str4 = a6.get("crash_thread_name");
        if (str4 != null) {
            aVar.a("crash_thread_name", (Object) str4);
        }
        String str5 = a6.get("crash_time");
        if (str5 != null) {
            try {
                aVar.a("crash_time", Long.decode(str5));
            } catch (Throwable th3) {
                com.apm.insight.c.a().a("NPTH_CATCH", th3);
            }
        }
        aVar.a(DataSchemeDataSource.SCHEME_DATA, (Object) b());
    }

    public boolean c() {
        b bVar = this.f5952c;
        if (bVar != null) {
            return bVar.c();
        }
        return false;
    }

    public boolean f() {
        ICrashFilter b8 = i.b().b();
        if (b8 == null) {
            return true;
        }
        try {
            return b8.onNativeCrashFilter(b(), "");
        } catch (Throwable th) {
            com.apm.insight.c.a().a("NPTH_CATCH", th);
            return true;
        }
    }

    public Map<String, String> a() {
        b bVar = this.f5952c;
        if (bVar != null) {
            return bVar.f5954c.c();
        }
        return null;
    }

    private void a(com.apm.insight.entity.a aVar) {
        aVar.a(n());
        aVar.a("is_native_crash", (Object) 1);
        aVar.a("repack_time", Long.valueOf(System.currentTimeMillis()));
        aVar.a("crash_uuid", (Object) this.f5952c.b().getName());
        aVar.a("jiffy", Long.valueOf(q.a.a()));
    }

    public void a(File file) {
        this.f5952c = new b(file);
    }

    private void a(Map<String, String> map) {
        map.put("has_fds_file", o.i(this.f5952c.b()).exists() ? "true" : "false");
        File h6 = o.h(this.f5952c.b());
        map.put("has_logcat_file", (!h6.exists() || h6.length() <= 128) ? "false" : "true");
        map.put("has_maps_file", o.d(this.f5952c.b()).exists() ? "true" : "false");
        map.put("has_tombstone_file", o.b(this.f5952c.b()).exists() ? "true" : "false");
        map.put("has_meminfo_file", o.k(this.f5952c.b()).exists() ? "true" : "false");
        map.put("has_threads_file", o.j(this.f5952c.b()).exists() ? "true" : "false");
    }

    public boolean g() {
        return com.apm.insight.e.a.a().a(o.f(this.f5952c.b()).getAbsolutePath());
    }
}
