package ld;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import kd.g;
import kd.i;
import nd.h;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class b {
    public final i a;

    public b(i iVar) {
        this.a = iVar;
    }

    public static b b(kd.b bVar) {
        boolean z10;
        i iVar = (i) bVar;
        com.facebook.internal.i.a(bVar, "AdSession is null");
        if (g.NATIVE == ((g) iVar.f20669b.f1534d)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (!iVar.f20673f) {
                com.facebook.internal.i.h(iVar);
                pd.a aVar = iVar.f20672e;
                if (aVar.f23596d == null) {
                    b bVar2 = new b(iVar);
                    aVar.f23596d = bVar2;
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
        i iVar = this.a;
        com.facebook.internal.i.d(iVar);
        JSONObject jSONObject = new JSONObject();
        qd.c.b(jSONObject, "interactionType", aVar);
        iVar.f20672e.a("adUserInteraction", jSONObject);
    }

    public final void c() {
        i iVar = this.a;
        com.facebook.internal.i.d(iVar);
        iVar.f20672e.a(CampaignEx.JSON_NATIVE_VIDEO_RESUME, null);
    }

    public final void d(float f10, float f11) {
        if (f10 > 0.0f) {
            if (f11 >= 0.0f && f11 <= 1.0f) {
                i iVar = this.a;
                com.facebook.internal.i.d(iVar);
                JSONObject jSONObject = new JSONObject();
                qd.c.b(jSONObject, "duration", Float.valueOf(f10));
                qd.c.b(jSONObject, "mediaPlayerVolume", Float.valueOf(f11));
                qd.c.b(jSONObject, "deviceVolume", Float.valueOf(h.d().c()));
                iVar.f20672e.a("start", jSONObject);
                return;
            }
            throw new IllegalArgumentException("Invalid Media volume");
        }
        throw new IllegalArgumentException("Invalid Media duration");
    }

    public final void e(float f10) {
        if (f10 >= 0.0f && f10 <= 1.0f) {
            i iVar = this.a;
            com.facebook.internal.i.d(iVar);
            JSONObject jSONObject = new JSONObject();
            qd.c.b(jSONObject, "mediaPlayerVolume", Float.valueOf(f10));
            qd.c.b(jSONObject, "deviceVolume", Float.valueOf(h.d().c()));
            iVar.f20672e.a("volumeChange", jSONObject);
            return;
        }
        throw new IllegalArgumentException("Invalid Media volume");
    }
}
