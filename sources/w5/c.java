package W5;

import O5.k;
import R5.i;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class c extends a {

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f3620c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f3621d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3622e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3623f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a7.b bVar, HashSet hashSet, JSONObject jSONObject, long j7, int i9) {
        super(bVar);
        this.f3623f = i9;
        this.f3620c = new HashSet(hashSet);
        this.f3621d = jSONObject;
        this.f3622e = j7;
    }

    @Override // W5.a
    /* renamed from: a */
    public final void onPostExecute(String str) {
        R5.c cVar;
        switch (this.f3623f) {
            case 0:
                R5.c cVar2 = R5.c.f2741c;
                if (cVar2 != null) {
                    for (k kVar : Collections.unmodifiableCollection(cVar2.f2742a)) {
                        if (this.f3620c.contains(kVar.f2235h)) {
                            T5.a aVar = kVar.f2232e;
                            if (this.f3622e >= aVar.f3023f && aVar.f3022e != 3) {
                                aVar.f3022e = 3;
                                i.f2751a.a(aVar.f(), "setNativeViewHierarchy", str, aVar.f3019a);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                return;
            default:
                if (!TextUtils.isEmpty(str) && (cVar = R5.c.f2741c) != null) {
                    for (k kVar2 : Collections.unmodifiableCollection(cVar.f2742a)) {
                        if (this.f3620c.contains(kVar2.f2235h)) {
                            T5.a aVar2 = kVar2.f2232e;
                            if (this.f3622e >= aVar2.f3023f) {
                                aVar2.f3022e = 2;
                                i.f2751a.a(aVar2.f(), "setNativeViewHierarchy", str, aVar2.f3019a);
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
        switch (this.f3623f) {
            case 0:
                return this.f3621d.toString();
            default:
                a7.b bVar = this.b;
                JSONObject jSONObject = (JSONObject) bVar.f4077c;
                JSONObject jSONObject2 = this.f3621d;
                if (U5.b.e(jSONObject2, jSONObject)) {
                    return null;
                }
                bVar.f4077c = jSONObject2;
                return jSONObject2.toString();
        }
    }

    @Override // W5.a, android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        switch (this.f3623f) {
            case 0:
                onPostExecute((String) obj);
                return;
            default:
                onPostExecute((String) obj);
                return;
        }
    }
}
