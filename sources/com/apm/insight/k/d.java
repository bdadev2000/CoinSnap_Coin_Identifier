package com.apm.insight.k;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.l.o;
import com.apm.insight.l.q;
import com.apm.insight.l.r;
import com.apm.insight.runtime.p;
import com.apm.insight.runtime.r;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile d f5878a;
    private volatile Context b;

    private d(@NonNull Context context) {
        this.b = context;
    }

    public static d a() {
        if (f5878a == null) {
            f5878a = new d(com.apm.insight.i.g());
        }
        return f5878a;
    }

    public void b(final JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        p.b().a(new Runnable() { // from class: com.apm.insight.k.d.1
            @Override // java.lang.Runnable
            public void run() {
                String c9 = e.c();
                try {
                    jSONObject.put("upload_scene", "direct");
                } catch (JSONException e4) {
                    e4.printStackTrace();
                }
                e.b(c9, jSONObject.toString());
            }
        });
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            return;
        }
        try {
            String f9 = e.f();
            File file = new File(o.a(this.b), o.c());
            com.apm.insight.l.i.a(file, file.getName(), f9, jSONObject, e.b());
            if (e.a(f9, jSONObject.toString()).a()) {
                com.apm.insight.l.i.a(file);
            }
        } catch (Throwable th) {
            q.b(th);
        }
    }

    public void a(JSONObject jSONObject, long j7, boolean z8) {
        File[] fileArr;
        if (jSONObject != null && jSONObject.length() > 0) {
            try {
                String c9 = e.c();
                int i9 = 0;
                File file = new File(o.a(this.b), com.apm.insight.i.a(j7, CrashType.ANR, false, false));
                com.apm.insight.l.i.a(file, file.getName(), c9, jSONObject, e.b());
                if (z8 && !Npth.isStopUpload()) {
                    jSONObject.put("upload_scene", "direct");
                    jSONObject.put("crash_uuid", file.getName());
                    r.a(jSONObject);
                    if (com.apm.insight.runtime.a.j()) {
                        HashMap<String, r.a> a6 = com.apm.insight.runtime.r.a(j7, "anr_trace");
                        fileArr = new File[a6.size() + 2];
                        for (Map.Entry<String, r.a> entry : a6.entrySet()) {
                            if (!entry.getKey().equals(com.apm.insight.l.a.c(this.b))) {
                                fileArr[i9] = o.a(this.b, entry.getValue().b);
                                i9++;
                            }
                        }
                    } else {
                        fileArr = new File[2];
                    }
                    fileArr[fileArr.length - 1] = o.a(this.b, com.apm.insight.i.f());
                    fileArr[fileArr.length - 2] = com.apm.insight.runtime.r.a(j7);
                    if (!e.a(c9, jSONObject.toString(), fileArr).a()) {
                        return;
                    }
                    com.apm.insight.l.i.a(file);
                    if (!Npth.hasCrash()) {
                        com.apm.insight.l.i.a(o.e(com.apm.insight.i.g()));
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public boolean a(long j7, JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() > 0) {
            try {
                String c9 = e.c();
                File file = new File(o.a(this.b), o.a(com.apm.insight.i.e()));
                com.apm.insight.l.i.a(file, file.getName(), c9, jSONObject, e.a());
                jSONObject.put("upload_scene", "direct");
                com.apm.insight.l.r.a(jSONObject);
                if (!e.b(c9, jSONObject.toString()).a()) {
                    return false;
                }
                com.apm.insight.l.i.a(file);
                return true;
            } catch (Throwable th) {
                q.b(th);
            }
        }
        return false;
    }

    public boolean a(JSONObject jSONObject, File file, File file2) {
        try {
            String g9 = e.g();
            com.apm.insight.l.r.a(jSONObject);
            return e.a(g9, jSONObject.toString(), file, file2, com.apm.insight.runtime.r.a(System.currentTimeMillis()), new File(com.apm.insight.h.b.a())).a();
        } catch (Throwable th) {
            q.b(th);
            return false;
        }
    }
}
