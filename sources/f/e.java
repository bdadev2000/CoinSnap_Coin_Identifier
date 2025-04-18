package f;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import androidx.activity.result.j;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends b {
    @Override // f.b
    public final Intent a(ComponentActivity context, Object obj) {
        j input = (j) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", input);
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
        return putExtra;
    }

    @Override // f.b
    public final Object c(int i10, Intent intent) {
        return new androidx.activity.result.a(i10, intent);
    }
}
