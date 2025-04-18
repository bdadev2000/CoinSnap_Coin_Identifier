package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.unit.Density;

@StabilityInferred
/* loaded from: classes2.dex */
public final class DrawCache {

    /* renamed from: a, reason: collision with root package name */
    public AndroidImageBitmap f15280a;

    /* renamed from: b, reason: collision with root package name */
    public AndroidCanvas f15281b;

    /* renamed from: c, reason: collision with root package name */
    public Density f15282c;
    public long d = 0;
    public int e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final CanvasDrawScope f15283f = new CanvasDrawScope();
}
