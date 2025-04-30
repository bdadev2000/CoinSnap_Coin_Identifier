package N6;

import F7.p;
import Q7.InterfaceC0253v;
import T7.s;
import com.tools.arruler.ui.component.library.ImageLibraryActivity;
import t7.AbstractC2712a;
import t7.y;
import x7.EnumC2928a;
import y7.AbstractC2960i;

/* loaded from: classes3.dex */
public final class e extends AbstractC2960i implements p {

    /* renamed from: g, reason: collision with root package name */
    public int f2110g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ImageLibraryActivity f2111h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ O6.c f2112i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ImageLibraryActivity imageLibraryActivity, O6.c cVar, w7.f fVar) {
        super(2, fVar);
        this.f2111h = imageLibraryActivity;
        this.f2112i = cVar;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        return new e(this.f2111h, this.f2112i, fVar);
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        return ((e) c((InterfaceC0253v) obj, (w7.f) obj2)).i(y.f23029a);
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        EnumC2928a enumC2928a = EnumC2928a.b;
        int i9 = this.f2110g;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC2712a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC2712a.f(obj);
            int i10 = ImageLibraryActivity.l;
            ImageLibraryActivity imageLibraryActivity = this.f2111h;
            j u8 = imageLibraryActivity.u();
            d dVar = new d(imageLibraryActivity, this.f2112i, null);
            this.f2110g = 1;
            if (s.b(u8.f2121f, dVar, this) == enumC2928a) {
                return enumC2928a;
            }
        }
        return y.f23029a;
    }
}
