package com.bytedance.sdk.openadsdk.tN;

import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.qO;
import java.util.List;

/* loaded from: classes.dex */
public class Sg {
    private static volatile Sg YFl;
    private final qO<com.bytedance.sdk.openadsdk.AlY.YFl> Sg = lG.tN();

    private Sg() {
    }

    public static Sg YFl() {
        if (YFl == null) {
            synchronized (Sg.class) {
                if (YFl == null) {
                    YFl = new Sg();
                }
            }
        }
        return YFl;
    }

    public void YFl(@NonNull String str, List<FilterWord> list, String str2) {
        YFl(str, list, null, null, str2);
    }

    public void YFl(@NonNull String str, List<FilterWord> list, String str2, String str3, String str4) {
        this.Sg.YFl(str, list, str2, str3, str4);
    }
}
