package com.apm.insight.runtime;

import Q7.n0;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.apm.insight.entity.Header;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x0.AbstractC2914a;
import y.AbstractC2933a;

/* loaded from: classes.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    private static s f6067a;
    private File b;

    /* renamed from: c, reason: collision with root package name */
    private File f6068c;

    /* renamed from: d, reason: collision with root package name */
    private File f6069d;

    /* renamed from: e, reason: collision with root package name */
    private Context f6070e;

    /* renamed from: f, reason: collision with root package name */
    private a f6071f = null;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private long f6073a;
        private long b;

        /* renamed from: c, reason: collision with root package name */
        private File f6074c;

        /* renamed from: d, reason: collision with root package name */
        private JSONObject f6075d;

        private a(File file) {
            long parseLong;
            this.f6075d = null;
            this.f6074c = file;
            String[] split = file.getName().split("-|\\.");
            if (split.length >= 2) {
                this.f6073a = Long.parseLong(split[0]);
                parseLong = Long.parseLong(split[1]);
            } else {
                String name = file.getName();
                if (TextUtils.isEmpty(name) || name.length() < 13) {
                    return;
                }
                String substring = name.substring(0, 13);
                if (!TextUtils.isDigitsOnly(substring)) {
                    return;
                }
                parseLong = Long.parseLong(substring);
                this.f6073a = parseLong;
            }
            this.b = parseLong;
        }

        private String a() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f6073a);
            sb.append("-");
            return n0.k(sb, this.b, ".ctx");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public JSONObject b() {
            if (this.f6075d == null) {
                try {
                    this.f6075d = new JSONObject(com.apm.insight.l.i.c(this.f6074c.getAbsolutePath()));
                } catch (Throwable unused) {
                }
                if (this.f6075d == null) {
                    this.f6075d = new JSONObject();
                }
            }
            return this.f6075d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            this.f6074c.delete();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b(long j7) {
            long j9 = this.f6073a;
            if (j9 > j7 && j9 - j7 > 604800000) {
                return true;
            }
            long j10 = this.b;
            if (j10 >= j7 || j7 - j10 <= 604800000) {
                return this.f6074c.lastModified() < j7 && j7 - this.f6074c.lastModified() > 604800000;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j7) {
            this.b = j7;
            this.f6074c.renameTo(new File(this.f6074c.getParent(), a()));
        }
    }

    private s(Context context) {
        File c9 = com.apm.insight.l.o.c(context);
        if (!c9.exists() || (!c9.isDirectory() && c9.delete())) {
            c9.mkdirs();
            com.apm.insight.runtime.a.b.a();
        }
        this.b = c9;
        this.f6068c = new File(c9, "did");
        this.f6069d = new File(c9, "device_uuid");
        this.f6070e = context;
    }

    public static int a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (Header.c(jSONObject)) {
            return 2;
        }
        if (Header.c(jSONObject2)) {
            return 0;
        }
        return (String.valueOf(jSONObject2.opt("update_version_code")).equals(String.valueOf(jSONObject.opt("update_version_code"))) && Header.d(jSONObject)) ? 1 : 2;
    }

    private a c() {
        if (this.f6071f == null) {
            d(".ctx");
        }
        return this.f6071f;
    }

    private File d(long j7) {
        Iterator<a> it = d(".ctx").iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (j7 >= next.f6073a && j7 <= next.b) {
                return next.f6074c;
            }
        }
        return null;
    }

    private File e(long j7) {
        Iterator<a> it = d(".allData").iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (j7 >= next.f6073a && j7 <= next.b) {
                return next.f6074c;
            }
        }
        return null;
    }

    private File f(long j7) {
        Iterator<a> it = d(".ctx").iterator();
        a aVar = null;
        while (it.hasNext()) {
            a next = it.next();
            if (aVar == null || Math.abs(aVar.b - j7) > Math.abs(next.b - j7)) {
                aVar = next;
            }
        }
        if (aVar == null) {
            return null;
        }
        return aVar.f6074c;
    }

    private File g(long j7) {
        Iterator<a> it = d(".allData").iterator();
        a aVar = null;
        while (it.hasNext()) {
            a next = it.next();
            if (aVar == null || Math.abs(aVar.b - j7) > Math.abs(next.b - j7)) {
                aVar = next;
            }
        }
        if (aVar == null) {
            return null;
        }
        return aVar.f6074c;
    }

    public String b() {
        try {
            return com.apm.insight.l.i.c(this.f6068c.getAbsolutePath());
        } catch (Throwable unused) {
            return "0";
        }
    }

    public static s a() {
        if (f6067a == null) {
            f6067a = new s(com.apm.insight.i.g());
        }
        return f6067a;
    }

    private void c(long j7) {
        try {
            ArrayList<a> d2 = d("");
            if (d2.size() <= 6) {
                return;
            }
            Iterator<a> it = d2.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.b(j7)) {
                    next.c();
                }
            }
        } catch (Throwable th) {
            com.apm.insight.c.a().a("NPTH_CATCH", th);
        }
    }

    private ArrayList<a> d(final String str) {
        File[] listFiles = this.b.listFiles(new FilenameFilter() { // from class: com.apm.insight.runtime.s.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str2) {
                return str2.endsWith(str) && Pattern.compile("^\\d{1,13}-\\d{1,13}.*").matcher(str2).matches();
            }
        });
        ArrayList<a> arrayList = new ArrayList<>();
        if (listFiles == null) {
            return arrayList;
        }
        com.apm.insight.l.q.a((Object) ("foundRuntimeContextFiles " + listFiles.length));
        a aVar = null;
        for (File file : listFiles) {
            try {
                a aVar2 = new a(file);
                arrayList.add(aVar2);
                if (this.f6071f == null) {
                    if (".ctx".equals(str)) {
                        if (aVar != null && aVar2.b < aVar.b) {
                        }
                        aVar = aVar2;
                    }
                }
            } catch (Throwable th) {
                com.apm.insight.c.a().a("NPTH_CATCH", th);
            }
        }
        if (this.f6071f == null && aVar != null) {
            this.f6071f = aVar;
        }
        return arrayList;
    }

    @Nullable
    public JSONArray b(long j7) {
        String str;
        File e4 = e(j7);
        if (e4 == null) {
            e4 = g(j7);
        }
        if (e4 == null) {
            return null;
        }
        try {
            str = com.apm.insight.l.i.c(e4.getAbsolutePath());
        } catch (Throwable th) {
            th = th;
            str = null;
        }
        try {
            return new JSONArray(str);
        } catch (Throwable th2) {
            th = th2;
            com.apm.insight.c.a().a("NPTH_CATCH", new IOException(AbstractC2914a.d("content :", str), th));
            return null;
        }
    }

    public String a(String str) {
        try {
            return com.apm.insight.l.i.c(this.f6069d.getAbsolutePath());
        } catch (Throwable unused) {
            return str;
        }
    }

    public void c(String str) {
        try {
            com.apm.insight.l.i.a(this.f6069d, str, false);
        } catch (Throwable unused) {
        }
    }

    @Nullable
    public JSONObject a(long j7) {
        boolean z8;
        String str;
        File d2 = d(j7);
        if (d2 == null) {
            d2 = f(j7);
            z8 = true;
        } else {
            z8 = false;
        }
        JSONObject jSONObject = null;
        if (d2 != null) {
            try {
                str = com.apm.insight.l.i.c(d2.getAbsolutePath());
            } catch (Throwable th) {
                th = th;
                str = null;
            }
            try {
                jSONObject = new JSONObject(str);
            } catch (Throwable th2) {
                th = th2;
                com.apm.insight.c.a().a("NPTH_CATCH", new IOException(AbstractC2914a.d("content :", str), th));
                if (jSONObject != null) {
                    try {
                        jSONObject.put("unauthentic_version", 1);
                    } catch (JSONException e4) {
                        com.apm.insight.c.a().a("NPTH_CATCH", e4);
                    }
                }
                return jSONObject;
            }
        }
        if (jSONObject != null && z8) {
            jSONObject.put("unauthentic_version", 1);
        }
        return jSONObject;
    }

    public void b(String str) {
        try {
            com.apm.insight.l.i.a(this.f6068c, str, false);
        } catch (Throwable unused) {
        }
    }

    private void a(long j7, long j9, JSONObject jSONObject, JSONArray jSONArray) {
        File file = new File(this.b, n0.k(AbstractC2933a.a("", j7, "-"), j9, ".ctx"));
        File file2 = new File(this.b, n0.k(AbstractC2933a.a("", j7, "-"), j9, ".allData"));
        try {
            com.apm.insight.l.i.a(file, jSONObject, false);
            com.apm.insight.l.i.a(file2, jSONArray, false);
            this.f6071f = new a(file);
        } catch (IOException e4) {
            com.apm.insight.c.a().a("NPTH_CATCH", e4);
        }
    }

    public void a(Map<String, Object> map, JSONArray jSONArray) {
        JSONObject a6 = Header.a(this.f6070e).a(map);
        if (Header.c(a6)) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        a c9 = c();
        if (c9 == null) {
            a(currentTimeMillis, currentTimeMillis, a6, jSONArray);
            return;
        }
        int a9 = a(c9.b(), a6);
        if (a9 == 1) {
            a(c9.f6073a, currentTimeMillis, a6, jSONArray);
            com.apm.insight.l.i.a(c9.f6074c);
        } else if (a9 == 2) {
            a(currentTimeMillis, currentTimeMillis, a6, jSONArray);
        } else if (a9 == 3) {
            c9.a(currentTimeMillis);
        }
        c(currentTimeMillis);
    }
}
