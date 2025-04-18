package com.bytedance.sdk.component.DSW.tN;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Address;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.applovin.impl.mediation.ads.e;
import com.bytedance.sdk.component.DSW.YFl;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.bZ;
import com.bytedance.sdk.component.utils.lG;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class YFl implements bZ.YFl {
    private static tN NjR;

    /* renamed from: nc, reason: collision with root package name */
    private static ThreadPoolExecutor f10316nc;
    private static boolean qsH;
    private int EH;
    private final boolean Sg;
    private final Context YoT;
    private com.bytedance.sdk.component.DSW.YFl pDU;
    private volatile boolean tN = false;
    private boolean AlY = true;
    private boolean wN = false;

    /* renamed from: vc, reason: collision with root package name */
    private long f10317vc = 0;
    private long DSW = 0;
    private AtomicBoolean eT = new AtomicBoolean(false);
    private volatile boolean GA = false;
    final bZ YFl = com.bytedance.sdk.component.qsH.YFl.YFl.YFl().YFl(this, "tt-net");

    public YFl(Context context, int i10) {
        this.YoT = context;
        this.Sg = lG.YFl(context);
        this.EH = i10;
    }

    private void AlY(boolean z10) {
        if (this.wN) {
            return;
        }
        if (this.AlY) {
            this.AlY = false;
            this.f10317vc = 0L;
            this.DSW = 0L;
        }
        long j3 = z10 ? 360000L : 43200000L;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f10317vc > j3) {
            if (currentTimeMillis - this.DSW > 120000 || !this.GA) {
                tN();
            }
        }
    }

    public static ExecutorService DSW() {
        ExecutorService executorService;
        tN tNVar = NjR;
        if (tNVar != null) {
            executorService = tNVar.getThreadPool();
        } else {
            executorService = null;
        }
        if (executorService != null) {
            return executorService;
        }
        if (f10316nc == null) {
            synchronized (YFl.class) {
                if (f10316nc == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                    f10316nc = threadPoolExecutor;
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f10316nc;
    }

    private com.bytedance.sdk.component.DSW.YFl NjR() {
        if (this.pDU == null) {
            YFl.C0075YFl c0075YFl = new YFl.C0075YFl();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.pDU = c0075YFl.YFl(10L, timeUnit).Sg(10L, timeUnit).tN(10L, timeUnit).YFl();
        }
        return this.pDU;
    }

    private boolean qsH() {
        String[] vc2 = vc();
        if (vc2 != null && vc2.length != 0) {
            YFl(0);
        }
        return false;
    }

    public boolean tN() {
        this.eT.get();
        DSW().execute(new Runnable() { // from class: com.bytedance.sdk.component.DSW.tN.YFl.2
            @Override // java.lang.Runnable
            public void run() {
                boolean YFl = com.bytedance.sdk.component.DSW.AlY.wN.YFl(YFl.this.YoT);
                if (YFl) {
                    YFl.this.DSW = System.currentTimeMillis();
                    if (!YFl.this.eT.compareAndSet(false, true)) {
                        return;
                    }
                    YFl.this.tN(YFl);
                }
            }
        });
        return true;
    }

    public String[] vc() {
        String[] strArr;
        if (qsH.YFl().YFl(this.EH).AlY() != null) {
            strArr = qsH.YFl().YFl(this.EH).AlY().vc();
        } else {
            strArr = null;
        }
        if (strArr == null || strArr.length <= 0) {
            return new String[0];
        }
        return strArr;
    }

    public void wN() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        try {
            if (this.Sg) {
                AlY();
            } else {
                Sg();
            }
        } catch (Throwable unused) {
        }
    }

    public static void Sg(boolean z10) {
        qsH = z10;
    }

    public void tN(boolean z10) {
        AlY();
        this.wN = true;
        if (!z10) {
            this.YFl.sendEmptyMessage(102);
            return;
        }
        try {
            qsH();
        } catch (Exception unused) {
            this.eT.set(false);
        }
    }

    public synchronized void Sg() {
        if (System.currentTimeMillis() - this.f10317vc > 3600000) {
            this.f10317vc = System.currentTimeMillis();
            try {
                if (qsH.YFl().YFl(this.EH).qsH() != null) {
                    qsH.YFl().YFl(this.EH).qsH().Sg();
                }
            } catch (Exception unused) {
            }
        }
    }

    public void YFl() {
        YFl(false);
    }

    public synchronized void YFl(boolean z10) {
        if (this.Sg) {
            AlY(z10);
            return;
        }
        if (this.f10317vc <= 0) {
            try {
                DSW().execute(new Runnable() { // from class: com.bytedance.sdk.component.DSW.tN.YFl.1
                    @Override // java.lang.Runnable
                    public void run() {
                        YFl.this.Sg();
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    public synchronized void AlY() {
        if (this.GA) {
            return;
        }
        this.GA = true;
        long j3 = this.YoT.getSharedPreferences("ss_app_config", 0).getLong("last_refresh_time", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        if (j3 > currentTimeMillis) {
            j3 = currentTimeMillis;
        }
        this.f10317vc = j3;
        try {
            if (qsH.YFl().YFl(this.EH).qsH() != null) {
                qsH.YFl().YFl(this.EH).qsH().YFl();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sg(int i10) {
        bZ bZVar = this.YFl;
        if (bZVar != null) {
            bZVar.sendEmptyMessage(i10);
        }
    }

    @Override // com.bytedance.sdk.component.utils.bZ.YFl
    public void YFl(Message message) {
        int i10 = message.what;
        if (i10 == 101) {
            this.wN = false;
            this.f10317vc = System.currentTimeMillis();
            if (this.AlY) {
                YFl();
            }
            this.eT.set(false);
            return;
        }
        if (i10 != 102) {
            return;
        }
        this.wN = false;
        if (this.AlY) {
            YFl();
        }
        this.eT.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean YFl(Object obj) throws Exception {
        JSONObject jSONObject;
        if (obj instanceof String) {
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            jSONObject = new JSONObject(str);
            if (!"success".equals(jSONObject.getString(PglCryptUtils.KEY_MESSAGE))) {
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
            SharedPreferences.Editor edit = this.YoT.getSharedPreferences("ss_app_config", 0).edit();
            edit.putLong("last_refresh_time", System.currentTimeMillis());
            edit.apply();
        }
        if (qsH.YFl().YFl(this.EH).qsH() == null) {
            return true;
        }
        qsH.YFl().YFl(this.EH).qsH().YFl(jSONObject2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(final int i10) {
        String[] vc2 = vc();
        if (vc2 != null && vc2.length > i10) {
            String str = vc2[i10];
            if (TextUtils.isEmpty(str)) {
                Sg(102);
                return;
            }
            try {
                String YFl = YFl(str);
                if (TextUtils.isEmpty(YFl)) {
                    Sg(102);
                    return;
                }
                com.bytedance.sdk.component.DSW.Sg.Sg tN = NjR().tN();
                tN.Sg(YFl);
                YFl(tN);
                tN.YFl(new com.bytedance.sdk.component.DSW.YFl.YFl() { // from class: com.bytedance.sdk.component.DSW.tN.YFl.3
                    @Override // com.bytedance.sdk.component.DSW.YFl.YFl
                    public void YFl(com.bytedance.sdk.component.DSW.Sg.tN tNVar, com.bytedance.sdk.component.DSW.Sg sg2) {
                        JSONObject jSONObject;
                        if (sg2 != null && sg2.vc()) {
                            String str2 = null;
                            try {
                                jSONObject = new JSONObject(sg2.AlY());
                            } catch (Exception unused) {
                                jSONObject = null;
                            }
                            if (jSONObject == null) {
                                YFl.this.YFl(i10 + 1);
                                return;
                            }
                            try {
                                str2 = jSONObject.getString(PglCryptUtils.KEY_MESSAGE);
                            } catch (Exception unused2) {
                            }
                            if (!"success".equals(str2)) {
                                YFl.this.YFl(i10 + 1);
                                return;
                            }
                            try {
                                if (YFl.this.YFl(jSONObject)) {
                                    YFl.this.Sg(101);
                                    return;
                                } else {
                                    YFl.this.YFl(i10 + 1);
                                    return;
                                }
                            } catch (Exception unused3) {
                                return;
                            }
                        }
                        YFl.this.YFl(i10 + 1);
                    }

                    @Override // com.bytedance.sdk.component.DSW.YFl.YFl
                    public void YFl(com.bytedance.sdk.component.DSW.Sg.tN tNVar, IOException iOException) {
                        YFl.this.YFl(i10 + 1);
                    }
                });
                return;
            } catch (Throwable th2) {
                th2.toString();
                return;
            }
        }
        Sg(102);
    }

    private String YFl(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return e.f("https://", str, "/get_domains/v4/");
    }

    private void YFl(com.bytedance.sdk.component.DSW.Sg.Sg sg2) {
        if (sg2 == null) {
            return;
        }
        Address YFl = qsH.YFl().YFl(this.EH).AlY() != null ? qsH.YFl().YFl(this.EH).AlY().YFl(this.YoT) : null;
        if (YFl != null && YFl.hasLatitude() && YFl.hasLongitude()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(YFl.getLatitude());
            sg2.YFl("latitude", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(YFl.getLongitude());
            sg2.YFl("longitude", sb3.toString());
            String locality = YFl.getLocality();
            if (!TextUtils.isEmpty(locality)) {
                sg2.YFl("city", Uri.encode(locality));
            }
        }
        if (this.tN) {
            sg2.YFl("force", "1");
        }
        try {
            sg2.YFl("abi", Build.SUPPORTED_ABIS[0]);
        } catch (Throwable unused) {
        }
        if (qsH.YFl().YFl(this.EH).AlY() != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(qsH.YFl().YFl(this.EH).AlY().YFl());
            sg2.YFl("aid", sb4.toString());
            sg2.YFl("device_platform", qsH.YFl().YFl(this.EH).AlY().tN());
            sg2.YFl("channel", qsH.YFl().YFl(this.EH).AlY().Sg());
            StringBuilder sb5 = new StringBuilder();
            sb5.append(qsH.YFl().YFl(this.EH).AlY().AlY());
            sg2.YFl("version_code", sb5.toString());
            sg2.YFl("custom_info_1", qsH.YFl().YFl(this.EH).AlY().wN());
        }
    }

    public static void YFl(tN tNVar) {
        NjR = tNVar;
    }
}
