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

/* loaded from: classes4.dex */
public class a extends AdSession {
    private final AdSessionContext a;

    /* renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f12129b;

    /* renamed from: c, reason: collision with root package name */
    private final f f12130c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.applovin.weakreference.a f12131d;

    /* renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f12132e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f12133f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f12134g;

    /* renamed from: h, reason: collision with root package name */
    private final String f12135h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f12136i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f12137j;

    /* renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f12138k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f12136i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f12137j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f12134g) {
            return;
        }
        this.f12130c.a(view, friendlyObstructionPurpose, str);
    }

    public View c() {
        return this.f12131d.get();
    }

    public List<e> d() {
        return this.f12130c.a();
    }

    public boolean e() {
        return this.f12138k != null;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f12134g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f12133f && !this.f12134g;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void finish() {
        if (this.f12134g) {
            return;
        }
        this.f12131d.clear();
        removeAllFriendlyObstructions();
        this.f12134g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f12132e = null;
        this.f12138k = null;
    }

    public boolean g() {
        return this.f12134g;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public String getAdSessionId() {
        return this.f12135h;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f12132e;
    }

    public boolean h() {
        return this.f12129b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f12129b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f12133f;
    }

    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f12136i = true;
    }

    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f12137j = true;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f12134g) {
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
        if (this.f12134g) {
            return;
        }
        this.f12130c.b();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f12134g) {
            return;
        }
        this.f12130c.c(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f12138k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void start() {
        if (this.f12133f) {
            return;
        }
        this.f12133f = true;
        c.c().c(this);
        this.f12132e.a(i.c().b());
        this.f12132e.a(com.iab.omid.library.applovin.internal.a.a().b());
        this.f12132e.a(this, this.a);
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f12130c = new f();
        this.f12133f = false;
        this.f12134g = false;
        this.f12129b = adSessionConfiguration;
        this.a = adSessionContext;
        this.f12135h = str;
        b(null);
        this.f12132e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.applovin.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f12132e.i();
        c.c().a(this);
        this.f12132e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> b3 = c.c().b();
        if (b3 == null || b3.isEmpty()) {
            return;
        }
        for (a aVar : b3) {
            if (aVar != this && aVar.c() == view) {
                aVar.f12131d.clear();
            }
        }
    }

    private void b(View view) {
        this.f12131d = new com.iab.omid.library.applovin.weakreference.a(view);
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
            this.f12138k.onPossibleObstructionsDetected(this.f12135h, arrayList);
        }
    }

    public void a(@NonNull JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f12137j = true;
    }
}
