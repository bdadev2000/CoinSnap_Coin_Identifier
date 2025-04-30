package z6;

import F7.p;
import Q7.AbstractC0255x;
import Q7.F;
import Q7.InterfaceC0253v;
import android.graphics.Bitmap;
import android.widget.Toast;
import com.tools.arruler.photomeasure.camera.ruler.R;
import com.tools.arruler.ui.component.arruler.ArRulerActivity;
import t7.AbstractC2712a;
import t7.y;
import x7.EnumC2928a;
import y7.AbstractC2960i;

/* loaded from: classes3.dex */
public final class g extends AbstractC2960i implements p {

    /* renamed from: g, reason: collision with root package name */
    public int f24561g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ArRulerActivity f24562h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Bitmap f24563i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ArRulerActivity arRulerActivity, Bitmap bitmap, w7.f fVar) {
        super(2, fVar);
        this.f24562h = arRulerActivity;
        this.f24563i = bitmap;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        return new g(this.f24562h, this.f24563i, fVar);
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        return ((g) c((InterfaceC0253v) obj, (w7.f) obj2)).i(y.f23029a);
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        EnumC2928a enumC2928a = EnumC2928a.b;
        int i9 = this.f24561g;
        ArRulerActivity arRulerActivity = this.f24562h;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC2712a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC2712a.f(obj);
            X7.d dVar = F.b;
            f fVar = new f(arRulerActivity, this.f24563i, null);
            this.f24561g = 1;
            if (AbstractC0255x.s(fVar, this, dVar) == enumC2928a) {
                return enumC2928a;
            }
        }
        Toast.makeText(arRulerActivity, R.string.screenshot_successful, 0).show();
        return y.f23029a;
    }
}
