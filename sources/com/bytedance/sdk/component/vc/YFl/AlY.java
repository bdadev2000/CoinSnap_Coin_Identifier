package com.bytedance.sdk.component.vc.YFl;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.lG;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class AlY {
    public static final AlY YFl = new AlY();

    private boolean tN() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    private void Sg(YFl yFl, Context context) {
        tN.YFl(context, "context == null");
        tN.YFl(yFl, "AdLogConfig == null");
        tN.YFl(yFl.AlY(), "AdLogDepend ==null");
    }

    public void Sg() {
        final wN rkt = qsH.DSW().rkt();
        if (rkt == null || qsH.DSW().vc() == null || rkt.AlY() == null) {
            return;
        }
        if (qsH.DSW().Sg()) {
            if (YFl(qsH.DSW().vc(), rkt)) {
                qsH.DSW().eT();
                return;
            } else if (tN()) {
                rkt.AlY().execute(new com.bytedance.sdk.component.vc.YFl.wN.wN("stop") { // from class: com.bytedance.sdk.component.vc.YFl.AlY.3
                    @Override // java.lang.Runnable
                    public void run() {
                        AlY.this.Sg(rkt.vc());
                    }
                });
                return;
            } else {
                Sg(rkt.vc());
                return;
            }
        }
        qsH.DSW().eT();
    }

    public void YFl(YFl yFl, Context context) {
        Sg(yFl, context);
        qsH.DSW().YFl(context);
        qsH.DSW().YFl(yFl.nc());
        qsH.DSW().Sg(yFl.DSW());
        qsH.DSW().tN(yFl.qsH());
        qsH.DSW().YFl(yFl.Sg());
        qsH.DSW().AlY(yFl.NjR());
        qsH.DSW().wN(yFl.vc());
        qsH.DSW().YFl(yFl.YFl() == null ? com.bytedance.sdk.component.vc.YFl.YFl.YFl.wN.YFl : yFl.YFl());
        qsH.DSW().Sg(yFl.eT());
        qsH.DSW().YFl(yFl.AlY());
        qsH.DSW().YFl(yFl.tN());
        qsH.DSW().YFl(yFl.wN());
        com.bytedance.sdk.component.vc.YFl.Sg.tN.tN.YFl(yFl.GA());
        com.bytedance.sdk.component.vc.YFl.Sg.tN.tN.Sg(yFl.YoT());
        YFl(yFl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sg(int i10) {
        if (i10 == 0) {
            com.bytedance.sdk.component.vc.YFl.Sg.Sg.YFl.Sg();
        } else if (i10 == 1) {
            com.bytedance.sdk.component.vc.YFl.Sg.Sg.Sg.Sg();
        }
    }

    private void Sg(final com.bytedance.sdk.component.vc.YFl.AlY.YFl yFl) {
        final wN rkt = qsH.DSW().rkt();
        if (yFl == null || rkt == null || qsH.DSW().vc() == null || rkt.AlY() == null) {
            return;
        }
        if (qsH.DSW().Sg()) {
            if (YFl(qsH.DSW().vc(), rkt)) {
                qsH.DSW().YFl(yFl);
                return;
            }
            tN();
            if (tN()) {
                rkt.AlY().execute(new com.bytedance.sdk.component.vc.YFl.wN.wN("dispatchEvent") { // from class: com.bytedance.sdk.component.vc.YFl.AlY.4
                    @Override // java.lang.Runnable
                    public void run() {
                        AlY.this.YFl(yFl, rkt.vc());
                    }
                });
                return;
            } else {
                YFl(yFl, rkt.vc());
                return;
            }
        }
        qsH.DSW().YFl(yFl);
    }

    private void YFl(YFl yFl) {
        Executor wN;
        if (Looper.myLooper() != Looper.getMainLooper() && com.bytedance.sdk.component.vc.YFl.tN.YFl.Sg()) {
            com.bytedance.sdk.component.vc.YFl.tN.YFl.YFl();
            return;
        }
        wN AlY = yFl.AlY();
        if (AlY == null || !com.bytedance.sdk.component.vc.YFl.tN.YFl.Sg() || (wN = AlY.wN()) == null) {
            return;
        }
        wN.execute(new Runnable() { // from class: com.bytedance.sdk.component.vc.YFl.AlY.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.vc.YFl.tN.YFl.YFl();
            }
        });
    }

    public void YFl(boolean z10) {
        qsH.DSW().YFl(z10);
    }

    private boolean YFl(Context context, wN wNVar) {
        if (context == null || wNVar == null) {
            return false;
        }
        if (wNVar.vc() == 2) {
            return true;
        }
        if (wNVar.vc() == 1) {
            return wNVar.pDU();
        }
        try {
            return lG.YFl(context);
        } catch (Throwable th2) {
            th2.getMessage();
            return true;
        }
    }

    public void YFl() {
        final wN rkt = qsH.DSW().rkt();
        if (rkt == null || qsH.DSW().vc() == null || rkt.AlY() == null) {
            return;
        }
        if (qsH.DSW().Sg()) {
            if (YFl(qsH.DSW().vc(), rkt)) {
                qsH.DSW().NjR();
                return;
            } else if (tN()) {
                rkt.AlY().execute(new com.bytedance.sdk.component.vc.YFl.wN.wN("start") { // from class: com.bytedance.sdk.component.vc.YFl.AlY.2
                    @Override // java.lang.Runnable
                    public void run() {
                        AlY.this.YFl(rkt.vc());
                    }
                });
                return;
            } else {
                YFl(rkt.vc());
                return;
            }
        }
        qsH.DSW().NjR();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(int i10) {
        if (i10 == 0) {
            com.bytedance.sdk.component.vc.YFl.Sg.Sg.YFl.YFl();
        } else if (i10 == 1) {
            com.bytedance.sdk.component.vc.YFl.Sg.Sg.Sg.YFl();
        }
    }

    public void YFl(com.bytedance.sdk.component.vc.YFl.AlY.YFl yFl) {
        Sg(yFl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(com.bytedance.sdk.component.vc.YFl.AlY.YFl yFl, int i10) {
        if (i10 == 0) {
            com.bytedance.sdk.component.vc.YFl.Sg.Sg.YFl.YFl(yFl);
        } else if (i10 == 1) {
            com.bytedance.sdk.component.vc.YFl.Sg.Sg.Sg.YFl(yFl);
        }
    }

    public void YFl(final String str, final List<String> list, final boolean z10, Map<String, String> map, final int i10, final String str2) {
        final wN rkt = qsH.DSW().rkt();
        if (rkt == null || qsH.DSW().vc() == null || rkt.AlY() == null) {
            return;
        }
        if (rkt.qsH()) {
            if (rkt.vc() == 1) {
                if (list == null || list.isEmpty()) {
                    return;
                }
            } else if (rkt.vc() == 0 && (TextUtils.isEmpty(str) || list == null || list.isEmpty())) {
                return;
            }
            if (qsH.DSW().Sg() && !YFl(qsH.DSW().vc(), rkt)) {
                if (tN()) {
                    rkt.AlY().execute(new com.bytedance.sdk.component.vc.YFl.wN.wN("trackFailed") { // from class: com.bytedance.sdk.component.vc.YFl.AlY.5
                        @Override // java.lang.Runnable
                        public void run() {
                            AlY.this.YFl(str, (List<String>) list, z10, rkt.vc(), i10, str2);
                        }
                    });
                    return;
                } else {
                    YFl(str, list, z10, rkt.vc(), i10, str2);
                    return;
                }
            }
            qsH.DSW().YFl(str, list, z10, map, i10, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(String str, List<String> list, boolean z10, int i10, int i11, String str2) {
        if (i10 == 0) {
            com.bytedance.sdk.component.vc.YFl.Sg.Sg.YFl.YFl(str, list, z10);
        } else if (i10 == 1) {
            com.bytedance.sdk.component.vc.YFl.Sg.Sg.Sg.YFl(str, list, z10, i11, str2);
        }
    }

    public void YFl(final String str, final boolean z10) {
        final wN rkt = qsH.DSW().rkt();
        if (rkt == null || qsH.DSW().vc() == null || rkt.AlY() == null || !rkt.qsH()) {
            return;
        }
        if (rkt.vc() == 0 && TextUtils.isEmpty(str)) {
            return;
        }
        if (qsH.DSW().Sg() && !YFl(qsH.DSW().vc(), rkt)) {
            if (tN()) {
                rkt.AlY().execute(new com.bytedance.sdk.component.vc.YFl.wN.wN("trackFailed") { // from class: com.bytedance.sdk.component.vc.YFl.AlY.6
                    @Override // java.lang.Runnable
                    public void run() {
                        AlY.this.YFl(str, rkt.vc(), z10);
                    }
                });
                return;
            } else {
                YFl(str, rkt.vc(), z10);
                return;
            }
        }
        qsH.DSW().YFl(str, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(String str, int i10, boolean z10) {
        if (i10 == 0) {
            com.bytedance.sdk.component.vc.YFl.Sg.Sg.YFl.YFl(str);
        } else if (i10 == 1) {
            com.bytedance.sdk.component.vc.YFl.Sg.Sg.Sg.YFl(str, z10);
        }
    }
}
