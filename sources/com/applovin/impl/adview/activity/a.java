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
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.h0;
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
    private final k a;

    /* renamed from: b, reason: collision with root package name */
    private final t f3682b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f3683c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f3684d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    private Messenger f3685e;

    /* renamed from: com.applovin.impl.adview.activity.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0013a implements AppLovinAdLoadListener {
        public C0013a() {
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) a.this.f3683c.get();
            if (appLovinFullscreenActivity != null) {
                t unused = a.this.f3682b;
                if (t.a()) {
                    a.this.f3682b.a("AppLovinFullscreenActivity", "Presenting ad...");
                }
                b bVar = new b(a.this, null);
                n9.a((com.applovin.impl.sdk.ad.b) appLovinAd, bVar, bVar, bVar, null, a.this.a, appLovinFullscreenActivity, new C0014a(appLovinFullscreenActivity, appLovinAd, bVar));
                return;
            }
            t unused2 = a.this.f3682b;
            if (t.a()) {
                a.this.f3682b.b("AppLovinFullscreenActivity", "Unable to present ad, parent activity has been GC'd - " + appLovinAd);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i10) {
            a.this.a();
        }

        /* renamed from: com.applovin.impl.adview.activity.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0014a implements n9.d {
            final /* synthetic */ AppLovinFullscreenActivity a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AppLovinAd f3686b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f3687c;

            public C0014a(AppLovinFullscreenActivity appLovinFullscreenActivity, AppLovinAd appLovinAd, b bVar) {
                this.a = appLovinFullscreenActivity;
                this.f3686b = appLovinAd;
                this.f3687c = bVar;
            }

            @Override // com.applovin.impl.n9.d
            public void a(n9 n9Var) {
                this.a.setPresenter(n9Var);
                n9Var.A();
            }

            @Override // com.applovin.impl.n9.d
            public void a(String str, Throwable th2) {
                ob.a((com.applovin.impl.sdk.ad.b) this.f3686b, this.f3687c, str, th2, this.a);
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
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d10, boolean z10) {
            Bundle bundle = new Bundle();
            bundle.putDouble("percent_viewed", d10);
            bundle.putBoolean("fully_watched", z10);
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
                a.this.f3685e.send(obtain);
            } catch (RemoteException e2) {
                t unused = a.this.f3682b;
                if (t.a()) {
                    a.this.f3682b.a("AppLovinFullscreenActivity", "Failed to forward callback (" + cVar.b() + ")", e2);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends Handler {
        private final WeakReference a;

        public /* synthetic */ c(a aVar, C0013a c0013a) {
            this(aVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            a aVar;
            if (message.what == FullscreenAdService.c.AD.b() && (aVar = (a) this.a.get()) != null) {
                aVar.a(message.getData().getString(FullscreenAdService.DATA_KEY_RAW_FULL_AD_RESPONSE));
            } else {
                super.handleMessage(message);
            }
        }

        private c(a aVar) {
            this.a = new WeakReference(aVar);
        }
    }

    public a(AppLovinFullscreenActivity appLovinFullscreenActivity, k kVar) {
        this.a = kVar;
        this.f3682b = kVar.L();
        this.f3683c = new WeakReference(appLovinFullscreenActivity);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f3684d.compareAndSet(false, true)) {
            if (t.a()) {
                this.f3682b.a("AppLovinFullscreenActivity", "Fullscreen ad service connected to " + componentName);
            }
            this.f3685e = new Messenger(iBinder);
            Message obtain = Message.obtain((Handler) null, FullscreenAdService.c.AD.b());
            obtain.replyTo = new Messenger(new c(this, null));
            try {
                if (t.a()) {
                    this.f3682b.a("AppLovinFullscreenActivity", "Requesting ad from FullscreenAdService...");
                }
                this.f3685e.send(obtain);
            } catch (RemoteException e2) {
                if (t.a()) {
                    this.f3682b.a("AppLovinFullscreenActivity", "Failed to send ad request message to FullscreenAdService", e2);
                }
                a();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (this.f3684d.compareAndSet(true, false) && t.a()) {
            this.f3682b.a("AppLovinFullscreenActivity", "FullscreenAdService disconnected from " + componentName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) this.f3683c.get();
        if (appLovinFullscreenActivity != null) {
            if (t.a()) {
                this.f3682b.a("AppLovinFullscreenActivity", "Dismissing...");
            }
            appLovinFullscreenActivity.dismiss();
        } else if (t.a()) {
            this.f3682b.b("AppLovinFullscreenActivity", "Unable to dismiss parent Activity");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = JsonUtils.getString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, "");
            if (!TextUtils.isEmpty(string)) {
                this.a.l0().a(new tm(jSONObject, h0.a(string), new C0013a(), this.a));
            } else {
                throw new IllegalStateException("No zone identifier found in ad response: " + jSONObject);
            }
        } catch (JSONException e2) {
            if (t.a()) {
                this.f3682b.a("AppLovinFullscreenActivity", "Unable to process ad: " + str, e2);
            }
            a();
        }
    }
}
