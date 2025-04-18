package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPathMeasure;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathMeasure;

@Immutable
/* loaded from: classes4.dex */
final class CheckDrawingCache {

    /* renamed from: a, reason: collision with root package name */
    public final Path f8187a;

    /* renamed from: b, reason: collision with root package name */
    public final PathMeasure f8188b;

    /* renamed from: c, reason: collision with root package name */
    public final Path f8189c;

    public CheckDrawingCache() {
        AndroidPath a2 = AndroidPath_androidKt.a();
        AndroidPathMeasure androidPathMeasure = new AndroidPathMeasure(new android.graphics.PathMeasure());
        AndroidPath a3 = AndroidPath_androidKt.a();
        this.f8187a = a2;
        this.f8188b = androidPathMeasure;
        this.f8189c = a3;
    }
}
