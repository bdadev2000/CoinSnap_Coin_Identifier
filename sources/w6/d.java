package w6;

import android.view.View;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.nativead.MediaView;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.out.MBBidNativeHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class d extends v6.e {

    /* renamed from: g, reason: collision with root package name */
    public MBBidNativeHandler f26863g;

    public d(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback) {
        super(mediationNativeAdConfiguration, mediationAdLoadCallback);
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public final void trackViews(View view, Map map, Map map2) {
        HashMap hashMap = new HashMap(map);
        hashMap.remove("3011");
        hashMap.remove("3012");
        ArrayList arrayList = new ArrayList(hashMap.values());
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= arrayList.size()) {
                break;
            }
            View view2 = (View) arrayList.get(i11);
            if (view2 instanceof MediaView) {
                MediaView mediaView = (MediaView) view2;
                while (true) {
                    if (i10 >= mediaView.getChildCount()) {
                        break;
                    }
                    View childAt = mediaView.getChildAt(i10);
                    if (childAt instanceof MBMediaView) {
                        ((MBMediaView) childAt).setOnMediaViewListener(this);
                        break;
                    }
                    i10++;
                }
            } else {
                i11++;
            }
        }
        MBBidNativeHandler mBBidNativeHandler = this.f26863g;
        if (mBBidNativeHandler != null) {
            mBBidNativeHandler.registerView(view, arrayList, this.f26056b);
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public final void untrackView(View view) {
        MBBidNativeHandler mBBidNativeHandler = this.f26863g;
        if (mBBidNativeHandler != null) {
            mBBidNativeHandler.unregisterView(view, v6.e.a(view), this.f26056b);
        }
    }
}
