package com.bytedance.adsdk.Sg.YFl.YFl;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class Sg {
    private final List<wXo> YFl = new ArrayList();

    public void YFl(wXo wxo) {
        this.YFl.add(wxo);
    }

    public void YFl(Path path) {
        for (int size = this.YFl.size() - 1; size >= 0; size--) {
            com.bytedance.adsdk.Sg.vc.vc.YFl(path, this.YFl.get(size));
        }
    }
}
