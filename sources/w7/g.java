package w7;

import com.google.android.gms.common.internal.Preconditions;
import s7.x1;

/* loaded from: classes3.dex */
public abstract class g extends Exception {
    public g() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, int i10) {
        super(str);
        if (i10 != 1) {
        } else {
            Preconditions.checkNotEmpty(str, "Detail message must not be empty");
            super(str);
        }
    }

    public g(x1 x1Var) {
        super(x1Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, Throwable th2, int i10) {
        super(str, th2);
        if (i10 != 1) {
        } else {
            Preconditions.checkNotEmpty(str, "Detail message must not be empty");
            super(str, th2);
        }
    }
}
