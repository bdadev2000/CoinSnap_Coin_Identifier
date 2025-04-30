package Y2;

import G7.j;
import android.R;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.out.MBSplashHandler;
import j5.C2400c;

/* loaded from: classes.dex */
public final class a extends X2.a {

    /* renamed from: h, reason: collision with root package name */
    public String f3758h;

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public final void showAd(Context context) {
        if (this.f3658f != null) {
            RelativeLayout relativeLayout = new RelativeLayout(this.f3659g);
            ((ViewGroup) this.f3659g.getWindow().getDecorView().findViewById(R.id.content)).addView(relativeLayout);
            C2400c c2400c = this.f3658f;
            String str = this.f3758h;
            c2400c.getClass();
            j.e(str, "bidToken");
            MBSplashHandler mBSplashHandler = (MBSplashHandler) c2400c.f21107c;
            if (mBSplashHandler != null) {
                mBSplashHandler.show(relativeLayout, str);
            }
        }
    }
}
