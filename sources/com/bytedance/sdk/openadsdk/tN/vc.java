package com.bytedance.sdk.openadsdk.tN;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.GS;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class vc extends ScrollView {
    private final com.bytedance.sdk.openadsdk.core.wN.wN Sg;
    private final nc YFl;

    public vc(Context context, nc ncVar) {
        super(context);
        this.YFl = ncVar;
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        this.Sg = wNVar;
        wNVar.setOrientation(1);
        addView(wNVar, new FrameLayout.LayoutParams(-1, -2));
        if (ncVar.qsH() == 0) {
            YFl();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setVerticalScrollBarEnabled(false);
    }

    private void Sg(List<FilterWord> list) {
        float f10;
        this.Sg.removeAllViews();
        for (int i10 = 0; i10 < list.size(); i10++) {
            FilterWord filterWord = list.get(i10);
            if (filterWord != null) {
                this.Sg.addView(new DSW(getContext(), filterWord, this.YFl));
            }
            if (i10 < list.size() - 1) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                Context context = getContext();
                if (this.YFl.NjR()) {
                    f10 = 16.0f;
                } else {
                    f10 = 8.0f;
                }
                int tN = GS.tN(context, f10);
                layoutParams.topMargin = tN;
                layoutParams.bottomMargin = tN;
                this.Sg.addView(new eT(getContext()), layoutParams);
            }
        }
    }

    private void YFl() {
        if (this.YFl.qsH() != 0) {
            return;
        }
        this.YFl.YFl(GS.tN(getContext()), GS.AlY(getContext()));
    }

    private static List<FilterWord> tN(List<FilterWord> list) {
        if (list != null && !list.isEmpty()) {
            int i10 = 0;
            int i11 = -1;
            for (int i12 = 0; i12 < list.size(); i12++) {
                if (list.get(i12).hasSecondOptions()) {
                    i11 = i12;
                }
            }
            if (i11 != -1 && i11 <= list.size()) {
                i10 = i11;
            }
            FilterWord filterWord = list.get(i10);
            Iterator<FilterWord> it = list.iterator();
            while (it.hasNext()) {
                FilterWord next = it.next();
                if (!next.hasSecondOptions()) {
                    filterWord.addOption(next);
                    it.remove();
                }
            }
            return list;
        }
        return null;
    }

    public void YFl(List<FilterWord> list) {
        List<FilterWord> tN = tN(list);
        if (tN == null) {
            return;
        }
        Sg(tN);
    }
}
