package r5;

import F7.p;
import Q7.InterfaceC0253v;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;
import t7.AbstractC2712a;
import t7.y;
import x7.EnumC2928a;
import y7.AbstractC2960i;

/* renamed from: r5.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2673e extends AbstractC2960i implements p {

    /* renamed from: g, reason: collision with root package name */
    public int f22858g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l5.k f22859h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Map f22860i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f22861j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p f22862k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2673e(l5.k kVar, Map map, C2670b c2670b, C2671c c2671c, w7.f fVar) {
        super(2, fVar);
        this.f22859h = kVar;
        this.f22860i = map;
        this.f22861j = c2670b;
        this.f22862k = c2671c;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        return new C2673e(this.f22859h, this.f22860i, (C2670b) this.f22861j, (C2671c) this.f22862k, fVar);
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        return ((C2673e) c((InterfaceC0253v) obj, (w7.f) obj2)).i(y.f23029a);
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        EnumC2928a enumC2928a = EnumC2928a.b;
        int i9 = this.f22858g;
        p pVar = this.f22862k;
        try {
            if (i9 != 0) {
                if (i9 != 1 && i9 != 2) {
                    if (i9 == 3) {
                        AbstractC2712a.f(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC2712a.f(obj);
                }
            } else {
                AbstractC2712a.f(obj);
                URLConnection openConnection = l5.k.a(this.f22859h).openConnection();
                G7.j.c(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                httpsURLConnection.setRequestMethod("GET");
                httpsURLConnection.setRequestProperty("Accept", "application/json");
                for (Map.Entry entry : this.f22860i.entrySet()) {
                    httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                int responseCode = httpsURLConnection.getResponseCode();
                if (responseCode == 200) {
                    InputStream inputStream = httpsURLConnection.getInputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    }
                    bufferedReader.close();
                    inputStream.close();
                    JSONObject jSONObject = new JSONObject(sb.toString());
                    p pVar2 = this.f22861j;
                    this.f22858g = 1;
                    if (pVar2.g(jSONObject, this) == enumC2928a) {
                        return enumC2928a;
                    }
                } else {
                    String str = "Bad response code: " + responseCode;
                    this.f22858g = 2;
                    if (pVar.g(str, this) == enumC2928a) {
                        return enumC2928a;
                    }
                }
            }
        } catch (Exception e4) {
            String message = e4.getMessage();
            if (message == null) {
                message = e4.toString();
            }
            this.f22858g = 3;
            if (pVar.g(message, this) == enumC2928a) {
                return enumC2928a;
            }
        }
        return y.f23029a;
    }
}
