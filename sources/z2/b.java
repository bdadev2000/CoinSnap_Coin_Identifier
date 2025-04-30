package Z2;

import X2.c;
import android.view.View;
import com.google.android.gms.ads.nativead.MediaView;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.out.MBNativeHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: g, reason: collision with root package name */
    public MBNativeHandler f3878g;

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public final void trackViews(View view, Map map, Map map2) {
        HashMap hashMap = new HashMap(map);
        hashMap.remove("3011");
        hashMap.remove("3012");
        ArrayList arrayList = new ArrayList(hashMap.values());
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                break;
            }
            View view2 = (View) arrayList.get(i10);
            if (view2 instanceof MediaView) {
                MediaView mediaView = (MediaView) view2;
                while (true) {
                    if (i9 >= mediaView.getChildCount()) {
                        break;
                    }
                    View childAt = mediaView.getChildAt(i9);
                    if (childAt instanceof MBMediaView) {
                        ((MBMediaView) childAt).setOnMediaViewListener(this);
                        break;
                    }
                    i9++;
                }
            } else {
                i10++;
            }
        }
        MBNativeHandler mBNativeHandler = this.f3878g;
        if (mBNativeHandler != null) {
            mBNativeHandler.registerView(view, arrayList, this.b);
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public final void untrackView(View view) {
        MBNativeHandler mBNativeHandler = this.f3878g;
        if (mBNativeHandler != null) {
            mBNativeHandler.unregisterView(view, c.a(view), this.b);
        }
    }
}
