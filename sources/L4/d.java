package L4;

import android.util.Base64OutputStream;
import com.mbridge.msdk.MBridgeConstans;
import j5.C2399b;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1810a;
    public final /* synthetic */ e b;

    public /* synthetic */ d(e eVar, int i9) {
        this.f1810a = i9;
        this.b = eVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String byteArrayOutputStream;
        switch (this.f1810a) {
            case 0:
                e eVar = this.b;
                synchronized (eVar) {
                    try {
                        i iVar = (i) eVar.f1811a.get();
                        ArrayList c9 = iVar.c();
                        iVar.b();
                        JSONArray jSONArray = new JSONArray();
                        for (int i9 = 0; i9 < c9.size(); i9++) {
                            a aVar = (a) c9.get(i9);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", aVar.f1806a);
                            jSONObject.put("dates", new JSONArray((Collection) aVar.b));
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
                        } catch (Throwable th) {
                            try {
                                base64OutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return byteArrayOutputStream;
            default:
                e eVar2 = this.b;
                synchronized (eVar2) {
                    ((i) eVar2.f1811a.get()).h(System.currentTimeMillis(), ((C2399b) eVar2.f1812c.get()).a());
                }
                return null;
        }
    }
}
