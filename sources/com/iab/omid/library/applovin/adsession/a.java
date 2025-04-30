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

/* loaded from: classes3.dex */
public class a extends AdSession {

    /* renamed from: a, reason: collision with root package name */
    private final AdSessionContext f14388a;
    private final AdSessionConfiguration b;

    /* renamed from: c, reason: collision with root package name */
    private final f f14389c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.applovin.weakreference.a f14390d;

    /* renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f14391e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14392f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f14393g;

    /* renamed from: h, reason: collision with root package name */
    private final String f14394h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f14395i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f14396j;

    /* renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f14397k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f14395i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f14396j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f14393g) {
            return;
        }
        this.f14389c.a(view, friendlyObstructionPurpose, str);
    }

    public View c() {
        return this.f14390d.get();
    }

    public List<e> d() {
        return this.f14389c.a();
    }

    public boolean e() {
        return this.f14397k != null;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f14393g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f14392f && !this.f14393g;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void finish() {
        if (this.f14393g) {
            return;
        }
        this.f14390d.clear();
        removeAllFriendlyObstructions();
        this.f14393g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f14391e = null;
        this.f14397k = null;
    }

    public boolean g() {
        return this.f14393g;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public String getAdSessionId() {
        return this.f14394h;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f14391e;
    }

    public boolean h() {
        return this.b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f14392f;
    }

    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f14395i = true;
    }

    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f14396j = true;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f14393g) {
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
        if (this.f14393g) {
            return;
        }
        this.f14389c.b();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f14393g) {
            return;
        }
        this.f14389c.c(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f14397k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void start() {
        if (this.f14392f) {
            return;
        }
        this.f14392f = true;
        c.c().c(this);
        this.f14391e.a(i.c().b());
        this.f14391e.a(com.iab.omid.library.applovin.internal.a.a().b());
        this.f14391e.a(this, this.f14388a);
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f14389c = new f();
        this.f14392f = false;
        this.f14393g = false;
        this.b = adSessionConfiguration;
        this.f14388a = adSessionContext;
        this.f14394h = str;
        b(null);
        this.f14391e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.applovin.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f14391e.i();
        c.c().a(this);
        this.f14391e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> b = c.c().b();
        if (b == null || b.isEmpty()) {
            return;
        }
        for (a aVar : b) {
            if (aVar != this && aVar.c() == view) {
                aVar.f14390d.clear();
            }
        }
    }

    private void b(View view) {
        this.f14390d = new com.iab.omid.library.applovin.weakreference.a(view);
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
            this.f14397k.onPossibleObstructionsDetected(this.f14394h, arrayList);
        }
    }

    public void a(@NonNull JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f14396j = true;
    }
}
