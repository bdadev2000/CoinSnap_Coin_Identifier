package w6;

import android.R;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.mbridge.msdk.out.MBSplashHandler;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a extends v6.a {

    /* renamed from: h, reason: collision with root package name */
    public String f26859h;

    public a(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback) {
        super(mediationAppOpenAdConfiguration, mediationAdLoadCallback);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public final void showAd(Context context) {
        if (this.f26045f != null) {
            RelativeLayout group = new RelativeLayout(this.f26046g);
            ((ViewGroup) this.f26046g.getWindow().getDecorView().findViewById(R.id.content)).addView(group);
            u6.c cVar = this.f26045f;
            String bidToken = this.f26859h;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(group, "group");
            Intrinsics.checkNotNullParameter(bidToken, "bidToken");
            MBSplashHandler mBSplashHandler = cVar.a;
            if (mBSplashHandler != null) {
                mBSplashHandler.show(group, bidToken);
            }
        }
    }
}
