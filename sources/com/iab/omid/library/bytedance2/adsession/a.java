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

/* loaded from: classes4.dex */
public class a extends AdSession {

    /* renamed from: l, reason: collision with root package name */
    private static final Pattern f12223l = Pattern.compile("^[a-zA-Z0-9 ]+$");
    private final AdSessionContext a;

    /* renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f12224b;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.weakreference.a f12226d;

    /* renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f12227e;

    /* renamed from: i, reason: collision with root package name */
    private boolean f12231i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f12232j;

    /* renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f12233k;

    /* renamed from: c, reason: collision with root package name */
    private final List<e> f12225c = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private boolean f12228f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f12229g = false;

    /* renamed from: h, reason: collision with root package name */
    private final String f12230h = UUID.randomUUID().toString();

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f12224b = adSessionConfiguration;
        this.a = adSessionContext;
        d(null);
        this.f12227e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.bytedance2.publisher.a(adSessionContext.getWebView()) : new b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f12227e.i();
        c.c().a(this);
        this.f12227e.a(adSessionConfiguration);
    }

    private void a() {
        if (this.f12231i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private e b(View view) {
        for (e eVar : this.f12225c) {
            if (eVar.c().get() == view) {
                return eVar;
            }
        }
        return null;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f12229g) {
            return;
        }
        a(view);
        a(str);
        if (b(view) == null) {
            this.f12225c.add(new e(view, friendlyObstructionPurpose, str));
        }
    }

    public View c() {
        return this.f12226d.get();
    }

    public List<e> d() {
        return this.f12225c;
    }

    public boolean e() {
        return this.f12233k != null;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f12229g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f12228f && !this.f12229g;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void finish() {
        if (this.f12229g) {
            return;
        }
        this.f12226d.clear();
        removeAllFriendlyObstructions();
        this.f12229g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f12227e = null;
        this.f12233k = null;
    }

    public boolean g() {
        return this.f12229g;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public String getAdSessionId() {
        return this.f12230h;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f12227e;
    }

    public boolean h() {
        return this.f12224b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f12224b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f12228f;
    }

    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f12231i = true;
    }

    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f12232j = true;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f12229g) {
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
        if (this.f12229g) {
            return;
        }
        this.f12225c.clear();
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f12229g) {
            return;
        }
        a(view);
        e b3 = b(view);
        if (b3 != null) {
            this.f12225c.remove(b3);
        }
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f12233k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void start() {
        if (this.f12228f) {
            return;
        }
        this.f12228f = true;
        c.c().c(this);
        this.f12227e.a(h.c().b());
        this.f12227e.a(com.iab.omid.library.bytedance2.internal.a.a().b());
        this.f12227e.a(this, this.a);
    }

    private static void a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void b() {
        if (this.f12232j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    private void c(View view) {
        Collection<a> b3 = c.c().b();
        if (b3 == null || b3.isEmpty()) {
            return;
        }
        for (a aVar : b3) {
            if (aVar != this && aVar.c() == view) {
                aVar.f12226d.clear();
            }
        }
    }

    private void d(View view) {
        this.f12226d = new com.iab.omid.library.bytedance2.weakreference.a(view);
    }

    private void a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f12223l.matcher(str).matches()) {
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
            this.f12233k.onPossibleObstructionsDetected(this.f12230h, arrayList);
        }
    }

    public void a(@NonNull JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f12232j = true;
    }
}
