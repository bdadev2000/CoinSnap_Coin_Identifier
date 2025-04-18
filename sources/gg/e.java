package gg;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.ads.control.admob.AppOpenManager;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.service.LoadAlarmsReceiver;
import com.plantcare.ai.identifier.plantid.service.LoadAlarmsService;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.camera.PlantIdentifierActivity;
import kf.z1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import sf.k;
import sf.l;
import v8.u0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lgg/e;", "Lmf/d;", "Lkf/z1;", "<init>", "()V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class e extends mf.d<z1> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f18467j = 0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18468c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18469d;

    /* renamed from: f, reason: collision with root package name */
    public l f18470f;

    /* renamed from: g, reason: collision with root package name */
    public l f18471g;

    /* renamed from: h, reason: collision with root package name */
    public LoadAlarmsReceiver f18472h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.activity.result.c f18473i;

    public e() {
        androidx.activity.result.c registerForActivityResult = registerForActivityResult(new f.d(), new gb.d(this, 9));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.f18473i = registerForActivityResult;
    }

    public static final void h(e eVar) {
        eVar.f18468c = false;
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", eVar.requireContext().getPackageName(), null));
        eVar.startActivity(intent);
        AppOpenManager.f().f2914k = false;
    }

    public static final void i(e eVar, int i10) {
        Context requireContext = eVar.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        if (!x5.i.h(requireContext)) {
            if (ac.e.d() >= 2) {
                l lVar = eVar.f18470f;
                if (lVar != null) {
                    lVar.show();
                    return;
                }
                return;
            }
            ac.e.t(Integer.valueOf(ac.e.d() + 1), "count_denied_camera_permission_time");
            FragmentActivity activity = eVar.requireActivity();
            Intrinsics.checkNotNullExpressionValue(activity, "requireActivity(...)");
            Intrinsics.checkNotNullParameter(activity, "activity");
            androidx.core.app.i.a(activity, new String[]{"android.permission.CAMERA"}, 333);
            return;
        }
        if (x5.i.l()) {
            Intent intent = new Intent(eVar.requireContext(), (Class<?>) PlantIdentifierActivity.class);
            intent.putExtra("KEY_TAB_PLANT_SCAN", i10);
            eVar.startActivity(intent);
            return;
        }
        eVar.k(new d(eVar, i10));
    }

    public static void l(FragmentActivity fragmentActivity, c1.d dVar) {
        if (com.facebook.internal.i.A(fragmentActivity) && hf.f.b()) {
            int i10 = c6.c.a;
            if (i10 % 2 == 0) {
                c6.c.a = i10 + 1;
                d3.g r6 = d3.g.r();
                e3.a aVar = u0.f26305k;
                fg.f fVar = new fg.f(dVar, 1);
                r6.getClass();
                d3.g.m(fragmentActivity, aVar, fVar);
                return;
            }
        }
        dVar.invoke();
    }

    @Override // mf.d
    public final int b() {
        return R.layout.fragment_home;
    }

    @Override // mf.d
    public final void e() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            new k(activity);
        }
        j();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        String string = getString(R.string.camera_permission_needed);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(R.string.des_camera_permission);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this.f18470f = new l(requireContext, string, string2, new b(this, 0));
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        String string3 = getString(R.string.notification_needed);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = getString(R.string.des_noti_permission);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        this.f18471g = new l(requireContext2, string3, string4, new b(this, 1));
    }

    @Override // mf.d
    public final void g() {
        FrameLayout btnPlantIdentifier = ((z1) c()).f20944x;
        Intrinsics.checkNotNullExpressionValue(btnPlantIdentifier, "btnPlantIdentifier");
        com.bumptech.glide.e.p(btnPlantIdentifier, new c(this, 0));
        LinearLayout btnReminder = ((z1) c()).f20945y;
        Intrinsics.checkNotNullExpressionValue(btnReminder, "btnReminder");
        com.bumptech.glide.e.p(btnReminder, new c(this, 1));
        LinearLayout btnDiseases = ((z1) c()).f20942v;
        Intrinsics.checkNotNullExpressionValue(btnDiseases, "btnDiseases");
        com.bumptech.glide.e.p(btnDiseases, new c(this, 2));
        LinearLayout btnLightMeter = ((z1) c()).f20943w;
        Intrinsics.checkNotNullExpressionValue(btnLightMeter, "btnLightMeter");
        com.bumptech.glide.e.p(btnLightMeter, new c(this, 3));
        LinearLayout btnDiagnose = ((z1) c()).u;
        Intrinsics.checkNotNullExpressionValue(btnDiagnose, "btnDiagnose");
        com.bumptech.glide.e.p(btnDiagnose, new c(this, 4));
    }

    public final void j() {
        int f10 = x5.i.f();
        Integer valueOf = Integer.valueOf(R.drawable.bg_btn_plant_identifier);
        if (f10 == 0) {
            LinearLayout layoutCountScan = ((z1) c()).A;
            Intrinsics.checkNotNullExpressionValue(layoutCountScan, "layoutCountScan");
            com.bumptech.glide.e.D(layoutCountScan);
            FrameLayout frAds = ((z1) c()).f20946z;
            Intrinsics.checkNotNullExpressionValue(frAds, "frAds");
            com.bumptech.glide.e.D(frAds);
            com.bumptech.glide.b.f(this).j(valueOf).v(((z1) c()).f20941t);
            return;
        }
        if (x5.i.b() && x5.i.k()) {
            com.bumptech.glide.b.f(this).j(valueOf).v(((z1) c()).f20941t);
            LinearLayout layoutCountScan2 = ((z1) c()).A;
            Intrinsics.checkNotNullExpressionValue(layoutCountScan2, "layoutCountScan");
            com.bumptech.glide.e.V(layoutCountScan2);
            ((z1) c()).D.setText("(" + x5.i.d().f2795b + '/' + x5.i.d().a + ") " + getString(R.string.left));
            return;
        }
        if (hf.f.d()) {
            com.bumptech.glide.b.f(this).j(valueOf).v(((z1) c()).f20941t);
            LinearLayout layoutCountScan3 = ((z1) c()).A;
            Intrinsics.checkNotNullExpressionValue(layoutCountScan3, "layoutCountScan");
            com.bumptech.glide.e.V(layoutCountScan3);
            ((z1) c()).D.setText("(" + x5.i.d().f2795b + '/' + x5.i.d().a + ") " + getString(R.string.left));
            return;
        }
        com.bumptech.glide.b.f(this).j(Integer.valueOf(R.drawable.bg_btn_plant_identifier_ads)).v(((z1) c()).f20941t);
        LinearLayout layoutCountScan4 = ((z1) c()).A;
        Intrinsics.checkNotNullExpressionValue(layoutCountScan4, "layoutCountScan");
        com.bumptech.glide.e.D(layoutCountScan4);
    }

    public final void k(Function0 function0) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (x5.i.l()) {
                function0.invoke();
                return;
            }
            if (x5.i.k()) {
                if (x5.i.b()) {
                    function0.invoke();
                    return;
                } else {
                    l(activity, new c1.d(function0, 4));
                    return;
                }
            }
            l(activity, new c1.d(function0, 5));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f18472h = new LoadAlarmsReceiver(new nb.a(12));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        x5.i.i(requireContext);
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        x5.i.h(requireContext2);
        if (!this.f18468c && !x5.i.l()) {
            if (x5.i.b()) {
                this.f18468c = false;
                AppOpenManager.f().f2914k = false;
            } else {
                this.f18468c = true;
                AppOpenManager.f().f2914k = true;
            }
        }
        j();
        x5.i.c(new b(this, 5), new b(this, 6));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        IntentFilter intentFilter = new IntentFilter(LoadAlarmsService.f16606b);
        m1.b a = m1.b.a(requireContext());
        LoadAlarmsReceiver loadAlarmsReceiver = this.f18472h;
        Intrinsics.checkNotNull(loadAlarmsReceiver);
        a.b(loadAlarmsReceiver, intentFilter);
        LoadAlarmsService.a(getContext());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        LoadAlarmsReceiver loadAlarmsReceiver = this.f18472h;
        if (loadAlarmsReceiver != null) {
            m1.b.a(requireContext()).d(loadAlarmsReceiver);
        }
    }
}
