package yd;

import android.support.v4.media.d;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Date;
import ka.e;
import org.json.JSONObject;
import vd.i;

/* loaded from: classes4.dex */
public abstract class a {
    public final String a;

    /* renamed from: c, reason: collision with root package name */
    public vd.a f28168c;

    /* renamed from: e, reason: collision with root package name */
    public long f28170e = System.nanoTime();

    /* renamed from: d, reason: collision with root package name */
    public int f28169d = 1;

    /* renamed from: b, reason: collision with root package name */
    public ce.a f28167b = new ce.a(null);

    public a(String str) {
        this.a = str;
    }

    public final void a(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        zd.b.b(jSONObject, CampaignEx.JSON_KEY_TIMESTAMP, Long.valueOf(date.getTime()));
        e.f20531c.a(e(), "setLastActivity", jSONObject);
    }

    public void b(i iVar, d dVar) {
        c(iVar, dVar, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0106 A[LOOP:0: B:20:0x0100->B:22:0x0106, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(vd.i r10, android.support.v4.media.d r11, org.json.JSONObject r12) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yd.a.c(vd.i, android.support.v4.media.d, org.json.JSONObject):void");
    }

    public void d() {
        this.f28167b.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView e() {
        return (WebView) this.f28167b.get();
    }

    public void f() {
    }
}
