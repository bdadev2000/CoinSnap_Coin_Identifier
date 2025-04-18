package lc;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.facebook.w;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import mc.l;
import mc.o;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class j implements oc.a {

    /* renamed from: j, reason: collision with root package name */
    public static final Clock f21338j = DefaultClock.getInstance();

    /* renamed from: k, reason: collision with root package name */
    public static final Random f21339k = new Random();

    /* renamed from: l, reason: collision with root package name */
    public static final HashMap f21340l = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f21341b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f21342c;

    /* renamed from: d, reason: collision with root package name */
    public final va.g f21343d;

    /* renamed from: e, reason: collision with root package name */
    public final dc.e f21344e;

    /* renamed from: f, reason: collision with root package name */
    public final wa.c f21345f;

    /* renamed from: g, reason: collision with root package name */
    public final cc.c f21346g;

    /* renamed from: h, reason: collision with root package name */
    public final String f21347h;
    public final HashMap a = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f21348i = new HashMap();

    public j(Context context, ScheduledExecutorService scheduledExecutorService, va.g gVar, dc.e eVar, wa.c cVar, cc.c cVar2) {
        boolean z10;
        this.f21341b = context;
        this.f21342c = scheduledExecutorService;
        this.f21343d = gVar;
        this.f21344e = eVar;
        this.f21345f = cVar;
        this.f21346g = cVar2;
        gVar.a();
        this.f21347h = gVar.f26389c.f26406b;
        AtomicReference atomicReference = i.a;
        Application application = (Application) context.getApplicationContext();
        AtomicReference atomicReference2 = i.a;
        if (atomicReference2.get() == null) {
            i iVar = new i();
            while (true) {
                if (atomicReference2.compareAndSet(null, iVar)) {
                    z10 = true;
                    break;
                } else if (atomicReference2.get() != null) {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                BackgroundDetector.initialize(application);
                BackgroundDetector.getInstance().addListener(iVar);
            }
        }
        Tasks.call(scheduledExecutorService, new w(this, 3));
    }

    public final synchronized b a() {
        mc.d c10;
        mc.d c11;
        mc.d c12;
        l lVar;
        mc.j jVar;
        final qa.a aVar;
        c10 = c("fetch");
        c11 = c("activate");
        c12 = c("defaults");
        lVar = new l(this.f21341b.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", this.f21347h, "firebase", "settings"), 0));
        jVar = new mc.j(this.f21342c, c11, c12);
        va.g gVar = this.f21343d;
        cc.c cVar = this.f21346g;
        gVar.a();
        if (gVar.f26388b.equals("[DEFAULT]")) {
            aVar = new qa.a(cVar);
        } else {
            aVar = null;
        }
        if (aVar != null) {
            BiConsumer biConsumer = new BiConsumer() { // from class: lc.h
                @Override // com.google.android.gms.common.util.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    JSONObject optJSONObject;
                    qa.a aVar2 = qa.a.this;
                    String str = (String) obj;
                    mc.f fVar = (mc.f) obj2;
                    za.b bVar = (za.b) ((cc.c) aVar2.f23736c).get();
                    if (bVar != null) {
                        JSONObject jSONObject = fVar.f22170e;
                        if (jSONObject.length() >= 1) {
                            JSONObject jSONObject2 = fVar.f22167b;
                            if (jSONObject2.length() >= 1 && (optJSONObject = jSONObject.optJSONObject(str)) != null) {
                                String optString = optJSONObject.optString("choiceId");
                                if (!optString.isEmpty()) {
                                    synchronized (((Map) aVar2.f23737d)) {
                                        if (!optString.equals(((Map) aVar2.f23737d).get(str))) {
                                            ((Map) aVar2.f23737d).put(str, optString);
                                            Bundle bundle = new Bundle();
                                            bundle.putString("arm_key", str);
                                            bundle.putString("arm_value", jSONObject2.optString(str));
                                            bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                                            bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                                            bundle.putString("group", optJSONObject.optString("group"));
                                            za.c cVar2 = (za.c) bVar;
                                            cVar2.a("fp", "personalization_assignment", bundle);
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putString("_fpid", optString);
                                            cVar2.a("fp", "_fpc", bundle2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            };
            synchronized (jVar.a) {
                jVar.a.add(biConsumer);
            }
        }
        return b(this.f21343d, this.f21344e, this.f21345f, this.f21342c, c10, c11, c12, d(c10, lVar), jVar, lVar, new s2.h(c11, new qa.a(c11, c12, 12), this.f21342c));
    }

    public final synchronized b b(va.g gVar, dc.e eVar, wa.c cVar, ScheduledExecutorService scheduledExecutorService, mc.d dVar, mc.d dVar2, mc.d dVar3, mc.i iVar, mc.j jVar, l lVar, s2.h hVar) {
        boolean z10;
        wa.c cVar2;
        if (!this.a.containsKey("firebase")) {
            Context context = this.f21341b;
            gVar.a();
            if (gVar.f26388b.equals("[DEFAULT]")) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                cVar2 = cVar;
            } else {
                cVar2 = null;
            }
            Context context2 = this.f21341b;
            synchronized (this) {
                b bVar = new b(context, cVar2, scheduledExecutorService, dVar, dVar2, dVar3, iVar, jVar, lVar, new u2.l(gVar, eVar, iVar, dVar2, context2, lVar, this.f21342c), hVar);
                dVar2.b();
                dVar3.b();
                dVar.b();
                this.a.put("firebase", bVar);
                f21340l.put("firebase", bVar);
            }
        }
        return (b) this.a.get("firebase");
    }

    public final mc.d c(String str) {
        o oVar;
        mc.d dVar;
        String format = String.format("%s_%s_%s_%s.json", "frc", this.f21347h, "firebase", str);
        ScheduledExecutorService scheduledExecutorService = this.f21342c;
        Context context = this.f21341b;
        HashMap hashMap = o.f22217c;
        synchronized (o.class) {
            HashMap hashMap2 = o.f22217c;
            if (!hashMap2.containsKey(format)) {
                hashMap2.put(format, new o(context, format));
            }
            oVar = (o) hashMap2.get(format);
        }
        HashMap hashMap3 = mc.d.f22157d;
        synchronized (mc.d.class) {
            String str2 = oVar.f22218b;
            HashMap hashMap4 = mc.d.f22157d;
            if (!hashMap4.containsKey(str2)) {
                hashMap4.put(str2, new mc.d(scheduledExecutorService, oVar));
            }
            dVar = (mc.d) hashMap4.get(str2);
        }
        return dVar;
    }

    public final synchronized mc.i d(mc.d dVar, l lVar) {
        dc.e eVar;
        cc.c fVar;
        cc.c cVar;
        ScheduledExecutorService scheduledExecutorService;
        Clock clock;
        Random random;
        String str;
        va.g gVar;
        eVar = this.f21344e;
        va.g gVar2 = this.f21343d;
        gVar2.a();
        if (gVar2.f26388b.equals("[DEFAULT]")) {
            fVar = this.f21346g;
        } else {
            fVar = new db.f(7);
        }
        cVar = fVar;
        scheduledExecutorService = this.f21342c;
        clock = f21338j;
        random = f21339k;
        va.g gVar3 = this.f21343d;
        gVar3.a();
        str = gVar3.f26389c.a;
        gVar = this.f21343d;
        gVar.a();
        return new mc.i(eVar, cVar, scheduledExecutorService, clock, random, dVar, new ConfigFetchHttpClient(this.f21341b, gVar.f26389c.f26406b, str, lVar.a.getLong("fetch_timeout_in_seconds", 60L), lVar.a.getLong("fetch_timeout_in_seconds", 60L)), lVar, this.f21348i);
    }
}
