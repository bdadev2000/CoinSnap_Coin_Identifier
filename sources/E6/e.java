package E6;

import F7.l;
import com.tools.arruler.ui.component.home.HomeActivity;
import f.o;

/* loaded from: classes3.dex */
public final class e extends o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1045d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1046e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(HomeActivity homeActivity) {
        super(true);
        this.f1046e = homeActivity;
    }

    @Override // f.o
    public final void b() {
        switch (this.f1045d) {
            case 0:
                B6.b bVar = ((HomeActivity) this.f1046e).f19653j;
                if (bVar != null) {
                    bVar.show();
                    return;
                }
                return;
            default:
                ((l) this.f1046e).invoke(this);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z8, z6.b bVar) {
        super(z8);
        this.f1046e = bVar;
    }
}
