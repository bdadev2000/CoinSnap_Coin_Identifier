package com.apm.insight.nativecrash;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.apm.insight.l.i;
import com.apm.insight.l.k;
import com.apm.insight.l.o;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class d {

    /* loaded from: classes.dex */
    public static class a extends c {
        public a(File file) {
            super(file);
            this.b = "Total FD Count:";
            this.f5965c = ":";
            this.f5966d = -2;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends c {
        public b(File file) {
            super(file);
            this.b = "VmSize:";
            this.f5965c = "\\s+";
            this.f5966d = -1;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        protected File f5964a;
        protected String b;

        /* renamed from: c, reason: collision with root package name */
        protected String f5965c;

        /* renamed from: d, reason: collision with root package name */
        protected int f5966d;

        public c(File file) {
            this.f5964a = file;
        }

        public int a() {
            int i9;
            Throwable th;
            if (!this.f5964a.exists() || !this.f5964a.isFile()) {
                return -1;
            }
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.f5964a));
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
            int i9 = this.f5966d;
            if (!str.startsWith(this.b)) {
                return i9;
            }
            try {
                i9 = Integer.parseInt(str.split(this.f5965c)[1].trim());
            } catch (NumberFormatException e4) {
                com.apm.insight.c.a().a("NPTH_CATCH", e4);
            }
            if (i9 < 0) {
                return -2;
            }
            return i9;
        }
    }

    /* renamed from: com.apm.insight.nativecrash.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0004d extends c {
        public C0004d(File file) {
            super(file);
        }

        @NonNull
        public HashMap<String, List<String>> b() {
            JSONArray b;
            HashMap<String, List<String>> hashMap = new HashMap<>();
            try {
                b = i.b(this.f5964a.getAbsolutePath());
            } catch (IOException unused) {
            } catch (Throwable th) {
                com.apm.insight.c.a().a("NPTH_CATCH", th);
            }
            if (b == null) {
                return hashMap;
            }
            for (int i9 = 0; i9 < b.length(); i9++) {
                String optString = b.optString(i9);
                if (!TextUtils.isEmpty(optString) && optString.startsWith("[tid:0") && optString.endsWith("sigstack:0x0]")) {
                    int indexOf = optString.indexOf("[routine:0x");
                    int i10 = indexOf + 11;
                    String substring = indexOf > 0 ? optString.substring(i10, optString.indexOf(93, i10)) : "unknown addr";
                    List<String> list = hashMap.get(substring);
                    if (list == null) {
                        list = new ArrayList<>();
                        hashMap.put(substring, list);
                    }
                    list.add(optString);
                }
            }
            return hashMap;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends c {
        public e(File file) {
            super(file);
        }

        @NonNull
        public JSONArray a(HashMap<String, List<String>> hashMap) {
            JSONArray b;
            int indexOf;
            List<String> list;
            JSONArray jSONArray = new JSONArray();
            if (hashMap.isEmpty()) {
                return jSONArray;
            }
            try {
                b = i.b(this.f5964a.getAbsolutePath());
            } catch (IOException unused) {
            } catch (Throwable th) {
                com.apm.insight.c.a().a("NPTH_CATCH", th);
            }
            if (b == null) {
                return jSONArray;
            }
            for (int i9 = 0; i9 < b.length(); i9++) {
                String optString = b.optString(i9);
                if (!TextUtils.isEmpty(optString) && (indexOf = optString.indexOf(":")) > 2) {
                    String substring = optString.substring(2, indexOf);
                    if (hashMap.containsKey(substring) && (list = hashMap.get(substring)) != null) {
                        Iterator<String> it = list.iterator();
                        while (it.hasNext()) {
                            jSONArray.put(it.next() + " " + optString);
                        }
                        hashMap.remove(substring);
                    }
                }
            }
            Iterator<List<String>> it2 = hashMap.values().iterator();
            while (it2.hasNext()) {
                Iterator<String> it3 = it2.next().iterator();
                while (it3.hasNext()) {
                    jSONArray.put(it3.next() + "  0x000000:unknown");
                }
            }
            return jSONArray;
        }
    }

    /* loaded from: classes.dex */
    public static class f extends c {
        public f(File file) {
            super(file);
            this.b = "Total Threads Count:";
            this.f5965c = ":";
            this.f5966d = -2;
        }
    }

    public static int a(String str) {
        return new a(o.b(str)).a();
    }

    public static int b(String str) {
        return new f(o.c(str)).a();
    }

    public static int c(String str) {
        return new b(o.d(str)).a();
    }

    @NonNull
    public static JSONArray a(File file, File file2) {
        return new e(file2).a(new C0004d(file).b());
    }
}
