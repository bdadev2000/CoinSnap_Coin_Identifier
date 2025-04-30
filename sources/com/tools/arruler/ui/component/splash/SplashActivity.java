package com.tools.arruler.ui.component.splash;

import E6.b;
import F1.i;
import F2.h;
import G7.j;
import G7.s;
import I6.e;
import U4.CallableC0313i;
import W6.a;
import W6.c;
import W6.f;
import a7.C0399a;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.VideoView;
import androidx.lifecycle.d0;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.tasks.Tasks;
import com.tools.arruler.photomeasure.camera.ruler.R;
import com.tools.arruler.ui.component.home.HomeActivity;
import com.tools.arruler.ui.component.language.LanguageActivity;
import g4.C2296f;
import java.util.HashMap;
import java.util.Map;
import k.C2426o;
import k5.k;
import m1.g;
import m4.AbstractC2466a;
import n1.C2475f;
import o7.C2513b;
import org.json.JSONException;
import org.json.JSONObject;
import p1.C2538b;
import q6.d;
import q7.InterfaceC2649b;
import u6.AbstractC2806w;
import x6.AbstractActivityC2926b;

@SuppressLint({"CustomSplashScreen"})
/* loaded from: classes3.dex */
public final class SplashActivity extends AbstractActivityC2926b implements d, InterfaceC2649b {
    public static final /* synthetic */ int l = 0;

    /* renamed from: f, reason: collision with root package name */
    public C2426o f19701f;

    /* renamed from: g, reason: collision with root package name */
    public volatile C2513b f19702g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f19703h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public boolean f19704i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f19705j;

    /* renamed from: k, reason: collision with root package name */
    public final i f19706k;

    public SplashActivity() {
        addOnContextAvailableListener(new b(this, 4));
        this.f19706k = new i(s.a(f.class), new e(this, 7), new e(this, 6), new e(this, 8));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dd A[Catch: Exception -> 0x00e8, TryCatch #0 {Exception -> 0x00e8, blocks: (B:34:0x00d8, B:52:0x00dd, B:54:0x00e1, B:55:0x00ea, B:56:0x00ed), top: B:33:0x00d8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void t(com.tools.arruler.ui.component.splash.SplashActivity r9) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tools.arruler.ui.component.splash.SplashActivity.t(com.tools.arruler.ui.component.splash.SplashActivity):void");
    }

    @Override // q7.InterfaceC2649b
    public final Object a() {
        return u().a();
    }

    @Override // f.l
    public final d0 getDefaultViewModelProviderFactory() {
        return h.m(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // x6.AbstractActivityC2926b
    public final int m() {
        return R.layout.activity_splash;
    }

    @Override // f.l, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
    }

    @Override // x6.AbstractActivityC2926b, androidx.fragment.app.FragmentActivity, f.l, androidx.core.app.AbstractActivityC0412m, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof InterfaceC2649b) {
            C2426o c9 = u().c();
            this.f19701f = c9;
            if (c9.a()) {
                this.f19701f.f21320c = getDefaultViewModelCreationExtras();
            }
        }
    }

    @Override // k.AbstractActivityC2417f, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C2426o c2426o = this.f19701f;
        if (c2426o != null) {
            c2426o.f21320c = null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        ((AbstractC2806w) k()).f23433s.pause();
    }

    @Override // x6.AbstractActivityC2926b, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!((AbstractC2806w) k()).f23433s.isPlaying()) {
            ((AbstractC2806w) k()).f23433s.start();
        }
        C2475f p2 = C2475f.p();
        c cVar = new c(this, 1);
        p2.getClass();
        g b = g.b();
        b.getClass();
        new Handler(getMainLooper()).postDelayed(new A4.e(b, this, cVar, 11), 1000);
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [k5.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [k5.g, java.lang.Object] */
    @Override // x6.AbstractActivityC2926b
    public final void p() {
        Boolean bool;
        Boolean bool2;
        AbstractC2806w abstractC2806w = (AbstractC2806w) k();
        Uri parse = Uri.parse("android.resource://" + getPackageName() + "/2131886095");
        VideoView videoView = abstractC2806w.f23433s;
        videoView.setVideoURI(parse);
        videoView.setOnPreparedListener(new a(videoView, 0));
        MobileAds.initialize(this, new W6.b(0));
        r6.c.f22895g.d().f22898c = 40;
        q6.c a6 = q6.c.f22801e.a();
        a6.f22804c = this;
        k5.b b = ((k) C2296f.c().b(k.class)).b("firebase");
        j.d(b, "getInstance()");
        a6.f22805d = b;
        ?? obj = new Object();
        obj.f21483a = 60L;
        obj.b = l5.g.f21598j;
        obj.a(3600L);
        ?? obj2 = new Object();
        obj2.f21483a = obj.f21483a;
        obj2.b = obj.b;
        k5.b bVar = a6.f22805d;
        if (bVar != null) {
            Tasks.call(bVar.f21474c, new CallableC0313i(3, bVar, obj2));
            HashMap hashMap = a6.b;
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof byte[]) {
                    hashMap2.put((String) entry.getKey(), new String((byte[]) value));
                } else {
                    hashMap2.put((String) entry.getKey(), value.toString());
                }
            }
            try {
                R0.d c9 = l5.d.c();
                c9.b = new JSONObject(hashMap2);
                bVar.f21477f.d(c9.a()).onSuccessTask(p4.j.b, new com.applovin.impl.sdk.ad.g(27));
            } catch (JSONException e4) {
                Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e4);
                Tasks.forResult(null);
            }
            bVar.a().addOnCompleteListener(new F2.d(a6, 26));
            k5.b bVar2 = a6.f22805d;
            if (bVar2 != null) {
                a6.f22805d = bVar2;
                SharedPreferences n2 = n();
                Boolean bool3 = Boolean.FALSE;
                G7.e a9 = s.a(Boolean.class);
                if (a9.equals(s.a(String.class))) {
                    bool = (Boolean) n2.getString("key_confirm_consent", null);
                } else if (a9.equals(s.a(Integer.TYPE))) {
                    bool = (Boolean) Integer.valueOf(n2.getInt("key_confirm_consent", -1));
                } else if (a9.equals(s.a(Boolean.TYPE))) {
                    bool = Boolean.valueOf(n2.getBoolean("key_confirm_consent", false));
                } else if (a9.equals(s.a(Float.TYPE))) {
                    bool = (Boolean) Float.valueOf(n2.getFloat("key_confirm_consent", -1.0f));
                } else if (a9.equals(s.a(Long.TYPE))) {
                    bool = (Boolean) Long.valueOf(n2.getLong("key_confirm_consent", -1L));
                } else {
                    throw new UnsupportedOperationException("Not yet implemented");
                }
                if (j.a(bool, bool3)) {
                    SharedPreferences n9 = n();
                    G7.e a10 = s.a(Boolean.class);
                    if (a10.equals(s.a(String.class))) {
                        bool2 = (Boolean) n9.getString("key_is_user_global", null);
                    } else if (a10.equals(s.a(Integer.TYPE))) {
                        bool2 = (Boolean) Integer.valueOf(n9.getInt("key_is_user_global", -1));
                    } else if (a10.equals(s.a(Boolean.TYPE))) {
                        bool2 = Boolean.valueOf(n9.getBoolean("key_is_user_global", false));
                    } else if (a10.equals(s.a(Float.TYPE))) {
                        bool2 = (Boolean) Float.valueOf(n9.getFloat("key_is_user_global", -1.0f));
                    } else if (a10.equals(s.a(Long.TYPE))) {
                        bool2 = (Boolean) Long.valueOf(n9.getLong("key_is_user_global", -1L));
                    } else {
                        throw new UnsupportedOperationException("Not yet implemented");
                    }
                    if (j.a(bool2, bool3) && android.support.v4.media.session.a.v(this)) {
                        int i9 = C0399a.f4075a;
                        AbstractC2466a.a().a(null, "new_load_consent_1");
                        com.facebook.appevents.g.t(new E1.c(this, 23));
                        return;
                    }
                }
                new W6.d(this).start();
                return;
            }
            j.k("remoteConfig");
            throw null;
        }
        j.k("remoteConfig");
        throw null;
    }

    public final C2513b u() {
        if (this.f19702g == null) {
            synchronized (this.f19703h) {
                try {
                    if (this.f19702g == null) {
                        this.f19702g = new C2513b((Activity) this);
                    }
                } finally {
                }
            }
        }
        return this.f19702g;
    }

    public final void v() {
        z2.i.p("isFirstOpen", Boolean.FALSE, ((f) this.f19706k.getValue()).b);
        if (C2538b.a().m) {
            Intent intent = new Intent(this, (Class<?>) HomeActivity.class);
            intent.putExtra("key_tracking_screen_from", "SplashActivity");
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        } else {
            Intent intent2 = new Intent(this, (Class<?>) LanguageActivity.class);
            intent2.putExtra("key_tracking_screen_from", "SplashActivity");
            startActivity(intent2);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        }
        finish();
    }
}
