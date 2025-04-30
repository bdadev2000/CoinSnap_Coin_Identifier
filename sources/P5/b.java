package P5;

import O5.i;
import O5.k;
import R5.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final k f2431a;

    public b(k kVar) {
        this.f2431a = kVar;
    }

    public static b b(O5.b bVar) {
        k kVar = (k) bVar;
        R2.b.c(bVar, "AdSession is null");
        if (i.NATIVE == ((i) kVar.b.f2199c)) {
            if (!kVar.f2233f) {
                R2.b.e(kVar);
                T5.a aVar = kVar.f2232e;
                if (aVar.f3021d == null) {
                    b bVar2 = new b(kVar);
                    aVar.f3021d = bVar2;
                    return bVar2;
                }
                throw new IllegalStateException("MediaEvents already exists for AdSession");
            }
            throw new IllegalStateException("AdSession is started");
        }
        throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
    }

    public final void a() {
        a aVar = a.CLICK;
        k kVar = this.f2431a;
        R2.b.b(kVar);
        JSONObject jSONObject = new JSONObject();
        U5.b.b(jSONObject, "interactionType", aVar);
        kVar.f2232e.c("adUserInteraction", jSONObject);
    }

    public final void c() {
        k kVar = this.f2431a;
        R2.b.b(kVar);
        kVar.f2232e.c(CampaignEx.JSON_NATIVE_VIDEO_RESUME, null);
    }

    public final void d(float f9, float f10) {
        if (f9 > 0.0f) {
            if (f10 >= 0.0f && f10 <= 1.0f) {
                k kVar = this.f2431a;
                R2.b.b(kVar);
                JSONObject jSONObject = new JSONObject();
                U5.b.b(jSONObject, "duration", Float.valueOf(f9));
                U5.b.b(jSONObject, "mediaPlayerVolume", Float.valueOf(f10));
                U5.b.b(jSONObject, "deviceVolume", Float.valueOf(j.b().b));
                kVar.f2232e.c("start", jSONObject);
                return;
            }
            throw new IllegalArgumentException("Invalid Media volume");
        }
        throw new IllegalArgumentException("Invalid Media duration");
    }

    public final void e(float f9) {
        if (f9 >= 0.0f && f9 <= 1.0f) {
            k kVar = this.f2431a;
            R2.b.b(kVar);
            JSONObject jSONObject = new JSONObject();
            U5.b.b(jSONObject, "mediaPlayerVolume", Float.valueOf(f9));
            U5.b.b(jSONObject, "deviceVolume", Float.valueOf(j.b().b));
            kVar.f2232e.c("volumeChange", jSONObject);
            return;
        }
        throw new IllegalArgumentException("Invalid Media volume");
    }
}
