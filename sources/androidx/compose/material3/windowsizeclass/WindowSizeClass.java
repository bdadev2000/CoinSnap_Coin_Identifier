package androidx.compose.material3.windowsizeclass;

import androidx.compose.ui.unit.DpSize;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.data.LogEventArguments;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: WindowSizeClass.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0019\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Landroidx/compose/material3/windowsizeclass/WindowSizeClass;", "", "widthSizeClass", "Landroidx/compose/material3/windowsizeclass/WindowWidthSizeClass;", "heightSizeClass", "Landroidx/compose/material3/windowsizeclass/WindowHeightSizeClass;", "(II)V", "getHeightSizeClass-Pt018CI", "()I", "I", "getWidthSizeClass-Y0FxcvE", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "material3-window-size-class_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class WindowSizeClass {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int heightSizeClass;
    private final int widthSizeClass;

    public /* synthetic */ WindowSizeClass(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2);
    }

    private WindowSizeClass(int i, int i2) {
        this.widthSizeClass = i;
        this.heightSizeClass = i2;
    }

    /* renamed from: getWidthSizeClass-Y0FxcvE, reason: not valid java name and from getter */
    public final int getWidthSizeClass() {
        return this.widthSizeClass;
    }

    /* renamed from: getHeightSizeClass-Pt018CI, reason: not valid java name and from getter */
    public final int getHeightSizeClass() {
        return this.heightSizeClass;
    }

    /* compiled from: WindowSizeClass.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Landroidx/compose/material3/windowsizeclass/WindowSizeClass$Companion;", "", "()V", "calculateFromSize", "Landroidx/compose/material3/windowsizeclass/WindowSizeClass;", LogEventArguments.ARG_SIZE, "Landroidx/compose/ui/unit/DpSize;", "supportedWidthSizeClasses", "", "Landroidx/compose/material3/windowsizeclass/WindowWidthSizeClass;", "supportedHeightSizeClasses", "Landroidx/compose/material3/windowsizeclass/WindowHeightSizeClass;", "calculateFromSize-qzXmJYc", "(JLjava/util/Set;Ljava/util/Set;)Landroidx/compose/material3/windowsizeclass/WindowSizeClass;", "material3-window-size-class_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: calculateFromSize-qzXmJYc$default, reason: not valid java name */
        public static /* synthetic */ WindowSizeClass m3954calculateFromSizeqzXmJYc$default(Companion companion, long j, Set set, Set set2, int i, Object obj) {
            if ((i & 2) != 0) {
                set = WindowWidthSizeClass.INSTANCE.getDefaultSizeClasses();
            }
            if ((i & 4) != 0) {
                set2 = WindowHeightSizeClass.INSTANCE.getDefaultSizeClasses();
            }
            return companion.m3955calculateFromSizeqzXmJYc(j, set, set2);
        }

        /* renamed from: calculateFromSize-qzXmJYc, reason: not valid java name */
        public final WindowSizeClass m3955calculateFromSizeqzXmJYc(long size, Set<WindowWidthSizeClass> supportedWidthSizeClasses, Set<WindowHeightSizeClass> supportedHeightSizeClasses) {
            return new WindowSizeClass(WindowWidthSizeClass.INSTANCE.m3967fromWidthLJjiCC4$material3_window_size_class_release(DpSize.m7095getWidthD9Ej5fM(size), supportedWidthSizeClasses), WindowHeightSizeClass.INSTANCE.m3948fromHeightBkRwncw$material3_window_size_class_release(DpSize.m7093getHeightD9Ej5fM(size), supportedHeightSizeClasses), null);
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        WindowSizeClass windowSizeClass = (WindowSizeClass) other;
        return WindowWidthSizeClass.m3960equalsimpl0(this.widthSizeClass, windowSizeClass.widthSizeClass) && WindowHeightSizeClass.m3941equalsimpl0(this.heightSizeClass, windowSizeClass.heightSizeClass);
    }

    public int hashCode() {
        return (WindowWidthSizeClass.m3961hashCodeimpl(this.widthSizeClass) * 31) + WindowHeightSizeClass.m3942hashCodeimpl(this.heightSizeClass);
    }

    public String toString() {
        return "WindowSizeClass(" + ((Object) WindowWidthSizeClass.m3962toStringimpl(this.widthSizeClass)) + ", " + ((Object) WindowHeightSizeClass.m3943toStringimpl(this.heightSizeClass)) + ')';
    }
}
