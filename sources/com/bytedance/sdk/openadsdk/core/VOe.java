package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class VOe {
    public static ConcurrentHashMap<Integer, VOe> YFl = new ConcurrentHashMap<>();
    private int AlY;
    private String Sg = "";
    private String tN = "";

    /* renamed from: vc, reason: collision with root package name */
    private String f10646vc;
    private int wN;

    private void vc() {
        this.Sg = "";
        this.tN = "";
        this.AlY = 0;
        this.wN = 0;
    }

    public int AlY() {
        return this.AlY;
    }

    public String Sg() {
        return this.Sg;
    }

    public String YFl() {
        return this.f10646vc;
    }

    public String tN() {
        return this.tN;
    }

    public int wN() {
        return this.wN;
    }

    public static void tN(int i10) {
        VOe vOe;
        if (i10 == 0) {
            return;
        }
        if (YFl == null) {
            YFl = new ConcurrentHashMap<>();
        }
        if (!YFl.containsKey(Integer.valueOf(i10)) || (vOe = YFl.get(Integer.valueOf(i10))) == null) {
            return;
        }
        vOe.Sg(1);
    }

    public void Sg(int i10) {
        this.wN = i10;
    }

    public void YFl(int i10) {
        this.AlY = i10;
    }

    public static void Sg(com.bytedance.sdk.openadsdk.core.model.Wwa wwa) {
        if (wwa == null || TextUtils.isEmpty(wwa.uGS())) {
            return;
        }
        Integer valueOf = Integer.valueOf(wwa.kU());
        if (valueOf.intValue() == 0) {
            return;
        }
        if (YFl == null) {
            YFl = new ConcurrentHashMap<>();
        }
        VOe vOe = YFl.containsKey(valueOf) ? YFl.get(valueOf) : null;
        if (vOe == null) {
            vOe = new VOe();
        }
        String ivp = wwa.ivp();
        if (TextUtils.isEmpty(ivp) || !ivp.equals(vOe.YFl())) {
            vOe.vc();
            vOe.YFl(wwa);
            YFl.put(valueOf, vOe);
        }
    }

    public void YFl(com.bytedance.sdk.openadsdk.core.model.Wwa wwa) {
        if (wwa != null) {
            String ivp = wwa.ivp();
            if (!TextUtils.isEmpty(ivp)) {
                this.f10646vc = ivp;
            }
            String Cqy = wwa.Cqy();
            if (TextUtils.isEmpty(Cqy) && wwa.yn()) {
                Cqy = wwa.Af().NjR();
            }
            if (!TextUtils.isEmpty(Cqy)) {
                String[] split = Cqy.split("/");
                if (split.length >= 3) {
                    this.Sg = split[2];
                }
            }
            if (wwa.in() == null || TextUtils.isEmpty(wwa.in().tN())) {
                return;
            }
            this.tN = wwa.in().tN();
        }
    }

    public static void tN(com.bytedance.sdk.openadsdk.core.model.Wwa wwa) {
        VOe vOe;
        if (wwa == null) {
            return;
        }
        Integer valueOf = Integer.valueOf(wwa.kU());
        if (valueOf.intValue() == 0) {
            return;
        }
        if (YFl == null) {
            YFl = new ConcurrentHashMap<>();
        }
        if (!YFl.containsKey(valueOf) || (vOe = YFl.get(valueOf)) == null) {
            return;
        }
        vOe.YFl(1);
    }
}
