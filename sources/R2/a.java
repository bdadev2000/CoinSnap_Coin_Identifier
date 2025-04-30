package R2;

import G7.j;
import G7.r;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentTransaction;
import com.applovin.impl.S2;
import com.applovin.impl.de;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.g;
import com.applovin.impl.w4;
import com.bumptech.glide.d;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.vungle.ads.C2137s;
import com.vungle.ads.InterfaceC2072c0;
import com.vungle.ads.internal.Z;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;
import t7.InterfaceC2717f;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2635c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2636d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2637f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2638g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2639h;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i9) {
        this.b = i9;
        this.f2635c = obj;
        this.f2636d = obj2;
        this.f2637f = obj3;
        this.f2638g = obj4;
        this.f2639h = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                Condition condition = (Condition) this.f2639h;
                URL url = (URL) this.f2635c;
                j.e(url, "$openIdKeyUrl");
                r rVar = (r) this.f2636d;
                j.e(rVar, "$result");
                String str = (String) this.f2637f;
                j.e(str, "$kid");
                ReentrantLock reentrantLock = (ReentrantLock) this.f2638g;
                j.e(reentrantLock, "$lock");
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
                if (uRLConnection != null) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                    try {
                        try {
                            InputStream inputStream = httpURLConnection.getInputStream();
                            j.d(inputStream, "connection.inputStream");
                            String T2 = d.T(new BufferedReader(new InputStreamReader(inputStream, O7.a.f2244a), FragmentTransaction.TRANSIT_EXIT_MASK));
                            httpURLConnection.getInputStream().close();
                            rVar.b = new JSONObject(T2).optString(str);
                            httpURLConnection.disconnect();
                            reentrantLock.lock();
                            try {
                                condition.signal();
                            } finally {
                            }
                        } catch (Throwable th) {
                            httpURLConnection.disconnect();
                            reentrantLock.lock();
                            try {
                                condition.signal();
                                throw th;
                            } finally {
                            }
                        }
                    } catch (Exception e4) {
                        String name = b.class.getName();
                        String message = e4.getMessage();
                        if (message == null) {
                            message = "Error getting public key";
                        }
                        Log.d(name, message);
                        httpURLConnection.disconnect();
                        reentrantLock.lock();
                        try {
                            condition.signal();
                        } finally {
                        }
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            case 1:
                ((MediationServiceImpl) this.f2635c).a((de) this.f2636d, (g) this.f2637f, (Activity) this.f2638g, (a.InterfaceC0023a) this.f2639h);
                return;
            case 2:
                ((w4) this.f2635c).a((View) this.f2636d, (FrameLayout) this.f2637f, (ViewTreeObserver) this.f2638g, (S2) ((ViewTreeObserver.OnGlobalLayoutListener) this.f2639h));
                return;
            case 3:
                C2137s.m108logError$lambda2((com.vungle.ads.internal.protos.g) this.f2635c, (String) this.f2637f, (String) this.f2636d, (String) this.f2638g, (String) this.f2639h);
                return;
            default:
                Z.c((Context) this.f2635c, (String) this.f2637f, (Z) this.f2636d, (InterfaceC2072c0) this.f2638g, (InterfaceC2717f) this.f2639h);
                return;
        }
    }

    public /* synthetic */ a(Object obj, String str, Object obj2, Object obj3, Object obj4, int i9) {
        this.b = i9;
        this.f2635c = obj;
        this.f2637f = str;
        this.f2636d = obj2;
        this.f2638g = obj3;
        this.f2639h = obj4;
    }
}
