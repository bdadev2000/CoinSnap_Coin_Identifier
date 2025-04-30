package U3;

import M0.C0219j;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes2.dex */
public final class e extends p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3148e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(o oVar, int i9) {
        super(oVar);
        this.f3148e = i9;
    }

    @Override // U3.p
    public void r() {
        switch (this.f3148e) {
            case 0:
                o oVar = this.b;
                oVar.f3180q = null;
                CheckableImageButton checkableImageButton = oVar.f3174i;
                checkableImageButton.setOnLongClickListener(null);
                C0219j.x(checkableImageButton, null);
                return;
            default:
                return;
        }
    }
}
