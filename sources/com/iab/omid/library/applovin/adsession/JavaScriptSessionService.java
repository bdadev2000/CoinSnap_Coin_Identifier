package com.iab.omid.library.applovin.adsession;

import T0.c;
import T0.d;
import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.iab.omid.library.applovin.internal.e;
import com.iab.omid.library.applovin.internal.f;
import com.iab.omid.library.applovin.utils.g;
import com.iab.omid.library.applovin.utils.i;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class JavaScriptSessionService {
    private static String JS_MESSAGE_DATA_AD_SESSION_ID = "adSessionId";
    private static String JS_MESSAGE_KEY_DATA = "data";
    private static String JS_MESSAGE_KEY_METHOD = "method";
    private static String JS_MESSAGE_LISTENER_JS_SESSION_SERVICE = "omidJsSessionService";
    private static String JS_MESSAGE_METHOD_FINISH_SESSION = "finishSession";
    private static String JS_MESSAGE_METHOD_START_SESSION = "startSession";
    private static i webViewUtil = new i();
    private final HashMap<String, AdSession> adSessions = new HashMap<>();
    private final f friendlyObstructions = new f();
    private final boolean isHtmlAdView;
    private final Partner partner;
    private com.iab.omid.library.applovin.weakreference.a weakAdView;
    private final WebView webView;

    /* loaded from: classes3.dex */
    public interface TearDownHandler {
        void onTearDown(boolean z8);
    }

    private JavaScriptSessionService(Partner partner, WebView webView, boolean z8) {
        g.a();
        g.a(partner, "Partner is null");
        g.a(webView, "WebView is null");
        this.partner = partner;
        this.webView = webView;
        this.isHtmlAdView = z8;
        addWebViewListener();
    }

    private void addWebViewListener() {
        if (!com.facebook.appevents.g.r("WEB_MESSAGE_LISTENER")) {
            throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        removeWebViewListener();
        webViewUtil.a(this.webView, JS_MESSAGE_LISTENER_JS_SESSION_SERVICE, new HashSet(Arrays.asList("*")), new d() { // from class: com.iab.omid.library.applovin.adsession.JavaScriptSessionService.2
            @Override // T0.d
            public void onPostMessage(WebView webView, c cVar, Uri uri, boolean z8, T0.a aVar) {
                try {
                    JSONObject jSONObject = new JSONObject(cVar.a());
                    String string = jSONObject.getString(JavaScriptSessionService.JS_MESSAGE_KEY_METHOD);
                    String string2 = jSONObject.getJSONObject(JavaScriptSessionService.JS_MESSAGE_KEY_DATA).getString(JavaScriptSessionService.JS_MESSAGE_DATA_AD_SESSION_ID);
                    if (string.equals(JavaScriptSessionService.JS_MESSAGE_METHOD_START_SESSION)) {
                        JavaScriptSessionService.this.startSession(string2);
                    } else if (string.equals(JavaScriptSessionService.JS_MESSAGE_METHOD_FINISH_SESSION)) {
                        JavaScriptSessionService.this.finishSession(string2);
                    } else {
                        com.iab.omid.library.applovin.utils.d.b("Unexpected method in JavaScriptSessionService: ".concat(string));
                    }
                } catch (JSONException e4) {
                    com.iab.omid.library.applovin.utils.d.a("Error parsing JS message in JavaScriptSessionService.", e4);
                }
            }
        });
    }

    public static JavaScriptSessionService create(Partner partner, WebView webView, boolean z8) {
        return new JavaScriptSessionService(partner, webView, z8);
    }

    private AdSessionConfiguration createAdSessionConfiguration() {
        CreativeType creativeType = CreativeType.DEFINED_BY_JAVASCRIPT;
        ImpressionType impressionType = ImpressionType.DEFINED_BY_JAVASCRIPT;
        Owner owner = Owner.JAVASCRIPT;
        return AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
    }

    private AdSessionContext createAdSessionContext() {
        return this.isHtmlAdView ? AdSessionContext.createHtmlAdSessionContext(this.partner, this.webView, null, null) : AdSessionContext.createJavascriptAdSessionContext(this.partner, this.webView, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishSession(String str) {
        AdSession adSession = this.adSessions.get(str);
        if (adSession != null) {
            adSession.finish();
            this.adSessions.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeWebViewListener() {
        webViewUtil.a(this.webView, JS_MESSAGE_LISTENER_JS_SESSION_SERVICE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSession(String str) {
        a aVar = new a(createAdSessionConfiguration(), createAdSessionContext(), str);
        this.adSessions.put(str, aVar);
        aVar.registerAdView(this.isHtmlAdView ? this.webView : getAdView());
        for (e eVar : this.friendlyObstructions.a()) {
            aVar.addFriendlyObstruction(eVar.c().get(), eVar.b(), eVar.a());
        }
        aVar.start();
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        Iterator<AdSession> it = this.adSessions.values().iterator();
        while (it.hasNext()) {
            it.next().addFriendlyObstruction(view, friendlyObstructionPurpose, str);
        }
        this.friendlyObstructions.a(view, friendlyObstructionPurpose, str);
    }

    @Nullable
    public View getAdView() {
        com.iab.omid.library.applovin.weakreference.a aVar = this.weakAdView;
        if (aVar == null) {
            return null;
        }
        return aVar.get();
    }

    public void removeAllFriendlyObstructions() {
        Iterator<AdSession> it = this.adSessions.values().iterator();
        while (it.hasNext()) {
            it.next().removeAllFriendlyObstructions();
        }
        this.friendlyObstructions.b();
    }

    public void removeFriendlyObstruction(View view) {
        Iterator<AdSession> it = this.adSessions.values().iterator();
        while (it.hasNext()) {
            it.next().removeFriendlyObstruction(view);
        }
        this.friendlyObstructions.c(view);
    }

    public void setAdView(View view) {
        if (this.isHtmlAdView) {
            if (view != this.webView) {
                throw new UnsupportedOperationException("For HTML-rendered ads, the ad view is automatically set to the web view and cannot be changed.");
            }
        } else {
            Iterator<AdSession> it = this.adSessions.values().iterator();
            while (it.hasNext()) {
                it.next().registerAdView(view);
            }
            this.weakAdView = new com.iab.omid.library.applovin.weakreference.a(view);
        }
    }

    public void tearDown(final TearDownHandler tearDownHandler) {
        Iterator<AdSession> it = this.adSessions.values().iterator();
        while (it.hasNext()) {
            it.next().finish();
        }
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() { // from class: com.iab.omid.library.applovin.adsession.JavaScriptSessionService.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                JavaScriptSessionService.this.removeWebViewListener();
                tearDownHandler.onTearDown(true);
                timer.cancel();
            }
        }, 1000L);
    }
}
