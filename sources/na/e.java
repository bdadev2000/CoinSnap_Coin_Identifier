package na;

import com.google.android.material.internal.CheckableImageButton;
import v8.u0;

/* loaded from: classes3.dex */
public final class e extends n {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22615e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(m mVar, int i10) {
        super(mVar);
        this.f22615e = i10;
    }

    @Override // na.n
    public final void r() {
        switch (this.f22615e) {
            case 0:
                m mVar = this.f22656b;
                mVar.f22649q = null;
                CheckableImageButton checkableImageButton = mVar.f22641i;
                checkableImageButton.setOnLongClickListener(null);
                u0.k0(checkableImageButton, null);
                return;
            default:
                return;
        }
    }
}
