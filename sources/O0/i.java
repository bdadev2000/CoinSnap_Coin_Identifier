package o0;

import G7.j;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public abstract class i extends RuntimeException {
    public final Fragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Fragment fragment, String str) {
        super(str);
        j.e(fragment, "fragment");
        this.b = fragment;
    }
}
