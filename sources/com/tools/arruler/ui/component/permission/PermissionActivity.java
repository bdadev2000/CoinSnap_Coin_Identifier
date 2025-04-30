package com.tools.arruler.ui.component.permission;

import F2.d;
import G7.j;
import I.h;
import S6.a;
import a7.b;
import android.content.SharedPreferences;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.C0462f0;
import com.tools.arruler.photomeasure.camera.ruler.R;
import h.c;
import n1.C2475f;
import p1.C2538b;
import u6.AbstractC2801q;
import x6.AbstractActivityC2926b;

/* loaded from: classes3.dex */
public final class PermissionActivity extends AbstractActivityC2926b {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f19681i = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f19683g;

    /* renamed from: f, reason: collision with root package name */
    public final String f19682f = "android.permission.CAMERA";

    /* renamed from: h, reason: collision with root package name */
    public final c f19684h = registerForActivityResult(new C0462f0(2), new d(this, 3));

    @Override // x6.AbstractActivityC2926b
    public final int m() {
        return R.layout.activity_permission;
    }

    @Override // x6.AbstractActivityC2926b, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (h.checkSelfPermission(this, this.f19682f) == 0) {
            ((AbstractC2801q) k()).f23395s.setActivated(true);
            finish();
        }
    }

    @Override // x6.AbstractActivityC2926b
    public final void p() {
        b bVar = b.f4076f;
        if (bVar != null) {
            boolean z8 = false;
            this.f19683g = ((SharedPreferences) bVar.f4078d).getInt("COUNT_PERMISSION", 0);
            AbstractC2801q abstractC2801q = (AbstractC2801q) k();
            ImageView imageView = abstractC2801q.f23395s;
            j.d(imageView, "imgSwitchCameraAccess");
            com.bumptech.glide.d.I(imageView, new a(0, abstractC2801q, this));
            if (android.support.v4.media.session.a.v(this)) {
                q6.c a6 = q6.c.f22801e.a();
                try {
                    if (a6.f22803a) {
                        k5.b bVar2 = a6.f22805d;
                        if (bVar2 != null) {
                            z8 = bVar2.c("native_permission");
                        } else {
                            j.k("remoteConfig");
                            throw null;
                        }
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
                if (z8 && !C2538b.a().m) {
                    C2475f p2 = C2475f.p();
                    C6.b bVar3 = new C6.b(this, 3);
                    p2.getClass();
                    C2475f.t(this, "ca-app-pub-6691965685689933/3763556270", R.layout.layout_native_language, bVar3);
                    return;
                }
            }
            FrameLayout frameLayout = ((AbstractC2801q) k()).f23394r;
            j.d(frameLayout, "frAds");
            com.bumptech.glide.d.M(frameLayout);
            return;
        }
        throw new IllegalStateException(b.class.getSimpleName().concat(" is not initialized, call initializeInstance(..) method first."));
    }

    @Override // x6.AbstractActivityC2926b
    public final void r() {
        ImageView imageView = ((AbstractC2801q) k()).f23396t;
        j.d(imageView, "imvGo");
        com.bumptech.glide.d.I(imageView, new C6.a(this, 5));
    }
}
