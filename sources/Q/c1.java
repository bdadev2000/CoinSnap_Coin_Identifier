package q;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.tools.arruler.photomeasure.camera.ruler.R;
import j5.C2400c;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import l5.C2451c;
import l5.RunnableC2450b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f22636a;
    public final Object b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f22637c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f22638d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f22639e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f22640f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f22641g;

    public c1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f22638d = layoutParams;
        this.f22639e = new Rect();
        this.f22640f = new int[2];
        this.f22641g = new int[2];
        this.f22636a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.b = inflate;
        this.f22637c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(c1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public void a(int i9, long j7) {
        if (i9 == 0) {
            new k5.f("Unable to fetch the latest version of the template.");
            d();
            return;
        }
        ((ScheduledExecutorService) this.f22640f).schedule(new RunnableC2450b(this, i9, j7), ((Random) this.f22641g).nextInt(4), TimeUnit.SECONDS);
    }

    public void b(InputStream inputStream) {
        JSONObject jSONObject;
        boolean isEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String str = "";
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            str = com.mbridge.msdk.foundation.entity.o.j(str, readLine);
            if (readLine.contains("}")) {
                int indexOf = str.indexOf(123);
                int lastIndexOf = str.lastIndexOf(125);
                String str2 = "";
                if (indexOf >= 0 && lastIndexOf >= 0 && indexOf < lastIndexOf) {
                    str2 = str.substring(indexOf, lastIndexOf + 1);
                }
                str = str2;
                if (!str.isEmpty()) {
                    try {
                        jSONObject = new JSONObject(str);
                    } catch (JSONException e4) {
                        new g4.h("Unable to parse config update message.", e4.getCause());
                        d();
                        Log.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", e4);
                    }
                    if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                        l5.l lVar = (l5.l) this.f22639e;
                        new k5.f("The server is temporarily unavailable. Try again in a few minutes.");
                        l5.m mVar = lVar.f21621a;
                        synchronized (mVar) {
                            mVar.f21626d = true;
                        }
                        lVar.f21621a.g();
                        break;
                    }
                    synchronized (this) {
                        isEmpty = ((Set) this.f22636a).isEmpty();
                    }
                    if (isEmpty) {
                        break;
                    }
                    if (jSONObject.has("latestTemplateVersionNumber")) {
                        long j7 = ((l5.g) this.f22637c).f21606h.f21616a.getLong("last_template_version", 0L);
                        long j9 = jSONObject.getLong("latestTemplateVersionNumber");
                        if (j9 > j7) {
                            a(3, j9);
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

    public void c() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.b;
        if (httpURLConnection == null) {
            return;
        }
        try {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                b(inputStream);
                inputStream.close();
            } catch (IOException e4) {
                Log.d("FirebaseRemoteConfig", "Stream was cancelled due to an exception. Retrying the connection...", e4);
            }
        } finally {
            httpURLConnection.disconnect();
        }
    }

    public synchronized void d() {
        for (l5.l lVar : (Set) this.f22636a) {
            l5.m mVar = lVar.f21621a;
            synchronized (mVar) {
                mVar.f21626d = true;
            }
            lVar.f21621a.g();
        }
    }

    public c1(HttpURLConnection httpURLConnection, l5.g gVar, C2451c c2451c, Set set, l5.l lVar, ScheduledExecutorService scheduledExecutorService) {
        this.b = httpURLConnection;
        this.f22637c = gVar;
        this.f22638d = c2451c;
        this.f22636a = set;
        this.f22639e = lVar;
        this.f22640f = scheduledExecutorService;
        this.f22641g = new Random();
    }

    public c1(S1.e eVar, S1.e eVar2, S1.e eVar3, S1.e eVar4, P1.s sVar, P1.u uVar) {
        this.f22641g = k2.d.a(150, new C2400c(this, 8));
        this.f22636a = eVar;
        this.b = eVar2;
        this.f22637c = eVar3;
        this.f22638d = eVar4;
        this.f22639e = sVar;
        this.f22640f = uVar;
    }
}
