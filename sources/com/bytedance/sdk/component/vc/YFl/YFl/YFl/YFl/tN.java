package com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class tN {
    private final Context YFl;
    protected final List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> Sg = new ArrayList();
    private boolean tN = false;
    private final Runnable AlY = new Runnable() { // from class: com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl.tN.1
        @Override // java.lang.Runnable
        public void run() {
            synchronized (tN.this) {
                if (tN.this.Sg.isEmpty()) {
                    tN.this.tN = false;
                    return;
                }
                ArrayList arrayList = new ArrayList(tN.this.Sg);
                tN.this.Sg.clear();
                tN.this.tN = false;
                tN.this.AlY(arrayList);
            }
        }
    };

    public tN(Context context) {
        this.YFl = context;
    }

    public void AlY(List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> list) {
        com.bytedance.sdk.component.vc.YFl.YFl.YFl.tN.YFl(wN(), Sg(), list);
    }

    public abstract String Sg();

    public void tN(List<String> list) {
        if (list != null && !list.isEmpty()) {
            try {
                Iterator<com.bytedance.sdk.component.vc.YFl.AlY.YFl> it = this.Sg.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.vc.YFl.AlY.YFl next = it.next();
                    if (next != null) {
                        String tN = next.tN();
                        if (!TextUtils.isEmpty(tN) && list.contains(tN)) {
                            it.remove();
                        }
                    }
                }
            } catch (Throwable th2) {
                Sg();
                th2.getMessage();
            }
        }
    }

    public Context wN() {
        return this.YFl;
    }

    private void YFl() {
        if (this.tN) {
            return;
        }
        com.bytedance.sdk.component.vc.YFl.DSW.YFl.YFl().postDelayed(this.AlY, com.bytedance.sdk.component.vc.YFl.DSW.YFl.Sg());
        this.tN = true;
    }

    public synchronized void YFl(com.bytedance.sdk.component.vc.YFl.AlY.YFl yFl) {
        if (yFl.DSW() != null && !TextUtils.isEmpty(yFl.tN())) {
            this.Sg.add(yFl);
            YFl();
        }
    }
}
