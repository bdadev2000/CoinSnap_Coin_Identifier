package G6;

import com.tools.arruler.models.InternalImageModel;
import com.tools.arruler.ui.component.library.ImageLibraryActivity;
import t7.y;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements F7.a {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InternalImageModel f1305c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1306d;

    public /* synthetic */ g(Object obj, InternalImageModel internalImageModel, int i9) {
        this.b = i9;
        this.f1306d = obj;
        this.f1305c = internalImageModel;
    }

    @Override // F7.a
    public final Object invoke() {
        y yVar = y.f23029a;
        InternalImageModel internalImageModel = this.f1305c;
        Object obj = this.f1306d;
        switch (this.b) {
            case 0:
                n nVar = (n) obj;
                G7.j.e(nVar, "this$0");
                G7.j.e(internalImageModel, "$internalImageModel");
                nVar.h().e(internalImageModel);
                return yVar;
            default:
                int i9 = ImageLibraryActivity.l;
                ImageLibraryActivity imageLibraryActivity = (ImageLibraryActivity) obj;
                G7.j.e(imageLibraryActivity, "this$0");
                G7.j.e(internalImageModel, "$internalImageModel");
                imageLibraryActivity.u().e(internalImageModel);
                return yVar;
        }
    }
}
