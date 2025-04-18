package fg;

import android.content.Intent;
import android.view.View;
import com.plantcare.ai.identifier.plantid.ui.component.iap.IapActivity;
import com.plantcare.ai.identifier.plantid.ui.component.main.MainActivity;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.camera.PlantIdentifierActivity;
import com.plantcare.ai.identifier.plantid.ui.component.setting.SettingActivity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import sf.l;
import v8.u0;

/* loaded from: classes4.dex */
public final class d extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17865b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MainActivity f17866c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(MainActivity mainActivity, int i10) {
        super(1);
        this.f17865b = i10;
        this.f17866c = mainActivity;
    }

    public final void a(View view) {
        int i10 = this.f17865b;
        MainActivity activity = this.f17866c;
        switch (i10) {
            case 1:
                int i11 = MainActivity.f16644q;
                activity.O(0);
                return;
            case 2:
                int i12 = MainActivity.f16644q;
                activity.O(1);
                return;
            case 3:
                int i13 = MainActivity.f16644q;
                activity.getClass();
                int i14 = 2;
                if (x5.i.h(activity)) {
                    if (x5.i.l()) {
                        activity.startActivity(new Intent(activity, (Class<?>) PlantIdentifierActivity.class));
                        return;
                    }
                    if (x5.i.k() && x5.i.b()) {
                        activity.startActivity(new Intent(activity, (Class<?>) PlantIdentifierActivity.class));
                        return;
                    }
                    if (hf.f.d()) {
                        activity.startActivity(new Intent(activity, (Class<?>) PlantIdentifierActivity.class));
                        return;
                    }
                    c cVar = new c(activity, i14);
                    c6.c.a++;
                    if (com.facebook.internal.i.A(activity) && hf.f.b() && c6.c.a % 2 == 0) {
                        d3.g r6 = d3.g.r();
                        e3.a aVar = u0.f26305k;
                        f fVar = new f(cVar, 0);
                        r6.getClass();
                        d3.g.m(activity, aVar, fVar);
                        return;
                    }
                    cVar.invoke();
                    return;
                }
                if (ac.e.d() >= 2) {
                    l lVar = activity.f16649n;
                    if (lVar != null) {
                        lVar.show();
                        return;
                    }
                    return;
                }
                ac.e.t(Integer.valueOf(ac.e.d() + 1), "count_denied_camera_permission_time");
                Intrinsics.checkNotNullParameter(activity, "activity");
                androidx.core.app.i.a(activity, new String[]{"android.permission.CAMERA"}, 333);
                return;
            case 4:
                int i15 = MainActivity.f16644q;
                activity.getClass();
                activity.startActivity(new Intent(activity, (Class<?>) SettingActivity.class));
                return;
            case 5:
                int i16 = MainActivity.f16644q;
                activity.N();
                return;
            default:
                activity.startActivity(new Intent(activity, (Class<?>) IapActivity.class));
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x018a, code lost:
    
        if (r15 == null) goto L30;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fg.d.invoke(java.lang.Object):java.lang.Object");
    }
}
