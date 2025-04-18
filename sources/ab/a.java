package ab;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.zzjj;
import com.google.common.collect.b1;
import com.google.common.collect.m0;
import com.google.common.collect.n0;
import com.google.common.collect.r0;
import com.google.common.collect.z1;
import com.mbridge.msdk.MBridgeConstans;
import kotlinx.coroutines.DebugKt;
import v8.u0;

/* loaded from: classes3.dex */
public abstract class a {
    public static final b1 a = b1.p("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* renamed from: b, reason: collision with root package name */
    public static final z1 f419b;

    /* renamed from: c, reason: collision with root package name */
    public static final z1 f420c;

    /* renamed from: d, reason: collision with root package name */
    public static final z1 f421d;

    /* renamed from: e, reason: collision with root package name */
    public static final z1 f422e;

    /* renamed from: f, reason: collision with root package name */
    public static final z1 f423f;

    static {
        n0 n0Var = r0.f12026c;
        Object[] objArr = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        u0.h(7, objArr);
        f419b = r0.h(7, objArr);
        f420c = r0.q(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, MBridgeConstans.DYNAMIC_VIEW_WX_APP, "am");
        f421d = r0.p("_r", "_dbg");
        m0 m0Var = new m0();
        m0Var.v(zzjj.zza);
        m0Var.v(zzjj.zzb);
        f422e = m0Var.y();
        f423f = r0.p("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    public static boolean a(Bundle bundle, String str) {
        if (f419b.contains(str)) {
            return false;
        }
        if (bundle != null) {
            z1 z1Var = f421d;
            int i10 = z1Var.f12064f;
            int i11 = 0;
            while (i11 < i10) {
                Object obj = z1Var.get(i11);
                i11++;
                if (bundle.containsKey((String) obj)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static boolean b(String str, String str2) {
        if (!"_ce1".equals(str2) && !"_ce2".equals(str2)) {
            if ("_ln".equals(str2)) {
                if (str.equals(AppMeasurement.FCM_ORIGIN) || str.equals(AppMeasurement.FIAM_ORIGIN)) {
                    return true;
                }
                return false;
            }
            if (f422e.contains(str2)) {
                return false;
            }
            z1 z1Var = f423f;
            int i10 = z1Var.f12064f;
            int i11 = 0;
            while (i11 < i10) {
                Object obj = z1Var.get(i11);
                i11++;
                if (str2.matches((String) obj)) {
                    return false;
                }
            }
            return true;
        }
        if (str.equals(AppMeasurement.FCM_ORIGIN) || str.equals("frc")) {
            return true;
        }
        return false;
    }

    public static boolean c(Bundle bundle, String str, String str2) {
        char c10;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!d(str) || bundle == null) {
            return false;
        }
        z1 z1Var = f421d;
        int i10 = z1Var.f12064f;
        int i11 = 0;
        while (i11 < i10) {
            Object obj = z1Var.get(i11);
            i11++;
            if (bundle.containsKey((String) obj)) {
                return false;
            }
        }
        int hashCode = str.hashCode();
        if (hashCode != 101200) {
            if (hashCode != 101230) {
                if (hashCode == 3142703 && str.equals(AppMeasurement.FIAM_ORIGIN)) {
                    c10 = 2;
                }
                c10 = 65535;
            } else {
                if (str.equals("fdl")) {
                    c10 = 1;
                }
                c10 = 65535;
            }
        } else {
            if (str.equals(AppMeasurement.FCM_ORIGIN)) {
                c10 = 0;
            }
            c10 = 65535;
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    return false;
                }
                bundle.putString("_cis", "fiam_integration");
                return true;
            }
            bundle.putString("_cis", "fdl_integration");
            return true;
        }
        bundle.putString("_cis", "fcm_integration");
        return true;
    }

    public static boolean d(String str) {
        return !f420c.contains(str);
    }
}
