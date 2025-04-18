package androidx.core.telephony;

import android.telephony.SubscriptionManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes2.dex */
public class SubscriptionManagerCompat {

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api29Impl {
        @DoNotInline
        public static int a(int i2) {
            return SubscriptionManager.getSlotIndex(i2);
        }
    }
}
