package com.vungle.ads.internal;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k0 implements Runnable {
    final /* synthetic */ l0 this$0;
    private final ArrayList<View> visibleViews = new ArrayList<>();

    public k0(l0 l0Var) {
        this.this$0 = l0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        Map map;
        Map map2;
        boolean z10;
        Map map3;
        i0 impressionListener;
        boolean isVisible;
        this.this$0.isVisibilityScheduled = false;
        map = this.this$0.trackedViews;
        for (Map.Entry entry : map.entrySet()) {
            View view = (View) entry.getKey();
            isVisible = this.this$0.isVisible(view, ((j0) entry.getValue()).getMinViewablePercent());
            if (isVisible) {
                this.visibleViews.add(view);
            }
        }
        Iterator<View> it = this.visibleViews.iterator();
        while (it.hasNext()) {
            View view2 = it.next();
            map3 = this.this$0.trackedViews;
            j0 j0Var = (j0) map3.get(view2);
            if (j0Var != null && (impressionListener = j0Var.getImpressionListener()) != null) {
                ((gb.d) impressionListener).onImpression(view2);
            }
            l0 l0Var = this.this$0;
            Intrinsics.checkNotNullExpressionValue(view2, "view");
            l0Var.removeView(view2);
        }
        this.visibleViews.clear();
        map2 = this.this$0.trackedViews;
        if (!map2.isEmpty()) {
            z10 = this.this$0.setViewTreeObserverSucceed;
            if (!z10) {
                this.this$0.scheduleVisibilityCheck();
            }
        }
    }
}
