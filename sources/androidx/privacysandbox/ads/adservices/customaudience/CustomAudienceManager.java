package androidx.privacysandbox.ads.adservices.customaudience;

import android.annotation.SuppressLint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.compose.foundation.text.input.internal.e;
import b1.f0;
import b1.l;
import h0.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class CustomAudienceManager {

    @RequiresExtension
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    /* loaded from: classes3.dex */
    public static final class Api33Ext4Impl extends CustomAudienceManager {
        @RequiresPermission
        @DoNotInline
        @Nullable
        public Object a(@NotNull JoinCustomAudienceRequest joinCustomAudienceRequest, @NotNull g gVar) {
            new l(1, f0.r(gVar)).p();
            a.p();
            joinCustomAudienceRequest.getClass();
            e.i();
            throw null;
        }

        @RequiresPermission
        @DoNotInline
        @Nullable
        public Object b(@NotNull LeaveCustomAudienceRequest leaveCustomAudienceRequest, @NotNull g gVar) {
            new l(1, f0.r(gVar)).p();
            e.D();
            leaveCustomAudienceRequest.getClass();
            throw null;
        }
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
    }
}
