package u3;

import android.graphics.Paint;

/* loaded from: classes.dex */
public final class i extends Paint {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i10) {
        super(1);
        if (i10 != 1) {
            setStyle(Paint.Style.FILL);
        } else {
            super(1);
            setStyle(Paint.Style.STROKE);
        }
    }
}
