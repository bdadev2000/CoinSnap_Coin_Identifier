package androidx.compose.foundation;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.data.LogEventArguments;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: AndroidOverscroll.android.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0017\u001a\u00020\bH\u0002J\u001d\u0010\u0018\u001a\u00020\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00190\u001bH\u0086\bJ\u0006\u0010\u001c\u001a\u00020\bJ\u0006\u0010\u001d\u001a\u00020\bJ\u0006\u0010\u001e\u001a\u00020\bJ\u0006\u0010\u001f\u001a\u00020\bJ\u0006\u0010 \u001a\u00020\bJ\u0006\u0010!\u001a\u00020\bJ\u0006\u0010\"\u001a\u00020\bJ\u0006\u0010#\u001a\u00020\bJ\u0006\u0010$\u001a\u00020\u0014J\u0006\u0010%\u001a\u00020\u0014J\u0006\u0010&\u001a\u00020\u0014J\u0006\u0010'\u001a\u00020\u0014J\u0006\u0010(\u001a\u00020\u0014J\u0006\u0010)\u001a\u00020\u0014J\u0006\u0010*\u001a\u00020\u0014J\u0006\u0010+\u001a\u00020\u0014J\u0006\u0010,\u001a\u00020\u0014J\u0006\u0010-\u001a\u00020\u0014J\u0006\u0010.\u001a\u00020\u0014J\u0006\u0010/\u001a\u00020\u0014J\u0018\u00100\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b1\u00102R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u00020\u000fX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014*\u0004\u0018\u00010\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0014*\u0004\u0018\u00010\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00063"}, d2 = {"Landroidx/compose/foundation/EdgeEffectWrapper;", "", "context", "Landroid/content/Context;", "glowColor", "", "(Landroid/content/Context;I)V", "bottomEffect", "Landroid/widget/EdgeEffect;", "bottomEffectNegation", "leftEffect", "leftEffectNegation", "rightEffect", "rightEffectNegation", LogEventArguments.ARG_SIZE, "Landroidx/compose/ui/unit/IntSize;", "J", "topEffect", "topEffectNegation", "isAnimating", "", "(Landroid/widget/EdgeEffect;)Z", "isStretched", "createEdgeEffect", "forEachEffect", "", "action", "Lkotlin/Function1;", "getOrCreateBottomEffect", "getOrCreateBottomEffectNegation", "getOrCreateLeftEffect", "getOrCreateLeftEffectNegation", "getOrCreateRightEffect", "getOrCreateRightEffectNegation", "getOrCreateTopEffect", "getOrCreateTopEffectNegation", "isBottomAnimating", "isBottomNegationStretched", "isBottomStretched", "isLeftAnimating", "isLeftNegationStretched", "isLeftStretched", "isRightAnimating", "isRightNegationStretched", "isRightStretched", "isTopAnimating", "isTopNegationStretched", "isTopStretched", "setSize", "setSize-ozmzZPI", "(J)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class EdgeEffectWrapper {
    private EdgeEffect bottomEffect;
    private EdgeEffect bottomEffectNegation;
    private final Context context;
    private final int glowColor;
    private EdgeEffect leftEffect;
    private EdgeEffect leftEffectNegation;
    private EdgeEffect rightEffect;
    private EdgeEffect rightEffectNegation;
    private long size = IntSize.INSTANCE.m7172getZeroYbymL2g();
    private EdgeEffect topEffect;
    private EdgeEffect topEffectNegation;

    public EdgeEffectWrapper(Context context, int i) {
        this.context = context;
        this.glowColor = i;
    }

    public final void forEachEffect(Function1<? super EdgeEffect, Unit> action) {
        EdgeEffect edgeEffect = this.topEffect;
        if (edgeEffect != null) {
            action.invoke(edgeEffect);
        }
        EdgeEffect edgeEffect2 = this.bottomEffect;
        if (edgeEffect2 != null) {
            action.invoke(edgeEffect2);
        }
        EdgeEffect edgeEffect3 = this.leftEffect;
        if (edgeEffect3 != null) {
            action.invoke(edgeEffect3);
        }
        EdgeEffect edgeEffect4 = this.rightEffect;
        if (edgeEffect4 != null) {
            action.invoke(edgeEffect4);
        }
    }

    public final boolean isTopStretched() {
        return isStretched(this.topEffect);
    }

    public final boolean isBottomStretched() {
        return isStretched(this.bottomEffect);
    }

    public final boolean isLeftStretched() {
        return isStretched(this.leftEffect);
    }

    public final boolean isRightStretched() {
        return isStretched(this.rightEffect);
    }

    public final boolean isTopNegationStretched() {
        return isStretched(this.topEffectNegation);
    }

    public final boolean isBottomNegationStretched() {
        return isStretched(this.bottomEffectNegation);
    }

    public final boolean isLeftNegationStretched() {
        return isStretched(this.leftEffectNegation);
    }

    public final boolean isRightNegationStretched() {
        return isStretched(this.rightEffectNegation);
    }

    private final boolean isStretched(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !(EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect) == 0.0f);
    }

    public final boolean isTopAnimating() {
        return isAnimating(this.topEffect);
    }

    public final boolean isBottomAnimating() {
        return isAnimating(this.bottomEffect);
    }

    public final boolean isLeftAnimating() {
        return isAnimating(this.leftEffect);
    }

    public final boolean isRightAnimating() {
        return isAnimating(this.rightEffect);
    }

    private final boolean isAnimating(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public final EdgeEffect getOrCreateTopEffect() {
        EdgeEffect edgeEffect = this.topEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect createEdgeEffect = createEdgeEffect();
        this.topEffect = createEdgeEffect;
        return createEdgeEffect;
    }

    public final EdgeEffect getOrCreateBottomEffect() {
        EdgeEffect edgeEffect = this.bottomEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect createEdgeEffect = createEdgeEffect();
        this.bottomEffect = createEdgeEffect;
        return createEdgeEffect;
    }

    public final EdgeEffect getOrCreateLeftEffect() {
        EdgeEffect edgeEffect = this.leftEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect createEdgeEffect = createEdgeEffect();
        this.leftEffect = createEdgeEffect;
        return createEdgeEffect;
    }

    public final EdgeEffect getOrCreateRightEffect() {
        EdgeEffect edgeEffect = this.rightEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect createEdgeEffect = createEdgeEffect();
        this.rightEffect = createEdgeEffect;
        return createEdgeEffect;
    }

    public final EdgeEffect getOrCreateTopEffectNegation() {
        EdgeEffect edgeEffect = this.topEffectNegation;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect createEdgeEffect = createEdgeEffect();
        this.topEffectNegation = createEdgeEffect;
        return createEdgeEffect;
    }

    public final EdgeEffect getOrCreateBottomEffectNegation() {
        EdgeEffect edgeEffect = this.bottomEffectNegation;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect createEdgeEffect = createEdgeEffect();
        this.bottomEffectNegation = createEdgeEffect;
        return createEdgeEffect;
    }

    public final EdgeEffect getOrCreateLeftEffectNegation() {
        EdgeEffect edgeEffect = this.leftEffectNegation;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect createEdgeEffect = createEdgeEffect();
        this.leftEffectNegation = createEdgeEffect;
        return createEdgeEffect;
    }

    public final EdgeEffect getOrCreateRightEffectNegation() {
        EdgeEffect edgeEffect = this.rightEffectNegation;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect createEdgeEffect = createEdgeEffect();
        this.rightEffectNegation = createEdgeEffect;
        return createEdgeEffect;
    }

    private final EdgeEffect createEdgeEffect() {
        EdgeEffect create = EdgeEffectCompat.INSTANCE.create(this.context);
        create.setColor(this.glowColor);
        if (!IntSize.m7165equalsimpl0(this.size, IntSize.INSTANCE.m7172getZeroYbymL2g())) {
            create.setSize(IntSize.m7167getWidthimpl(this.size), IntSize.m7166getHeightimpl(this.size));
        }
        return create;
    }

    /* renamed from: setSize-ozmzZPI, reason: not valid java name */
    public final void m595setSizeozmzZPI(long size) {
        this.size = size;
        EdgeEffect edgeEffect = this.topEffect;
        if (edgeEffect != null) {
            edgeEffect.setSize(IntSize.m7167getWidthimpl(size), IntSize.m7166getHeightimpl(size));
        }
        EdgeEffect edgeEffect2 = this.bottomEffect;
        if (edgeEffect2 != null) {
            edgeEffect2.setSize(IntSize.m7167getWidthimpl(size), IntSize.m7166getHeightimpl(size));
        }
        EdgeEffect edgeEffect3 = this.leftEffect;
        if (edgeEffect3 != null) {
            edgeEffect3.setSize(IntSize.m7166getHeightimpl(size), IntSize.m7167getWidthimpl(size));
        }
        EdgeEffect edgeEffect4 = this.rightEffect;
        if (edgeEffect4 != null) {
            edgeEffect4.setSize(IntSize.m7166getHeightimpl(size), IntSize.m7167getWidthimpl(size));
        }
        EdgeEffect edgeEffect5 = this.topEffectNegation;
        if (edgeEffect5 != null) {
            edgeEffect5.setSize(IntSize.m7167getWidthimpl(size), IntSize.m7166getHeightimpl(size));
        }
        EdgeEffect edgeEffect6 = this.bottomEffectNegation;
        if (edgeEffect6 != null) {
            edgeEffect6.setSize(IntSize.m7167getWidthimpl(size), IntSize.m7166getHeightimpl(size));
        }
        EdgeEffect edgeEffect7 = this.leftEffectNegation;
        if (edgeEffect7 != null) {
            edgeEffect7.setSize(IntSize.m7166getHeightimpl(size), IntSize.m7167getWidthimpl(size));
        }
        EdgeEffect edgeEffect8 = this.rightEffectNegation;
        if (edgeEffect8 != null) {
            edgeEffect8.setSize(IntSize.m7166getHeightimpl(size), IntSize.m7167getWidthimpl(size));
        }
    }
}
