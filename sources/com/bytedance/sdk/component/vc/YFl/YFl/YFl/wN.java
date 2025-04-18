package com.bytedance.sdk.component.vc.YFl.YFl.YFl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public class wN implements com.bytedance.sdk.component.vc.YFl.YFl.wN {
    public static final wN YFl = new wN();
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
                    this.Sg = new AlY(context).getWritableDatabase();
                }
            }
        }
        return this.Sg;
    }
}
