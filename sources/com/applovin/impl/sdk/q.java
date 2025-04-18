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
import com.applovin.impl.jn;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sj;
import com.applovin.impl.tm;
import com.applovin.impl.wh;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a */
    private final j f26837a;

    /* renamed from: b */
    private final Executor f26838b;
    private final MeasurementManager e;

    /* renamed from: h */
    private final TopicsManager f26842h;

    /* renamed from: c */
    private final Set f26839c = new HashSet();
    private final Object d = new Object();

    /* renamed from: f */
    private final AtomicReference f26840f = new AtomicReference(new JSONArray());

    /* renamed from: g */
    private final d f26841g = new d(this, null);

    /* loaded from: classes.dex */
    public class a implements OutcomeReceiver {
        public a() {
        }

        /* renamed from: a */
        public void onError(Exception exc) {
            q.this.f26837a.J();
            if (n.a()) {
                q.this.f26837a.J().a("PrivacySandboxService", "Failed to register impression", exc);
            }
        }

        public void onResult(Object obj) {
            q.this.f26837a.J();
            if (n.a()) {
                q.this.f26837a.J().a("PrivacySandboxService", "Successfully registered impression");
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements OutcomeReceiver {
        public b() {
        }

        /* renamed from: a */
        public void onError(Exception exc) {
            q.this.f26837a.J();
            if (n.a()) {
                q.this.f26837a.J().a("PrivacySandboxService", "Failed to register click", exc);
            }
        }

        public void onResult(Object obj) {
            q.this.f26837a.J();
            if (n.a()) {
                q.this.f26837a.J().a("PrivacySandboxService", "Successfully registered click");
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements OutcomeReceiver {
        public c() {
        }

        /* renamed from: a */
        public void onError(Exception exc) {
            q.this.f26837a.J();
            if (n.a()) {
                q.this.f26837a.J().a("PrivacySandboxService", "Failed to register conversion", exc);
            }
        }

        public void onResult(Object obj) {
            q.this.f26837a.J();
            if (n.a()) {
                q.this.f26837a.J().a("PrivacySandboxService", "Successfully registered conversion");
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
            q.this.f26837a.J();
            if (n.a()) {
                q.this.f26837a.J().d("PrivacySandboxService", size + " topic(s) received");
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = topics.iterator();
            while (it.hasNext()) {
                Topic l2 = androidx.privacysandbox.ads.adservices.customaudience.a.l(it.next());
                JSONObject jSONObject = new JSONObject();
                topicId = l2.getTopicId();
                JsonUtils.putInt(jSONObject, "id", topicId);
                modelVersion = l2.getModelVersion();
                JsonUtils.putLong(jSONObject, DeviceRequestsHelper.DEVICE_INFO_MODEL, modelVersion);
                taxonomyVersion = l2.getTaxonomyVersion();
                JsonUtils.putLong(jSONObject, "taxonomy", taxonomyVersion);
                jSONArray.put(jSONObject);
            }
            q.this.f26840f.set(jSONArray);
            q.this.b(((Boolean) q.this.f26837a.a(sj.K6)).booleanValue(), ((Long) q.this.f26837a.a(sj.I6)).longValue());
        }

        public /* bridge */ /* synthetic */ void onResult(Object obj) {
            a(androidx.privacysandbox.ads.adservices.customaudience.a.k(obj));
        }

        public /* synthetic */ d(q qVar, a aVar) {
            this();
        }

        /* renamed from: a */
        public void onError(Exception exc) {
            String str;
            Long l2 = (Long) q.this.f26837a.a(sj.J6);
            boolean z2 = l2.longValue() == -1;
            q.this.f26837a.J();
            if (n.a()) {
                n J = q.this.f26837a.J();
                StringBuilder sb = new StringBuilder("Failed to retrieve topics");
                if (z2) {
                    str = "";
                } else {
                    str = ", retrying in " + l2 + " ms";
                }
                sb.append(str);
                J.a("PrivacySandboxService", sb.toString(), exc);
            }
            if (z2) {
                return;
            }
            q.this.b(((Boolean) q.this.f26837a.a(sj.L6)).booleanValue(), l2.longValue());
        }
    }

    public q(j jVar) {
        this.f26837a = jVar;
        this.f26838b = jVar.j0().a();
        Context l2 = j.l();
        this.e = androidx.privacysandbox.ads.adservices.customaudience.a.f(l2.getSystemService(androidx.privacysandbox.ads.adservices.customaudience.a.n()));
        this.f26842h = androidx.privacysandbox.ads.adservices.customaudience.a.m(l2.getSystemService(androidx.privacysandbox.ads.adservices.customaudience.a.x()));
        if (((Boolean) jVar.a(sj.H6)).booleanValue()) {
            b(((Boolean) jVar.a(sj.K6)).booleanValue(), 0L);
        }
    }

    private boolean c(String str) {
        synchronized (this.d) {
            try {
                if (this.f26839c.contains(str)) {
                    return false;
                }
                this.f26839c.add(str);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(List list) {
        a("register impression", new androidx.core.content.res.a(19, this, list));
    }

    public /* synthetic */ void a(List list) {
        if (list == null || list.isEmpty() || this.e == null || !wh.e(j.f26636w0)) {
            return;
        }
        this.f26837a.J();
        if (n.a()) {
            this.f26837a.J().a("PrivacySandboxService", "Registering impression...");
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.e.registerSource(Uri.parse((String) it.next()), null, this.f26838b, new a());
        }
    }

    public void b(List list, InputEvent inputEvent) {
        a("register click", new r(this, 4, list, inputEvent));
    }

    public void b(String str) {
        a("register conversion trigger event", new androidx.core.content.res.a(20, this, str));
    }

    public void b(boolean z2, long j2) {
        a("retrieve topics", new c0(this, z2, j2, 0));
    }

    public /* synthetic */ void a(List list, InputEvent inputEvent) {
        if (list == null || list.isEmpty() || this.e == null || !wh.e(j.f26636w0)) {
            return;
        }
        this.f26837a.J();
        if (n.a()) {
            this.f26837a.J().a("PrivacySandboxService", "Registering click...");
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.e.registerSource(Uri.parse((String) it.next()), inputEvent, this.f26838b, new b());
        }
    }

    public /* synthetic */ void a(String str) {
        if (TextUtils.isEmpty(str) || this.e == null || !wh.e(j.f26636w0)) {
            return;
        }
        this.f26837a.J();
        if (n.a()) {
            com.applovin.impl.adview.t.v("Registering conversion: ", str, this.f26837a.J(), "PrivacySandboxService");
        }
        this.e.registerTrigger(Uri.parse(str), this.f26838b, new c());
    }

    public JSONArray a() {
        return (JSONArray) this.f26840f.get();
    }

    public /* synthetic */ void a(boolean z2, long j2) {
        GetTopicsRequest.Builder shouldRecordObservation;
        GetTopicsRequest.Builder adsSdkName;
        GetTopicsRequest build;
        if (this.f26842h == null) {
            return;
        }
        shouldRecordObservation = androidx.privacysandbox.ads.adservices.customaudience.a.g().setShouldRecordObservation(z2);
        adsSdkName = shouldRecordObservation.setAdsSdkName("AppLovin");
        build = adsSdkName.build();
        if (j2 > 0) {
            this.f26837a.j0().a(new jn(this.f26837a, true, "getTopics", new androidx.core.content.res.a(21, this, build)), tm.b.OTHER, j2);
        } else {
            this.f26842h.getTopics(build, this.f26838b, this.f26841g);
        }
    }

    public /* synthetic */ void a(GetTopicsRequest getTopicsRequest) {
        this.f26842h.getTopics(getTopicsRequest, this.f26838b, this.f26841g);
    }

    private void a(String str, Runnable runnable) {
        try {
            this.f26837a.J();
            if (n.a()) {
                this.f26837a.J().a("PrivacySandboxService", "Running operation: " + str);
            }
            runnable.run();
        } catch (Throwable th) {
            this.f26837a.J();
            if (n.a()) {
                this.f26837a.J().a("PrivacySandboxService", "Failed to run operation: " + str, th);
            }
            if (c(str)) {
                this.f26837a.E().a("PrivacySandboxService", str, th);
            }
        }
    }
}
