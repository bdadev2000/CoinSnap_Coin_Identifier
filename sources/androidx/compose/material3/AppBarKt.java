package androidx.compose.material3;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.glority.android.xx.constants.Args;
import com.glority.base.utils.StatusBarUtils;
import com.google.android.exoplayer2.C;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: AppBar.kt */
@Metadata(d1 = {"\u0000¶\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0083\u0001\u0010\u0010\u001a\u00020\u00112\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"H\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u008f\u0001\u0010\u0010\u001a\u00020\u00112\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&H\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001al\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\u001c\u0010)\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001ax\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\u001c\u0010)\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a \u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u000201H\u0007\u001a\u007f\u00104\u001a\u00020\u00112\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u0010%\u001a\u0004\u0018\u000109H\u0007¢\u0006\u0002\u0010:\u001a\u008e\u0001\u00104\u001a\u00020\u00112\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010;\u001a\u00020\u00012\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u0010%\u001a\u0004\u0018\u000109H\u0007ø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001a\u007f\u0010>\u001a\u00020\u00112\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u0010%\u001a\u0004\u0018\u000109H\u0007¢\u0006\u0002\u0010:\u001a\u0098\u0001\u0010>\u001a\u00020\u00112\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010?\u001a\u00020\u00012\b\b\u0002\u0010;\u001a\u00020\u00012\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u0010%\u001a\u0004\u0018\u000109H\u0007ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a\u007f\u0010B\u001a\u00020\u00112\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u0010%\u001a\u0004\u0018\u000109H\u0007¢\u0006\u0002\u0010:\u001a\u0098\u0001\u0010B\u001a\u00020\u00112\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010?\u001a\u00020\u00012\b\b\u0002\u0010;\u001a\u00020\u00012\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u0010%\u001a\u0004\u0018\u000109H\u0007ø\u0001\u0000¢\u0006\u0004\bC\u0010A\u001a\u0092\u0001\u0010D\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0011\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\u0006\u0010;\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"2\u0006\u00107\u001a\u0002082\b\u0010%\u001a\u0004\u0018\u000109H\u0003ø\u0001\u0000¢\u0006\u0004\bI\u0010J\u001a\u007f\u0010K\u001a\u00020\u00112\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u0010%\u001a\u0004\u0018\u000109H\u0007¢\u0006\u0002\u0010:\u001a\u008e\u0001\u0010K\u001a\u00020\u00112\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010;\u001a\u00020\u00012\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u0010%\u001a\u0004\u0018\u000109H\u0007ø\u0001\u0000¢\u0006\u0004\bL\u0010=\u001a£\u0001\u0010M\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020\u001c2\u0006\u0010Q\u001a\u00020\u001c2\u0006\u0010R\u001a\u00020\u001c2\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u0006\u0010E\u001a\u00020F2\u0006\u0010S\u001a\u0002012\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020H2\u0011\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u0015H\u0003ø\u0001\u0000¢\u0006\u0004\b[\u0010\\\u001aµ\u0001\u0010]\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u0006\u0010E\u001a\u00020F2\u0006\u0010X\u001a\u00020\u00012\u0011\u0010^\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u0006\u0010_\u001a\u00020F2\u0011\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\u0006\u0010?\u001a\u00020\u00012\u0006\u0010;\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"2\u0006\u00107\u001a\u0002082\b\u0010%\u001a\u0004\u0018\u000109H\u0003ø\u0001\u0000¢\u0006\u0004\b`\u0010a\u001a+\u0010b\u001a\u00020/2\b\b\u0002\u00100\u001a\u0002012\b\b\u0002\u00102\u001a\u0002012\b\b\u0002\u00103\u001a\u000201H\u0007¢\u0006\u0002\u0010c\u001a+\u0010d\u001a\u00020e2\b\b\u0002\u00100\u001a\u0002012\b\b\u0002\u00102\u001a\u0002012\b\b\u0002\u00103\u001a\u000201H\u0007¢\u0006\u0002\u0010f\u001a>\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020e2\u0006\u0010j\u001a\u0002012\u000e\u0010k\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010l2\u000e\u0010m\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010nH\u0082@¢\u0006\u0002\u0010o\u001a>\u0010p\u001a\u00020h2\u0006\u0010i\u001a\u00020/2\u0006\u0010j\u001a\u0002012\u000e\u0010k\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010l2\u000e\u0010m\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010nH\u0082@¢\u0006\u0002\u0010q\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0016\u0010\u0003\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0002\u001a\u0004\b\u0004\u0010\u0005\"\u0010\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0007\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\n\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u000b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006r²\u0006\n\u0010s\u001a\u000201X\u008a\u0084\u0002²\u0006\n\u0010t\u001a\u00020\u001cX\u008a\u0084\u0002"}, d2 = {"BottomAppBarHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "BottomAppBarVerticalPadding", "getBottomAppBarVerticalPadding", "()F", "FABHorizontalPadding", "FABVerticalPadding", "LargeTitleBottomPadding", "MediumTitleBottomPadding", "TopAppBarHorizontalPadding", "TopAppBarTitleInset", "TopTitleAlphaEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "getTopTitleAlphaEasing", "()Landroidx/compose/animation/core/CubicBezierEasing;", "BottomAppBar", "", "actions", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "floatingActionButton", "Lkotlin/Function0;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "tonalElevation", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "BottomAppBar-Snr_uVM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/runtime/Composer;II)V", "scrollBehavior", "Landroidx/compose/material3/BottomAppBarScrollBehavior;", "BottomAppBar-qhFBPw4", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/BottomAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "content", "BottomAppBar-1oL4kX8", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomAppBar-e-3WI5M", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/BottomAppBarScrollBehavior;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomAppBarState", "Landroidx/compose/material3/BottomAppBarState;", "initialHeightOffsetLimit", "", "initialHeightOffset", "initialContentOffset", "CenterAlignedTopAppBar", Args.title, "navigationIcon", "colors", "Landroidx/compose/material3/TopAppBarColors;", "Landroidx/compose/material3/TopAppBarScrollBehavior;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "expandedHeight", "CenterAlignedTopAppBar-GHTll3U", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "LargeTopAppBar", "collapsedHeight", "LargeTopAppBar-oKE7A98", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "MediumTopAppBar", "MediumTopAppBar-oKE7A98", "SingleRowTopAppBar", "titleTextStyle", "Landroidx/compose/ui/text/TextStyle;", "centeredTitle", "", "SingleRowTopAppBar-cJHQLPU", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "TopAppBar", "TopAppBar-GHTll3U", "TopAppBarLayout", "scrolledOffset", "Landroidx/compose/material3/ScrolledOffset;", "navigationIconContentColor", "titleContentColor", "actionIconContentColor", "titleAlpha", "titleVerticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "titleHorizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "titleBottomPadding", "", "hideTitleSemantics", "TopAppBarLayout-kXwM9vE", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/ScrolledOffset;JJJLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;FLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;IZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TwoRowsTopAppBar", "smallTitle", "smallTitleTextStyle", "TwoRowsTopAppBar-nS6u9G4", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;FLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;III)V", "rememberBottomAppBarState", "(FFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/BottomAppBarState;", "rememberTopAppBarState", "Landroidx/compose/material3/TopAppBarState;", "(FFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TopAppBarState;", "settleAppBar", "Landroidx/compose/ui/unit/Velocity;", "state", "velocity", "flingAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "snapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "(Landroidx/compose/material3/TopAppBarState;FLandroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "settleAppBarBottom", "(Landroidx/compose/material3/BottomAppBarState;FLandroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "material3_release", "colorTransitionFraction", "appBarContainerColor"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class AppBarKt {
    private static final float BottomAppBarHorizontalPadding;
    private static final float BottomAppBarVerticalPadding;
    private static final float FABHorizontalPadding;
    private static final float FABVerticalPadding;
    private static final float LargeTitleBottomPadding;
    private static final float MediumTitleBottomPadding;
    private static final float TopAppBarHorizontalPadding;
    private static final float TopAppBarTitleInset;
    private static final CubicBezierEasing TopTitleAlphaEasing;

    /* JADX WARN: Removed duplicated region for block: B:102:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x006d  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Deprecated in favor of TopAppBar with expandedHeight parameter")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void TopAppBar(final kotlin.jvm.functions.Function2 r20, androidx.compose.ui.Modifier r21, kotlin.jvm.functions.Function2 r22, kotlin.jvm.functions.Function3 r23, androidx.compose.foundation.layout.WindowInsets r24, androidx.compose.material3.TopAppBarColors r25, androidx.compose.material3.TopAppBarScrollBehavior r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.TopAppBar(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00e4  */
    /* renamed from: TopAppBar-GHTll3U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m2094TopAppBarGHTll3U(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r24, androidx.compose.ui.Modifier r25, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r26, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r27, float r28, androidx.compose.foundation.layout.WindowInsets r29, androidx.compose.material3.TopAppBarColors r30, androidx.compose.material3.TopAppBarScrollBehavior r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m2094TopAppBarGHTll3U(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x006d  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Deprecated in favor of CenterAlignedTopAppBar with expandedHeight parameter")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void CenterAlignedTopAppBar(final kotlin.jvm.functions.Function2 r20, androidx.compose.ui.Modifier r21, kotlin.jvm.functions.Function2 r22, kotlin.jvm.functions.Function3 r23, androidx.compose.foundation.layout.WindowInsets r24, androidx.compose.material3.TopAppBarColors r25, androidx.compose.material3.TopAppBarScrollBehavior r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.CenterAlignedTopAppBar(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00e4  */
    /* renamed from: CenterAlignedTopAppBar-GHTll3U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m2090CenterAlignedTopAppBarGHTll3U(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r24, androidx.compose.ui.Modifier r25, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r26, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r27, float r28, androidx.compose.foundation.layout.WindowInsets r29, androidx.compose.material3.TopAppBarColors r30, androidx.compose.material3.TopAppBarScrollBehavior r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m2090CenterAlignedTopAppBarGHTll3U(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x006d  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Deprecated in favor of MediumTopAppBar with collapsedHeight and expandedHeight parameters")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void MediumTopAppBar(final kotlin.jvm.functions.Function2 r21, androidx.compose.ui.Modifier r22, kotlin.jvm.functions.Function2 r23, kotlin.jvm.functions.Function3 r24, androidx.compose.foundation.layout.WindowInsets r25, androidx.compose.material3.TopAppBarColors r26, androidx.compose.material3.TopAppBarScrollBehavior r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.MediumTopAppBar(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x019e  */
    /* renamed from: MediumTopAppBar-oKE7A98, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m2092MediumTopAppBaroKE7A98(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, androidx.compose.ui.Modifier r31, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r33, float r34, float r35, androidx.compose.foundation.layout.WindowInsets r36, androidx.compose.material3.TopAppBarColors r37, androidx.compose.material3.TopAppBarScrollBehavior r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m2092MediumTopAppBaroKE7A98(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, float, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x006d  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Deprecated in favor of LargeTopAppBar with collapsedHeight and expandedHeight parameters")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void LargeTopAppBar(final kotlin.jvm.functions.Function2 r21, androidx.compose.ui.Modifier r22, kotlin.jvm.functions.Function2 r23, kotlin.jvm.functions.Function3 r24, androidx.compose.foundation.layout.WindowInsets r25, androidx.compose.material3.TopAppBarColors r26, androidx.compose.material3.TopAppBarScrollBehavior r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.LargeTopAppBar(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x019e  */
    /* renamed from: LargeTopAppBar-oKE7A98, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m2091LargeTopAppBaroKE7A98(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, androidx.compose.ui.Modifier r31, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r33, float r34, float r35, androidx.compose.foundation.layout.WindowInsets r36, androidx.compose.material3.TopAppBarColors r37, androidx.compose.material3.TopAppBarScrollBehavior r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m2091LargeTopAppBaroKE7A98(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, float, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00c4  */
    /* renamed from: BottomAppBar-Snr_uVM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m2087BottomAppBarSnr_uVM(final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r31, androidx.compose.ui.Modifier r32, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r33, long r34, long r36, float r38, androidx.compose.foundation.layout.PaddingValues r39, androidx.compose.foundation.layout.WindowInsets r40, androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m2087BottomAppBarSnr_uVM(kotlin.jvm.functions.Function3, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, long, long, float, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.layout.WindowInsets, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b6  */
    /* renamed from: BottomAppBar-qhFBPw4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m2089BottomAppBarqhFBPw4(final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, androidx.compose.ui.Modifier r31, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, long r33, long r35, float r37, androidx.compose.foundation.layout.PaddingValues r38, androidx.compose.foundation.layout.WindowInsets r39, androidx.compose.material3.BottomAppBarScrollBehavior r40, androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m2089BottomAppBarqhFBPw4(kotlin.jvm.functions.Function3, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, long, long, float, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.BottomAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0087  */
    /* renamed from: BottomAppBar-1oL4kX8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m2086BottomAppBar1oL4kX8(androidx.compose.ui.Modifier r24, long r25, long r27, float r29, androidx.compose.foundation.layout.PaddingValues r30, androidx.compose.foundation.layout.WindowInsets r31, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m2086BottomAppBar1oL4kX8(androidx.compose.ui.Modifier, long, long, float, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.layout.WindowInsets, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02ba  */
    /* renamed from: BottomAppBar-e-3WI5M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m2088BottomAppBare3WI5M(androidx.compose.ui.Modifier r35, long r36, long r38, float r40, androidx.compose.foundation.layout.PaddingValues r41, androidx.compose.foundation.layout.WindowInsets r42, androidx.compose.material3.BottomAppBarScrollBehavior r43, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r44, androidx.compose.runtime.Composer r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 740
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m2088BottomAppBare3WI5M(androidx.compose.ui.Modifier, long, long, float, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.BottomAppBarScrollBehavior, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final TopAppBarState rememberTopAppBarState(final float f, final float f2, final float f3, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1801969826, "C(rememberTopAppBarState)P(2,1)1292@62790L99,1292@62743L146:AppBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            f = -3.4028235E38f;
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1801969826, i, -1, "androidx.compose.material3.rememberTopAppBarState (AppBar.kt:1291)");
        }
        Object[] objArr = new Object[0];
        Saver<TopAppBarState, ?> saver = TopAppBarState.INSTANCE.getSaver();
        ComposerKt.sourceInformationMarkerStart(composer, 1949255933, "CC(remember):AppBar.kt#9igjgp");
        boolean z = ((((i & 14) ^ 6) > 4 && composer.changed(f)) || (i & 6) == 4) | ((((i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) ^ 48) > 32 && composer.changed(f2)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(f3)) || (i & 384) == 256);
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = (Function0) new Function0<TopAppBarState>() { // from class: androidx.compose.material3.AppBarKt$rememberTopAppBarState$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final TopAppBarState invoke() {
                    return new TopAppBarState(f, f2, f3);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        TopAppBarState topAppBarState = (TopAppBarState) RememberSaveableKt.m4101rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) rememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return topAppBarState;
    }

    public static final BottomAppBarState rememberBottomAppBarState(final float f, final float f2, final float f3, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1420874240, "C(rememberBottomAppBarState)P(2,1)1611@75546L102,1611@75496L152:AppBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            f = -3.4028235E38f;
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1420874240, i, -1, "androidx.compose.material3.rememberBottomAppBarState (AppBar.kt:1610)");
        }
        Object[] objArr = new Object[0];
        Saver<BottomAppBarState, ?> saver = BottomAppBarState.INSTANCE.getSaver();
        ComposerKt.sourceInformationMarkerStart(composer, -1399214710, "CC(remember):AppBar.kt#9igjgp");
        boolean z = ((((i & 14) ^ 6) > 4 && composer.changed(f)) || (i & 6) == 4) | ((((i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) ^ 48) > 32 && composer.changed(f2)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(f3)) || (i & 384) == 256);
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = (Function0) new Function0<BottomAppBarState>() { // from class: androidx.compose.material3.AppBarKt$rememberBottomAppBarState$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final BottomAppBarState invoke() {
                    return AppBarKt.BottomAppBarState(f, f2, f3);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        BottomAppBarState bottomAppBarState = (BottomAppBarState) RememberSaveableKt.m4101rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) rememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return bottomAppBarState;
    }

    public static final BottomAppBarState BottomAppBarState(float f, float f2, float f3) {
        return new BottomAppBarStateImpl(f, f2, f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0112 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object settleAppBarBottom(androidx.compose.material3.BottomAppBarState r22, float r23, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> r24, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r25, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> r26) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.settleAppBarBottom(androidx.compose.material3.BottomAppBarState, float, androidx.compose.animation.core.DecayAnimationSpec, androidx.compose.animation.core.AnimationSpec, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final float getBottomAppBarVerticalPadding() {
        return BottomAppBarVerticalPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015d  */
    /* renamed from: SingleRowTopAppBar-cJHQLPU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m2093SingleRowTopAppBarcJHQLPU(androidx.compose.ui.Modifier r37, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r38, final androidx.compose.ui.text.TextStyle r39, final boolean r40, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r41, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r42, final float r43, final androidx.compose.foundation.layout.WindowInsets r44, final androidx.compose.material3.TopAppBarColors r45, final androidx.compose.material3.TopAppBarScrollBehavior r46, androidx.compose.runtime.Composer r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 844
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m2093SingleRowTopAppBarcJHQLPU(androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, androidx.compose.ui.text.TextStyle, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c5  */
    /* renamed from: TwoRowsTopAppBar-nS6u9G4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m2096TwoRowsTopAppBarnS6u9G4(androidx.compose.ui.Modifier r40, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r41, final androidx.compose.ui.text.TextStyle r42, final float r43, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r44, final androidx.compose.ui.text.TextStyle r45, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r46, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r47, final float r48, final float r49, final androidx.compose.foundation.layout.WindowInsets r50, final androidx.compose.material3.TopAppBarColors r51, final androidx.compose.material3.TopAppBarScrollBehavior r52, androidx.compose.runtime.Composer r53, final int r54, final int r55, final int r56) {
        /*
            Method dump skipped, instructions count: 994
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m2096TwoRowsTopAppBarnS6u9G4(androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, androidx.compose.ui.text.TextStyle, float, kotlin.jvm.functions.Function2, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, float, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TopAppBarLayout-kXwM9vE, reason: not valid java name */
    public static final void m2095TopAppBarLayoutkXwM9vE(final Modifier modifier, final ScrolledOffset scrolledOffset, final long j, final long j2, final long j3, final Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, final float f, final Arrangement.Vertical vertical, final Arrangement.Horizontal horizontal, final int i, final boolean z, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(-742442296);
        ComposerKt.sourceInformation(startRestartGroup, "C(TopAppBarLayout)P(3,6,5:c#ui.graphics.Color,10:c#ui.graphics.Color,0:c#ui.graphics.Color,7,12,8,13,11,9,2,4)2163@98873L5882,2135@97725L7030:AppBar.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? startRestartGroup.changed(scrolledOffset) : startRestartGroup.changedInstance(scrolledOffset) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changed(j2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= startRestartGroup.changed(j3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= startRestartGroup.changed(textStyle) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= startRestartGroup.changed(f) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= startRestartGroup.changed(vertical) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i2 & C.ENCODING_PCM_32BIT) == 0) {
            i4 |= startRestartGroup.changed(horizontal) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (startRestartGroup.changed(i) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= startRestartGroup.changedInstance(function22) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= startRestartGroup.changedInstance(function23) ? 2048 : 1024;
        }
        int i6 = i5;
        if ((306783379 & i4) != 306783378 || (i6 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-742442296, i4, i6, "androidx.compose.material3.TopAppBarLayout (AppBar.kt:2134)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1539011656, "CC(remember):AppBar.kt#9igjgp");
            boolean z2 = ((i4 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 32 || ((i4 & 64) != 0 && startRestartGroup.changedInstance(scrolledOffset))) | ((1879048192 & i4) == 536870912) | ((234881024 & i4) == 67108864) | ((i6 & 14) == 4);
            MeasurePolicy rememberedValue = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo342measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, final long j4) {
                        int coerceAtLeast;
                        int m6949getMaxHeightimpl;
                        int size = list.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            Measurable measurable = list.get(i7);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "navigationIcon")) {
                                final Placeable mo5851measureBRTryo0 = measurable.mo5851measureBRTryo0(Constraints.m6941copyZbe2FdA$default(j4, 0, 0, 0, 0, 14, null));
                                int size2 = list.size();
                                for (int i8 = 0; i8 < size2; i8++) {
                                    Measurable measurable2 = list.get(i8);
                                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "actionIcons")) {
                                        final Placeable mo5851measureBRTryo02 = measurable2.mo5851measureBRTryo0(Constraints.m6941copyZbe2FdA$default(j4, 0, 0, 0, 0, 14, null));
                                        if (Constraints.m6950getMaxWidthimpl(j4) == Integer.MAX_VALUE) {
                                            coerceAtLeast = Constraints.m6950getMaxWidthimpl(j4);
                                        } else {
                                            coerceAtLeast = RangesKt.coerceAtLeast((Constraints.m6950getMaxWidthimpl(j4) - mo5851measureBRTryo0.getWidth()) - mo5851measureBRTryo02.getWidth(), 0);
                                        }
                                        int i9 = coerceAtLeast;
                                        int size3 = list.size();
                                        for (int i10 = 0; i10 < size3; i10++) {
                                            Measurable measurable3 = list.get(i10);
                                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), Args.title)) {
                                                final Placeable mo5851measureBRTryo03 = measurable3.mo5851measureBRTryo0(Constraints.m6941copyZbe2FdA$default(j4, 0, i9, 0, 0, 12, null));
                                                final int i11 = mo5851measureBRTryo03.get(AlignmentLineKt.getLastBaseline()) != Integer.MIN_VALUE ? mo5851measureBRTryo03.get(AlignmentLineKt.getLastBaseline()) : 0;
                                                float offset = ScrolledOffset.this.offset();
                                                int roundToInt = Float.isNaN(offset) ? 0 : MathKt.roundToInt(offset);
                                                if (Constraints.m6949getMaxHeightimpl(j4) == Integer.MAX_VALUE) {
                                                    m6949getMaxHeightimpl = Constraints.m6949getMaxHeightimpl(j4);
                                                } else {
                                                    m6949getMaxHeightimpl = Constraints.m6949getMaxHeightimpl(j4) + roundToInt;
                                                }
                                                final int i12 = m6949getMaxHeightimpl;
                                                int m6950getMaxWidthimpl = Constraints.m6950getMaxWidthimpl(j4);
                                                final Arrangement.Horizontal horizontal2 = horizontal;
                                                final Arrangement.Vertical vertical2 = vertical;
                                                final int i13 = i;
                                                return MeasureScope.layout$default(measureScope, m6950getMaxWidthimpl, i12, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$2$1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                        invoke2(placementScope);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(Placeable.PlacementScope placementScope) {
                                                        float f2;
                                                        int max;
                                                        int i14;
                                                        int height;
                                                        int m6950getMaxWidthimpl2;
                                                        Placeable placeable = Placeable.this;
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, (i12 - placeable.getHeight()) / 2, 0.0f, 4, null);
                                                        Placeable placeable2 = mo5851measureBRTryo03;
                                                        Arrangement.Horizontal horizontal3 = horizontal2;
                                                        if (Intrinsics.areEqual(horizontal3, Arrangement.INSTANCE.getCenter())) {
                                                            max = (Constraints.m6950getMaxWidthimpl(j4) - mo5851measureBRTryo03.getWidth()) / 2;
                                                            if (max < Placeable.this.getWidth()) {
                                                                m6950getMaxWidthimpl2 = Placeable.this.getWidth() - max;
                                                            } else if (mo5851measureBRTryo03.getWidth() + max > Constraints.m6950getMaxWidthimpl(j4) - mo5851measureBRTryo02.getWidth()) {
                                                                m6950getMaxWidthimpl2 = (Constraints.m6950getMaxWidthimpl(j4) - mo5851measureBRTryo02.getWidth()) - (mo5851measureBRTryo03.getWidth() + max);
                                                            }
                                                            max += m6950getMaxWidthimpl2;
                                                        } else if (Intrinsics.areEqual(horizontal3, Arrangement.INSTANCE.getEnd())) {
                                                            max = (Constraints.m6950getMaxWidthimpl(j4) - mo5851measureBRTryo03.getWidth()) - mo5851measureBRTryo02.getWidth();
                                                        } else {
                                                            MeasureScope measureScope2 = measureScope;
                                                            f2 = AppBarKt.TopAppBarTitleInset;
                                                            max = Math.max(measureScope2.mo671roundToPx0680j_4(f2), Placeable.this.getWidth());
                                                        }
                                                        int i15 = max;
                                                        Arrangement.Vertical vertical3 = vertical2;
                                                        if (!Intrinsics.areEqual(vertical3, Arrangement.INSTANCE.getCenter())) {
                                                            if (Intrinsics.areEqual(vertical3, Arrangement.INSTANCE.getBottom())) {
                                                                int i16 = i13;
                                                                if (i16 == 0) {
                                                                    height = i12 - mo5851measureBRTryo03.getHeight();
                                                                } else {
                                                                    int height2 = i16 - (mo5851measureBRTryo03.getHeight() - i11);
                                                                    int height3 = mo5851measureBRTryo03.getHeight() + height2;
                                                                    if (height3 > Constraints.m6949getMaxHeightimpl(j4)) {
                                                                        height2 -= height3 - Constraints.m6949getMaxHeightimpl(j4);
                                                                    }
                                                                    i14 = (i12 - mo5851measureBRTryo03.getHeight()) - Math.max(0, height2);
                                                                }
                                                            } else {
                                                                i14 = 0;
                                                            }
                                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i15, i14, 0.0f, 4, null);
                                                            Placeable.PlacementScope.placeRelative$default(placementScope, mo5851measureBRTryo02, Constraints.m6950getMaxWidthimpl(j4) - mo5851measureBRTryo02.getWidth(), (i12 - mo5851measureBRTryo02.getHeight()) / 2, 0.0f, 4, null);
                                                        }
                                                        height = (i12 - mo5851measureBRTryo03.getHeight()) / 2;
                                                        i14 = height;
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i15, i14, 0.0f, 4, null);
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, mo5851measureBRTryo02, Constraints.m6950getMaxWidthimpl(j4) - mo5851measureBRTryo02.getWidth(), (i12 - mo5851measureBRTryo02.getHeight()) / 2, 0.0f, 4, null);
                                                    }
                                                }, 4, null);
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4008constructorimpl = Updater.m4008constructorimpl(startRestartGroup);
            Updater.m4015setimpl(m4008constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 9049318, "C2137@97755L280,2143@98048L502,2155@98563L264:AppBar.kt#uh7d8r");
            Modifier layoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, "navigationIcon");
            float f2 = TopAppBarHorizontalPadding;
            Modifier m989paddingqDBjuR0$default = PaddingKt.m989paddingqDBjuR0$default(layoutId, f2, 0.0f, 0.0f, 0.0f, 14, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m989paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4008constructorimpl2 = Updater.m4008constructorimpl(startRestartGroup);
            Updater.m4015setimpl(m4008constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl2.getInserting() || !Intrinsics.areEqual(m4008constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4008constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4008constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4015setimpl(m4008constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 249765716, "C2138@97858L163:AppBar.kt#uh7d8r");
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4505boximpl(j)), function22, startRestartGroup, ProvidedValue.$stable | ((i6 >> 3) & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier m987paddingVpY3zN4$default = PaddingKt.m987paddingVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, Args.title), f2, 0.0f, 2, null);
            Modifier.Companion companion = Modifier.INSTANCE;
            if (z) {
                companion = SemanticsModifierKt.clearAndSetSemantics(companion, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$1$2
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }
                });
            }
            Modifier m4676graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m4676graphicsLayerAp8cVGQ$default(m987paddingVpY3zN4$default.then(companion), 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131067, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m4676graphicsLayerAp8cVGQ$default);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4008constructorimpl3 = Updater.m4008constructorimpl(startRestartGroup);
            Updater.m4015setimpl(m4008constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl3.getInserting() || !Intrinsics.areEqual(m4008constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m4008constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m4008constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m4015setimpl(m4008constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 250255454, "C2149@98351L185:AppBar.kt#uh7d8r");
            int i7 = i4 >> 9;
            ProvideContentColorTextStyleKt.m3224ProvideContentColorTextStyle3JVO9M(j2, textStyle, function2, startRestartGroup, ((i4 >> 15) & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | (i7 & 14) | (i7 & 896));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier m989paddingqDBjuR0$default2 = PaddingKt.m989paddingqDBjuR0$default(LayoutIdKt.layoutId(Modifier.INSTANCE, "actionIcons"), 0.0f, 0.0f, f2, 0.0f, 11, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, m989paddingqDBjuR0$default2);
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor4);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4008constructorimpl4 = Updater.m4008constructorimpl(startRestartGroup);
            Updater.m4015setimpl(m4008constructorimpl4, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl4.getInserting() || !Intrinsics.areEqual(m4008constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                m4008constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m4008constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m4015setimpl(m4008constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 250561951, "C2156@98661L152:AppBar.kt#uh7d8r");
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4505boximpl(j3)), function23, startRestartGroup, ((i6 >> 6) & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | ProvidedValue.$stable);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i8) {
                    AppBarKt.m2095TopAppBarLayoutkXwM9vE(Modifier.this, scrolledOffset, j, j2, j3, function2, textStyle, f, vertical, horizontal, i, z, function22, function23, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0112 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object settleAppBar(androidx.compose.material3.TopAppBarState r22, float r23, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> r24, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r25, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> r26) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.settleAppBar(androidx.compose.material3.TopAppBarState, float, androidx.compose.animation.core.DecayAnimationSpec, androidx.compose.animation.core.AnimationSpec, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final CubicBezierEasing getTopTitleAlphaEasing() {
        return TopTitleAlphaEasing;
    }

    private static final float SingleRowTopAppBar_cJHQLPU$lambda$9(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final long SingleRowTopAppBar_cJHQLPU$lambda$10(State<Color> state) {
        return state.getValue().m4525unboximpl();
    }

    static {
        float f = 16;
        float f2 = 12;
        float m6997constructorimpl = Dp.m6997constructorimpl(Dp.m6997constructorimpl(f) - Dp.m6997constructorimpl(f2));
        BottomAppBarHorizontalPadding = m6997constructorimpl;
        float m6997constructorimpl2 = Dp.m6997constructorimpl(Dp.m6997constructorimpl(f) - Dp.m6997constructorimpl(f2));
        BottomAppBarVerticalPadding = m6997constructorimpl2;
        FABHorizontalPadding = Dp.m6997constructorimpl(Dp.m6997constructorimpl(f) - m6997constructorimpl);
        FABVerticalPadding = Dp.m6997constructorimpl(Dp.m6997constructorimpl(f2) - m6997constructorimpl2);
        TopTitleAlphaEasing = new CubicBezierEasing(0.8f, 0.0f, 0.8f, 0.15f);
        MediumTitleBottomPadding = Dp.m6997constructorimpl(24);
        LargeTitleBottomPadding = Dp.m6997constructorimpl(28);
        float m6997constructorimpl3 = Dp.m6997constructorimpl(4);
        TopAppBarHorizontalPadding = m6997constructorimpl3;
        TopAppBarTitleInset = Dp.m6997constructorimpl(Dp.m6997constructorimpl(f) - m6997constructorimpl3);
    }
}
