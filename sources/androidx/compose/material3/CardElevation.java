package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Dp;

@Immutable
/* loaded from: classes.dex */
public final class CardElevation {

    /* renamed from: a, reason: collision with root package name */
    public final float f8117a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8118b;

    /* renamed from: c, reason: collision with root package name */
    public final float f8119c;
    public final float d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final float f8120f;

    public CardElevation(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.f8117a = f2;
        this.f8118b = f3;
        this.f8119c = f4;
        this.d = f5;
        this.e = f6;
        this.f8120f = f7;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.runtime.State a(boolean r15, androidx.compose.foundation.interaction.MutableInteractionSource r16, androidx.compose.runtime.Composer r17, int r18) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CardElevation.a(boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int):androidx.compose.runtime.State");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CardElevation)) {
            return false;
        }
        CardElevation cardElevation = (CardElevation) obj;
        return Dp.a(this.f8117a, cardElevation.f8117a) && Dp.a(this.f8118b, cardElevation.f8118b) && Dp.a(this.f8119c, cardElevation.f8119c) && Dp.a(this.d, cardElevation.d) && Dp.a(this.f8120f, cardElevation.f8120f);
    }

    public final int hashCode() {
        return Float.hashCode(this.f8120f) + d.b(this.d, d.b(this.f8119c, d.b(this.f8118b, Float.hashCode(this.f8117a) * 31, 31), 31), 31);
    }
}
