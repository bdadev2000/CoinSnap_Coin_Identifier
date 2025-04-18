package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.state.ToggleableState;

@Immutable
/* loaded from: classes2.dex */
public final class CheckboxColors {

    /* renamed from: a, reason: collision with root package name */
    public final long f8190a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8191b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8192c;
    public final long d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final long f8193f;

    /* renamed from: g, reason: collision with root package name */
    public final long f8194g;

    /* renamed from: h, reason: collision with root package name */
    public final long f8195h;

    /* renamed from: i, reason: collision with root package name */
    public final long f8196i;

    /* renamed from: j, reason: collision with root package name */
    public final long f8197j;

    /* renamed from: k, reason: collision with root package name */
    public final long f8198k;

    /* renamed from: l, reason: collision with root package name */
    public final long f8199l;

    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public CheckboxColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        this.f8190a = j2;
        this.f8191b = j3;
        this.f8192c = j4;
        this.d = j5;
        this.e = j6;
        this.f8193f = j7;
        this.f8194g = j8;
        this.f8195h = j9;
        this.f8196i = j10;
        this.f8197j = j11;
        this.f8198k = j12;
        this.f8199l = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CheckboxColors)) {
            return false;
        }
        CheckboxColors checkboxColors = (CheckboxColors) obj;
        return Color.c(this.f8190a, checkboxColors.f8190a) && Color.c(this.f8191b, checkboxColors.f8191b) && Color.c(this.f8192c, checkboxColors.f8192c) && Color.c(this.d, checkboxColors.d) && Color.c(this.e, checkboxColors.e) && Color.c(this.f8193f, checkboxColors.f8193f) && Color.c(this.f8194g, checkboxColors.f8194g) && Color.c(this.f8195h, checkboxColors.f8195h) && Color.c(this.f8196i, checkboxColors.f8196i) && Color.c(this.f8197j, checkboxColors.f8197j) && Color.c(this.f8198k, checkboxColors.f8198k) && Color.c(this.f8199l, checkboxColors.f8199l);
    }

    public final int hashCode() {
        int i2 = Color.f14963j;
        return Long.hashCode(this.f8199l) + d.d(this.f8198k, d.d(this.f8197j, d.d(this.f8196i, d.d(this.f8195h, d.d(this.f8194g, d.d(this.f8193f, d.d(this.e, d.d(this.d, d.d(this.f8192c, d.d(this.f8191b, Long.hashCode(this.f8190a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
