package com.bytedance.sdk.component.vc.YFl.YFl.YFl;

import android.annotation.SuppressLint;
import android.content.Context;
import com.bytedance.sdk.component.vc.YFl.YFl.YFl.Sg;

/* loaded from: classes.dex */
public class YFl extends Sg {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile YFl YFl;

    private YFl(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.component.vc.YFl.YFl.YFl.Sg
    public /* bridge */ /* synthetic */ Sg.C0094Sg YFl() {
        return super.YFl();
    }

    public static YFl YFl(Context context) {
        if (YFl == null) {
            synchronized (YFl.class) {
                if (YFl == null) {
                    YFl = new YFl(context);
                }
            }
        }
        return YFl;
    }
}
