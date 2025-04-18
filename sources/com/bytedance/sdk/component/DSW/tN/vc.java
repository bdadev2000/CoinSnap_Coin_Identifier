package com.bytedance.sdk.component.DSW.tN;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.Sg.YFl.EH;
import com.bytedance.sdk.component.Sg.YFl.GA;
import java.net.InetAddress;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;

/* loaded from: classes.dex */
public class vc {
    private boolean AlY;
    private Context DSW;
    private int qO;
    private wN qsH;
    private YFl tN;
    private Sg wN;
    private long Sg = 0;

    /* renamed from: vc, reason: collision with root package name */
    private boolean f10319vc = false;
    private int NjR = 0;

    /* renamed from: nc, reason: collision with root package name */
    private long f10318nc = 19700101000L;
    private int eT = 0;
    private HashMap<String, Integer> YoT = new HashMap<>();
    private HashMap<String, Integer> GA = new HashMap<>();
    private int pDU = 0;
    private HashMap<String, Integer> EH = new HashMap<>();
    private HashMap<String, Integer> rkt = new HashMap<>();
    private boolean lG = true;
    private Map<String, Integer> Wwa = new HashMap();
    Handler YFl = new Handler(Looper.getMainLooper()) { // from class: com.bytedance.sdk.component.DSW.tN.vc.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean z10;
            if (message.what == 10000) {
                if (message.arg1 == 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                vc.this.Sg(z10);
            }
        }
    };

    private vc() {
    }

    private void NjR() {
        SharedPreferences sharedPreferences = this.DSW.getSharedPreferences(YFl(), 0);
        this.NjR = sharedPreferences.getInt("tnc_probe_cmd", 0);
        this.f10318nc = sharedPreferences.getLong("tnc_probe_version", 19700101000L);
    }

    private boolean YFl(int i10) {
        return i10 >= 200 && i10 < 400;
    }

    private void nc() {
        this.eT = 0;
        this.YoT.clear();
        this.GA.clear();
        this.pDU = 0;
        this.EH.clear();
        this.rkt.clear();
    }

    public Sg AlY() {
        return this.wN;
    }

    public Map<String, String> DSW() {
        AlY vc2 = vc();
        if (vc2 != null) {
            return vc2.AlY;
        }
        return null;
    }

    public YFl Sg() {
        return this.tN;
    }

    public wN qsH() {
        return this.qsH;
    }

    public boolean tN() {
        return this.AlY;
    }

    public AlY vc() {
        wN wNVar = this.qsH;
        if (wNVar != null) {
            return wNVar.tN();
        }
        return null;
    }

    public void wN() {
        this.Wwa.clear();
    }

    private boolean AlY(String str) {
        Map<String, String> DSW = DSW();
        if (DSW == null) {
            return false;
        }
        String str2 = DSW.get(str);
        return (TextUtils.isEmpty(str2) || this.Wwa.get(str2) == null || this.Wwa.get(str2).intValue() < 3) ? false : true;
    }

    private void Sg(String str) {
        Map<String, String> DSW;
        if (TextUtils.isEmpty(str) || (DSW = DSW()) == null || !DSW.containsValue(str)) {
            return;
        }
        if (this.Wwa.get(str) == null) {
            this.Wwa.put(str, 1);
        } else {
            this.Wwa.put(str, Integer.valueOf(this.Wwa.get(str).intValue() + 1));
        }
    }

    private void tN(String str) {
        if (!TextUtils.isEmpty(str) && this.Wwa.containsKey(str)) {
            this.Wwa.put(str, 0);
        }
    }

    public String YFl() {
        return "ttnet_tnc_config" + this.qO;
    }

    public void YFl(boolean z10) {
        this.AlY = z10;
    }

    public void YFl(Sg sg2) {
        this.wN = sg2;
    }

    public synchronized void YFl(Context context, boolean z10) {
        if (!this.f10319vc) {
            this.DSW = context;
            this.lG = z10;
            this.qsH = new wN(context, z10, this.qO);
            if (z10) {
                NjR();
            }
            this.tN = qsH.YFl().YFl(this.qO, this.DSW);
            this.f10319vc = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sg(boolean z10) {
        if (vc() == null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!z10) {
            if ((r0.eT * 1000) + this.Sg > elapsedRealtime) {
                return;
            }
        }
        this.Sg = elapsedRealtime;
        qsH.YFl().YFl(this.qO, this.DSW).tN();
    }

    private boolean Sg(int i10) {
        if (i10 < 100 || i10 >= 1000) {
            return true;
        }
        AlY vc2 = vc();
        return (vc2 == null || TextUtils.isEmpty(vc2.GA) || !vc2.GA.contains(String.valueOf(i10))) ? false : true;
    }

    public String YFl(String str) {
        String str2;
        Map<String, String> DSW;
        if (TextUtils.isEmpty(str) || str.contains("/network/get_network") || str.contains("/get_domains/v4") || str.contains("/ies/speed")) {
            return str;
        }
        String str3 = null;
        try {
            URL url = new URL(str);
            String protocol = url.getProtocol();
            try {
                str3 = url.getHost();
            } catch (Throwable unused) {
            }
            str2 = str3;
            str3 = protocol;
        } catch (Throwable unused2) {
            str2 = null;
        }
        if (TextUtils.isEmpty(str3)) {
            return str;
        }
        if ((!"http".equals(str3) && !Constants.SCHEME.equals(str3)) || TextUtils.isEmpty(str2) || AlY(str2) || (DSW = DSW()) == null || !DSW.containsKey(str2)) {
            return str;
        }
        String str4 = DSW.get(str2);
        if (TextUtils.isEmpty(str4)) {
            return str;
        }
        String m10 = a.m(str3, "://", str2);
        return str.startsWith(m10) ? str.replaceFirst(m10, a.m(str3, "://", str4)) : str;
    }

    public vc(int i10) {
        this.qO = i10;
    }

    public synchronized void YFl(GA ga2, EH eh2) {
        URL url;
        if (ga2 == null || eh2 == null) {
            return;
        }
        if (this.lG) {
            if (com.bytedance.sdk.component.DSW.AlY.wN.YFl(this.DSW)) {
                try {
                    url = ga2.Sg().YFl();
                } catch (Exception unused) {
                    url = null;
                }
                if (url == null) {
                    return;
                }
                String protocol = url.getProtocol();
                String host = url.getHost();
                String path = url.getPath();
                String YFl = YFl(ga2);
                int tN = eh2.tN();
                if ("http".equals(protocol) || Constants.SCHEME.equals(protocol)) {
                    if (TextUtils.isEmpty(YFl)) {
                        return;
                    }
                    AlY vc2 = vc();
                    if (vc2 != null && vc2.Sg) {
                        YFl(eh2, host);
                    }
                    if (vc2 == null) {
                        return;
                    }
                    this.YoT.size();
                    this.GA.size();
                    this.EH.size();
                    this.rkt.size();
                    if (tN > 0) {
                        if (YFl(tN)) {
                            if (this.eT > 0 || this.pDU > 0) {
                                nc();
                            }
                            tN(host);
                            return;
                        }
                        if (!Sg(tN)) {
                            this.pDU++;
                            this.EH.put(path, 0);
                            this.rkt.put(YFl, 0);
                            if (this.pDU >= vc2.qsH && this.EH.size() >= vc2.NjR && this.rkt.size() >= vc2.f10314nc) {
                                YFl(false, 0L);
                                nc();
                            }
                            Sg(host);
                        }
                    }
                }
            }
        }
    }

    private String YFl(GA ga2) {
        if (ga2 == null || ga2.Sg() == null) {
            return "";
        }
        if (ga2.Sg().YFl() != null) {
            try {
            } catch (Exception unused) {
                return "";
            }
        }
        return InetAddress.getByName(ga2.Sg().YFl().getHost()).getHostAddress();
    }

    public synchronized void YFl(GA ga2, Exception exc) {
        URL url;
        if (ga2 != null) {
            if (ga2.Sg() != null && exc != null) {
                if (this.lG) {
                    if (com.bytedance.sdk.component.DSW.AlY.wN.YFl(this.DSW)) {
                        try {
                            url = ga2.Sg().YFl();
                        } catch (Exception unused) {
                            url = null;
                        }
                        if (url == null) {
                            return;
                        }
                        String protocol = url.getProtocol();
                        String host = url.getHost();
                        String path = url.getPath();
                        String YFl = YFl(ga2);
                        if ("http".equals(protocol) || Constants.SCHEME.equals(protocol)) {
                            AlY vc2 = vc();
                            if (vc2 == null) {
                                return;
                            }
                            this.YoT.size();
                            this.GA.size();
                            this.EH.size();
                            this.rkt.size();
                            this.eT++;
                            this.YoT.put(path, 0);
                            this.GA.put(YFl, 0);
                            if (this.eT >= vc2.wN && this.YoT.size() >= vc2.f10315vc && this.GA.size() >= vc2.DSW) {
                                YFl(false, 0L);
                                nc();
                            }
                            Sg(host);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void YFl(com.bytedance.sdk.component.Sg.YFl.EH r9, java.lang.String r10) {
        /*
            r8 = this;
            if (r9 != 0) goto L3
            return
        L3:
            boolean r10 = r8.lG
            if (r10 != 0) goto L8
            return
        L8:
            java.lang.String r10 = "tnc-cmd"
            r0 = 0
            java.lang.String r9 = r9.YFl(r10, r0)
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 == 0) goto L16
            return
        L16:
            java.lang.String r10 = "@"
            java.lang.String[] r9 = r9.split(r10)
            if (r9 == 0) goto L83
            int r10 = r9.length
            r0 = 2
            if (r10 == r0) goto L23
            goto L83
        L23:
            r10 = 1
            r0 = 0
            r2 = 0
            r3 = r9[r2]     // Catch: java.lang.Throwable -> L34
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Throwable -> L34
            r9 = r9[r10]     // Catch: java.lang.Throwable -> L35
            long r4 = java.lang.Long.parseLong(r9)     // Catch: java.lang.Throwable -> L35
            goto L36
        L34:
            r3 = r2
        L35:
            r4 = r0
        L36:
            long r6 = r8.f10318nc
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 > 0) goto L3d
            return
        L3d:
            r8.NjR = r3
            r8.f10318nc = r4
            android.content.Context r9 = r8.DSW
            java.lang.String r6 = r8.YFl()
            android.content.SharedPreferences r9 = r9.getSharedPreferences(r6, r2)
            android.content.SharedPreferences$Editor r9 = r9.edit()
            java.lang.String r2 = "tnc_probe_cmd"
            android.content.SharedPreferences$Editor r9 = r9.putInt(r2, r3)
            java.lang.String r2 = "tnc_probe_version"
            android.content.SharedPreferences$Editor r9 = r9.putLong(r2, r4)
            r9.apply()
            int r9 = r8.NjR
            r2 = 10000(0x2710, float:1.4013E-41)
            if (r9 != r2) goto L83
            com.bytedance.sdk.component.DSW.tN.AlY r9 = r8.vc()
            if (r9 != 0) goto L6b
            return
        L6b:
            java.util.Random r2 = new java.util.Random
            long r3 = java.lang.System.currentTimeMillis()
            r2.<init>(r3)
            int r9 = r9.YoT
            if (r9 <= 0) goto L80
            int r9 = r2.nextInt(r9)
            long r0 = (long) r9
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
        L80:
            r8.YFl(r10, r0)
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.DSW.tN.vc.YFl(com.bytedance.sdk.component.Sg.YFl.EH, java.lang.String):void");
    }

    private void YFl(boolean z10, long j3) {
        if (this.YFl.hasMessages(10000)) {
            return;
        }
        Message obtainMessage = this.YFl.obtainMessage();
        obtainMessage.what = 10000;
        obtainMessage.arg1 = z10 ? 1 : 0;
        if (j3 > 0) {
            this.YFl.sendMessageDelayed(obtainMessage, j3);
        } else {
            this.YFl.sendMessage(obtainMessage);
        }
    }
}
