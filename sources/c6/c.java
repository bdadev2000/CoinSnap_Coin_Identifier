package C6;

import android.icu.text.DecimalFormat;
import t7.y;
import u6.AbstractC2787c;
import w7.f;

/* loaded from: classes3.dex */
public final class c implements T7.c {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC2787c f575c;

    public /* synthetic */ c(AbstractC2787c abstractC2787c, int i9) {
        this.b = i9;
        this.f575c = abstractC2787c;
    }

    @Override // T7.c
    public final Object a(Object obj, f fVar) {
        switch (this.b) {
            case 0:
                this.f575c.f23275x.setText(new DecimalFormat("#0.0").format(new Float(((Number) obj).floatValue() * 10)));
                return y.f23029a;
            default:
                this.f575c.f23276y.setText(new DecimalFormat("#0.0").format(new Float(((Number) obj).floatValue() * 10)));
                return y.f23029a;
        }
    }
}
