package com.iab.omid.library.applovin.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class b extends AsyncTask<Object, Void, String> {
    private a a;

    /* renamed from: b, reason: collision with root package name */
    protected final InterfaceC0157b f12215b;

    /* loaded from: classes4.dex */
    public interface a {
        void a(b bVar);
    }

    /* renamed from: com.iab.omid.library.applovin.walking.async.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0157b {
        JSONObject a();

        void a(JSONObject jSONObject);
    }

    public b(InterfaceC0157b interfaceC0157b) {
        this.f12215b = interfaceC0157b;
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
