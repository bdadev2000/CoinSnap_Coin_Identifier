package com.applovin.impl.sdk;

import android.adservices.measurement.MeasurementManager;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import android.text.TextUtils;
import android.view.InputEvent;
import com.applovin.impl.kn;
import com.applovin.impl.oj;
import com.applovin.impl.rv;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sm;
import com.applovin.impl.th;
import h.o0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class w {
    private final k a;

    /* renamed from: b */
    private final Executor f8009b;

    /* renamed from: e */
    private final MeasurementManager f8012e;

    /* renamed from: h */
    private final TopicsManager f8015h;

    /* renamed from: c */
    private final Set f8010c = new HashSet();

    /* renamed from: d */
    private final Object f8011d = new Object();

    /* renamed from: f */
    private final AtomicReference f8013f = new AtomicReference(new JSONArray());

    /* renamed from: g */
    private final d f8014g = new d(this, null);

    /* loaded from: classes.dex */
    public class a implements OutcomeReceiver {
        public a() {
        }

        @Override // android.os.OutcomeReceiver
        /* renamed from: a */
        public void onError(Exception exc) {
            w.this.a.L();
            if (t.a()) {
                w.this.a.L().a("PrivacySandboxService", "Failed to register impression", exc);
            }
        }

        @Override // android.os.OutcomeReceiver
        public void onResult(Object obj) {
            w.this.a.L();
            if (t.a()) {
                w.this.a.L().a("PrivacySandboxService", "Successfully registered impression");
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements OutcomeReceiver {
        public b() {
        }

        @Override // android.os.OutcomeReceiver
        /* renamed from: a */
        public void onError(Exception exc) {
            w.this.a.L();
            if (t.a()) {
                w.this.a.L().a("PrivacySandboxService", "Failed to register click", exc);
            }
        }

        @Override // android.os.OutcomeReceiver
        public void onResult(Object obj) {
            w.this.a.L();
            if (t.a()) {
                w.this.a.L().a("PrivacySandboxService", "Successfully registered click");
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements OutcomeReceiver {
        public c() {
        }

        @Override // android.os.OutcomeReceiver
        /* renamed from: a */
        public void onError(Exception exc) {
            w.this.a.L();
            if (t.a()) {
                w.this.a.L().a("PrivacySandboxService", "Failed to register conversion", exc);
            }
        }

        @Override // android.os.OutcomeReceiver
        public void onResult(Object obj) {
            w.this.a.L();
            if (t.a()) {
                w.this.a.L().a("PrivacySandboxService", "Successfully registered conversion");
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements OutcomeReceiver {
        private d() {
        }

        @Override // android.os.OutcomeReceiver
        /* renamed from: a */
        public void onResult(GetTopicsResponse getTopicsResponse) {
            List<Topic> topics = getTopicsResponse.getTopics();
            int size = topics.size();
            w.this.a.L();
            if (t.a()) {
                w.this.a.L().d("PrivacySandboxService", size + " topic(s) received");
            }
            JSONArray jSONArray = new JSONArray();
            for (Topic topic : topics) {
                JSONObject jSONObject = new JSONObject();
                JsonUtils.putInt(jSONObject, "id", topic.getTopicId());
                JsonUtils.putLong(jSONObject, "model", topic.getModelVersion());
                JsonUtils.putLong(jSONObject, "taxonomy", topic.getTaxonomyVersion());
                jSONArray.put(jSONObject);
            }
            w.this.f8013f.set(jSONArray);
            w.this.b(((Boolean) w.this.a.a(oj.C6)).booleanValue(), ((Long) w.this.a.a(oj.A6)).longValue());
        }

        public /* synthetic */ d(w wVar, a aVar) {
            this();
        }

        @Override // android.os.OutcomeReceiver
        /* renamed from: a */
        public void onError(Exception exc) {
            String str;
            Long l10 = (Long) w.this.a.a(oj.B6);
            boolean z10 = l10.longValue() == -1;
            w.this.a.L();
            if (t.a()) {
                t L = w.this.a.L();
                StringBuilder sb2 = new StringBuilder("Failed to retrieve topics");
                if (z10) {
                    str = "";
                } else {
                    str = ", retrying in " + l10 + " ms";
                }
                sb2.append(str);
                L.a("PrivacySandboxService", sb2.toString(), exc);
            }
            if (z10) {
                return;
            }
            w.this.b(((Boolean) w.this.a.a(oj.D6)).booleanValue(), l10.longValue());
        }
    }

    public w(k kVar) {
        this.a = kVar;
        this.f8009b = kVar.l0().a();
        Context k10 = k.k();
        this.f8012e = (MeasurementManager) k10.getSystemService(MeasurementManager.class);
        this.f8015h = (TopicsManager) k10.getSystemService(TopicsManager.class);
        if (((Boolean) kVar.a(oj.f6808z6)).booleanValue()) {
            b(((Boolean) kVar.a(oj.C6)).booleanValue(), 0L);
        }
    }

    private boolean c(String str) {
        synchronized (this.f8011d) {
            if (this.f8010c.contains(str)) {
                return false;
            }
            this.f8010c.add(str);
            return true;
        }
    }

    public void b(List list) {
        a("register impression", new o0(24, this, list));
    }

    public /* synthetic */ void a(List list) {
        if (list == null || list.isEmpty() || this.f8012e == null || !th.e(k.B0)) {
            return;
        }
        this.a.L();
        if (t.a()) {
            this.a.L().a("PrivacySandboxService", "Registering impression...");
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f8012e.registerSource(Uri.parse((String) it.next()), null, this.f8009b, new a());
        }
    }

    public void b(List list, InputEvent inputEvent) {
        a("register click", new y(4, this, list, inputEvent));
    }

    public void b(String str) {
        a("register conversion trigger event", new o0(23, this, str));
    }

    public void b(boolean z10, long j3) {
        a("retrieve topics", new rv(this, z10, j3, 1));
    }

    public /* synthetic */ void a(List list, InputEvent inputEvent) {
        if (list == null || list.isEmpty() || this.f8012e == null || !th.e(k.B0)) {
            return;
        }
        this.a.L();
        if (t.a()) {
            this.a.L().a("PrivacySandboxService", "Registering click...");
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f8012e.registerSource(Uri.parse((String) it.next()), inputEvent, this.f8009b, new b());
        }
    }

    public /* synthetic */ void a(String str) {
        if (TextUtils.isEmpty(str) || this.f8012e == null || !th.e(k.B0)) {
            return;
        }
        this.a.L();
        if (t.a()) {
            a4.j.v("Registering conversion: ", str, this.a.L(), "PrivacySandboxService");
        }
        this.f8012e.registerTrigger(Uri.parse(str), this.f8009b, new c());
    }

    public JSONArray a() {
        return (JSONArray) this.f8013f.get();
    }

    public /* synthetic */ void a(boolean z10, long j3) {
        if (this.f8015h == null) {
            return;
        }
        GetTopicsRequest build = new GetTopicsRequest.Builder().setShouldRecordObservation(z10).setAdsSdkName("AppLovin").build();
        if (j3 > 0) {
            this.a.l0().a(new kn(this.a, true, "getTopics", new o0(22, this, build)), sm.b.OTHER, j3);
        } else {
            this.f8015h.getTopics(build, this.f8009b, this.f8014g);
        }
    }

    public /* synthetic */ void a(GetTopicsRequest getTopicsRequest) {
        this.f8015h.getTopics(getTopicsRequest, this.f8009b, this.f8014g);
    }

    private void a(String str, Runnable runnable) {
        try {
            this.a.L();
            if (t.a()) {
                this.a.L().a("PrivacySandboxService", "Running operation: " + str);
            }
            runnable.run();
        } catch (Throwable th2) {
            this.a.L();
            if (t.a()) {
                this.a.L().a("PrivacySandboxService", "Failed to run operation: " + str, th2);
            }
            if (c(str)) {
                this.a.B().a("PrivacySandboxService", str, th2);
            }
        }
    }
}
