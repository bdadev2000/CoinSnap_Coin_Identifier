package com.applovin.impl.sdk;

import Q7.n0;
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
import com.applovin.impl.H2;
import com.applovin.impl.kn;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sm;
import com.applovin.impl.th;
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

    /* renamed from: a */
    private final k f11171a;
    private final Executor b;

    /* renamed from: e */
    private final MeasurementManager f11174e;

    /* renamed from: h */
    private final TopicsManager f11177h;

    /* renamed from: c */
    private final Set f11172c = new HashSet();

    /* renamed from: d */
    private final Object f11173d = new Object();

    /* renamed from: f */
    private final AtomicReference f11175f = new AtomicReference(new JSONArray());

    /* renamed from: g */
    private final d f11176g = new d(this, null);

    /* loaded from: classes.dex */
    public class a implements OutcomeReceiver {
        public a() {
        }

        /* renamed from: a */
        public void onError(Exception exc) {
            w.this.f11171a.L();
            if (t.a()) {
                w.this.f11171a.L().a("PrivacySandboxService", "Failed to register impression", exc);
            }
        }

        public void onResult(Object obj) {
            w.this.f11171a.L();
            if (t.a()) {
                w.this.f11171a.L().a("PrivacySandboxService", "Successfully registered impression");
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements OutcomeReceiver {
        public b() {
        }

        /* renamed from: a */
        public void onError(Exception exc) {
            w.this.f11171a.L();
            if (t.a()) {
                w.this.f11171a.L().a("PrivacySandboxService", "Failed to register click", exc);
            }
        }

        public void onResult(Object obj) {
            w.this.f11171a.L();
            if (t.a()) {
                w.this.f11171a.L().a("PrivacySandboxService", "Successfully registered click");
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements OutcomeReceiver {
        public c() {
        }

        /* renamed from: a */
        public void onError(Exception exc) {
            w.this.f11171a.L();
            if (t.a()) {
                w.this.f11171a.L().a("PrivacySandboxService", "Failed to register conversion", exc);
            }
        }

        public void onResult(Object obj) {
            w.this.f11171a.L();
            if (t.a()) {
                w.this.f11171a.L().a("PrivacySandboxService", "Successfully registered conversion");
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements OutcomeReceiver {
        private d() {
        }

        public void a(GetTopicsResponse getTopicsResponse) {
            List topics;
            int topicId;
            long modelVersion;
            long taxonomyVersion;
            topics = getTopicsResponse.getTopics();
            int size = topics.size();
            w.this.f11171a.L();
            if (t.a()) {
                w.this.f11171a.L().d("PrivacySandboxService", size + " topic(s) received");
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = topics.iterator();
            while (it.hasNext()) {
                Topic j7 = A0.b.j(it.next());
                JSONObject jSONObject = new JSONObject();
                topicId = j7.getTopicId();
                JsonUtils.putInt(jSONObject, "id", topicId);
                modelVersion = j7.getModelVersion();
                JsonUtils.putLong(jSONObject, "model", modelVersion);
                taxonomyVersion = j7.getTaxonomyVersion();
                JsonUtils.putLong(jSONObject, "taxonomy", taxonomyVersion);
                jSONArray.put(jSONObject);
            }
            w.this.f11175f.set(jSONArray);
            w.this.b(((Boolean) w.this.f11171a.a(oj.f9568C6)).booleanValue(), ((Long) w.this.f11171a.a(oj.f9553A6)).longValue());
        }

        public /* bridge */ /* synthetic */ void onResult(Object obj) {
            a(A0.b.i(obj));
        }

        public /* synthetic */ d(w wVar, a aVar) {
            this();
        }

        /* renamed from: a */
        public void onError(Exception exc) {
            String str;
            Long l = (Long) w.this.f11171a.a(oj.f9560B6);
            boolean z8 = l.longValue() == -1;
            w.this.f11171a.L();
            if (t.a()) {
                t L8 = w.this.f11171a.L();
                StringBuilder sb = new StringBuilder("Failed to retrieve topics");
                if (z8) {
                    str = "";
                } else {
                    str = ", retrying in " + l + " ms";
                }
                sb.append(str);
                L8.a("PrivacySandboxService", sb.toString(), exc);
            }
            if (z8) {
                return;
            }
            w.this.b(((Boolean) w.this.f11171a.a(oj.f9576D6)).booleanValue(), l.longValue());
        }
    }

    public w(k kVar) {
        this.f11171a = kVar;
        this.b = kVar.l0().a();
        Context k6 = k.k();
        this.f11174e = A0.b.c(k6.getSystemService(A0.b.m()));
        this.f11177h = A0.b.k(k6.getSystemService(A0.b.A()));
        if (((Boolean) kVar.a(oj.f9900z6)).booleanValue()) {
            b(((Boolean) kVar.a(oj.f9568C6)).booleanValue(), 0L);
        }
    }

    private boolean c(String str) {
        synchronized (this.f11173d) {
            try {
                if (this.f11172c.contains(str)) {
                    return false;
                }
                this.f11172c.add(str);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(List list) {
        a("register impression", new A4.d(23, this, list));
    }

    public /* synthetic */ void a(List list) {
        if (list == null || list.isEmpty() || this.f11174e == null || !th.e(k.f10833B0)) {
            return;
        }
        this.f11171a.L();
        if (t.a()) {
            this.f11171a.L().a("PrivacySandboxService", "Registering impression...");
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f11174e.registerSource(Uri.parse((String) it.next()), null, this.b, new a());
        }
    }

    public void b(List list, InputEvent inputEvent) {
        a("register click", new y(this, list, inputEvent, 4));
    }

    public void b(String str) {
        a("register conversion trigger event", new A4.d(22, this, str));
    }

    public void b(boolean z8, long j7) {
        a("retrieve topics", new H2(this, z8, j7, 1));
    }

    public /* synthetic */ void a(List list, InputEvent inputEvent) {
        if (list == null || list.isEmpty() || this.f11174e == null || !th.e(k.f10833B0)) {
            return;
        }
        this.f11171a.L();
        if (t.a()) {
            this.f11171a.L().a("PrivacySandboxService", "Registering click...");
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f11174e.registerSource(Uri.parse((String) it.next()), inputEvent, this.b, new b());
        }
    }

    public /* synthetic */ void a(String str) {
        if (TextUtils.isEmpty(str) || this.f11174e == null || !th.e(k.f10833B0)) {
            return;
        }
        this.f11171a.L();
        if (t.a()) {
            n0.s("Registering conversion: ", str, this.f11171a.L(), "PrivacySandboxService");
        }
        this.f11174e.registerTrigger(Uri.parse(str), this.b, new c());
    }

    public JSONArray a() {
        return (JSONArray) this.f11175f.get();
    }

    public /* synthetic */ void a(boolean z8, long j7) {
        GetTopicsRequest.Builder shouldRecordObservation;
        GetTopicsRequest.Builder adsSdkName;
        GetTopicsRequest build;
        if (this.f11177h == null) {
            return;
        }
        shouldRecordObservation = A0.b.d().setShouldRecordObservation(z8);
        adsSdkName = shouldRecordObservation.setAdsSdkName("AppLovin");
        build = adsSdkName.build();
        if (j7 <= 0) {
            this.f11177h.getTopics(build, this.b, this.f11176g);
        } else {
            this.f11171a.l0().a(new kn(this.f11171a, true, "getTopics", new A4.d(21, this, build)), sm.b.OTHER, j7);
        }
    }

    public /* synthetic */ void a(GetTopicsRequest getTopicsRequest) {
        this.f11177h.getTopics(getTopicsRequest, this.b, this.f11176g);
    }

    private void a(String str, Runnable runnable) {
        try {
            this.f11171a.L();
            if (t.a()) {
                this.f11171a.L().a("PrivacySandboxService", "Running operation: " + str);
            }
            runnable.run();
        } catch (Throwable th) {
            this.f11171a.L();
            if (t.a()) {
                this.f11171a.L().a("PrivacySandboxService", "Failed to run operation: " + str, th);
            }
            if (c(str)) {
                this.f11171a.B().a("PrivacySandboxService", str, th);
            }
        }
    }
}
