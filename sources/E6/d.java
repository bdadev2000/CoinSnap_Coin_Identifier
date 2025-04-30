package E6;

import G6.h;
import G6.n;
import G7.j;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.ar.core.ArCoreApk;
import com.tools.arruler.ui.component.arruler.ArRulerActivity;
import com.tools.arruler.ui.component.home.HomeActivity;
import com.tools.arruler.ui.component.permission.PermissionActivity;
import t7.y;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements F7.a {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1044c;

    public /* synthetic */ d(Object obj, int i9) {
        this.b = i9;
        this.f1044c = obj;
    }

    @Override // F7.a
    public final Object invoke() {
        y yVar = y.f23029a;
        Object obj = this.f1044c;
        switch (this.b) {
            case 0:
                int i9 = HomeActivity.m;
                HomeActivity homeActivity = (HomeActivity) obj;
                j.e(homeActivity, "this$0");
                homeActivity.finish();
                return yVar;
            case 1:
                n nVar = (n) obj;
                j.e(nVar, "this$0");
                int i10 = h.f1307a[ArCoreApk.getInstance().requestInstall(nVar.requireActivity(), false).ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new RuntimeException();
                    }
                } else {
                    nVar.startActivity(new Intent(nVar.requireContext(), (Class<?>) ArRulerActivity.class));
                }
                return yVar;
            case 2:
                int i11 = PermissionActivity.f19681i;
                PermissionActivity permissionActivity = (PermissionActivity) obj;
                j.e(permissionActivity, "this$0");
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.parse("package:" + permissionActivity.getPackageName()));
                permissionActivity.startActivity(intent);
                return yVar;
            default:
                View view = (View) obj;
                j.e(view, "$this_viewProperty");
                view.invalidate();
                return yVar;
        }
    }
}
