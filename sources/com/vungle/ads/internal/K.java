package com.vungle.ads.internal;

import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class K implements Runnable {
    final /* synthetic */ L this$0;
    private final ArrayList<View> visibleViews = new ArrayList<>();

    public K(L l) {
        this.this$0 = l;
    }

    @Override // java.lang.Runnable
    public void run() {
        Map map;
        Map map2;
        boolean z8;
        Map map3;
        I impressionListener;
        boolean isVisible;
        this.this$0.isVisibilityScheduled = false;
        map = this.this$0.trackedViews;
        for (Map.Entry entry : map.entrySet()) {
            View view = (View) entry.getKey();
            isVisible = this.this$0.isVisible(view, ((J) entry.getValue()).getMinViewablePercent());
            if (isVisible) {
                this.visibleViews.add(view);
            }
        }
        Iterator<View> it = this.visibleViews.iterator();
        while (it.hasNext()) {
            View next = it.next();
            map3 = this.this$0.trackedViews;
            J j7 = (J) map3.get(next);
            if (j7 != null && (impressionListener = j7.getImpressionListener()) != null) {
                impressionListener.onImpression(next);
            }
            L l = this.this$0;
            G7.j.d(next, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            l.removeView(next);
        }
        this.visibleViews.clear();
        map2 = this.this$0.trackedViews;
        if (!map2.isEmpty()) {
            z8 = this.this$0.setViewTreeObserverSucceed;
            if (!z8) {
                this.this$0.scheduleVisibilityCheck();
            }
        }
    }
}
