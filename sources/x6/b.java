package x6;

import android.view.View;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.nativead.MediaView;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.out.MBNativeHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import v6.e;

/* loaded from: classes3.dex */
public final class b extends e {

    /* renamed from: g, reason: collision with root package name */
    public MBNativeHandler f27409g;

    public b(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback) {
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
        MBNativeHandler mBNativeHandler = this.f27409g;
        if (mBNativeHandler != null) {
            mBNativeHandler.registerView(view, arrayList, this.f26056b);
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public final void untrackView(View view) {
        MBNativeHandler mBNativeHandler = this.f27409g;
        if (mBNativeHandler != null) {
            mBNativeHandler.unregisterView(view, e.a(view), this.f26056b);
        }
    }
}
