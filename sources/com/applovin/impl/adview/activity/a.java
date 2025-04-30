package com.applovin.impl.adview.activity;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.C0703h0;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.n9;
import com.applovin.impl.ob;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.tm;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final k f6675a;
    private final t b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f6676c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f6677d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    private Messenger f6678e;

    /* renamed from: com.applovin.impl.adview.activity.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0013a implements AppLovinAdLoadListener {
        public C0013a() {
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) a.this.f6676c.get();
            if (appLovinFullscreenActivity != null) {
                t unused = a.this.b;
                if (t.a()) {
                    a.this.b.a("AppLovinFullscreenActivity", "Presenting ad...");
                }
                b bVar = new b(a.this, null);
                n9.a((com.applovin.impl.sdk.ad.b) appLovinAd, bVar, bVar, bVar, null, a.this.f6675a, appLovinFullscreenActivity, new C0014a(appLovinFullscreenActivity, appLovinAd, bVar));
                return;
            }
            t unused2 = a.this.b;
            if (t.a()) {
                a.this.b.b("AppLovinFullscreenActivity", "Unable to present ad, parent activity has been GC'd - " + appLovinAd);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i9) {
            a.this.a();
        }

        /* renamed from: com.applovin.impl.adview.activity.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0014a implements n9.d {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AppLovinFullscreenActivity f6680a;
            final /* synthetic */ AppLovinAd b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f6681c;

            public C0014a(AppLovinFullscreenActivity appLovinFullscreenActivity, AppLovinAd appLovinAd, b bVar) {
                this.f6680a = appLovinFullscreenActivity;
                this.b = appLovinAd;
                this.f6681c = bVar;
            }

            @Override // com.applovin.impl.n9.d
            public void a(n9 n9Var) {
                this.f6680a.setPresenter(n9Var);
                n9Var.A();
            }

            @Override // com.applovin.impl.n9.d
            public void a(String str, Throwable th) {
                ob.a((com.applovin.impl.sdk.ad.b) this.b, this.f6681c, str, th, this.f6680a);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdVideoPlaybackListener {
        private b() {
        }

        private void a(FullscreenAdService.c cVar) {
            a(null, cVar);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            a(FullscreenAdService.c.AD_CLICKED);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            a(FullscreenAdService.c.AD_DISPLAYED);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            a(FullscreenAdService.c.AD_HIDDEN);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            a(FullscreenAdService.c.AD_VIDEO_STARTED);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d2, boolean z8) {
            Bundle bundle = new Bundle();
            bundle.putDouble("percent_viewed", d2);
            bundle.putBoolean("fully_watched", z8);
            a(bundle, FullscreenAdService.c.AD_VIDEO_ENDED);
        }

        public /* synthetic */ b(a aVar, C0013a c0013a) {
            this();
        }

        private void a(Bundle bundle, FullscreenAdService.c cVar) {
            Message obtain = Message.obtain((Handler) null, cVar.b());
            if (bundle != null) {
                obtain.setData(bundle);
            }
            try {
                a.this.f6678e.send(obtain);
            } catch (RemoteException e4) {
                t unused = a.this.b;
                if (t.a()) {
                    a.this.b.a("AppLovinFullscreenActivity", "Failed to forward callback (" + cVar.b() + ")", e4);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f6684a;

        public /* synthetic */ c(a aVar, C0013a c0013a) {
            this(aVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            a aVar;
            if (message.what == FullscreenAdService.c.AD.b() && (aVar = (a) this.f6684a.get()) != null) {
                aVar.a(message.getData().getString(FullscreenAdService.DATA_KEY_RAW_FULL_AD_RESPONSE));
            } else {
                super.handleMessage(message);
            }
        }

        private c(a aVar) {
            this.f6684a = new WeakReference(aVar);
        }
    }

    public a(AppLovinFullscreenActivity appLovinFullscreenActivity, k kVar) {
        this.f6675a = kVar;
        this.b = kVar.L();
        this.f6676c = new WeakReference(appLovinFullscreenActivity);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f6677d.compareAndSet(false, true)) {
            if (t.a()) {
                this.b.a("AppLovinFullscreenActivity", "Fullscreen ad service connected to " + componentName);
            }
            this.f6678e = new Messenger(iBinder);
            Message obtain = Message.obtain((Handler) null, FullscreenAdService.c.AD.b());
            obtain.replyTo = new Messenger(new c(this, null));
            try {
                if (t.a()) {
                    this.b.a("AppLovinFullscreenActivity", "Requesting ad from FullscreenAdService...");
                }
                this.f6678e.send(obtain);
            } catch (RemoteException e4) {
                if (t.a()) {
                    this.b.a("AppLovinFullscreenActivity", "Failed to send ad request message to FullscreenAdService", e4);
                }
                a();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (this.f6677d.compareAndSet(true, false) && t.a()) {
            this.b.a("AppLovinFullscreenActivity", "FullscreenAdService disconnected from " + componentName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) this.f6676c.get();
        if (appLovinFullscreenActivity != null) {
            if (t.a()) {
                this.b.a("AppLovinFullscreenActivity", "Dismissing...");
            }
            appLovinFullscreenActivity.dismiss();
        } else if (t.a()) {
            this.b.b("AppLovinFullscreenActivity", "Unable to dismiss parent Activity");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = JsonUtils.getString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, "");
            if (TextUtils.isEmpty(string)) {
                throw new IllegalStateException("No zone identifier found in ad response: " + jSONObject);
            }
            this.f6675a.l0().a(new tm(jSONObject, C0703h0.a(string), new C0013a(), this.f6675a));
        } catch (JSONException e4) {
            if (t.a()) {
                this.b.a("AppLovinFullscreenActivity", "Unable to process ad: " + str, e4);
            }
            a();
        }
    }
}
