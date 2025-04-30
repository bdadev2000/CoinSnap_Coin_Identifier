package com.iab.omid.library.bytedance2.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.bytedance2.internal.c;
import com.iab.omid.library.bytedance2.internal.e;
import com.iab.omid.library.bytedance2.internal.h;
import com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher;
import com.iab.omid.library.bytedance2.publisher.b;
import com.iab.omid.library.bytedance2.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a extends AdSession {
    private static final Pattern l = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a, reason: collision with root package name */
    private final AdSessionContext f14490a;
    private final AdSessionConfiguration b;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.weakreference.a f14492d;

    /* renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f14493e;

    /* renamed from: i, reason: collision with root package name */
    private boolean f14497i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f14498j;

    /* renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f14499k;

    /* renamed from: c, reason: collision with root package name */
    private final List<e> f14491c = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private boolean f14494f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f14495g = false;

    /* renamed from: h, reason: collision with root package name */
    private final String f14496h = UUID.randomUUID().toString();

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.b = adSessionConfiguration;
        this.f14490a = adSessionContext;
        d(null);
        this.f14493e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.bytedance2.publisher.a(adSessionContext.getWebView()) : new b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f14493e.i();
        c.c().a(this);
        this.f14493e.a(adSessionConfiguration);
    }

    private void a() {
        if (this.f14497i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private e b(View view) {
        for (e eVar : this.f14491c) {
            if (eVar.c().get() == view) {
                return eVar;
            }
        }
        return null;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f14495g) {
            return;
        }
        a(view);
        a(str);
        if (b(view) == null) {
            this.f14491c.add(new e(view, friendlyObstructionPurpose, str));
        }
    }

    public View c() {
        return this.f14492d.get();
    }

    public List<e> d() {
        return this.f14491c;
    }

    public boolean e() {
        return this.f14499k != null;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f14495g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f14494f && !this.f14495g;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void finish() {
        if (this.f14495g) {
            return;
        }
        this.f14492d.clear();
        removeAllFriendlyObstructions();
        this.f14495g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f14493e = null;
        this.f14499k = null;
    }

    public boolean g() {
        return this.f14495g;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public String getAdSessionId() {
        return this.f14496h;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f14493e;
    }

    public boolean h() {
        return this.b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f14494f;
    }

    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f14497i = true;
    }

    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f14498j = true;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f14495g) {
            return;
        }
        g.a(view, "AdView is null");
        if (c() == view) {
            return;
        }
        d(view);
        getAdSessionStatePublisher().a();
        c(view);
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f14495g) {
            return;
        }
        this.f14491c.clear();
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f14495g) {
            return;
        }
        a(view);
        e b = b(view);
        if (b != null) {
            this.f14491c.remove(b);
        }
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f14499k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void start() {
        if (this.f14494f) {
            return;
        }
        this.f14494f = true;
        c.c().c(this);
        this.f14493e.a(h.c().b());
        this.f14493e.a(com.iab.omid.library.bytedance2.internal.a.a().b());
        this.f14493e.a(this, this.f14490a);
    }

    private static void a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void b() {
        if (this.f14498j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    private void c(View view) {
        Collection<a> b = c.c().b();
        if (b == null || b.isEmpty()) {
            return;
        }
        for (a aVar : b) {
            if (aVar != this && aVar.c() == view) {
                aVar.f14492d.clear();
            }
        }
    }

    private void d(View view) {
        this.f14492d = new com.iab.omid.library.bytedance2.weakreference.a(view);
    }

    private void a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!l.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }

    public void a(List<com.iab.omid.library.bytedance2.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.bytedance2.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f14499k.onPossibleObstructionsDetected(this.f14496h, arrayList);
        }
    }

    public void a(@NonNull JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f14498j = true;
    }
}
