package androidx.core.os;

import android.os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.contentcapture.a;
import b1.l;

@RequiresApi
/* loaded from: classes3.dex */
public final class OutcomeReceiverKt {
    public static final OutcomeReceiver a(l lVar) {
        return a.g(new ContinuationOutcomeReceiver(lVar));
    }
}
