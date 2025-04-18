package com.applovin.impl.sdk.network;

import android.text.TextUtils;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.t;
import com.applovin.impl.xl;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c extends xl {

    /* renamed from: h, reason: collision with root package name */
    private final b f7915h;

    /* renamed from: i, reason: collision with root package name */
    private final t f7916i;

    /* renamed from: j, reason: collision with root package name */
    private AtomicBoolean f7917j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f7918k;

    public c(b bVar, k kVar) {
        super("PersistentPostbackQueueSaveTask", kVar);
        this.f7917j = new AtomicBoolean();
        this.f7918k = false;
        this.f7915h = bVar;
        this.f7916i = kVar.L();
    }

    public List a(int i10) {
        ArrayList arrayList = new ArrayList();
        p D = this.a.D();
        if (!D.b("persistent_postback_cache.json", k.k())) {
            t.h("PersistentPostbackQueueSaveTask", "Postbacks queue file does not exist.");
            return arrayList;
        }
        File a = D.a("persistent_postback_cache.json", k.k());
        String e2 = D.e(a);
        if (TextUtils.isEmpty(e2)) {
            t.h("PersistentPostbackQueueSaveTask", "Postbacks queue file has no content.");
            return arrayList;
        }
        boolean z10 = false;
        try {
            JSONArray jSONArray = new JSONObject(e2).getJSONArray("pb");
            if (t.a()) {
                this.f7916i.a("PersistentPostbackQueueSaveTask", "Deserializing " + jSONArray.length() + " postback(s)...");
            }
            arrayList.ensureCapacity(Math.max(1, jSONArray.length()));
            Integer num = (Integer) this.a.a(oj.V2);
            for (int i11 = 0; i11 < jSONArray.length() && arrayList.size() < i10; i11++) {
                try {
                    d dVar = new d(jSONArray.getJSONObject(i11), this.a);
                    if (dVar.c() < num.intValue()) {
                        arrayList.add(dVar);
                    } else {
                        t.h("PersistentPostbackQueueSaveTask", "Skipping deserialization because maximum attempt count exceeded for postback: " + dVar);
                    }
                } catch (Throwable th2) {
                    t.c("PersistentPostbackQueueSaveTask", "Unable to deserialize postback from json", th2);
                    this.a.B().a("PersistentPostbackQueueSaveTask", "deserializePostback", th2);
                }
            }
            if (t.a()) {
                this.f7916i.a("PersistentPostbackQueueSaveTask", "Successfully loaded postback queue with " + arrayList.size() + " postback(s).");
            }
        } catch (Throwable th3) {
            try {
                t.c("PersistentPostbackQueueSaveTask", "Failed to load postback queue", th3);
                try {
                    this.a.B().a("PersistentPostbackQueueSaveTask", "deserializePostbackQueue", th3);
                    if (((Boolean) this.a.a(oj.f6666h1)).booleanValue()) {
                        D.a(a, "removeAfterDeserializationFail");
                    }
                } catch (Throwable th4) {
                    th = th4;
                    z10 = true;
                    if (z10 && ((Boolean) this.a.a(oj.f6666h1)).booleanValue()) {
                        D.a(a, "removeAfterDeserializationFail");
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
        this.f7918k = arrayList.isEmpty();
        return arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        a(this.f7915h.d());
    }

    private void a(List list) {
        if (!(this.f7918k && list.isEmpty()) && this.f7917j.compareAndSet(false, true)) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                try {
                    jSONArray.put(dVar.q());
                } catch (Throwable th2) {
                    t.c("PersistentPostbackQueueSaveTask", "Unable to serialize postback to JSON: " + dVar, th2);
                    this.a.B().a("PersistentPostbackQueueSaveTask", "serializePostback", th2);
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pb", jSONArray);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(jSONObject.toString().getBytes("UTF-8"));
                p D = this.a.D();
                if (D.a((InputStream) byteArrayInputStream, D.a("persistent_postback_cache.json", k.k()), true)) {
                    if (t.a()) {
                        this.f7916i.a("PersistentPostbackQueueSaveTask", "Exported postback queue to disk.");
                    }
                } else if (t.a()) {
                    this.f7916i.b("PersistentPostbackQueueSaveTask", "Unable to export postback queue to disk.");
                }
            } catch (Throwable th3) {
                t.c("PersistentPostbackQueueSaveTask", "Unable to export postbacks to disk: " + jSONArray, th3);
                this.a.B().a("PersistentPostbackQueueSaveTask", "serializePostbackQueue", th3);
            }
            this.f7917j.set(false);
        }
    }
}
