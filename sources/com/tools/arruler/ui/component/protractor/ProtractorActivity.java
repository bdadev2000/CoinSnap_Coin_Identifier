package com.tools.arruler.ui.component.protractor;

import G7.j;
import U6.a;
import a7.b;
import android.util.Log;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.bumptech.glide.d;
import com.facebook.appevents.n;
import com.mbridge.msdk.foundation.entity.o;
import com.tools.arruler.photomeasure.camera.ruler.R;
import com.tools.arruler.ui.component.protractor.view.ProtractorView;
import java.util.Arrays;
import java.util.Locale;
import p1.C2538b;
import q6.c;
import u6.AbstractC2802s;
import x6.AbstractActivityC2926b;

/* loaded from: classes3.dex */
public final class ProtractorActivity extends AbstractActivityC2926b implements a {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f19685f = 0;

    @Override // x6.AbstractActivityC2926b
    public final int m() {
        return R.layout.activity_protractor;
    }

    @Override // f.l, android.app.Activity
    public final void onBackPressed() {
        b bVar = b.f4076f;
        if (bVar != null) {
            bVar.A("FIRST_RATE", true);
            if (c.f22801e.a().c() && android.support.v4.media.session.a.v(this) && !C2538b.a().m) {
                r6.c.f22895g.d().b(this, "ca-app-pub-6691965685689933/3105080728", new T6.a(this, 0));
                return;
            } else {
                super.onBackPressed();
                return;
            }
        }
        throw new IllegalStateException(b.class.getSimpleName().concat(" is not initialized, call initializeInstance(..) method first."));
    }

    @Override // x6.AbstractActivityC2926b
    public final void p() {
        q6.b bVar = c.f22801e;
        if (bVar.a().c()) {
            r6.c.f22895g.d().a(this, "ca-app-pub-6691965685689933/3105080728");
        }
        String format = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(90.0f)}, 1));
        Log.e("Vinhtqkkk", " initViews onAngleChanged: ".concat(format));
        AbstractC2802s abstractC2802s = (AbstractC2802s) k();
        ProtractorView protractorView = abstractC2802s.f23408t;
        protractorView.getClass();
        protractorView.f19699r = this;
        abstractC2802s.f23409u.setText(o.j(getString(R.string.angle_s, format), " °"));
        FrameLayout frameLayout = ((AbstractC2802s) k()).f23405q;
        j.d(frameLayout, "frBanner");
        c a6 = bVar.a();
        boolean z8 = false;
        try {
            if (a6.f22803a) {
                k5.b bVar2 = a6.f22805d;
                if (bVar2 != null) {
                    z8 = bVar2.c("banner_protrator");
                } else {
                    j.k("remoteConfig");
                    throw null;
                }
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        n.l(this, "ca-app-pub-6691965685689933/8297821360", frameLayout, z8);
    }

    @Override // x6.AbstractActivityC2926b
    public final void r() {
        AppCompatImageView appCompatImageView = ((AbstractC2802s) k()).f23406r;
        j.d(appCompatImageView, "imgHome");
        d.I(appCompatImageView, new C6.a(this, 6));
    }
}
