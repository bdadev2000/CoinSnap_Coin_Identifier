package q6;

import G7.j;
import java.util.HashMap;
import t7.C2720i;
import u7.AbstractC2829t;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final b f22801e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static c f22802f;

    /* renamed from: a, reason: collision with root package name */
    public boolean f22803a;
    public final HashMap b;

    /* renamed from: c, reason: collision with root package name */
    public d f22804c;

    /* renamed from: d, reason: collision with root package name */
    public k5.b f22805d;

    public c() {
        Boolean bool = Boolean.TRUE;
        this.b = AbstractC2829t.X(new C2720i("on_show_dialog_consent", bool), new C2720i("native_language", bool), new C2720i("native_onboarding", bool), new C2720i("native_permission", bool), new C2720i("native_language_2", bool), new C2720i("native_onboarding_2", bool), new C2720i("native_language_click", bool), new C2720i("native_language_click_2", bool), new C2720i("Native_llib", bool), new C2720i("Native_home", bool), new C2720i("Native_setting", bool), new C2720i("Native_exit", bool), new C2720i("Native_onboarding_1_4", bool), new C2720i("Native_onboarding_1_4_2", bool), new C2720i("native_spirit", bool), new C2720i("native_onboarding_full", bool), new C2720i("native_onboarding_full_2", bool), new C2720i("Inter_splash_image", bool), new C2720i("Inter_back_home", bool), new C2720i("Inter_home", bool), new C2720i("Inter_AR_Click", bool), new C2720i("Inter_Ar", bool), new C2720i("banner_Ar", bool), new C2720i("banner_straight_ruler", bool), new C2720i("banner_protrator", bool), new C2720i("banner_splash", bool), new C2720i("banner_collap_home", bool), new C2720i("App_open", bool));
    }

    public final boolean a() {
        try {
            if (!this.f22803a) {
                return false;
            }
            k5.b bVar = this.f22805d;
            if (bVar != null) {
                return bVar.c("Inter_Ar");
            }
            j.k("remoteConfig");
            throw null;
        } catch (Exception e4) {
            e4.printStackTrace();
            return false;
        }
    }

    public final boolean b() {
        try {
            if (!this.f22803a) {
                return false;
            }
            k5.b bVar = this.f22805d;
            if (bVar != null) {
                return bVar.c("Inter_AR_Click");
            }
            j.k("remoteConfig");
            throw null;
        } catch (Exception e4) {
            e4.printStackTrace();
            return false;
        }
    }

    public final boolean c() {
        try {
            if (!this.f22803a) {
                return false;
            }
            k5.b bVar = this.f22805d;
            if (bVar != null) {
                return bVar.c("Inter_back_home");
            }
            j.k("remoteConfig");
            throw null;
        } catch (Exception e4) {
            e4.printStackTrace();
            return false;
        }
    }

    public final boolean d() {
        try {
            if (!this.f22803a) {
                return false;
            }
            k5.b bVar = this.f22805d;
            if (bVar != null) {
                return bVar.c("Native_home");
            }
            j.k("remoteConfig");
            throw null;
        } catch (Exception e4) {
            e4.printStackTrace();
            return false;
        }
    }

    public final boolean e() {
        try {
            if (!this.f22803a) {
                return false;
            }
            k5.b bVar = this.f22805d;
            if (bVar != null) {
                return bVar.c("native_language");
            }
            j.k("remoteConfig");
            throw null;
        } catch (Exception e4) {
            e4.printStackTrace();
            return false;
        }
    }

    public final boolean f() {
        try {
            if (!this.f22803a) {
                return false;
            }
            k5.b bVar = this.f22805d;
            if (bVar != null) {
                return bVar.c("native_language_2");
            }
            j.k("remoteConfig");
            throw null;
        } catch (Exception e4) {
            e4.printStackTrace();
            return false;
        }
    }

    public final boolean g() {
        try {
            if (!this.f22803a) {
                return false;
            }
            k5.b bVar = this.f22805d;
            if (bVar != null) {
                return bVar.c("native_language_click");
            }
            j.k("remoteConfig");
            throw null;
        } catch (Exception e4) {
            e4.printStackTrace();
            return false;
        }
    }

    public final boolean h() {
        try {
            if (!this.f22803a) {
                return false;
            }
            k5.b bVar = this.f22805d;
            if (bVar != null) {
                return bVar.c("native_language_click_2");
            }
            j.k("remoteConfig");
            throw null;
        } catch (Exception e4) {
            e4.printStackTrace();
            return false;
        }
    }

    public final boolean i() {
        try {
            if (!this.f22803a) {
                return false;
            }
            k5.b bVar = this.f22805d;
            if (bVar != null) {
                return bVar.c("Native_llib");
            }
            j.k("remoteConfig");
            throw null;
        } catch (Exception e4) {
            e4.printStackTrace();
            return false;
        }
    }
}
