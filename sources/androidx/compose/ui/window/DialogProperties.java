package androidx.compose.ui.window;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes4.dex */
public final class DialogProperties {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f17670a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17671b;

    /* renamed from: c, reason: collision with root package name */
    public final SecureFlagPolicy f17672c;
    public final boolean d;
    public final boolean e;

    public DialogProperties(boolean z2, boolean z3, boolean z4) {
        SecureFlagPolicy secureFlagPolicy = SecureFlagPolicy.f17706a;
        this.f17670a = z2;
        this.f17671b = z3;
        this.f17672c = secureFlagPolicy;
        this.d = z4;
        this.e = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogProperties)) {
            return false;
        }
        DialogProperties dialogProperties = (DialogProperties) obj;
        return this.f17670a == dialogProperties.f17670a && this.f17671b == dialogProperties.f17671b && this.f17672c == dialogProperties.f17672c && this.d == dialogProperties.d && this.e == dialogProperties.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + d.g(this.d, (this.f17672c.hashCode() + d.g(this.f17671b, Boolean.hashCode(this.f17670a) * 31, 31)) * 31, 31);
    }

    public /* synthetic */ DialogProperties(int i2) {
        this((i2 & 1) != 0, (i2 & 2) != 0, (i2 & 4) != 0);
    }
}
