package com.apm.insight.k;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.l.n;
import com.apm.insight.l.q;
import com.apm.insight.runtime.p;
import com.apm.insight.runtime.r;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile d a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Context f3188b;

    private d(@NonNull Context context) {
        this.f3188b = context;
    }

    public static d a() {
        if (a == null) {
            a = new d(com.apm.insight.i.g());
        }
        return a;
    }

    public void b(final JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        p.b().a(new Runnable() { // from class: com.apm.insight.k.d.1
            @Override // java.lang.Runnable
            public void run() {
                String c10 = e.c();
                try {
                    jSONObject.put("upload_scene", "direct");
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                e.b(c10, jSONObject.toString());
            }
        });
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            return;
        }
        try {
            String f10 = e.f();
            File file = new File(n.a(this.f3188b), n.c());
            com.apm.insight.l.h.a(file, file.getName(), f10, jSONObject, e.b());
            if (e.a(f10, jSONObject.toString()).a()) {
                com.apm.insight.l.h.a(file);
            }
        } catch (Throwable th2) {
            com.apm.insight.l.p.b(th2);
        }
    }

    public void a(JSONObject jSONObject, long j3, boolean z10) {
        File[] fileArr;
        if (jSONObject != null && jSONObject.length() > 0) {
            try {
                String c10 = e.c();
                int i10 = 0;
                File file = new File(n.a(this.f3188b), com.apm.insight.i.a(j3, CrashType.ANR, false, false));
                com.apm.insight.l.h.a(file, file.getName(), c10, jSONObject, e.b());
                if (z10 && !Npth.isStopUpload()) {
                    jSONObject.put("upload_scene", "direct");
                    jSONObject.put("crash_uuid", file.getName());
                    q.a(jSONObject);
                    if (com.apm.insight.runtime.a.j()) {
                        HashMap<String, r.a> a10 = r.a(j3, "anr_trace");
                        fileArr = new File[a10.size() + 2];
                        for (Map.Entry<String, r.a> entry : a10.entrySet()) {
                            if (!entry.getKey().equals(com.apm.insight.l.a.c(this.f3188b))) {
                                fileArr[i10] = n.a(this.f3188b, entry.getValue().f3349b);
                                i10++;
                            }
                        }
                    } else {
                        fileArr = new File[2];
                    }
                    fileArr[fileArr.length - 1] = n.a(this.f3188b, com.apm.insight.i.f());
                    fileArr[fileArr.length - 2] = r.a(j3);
                    if (!e.a(c10, jSONObject.toString(), fileArr).a()) {
                        return;
                    }
                    com.apm.insight.l.h.a(file);
                    if (!Npth.hasCrash()) {
                        com.apm.insight.l.h.a(n.e(com.apm.insight.i.g()));
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public boolean a(long j3, JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() > 0) {
            try {
                String c10 = e.c();
                File file = new File(n.a(this.f3188b), n.a(com.apm.insight.i.e()));
                com.apm.insight.l.h.a(file, file.getName(), c10, jSONObject, e.a());
                jSONObject.put("upload_scene", "direct");
                q.a(jSONObject);
                if (!e.b(c10, jSONObject.toString()).a()) {
                    return false;
                }
                com.apm.insight.l.h.a(file);
                return true;
            } catch (Throwable th2) {
                com.apm.insight.l.p.b(th2);
            }
        }
        return false;
    }

    public boolean a(JSONObject jSONObject, File file, File file2) {
        try {
            String g10 = e.g();
            q.a(jSONObject);
            return e.a(g10, jSONObject.toString(), file, file2, r.a(System.currentTimeMillis()), new File(com.apm.insight.h.b.a())).a();
        } catch (Throwable th2) {
            com.apm.insight.l.p.b(th2);
            return false;
        }
    }
}
