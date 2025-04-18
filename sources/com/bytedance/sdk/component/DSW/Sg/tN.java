package com.bytedance.sdk.component.DSW.Sg;

import android.text.TextUtils;
import com.bytedance.sdk.component.Sg.YFl.GA;
import com.bytedance.sdk.component.Sg.YFl.eT;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class tN {
    protected eT tN;

    /* renamed from: vc, reason: collision with root package name */
    int f10312vc;
    String wN;
    protected String AlY = null;
    protected final Map<String, String> DSW = new HashMap();
    protected String qsH = null;
    protected boolean NjR = false;

    public tN(eT eTVar) {
        this.tN = eTVar;
        try {
            tN(UUID.randomUUID().toString());
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public void AlY(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.DSW.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public void Sg(String str) {
        this.qsH = str;
    }

    public void YFl(String str) {
        this.wN = str;
    }

    public void tN(String str) {
        this.AlY = str;
    }

    public void Sg(String str, String str2) {
        this.DSW.put(str, str2);
    }

    public void YFl(int i10) {
        this.f10312vc = i10;
    }

    public void tN() {
        eT eTVar;
        if (this.AlY == null || (eTVar = this.tN) == null) {
            return;
        }
        com.bytedance.sdk.component.Sg.YFl.AlY YFl = eTVar.YFl();
        synchronized (YFl) {
            for (com.bytedance.sdk.component.Sg.YFl.Sg sg2 : YFl.tN()) {
                if (this.AlY.equals(sg2.YFl().YFl())) {
                    sg2.tN();
                }
            }
            for (com.bytedance.sdk.component.Sg.YFl.Sg sg3 : YFl.AlY()) {
                if (this.AlY.equals(sg3.YFl().YFl())) {
                    sg3.tN();
                }
            }
        }
    }

    public String Sg() {
        return this.AlY;
    }

    public void YFl(GA.YFl yFl) {
        if (yFl != null && this.DSW.size() > 0) {
            for (Map.Entry<String, String> entry : this.DSW.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key)) {
                    String value = entry.getValue();
                    if (value == null) {
                        value = "";
                    }
                    yFl.Sg(key, value);
                }
            }
        }
    }
}
