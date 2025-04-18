package com.bytedance.sdk.openadsdk.tN;

import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.tN.AlY;
import com.bytedance.sdk.openadsdk.utils.mn;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class nc {
    private String EH;
    private String GA;
    private FilterWord Wwa;
    private String YoT;
    private String eT;
    private int lG;
    private String pDU;
    private int rkt;

    /* renamed from: vc, reason: collision with root package name */
    protected IListenerManager f10811vc;
    public static FilterWord YFl = new FilterWord("", "");
    public static int Sg = 1;
    public static int tN = 2;
    public static int AlY = 3;
    public static int wN = 4;
    private final Set<tN> DSW = new HashSet();
    private final Set<Sg> qsH = new HashSet();
    private final Set<AlY> NjR = new HashSet();

    /* renamed from: nc, reason: collision with root package name */
    private final Set<YFl> f10810nc = new HashSet();

    /* loaded from: classes.dex */
    public interface AlY {
        void YFl(String str);
    }

    /* loaded from: classes.dex */
    public interface Sg {
        void YFl(int i10);
    }

    /* loaded from: classes.dex */
    public interface YFl {
        void YFl(List<FilterWord> list);
    }

    /* loaded from: classes.dex */
    public interface tN {
        void YFl(FilterWord filterWord);
    }

    private void nc() {
        Iterator<tN> it = this.DSW.iterator();
        while (it.hasNext()) {
            it.next().YFl(this.Wwa);
        }
    }

    public void AlY() {
        if (!tN() && !TextUtils.isEmpty(this.pDU)) {
            this.Wwa = new FilterWord("0:00", this.pDU);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.Wwa);
        if (!TextUtils.isEmpty(this.eT)) {
            if (TextUtils.isEmpty(this.pDU)) {
                com.bytedance.sdk.openadsdk.tN.Sg.YFl().YFl(this.eT, arrayList, this.YoT);
            } else {
                com.bytedance.sdk.openadsdk.tN.Sg.YFl().YFl(this.eT, arrayList, this.EH, this.pDU, this.YoT);
            }
        }
        if (!TextUtils.isEmpty(this.GA)) {
            if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
                wN("onItemClickClosed");
            } else {
                AlY.YFl wN2 = com.bytedance.sdk.openadsdk.core.NjR.Sg().wN(this.GA);
                if (wN2 != null) {
                    wN2.YFl();
                    com.bytedance.sdk.openadsdk.core.NjR.Sg().vc(this.GA);
                }
            }
        }
        Iterator<Sg> it = this.qsH.iterator();
        while (it.hasNext()) {
            it.next().YFl(Sg);
        }
        YFl(YFl);
        tN("");
    }

    public String DSW() {
        return this.pDU;
    }

    public boolean NjR() {
        return this.rkt < this.lG;
    }

    public void Sg(String str) {
        this.YoT = str;
    }

    public int qsH() {
        return this.rkt;
    }

    public boolean tN() {
        FilterWord filterWord = this.Wwa;
        return (filterWord == null || filterWord.equals(YFl)) ? false : true;
    }

    public void vc() {
        Iterator<Sg> it = this.qsH.iterator();
        while (it.hasNext()) {
            it.next().YFl(wN);
        }
    }

    public void wN() {
        Iterator<Sg> it = this.qsH.iterator();
        while (it.hasNext()) {
            it.next().YFl(tN);
        }
    }

    public FilterWord Sg() {
        return this.Wwa;
    }

    public void YFl() {
        this.DSW.clear();
        this.qsH.clear();
        this.NjR.clear();
        this.f10810nc.clear();
    }

    public void tN(String str) {
        this.pDU = str;
        Iterator<AlY> it = this.NjR.iterator();
        while (it.hasNext()) {
            it.next().YFl(this.pDU);
        }
    }

    private void wN(final String str) {
        mn.tN(new com.bytedance.sdk.component.qsH.qsH("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.tN.nc.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (!TextUtils.isEmpty(nc.this.GA)) {
                        nc.this.YFl(6).executeDisLikeClosedCallback(nc.this.GA, str);
                    }
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.YoT.YFl("TTDislikeManager", "executeRewardVideoCallback execute throw Exception : ", th2);
                }
            }
        }, 5);
    }

    public void YFl(String str) {
        this.eT = str;
    }

    public void YFl(FilterWord filterWord) {
        this.Wwa = filterWord;
        nc();
    }

    public void YFl(tN tNVar) {
        this.DSW.add(tNVar);
    }

    public void YFl(Sg sg2) {
        this.qsH.add(sg2);
    }

    public void YFl(AlY alY) {
        this.NjR.add(alY);
    }

    public void YFl(YFl yFl) {
        this.f10810nc.add(yFl);
    }

    public void YFl(List<FilterWord> list) {
        Iterator<YFl> it = this.f10810nc.iterator();
        while (it.hasNext()) {
            it.next().YFl(list);
        }
    }

    public IListenerManager YFl(int i10) {
        if (this.f10811vc == null) {
            this.f10811vc = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.YFl.YFl().YFl(i10));
        }
        return this.f10811vc;
    }

    public void AlY(String str) {
        this.EH = str;
    }

    public static void YFl(final int i10, final String str, final AlY.YFl yFl) {
        if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            mn.tN(new com.bytedance.sdk.component.qsH.qsH("DislikeClosed_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.tN.nc.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.YFl YFl2 = com.bytedance.sdk.openadsdk.multipro.aidl.YFl.YFl();
                    if (i10 == 6 && yFl != null) {
                        try {
                            com.bytedance.sdk.openadsdk.multipro.aidl.Sg.Sg sg2 = new com.bytedance.sdk.openadsdk.multipro.aidl.Sg.Sg(str, yFl);
                            IListenerManager asInterface = IListenerManager.Stub.asInterface(YFl2.YFl(6));
                            if (asInterface != null) {
                                asInterface.registerDisLikeClosedListener(str, sg2);
                            }
                        } catch (RemoteException e2) {
                            com.bytedance.sdk.component.utils.YoT.YFl("TTDislikeManager", e2.getMessage());
                        }
                    }
                }
            }, 5);
        }
    }

    public static void YFl(final int i10, final String str) {
        if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            mn.tN(new com.bytedance.sdk.component.qsH.qsH("DislikeClosed_unregisterMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.tN.nc.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.YFl YFl2 = com.bytedance.sdk.openadsdk.multipro.aidl.YFl.YFl();
                    if (i10 == 6) {
                        try {
                            IListenerManager asInterface = IListenerManager.Stub.asInterface(YFl2.YFl(6));
                            if (asInterface != null) {
                                asInterface.unregisterDisLikeClosedListener(str);
                            }
                        } catch (RemoteException unused) {
                        }
                    }
                }
            }, 5);
        }
    }

    public void YFl(int i10, int i11) {
        this.rkt = i10;
        this.lG = i11;
    }
}
