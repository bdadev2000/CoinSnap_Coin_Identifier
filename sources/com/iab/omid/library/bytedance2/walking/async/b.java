package com.iab.omid.library.bytedance2.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class b extends AsyncTask<Object, Void, String> {
    private a a;

    /* renamed from: b, reason: collision with root package name */
    protected final InterfaceC0160b f12308b;

    /* loaded from: classes4.dex */
    public interface a {
        void a(b bVar);
    }

    /* renamed from: com.iab.omid.library.bytedance2.walking.async.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0160b {
        JSONObject a();

        void a(JSONObject jSONObject);
    }

    public b(InterfaceC0160b interfaceC0160b) {
        this.f12308b = interfaceC0160b;
    }

    public void a(a aVar) {
        this.a = aVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
