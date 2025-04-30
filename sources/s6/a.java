package S6;

import F7.l;
import G7.j;
import android.widget.ImageView;
import com.tools.arruler.ui.component.permission.PermissionActivity;
import t2.b;
import t7.y;
import u6.AbstractC2801q;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements l {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2807c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2808d;

    public /* synthetic */ a(int i9, Object obj, Object obj2) {
        this.b = i9;
        this.f2807c = obj;
        this.f2808d = obj2;
    }

    @Override // F7.l
    public final Object invoke(Object obj) {
        Object obj2 = this.f2808d;
        Object obj3 = this.f2807c;
        switch (this.b) {
            case 0:
                int i9 = PermissionActivity.f19681i;
                AbstractC2801q abstractC2801q = (AbstractC2801q) obj3;
                j.e(abstractC2801q, "$this_apply");
                PermissionActivity permissionActivity = (PermissionActivity) obj2;
                j.e(permissionActivity, "this$0");
                ImageView imageView = abstractC2801q.f23395s;
                imageView.setActivated(!imageView.isActivated());
                if (imageView.isActivated()) {
                    permissionActivity.f19684h.a("android.permission.CAMERA");
                }
                return y.f23029a;
            default:
                float floatValue = ((Float) obj).floatValue();
                b bVar = (b) obj3;
                j.e(bVar, "$a");
                b bVar2 = (b) obj2;
                j.e(bVar2, "$direction");
                return new b((bVar2.f23006a * floatValue) + bVar.f23006a, (bVar2.b * floatValue) + bVar.b, (floatValue * bVar2.f23007c) + bVar.f23007c);
        }
    }
}
