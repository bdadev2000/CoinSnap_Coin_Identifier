package com.iab.omid.library.applovin.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.applovin.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class f extends a {
    public f(b.InterfaceC0145b interfaceC0145b, HashSet<String> hashSet, JSONObject jSONObject, long j7) {
        super(interfaceC0145b, hashSet, jSONObject, j7);
    }

    private void b(String str) {
        com.iab.omid.library.applovin.internal.c c9 = com.iab.omid.library.applovin.internal.c.c();
        if (c9 != null) {
            for (com.iab.omid.library.applovin.adsession.a aVar : c9.b()) {
                if (this.f14478c.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().b(str, this.f14480e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.applovin.utils.c.h(this.f14479d, this.b.a())) {
            return null;
        }
        this.b.a(this.f14479d);
        return this.f14479d.toString();
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
