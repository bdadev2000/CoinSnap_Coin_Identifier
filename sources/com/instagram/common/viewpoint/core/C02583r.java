package com.instagram.common.viewpoint.core;

import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.3r, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C02583r extends FL {
    public static String[] A00 = {"4mrgyhu5NuMSfoRJ7wvth", "0QrbVGKHuGc2eSGsbm7N10peHve4GVgP", "Meba3O6SWeMBrZzPyfP10SBJe7jX", "3Oa5wanHMWuCrkjHvXNfwyLB0ZtCKHr4", "YOQh7xYBrfW2123ECT3lDkRgUFpenV07", "JuO7BKBrPjkMVs4", "5m", "UWhmaXdvjdchgK72Wd2HML9QO634NCpp"};

    public C02583r(C1045Zs c1045Zs) {
        super(c1045Zs);
        setCarouselLayoutManager(c1045Zs);
    }

    public TU getFullscreenCarouselRecyclerViewAdapter() {
        getAdapter();
        if (0 != 0) {
            getAdapter();
            return null;
        }
        if (A00[6].length() != 2) {
            throw new RuntimeException();
        }
        A00[2] = "XAsjP5XwQSgGjSaOGRXjEIyXW47w";
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.FL
    public C1107at getLayoutManager() {
        return (C1107at) super.getLayoutManager();
    }

    public AbstractC02854t getOnScrollListener() {
        return new VX(this);
    }

    private void setCarouselLayoutManager(C1045Zs c1045Zs) {
        C1107at c1107at = new C1107at(c1045Zs, 0, false);
        if (Build.VERSION.SDK_INT >= 24) {
            c1107at.A1R(true);
        }
        super.setLayoutManager(c1107at);
    }

    @Override // com.instagram.common.viewpoint.core.FL
    public void setLayoutManager(AbstractC02804o abstractC02804o) {
    }
}
