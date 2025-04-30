package com.tools.arruler.ui.component.tutorial;

import A6.c;
import W6.a;
import android.net.Uri;
import com.tools.arruler.photomeasure.camera.ruler.R;
import u6.AbstractC2784A;
import x0.AbstractC2914a;
import x6.AbstractActivityC2926b;

/* loaded from: classes3.dex */
public final class ArTutorialActivity extends AbstractActivityC2926b {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f19737g = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f19738f;

    @Override // x6.AbstractActivityC2926b
    public final int m() {
        return R.layout.activity_tutorial;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (((AbstractC2784A) k()).f23188r.getCurrentPosition() > this.f19738f) {
            this.f19738f = ((AbstractC2784A) k()).f23188r.getCurrentPosition();
        }
        ((AbstractC2784A) k()).f23188r.pause();
    }

    @Override // x6.AbstractActivityC2926b, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        ((AbstractC2784A) k()).f23188r.seekTo(this.f19738f);
        ((AbstractC2784A) k()).f23188r.start();
    }

    @Override // x6.AbstractActivityC2926b
    public final void p() {
        ((AbstractC2784A) k()).f23188r.setVideoURI(Uri.parse(AbstractC2914a.e("android.resource://", getPackageName(), "/2131886096")));
        AbstractC2784A abstractC2784A = (AbstractC2784A) k();
        abstractC2784A.f23188r.setOnPreparedListener(new a(this, 1));
    }

    @Override // x6.AbstractActivityC2926b
    public final void r() {
        AbstractC2784A abstractC2784A = (AbstractC2784A) k();
        abstractC2784A.f23187q.setOnClickListener(new c(this, 6));
    }
}
