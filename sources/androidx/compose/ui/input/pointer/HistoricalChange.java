package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Offset;

@Immutable
@ExperimentalComposeUiApi
/* loaded from: classes3.dex */
public final class HistoricalChange {

    /* renamed from: a, reason: collision with root package name */
    public final long f15548a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15549b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15550c;

    public HistoricalChange(long j2, long j3, long j4) {
        this.f15548a = j2;
        this.f15549b = j3;
        this.f15550c = j4;
    }

    public final String toString() {
        return "HistoricalChange(uptimeMillis=" + this.f15548a + ", position=" + ((Object) Offset.m(this.f15549b)) + ')';
    }
}
