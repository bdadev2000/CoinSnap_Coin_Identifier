package androidx.activity.result;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes3.dex */
final class ActivityResultCallerLauncher$resultContract$2 extends r implements a {
    @Override // q0.a
    public final Object invoke() {
        return new ActivityResultContract<b0, Object>() { // from class: androidx.activity.result.ActivityResultCallerLauncher$resultContract$2.1

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ActivityResultCallerLauncher f278a = null;

            @Override // androidx.activity.result.contract.ActivityResultContract
            public final Intent createIntent(Context context, Object obj) {
                this.f278a.getClass();
                throw null;
            }

            @Override // androidx.activity.result.contract.ActivityResultContract
            public final Object parseResult(int i2, Intent intent) {
                this.f278a.getClass();
                throw null;
            }
        };
    }
}
