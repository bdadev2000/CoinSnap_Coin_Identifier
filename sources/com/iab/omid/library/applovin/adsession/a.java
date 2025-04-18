package com.iab.omid.library.applovin.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.applovin.internal.c;
import com.iab.omid.library.applovin.internal.e;
import com.iab.omid.library.applovin.internal.f;
import com.iab.omid.library.applovin.internal.i;
import com.iab.omid.library.applovin.publisher.AdSessionStatePublisher;
import com.iab.omid.library.applovin.publisher.b;
import com.iab.omid.library.applovin.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a extends AdSession {

    /* renamed from: a, reason: collision with root package name */
    private final AdSessionContext f28931a;

    /* renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f28932b;

    /* renamed from: c, reason: collision with root package name */
    private final f f28933c;
    private com.iab.omid.library.applovin.weakreference.a d;
    private AdSessionStatePublisher e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f28934f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f28935g;

    /* renamed from: h, reason: collision with root package name */
    private final String f28936h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f28937i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f28938j;

    /* renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f28939k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f28937i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f28938j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f28935g) {
            return;
        }
        this.f28933c.a(view, friendlyObstructionPurpose, str);
    }

    public View c() {
        return this.d.get();
    }

    public List<e> d() {
        return this.f28933c.a();
    }

    public boolean e() {
        return this.f28939k != null;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f28935g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f28934f && !this.f28935g;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void finish() {
        if (this.f28935g) {
            return;
        }
        this.d.clear();
        removeAllFriendlyObstructions();
        this.f28935g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.e = null;
        this.f28939k = null;
    }

    public boolean g() {
        return this.f28935g;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public String getAdSessionId() {
        return this.f28936h;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.e;
    }

    public boolean h() {
        return this.f28932b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f28932b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f28934f;
    }

    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f28937i = true;
    }

    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f28938j = true;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f28935g) {
            return;
        }
        g.a(view, "AdView is null");
        if (c() == view) {
            return;
        }
        b(view);
        getAdSessionStatePublisher().a();
        a(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f28935g) {
            return;
        }
        this.f28933c.b();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f28935g) {
            return;
        }
        this.f28933c.c(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f28939k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void start() {
        if (this.f28934f) {
            return;
        }
        this.f28934f = true;
        c.c().c(this);
        this.e.a(i.c().b());
        this.e.a(com.iab.omid.library.applovin.internal.a.a().b());
        this.e.a(this, this.f28931a);
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f28933c = new f();
        this.f28934f = false;
        this.f28935g = false;
        this.f28932b = adSessionConfiguration;
        this.f28931a = adSessionContext;
        this.f28936h = str;
        b(null);
        this.e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.applovin.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.e.i();
        c.c().a(this);
        this.e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> b2 = c.c().b();
        if (b2 == null || b2.isEmpty()) {
            return;
        }
        for (a aVar : b2) {
            if (aVar != this && aVar.c() == view) {
                aVar.d.clear();
            }
        }
    }

    private void b(View view) {
        this.d = new com.iab.omid.library.applovin.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.applovin.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.applovin.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f28939k.onPossibleObstructionsDetected(this.f28936h, arrayList);
        }
    }

    public void a(@NonNull JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f28938j = true;
    }
}
