package f;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class b {
    public abstract Intent a(ComponentActivity componentActivity, Object obj);

    public a b(ComponentActivity context, Object obj) {
        Intrinsics.checkNotNullParameter(context, "context");
        return null;
    }

    public abstract Object c(int i10, Intent intent);
}
