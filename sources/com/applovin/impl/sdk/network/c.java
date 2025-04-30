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
    private final b f11083h;

    /* renamed from: i, reason: collision with root package name */
    private final t f11084i;

    /* renamed from: j, reason: collision with root package name */
    private AtomicBoolean f11085j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f11086k;

    public c(b bVar, k kVar) {
        super("PersistentPostbackQueueSaveTask", kVar);
        this.f11085j = new AtomicBoolean();
        this.f11086k = false;
        this.f11083h = bVar;
        this.f11084i = kVar.L();
    }

    public List a(int i9) {
        ArrayList arrayList = new ArrayList();
        p D8 = this.f12278a.D();
        if (!D8.b("persistent_postback_cache.json", k.k())) {
            t.h("PersistentPostbackQueueSaveTask", "Postbacks queue file does not exist.");
            return arrayList;
        }
        File a6 = D8.a("persistent_postback_cache.json", k.k());
        String e4 = D8.e(a6);
        if (TextUtils.isEmpty(e4)) {
            t.h("PersistentPostbackQueueSaveTask", "Postbacks queue file has no content.");
            return arrayList;
        }
        boolean z8 = false;
        try {
            JSONArray jSONArray = new JSONObject(e4).getJSONArray("pb");
            if (t.a()) {
                this.f11084i.a("PersistentPostbackQueueSaveTask", "Deserializing " + jSONArray.length() + " postback(s)...");
            }
            arrayList.ensureCapacity(Math.max(1, jSONArray.length()));
            Integer num = (Integer) this.f12278a.a(oj.f9691V2);
            for (int i10 = 0; i10 < jSONArray.length() && arrayList.size() < i9; i10++) {
                try {
                    d dVar = new d(jSONArray.getJSONObject(i10), this.f12278a);
                    if (dVar.c() < num.intValue()) {
                        arrayList.add(dVar);
                    } else {
                        t.h("PersistentPostbackQueueSaveTask", "Skipping deserialization because maximum attempt count exceeded for postback: " + dVar);
                    }
                } catch (Throwable th) {
                    t.c("PersistentPostbackQueueSaveTask", "Unable to deserialize postback from json", th);
                    this.f12278a.B().a("PersistentPostbackQueueSaveTask", "deserializePostback", th);
                }
            }
            if (t.a()) {
                this.f11084i.a("PersistentPostbackQueueSaveTask", "Successfully loaded postback queue with " + arrayList.size() + " postback(s).");
            }
        } catch (Throwable th2) {
            try {
                t.c("PersistentPostbackQueueSaveTask", "Failed to load postback queue", th2);
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                this.f12278a.B().a("PersistentPostbackQueueSaveTask", "deserializePostbackQueue", th2);
                if (((Boolean) this.f12278a.a(oj.h1)).booleanValue()) {
                    D8.a(a6, "removeAfterDeserializationFail");
                }
            } catch (Throwable th4) {
                th = th4;
                z8 = true;
                if (z8 && ((Boolean) this.f12278a.a(oj.h1)).booleanValue()) {
                    D8.a(a6, "removeAfterDeserializationFail");
                }
                throw th;
            }
        }
        this.f11086k = arrayList.isEmpty();
        return arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        a(this.f11083h.d());
    }

    private void a(List list) {
        if (!(this.f11086k && list.isEmpty()) && this.f11085j.compareAndSet(false, true)) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                try {
                    jSONArray.put(dVar.q());
                } catch (Throwable th) {
                    t.c("PersistentPostbackQueueSaveTask", "Unable to serialize postback to JSON: " + dVar, th);
                    this.f12278a.B().a("PersistentPostbackQueueSaveTask", "serializePostback", th);
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pb", jSONArray);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(jSONObject.toString().getBytes("UTF-8"));
                p D8 = this.f12278a.D();
                if (D8.a((InputStream) byteArrayInputStream, D8.a("persistent_postback_cache.json", k.k()), true)) {
                    if (t.a()) {
                        this.f11084i.a("PersistentPostbackQueueSaveTask", "Exported postback queue to disk.");
                    }
                } else if (t.a()) {
                    this.f11084i.b("PersistentPostbackQueueSaveTask", "Unable to export postback queue to disk.");
                }
            } catch (Throwable th2) {
                t.c("PersistentPostbackQueueSaveTask", "Unable to export postbacks to disk: " + jSONArray, th2);
                this.f12278a.B().a("PersistentPostbackQueueSaveTask", "serializePostbackQueue", th2);
            }
            this.f11085j.set(false);
        }
    }
}
