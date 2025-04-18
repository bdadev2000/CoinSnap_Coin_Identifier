package com.bytedance.sdk.openadsdk.AlY.YFl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public class qsH implements com.bytedance.sdk.component.vc.YFl.YFl.wN {
    public static final qsH YFl = new qsH();
    private volatile SQLiteDatabase Sg;

    @Override // com.bytedance.sdk.component.vc.YFl.YFl.wN
    public String AlY() {
        return "logstats";
    }

    @Override // com.bytedance.sdk.component.vc.YFl.YFl.wN
    public String Sg() {
        return "adevent";
    }

    @Override // com.bytedance.sdk.component.vc.YFl.YFl.wN
    public String YFl() {
        return "loghighpriority";
    }

    @Override // com.bytedance.sdk.component.vc.YFl.YFl.wN
    public String tN() {
        return null;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.YFl.wN
    public String vc() {
        return null;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.YFl.wN
    public String wN() {
        return "logstatsbatch";
    }

    @Override // com.bytedance.sdk.component.vc.YFl.YFl.wN
    public SQLiteDatabase YFl(Context context) {
        if (this.Sg == null) {
            synchronized (this) {
                if (this.Sg == null) {
                    this.Sg = com.bytedance.sdk.openadsdk.core.wN.YFl(context).YFl().YFl();
                }
            }
        }
        return this.Sg;
    }
}
