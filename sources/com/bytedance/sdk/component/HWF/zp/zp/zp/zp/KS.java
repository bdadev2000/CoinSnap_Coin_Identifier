package com.bytedance.sdk.component.HWF.zp.zp.zp.zp;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class KS {
    private final Context zp;
    protected final List<com.bytedance.sdk.component.HWF.zp.jU.zp> lMd = new ArrayList();
    private boolean KS = false;
    private final Runnable jU = new Runnable() { // from class: com.bytedance.sdk.component.HWF.zp.zp.zp.zp.KS.1
        @Override // java.lang.Runnable
        public void run() {
            synchronized (KS.this) {
                try {
                    if (KS.this.lMd.isEmpty()) {
                        KS.this.KS = false;
                        return;
                    }
                    ArrayList arrayList = new ArrayList(KS.this.lMd);
                    KS.this.lMd.clear();
                    KS.this.KS = false;
                    KS.this.jU(arrayList);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };

    public KS(Context context) {
        this.zp = context;
    }

    public Context COT() {
        return this.zp;
    }

    public void KS(List<String> list) {
        if (list != null && !list.isEmpty()) {
            try {
                Iterator<com.bytedance.sdk.component.HWF.zp.jU.zp> it = this.lMd.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.HWF.zp.jU.zp next = it.next();
                    if (next != null) {
                        String KS = next.KS();
                        if (!TextUtils.isEmpty(KS) && list.contains(KS)) {
                            it.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                lMd();
                th.getMessage();
            }
        }
    }

    public void jU(List<com.bytedance.sdk.component.HWF.zp.jU.zp> list) {
        com.bytedance.sdk.component.HWF.zp.zp.zp.KS.zp(COT(), lMd(), list);
    }

    public abstract String lMd();

    private void zp() {
        if (this.KS) {
            return;
        }
        com.bytedance.sdk.component.HWF.zp.QR.zp.zp().postDelayed(this.jU, com.bytedance.sdk.component.HWF.zp.QR.zp.lMd());
        this.KS = true;
    }

    public synchronized void zp(com.bytedance.sdk.component.HWF.zp.jU.zp zpVar) {
        if (zpVar.QR() != null && !TextUtils.isEmpty(zpVar.KS())) {
            this.lMd.add(zpVar);
            zp();
        }
    }
}
