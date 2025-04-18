package com.plantcare.ai.identifier.plantid.ui.component.main;

import a4.a;
import a4.d;
import a4.m;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.s0;
import androidx.viewpager2.widget.ViewPager2;
import com.ads.control.admob.AppOpenManager;
import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.e;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.login.v;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.Task;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.app.GlobalApp;
import d3.g;
import fg.h;
import java.util.ArrayList;
import kf.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import lc.b;
import n0.l1;
import pf.f;
import sf.j;
import sf.k;
import sf.l;
import v8.u0;
import vf.c;
import x5.i;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/ui/component/main/MainActivity;", "Lmf/a;", "Lkf/u;", "<init>", "()V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/plantcare/ai/identifier/plantid/ui/component/main/MainActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 EasyPreferences.kt\ncom/plantcare/ai/identifier/plantid/utils/EasyPreferences\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,737:1\n75#2,13:738\n49#3,7:751\n1855#4,2:758\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/plantcare/ai/identifier/plantid/ui/component/main/MainActivity\n*L\n90#1:738,13\n131#1:751,7\n509#1:758,2\n*E\n"})
/* loaded from: classes4.dex */
public final class MainActivity extends f {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f16644q = 0;

    /* renamed from: j, reason: collision with root package name */
    public final y0 f16645j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f16646k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f16647l;

    /* renamed from: m, reason: collision with root package name */
    public FusedLocationProviderClient f16648m;

    /* renamed from: n, reason: collision with root package name */
    public l f16649n;

    /* renamed from: o, reason: collision with root package name */
    public d f16650o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f16651p;

    public MainActivity() {
        super(5);
        this.f16645j = new y0(Reflection.getOrCreateKotlinClass(MainViewModel.class), new c(this, 7), new c(this, 6), new vf.d(this, 3));
        this.f16647l = new ArrayList();
    }

    public static final void I(MainActivity mainActivity) {
        mainActivity.getClass();
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", mainActivity.getPackageName(), null));
        mainActivity.startActivity(intent);
        AppOpenManager.f().f2914k = false;
    }

    public static final void J(MainActivity mainActivity) {
        mainActivity.getClass();
        m a = a.a();
        a.f153b = "inapp";
        a a10 = a.a();
        Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
        d dVar = mainActivity.f16650o;
        if (dVar != null) {
            dVar.p(a10, new fg.a(mainActivity));
        }
    }

    public final void K() {
        u uVar = (u) n();
        TextView tvLocationUnavailable = uVar.B;
        Intrinsics.checkNotNullExpressionValue(tvLocationUnavailable, "tvLocationUnavailable");
        e.V(tvLocationUnavailable);
        TextView tvTapToEnable = uVar.E;
        Intrinsics.checkNotNullExpressionValue(tvTapToEnable, "tvTapToEnable");
        e.V(tvTapToEnable);
        TextView tvCityName = uVar.A;
        Intrinsics.checkNotNullExpressionValue(tvCityName, "tvCityName");
        e.E(tvCityName);
        TextView tvWeatherInformation = uVar.F;
        Intrinsics.checkNotNullExpressionValue(tvWeatherInformation, "tvWeatherInformation");
        e.E(tvWeatherInformation);
        L().f16657i.postValue(null);
    }

    public final MainViewModel L() {
        return (MainViewModel) this.f16645j.getValue();
    }

    public final void M() {
        Task<Location> lastLocation;
        Task<Location> task = null;
        if (i.i(this)) {
            FusedLocationProviderClient fusedLocationProviderClient = this.f16648m;
            if (fusedLocationProviderClient != null && (lastLocation = fusedLocationProviderClient.getLastLocation()) != null) {
                task = lastLocation.addOnSuccessListener(new v(new fg.d(this, 7)));
            }
            if (task == null) {
                K();
                return;
            }
            return;
        }
        if (!com.bumptech.glide.d.q(this)) {
            TextView tvTapToEnable = ((u) n()).E;
            Intrinsics.checkNotNullExpressionValue(tvTapToEnable, "tvTapToEnable");
            e.E(tvTapToEnable);
            TextView tvWeatherInformation = ((u) n()).F;
            Intrinsics.checkNotNullExpressionValue(tvWeatherInformation, "tvWeatherInformation");
            e.V(tvWeatherInformation);
            ((u) n()).F.setText(o().getString("LOCATION_WEATHER_INFO", null));
            TextView tvLocationUnavailable = ((u) n()).B;
            Intrinsics.checkNotNullExpressionValue(tvLocationUnavailable, "tvLocationUnavailable");
            e.E(tvLocationUnavailable);
            TextView tvCityName = ((u) n()).A;
            Intrinsics.checkNotNullExpressionValue(tvCityName, "tvCityName");
            e.V(tvCityName);
            ((u) n()).A.setText(o().getString("LOCATION_CITY_NAME", null));
        }
        K();
    }

    public final void N() {
        if (!i.i(this)) {
            if (((Number) ac.e.m(0, "count_denied_location_permission_time")).intValue() < 2) {
                ac.e.t(Integer.valueOf(((Number) ac.e.m(0, "count_denied_location_permission_time")).intValue() + 1), "count_denied_location_permission_time");
                Intrinsics.checkNotNullParameter(this, "activity");
                androidx.core.app.i.a(this, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 444);
            } else {
                String string = getString(R.string.location_permission_needed);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String string2 = getString(R.string.des_location_permission);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                new l(this, string, string2, new fg.c(this, 5)).show();
            }
        }
    }

    public final void O(int i10) {
        ((u) n()).f20896w.setActivated(false);
        ((u) n()).f20897x.setActivated(false);
        ((u) n()).C.setTextColor(Color.parseColor("#AAAABB"));
        ((u) n()).D.setTextColor(Color.parseColor("#AAAABB"));
        if (i10 == 0) {
            ((u) n()).f20896w.setActivated(true);
            ((u) n()).C.setTextColor(Color.parseColor("#7DC448"));
        } else {
            ((u) n()).f20897x.setActivated(true);
            ((u) n()).D.setTextColor(Color.parseColor("#7DC448"));
        }
        ((u) n()).G.setCurrentItem(i10);
    }

    @Override // mf.a
    public final int m() {
        return R.layout.activity_main;
    }

    @Override // h.m, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.f16648m = null;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] permissions, int[] grantResults) {
        boolean z10;
        boolean z11;
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(i10, permissions, grantResults);
        if (i10 != 444) {
            if (i10 == 666) {
                if (grantResults.length == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((!z11) && grantResults[0] == 0) {
                    N();
                    return;
                }
                if (ac.e.g() < 2) {
                    N();
                    return;
                }
                if (!this.f16651p) {
                    String string = getString(R.string.notification_needed);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    String string2 = getString(R.string.des_noti_permission);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    new l(this, string, string2, new fg.c(this, 4)).show();
                    return;
                }
                return;
            }
            return;
        }
        if (grantResults.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((!z10) && grantResults[0] == 0) {
            TextView tvTapToEnable = ((u) n()).E;
            Intrinsics.checkNotNullExpressionValue(tvTapToEnable, "tvTapToEnable");
            e.E(tvTapToEnable);
            M();
        }
    }

    @Override // mf.a, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        M();
        if (i.l()) {
            LottieAnimationView icVip = ((u) n()).f20898y;
            Intrinsics.checkNotNullExpressionValue(icVip, "icVip");
            e.D(icVip);
        } else {
            LottieAnimationView icVip2 = ((u) n()).f20898y;
            Intrinsics.checkNotNullExpressionValue(icVip2, "icVip");
            e.V(icVip2);
        }
        i.h(this);
        i.f27402f = false;
        if (this.f16646k) {
            this.f16646k = false;
            N();
        }
        if (GlobalApp.f16595i && !((Boolean) ac.e.m(Boolean.FALSE, "show_flash_sale_dialog")).booleanValue() && !i.l()) {
            new j(this, new fg.c(this, 3)).show();
            ac.e.t(Boolean.TRUE, "show_flash_sale_dialog");
            GlobalApp.f16595i = false;
        }
    }

    @Override // mf.a
    public final void q() {
        Long l10;
        long j3;
        Boolean bool;
        Float f10;
        float f11;
        Integer num;
        int i10;
        Long l11;
        long j10;
        Boolean bool2;
        Float f12;
        Integer num2;
        boolean z10;
        String str;
        String str2;
        SharedPreferences o10 = o();
        Object obj = Boolean.FALSE;
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Boolean.class);
        float f13 = -1.0f;
        int i11 = -1;
        int i12 = 0;
        b bVar = null;
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
            if (obj instanceof String) {
                str2 = (String) obj;
            } else {
                str2 = null;
            }
            bool = (Boolean) o10.getString("key_confirm_consent", str2);
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
            if (obj instanceof Integer) {
                num = (Integer) obj;
            } else {
                num = null;
            }
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = -1;
            }
            bool = (Boolean) Integer.valueOf(o10.getInt("key_confirm_consent", i10));
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
            bool = Boolean.valueOf(o10.getBoolean("key_confirm_consent", false));
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
            if (obj instanceof Float) {
                f10 = (Float) obj;
            } else {
                f10 = null;
            }
            if (f10 != null) {
                f11 = f10.floatValue();
            } else {
                f11 = -1.0f;
            }
            bool = (Boolean) Float.valueOf(o10.getFloat("key_confirm_consent", f11));
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
            if (obj instanceof Long) {
                l10 = (Long) obj;
            } else {
                l10 = null;
            }
            if (l10 != null) {
                j3 = l10.longValue();
            } else {
                j3 = -1;
            }
            bool = (Boolean) Long.valueOf(o10.getLong("key_confirm_consent", j3));
        } else {
            throw new UnsupportedOperationException("Not yet implemented");
        }
        int i13 = 1;
        if (Intrinsics.areEqual(bool, obj)) {
            SharedPreferences o11 = o();
            KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Boolean.class);
            if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(String.class))) {
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = null;
                }
                bool2 = (Boolean) o11.getString("key_is_user_global", str);
            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                if (obj instanceof Integer) {
                    num2 = (Integer) obj;
                } else {
                    num2 = null;
                }
                if (num2 != null) {
                    i11 = num2.intValue();
                }
                bool2 = (Boolean) Integer.valueOf(o11.getInt("key_is_user_global", i11));
            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                bool2 = Boolean.valueOf(o11.getBoolean("key_is_user_global", false));
            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                if (obj instanceof Float) {
                    f12 = (Float) obj;
                } else {
                    f12 = null;
                }
                if (f12 != null) {
                    f13 = f12.floatValue();
                }
                bool2 = (Boolean) Float.valueOf(o11.getFloat("key_is_user_global", f13));
            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                if (obj instanceof Long) {
                    l11 = (Long) obj;
                } else {
                    l11 = null;
                }
                if (l11 != null) {
                    j10 = l11.longValue();
                } else {
                    j10 = -1;
                }
                bool2 = (Boolean) Long.valueOf(o11.getLong("key_is_user_global", j10));
            } else {
                throw new UnsupportedOperationException("Not yet implemented");
            }
            if (Intrinsics.areEqual(bool2, obj)) {
                try {
                    if (!hf.f.a) {
                        z10 = true;
                    } else {
                        b bVar2 = hf.f.f19113d;
                        if (bVar2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("remoteConfig");
                        } else {
                            bVar = bVar2;
                        }
                        z10 = bVar.a("on_show_dialog_consent");
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    z10 = false;
                }
                if (z10) {
                    new Handler().postDelayed(new k8.f(this, 13), DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
                }
            }
        }
        Intrinsics.checkNotNullParameter(this, "context");
        if (u0.f26305k == null && hf.f.b() && !g3.c.a().f18018m) {
            g r6 = g.r();
            hf.b bVar3 = new hf.b(i13);
            r6.getClass();
            e3.a aVar = new e3.a();
            c3.j.b().c(this, "ca-app-pub-6691965685689933/3187736896", new d3.a(aVar, bVar3));
            u0.f26305k = aVar;
        }
        LocationRequest create = LocationRequest.create();
        create.setPriority(102);
        create.setInterval(1000L);
        this.f16648m = LocationServices.getFusedLocationProviderClient((Activity) this);
        ViewPager2 viewPager2 = ((u) n()).G;
        viewPager2.setAdapter(new h(this));
        viewPager2.setUserInputEnabled(false);
        Intrinsics.checkNotNullExpressionValue(viewPager2, "apply(...)");
        O(0);
        String string = getString(R.string.location_permission_needed);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(R.string.des_location_permission);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        new l(this, string, string2, new fg.c(this, i12));
        String string3 = getString(R.string.camera_permission_needed);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = getString(R.string.des_camera_permission);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        this.f16649n = new l(this, string3, string4, new fg.c(this, i13));
        new k(this);
        a4.c cVar = new a4.c(this);
        cVar.b();
        cVar.f86c = new fg.a(this);
        d a = cVar.a();
        this.f16650o = a;
        a.J(new s0(this, 2));
        g3.c.a().f18008c = new ag.b(this, 1);
        ((u) n()).F.setSelected(true);
        ((u) n()).E.setSelected(true);
        if (!GlobalApp.f16596j) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (!i.j(this)) {
                    if (ac.e.g() < 2) {
                        ac.e.t(Integer.valueOf(ac.e.g() + 1), "count_denied_notify_permission_time");
                        Intrinsics.checkNotNullParameter(this, "act");
                        androidx.core.app.i.a(this, new String[]{"android.permission.POST_NOTIFICATIONS"}, TTAdConstant.STYLE_SIZE_RADIO_2_3);
                        this.f16651p = true;
                    }
                } else {
                    N();
                }
            } else {
                N();
            }
            GlobalApp.f16596j = true;
        }
    }

    @Override // mf.a
    public final void r() {
        L().f16656h.observe(this, new of.b(6, l1.f22315k));
        L().f16658j.observe(this, new of.b(6, new fg.d(this, 0)));
        L().f16660l.observe(this, new of.b(6, new fg.e(this)));
    }

    @Override // mf.a
    public final void s() {
        LinearLayout btnTabHome = ((u) n()).f20894t;
        Intrinsics.checkNotNullExpressionValue(btnTabHome, "btnTabHome");
        e.p(btnTabHome, new fg.d(this, 1));
        LinearLayout btnTabMyPlant = ((u) n()).u;
        Intrinsics.checkNotNullExpressionValue(btnTabMyPlant, "btnTabMyPlant");
        e.p(btnTabMyPlant, new fg.d(this, 2));
        ImageView imgAdd = ((u) n()).f20899z;
        Intrinsics.checkNotNullExpressionValue(imgAdd, "imgAdd");
        e.p(imgAdd, new fg.d(this, 3));
        ImageView icSettingHome = ((u) n()).f20895v;
        Intrinsics.checkNotNullExpressionValue(icSettingHome, "icSettingHome");
        e.p(icSettingHome, new fg.d(this, 4));
        TextView tvTapToEnable = ((u) n()).E;
        Intrinsics.checkNotNullExpressionValue(tvTapToEnable, "tvTapToEnable");
        e.p(tvTapToEnable, new fg.d(this, 5));
        LottieAnimationView icVip = ((u) n()).f20898y;
        Intrinsics.checkNotNullExpressionValue(icVip, "icVip");
        e.p(icVip, new fg.d(this, 6));
    }
}
