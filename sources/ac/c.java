package ac;

import android.util.Base64OutputStream;
import com.mbridge.msdk.MBridgeConstans;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Callable {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f428b;

    public /* synthetic */ c(d dVar, int i10) {
        this.a = i10;
        this.f428b = dVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String byteArrayOutputStream;
        switch (this.a) {
            case 0:
                d dVar = this.f428b;
                synchronized (dVar) {
                    h hVar = (h) dVar.a.get();
                    ArrayList c10 = hVar.c();
                    hVar.b();
                    JSONArray jSONArray = new JSONArray();
                    for (int i10 = 0; i10 < c10.size(); i10++) {
                        a aVar = (a) c10.get(i10);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("agent", aVar.a);
                        jSONObject.put("dates", new JSONArray((Collection) aVar.f425b));
                        jSONArray.put(jSONObject);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("heartbeats", jSONArray);
                    jSONObject2.put("version", MBridgeConstans.API_REUQEST_CATEGORY_APP);
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                    try {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                        try {
                            gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                            gZIPOutputStream.close();
                            base64OutputStream.close();
                            byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                        } finally {
                        }
                    } finally {
                    }
                }
                return byteArrayOutputStream;
            default:
                d dVar2 = this.f428b;
                synchronized (dVar2) {
                    ((h) dVar2.a.get()).h(System.currentTimeMillis(), ((kc.b) dVar2.f430c.get()).a());
                }
                return null;
        }
    }
}
