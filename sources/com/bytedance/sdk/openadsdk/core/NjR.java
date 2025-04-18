package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.c;
import com.bytedance.sdk.openadsdk.core.tN.AlY;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class NjR {
    public static final Set<String> Sg = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.NjR.1
        {
            add("8025677");
            add("5001121");
        }
    };
    private static boolean Wwa = false;
    public static GA YFl;

    @NonNull
    private String AlY;
    private int DSW;
    private Integer EH;
    private boolean GA;
    private com.bytedance.sdk.openadsdk.core.GA.tN.tN Ne;

    @Nullable
    private String NjR;
    private volatile ConcurrentHashMap<String, AlY.YFl> VOe;
    private boolean YoT;
    private boolean aIu;
    private int eT;
    private Integer lG;

    /* renamed from: nc, reason: collision with root package name */
    @Nullable
    private String f10637nc;
    private Bitmap pDU;
    private int qO;
    private boolean qsH;
    private Integer rkt;
    private boolean tN;

    /* renamed from: vc, reason: collision with root package name */
    @NonNull
    private String f10638vc;
    private String wN;
    private String wXo;

    /* loaded from: classes.dex */
    public static class YFl {
        private static final NjR YFl = new NjR();
    }

    public static boolean Ne() {
        return Wwa;
    }

    public static void VOe() {
        if (Build.VERSION.SDK_INT == 26 && "MI 6".equals(Build.MODEL)) {
            Wwa = true;
        }
    }

    @Nullable
    public String AlY() {
        if (TextUtils.isEmpty(this.AlY)) {
            String YFl2 = YFl(MBridgeConstans.APP_ID, Long.MAX_VALUE);
            if (!TextUtils.isEmpty(YFl2)) {
                this.AlY = YFl2;
            }
        }
        return this.AlY;
    }

    public int DSW() {
        if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            return com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("sp_global_icon_id", "icon_id", 0);
        }
        return this.DSW;
    }

    public boolean EH() {
        return true;
    }

    @Nullable
    public String GA() {
        if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            return com.bytedance.sdk.openadsdk.multipro.AlY.AlY.Sg("sp_global_file", "extra_data", null);
        }
        return this.f10637nc;
    }

    public int NjR() {
        Integer num = this.rkt;
        if (num != null) {
            return num.intValue();
        }
        return com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("sp_global_privacy", "tt_gdpr", -1);
    }

    public boolean Wwa() {
        return "com.union_test.internationad".equals(Sco.wN());
    }

    @Nullable
    public String YoT() {
        if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            return com.bytedance.sdk.openadsdk.multipro.AlY.AlY.Sg("sp_global_file", "keywords", null);
        }
        return this.NjR;
    }

    public int aIu() {
        Integer num = this.lG;
        if (num != null) {
            return num.intValue();
        }
        return com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("sp_global_privacy", "global_ccpa", -1);
    }

    public boolean eT() {
        if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            return com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("sp_global_file", "is_paid", false);
        }
        return this.qsH;
    }

    public boolean lG() {
        return Sg.contains(this.AlY);
    }

    public int nc() {
        int YFl2 = com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("sp_global_privacy", "global_coppa", -99);
        this.qO = YFl2;
        if (YFl2 == -99) {
            this.qO = qsH();
        }
        return this.qO;
    }

    public com.bytedance.sdk.openadsdk.core.GA.tN.tN pDU() {
        if (this.Ne == null) {
            this.Ne = new com.bytedance.sdk.openadsdk.core.GA.tN.tN(10, 8);
        }
        return this.Ne;
    }

    public String qO() {
        if (!TextUtils.isEmpty(this.wXo)) {
            return this.wXo;
        }
        String YFl2 = com.bytedance.sdk.openadsdk.utils.NjR.YFl();
        this.wXo = YFl2;
        if (!TextUtils.isEmpty(YFl2)) {
            return this.wXo;
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        com.bytedance.sdk.openadsdk.utils.NjR.YFl(valueOf);
        this.wXo = valueOf;
        return valueOf;
    }

    public int qsH() {
        Integer num = this.EH;
        if (num != null) {
            return num.intValue();
        }
        return com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("sp_global_privacy", "sdk_coppa", -1);
    }

    public Bitmap rkt() {
        if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            return com.bytedance.sdk.component.utils.AlY.YFl(com.bytedance.sdk.openadsdk.multipro.AlY.AlY.Sg("sp_global_file", "pause_icon", null));
        }
        return this.pDU;
    }

    @NonNull
    public String vc() {
        if (TextUtils.isEmpty(this.f10638vc)) {
            this.f10638vc = YFl(lG.YFl());
        }
        return this.f10638vc;
    }

    public String wN() {
        String str = this.wN;
        if (str != null) {
            return str;
        }
        String YFl2 = YFl("mediation_info", Long.MAX_VALUE);
        this.wN = YFl2;
        if (YFl2 == null) {
            this.wN = "";
        }
        return this.wN;
    }

    public void wXo() {
        try {
            if (this.VOe != null && this.VOe.size() == 0) {
                this.VOe = null;
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    private NjR() {
        this.tN = false;
        this.eT = 0;
        this.YoT = true;
        this.GA = false;
        this.pDU = null;
        this.EH = null;
        this.rkt = null;
        this.lG = null;
        this.qO = 0;
        this.VOe = null;
        try {
            Context YFl2 = lG.YFl();
            YFl2.getClass();
            c.f9613b = YFl2;
        } catch (Throwable unused) {
        }
    }

    @NonNull
    public static NjR Sg() {
        return YFl.YFl;
    }

    public static void YFl(GA ga2) {
        YFl = ga2;
    }

    public boolean tN() {
        return com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("sp_global_file", "sdk_activate_init", true);
    }

    public void Sg(boolean z10) {
        com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("sp_global_file", "sdk_activate_init", Boolean.valueOf(z10));
    }

    public boolean YFl() {
        return this.aIu;
    }

    public void tN(final int i10) {
        if (i10 == 1) {
            i10 = 0;
        } else if (i10 == 0) {
            i10 = 1;
        }
        if (i10 == 0 || i10 == 1 || i10 == -1) {
            final Integer num = this.rkt;
            if (num == null || num.intValue() != i10) {
                this.rkt = Integer.valueOf(i10);
                if (!com.bytedance.sdk.openadsdk.utils.mn.wN()) {
                    Sg(num, i10);
                } else {
                    pDU.Sg().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NjR.3
                        @Override // java.lang.Runnable
                        public void run() {
                            NjR.this.Sg(num, i10);
                        }
                    });
                }
            }
        }
    }

    public static boolean DSW(String str) {
        return (!com.bytedance.sdk.openadsdk.utils.VOe.YFl || str.contains("sp_full_screen_video") || str.contains("sp_reward_video") || str.contains("tt_openad") || str.contains("pag_sp_bad_par")) ? false : true;
    }

    private static void NjR(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 1000) {
            return;
        }
        GA ga2 = YFl;
        if (ga2 != null) {
            ga2.fail(4000, "Data is very long, the longest is 1000");
        }
        com.bytedance.sdk.component.utils.YoT.YFl("TTAD.GlobalInfo", "Data is very long, the longest is 1000");
    }

    private static JSONObject nc(String str) {
        String Sg2 = com.bytedance.sdk.openadsdk.multipro.AlY.AlY.Sg("sp_global_file", str, null);
        if (TextUtils.isEmpty(Sg2)) {
            return null;
        }
        try {
            return new JSONObject(Sg2);
        } catch (JSONException e2) {
            com.bytedance.sdk.component.utils.YoT.YFl("TTAD.GlobalInfo", e2.getMessage());
            return null;
        }
    }

    private static void qsH(String str) {
        GA ga2;
        if (TextUtils.isEmpty(str) && (ga2 = YFl) != null) {
            ga2.fail(4000, "appid cannot be empty");
        }
        com.bytedance.sdk.component.utils.YoT.YFl("TTAD.GlobalInfo", "appid cannot be empty");
    }

    public void Sg(String str) {
        this.wN = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        YFl("mediation_info", str);
    }

    public void YFl(boolean z10) {
        this.aIu = z10;
    }

    public void vc(final int i10) {
        if (i10 == 0 || i10 == 1 || i10 == -1) {
            final Integer num = this.lG;
            if (num == null || num.intValue() != i10) {
                this.lG = Integer.valueOf(i10);
                if (!com.bytedance.sdk.openadsdk.utils.mn.wN()) {
                    tN(num, i10);
                } else {
                    pDU.Sg().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NjR.5
                        @Override // java.lang.Runnable
                        public void run() {
                            NjR.this.tN(num, i10);
                        }
                    });
                }
            }
        }
    }

    public void YFl(@NonNull String str) {
        qsH(str);
        this.AlY = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        YFl(MBridgeConstans.APP_ID, str);
        com.bytedance.sdk.openadsdk.core.settings.rkt.JwO().AlY(7);
    }

    public void wN(int i10) {
        if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("sp_global_file", "title_bar_theme", Integer.valueOf(i10));
        }
        this.eT = i10;
    }

    public void AlY(int i10) {
        if (i10 != 0 && i10 != 1) {
            i10 = -99;
        }
        com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("sp_global_privacy", "global_coppa", Integer.valueOf(i10));
        this.qO = i10;
    }

    public void Sg(final int i10) {
        if (i10 == 0 || i10 == 1 || i10 == -1) {
            final Integer num = this.EH;
            if (num == null || num.intValue() != i10) {
                this.EH = Integer.valueOf(i10);
                if (!com.bytedance.sdk.openadsdk.utils.mn.wN()) {
                    YFl(num, i10);
                } else {
                    pDU.Sg().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NjR.2
                        @Override // java.lang.Runnable
                        public void run() {
                            NjR.this.YFl(num, i10);
                        }
                    });
                }
            }
        }
    }

    public static Pair<String, Long> AlY(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject nc2 = nc(str);
            if (nc2 == null) {
                return null;
            }
            return new Pair<>(nc2.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE), Long.valueOf(nc2.getLong("time")));
        } catch (JSONException e2) {
            com.bytedance.sdk.component.utils.YoT.YFl("TTAD.GlobalInfo", e2.getMessage());
            return null;
        }
    }

    public AlY.YFl wN(String str) {
        try {
            if (this.VOe == null || str == null) {
                return null;
            }
            return this.VOe.get(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public void tN(@Nullable final String str) {
        NjR(str);
        if (com.bytedance.sdk.openadsdk.utils.mn.wN()) {
            pDU.Sg().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NjR.4
                @Override // java.lang.Runnable
                public void run() {
                    if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
                        com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("sp_global_file", "extra_data", str);
                    }
                }
            });
        } else if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("sp_global_file", "extra_data", str);
        }
        this.f10637nc = str;
    }

    private String YFl(Context context) {
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 128));
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public void vc(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
                com.bytedance.sdk.openadsdk.tN.nc.YFl(6, str);
            } else if (this.VOe != null) {
                this.VOe.remove(str);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sg(Integer num, int i10) {
        if (num == null) {
            if (com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("sp_global_privacy", "tt_gdpr", -1) != i10) {
                com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("sp_global_privacy", "tt_gdpr", Integer.valueOf(i10));
                com.bytedance.sdk.openadsdk.core.settings.rkt.JwO().YFl(4, true);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("sp_global_privacy", "tt_gdpr", Integer.valueOf(i10));
        com.bytedance.sdk.openadsdk.core.settings.rkt.JwO().YFl(4, true);
    }

    public void YFl(int i10) {
        if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("sp_global_icon_id", "icon_id", Integer.valueOf(i10));
        }
        this.DSW = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tN(Integer num, int i10) {
        if (num == null) {
            if (com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("sp_global_privacy", "global_ccpa", -1) != i10) {
                com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("sp_global_privacy", "global_ccpa", Integer.valueOf(i10));
                com.bytedance.sdk.openadsdk.core.settings.rkt.JwO().YFl(5, true);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("sp_global_privacy", "global_ccpa", Integer.valueOf(i10));
        com.bytedance.sdk.openadsdk.core.settings.rkt.JwO().YFl(5, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(Integer num, int i10) {
        if (num == null) {
            if (com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("sp_global_privacy", "sdk_coppa", -1) != i10) {
                com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("sp_global_privacy", "sdk_coppa", Integer.valueOf(i10));
                com.bytedance.sdk.openadsdk.core.settings.rkt.JwO().YFl(3, true);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("sp_global_privacy", "sdk_coppa", Integer.valueOf(i10));
        com.bytedance.sdk.openadsdk.core.settings.rkt.JwO().YFl(3, true);
    }

    public void tN(boolean z10) {
        this.tN = z10;
    }

    public static void YFl(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, str2);
            jSONObject.put("time", System.currentTimeMillis());
            com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("sp_global_file", str, jSONObject.toString());
        } catch (JSONException e2) {
            com.bytedance.sdk.component.utils.YoT.YFl("TTAD.GlobalInfo", e2.getMessage());
        }
    }

    public static String YFl(String str, long j3) {
        JSONObject nc2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            nc2 = nc(str);
        } catch (JSONException e2) {
            com.bytedance.sdk.component.utils.YoT.YFl("TTAD.GlobalInfo", e2.getMessage());
        }
        if (nc2 == null) {
            return null;
        }
        if (System.currentTimeMillis() - nc2.getLong("time") <= j3) {
            return nc2.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        }
        return null;
    }

    public void YFl(String str, AlY.YFl yFl) {
        try {
            if (TextUtils.isEmpty(str) || yFl == null) {
                return;
            }
            if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
                com.bytedance.sdk.openadsdk.tN.nc.YFl(6, str, yFl);
                return;
            }
            if (this.VOe == null) {
                synchronized (NjR.class) {
                    if (this.VOe == null) {
                        this.VOe = new ConcurrentHashMap<>();
                    }
                }
            }
            if (this.VOe != null) {
                this.VOe.put(str, yFl);
            }
        } catch (Throwable unused) {
        }
    }
}
