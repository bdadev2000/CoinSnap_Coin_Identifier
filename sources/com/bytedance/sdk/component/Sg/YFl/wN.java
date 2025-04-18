package com.bytedance.sdk.component.Sg.YFl;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class wN extends pDU {
    List<String> Sg;
    List<String> YFl;

    public wN(List<String> list, List<String> list2) {
        this.YFl = list;
        this.Sg = list2;
    }

    /* loaded from: classes.dex */
    public static final class YFl {
        private final List<String> YFl = new ArrayList();
        private final List<String> Sg = new ArrayList();

        public YFl YFl(String str, String str2) {
            this.YFl.add(str);
            this.Sg.add(str2);
            return this;
        }

        public wN YFl() {
            return new wN(this.YFl, this.Sg);
        }
    }
}
