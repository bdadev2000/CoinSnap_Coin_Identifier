package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;

@Immutable
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public final class SearchBarColors {

    /* renamed from: a, reason: collision with root package name */
    public final long f10856a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10857b;

    /* renamed from: c, reason: collision with root package name */
    public final TextFieldColors f10858c;

    public SearchBarColors(long j2, long j3, TextFieldColors textFieldColors) {
        this.f10856a = j2;
        this.f10857b = j3;
        this.f10858c = textFieldColors;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchBarColors)) {
            return false;
        }
        SearchBarColors searchBarColors = (SearchBarColors) obj;
        return Color.c(this.f10856a, searchBarColors.f10856a) && Color.c(this.f10857b, searchBarColors.f10857b) && p0.a.g(this.f10858c, searchBarColors.f10858c);
    }

    public final int hashCode() {
        int i2 = Color.f14963j;
        return this.f10858c.hashCode() + d.d(this.f10857b, Long.hashCode(this.f10856a) * 31, 31);
    }
}
