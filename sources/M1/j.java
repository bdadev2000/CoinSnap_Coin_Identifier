package m1;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import r1.DialogC2656a;
import w4.v0;

/* loaded from: classes.dex */
public final class j extends FullScreenContentCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f21741a;

    public j(k kVar) {
        this.f21741a = kVar;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdClicked() {
        super.onAdClicked();
        Activity activity = this.f21741a.f21745f;
        if (activity != null) {
            v0.s(activity, null);
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        k kVar = this.f21741a;
        kVar.b = null;
        kVar.getClass();
        k.f21742n = false;
        kVar.e(false);
        kVar.d();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdFailedToShowFullScreenContent(AdError adError) {
        DialogC2656a dialogC2656a;
        Log.e("AppOpenManager", "onAdFailedToShowFullScreenContent: " + adError.getMessage());
        k kVar = this.f21741a;
        kVar.getClass();
        Activity activity = kVar.f21745f;
        if (activity != null && !activity.isDestroyed() && (dialogC2656a = kVar.l) != null && dialogC2656a.isShowing()) {
            Log.d("AppOpenManager", "dismiss dialog loading ad open: ");
            try {
                kVar.l.dismiss();
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
        kVar.b = null;
        k.f21742n = false;
        kVar.e(false);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdImpression() {
        super.onAdImpression();
        k kVar = this.f21741a;
        if (kVar.f21745f != null) {
            kVar.getClass();
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        k kVar = this.f21741a;
        kVar.getClass();
        k.f21742n = true;
        kVar.b = null;
    }
}
