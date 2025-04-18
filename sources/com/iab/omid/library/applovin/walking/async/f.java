package com.iab.omid.library.applovin.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.applovin.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class f extends a {
    public f(b.InterfaceC0157b interfaceC0157b, HashSet<String> hashSet, JSONObject jSONObject, long j3) {
        super(interfaceC0157b, hashSet, jSONObject, j3);
    }

    private void b(String str) {
        com.iab.omid.library.applovin.internal.c c10 = com.iab.omid.library.applovin.internal.c.c();
        if (c10 != null) {
            for (com.iab.omid.library.applovin.adsession.a aVar : c10.b()) {
                if (this.f12212c.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().b(str, this.f12214e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.applovin.utils.c.h(this.f12213d, this.f12215b.a())) {
            return null;
        }
        this.f12215b.a(this.f12213d);
        return this.f12213d.toString();
    }

    @Override // com.iab.omid.library.applovin.walking.async.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}
