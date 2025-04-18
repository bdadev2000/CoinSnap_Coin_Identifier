package com.apm.insight.runtime;

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

/* loaded from: classes.dex */
public class s {
    private static s a;

    /* renamed from: b, reason: collision with root package name */
    private File f3351b;

    /* renamed from: c, reason: collision with root package name */
    private File f3352c;

    /* renamed from: d, reason: collision with root package name */
    private File f3353d;

    /* renamed from: e, reason: collision with root package name */
    private Context f3354e;

    /* renamed from: f, reason: collision with root package name */
    private a f3355f = null;

    /* loaded from: classes.dex */
    public static class a {
        private long a;

        /* renamed from: b, reason: collision with root package name */
        private long f3357b;

        /* renamed from: c, reason: collision with root package name */
        private File f3358c;

        /* renamed from: d, reason: collision with root package name */
        private JSONObject f3359d;

        private a(File file) {
            long parseLong;
            this.f3359d = null;
            this.f3358c = file;
            String[] split = file.getName().split("-|\\.");
            if (split.length >= 2) {
                this.a = Long.parseLong(split[0]);
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
                this.a = parseLong;
            }
            this.f3357b = parseLong;
        }

        private String a() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.a);
            sb2.append("-");
            return a4.j.j(sb2, this.f3357b, ".ctx");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public JSONObject b() {
            if (this.f3359d == null) {
                try {
                    this.f3359d = new JSONObject(com.apm.insight.l.h.c(this.f3358c.getAbsolutePath()));
                } catch (Throwable unused) {
                }
                if (this.f3359d == null) {
                    this.f3359d = new JSONObject();
                }
            }
            return this.f3359d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            this.f3358c.delete();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b(long j3) {
            long j10 = this.a;
            if (j10 > j3 && j10 - j3 > 604800000) {
                return true;
            }
            long j11 = this.f3357b;
            if (j11 >= j3 || j3 - j11 <= 604800000) {
                return this.f3358c.lastModified() < j3 && j3 - this.f3358c.lastModified() > 604800000;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j3) {
            this.f3357b = j3;
            this.f3358c.renameTo(new File(this.f3358c.getParent(), a()));
        }
    }

    private s(Context context) {
        File c10 = com.apm.insight.l.n.c(context);
        if (!c10.exists() || (!c10.isDirectory() && c10.delete())) {
            c10.mkdirs();
            com.apm.insight.runtime.a.b.a();
        }
        this.f3351b = c10;
        this.f3352c = new File(c10, "did");
        this.f3353d = new File(c10, "device_uuid");
        this.f3354e = context;
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
        if (this.f3355f == null) {
            d(".ctx");
        }
        return this.f3355f;
    }

    private File d(long j3) {
        Iterator<a> it = d(".ctx").iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (j3 >= next.a && j3 <= next.f3357b) {
                return next.f3358c;
            }
        }
        return null;
    }

    private File e(long j3) {
        Iterator<a> it = d(".allData").iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (j3 >= next.a && j3 <= next.f3357b) {
                return next.f3358c;
            }
        }
        return null;
    }

    private File f(long j3) {
        Iterator<a> it = d(".ctx").iterator();
        a aVar = null;
        while (it.hasNext()) {
            a next = it.next();
            if (aVar == null || Math.abs(aVar.f3357b - j3) > Math.abs(next.f3357b - j3)) {
                aVar = next;
            }
        }
        if (aVar == null) {
            return null;
        }
        return aVar.f3358c;
    }

    private File g(long j3) {
        Iterator<a> it = d(".allData").iterator();
        a aVar = null;
        while (it.hasNext()) {
            a next = it.next();
            if (aVar == null || Math.abs(aVar.f3357b - j3) > Math.abs(next.f3357b - j3)) {
                aVar = next;
            }
        }
        if (aVar == null) {
            return null;
        }
        return aVar.f3358c;
    }

    public String b() {
        try {
            return com.apm.insight.l.h.c(this.f3352c.getAbsolutePath());
        } catch (Throwable unused) {
            return "0";
        }
    }

    public static s a() {
        if (a == null) {
            a = new s(com.apm.insight.i.g());
        }
        return a;
    }

    private void c(long j3) {
        try {
            ArrayList<a> d10 = d("");
            if (d10.size() <= 6) {
                return;
            }
            Iterator<a> it = d10.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.b(j3)) {
                    next.c();
                }
            }
        } catch (Throwable th2) {
            com.apm.insight.c.a().a("NPTH_CATCH", th2);
        }
    }

    private ArrayList<a> d(final String str) {
        File[] listFiles = this.f3351b.listFiles(new FilenameFilter() { // from class: com.apm.insight.runtime.s.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str2) {
                return str2.endsWith(str) && Pattern.compile("^\\d{1,13}-\\d{1,13}.*").matcher(str2).matches();
            }
        });
        ArrayList<a> arrayList = new ArrayList<>();
        if (listFiles == null) {
            return arrayList;
        }
        com.apm.insight.l.p.a((Object) ("foundRuntimeContextFiles " + listFiles.length));
        a aVar = null;
        for (File file : listFiles) {
            try {
                a aVar2 = new a(file);
                arrayList.add(aVar2);
                if (this.f3355f == null) {
                    if (".ctx".equals(str)) {
                        if (aVar != null && aVar2.f3357b < aVar.f3357b) {
                        }
                        aVar = aVar2;
                    }
                }
            } catch (Throwable th2) {
                com.apm.insight.c.a().a("NPTH_CATCH", th2);
            }
        }
        if (this.f3355f == null && aVar != null) {
            this.f3355f = aVar;
        }
        return arrayList;
    }

    @Nullable
    public JSONArray b(long j3) {
        Throwable th2;
        String str;
        File e2 = e(j3);
        if (e2 == null) {
            e2 = g(j3);
        }
        if (e2 == null) {
            return null;
        }
        try {
            str = com.apm.insight.l.h.c(e2.getAbsolutePath());
        } catch (Throwable th3) {
            th2 = th3;
            str = null;
        }
        try {
            return new JSONArray(str);
        } catch (Throwable th4) {
            th2 = th4;
            com.apm.insight.c.a().a("NPTH_CATCH", new IOException(vd.e.e("content :", str), th2));
            return null;
        }
    }

    public String a(String str) {
        try {
            return com.apm.insight.l.h.c(this.f3353d.getAbsolutePath());
        } catch (Throwable unused) {
            return str;
        }
    }

    public void c(String str) {
        try {
            com.apm.insight.l.h.a(this.f3353d, str, false);
        } catch (Throwable unused) {
        }
    }

    @Nullable
    public JSONObject a(long j3) {
        boolean z10;
        Throwable th2;
        String str;
        File d10 = d(j3);
        if (d10 == null) {
            d10 = f(j3);
            z10 = true;
        } else {
            z10 = false;
        }
        JSONObject jSONObject = null;
        if (d10 != null) {
            try {
                str = com.apm.insight.l.h.c(d10.getAbsolutePath());
            } catch (Throwable th3) {
                th2 = th3;
                str = null;
            }
            try {
                jSONObject = new JSONObject(str);
            } catch (Throwable th4) {
                th2 = th4;
                com.apm.insight.c.a().a("NPTH_CATCH", new IOException(vd.e.e("content :", str), th2));
                if (jSONObject != null) {
                    try {
                        jSONObject.put("unauthentic_version", 1);
                    } catch (JSONException e2) {
                        com.apm.insight.c.a().a("NPTH_CATCH", e2);
                    }
                }
                return jSONObject;
            }
        }
        if (jSONObject != null && z10) {
            jSONObject.put("unauthentic_version", 1);
        }
        return jSONObject;
    }

    public void b(String str) {
        try {
            com.apm.insight.l.h.a(this.f3352c, str, false);
        } catch (Throwable unused) {
        }
    }

    private void a(long j3, long j10, JSONObject jSONObject, JSONArray jSONArray) {
        File file = new File(this.f3351b, a4.j.j(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.o("", j3, "-"), j10, ".ctx"));
        File file2 = new File(this.f3351b, a4.j.j(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.o("", j3, "-"), j10, ".allData"));
        try {
            com.apm.insight.l.h.a(file, jSONObject, false);
            com.apm.insight.l.h.a(file2, jSONArray, false);
            this.f3355f = new a(file);
        } catch (IOException e2) {
            com.apm.insight.c.a().a("NPTH_CATCH", e2);
        }
    }

    public void a(Map<String, Object> map, JSONArray jSONArray) {
        JSONObject a10 = Header.a(this.f3354e).a(map);
        if (Header.c(a10)) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        a c10 = c();
        if (c10 == null) {
            a(currentTimeMillis, currentTimeMillis, a10, jSONArray);
            return;
        }
        int a11 = a(c10.b(), a10);
        if (a11 == 1) {
            a(c10.a, currentTimeMillis, a10, jSONArray);
            com.apm.insight.l.h.a(c10.f3358c);
        } else if (a11 == 2) {
            a(currentTimeMillis, currentTimeMillis, a10, jSONArray);
        } else if (a11 == 3) {
            c10.a(currentTimeMillis);
        }
        c(currentTimeMillis);
    }
}
