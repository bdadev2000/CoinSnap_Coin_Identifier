package q;

import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: q.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2594d0 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) C2596e0.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
}
