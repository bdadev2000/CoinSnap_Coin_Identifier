package com.bytedance.sdk.component.QR.KS;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.lMd.zp.dQp;
import com.bytedance.sdk.component.lMd.zp.tG;
import com.mbridge.msdk.foundation.entity.o;
import java.net.InetAddress;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class HWF {
    private lMd COT;
    private zp KS;
    private Context QR;
    private boolean jU;
    private COT ku;
    private int pvr;
    private long lMd = 0;
    private boolean HWF = false;
    private int YW = 0;
    private long dT = 19700101000L;
    private int Bj = 0;
    private HashMap<String, Integer> vDp = new HashMap<>();
    private HashMap<String, Integer> tG = new HashMap<>();
    private int rV = 0;
    private HashMap<String, Integer> dQp = new HashMap<>();
    private HashMap<String, Integer> KVG = new HashMap<>();
    private boolean woN = true;
    private Map<String, Integer> vwr = new HashMap();
    Handler zp = new Handler(Looper.getMainLooper()) { // from class: com.bytedance.sdk.component.QR.KS.HWF.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean z8;
            if (message.what == 10000) {
                if (message.arg1 == 0) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                HWF.this.lMd(z8);
            }
        }
    };

    private HWF() {
    }

    private void YW() {
        SharedPreferences sharedPreferences = this.QR.getSharedPreferences(zp(), 0);
        this.YW = sharedPreferences.getInt("tnc_probe_cmd", 0);
        this.dT = sharedPreferences.getLong("tnc_probe_version", 19700101000L);
    }

    private void dT() {
        this.Bj = 0;
        this.vDp.clear();
        this.tG.clear();
        this.rV = 0;
        this.dQp.clear();
        this.KVG.clear();
    }

    private boolean zp(int i9) {
        return i9 >= 200 && i9 < 400;
    }

    public void COT() {
        this.vwr.clear();
    }

    public jU HWF() {
        COT cot = this.ku;
        if (cot != null) {
            return cot.KS();
        }
        return null;
    }

    public boolean KS() {
        return this.jU;
    }

    public Map<String, String> QR() {
        jU HWF = HWF();
        if (HWF != null) {
            return HWF.jU;
        }
        return null;
    }

    public lMd jU() {
        return this.COT;
    }

    public COT ku() {
        return this.ku;
    }

    public zp lMd() {
        return this.KS;
    }

    private void KS(String str) {
        if (!TextUtils.isEmpty(str) && this.vwr.containsKey(str)) {
            this.vwr.put(str, 0);
        }
    }

    private boolean jU(String str) {
        Map<String, String> QR = QR();
        if (QR == null) {
            return false;
        }
        String str2 = QR.get(str);
        return (TextUtils.isEmpty(str2) || this.vwr.get(str2) == null || this.vwr.get(str2).intValue() < 3) ? false : true;
    }

    private void lMd(String str) {
        Map<String, String> QR;
        if (TextUtils.isEmpty(str) || (QR = QR()) == null || !QR.containsValue(str)) {
            return;
        }
        if (this.vwr.get(str) == null) {
            this.vwr.put(str, 1);
        } else {
            this.vwr.put(str, Integer.valueOf(this.vwr.get(str).intValue() + 1));
        }
    }

    public String zp() {
        return "ttnet_tnc_config" + this.pvr;
    }

    public void zp(boolean z8) {
        this.jU = z8;
    }

    public void zp(lMd lmd) {
        this.COT = lmd;
    }

    public synchronized void zp(Context context, boolean z8) {
        try {
            if (!this.HWF) {
                this.QR = context;
                this.woN = z8;
                this.ku = new COT(context, z8, this.pvr);
                if (z8) {
                    YW();
                }
                this.KS = ku.zp().zp(this.pvr, this.QR);
                this.HWF = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lMd(boolean z8) {
        if (HWF() == null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!z8) {
            if ((r0.Bj * 1000) + this.lMd > elapsedRealtime) {
                return;
            }
        }
        this.lMd = elapsedRealtime;
        ku.zp().zp(this.pvr, this.QR).KS();
    }

    private boolean lMd(int i9) {
        if (i9 < 100 || i9 >= 1000) {
            return true;
        }
        jU HWF = HWF();
        return (HWF == null || TextUtils.isEmpty(HWF.tG) || !HWF.tG.contains(String.valueOf(i9))) ? false : true;
    }

    public String zp(String str) {
        String str2;
        Map<String, String> QR;
        if (TextUtils.isEmpty(str) || str.contains("/network/get_network") || str.contains("/get_domains/v4") || str.contains("/ies/speed")) {
            return str;
        }
        String str3 = null;
        try {
            URL url = new URL(str);
            str2 = url.getProtocol();
            try {
                str3 = url.getHost();
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        if ((!"http".equals(str2) && !Constants.SCHEME.equals(str2)) || TextUtils.isEmpty(str3) || jU(str3) || (QR = QR()) == null || !QR.containsKey(str3)) {
            return str;
        }
        String str4 = QR.get(str3);
        if (TextUtils.isEmpty(str4)) {
            return str;
        }
        String k6 = o.k(str2, "://", str3);
        return str.startsWith(k6) ? str.replaceFirst(k6, o.k(str2, "://", str4)) : str;
    }

    public HWF(int i9) {
        this.pvr = i9;
    }

    public synchronized void zp(tG tGVar, dQp dqp) {
        URL url;
        if (tGVar == null || dqp == null) {
            return;
        }
        if (this.woN) {
            if (com.bytedance.sdk.component.QR.jU.COT.zp(this.QR)) {
                try {
                    url = tGVar.lMd().zp();
                } catch (Exception unused) {
                    url = null;
                }
                if (url == null) {
                    return;
                }
                String protocol = url.getProtocol();
                String host = url.getHost();
                String path = url.getPath();
                String zp = zp(tGVar);
                int KS = dqp.KS();
                if ("http".equals(protocol) || Constants.SCHEME.equals(protocol)) {
                    if (TextUtils.isEmpty(zp)) {
                        return;
                    }
                    jU HWF = HWF();
                    if (HWF != null && HWF.lMd) {
                        zp(dqp, host);
                    }
                    if (HWF == null) {
                        return;
                    }
                    this.vDp.size();
                    this.tG.size();
                    this.dQp.size();
                    this.KVG.size();
                    if (KS > 0) {
                        if (zp(KS)) {
                            if (this.Bj > 0 || this.rV > 0) {
                                dT();
                            }
                            KS(host);
                            return;
                        }
                        if (!lMd(KS)) {
                            this.rV++;
                            this.dQp.put(path, 0);
                            this.KVG.put(zp, 0);
                            if (this.rV >= HWF.ku && this.dQp.size() >= HWF.YW && this.KVG.size() >= HWF.dT) {
                                zp(false, 0L);
                                dT();
                            }
                            lMd(host);
                        }
                    }
                }
            }
        }
    }

    private String zp(tG tGVar) {
        if (tGVar == null || tGVar.lMd() == null) {
            return "";
        }
        if (tGVar.lMd().zp() != null) {
            try {
            } catch (Exception unused) {
                return "";
            }
        }
        return InetAddress.getByName(tGVar.lMd().zp().getHost()).getHostAddress();
    }

    public synchronized void zp(tG tGVar, Exception exc) {
        URL url;
        if (tGVar != null) {
            if (tGVar.lMd() != null && exc != null) {
                if (this.woN) {
                    if (com.bytedance.sdk.component.QR.jU.COT.zp(this.QR)) {
                        try {
                            url = tGVar.lMd().zp();
                        } catch (Exception unused) {
                            url = null;
                        }
                        if (url == null) {
                            return;
                        }
                        String protocol = url.getProtocol();
                        String host = url.getHost();
                        String path = url.getPath();
                        String zp = zp(tGVar);
                        if ("http".equals(protocol) || Constants.SCHEME.equals(protocol)) {
                            jU HWF = HWF();
                            if (HWF == null) {
                                return;
                            }
                            this.vDp.size();
                            this.tG.size();
                            this.dQp.size();
                            this.KVG.size();
                            this.Bj++;
                            this.vDp.put(path, 0);
                            this.tG.put(zp, 0);
                            if (this.Bj >= HWF.COT && this.vDp.size() >= HWF.HWF && this.tG.size() >= HWF.QR) {
                                zp(false, 0L);
                                dT();
                            }
                            lMd(host);
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
    private void zp(com.bytedance.sdk.component.lMd.zp.dQp r9, java.lang.String r10) {
        /*
            r8 = this;
            if (r9 != 0) goto L3
            return
        L3:
            boolean r10 = r8.woN
            if (r10 != 0) goto L8
            return
        L8:
            java.lang.String r10 = "tnc-cmd"
            r0 = 0
            java.lang.String r9 = r9.zp(r10, r0)
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
            long r6 = r8.dT
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 > 0) goto L3d
            return
        L3d:
            r8.YW = r3
            r8.dT = r4
            android.content.Context r9 = r8.QR
            java.lang.String r6 = r8.zp()
            android.content.SharedPreferences r9 = r9.getSharedPreferences(r6, r2)
            android.content.SharedPreferences$Editor r9 = r9.edit()
            java.lang.String r2 = "tnc_probe_cmd"
            android.content.SharedPreferences$Editor r9 = r9.putInt(r2, r3)
            java.lang.String r2 = "tnc_probe_version"
            android.content.SharedPreferences$Editor r9 = r9.putLong(r2, r4)
            r9.apply()
            int r9 = r8.YW
            r2 = 10000(0x2710, float:1.4013E-41)
            if (r9 != r2) goto L83
            com.bytedance.sdk.component.QR.KS.jU r9 = r8.HWF()
            if (r9 != 0) goto L6b
            return
        L6b:
            java.util.Random r2 = new java.util.Random
            long r3 = java.lang.System.currentTimeMillis()
            r2.<init>(r3)
            int r9 = r9.vDp
            if (r9 <= 0) goto L80
            int r9 = r2.nextInt(r9)
            long r0 = (long) r9
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
        L80:
            r8.zp(r10, r0)
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.QR.KS.HWF.zp(com.bytedance.sdk.component.lMd.zp.dQp, java.lang.String):void");
    }

    private void zp(boolean z8, long j7) {
        if (this.zp.hasMessages(10000)) {
            return;
        }
        Message obtainMessage = this.zp.obtainMessage();
        obtainMessage.what = 10000;
        obtainMessage.arg1 = z8 ? 1 : 0;
        if (j7 > 0) {
            this.zp.sendMessageDelayed(obtainMessage, j7);
        } else {
            this.zp.sendMessage(obtainMessage);
        }
    }
}
