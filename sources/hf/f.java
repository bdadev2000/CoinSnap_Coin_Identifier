package hf;

import java.util.HashMap;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class f {
    public static boolean a;

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f19111b;

    /* renamed from: c, reason: collision with root package name */
    public static e f19112c;

    /* renamed from: d, reason: collision with root package name */
    public static lc.b f19113d;

    static {
        Boolean bool = Boolean.TRUE;
        f19111b = MapsKt.hashMapOf(TuplesKt.to("open_resume", bool), TuplesKt.to("on_inter_splash", bool), TuplesKt.to("on_inter_home", bool), TuplesKt.to("native_language", bool), TuplesKt.to("native_language_click", bool), TuplesKt.to("native_onboarding", bool), TuplesKt.to("native_onboarding_page4", bool), TuplesKt.to("native_home", bool), TuplesKt.to("native_my_plant", bool), TuplesKt.to("native_result", bool), TuplesKt.to("native_Diagnose", bool), TuplesKt.to("banner_splash", bool), TuplesKt.to("banner_all", bool), TuplesKt.to("native_history", bool), TuplesKt.to("banner_collab_lightmeter", bool), TuplesKt.to("on_scanner_tier_1", Boolean.FALSE), TuplesKt.to("total_number_of_scan_free", 1), TuplesKt.to("new_iap", bool));
    }

    public static boolean a() {
        try {
            if (!a) {
                return false;
            }
            lc.b bVar = f19113d;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("remoteConfig");
                bVar = null;
            }
            return bVar.a("banner_all");
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean b() {
        try {
            if (!a) {
                return false;
            }
            lc.b bVar = f19113d;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("remoteConfig");
                bVar = null;
            }
            return bVar.a("on_inter_home");
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean c() {
        try {
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (a) {
            lc.b bVar = f19113d;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("remoteConfig");
                bVar = null;
            }
            return bVar.a("new_iap");
        }
        return false;
    }

    public static boolean d() {
        try {
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (a) {
            lc.b bVar = f19113d;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("remoteConfig");
                bVar = null;
            }
            return bVar.a("on_scanner_tier_1");
        }
        return false;
    }

    public static int e() {
        try {
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (a) {
            lc.b bVar = f19113d;
            lc.b bVar2 = null;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("remoteConfig");
                bVar = null;
            }
            if (((int) bVar.b()) > 3) {
                return 3;
            }
            lc.b bVar3 = f19113d;
            if (bVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("remoteConfig");
            } else {
                bVar2 = bVar3;
            }
            return (int) bVar2.b();
        }
        return 1;
    }
}
