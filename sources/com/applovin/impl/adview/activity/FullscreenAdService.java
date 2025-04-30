package com.applovin.impl.adview.activity;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.bc;
import com.applovin.impl.ob;
import com.applovin.impl.sdk.t;
import com.applovin.impl.zp;

/* loaded from: classes.dex */
public class FullscreenAdService extends Service {
    public static final String DATA_KEY_RAW_FULL_AD_RESPONSE = "raw_full_ad_response";
    private static final String TAG = "FullscreenAdService";

    /* loaded from: classes.dex */
    public static class b extends Handler {
        private b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                ob obVar = AppLovinFullscreenActivity.parentInterstitialWrapper;
                if (obVar == null) {
                    if (!zp.a((Integer) 1)) {
                        super.handleMessage(message);
                        return;
                    } else {
                        throw new RuntimeException("parentWrapper is null for " + message.what);
                    }
                }
                com.applovin.impl.sdk.ad.b f9 = obVar.f();
                int i9 = message.what;
                c cVar = c.AD;
                if (i9 == cVar.b()) {
                    Bundle bundle = new Bundle();
                    bundle.putString(FullscreenAdService.DATA_KEY_RAW_FULL_AD_RESPONSE, f9.getRawFullResponse());
                    Message obtain = Message.obtain((Handler) null, cVar.b());
                    obtain.setData(bundle);
                    try {
                        message.replyTo.send(obtain);
                        return;
                    } catch (RemoteException e4) {
                        t.c(FullscreenAdService.TAG, "Failed to respond to Fullscreen Activity in another process with ad", e4);
                        return;
                    }
                }
                if (message.what == c.AD_DISPLAYED.b()) {
                    bc.a(obVar.c(), f9);
                    return;
                }
                if (message.what == c.AD_CLICKED.b()) {
                    bc.a(obVar.b(), f9);
                    return;
                }
                if (message.what == c.AD_VIDEO_STARTED.b()) {
                    bc.a(obVar.d(), f9);
                    return;
                }
                if (message.what == c.AD_VIDEO_ENDED.b()) {
                    Bundle data = message.getData();
                    bc.a(obVar.d(), f9, data.getDouble("percent_viewed"), data.getBoolean("fully_watched"));
                    return;
                }
                if (message.what == c.AD_HIDDEN.b()) {
                    bc.b(obVar.c(), f9);
                } else {
                    super.handleMessage(message);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        AD(0),
        AD_DISPLAYED(1),
        AD_CLICKED(2),
        AD_VIDEO_STARTED(3),
        AD_VIDEO_ENDED(4),
        AD_HIDDEN(5);


        /* renamed from: a, reason: collision with root package name */
        private final int f6674a;

        c(int i9) {
            this.f6674a = i9;
        }

        public int b() {
            return this.f6674a;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return new Messenger(new b()).getBinder();
    }
}
