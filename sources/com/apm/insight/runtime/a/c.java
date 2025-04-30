package com.apm.insight.runtime.a;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.apm.insight.AttachUserData;
import com.apm.insight.CrashType;
import com.apm.insight.ICommonParams;
import com.apm.insight.l.v;
import com.apm.insight.l.w;
import com.mbridge.msdk.foundation.entity.o;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    protected CrashType f6009a;
    protected Context b;

    /* renamed from: c, reason: collision with root package name */
    protected ICommonParams f6010c = com.apm.insight.i.a().c();

    /* renamed from: d, reason: collision with root package name */
    protected b f6011d;

    /* renamed from: e, reason: collision with root package name */
    protected d f6012e;

    /* loaded from: classes.dex */
    public interface a {
        com.apm.insight.entity.a a(int i9, com.apm.insight.entity.a aVar);

        com.apm.insight.entity.a a(int i9, com.apm.insight.entity.a aVar, boolean z8);

        void a(Throwable th);
    }

    public c(CrashType crashType, Context context, b bVar, d dVar) {
        this.f6009a = crashType;
        this.b = context;
        this.f6011d = bVar;
        this.f6012e = dVar;
    }

    private void i(com.apm.insight.entity.a aVar) {
        List<AttachUserData> a6 = com.apm.insight.i.b().a(this.f6009a);
        HashMap hashMap = new HashMap();
        JSONObject optJSONObject = aVar.h().optJSONObject("custom");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
            aVar.a("custom", optJSONObject);
        }
        if (a6 != null) {
            for (int i9 = 0; i9 < a6.size(); i9++) {
                try {
                    AttachUserData attachUserData = a6.get(i9);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    com.apm.insight.entity.a.a(optJSONObject, attachUserData.getUserData(this.f6009a));
                    hashMap.put("custom_cost_" + attachUserData.getClass().getName() + "_" + hashMap.size(), Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
                } catch (Throwable th) {
                    com.apm.insight.entity.a.a(optJSONObject, th);
                }
            }
        }
        try {
            optJSONObject.put("fd_count", com.apm.insight.l.h.a());
        } catch (Throwable unused) {
        }
        List<AttachUserData> b = com.apm.insight.i.b().b(this.f6009a);
        if (b != null) {
            JSONObject optJSONObject2 = aVar.h().optJSONObject("custom_long");
            if (optJSONObject2 == null) {
                optJSONObject2 = new JSONObject();
                aVar.a("custom_long", optJSONObject2);
            }
            for (int i10 = 0; i10 < b.size(); i10++) {
                try {
                    AttachUserData attachUserData2 = b.get(i10);
                    long uptimeMillis2 = SystemClock.uptimeMillis();
                    com.apm.insight.entity.a.a(optJSONObject2, attachUserData2.getUserData(this.f6009a));
                    hashMap.put("custom_cost_" + attachUserData2.getClass().getName() + "_" + hashMap.size(), Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis2));
                } catch (Throwable th2) {
                    com.apm.insight.entity.a.a(optJSONObject2, th2);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            try {
                optJSONObject.put((String) entry.getKey(), entry.getValue());
            } catch (Throwable unused2) {
            }
        }
    }

    public com.apm.insight.entity.a a(int i9, com.apm.insight.entity.a aVar) {
        if (aVar == null) {
            aVar = new com.apm.insight.entity.a();
        }
        if (i9 == 0) {
            b(aVar);
        } else if (i9 == 1) {
            c(aVar);
            i(aVar);
        } else if (i9 == 2) {
            e(aVar);
        } else if (i9 == 4) {
            f(aVar);
        } else if (i9 == 5) {
            d(aVar);
        }
        return aVar;
    }

    public int b() {
        return 6;
    }

    public com.apm.insight.entity.a c(com.apm.insight.entity.a aVar) {
        b bVar;
        if (!com.apm.insight.l.a.b(com.apm.insight.i.g())) {
            aVar.a("remote_process", (Object) 1);
        }
        aVar.a("pid", Integer.valueOf(Process.myPid()));
        aVar.a(com.apm.insight.i.j());
        if (c() && (bVar = this.f6011d) != null) {
            aVar.a(bVar);
        }
        try {
            aVar.a(this.f6010c.getPatchInfo());
        } catch (Throwable th) {
            try {
                aVar.a(Arrays.asList("Data fetch failed since source misstake:\n" + v.a(th)));
            } catch (Throwable unused) {
            }
        }
        String k6 = com.apm.insight.i.k();
        if (k6 != null) {
            aVar.a("business", (Object) k6);
        }
        aVar.a("is_background", Boolean.valueOf(!com.apm.insight.l.a.a(this.b)));
        return aVar;
    }

    public com.apm.insight.entity.a d(com.apm.insight.entity.a aVar) {
        if (d()) {
            aVar.b(w.a(this.b));
        }
        return aVar;
    }

    public com.apm.insight.entity.a e(com.apm.insight.entity.a aVar) {
        d dVar = this.f6012e;
        aVar.a("battery", Integer.valueOf(dVar == null ? 0 : dVar.a()));
        aVar.c(com.apm.insight.i.b().a());
        return aVar;
    }

    public com.apm.insight.entity.a f(com.apm.insight.entity.a aVar) {
        if (a()) {
            h(aVar);
        }
        return aVar;
    }

    public void g(com.apm.insight.entity.a aVar) {
    }

    public void h(com.apm.insight.entity.a aVar) {
    }

    public com.apm.insight.entity.a a(com.apm.insight.entity.a aVar) {
        return aVar;
    }

    public com.apm.insight.entity.a b(com.apm.insight.entity.a aVar) {
        aVar.a(com.apm.insight.i.p(), com.apm.insight.i.q());
        if (com.apm.insight.i.m()) {
            aVar.a("is_mp", (Object) 1);
        }
        try {
            aVar.a(this.f6010c.getPluginInfo());
        } catch (Throwable th) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("Data fetch failed since source misstake:\n" + v.a(th), 0);
                aVar.a(hashMap);
            } catch (Throwable unused) {
            }
        }
        aVar.b(com.apm.insight.i.o());
        aVar.a("process_name", com.apm.insight.l.a.c(com.apm.insight.i.g()));
        return aVar;
    }

    public boolean c() {
        return true;
    }

    public boolean d() {
        return true;
    }

    public com.apm.insight.entity.a a(@Nullable com.apm.insight.entity.a aVar, @Nullable a aVar2, boolean z8) {
        if (aVar == null) {
            aVar = new com.apm.insight.entity.a();
        }
        com.apm.insight.entity.a aVar3 = aVar;
        for (int i9 = 0; i9 < b(); i9++) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (aVar2 != null) {
                try {
                    aVar3 = aVar2.a(i9, aVar3);
                } catch (Throwable th) {
                    aVar2.a(th);
                }
            }
            try {
                aVar3 = a(i9, aVar3);
            } catch (Throwable th2) {
                if (aVar2 != null) {
                    aVar2.a(th2);
                }
            }
            if (aVar2 != null) {
                try {
                    boolean z9 = true;
                    if (i9 != b() - 1) {
                        z9 = false;
                    }
                    aVar3 = aVar2.a(i9, aVar3, z9);
                } catch (Throwable th3) {
                    aVar2.a(th3);
                }
                if (z8) {
                    if (i9 != 0) {
                        aVar.c(aVar3.h());
                    } else {
                        aVar = aVar3;
                    }
                    aVar3 = new com.apm.insight.entity.a();
                }
            }
            aVar.b(o.h(i9, "step_cost_"), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
        }
        return a(aVar);
    }

    public boolean a() {
        return false;
    }
}
