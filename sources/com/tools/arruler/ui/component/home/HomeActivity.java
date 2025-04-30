package com.tools.arruler.ui.component.home;

import B6.b;
import C2.m;
import E6.d;
import E6.f;
import F2.h;
import F6.a;
import G7.e;
import G7.j;
import G7.s;
import a.AbstractC0325a;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.fragment.app.C0462f0;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.d0;
import com.facebook.appevents.n;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import com.tools.arruler.app.ArRulerApplication;
import com.tools.arruler.photomeasure.camera.ruler.R;
import h.c;
import java.util.ArrayList;
import k.C2426o;
import n1.C2475f;
import o1.C2493b;
import o7.C2513b;
import p1.C2538b;
import q6.C2647a;
import q7.InterfaceC2649b;
import u6.AbstractC2789e;
import x6.AbstractActivityC2926b;

/* loaded from: classes3.dex */
public final class HomeActivity extends AbstractActivityC2926b implements InterfaceC2649b {
    public static final /* synthetic */ int m = 0;

    /* renamed from: f, reason: collision with root package name */
    public C2426o f19649f;

    /* renamed from: g, reason: collision with root package name */
    public volatile C2513b f19650g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f19651h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public boolean f19652i = false;

    /* renamed from: j, reason: collision with root package name */
    public b f19653j;

    /* renamed from: k, reason: collision with root package name */
    public a f19654k;
    public final c l;

    public HomeActivity() {
        addOnContextAvailableListener(new E6.b(this, 0));
        this.l = registerForActivityResult(new C0462f0(2), new A4.a(5));
    }

    @Override // q7.InterfaceC2649b
    public final Object a() {
        return t().a();
    }

    @Override // f.l
    public final d0 getDefaultViewModelProviderFactory() {
        return h.m(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // x6.AbstractActivityC2926b
    public final int m() {
        return R.layout.activity_home;
    }

    @Override // x6.AbstractActivityC2926b, androidx.fragment.app.FragmentActivity, f.l, androidx.core.app.AbstractActivityC0412m, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof InterfaceC2649b) {
            C2426o c9 = t().c();
            this.f19649f = c9;
            if (c9.a()) {
                this.f19649f.f21320c = getDefaultViewModelCreationExtras();
            }
        }
    }

    @Override // k.AbstractActivityC2417f, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C2426o c2426o = this.f19649f;
        if (c2426o != null) {
            c2426o.f21320c = null;
        }
    }

    @Override // x6.AbstractActivityC2926b, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        boolean z8 = ((SharedPreferences) m.q().f4078d).getBoolean("IS_RATE", false);
        boolean z9 = ((SharedPreferences) m.q().f4078d).getBoolean("FIRST_RATE", false);
        if (!z8 && z9) {
            ArRulerApplication arRulerApplication = ArRulerApplication.f19628g;
            if (arRulerApplication != null) {
                if (arRulerApplication.f19630f) {
                    if (arRulerApplication != null) {
                        arRulerApplication.f19630f = false;
                        try {
                            new D6.c(this, new C6.a(this, 8)).show();
                        } catch (WindowManager.BadTokenException e4) {
                            e4.printStackTrace();
                        }
                    } else {
                        j.k("instance");
                        throw null;
                    }
                }
            } else {
                j.k("instance");
                throw null;
            }
        }
        m.q().A("FIRST_RATE", false);
    }

    @Override // x6.AbstractActivityC2926b
    public final void p() {
        Boolean bool;
        Boolean bool2;
        boolean z8;
        a7.b bVar = a7.b.f4076f;
        if (bVar != null) {
            bVar.A("FIRST_OPEN_APP", true);
            C2493b c2493b = n.f13501e;
            q6.b bVar2 = q6.c.f22801e;
            if (c2493b == null && bVar2.a().d() && AbstractC0325a.i(this) && !C2538b.a().m) {
                C2475f p2 = C2475f.p();
                C2647a c2647a = new C2647a(2);
                p2.getClass();
                C2475f.t(this, "ca-app-pub-6691965685689933/8357407404", R.layout.layout_native_ads, c2647a);
            }
            if (Build.VERSION.SDK_INT >= 33) {
                this.l.a("android.permission.POST_NOTIFICATIONS");
            }
            this.f19653j = new b(this, new d(this, 0));
            SharedPreferences n2 = n();
            Boolean bool3 = Boolean.FALSE;
            e a6 = s.a(Boolean.class);
            boolean z9 = false;
            if (a6.equals(s.a(String.class))) {
                bool = (Boolean) n2.getString("key_confirm_consent", null);
            } else if (a6.equals(s.a(Integer.TYPE))) {
                bool = (Boolean) Integer.valueOf(n2.getInt("key_confirm_consent", -1));
            } else if (a6.equals(s.a(Boolean.TYPE))) {
                bool = Boolean.valueOf(n2.getBoolean("key_confirm_consent", false));
            } else if (a6.equals(s.a(Float.TYPE))) {
                bool = (Boolean) Float.valueOf(n2.getFloat("key_confirm_consent", -1.0f));
            } else if (a6.equals(s.a(Long.TYPE))) {
                bool = (Boolean) Long.valueOf(n2.getLong("key_confirm_consent", -1L));
            } else {
                throw new UnsupportedOperationException("Not yet implemented");
            }
            if (j.a(bool, bool3)) {
                SharedPreferences n9 = n();
                e a9 = s.a(Boolean.class);
                if (a9.equals(s.a(String.class))) {
                    bool2 = (Boolean) n9.getString("key_is_user_global", null);
                } else if (a9.equals(s.a(Integer.TYPE))) {
                    bool2 = (Boolean) Integer.valueOf(n9.getInt("key_is_user_global", -1));
                } else if (a9.equals(s.a(Boolean.TYPE))) {
                    bool2 = Boolean.valueOf(n9.getBoolean("key_is_user_global", false));
                } else if (a9.equals(s.a(Float.TYPE))) {
                    bool2 = (Boolean) Float.valueOf(n9.getFloat("key_is_user_global", -1.0f));
                } else if (a9.equals(s.a(Long.TYPE))) {
                    bool2 = (Boolean) Long.valueOf(n9.getLong("key_is_user_global", -1L));
                } else {
                    throw new UnsupportedOperationException("Not yet implemented");
                }
                if (j.a(bool2, bool3)) {
                    q6.c a10 = bVar2.a();
                    try {
                        if (!a10.f22803a) {
                            z8 = true;
                        } else {
                            k5.b bVar3 = a10.f22805d;
                            if (bVar3 != null) {
                                z8 = bVar3.c("on_show_dialog_consent");
                            } else {
                                j.k("remoteConfig");
                                throw null;
                            }
                        }
                    } catch (Exception e4) {
                        e4.printStackTrace();
                        z8 = false;
                    }
                    if (z8) {
                        new Handler(Looper.getMainLooper()).postDelayed(new D3.b(this, 1), DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
                    }
                }
            }
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            j.d(supportFragmentManager, "getSupportFragmentManager(...)");
            a aVar = new a(supportFragmentManager, getLifecycle());
            this.f19654k = aVar;
            aVar.f1217r.add(new G6.e());
            a aVar2 = this.f19654k;
            if (aVar2 != null) {
                aVar2.f1217r.add(new G6.n());
            }
            a aVar3 = this.f19654k;
            if (aVar3 != null) {
                aVar3.notifyDataSetChanged();
            }
            ((AbstractC2789e) k()).f23291t.setAdapter(this.f19654k);
            getOnBackPressedDispatcher().a(this, new E6.e(this));
            if (android.support.v4.media.session.a.v(this)) {
                q6.c a11 = bVar2.a();
                try {
                    if (a11.f22803a) {
                        k5.b bVar4 = a11.f22805d;
                        if (bVar4 != null) {
                            z9 = bVar4.c("banner_collap_home");
                        } else {
                            j.k("remoteConfig");
                            throw null;
                        }
                    }
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
                if (z9 && android.support.v4.media.session.a.v(this) && !C2538b.a().m) {
                    C2475f p7 = C2475f.p();
                    C6.b bVar5 = new C6.b(this, 1);
                    p7.getClass();
                    C2475f.s(this, "ca-app-pub-6691965685689933/1692447504", bVar5);
                    return;
                }
            }
            ((AbstractC2789e) k()).f23288q.removeAllViews();
            FrameLayout frameLayout = ((AbstractC2789e) k()).f23288q;
            j.d(frameLayout, "frBanner");
            com.bumptech.glide.d.M(frameLayout);
            return;
        }
        throw new IllegalStateException(a7.b.class.getSimpleName().concat(" is not initialized, call initializeInstance(..) method first."));
    }

    @Override // x6.AbstractActivityC2926b
    public final void r() {
        AbstractC2789e abstractC2789e = (AbstractC2789e) k();
        int i9 = 0;
        abstractC2789e.f23290s.setOnCheckedChangeListener(new E6.c(this, i9));
        AbstractC2789e abstractC2789e2 = (AbstractC2789e) k();
        ((ArrayList) abstractC2789e2.f23291t.f5168d.b).add(new f(this, i9));
    }

    public final C2513b t() {
        if (this.f19650g == null) {
            synchronized (this.f19651h) {
                try {
                    if (this.f19650g == null) {
                        this.f19650g = new C2513b((Activity) this);
                    }
                } finally {
                }
            }
        }
        return this.f19650g;
    }
}
