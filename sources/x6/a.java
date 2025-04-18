package x6;

import android.R;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.mbridge.msdk.out.MBSplashHandler;
import kotlin.jvm.internal.Intrinsics;
import u6.c;

/* loaded from: classes3.dex */
public final class a extends v6.a {
    public a(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback) {
        super(mediationAppOpenAdConfiguration, mediationAdLoadCallback);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public final void showAd(Context context) {
        if (this.f26045f != null) {
            RelativeLayout group = new RelativeLayout(this.f26046g);
            ((ViewGroup) this.f26046g.getWindow().getDecorView().findViewById(R.id.content)).addView(group);
            c cVar = this.f26045f;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(group, "group");
            MBSplashHandler mBSplashHandler = cVar.a;
            if (mBSplashHandler != null) {
                mBSplashHandler.show(group);
            }
        }
    }
}
