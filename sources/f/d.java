package f;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends b {
    @Override // f.b
    public final Intent a(ComponentActivity context, Object obj) {
        Intent input = (Intent) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return input;
    }

    @Override // f.b
    public final Object c(int i10, Intent intent) {
        return new androidx.activity.result.a(i10, intent);
    }
}
