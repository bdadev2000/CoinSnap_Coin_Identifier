package gg;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.ads.control.admob.AppOpenManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.plantcare.ai.identifier.plantid.ui.component.diagnose.DiagnoseActivity;
import com.plantcare.ai.identifier.plantid.ui.component.remind.ReminderActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import sf.l;

/* loaded from: classes4.dex */
public final class c extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18463b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f18464c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, int i10) {
        super(1);
        this.f18463b = i10;
        this.f18464c = eVar;
    }

    public final void a(View view) {
        int i10 = this.f18463b;
        int i11 = 2;
        e eVar = this.f18464c;
        switch (i10) {
            case 0:
                e.i(eVar, 0);
                return;
            case 1:
                int i12 = e.f18467j;
                Context requireContext = eVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                if (x5.i.j(requireContext) && Settings.canDrawOverlays(eVar.requireContext())) {
                    if (x5.i.l()) {
                        eVar.f18473i.a(new Intent(eVar.requireContext(), (Class<?>) ReminderActivity.class));
                        return;
                    } else {
                        eVar.k(new b(eVar, 4));
                        return;
                    }
                }
                Context requireContext2 = eVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                if (!x5.i.j(requireContext2)) {
                    if (ac.e.g() < 2) {
                        ac.e.t(Integer.valueOf(ac.e.g() + 1), "count_denied_notify_permission_time");
                        FragmentActivity act = eVar.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(act, "requireActivity(...)");
                        Intrinsics.checkNotNullParameter(act, "act");
                        androidx.core.app.i.a(act, new String[]{"android.permission.POST_NOTIFICATIONS"}, TTAdConstant.STYLE_SIZE_RADIO_2_3);
                        return;
                    }
                    l lVar = eVar.f18471g;
                    if (lVar != null) {
                        lVar.show();
                        return;
                    }
                    return;
                }
                if (!Settings.canDrawOverlays(eVar.requireContext())) {
                    eVar.startActivity(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + eVar.requireContext().getPackageName())));
                    eVar.f18468c = false;
                    AppOpenManager.f().f2914k = false;
                    return;
                }
                return;
            case 2:
                if (x5.i.l()) {
                    int i13 = e.f18467j;
                    eVar.getClass();
                    eVar.startActivity(new Intent(eVar.requireContext(), (Class<?>) DiagnoseActivity.class));
                    return;
                } else {
                    b bVar = new b(eVar, i11);
                    int i14 = e.f18467j;
                    eVar.k(bVar);
                    return;
                }
            case 3:
                b bVar2 = new b(eVar, 3);
                int i15 = e.f18467j;
                eVar.k(bVar2);
                return;
            default:
                e.i(eVar, 1);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f18463b) {
            case 0:
                a((View) obj);
                return Unit.INSTANCE;
            case 1:
                a((View) obj);
                return Unit.INSTANCE;
            case 2:
                a((View) obj);
                return Unit.INSTANCE;
            case 3:
                a((View) obj);
                return Unit.INSTANCE;
            default:
                a((View) obj);
                return Unit.INSTANCE;
        }
    }
}
