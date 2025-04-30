package com.bytedance.sdk.component.QR.KS;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Address;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.component.QR.zp;
import com.bytedance.sdk.component.utils.RCv;
import com.bytedance.sdk.component.utils.vwr;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class zp implements RCv.zp {
    private static KS YW;
    private static ThreadPoolExecutor dT;
    private static boolean ku;
    private int dQp;
    private final boolean lMd;
    private com.bytedance.sdk.component.QR.zp rV;
    private final Context vDp;
    private volatile boolean KS = false;
    private boolean jU = true;
    private boolean COT = false;
    private long HWF = 0;
    private long QR = 0;
    private AtomicBoolean Bj = new AtomicBoolean(false);
    private volatile boolean tG = false;
    final RCv zp = com.bytedance.sdk.component.ku.zp.zp.zp().zp(this, "tt-net");

    public zp(Context context, int i9) {
        this.vDp = context;
        this.lMd = vwr.zp(context);
        this.dQp = i9;
    }

    public static ExecutorService QR() {
        ExecutorService executorService;
        KS ks = YW;
        if (ks != null) {
            executorService = ks.getThreadPool();
        } else {
            executorService = null;
        }
        if (executorService != null) {
            return executorService;
        }
        if (dT == null) {
            synchronized (zp.class) {
                try {
                    if (dT == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                        dT = threadPoolExecutor;
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return dT;
    }

    private com.bytedance.sdk.component.QR.zp YW() {
        if (this.rV == null) {
            zp.C0077zp c0077zp = new zp.C0077zp();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.rV = c0077zp.zp(10L, timeUnit).lMd(10L, timeUnit).KS(10L, timeUnit).zp();
        }
        return this.rV;
    }

    private void jU(boolean z8) {
        if (this.COT) {
            return;
        }
        if (this.jU) {
            this.jU = false;
            this.HWF = 0L;
            this.QR = 0L;
        }
        long j7 = z8 ? 360000L : 43200000L;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.HWF > j7) {
            if (currentTimeMillis - this.QR > 120000 || !this.tG) {
                KS();
            }
        }
    }

    private boolean ku() {
        String[] HWF = HWF();
        if (HWF != null && HWF.length != 0) {
            zp(0);
        }
        return false;
    }

    public void COT() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        try {
            if (this.lMd) {
                jU();
            } else {
                lMd();
            }
        } catch (Throwable unused) {
        }
    }

    public String[] HWF() {
        String[] strArr;
        if (ku.zp().zp(this.dQp).jU() != null) {
            strArr = ku.zp().zp(this.dQp).jU().HWF();
        } else {
            strArr = null;
        }
        if (strArr == null || strArr.length <= 0) {
            return new String[0];
        }
        return strArr;
    }

    public boolean KS() {
        this.Bj.get();
        QR().execute(new Runnable() { // from class: com.bytedance.sdk.component.QR.KS.zp.2
            @Override // java.lang.Runnable
            public void run() {
                boolean zp = com.bytedance.sdk.component.QR.jU.COT.zp(zp.this.vDp);
                if (zp) {
                    zp.this.QR = System.currentTimeMillis();
                    if (!zp.this.Bj.compareAndSet(false, true)) {
                        return;
                    }
                    zp.this.KS(zp);
                }
            }
        });
        return true;
    }

    public static void lMd(boolean z8) {
        ku = z8;
    }

    public void KS(boolean z8) {
        jU();
        this.COT = true;
        if (!z8) {
            this.zp.sendEmptyMessage(102);
            return;
        }
        try {
            ku();
        } catch (Exception unused) {
            this.Bj.set(false);
        }
    }

    public synchronized void lMd() {
        if (System.currentTimeMillis() - this.HWF > 3600000) {
            this.HWF = System.currentTimeMillis();
            try {
                if (ku.zp().zp(this.dQp).ku() != null) {
                    ku.zp().zp(this.dQp).ku().lMd();
                }
            } catch (Exception unused) {
            }
        }
    }

    public void zp() {
        zp(false);
    }

    public synchronized void zp(boolean z8) {
        if (this.lMd) {
            jU(z8);
            return;
        }
        if (this.HWF <= 0) {
            try {
                QR().execute(new Runnable() { // from class: com.bytedance.sdk.component.QR.KS.zp.1
                    @Override // java.lang.Runnable
                    public void run() {
                        zp.this.lMd();
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    public synchronized void jU() {
        if (this.tG) {
            return;
        }
        this.tG = true;
        long j7 = this.vDp.getSharedPreferences("ss_app_config", 0).getLong("last_refresh_time", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        if (j7 > currentTimeMillis) {
            j7 = currentTimeMillis;
        }
        this.HWF = j7;
        try {
            if (ku.zp().zp(this.dQp).ku() != null) {
                ku.zp().zp(this.dQp).ku().zp();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lMd(int i9) {
        RCv rCv = this.zp;
        if (rCv != null) {
            rCv.sendEmptyMessage(i9);
        }
    }

    @Override // com.bytedance.sdk.component.utils.RCv.zp
    public void zp(Message message) {
        int i9 = message.what;
        if (i9 == 101) {
            this.COT = false;
            this.HWF = System.currentTimeMillis();
            if (this.jU) {
                zp();
            }
            this.Bj.set(false);
            return;
        }
        if (i9 != 102) {
            return;
        }
        this.COT = false;
        if (this.jU) {
            zp();
        }
        this.Bj.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean zp(Object obj) throws Exception {
        JSONObject jSONObject;
        if (obj instanceof String) {
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            jSONObject = new JSONObject(str);
            if (!"success".equals(jSONObject.getString("message"))) {
                return false;
            }
        } else {
            jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
        }
        if (jSONObject == null) {
            return false;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
        synchronized (this) {
            SharedPreferences.Editor edit = this.vDp.getSharedPreferences("ss_app_config", 0).edit();
            edit.putLong("last_refresh_time", System.currentTimeMillis());
            edit.apply();
        }
        if (ku.zp().zp(this.dQp).ku() == null) {
            return true;
        }
        ku.zp().zp(this.dQp).ku().zp(jSONObject2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(final int i9) {
        String[] HWF = HWF();
        if (HWF != null && HWF.length > i9) {
            String str = HWF[i9];
            if (TextUtils.isEmpty(str)) {
                lMd(102);
                return;
            }
            try {
                String zp = zp(str);
                if (TextUtils.isEmpty(zp)) {
                    lMd(102);
                    return;
                }
                com.bytedance.sdk.component.QR.lMd.lMd KS = YW().KS();
                KS.lMd(zp);
                zp(KS);
                KS.zp(new com.bytedance.sdk.component.QR.zp.zp() { // from class: com.bytedance.sdk.component.QR.KS.zp.3
                    @Override // com.bytedance.sdk.component.QR.zp.zp
                    public void zp(com.bytedance.sdk.component.QR.lMd.KS ks, com.bytedance.sdk.component.QR.lMd lmd) {
                        JSONObject jSONObject;
                        if (lmd != null && lmd.HWF()) {
                            String str2 = null;
                            try {
                                jSONObject = new JSONObject(lmd.jU());
                            } catch (Exception unused) {
                                jSONObject = null;
                            }
                            if (jSONObject == null) {
                                zp.this.zp(i9 + 1);
                                return;
                            }
                            try {
                                str2 = jSONObject.getString("message");
                            } catch (Exception unused2) {
                            }
                            if (!"success".equals(str2)) {
                                zp.this.zp(i9 + 1);
                                return;
                            }
                            try {
                                if (zp.this.zp(jSONObject)) {
                                    zp.this.lMd(101);
                                    return;
                                } else {
                                    zp.this.zp(i9 + 1);
                                    return;
                                }
                            } catch (Exception unused3) {
                                return;
                            }
                        }
                        zp.this.zp(i9 + 1);
                    }

                    @Override // com.bytedance.sdk.component.QR.zp.zp
                    public void zp(com.bytedance.sdk.component.QR.lMd.KS ks, IOException iOException) {
                        zp.this.zp(i9 + 1);
                    }
                });
                return;
            } catch (Throwable th) {
                th.toString();
                return;
            }
        }
        lMd(102);
    }

    private String zp(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return AbstractC2914a.e("https://", str, "/get_domains/v4/");
    }

    private void zp(com.bytedance.sdk.component.QR.lMd.lMd lmd) {
        if (lmd == null) {
            return;
        }
        Address zp = ku.zp().zp(this.dQp).jU() != null ? ku.zp().zp(this.dQp).jU().zp(this.vDp) : null;
        if (zp != null && zp.hasLatitude() && zp.hasLongitude()) {
            StringBuilder sb = new StringBuilder();
            sb.append(zp.getLatitude());
            lmd.zp("latitude", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(zp.getLongitude());
            lmd.zp("longitude", sb2.toString());
            String locality = zp.getLocality();
            if (!TextUtils.isEmpty(locality)) {
                lmd.zp("city", Uri.encode(locality));
            }
        }
        if (this.KS) {
            lmd.zp("force", "1");
        }
        try {
            lmd.zp("abi", Build.SUPPORTED_ABIS[0]);
        } catch (Throwable unused) {
        }
        if (ku.zp().zp(this.dQp).jU() != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(ku.zp().zp(this.dQp).jU().zp());
            lmd.zp("aid", sb3.toString());
            lmd.zp("device_platform", ku.zp().zp(this.dQp).jU().KS());
            lmd.zp("channel", ku.zp().zp(this.dQp).jU().lMd());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(ku.zp().zp(this.dQp).jU().jU());
            lmd.zp("version_code", sb4.toString());
            lmd.zp("custom_info_1", ku.zp().zp(this.dQp).jU().COT());
        }
    }

    public static void zp(KS ks) {
        YW = ks;
    }
}
