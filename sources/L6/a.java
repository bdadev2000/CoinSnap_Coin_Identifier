package L6;

import F7.l;
import G7.j;
import android.view.View;
import com.core.ar.model.Tool;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1826c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1827d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1828f;

    public /* synthetic */ a(b bVar, int i9, M6.a aVar, int i10) {
        this.b = i10;
        this.f1826c = bVar;
        this.f1827d = i9;
        this.f1828f = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                b bVar = (b) this.f1826c;
                j.e(bVar, "this$0");
                M6.a aVar = (M6.a) this.f1828f;
                j.e(aVar, "$obj");
                int i9 = bVar.m;
                bVar.m = this.f1827d;
                bVar.notifyItemChanged(i9);
                bVar.notifyItemChanged(bVar.m);
                bVar.l.invoke(aVar);
                return;
            case 1:
                b bVar2 = (b) this.f1826c;
                j.e(bVar2, "this$0");
                M6.a aVar2 = (M6.a) this.f1828f;
                j.e(aVar2, "$obj");
                int i10 = bVar2.m;
                bVar2.m = this.f1827d;
                bVar2.notifyItemChanged(i10);
                bVar2.notifyItemChanged(bVar2.m);
                bVar2.l.invoke(aVar2);
                return;
            default:
                Tool tool = (Tool) this.f1826c;
                j.e(tool, "$item");
                A6.b bVar3 = (A6.b) this.f1828f;
                j.e(bVar3, "this$0");
                boolean isPremium = tool.isPremium();
                l lVar = bVar3.f78j;
                if (!isPremium) {
                    if (lVar != null) {
                        lVar.invoke(tool);
                        return;
                    }
                    return;
                } else {
                    if (lVar != null) {
                        lVar.invoke(tool);
                    }
                    bVar3.notifyItemChanged(bVar3.l);
                    int i11 = this.f1827d;
                    bVar3.l = i11;
                    bVar3.notifyItemChanged(i11);
                    return;
                }
        }
    }

    public /* synthetic */ a(Tool tool, A6.b bVar, int i9) {
        this.b = 2;
        this.f1826c = tool;
        this.f1828f = bVar;
        this.f1827d = i9;
    }
}
