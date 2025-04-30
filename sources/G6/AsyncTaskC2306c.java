package g6;

import Z5.h;
import android.text.TextUtils;
import b6.g;
import d6.AbstractC2191a;
import e6.AbstractC2224b;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: g6.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class AsyncTaskC2306c extends AbstractAsyncTaskC2304a {

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f20488c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f20489d;

    /* renamed from: e, reason: collision with root package name */
    public final long f20490e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f20491f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncTaskC2306c(a7.b bVar, HashSet hashSet, JSONObject jSONObject, long j7, int i9) {
        super(bVar);
        this.f20491f = i9;
        this.f20488c = new HashSet(hashSet);
        this.f20489d = jSONObject;
        this.f20490e = j7;
    }

    @Override // g6.AbstractAsyncTaskC2304a
    /* renamed from: a */
    public final void onPostExecute(String str) {
        b6.c cVar;
        switch (this.f20491f) {
            case 0:
                b6.c cVar2 = b6.c.f5337c;
                if (cVar2 != null) {
                    for (h hVar : Collections.unmodifiableCollection(cVar2.f5338a)) {
                        if (this.f20488c.contains(hVar.f3904h)) {
                            AbstractC2191a abstractC2191a = hVar.f3901e;
                            if (this.f20490e >= abstractC2191a.f19915e && abstractC2191a.f19914d != 3) {
                                abstractC2191a.f19914d = 3;
                                g.f5341a.a(abstractC2191a.e(), "setNativeViewHierarchy", str, abstractC2191a.f19912a);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                return;
            default:
                if (!TextUtils.isEmpty(str) && (cVar = b6.c.f5337c) != null) {
                    for (h hVar2 : Collections.unmodifiableCollection(cVar.f5338a)) {
                        if (this.f20488c.contains(hVar2.f3904h)) {
                            AbstractC2191a abstractC2191a2 = hVar2.f3901e;
                            if (this.f20490e >= abstractC2191a2.f19915e) {
                                abstractC2191a2.f19914d = 2;
                                g.f5341a.a(abstractC2191a2.e(), "setNativeViewHierarchy", str, abstractC2191a2.f19912a);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                return;
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        switch (this.f20491f) {
            case 0:
                return this.f20489d.toString();
            default:
                a7.b bVar = this.b;
                JSONObject jSONObject = (JSONObject) bVar.f4077c;
                JSONObject jSONObject2 = this.f20489d;
                if (AbstractC2224b.e(jSONObject2, jSONObject)) {
                    return null;
                }
                bVar.f4077c = jSONObject2;
                return jSONObject2.toString();
        }
    }

    @Override // g6.AbstractAsyncTaskC2304a, android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        switch (this.f20491f) {
            case 0:
                onPostExecute((String) obj);
                return;
            default:
                onPostExecute((String) obj);
                return;
        }
    }
}
