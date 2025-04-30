package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.bannerexpress.zp;
import com.bytedance.sdk.openadsdk.dislike.TTDislikeListView;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.bytedance.sdk.openadsdk.utils.YhE;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ku {
    public static final Set<String> lMd = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.ku.1
        {
            add("8025677");
            add("5001121");
        }
    };
    private static boolean woN = false;
    public static vDp zp;
    private boolean Bj;

    @NonNull
    private String COT;
    private com.bytedance.sdk.openadsdk.core.video.lMd.KS FP;
    private int HWF;
    private boolean KS;
    private Integer KVG;
    private boolean QR;

    @Nullable
    private String YW;
    private String cz;
    private Integer dQp;
    private int dT;

    @NonNull
    private String jU;

    @Nullable
    private String ku;
    private volatile ConcurrentHashMap<String, zp.InterfaceC0106zp> ot;
    private boolean pvr;
    private Integer rV;
    private Bitmap tG;
    private boolean vDp;
    private int vwr;

    /* loaded from: classes.dex */
    public static class zp {
        private static final ku zp = new ku();
    }

    public static boolean ot() {
        return woN;
    }

    public static void yRU() {
        if (Build.VERSION.SDK_INT == 26 && "MI 6".equals(Build.MODEL)) {
            woN = true;
        }
    }

    @Nullable
    public String Bj() {
        if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            return com.bytedance.sdk.openadsdk.multipro.jU.jU.lMd("sp_global_file", "keywords", null);
        }
        return this.ku;
    }

    @NonNull
    public String COT() {
        if (TextUtils.isEmpty(this.COT)) {
            this.COT = zp(KVG.zp());
        }
        return this.COT;
    }

    public void FP() {
        try {
            if (this.ot != null && this.ot.size() == 0) {
                this.ot = null;
            }
        } catch (NullPointerException e4) {
            e4.getMessage();
        }
    }

    public int HWF() {
        if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            return com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("sp_global_icon_id", "icon_id", 0);
        }
        return this.HWF;
    }

    public Bitmap KVG() {
        if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            return com.bytedance.sdk.component.utils.jU.zp(com.bytedance.sdk.openadsdk.multipro.jU.jU.lMd("sp_global_file", "pause_icon", null));
        }
        return this.tG;
    }

    public int QR() {
        Integer num = this.rV;
        if (num != null) {
            return num.intValue();
        }
        return com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("sp_global_privacy", "sdk_coppa", -1);
    }

    public int YW() {
        int zp2 = com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("sp_global_privacy", "global_coppa", -99);
        this.vwr = zp2;
        if (zp2 == -99) {
            this.vwr = QR();
        }
        return this.vwr;
    }

    public int cz() {
        Integer num = this.KVG;
        if (num != null) {
            return num.intValue();
        }
        return com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("sp_global_privacy", "global_ccpa", -1);
    }

    public boolean dQp() {
        return true;
    }

    public boolean dT() {
        if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            return com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("sp_global_file", "is_paid", false);
        }
        return this.QR;
    }

    @Nullable
    public String jU() {
        if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            return zp(MBridgeConstans.APP_ID, Long.MAX_VALUE);
        }
        return this.jU;
    }

    public int ku() {
        Integer num = this.dQp;
        if (num != null) {
            return num.intValue();
        }
        return com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("sp_global_privacy", "tt_gdpr", -1);
    }

    public String pvr() {
        if (!TextUtils.isEmpty(this.cz)) {
            return this.cz;
        }
        String zp2 = com.bytedance.sdk.openadsdk.utils.YW.zp();
        this.cz = zp2;
        if (!TextUtils.isEmpty(zp2)) {
            return this.cz;
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        com.bytedance.sdk.openadsdk.utils.YW.zp(valueOf);
        this.cz = valueOf;
        return valueOf;
    }

    public com.bytedance.sdk.openadsdk.core.video.lMd.KS rV() {
        if (this.FP == null) {
            this.FP = new com.bytedance.sdk.openadsdk.core.video.lMd.KS(10, 8);
        }
        return this.FP;
    }

    public int tG() {
        if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            return com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("sp_global_file", "title_bar_theme", 0);
        }
        return this.dT;
    }

    @Nullable
    public String vDp() {
        if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            return com.bytedance.sdk.openadsdk.multipro.jU.jU.lMd("sp_global_file", "extra_data", null);
        }
        return this.YW;
    }

    public boolean vwr() {
        return "com.union_test.internationad".equals(YhE.COT());
    }

    public boolean woN() {
        return lMd.contains(this.jU);
    }

    private ku() {
        this.KS = false;
        this.dT = 0;
        this.Bj = true;
        this.vDp = false;
        this.tG = null;
        this.rV = null;
        this.dQp = null;
        this.KVG = null;
        this.vwr = 0;
        this.ot = null;
        try {
            com.bykv.vk.openvk.component.video.api.HWF.zp.zp(KVG.zp());
        } catch (Throwable unused) {
        }
    }

    @NonNull
    public static ku lMd() {
        return zp.zp;
    }

    public static void zp(vDp vdp) {
        zp = vdp;
    }

    public boolean KS() {
        return com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("sp_global_file", "sdk_activate_init", true);
    }

    public void KS(final int i9) {
        if (i9 == 1) {
            i9 = 0;
        } else if (i9 == 0) {
            i9 = 1;
        }
        if (i9 == 0 || i9 == 1 || i9 == -1) {
            final Integer num = this.dQp;
            if (num == null || num.intValue() != i9) {
                this.dQp = Integer.valueOf(i9);
                if (!QUv.COT()) {
                    lMd(num, i9);
                } else {
                    tG.lMd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ku.3
                        @Override // java.lang.Runnable
                        public void run() {
                            ku.this.lMd(num, i9);
                        }
                    });
                }
            }
        }
    }

    public void lMd(boolean z8) {
        com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("sp_global_file", "sdk_activate_init", Boolean.valueOf(z8));
    }

    public boolean zp() {
        return this.pvr;
    }

    private static void HWF(String str) {
        vDp vdp;
        if (TextUtils.isEmpty(str) && (vdp = zp) != null) {
            vdp.fail(4000, "appid cannot be empty");
        }
        com.bytedance.sdk.component.utils.tG.zp("TTAD.GlobalInfo", "appid cannot be empty");
    }

    private static void QR(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 1000) {
            return;
        }
        vDp vdp = zp;
        if (vdp != null) {
            vdp.fail(4000, "Data is very long, the longest is 1000");
        }
        com.bytedance.sdk.component.utils.tG.zp("TTAD.GlobalInfo", "Data is very long, the longest is 1000");
    }

    private static JSONObject ku(String str) {
        String lMd2 = com.bytedance.sdk.openadsdk.multipro.jU.jU.lMd("sp_global_file", str, null);
        if (TextUtils.isEmpty(lMd2)) {
            return null;
        }
        try {
            return new JSONObject(lMd2);
        } catch (JSONException e4) {
            com.bytedance.sdk.component.utils.tG.zp("TTAD.GlobalInfo", e4.getMessage());
            return null;
        }
    }

    public void COT(int i9) {
        if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("sp_global_file", "title_bar_theme", Integer.valueOf(i9));
        }
        this.dT = i9;
    }

    public void jU(int i9) {
        if (i9 != 0 && i9 != 1) {
            i9 = -99;
        }
        com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("sp_global_privacy", "global_coppa", Integer.valueOf(i9));
        this.vwr = i9;
    }

    public void lMd(final int i9) {
        if (i9 == 0 || i9 == 1 || i9 == -1) {
            final Integer num = this.rV;
            if (num == null || num.intValue() != i9) {
                this.rV = Integer.valueOf(i9);
                if (!QUv.COT()) {
                    zp(num, i9);
                } else {
                    tG.lMd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ku.2
                        @Override // java.lang.Runnable
                        public void run() {
                            ku.this.zp(num, i9);
                        }
                    });
                }
            }
        }
    }

    public void zp(boolean z8) {
        this.pvr = z8;
    }

    public void zp(@NonNull String str) {
        HWF(str);
        this.jU = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zp(MBridgeConstans.APP_ID, str);
        com.bytedance.sdk.openadsdk.core.settings.dQp.etV().jU(7);
    }

    public void jU(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            TTDislikeListView.zp(6, str);
        } else if (this.ot != null) {
            this.ot.remove(str);
        }
    }

    public static boolean COT(String str) {
        return (!com.bytedance.sdk.openadsdk.utils.ot.zp || str.contains("sp_full_screen_video") || str.contains("sp_reward_video") || str.contains("tt_openad") || str.contains("pag_sp_bad_par")) ? false : true;
    }

    public void HWF(final int i9) {
        if (i9 == 0 || i9 == 1 || i9 == -1) {
            final Integer num = this.KVG;
            if (num == null || num.intValue() != i9) {
                this.KVG = Integer.valueOf(i9);
                if (!QUv.COT()) {
                    KS(num, i9);
                } else {
                    tG.lMd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ku.5
                        @Override // java.lang.Runnable
                        public void run() {
                            ku.this.KS(num, i9);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void KS(Integer num, int i9) {
        if (num != null) {
            com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("sp_global_privacy", "global_ccpa", Integer.valueOf(i9));
            com.bytedance.sdk.openadsdk.core.settings.dQp.etV().zp(5, true);
        } else if (com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("sp_global_privacy", "global_ccpa", -1) != i9) {
            com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("sp_global_privacy", "global_ccpa", Integer.valueOf(i9));
            com.bytedance.sdk.openadsdk.core.settings.dQp.etV().zp(5, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lMd(Integer num, int i9) {
        if (num != null) {
            com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("sp_global_privacy", "tt_gdpr", Integer.valueOf(i9));
            com.bytedance.sdk.openadsdk.core.settings.dQp.etV().zp(4, true);
        } else if (com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("sp_global_privacy", "tt_gdpr", -1) != i9) {
            com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("sp_global_privacy", "tt_gdpr", Integer.valueOf(i9));
            com.bytedance.sdk.openadsdk.core.settings.dQp.etV().zp(4, true);
        }
    }

    private String zp(Context context) {
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 128));
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public void zp(int i9) {
        if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("sp_global_icon_id", "icon_id", Integer.valueOf(i9));
        }
        this.HWF = i9;
    }

    public zp.InterfaceC0106zp KS(String str) {
        if (this.ot == null || str == null) {
            return null;
        }
        return this.ot.get(str);
    }

    public void lMd(@Nullable final String str) {
        QR(str);
        if (QUv.COT()) {
            tG.lMd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ku.4
                @Override // java.lang.Runnable
                public void run() {
                    if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
                        com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("sp_global_file", "extra_data", str);
                    }
                }
            });
        } else if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("sp_global_file", "extra_data", str);
        }
        this.YW = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(Integer num, int i9) {
        if (num != null) {
            com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("sp_global_privacy", "sdk_coppa", Integer.valueOf(i9));
            com.bytedance.sdk.openadsdk.core.settings.dQp.etV().zp(3, true);
        } else if (com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("sp_global_privacy", "sdk_coppa", -1) != i9) {
            com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("sp_global_privacy", "sdk_coppa", Integer.valueOf(i9));
            com.bytedance.sdk.openadsdk.core.settings.dQp.etV().zp(3, true);
        }
    }

    public void KS(boolean z8) {
        this.KS = z8;
    }

    public static void zp(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, str2);
            jSONObject.put("time", System.currentTimeMillis());
            com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("sp_global_file", str, jSONObject.toString());
        } catch (JSONException e4) {
            com.bytedance.sdk.component.utils.tG.zp("TTAD.GlobalInfo", e4.getMessage());
        }
    }

    public static String zp(String str, long j7) {
        JSONObject ku;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            ku = ku(str);
        } catch (JSONException e4) {
            com.bytedance.sdk.component.utils.tG.zp("TTAD.GlobalInfo", e4.getMessage());
        }
        if (ku == null) {
            return null;
        }
        if (System.currentTimeMillis() - ku.getLong("time") <= j7) {
            return ku.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        }
        return null;
    }

    public void zp(String str, zp.InterfaceC0106zp interfaceC0106zp) {
        if (TextUtils.isEmpty(str) || interfaceC0106zp == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            TTDislikeListView.zp(6, str, interfaceC0106zp);
            return;
        }
        if (this.ot == null) {
            synchronized (ku.class) {
                try {
                    if (this.ot == null) {
                        this.ot = new ConcurrentHashMap<>();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.ot.put(str, interfaceC0106zp);
    }
}
