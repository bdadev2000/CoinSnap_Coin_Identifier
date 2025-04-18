package com.applovin.impl.sdk.network;

import android.text.TextUtils;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sj;
import com.applovin.impl.yl;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class c extends yl {

    /* renamed from: h, reason: collision with root package name */
    private final b f26797h;

    /* renamed from: i, reason: collision with root package name */
    private final n f26798i;

    /* renamed from: j, reason: collision with root package name */
    private AtomicBoolean f26799j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f26800k;

    public c(b bVar, j jVar) {
        super("PersistentPostbackQueueSaveTask", jVar);
        this.f26799j = new AtomicBoolean();
        this.f26800k = false;
        this.f26797h = bVar;
        this.f26798i = jVar.J();
    }

    public List a(int i2) {
        ArrayList arrayList = new ArrayList();
        l B = this.f28216a.B();
        if (!B.b("persistent_postback_cache.json", j.l())) {
            n.h("PersistentPostbackQueueSaveTask", "Postbacks queue file does not exist.");
            return arrayList;
        }
        File a2 = B.a("persistent_postback_cache.json", j.l());
        String e = B.e(a2);
        if (TextUtils.isEmpty(e)) {
            n.h("PersistentPostbackQueueSaveTask", "Postbacks queue file has no content.");
            return arrayList;
        }
        boolean z2 = false;
        try {
            JSONArray jSONArray = new JSONObject(e).getJSONArray("pb");
            if (n.a()) {
                this.f26798i.a("PersistentPostbackQueueSaveTask", "Deserializing " + jSONArray.length() + " postback(s)...");
            }
            arrayList.ensureCapacity(Math.max(1, jSONArray.length()));
            Integer num = (Integer) this.f28216a.a(sj.b3);
            for (int i3 = 0; i3 < jSONArray.length() && arrayList.size() < i2; i3++) {
                try {
                    d dVar = new d(jSONArray.getJSONObject(i3), this.f28216a);
                    if (dVar.c() < num.intValue()) {
                        arrayList.add(dVar);
                    } else {
                        n.h("PersistentPostbackQueueSaveTask", "Skipping deserialization because maximum attempt count exceeded for postback: " + dVar);
                    }
                } catch (Throwable th) {
                    n.c("PersistentPostbackQueueSaveTask", "Unable to deserialize postback from json", th);
                    this.f28216a.E().a("PersistentPostbackQueueSaveTask", "deserializePostback", th);
                }
            }
            if (n.a()) {
                this.f26798i.a("PersistentPostbackQueueSaveTask", "Successfully loaded postback queue with " + arrayList.size() + " postback(s).");
            }
        } catch (Throwable th2) {
            try {
                n.c("PersistentPostbackQueueSaveTask", "Failed to load postback queue", th2);
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                this.f28216a.E().a("PersistentPostbackQueueSaveTask", "deserializePostbackQueue", th2);
                if (((Boolean) this.f28216a.a(sj.f26919g1)).booleanValue()) {
                    B.a(a2, "removeAfterDeserializationFail");
                }
            } catch (Throwable th4) {
                th = th4;
                z2 = true;
                if (z2 && ((Boolean) this.f28216a.a(sj.f26919g1)).booleanValue()) {
                    B.a(a2, "removeAfterDeserializationFail");
                }
                throw th;
            }
        }
        this.f26800k = arrayList.isEmpty();
        return arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        a(this.f26797h.d());
    }

    private void a(List list) {
        if (!(this.f26800k && list.isEmpty()) && this.f26799j.compareAndSet(false, true)) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                try {
                    jSONArray.put(dVar.q());
                } catch (Throwable th) {
                    n.c("PersistentPostbackQueueSaveTask", "Unable to serialize postback to JSON: " + dVar, th);
                    this.f28216a.E().a("PersistentPostbackQueueSaveTask", "serializePostback", th);
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pb", jSONArray);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(jSONObject.toString().getBytes("UTF-8"));
                l B = this.f28216a.B();
                if (B.a((InputStream) byteArrayInputStream, B.a("persistent_postback_cache.json", j.l()), true)) {
                    if (n.a()) {
                        this.f26798i.a("PersistentPostbackQueueSaveTask", "Exported postback queue to disk.");
                    }
                } else if (n.a()) {
                    this.f26798i.b("PersistentPostbackQueueSaveTask", "Unable to export postback queue to disk.");
                }
            } catch (Throwable th2) {
                n.c("PersistentPostbackQueueSaveTask", "Unable to export postbacks to disk: " + jSONArray, th2);
                this.f28216a.E().a("PersistentPostbackQueueSaveTask", "serializePostbackQueue", th2);
            }
            this.f26799j.set(false);
        }
    }
}
