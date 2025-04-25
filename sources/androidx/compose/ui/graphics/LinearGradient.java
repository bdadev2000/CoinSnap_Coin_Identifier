package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.data.LogEventArguments;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Brush.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001BA\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001e\u0010\u0013\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u00020\bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u00020\u000bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/ui/graphics/LinearGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "colors", "", "Landroidx/compose/ui/graphics/Color;", "stops", "", "start", "Landroidx/compose/ui/geometry/Offset;", TtmlNode.END, "tileMode", "Landroidx/compose/ui/graphics/TileMode;", "(Ljava/util/List;Ljava/util/List;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "I", "createShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", LogEventArguments.ARG_SIZE, "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class LinearGradient extends ShaderBrush {
    private final List<Color> colors;
    private final long end;
    private final long start;
    private final List<Float> stops;
    private final int tileMode;

    public /* synthetic */ LinearGradient(List list, List list2, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j, j2, i);
    }

    public /* synthetic */ LinearGradient(List list, List list2, long j, long j2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? null : list2, j, j2, (i2 & 16) != 0 ? TileMode.INSTANCE.m4888getClamp3opZhB0() : i, null);
    }

    private LinearGradient(List<Color> list, List<Float> list2, long j, long j2, int i) {
        this.colors = list;
        this.stops = list2;
        this.start = j;
        this.end = j2;
        this.tileMode = i;
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long getIntrinsicSize() {
        float f;
        float m4275getYimpl;
        float m4275getYimpl2;
        float m4274getXimpl = Offset.m4274getXimpl(this.start);
        float f2 = Float.NaN;
        if (!Float.isInfinite(m4274getXimpl) && !Float.isNaN(m4274getXimpl)) {
            float m4274getXimpl2 = Offset.m4274getXimpl(this.end);
            if (!Float.isInfinite(m4274getXimpl2) && !Float.isNaN(m4274getXimpl2)) {
                f = Math.abs(Offset.m4274getXimpl(this.start) - Offset.m4274getXimpl(this.end));
                m4275getYimpl = Offset.m4275getYimpl(this.start);
                if (!Float.isInfinite(m4275getYimpl) && !Float.isNaN(m4275getYimpl)) {
                    m4275getYimpl2 = Offset.m4275getYimpl(this.end);
                    if (!Float.isInfinite(m4275getYimpl2) && !Float.isNaN(m4275getYimpl2)) {
                        f2 = Math.abs(Offset.m4275getYimpl(this.start) - Offset.m4275getYimpl(this.end));
                    }
                }
                return SizeKt.Size(f, f2);
            }
        }
        f = Float.NaN;
        m4275getYimpl = Offset.m4275getYimpl(this.start);
        if (!Float.isInfinite(m4275getYimpl)) {
            m4275getYimpl2 = Offset.m4275getYimpl(this.end);
            if (!Float.isInfinite(m4275getYimpl2)) {
                f2 = Math.abs(Offset.m4275getYimpl(this.start) - Offset.m4275getYimpl(this.end));
            }
        }
        return SizeKt.Size(f, f2);
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* renamed from: createShader-uvyYCjk */
    public Shader mo4484createShaderuvyYCjk(long size) {
        return ShaderKt.m4830LinearGradientShaderVjE6UOU(OffsetKt.Offset(Offset.m4274getXimpl(this.start) == Float.POSITIVE_INFINITY ? Size.m4343getWidthimpl(size) : Offset.m4274getXimpl(this.start), Offset.m4275getYimpl(this.start) == Float.POSITIVE_INFINITY ? Size.m4340getHeightimpl(size) : Offset.m4275getYimpl(this.start)), OffsetKt.Offset(Offset.m4274getXimpl(this.end) == Float.POSITIVE_INFINITY ? Size.m4343getWidthimpl(size) : Offset.m4274getXimpl(this.end), Offset.m4275getYimpl(this.end) == Float.POSITIVE_INFINITY ? Size.m4340getHeightimpl(size) : Offset.m4275getYimpl(this.end)), this.colors, this.stops, this.tileMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinearGradient)) {
            return false;
        }
        LinearGradient linearGradient = (LinearGradient) other;
        return Intrinsics.areEqual(this.colors, linearGradient.colors) && Intrinsics.areEqual(this.stops, linearGradient.stops) && Offset.m4271equalsimpl0(this.start, linearGradient.start) && Offset.m4271equalsimpl0(this.end, linearGradient.end) && TileMode.m4884equalsimpl0(this.tileMode, linearGradient.tileMode);
    }

    public int hashCode() {
        int hashCode = this.colors.hashCode() * 31;
        List<Float> list = this.stops;
        return ((((((hashCode + (list != null ? list.hashCode() : 0)) * 31) + Offset.m4276hashCodeimpl(this.start)) * 31) + Offset.m4276hashCodeimpl(this.end)) * 31) + TileMode.m4885hashCodeimpl(this.tileMode);
    }

    public String toString() {
        return "LinearGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + (OffsetKt.m4291isFinitek4lQ0M(this.start) ? "start=" + ((Object) Offset.m4282toStringimpl(this.start)) + ", " : "") + (OffsetKt.m4291isFinitek4lQ0M(this.end) ? "end=" + ((Object) Offset.m4282toStringimpl(this.end)) + ", " : "") + "tileMode=" + ((Object) TileMode.m4886toStringimpl(this.tileMode)) + ')';
    }
}
