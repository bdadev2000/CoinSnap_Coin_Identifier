package z6;

import F7.p;
import G7.j;
import Q7.InterfaceC0253v;
import Q7.n0;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import com.tools.arruler.ui.component.arruler.ArRulerActivity;
import java.io.File;
import java.io.FileOutputStream;
import t7.AbstractC2712a;
import t7.y;
import w6.C2910a;
import y7.AbstractC2960i;

/* loaded from: classes3.dex */
public final class f extends AbstractC2960i implements p {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ArRulerActivity f24559g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Bitmap f24560h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ArRulerActivity arRulerActivity, Bitmap bitmap, w7.f fVar) {
        super(2, fVar);
        this.f24559g = arRulerActivity;
        this.f24560h = bitmap;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        return new f(this.f24559g, this.f24560h, fVar);
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        f fVar = (f) c((InterfaceC0253v) obj, (w7.f) obj2);
        y yVar = y.f23029a;
        fVar.i(yVar);
        return yVar;
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        AbstractC2712a.f(obj);
        int i9 = ArRulerActivity.f19637r;
        i iVar = (i) this.f24559g.f19645o.getValue();
        Bitmap bitmap = this.f24560h;
        j.e(bitmap, "bitmap");
        C2910a c2910a = iVar.b;
        c2910a.getClass();
        File file = new File(c2910a.f23994a.getCacheDir(), "images");
        if (!file.exists()) {
            file.mkdirs();
        }
        a7.b bVar = a7.b.f4076f;
        if (bVar != null) {
            int i10 = ((SharedPreferences) bVar.f4078d).getInt("NUMBER_SAVE_IMAGE", 0) + 1;
            String f9 = n0.f(i10, "Image_", ".png");
            a7.b bVar2 = a7.b.f4076f;
            if (bVar2 != null) {
                ((SharedPreferences) bVar2.f4078d).edit().putInt("NUMBER_SAVE_IMAGE", i10).apply();
                File file2 = new File(file, f9);
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, new FileOutputStream(file2));
                file2.setLastModified(System.currentTimeMillis());
                bitmap.recycle();
                return y.f23029a;
            }
            throw new IllegalStateException(a7.b.class.getSimpleName().concat(" is not initialized, call initializeInstance(..) method first."));
        }
        throw new IllegalStateException(a7.b.class.getSimpleName().concat(" is not initialized, call initializeInstance(..) method first."));
    }
}
