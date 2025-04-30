package l4;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.zzis;
import com.mbridge.msdk.MBridgeConstans;
import d4.AbstractC2186n;
import d4.C2181i;
import d4.C2182j;
import d4.E;
import d4.u;

/* renamed from: l4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2445b {

    /* renamed from: a, reason: collision with root package name */
    public static final u f21567a;
    public static final E b;

    /* renamed from: c, reason: collision with root package name */
    public static final E f21568c;

    /* renamed from: d, reason: collision with root package name */
    public static final E f21569d;

    /* renamed from: e, reason: collision with root package name */
    public static final E f21570e;

    /* renamed from: f, reason: collision with root package name */
    public static final E f21571f;

    static {
        int i9 = u.f19883d;
        Object[] objArr = new Object[15];
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}, 0, objArr, 6, 9);
        f21567a = u.j(15, objArr);
        C2182j c2182j = AbstractC2186n.f19876c;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        R2.b.i(7, objArr2);
        b = AbstractC2186n.h(7, objArr2);
        Object[] objArr3 = {"auto", MBridgeConstans.DYNAMIC_VIEW_WX_APP, "am"};
        R2.b.i(3, objArr3);
        f21568c = AbstractC2186n.h(3, objArr3);
        Object[] objArr4 = {"_r", "_dbg"};
        R2.b.i(2, objArr4);
        f21569d = AbstractC2186n.h(2, objArr4);
        C2181i c2181i = new C2181i();
        c2181i.a(zzis.zza);
        c2181i.a(zzis.zzb);
        c2181i.f19869c = true;
        f21570e = AbstractC2186n.h(c2181i.b, c2181i.f19868a);
        Object[] objArr5 = {"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"};
        R2.b.i(2, objArr5);
        f21571f = AbstractC2186n.h(2, objArr5);
    }

    public static boolean a(String str, Bundle bundle) {
        if (b.contains(str)) {
            return false;
        }
        if (bundle != null) {
            E e4 = f21569d;
            int size = e4.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = e4.get(i9);
                i9++;
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
            if (f21570e.contains(str2)) {
                return false;
            }
            E e4 = f21571f;
            int size = e4.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = e4.get(i9);
                i9++;
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

    public static boolean c(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!d(str) || bundle == null) {
            return false;
        }
        E e4 = f21569d;
        int size = e4.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = e4.get(i9);
            i9++;
            if (bundle.containsKey((String) obj)) {
                return false;
            }
        }
        str.getClass();
        char c9 = 65535;
        switch (str.hashCode()) {
            case 101200:
                if (str.equals(AppMeasurement.FCM_ORIGIN)) {
                    c9 = 0;
                    break;
                }
                break;
            case 101230:
                if (str.equals("fdl")) {
                    c9 = 1;
                    break;
                }
                break;
            case 3142703:
                if (str.equals(AppMeasurement.FIAM_ORIGIN)) {
                    c9 = 2;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                bundle.putString("_cis", "fcm_integration");
                return true;
            case 1:
                bundle.putString("_cis", "fdl_integration");
                return true;
            case 2:
                bundle.putString("_cis", "fiam_integration");
                return true;
            default:
                return false;
        }
    }

    public static boolean d(String str) {
        if (!f21568c.contains(str)) {
            return true;
        }
        return false;
    }
}
