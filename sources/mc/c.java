package mc;

import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class c {
    public final Set a;

    /* renamed from: b, reason: collision with root package name */
    public final HttpURLConnection f22151b;

    /* renamed from: c, reason: collision with root package name */
    public final i f22152c;

    /* renamed from: d, reason: collision with root package name */
    public final d f22153d;

    /* renamed from: e, reason: collision with root package name */
    public final m f22154e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f22155f;

    /* renamed from: g, reason: collision with root package name */
    public final Random f22156g = new Random();

    public c(HttpURLConnection httpURLConnection, i iVar, d dVar, Set set, m mVar, ScheduledExecutorService scheduledExecutorService) {
        this.f22151b = httpURLConnection;
        this.f22152c = iVar;
        this.f22153d = dVar;
        this.a = set;
        this.f22154e = mVar;
        this.f22155f = scheduledExecutorService;
    }

    public final void a(int i10, long j3) {
        if (i10 == 0) {
            new lc.f("Unable to fetch the latest version of the template.");
            synchronized (this) {
                for (m mVar : this.a) {
                    n nVar = mVar.a;
                    synchronized (nVar) {
                        nVar.f22205d = true;
                    }
                    mVar.a.g();
                }
            }
            return;
        }
        this.f22155f.schedule(new b(this, i10, j3), this.f22156g.nextInt(4), TimeUnit.SECONDS);
    }

    public final void b(InputStream inputStream) {
        JSONObject jSONObject;
        boolean isEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String str = "";
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            str = eb.j.k(str, readLine);
            if (readLine.contains("}")) {
                int indexOf = str.indexOf(123);
                int lastIndexOf = str.lastIndexOf(125);
                if (indexOf < 0 || lastIndexOf < 0 || indexOf >= lastIndexOf) {
                    str = "";
                } else {
                    str = str.substring(indexOf, lastIndexOf + 1);
                }
                if (!str.isEmpty()) {
                    try {
                        jSONObject = new JSONObject(str);
                    } catch (JSONException e2) {
                        new lc.c(e2.getCause());
                        synchronized (this) {
                            for (m mVar : this.a) {
                                n nVar = mVar.a;
                                synchronized (nVar) {
                                    nVar.f22205d = true;
                                    mVar.a.g();
                                }
                            }
                            Log.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", e2);
                        }
                    }
                    if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                        m mVar2 = this.f22154e;
                        new lc.f("The server is temporarily unavailable. Try again in a few minutes.");
                        n nVar2 = mVar2.a;
                        synchronized (nVar2) {
                            nVar2.f22205d = true;
                        }
                        mVar2.a.g();
                        break;
                    }
                    synchronized (this) {
                        isEmpty = this.a.isEmpty();
                    }
                    if (isEmpty) {
                        break;
                    }
                    if (jSONObject.has("latestTemplateVersionNumber")) {
                        long j3 = this.f22152c.f22188h.a.getLong("last_template_version", 0L);
                        long j10 = jSONObject.getLong("latestTemplateVersionNumber");
                        if (j10 > j3) {
                            a(3, j10);
                        }
                    }
                    str = "";
                } else {
                    continue;
                }
            }
        }
        bufferedReader.close();
        inputStream.close();
    }

    public final void c() {
        HttpURLConnection httpURLConnection = this.f22151b;
        try {
            if (httpURLConnection == null) {
                return;
            }
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                b(inputStream);
                inputStream.close();
            } catch (IOException e2) {
                Log.d("FirebaseRemoteConfig", "Stream was cancelled due to an exception. Retrying the connection...", e2);
            }
        } finally {
            httpURLConnection.disconnect();
        }
    }
}
