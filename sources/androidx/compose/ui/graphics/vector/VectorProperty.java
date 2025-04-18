package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Brush;
import java.util.List;

@StabilityInferred
/* loaded from: classes.dex */
public abstract class VectorProperty<T> {

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class Fill extends VectorProperty<Brush> {
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class FillAlpha extends VectorProperty<Float> {
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class PathData extends VectorProperty<List<? extends PathNode>> {
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class PivotX extends VectorProperty<Float> {
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class PivotY extends VectorProperty<Float> {
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class Rotation extends VectorProperty<Float> {
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class ScaleX extends VectorProperty<Float> {
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class ScaleY extends VectorProperty<Float> {
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class Stroke extends VectorProperty<Brush> {
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class StrokeAlpha extends VectorProperty<Float> {
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class StrokeLineWidth extends VectorProperty<Float> {
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class TranslateX extends VectorProperty<Float> {
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class TranslateY extends VectorProperty<Float> {
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class TrimPathEnd extends VectorProperty<Float> {
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class TrimPathOffset extends VectorProperty<Float> {
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class TrimPathStart extends VectorProperty<Float> {
    }
}
