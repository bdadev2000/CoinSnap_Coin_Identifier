package pd;

import android.support.v4.media.d;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Date;
import kd.i;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class a {
    public final String a;

    /* renamed from: c, reason: collision with root package name */
    public kd.a f23595c;

    /* renamed from: d, reason: collision with root package name */
    public ld.b f23596d;

    /* renamed from: f, reason: collision with root package name */
    public long f23598f = System.nanoTime();

    /* renamed from: e, reason: collision with root package name */
    public int f23597e = 1;

    /* renamed from: b, reason: collision with root package name */
    public ce.a f23594b = new ce.a(null);

    public a(String str) {
        this.a = str;
    }

    public final void a(String str, JSONObject jSONObject) {
        b6.b.f2297i.a(f(), "publishMediaEvent", str, jSONObject, this.a);
    }

    public final void b(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        qd.c.b(jSONObject, CampaignEx.JSON_KEY_TIMESTAMP, Long.valueOf(date.getTime()));
        b6.b.f2297i.a(f(), "setLastActivity", jSONObject);
    }

    public void c(i iVar, d dVar) {
        d(iVar, dVar, null);
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
    public final void d(kd.i r10, android.support.v4.media.d r11, org.json.JSONObject r12) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pd.a.d(kd.i, android.support.v4.media.d, org.json.JSONObject):void");
    }

    public void e() {
        this.f23594b.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView f() {
        return (WebView) this.f23594b.get();
    }

    public void g() {
    }
}
