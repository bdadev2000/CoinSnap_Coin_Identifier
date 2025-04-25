package com.glority.widget.tooltips;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.widget.R;
import com.glority.widget.tooltips.GlToolTips;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: GlToolTips.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0004GHIJB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010\t\u001a\u00020\u0006H\u0002J&\u0010*\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J8\u0010+\u001a\u00020'2\u0006\u0010,\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u00132\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u00132\u0006\u00101\u001a\u0002022\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u00103\u001a\u00020'2\u0006\u00104\u001a\u00020)H\u0002J8\u00105\u001a\u00020'2\u0006\u0010,\u001a\u00020\u00132\u0006\u00100\u001a\u00020\u00132\u0006\u0010.\u001a\u00020/2\u0006\u00106\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u00101\u001a\u000202H\u0002J\u0010\u00107\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0006\u00108\u001a\u00020'J\b\u00109\u001a\u00020'H\u0002J\u0018\u0010:\u001a\u00020\u00132\u0006\u0010;\u001a\u00020\u00132\u0006\u0010<\u001a\u00020\u0013H\u0002J\u0018\u0010=\u001a\u00020/2\u0006\u0010!\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u0013H\u0002J\b\u0010>\u001a\u00020\bH\u0002J\u0010\u0010?\u001a\u00020'2\u0006\u0010@\u001a\u00020\u0006H\u0002J\u0018\u0010A\u001a\u00020'2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u0013H\u0002J\u0018\u0010E\u001a\u00020'2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u0013H\u0002J\b\u0010F\u001a\u00020'H\u0002J \u0010F\u001a\u00020'2\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001c\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006K"}, d2 = {"Lcom/glority/widget/tooltips/GlToolTips;", "", "()V", "alignment", "Lcom/glority/widget/tooltips/GlToolTips$Alignment;", "archerView", "Landroid/view/View;", "clickOutsideClose", "", "contentView", "context", "Landroid/content/Context;", "dimBehind", "inflaterView", "isLight", FirebaseAnalytics.Param.ITEMS, "", "Lcom/glority/widget/tooltips/GlToolTipsItem;", "mMaxWith", "", "noBackground", "onItemClickListener", "Lcom/glority/widget/tooltips/GlToolTipsOnItemClickListener;", "paddingStart", "getPaddingStart", "()I", "paddingStart$delegate", "Lkotlin/Lazy;", "selectable", "showArrow", "showDivider", "statusListener", "Lcom/glority/widget/tooltips/GlToolTips$StatusListener;", "targetView", "text", "", "type", "Lcom/glority/widget/tooltips/GlToolTips$Type;", "adjustContentView", "", "containerView", "Landroid/view/ViewGroup;", "adjustItems", "adjustStartEnd", "inflateViewWidth", "inflateViewHeight", "viewRect", "Landroid/graphics/Rect;", "windowHeight", "layoutParams", "Landroid/widget/FrameLayout$LayoutParams;", "adjustText", TtmlNode.RUBY_CONTAINER, "adjustTopAndBottom", "windowWidth", "createContentView", "dismiss", "exitAnimation", "getAdjustMaxWidth", "maxWidth", "currentWidth", "getViewRect", "isRtl", "openAnimation", "inflateView", "setMarginEnd", "marginLayoutParams", "Landroid/view/ViewGroup$MarginLayoutParams;", "margin", "setMarginStart", "show", "Alignment", "Builder", "StatusListener", "Type", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class GlToolTips {
    private Alignment alignment;
    private View archerView;
    private boolean clickOutsideClose;
    private View contentView;
    private Context context;
    private boolean dimBehind;
    private View inflaterView;
    private boolean isLight;
    private List<GlToolTipsItem> items;
    private int mMaxWith;
    private boolean noBackground;
    private GlToolTipsOnItemClickListener onItemClickListener;

    /* renamed from: paddingStart$delegate, reason: from kotlin metadata */
    private final Lazy paddingStart;
    private boolean selectable;
    private boolean showArrow;
    private boolean showDivider;
    private StatusListener statusListener;
    private View targetView;
    private CharSequence text;
    private Type type;

    /* compiled from: GlToolTips.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/widget/tooltips/GlToolTips$Alignment;", "", "(Ljava/lang/String;I)V", "START", "END", "TOP", "BOTTOM", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public enum Alignment {
        START,
        END,
        TOP,
        BOTTOM
    }

    /* compiled from: GlToolTips.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/glority/widget/tooltips/GlToolTips$StatusListener;", "", "dismiss", "", "show", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public interface StatusListener {
        void dismiss();

        void show();
    }

    /* compiled from: GlToolTips.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/glority/widget/tooltips/GlToolTips$Type;", "", "(Ljava/lang/String;I)V", "SMALL", "NORMAL", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public enum Type {
        SMALL,
        NORMAL
    }

    private final int getPaddingStart() {
        return ((Number) this.paddingStart.getValue()).intValue();
    }

    private GlToolTips() {
        this.clickOutsideClose = true;
        this.paddingStart = LazyKt.lazy(new Function0<Integer>() { // from class: com.glority.widget.tooltips.GlToolTips$paddingStart$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Integer invoke() {
                return Integer.valueOf(invoke2());
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final int invoke2() {
                GlToolTips.Type type;
                type = GlToolTips.this.type;
                if (type == GlToolTips.Type.SMALL) {
                    return GlToolTips.access$getContext$p(GlToolTips.this).getResources().getDimensionPixelOffset(R.dimen.x20);
                }
                return GlToolTips.access$getContext$p(GlToolTips.this).getResources().getDimensionPixelOffset(R.dimen.x36);
            }
        });
        this.alignment = Alignment.BOTTOM;
        this.type = Type.NORMAL;
        this.isLight = true;
        this.showArrow = true;
    }

    public /* synthetic */ GlToolTips(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ Context access$getContext$p(GlToolTips glToolTips) {
        Context context = glToolTips.context;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        return context;
    }

    /* compiled from: GlToolTips.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\u0000J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u001c\u0010\u001e\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u000bJ\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0006J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0006J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0006J\u0010\u0010&\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0018\u0010'\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018J\u001a\u0010'\u001a\u00020\u00002\b\b\u0001\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u0018J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020-J\u0016\u0010.\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020-R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/glority/widget/tooltips/GlToolTips$Builder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "dimBehind", "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/glority/widget/tooltips/GlToolTipsItem;", "mMaxWith", "", "noBackground", "onItemClickListener", "Lcom/glority/widget/tooltips/GlToolTipsOnItemClickListener;", "outsideClose", "selectable", "showArrow", "showDivider", "statusListener", "Lcom/glority/widget/tooltips/GlToolTips$StatusListener;", "text", "", "type", "Lcom/glority/widget/tooltips/GlToolTips$Type;", "view", "Landroid/view/View;", "addDivider", "setCustomView", "setDimBehind", "setItems", "setMaxWith", "maxWith", "setOutsideClose", "close", "setSelectable", "setShowArrow", "show", "setStatusListener", "setText", "setType", "showDark", "Lcom/glority/widget/tooltips/GlToolTips;", "targetView", "alignment", "Lcom/glority/widget/tooltips/GlToolTips$Alignment;", "showLight", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public static final class Builder {
        private final Context context;
        private boolean dimBehind;
        private List<GlToolTipsItem> items;
        private int mMaxWith;
        private boolean noBackground;
        private GlToolTipsOnItemClickListener onItemClickListener;
        private boolean outsideClose;
        private boolean selectable;
        private boolean showArrow;
        private boolean showDivider;
        private StatusListener statusListener;
        private CharSequence text;
        private Type type;
        private View view;

        public Builder(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.context = context;
            this.outsideClose = true;
            this.type = Type.NORMAL;
            this.showArrow = true;
        }

        public final Builder setMaxWith(int maxWith) {
            this.mMaxWith = maxWith;
            return this;
        }

        public final Builder setShowArrow(boolean show) {
            this.showArrow = show;
            return this;
        }

        public final Builder setStatusListener(StatusListener statusListener) {
            this.statusListener = statusListener;
            return this;
        }

        public static /* synthetic */ Builder setText$default(Builder builder, CharSequence charSequence, Type type, int i, Object obj) {
            if ((i & 2) != 0) {
                type = Type.NORMAL;
            }
            return builder.setText(charSequence, type);
        }

        public final Builder setText(CharSequence text, Type type) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(type, "type");
            this.text = text;
            this.type = type;
            return this;
        }

        public final Builder setType(Type type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
            return this;
        }

        public static /* synthetic */ Builder setText$default(Builder builder, int i, Type type, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                type = Type.NORMAL;
            }
            return builder.setText(i, type);
        }

        public final Builder setText(int text, Type type) {
            Intrinsics.checkNotNullParameter(type, "type");
            CharSequence text2 = this.context.getText(text);
            Intrinsics.checkNotNullExpressionValue(text2, "context.getText(text)");
            return setText(text2, type);
        }

        public final Builder setItems(List<GlToolTipsItem> items, GlToolTipsOnItemClickListener onItemClickListener) {
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(onItemClickListener, "onItemClickListener");
            this.items = items;
            this.onItemClickListener = onItemClickListener;
            return this;
        }

        public final Builder setCustomView(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
            return this;
        }

        public final Builder setOutsideClose(boolean close) {
            this.outsideClose = close;
            return this;
        }

        public final Builder setSelectable(boolean selectable) {
            this.selectable = selectable;
            return this;
        }

        public final Builder setDimBehind(boolean dimBehind) {
            this.dimBehind = dimBehind;
            return this;
        }

        public final Builder addDivider(boolean showDivider) {
            this.showDivider = showDivider;
            return this;
        }

        public final Builder noBackground() {
            this.noBackground = true;
            return this;
        }

        public final GlToolTips showLight(View targetView, Alignment alignment) {
            Intrinsics.checkNotNullParameter(targetView, "targetView");
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            GlToolTips glToolTips = new GlToolTips(null);
            glToolTips.clickOutsideClose = this.outsideClose;
            glToolTips.alignment = alignment;
            glToolTips.type = this.type;
            glToolTips.contentView = this.view;
            glToolTips.items = this.items;
            glToolTips.text = this.text;
            glToolTips.isLight = true;
            glToolTips.context = this.context;
            glToolTips.selectable = this.selectable;
            glToolTips.onItemClickListener = this.onItemClickListener;
            glToolTips.targetView = targetView;
            glToolTips.dimBehind = this.dimBehind;
            glToolTips.showDivider = this.showDivider;
            glToolTips.mMaxWith = this.mMaxWith;
            glToolTips.noBackground = this.noBackground;
            glToolTips.showArrow = this.showArrow;
            glToolTips.statusListener = this.statusListener;
            glToolTips.show();
            return glToolTips;
        }

        public final GlToolTips showDark(View targetView, Alignment alignment) {
            Intrinsics.checkNotNullParameter(targetView, "targetView");
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            GlToolTips glToolTips = new GlToolTips(null);
            glToolTips.clickOutsideClose = this.outsideClose;
            glToolTips.alignment = alignment;
            glToolTips.type = this.type;
            glToolTips.contentView = this.view;
            glToolTips.items = this.items;
            glToolTips.text = this.text;
            glToolTips.context = this.context;
            glToolTips.selectable = this.selectable;
            glToolTips.onItemClickListener = this.onItemClickListener;
            glToolTips.isLight = false;
            glToolTips.targetView = targetView;
            glToolTips.dimBehind = this.dimBehind;
            glToolTips.showDivider = this.showDivider;
            glToolTips.mMaxWith = this.mMaxWith;
            glToolTips.noBackground = this.noBackground;
            glToolTips.showArrow = this.showArrow;
            glToolTips.statusListener = this.statusListener;
            glToolTips.show();
            return glToolTips;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void show() {
        Context context = this.context;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        View createContentView = createContentView(context);
        this.inflaterView = createContentView;
        Intrinsics.checkNotNull(createContentView);
        ViewGroup containerView = (ViewGroup) createContentView.findViewById(R.id.container);
        if (this.text != null) {
            Intrinsics.checkNotNullExpressionValue(containerView, "containerView");
            adjustText(containerView);
        } else if (this.items != null) {
            Intrinsics.checkNotNullExpressionValue(containerView, "containerView");
            List<GlToolTipsItem> list = this.items;
            Intrinsics.checkNotNull(list);
            GlToolTipsOnItemClickListener glToolTipsOnItemClickListener = this.onItemClickListener;
            Intrinsics.checkNotNull(glToolTipsOnItemClickListener);
            adjustItems(containerView, list, glToolTipsOnItemClickListener);
        } else if (this.contentView != null) {
            Intrinsics.checkNotNullExpressionValue(containerView, "containerView");
            View view = this.contentView;
            Intrinsics.checkNotNull(view);
            adjustContentView(containerView, view);
        }
        View view2 = this.targetView;
        Intrinsics.checkNotNull(view2);
        Alignment alignment = this.alignment;
        View view3 = this.inflaterView;
        Intrinsics.checkNotNull(view3);
        show(view2, alignment, view3);
    }

    private final void adjustContentView(ViewGroup containerView, View contentView) {
        containerView.setPadding(0, 0, 0, 0);
        containerView.addView(contentView, -2, -2);
    }

    private final void adjustItems(ViewGroup containerView, List<GlToolTipsItem> items, GlToolTipsOnItemClickListener onItemClickListener) {
        containerView.setPadding(0, 0, 0, 0);
        Context context = this.context;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setVerticalScrollBarEnabled(false);
        RecyclerView recyclerView2 = recyclerView;
        containerView.addView(recyclerView2, new ViewGroup.LayoutParams(-2, -2));
        containerView.setBackgroundResource(this.isLight ? R.drawable.gl_tool_tips_conner12_white : R.drawable.gl_tool_tips_black_bg_conner12);
        Context context2 = this.context;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.x24);
        Context context3 = this.context;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        recyclerView2.setPadding(0, dimensionPixelOffset, 0, context3.getResources().getDimensionPixelOffset(R.dimen.x24));
        Context context4 = this.context;
        if (context4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(context4));
        recyclerView.setAdapter(new GlToolTipsAdapter(this, items, this.selectable, onItemClickListener, this.isLight, this.showDivider));
    }

    private final void adjustText(ViewGroup container) {
        int i;
        Context context = this.context;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        TextView textView = new TextView(context);
        if (this.isLight) {
            Context context2 = this.context;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
            }
            i = ContextCompat.getColor(context2, R.color.gl_text_color1);
        } else {
            i = -1;
        }
        textView.setTextColor(i);
        textView.setIncludeFontPadding(false);
        textView.setGravity(17);
        textView.setText(this.text);
        Context context3 = this.context;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        float f = context3.getResources().getDisplayMetrics().scaledDensity;
        if (this.type == Type.SMALL) {
            Context context4 = this.context;
            if (context4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
            }
            textView.setTextSize((context4.getResources().getDimension(R.dimen.x24) / f) + 0.5f);
            Context context5 = this.context;
            if (context5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
            }
            int dimensionPixelOffset = context5.getResources().getDimensionPixelOffset(R.dimen.x24);
            container.setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        } else {
            Context context6 = this.context;
            if (context6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
            }
            textView.setTextSize((context6.getResources().getDimension(R.dimen.x32) / f) + 0.5f);
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        container.addView(textView, -2, -2);
    }

    private final View createContentView(Context context) {
        View inflate;
        if (this.isLight) {
            if (this.alignment == Alignment.START || this.alignment == Alignment.END) {
                inflate = LayoutInflater.from(context).inflate(R.layout.gl_tool_tips_start_end, (ViewGroup) null);
                Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(cont…ool_tips_start_end, null)");
            } else {
                inflate = LayoutInflater.from(context).inflate(R.layout.gl_tool_tips_top_bottom, (ViewGroup) null);
                Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(cont…ol_tips_top_bottom, null)");
            }
        } else if (this.alignment == Alignment.START || this.alignment == Alignment.END) {
            inflate = LayoutInflater.from(context).inflate(R.layout.gl_tool_tips_start_end_dark, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(cont…ips_start_end_dark, null)");
        } else {
            inflate = LayoutInflater.from(context).inflate(R.layout.gl_tool_tips_top_bottom_dark, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(cont…ps_top_bottom_dark, null)");
        }
        if (this.noBackground) {
            inflate.findViewById(R.id.container).setBackgroundColor(inflate.getResources().getColor(R.color.gl_transparent));
        }
        return inflate;
    }

    public final void dismiss() {
        StatusListener statusListener = this.statusListener;
        if (statusListener != null) {
            statusListener.dismiss();
        }
        exitAnimation();
    }

    private final Rect getViewRect(View targetView, int windowWidth) {
        int[] iArr = new int[2];
        targetView.getLocationInWindow(iArr);
        if (isRtl()) {
            int width = (windowWidth - iArr[0]) - targetView.getWidth();
            int i = iArr[1];
            return new Rect(width, i, windowWidth - iArr[0], targetView.getHeight() + i);
        }
        int i2 = iArr[0];
        return new Rect(i2, iArr[1], targetView.getWidth() + i2, iArr[1] + targetView.getHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.graphics.Rect, T] */
    private final void show(View targetView, Alignment alignment, View inflateView) {
        FrameLayout.LayoutParams layoutParams;
        StatusListener statusListener = this.statusListener;
        if (statusListener != null) {
            statusListener.show();
        }
        inflateView.setVisibility(4);
        View rootView = targetView.getRootView();
        if (rootView == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) rootView;
        View inflate = LayoutInflater.from(targetView.getContext()).inflate(R.layout.gl_tool_tips_container, (ViewGroup) null);
        if (inflate == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        if (this.clickOutsideClose) {
            viewGroup2.setOnClickListener(new View.OnClickListener() { // from class: com.glority.widget.tooltips.GlToolTips$show$2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GlToolTips.this.dismiss();
                }
            });
        }
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        viewGroup.addView(viewGroup2);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = getViewRect(targetView, width);
        View archer1 = inflateView.findViewById(R.id.archer_1);
        View archer2 = inflateView.findViewById(R.id.archer_2);
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 0;
        Context context = this.context;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.x800);
        if (alignment == Alignment.START) {
            Intrinsics.checkNotNullExpressionValue(archer2, "archer2");
            archer2.setVisibility(0);
            Intrinsics.checkNotNullExpressionValue(archer1, "archer1");
            archer1.setVisibility(8);
            intRef.element = getAdjustMaxWidth(this.mMaxWith, ((Rect) objectRef.element).left - (getPaddingStart() * 2));
            this.archerView = archer2;
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        } else if (alignment == Alignment.END) {
            Intrinsics.checkNotNullExpressionValue(archer1, "archer1");
            archer1.setVisibility(0);
            Intrinsics.checkNotNullExpressionValue(archer2, "archer2");
            archer2.setVisibility(8);
            intRef.element = getAdjustMaxWidth(this.mMaxWith, (width - ((Rect) objectRef.element).right) - (getPaddingStart() * 2));
            this.archerView = archer1;
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        } else if (alignment == Alignment.TOP) {
            Intrinsics.checkNotNullExpressionValue(archer1, "archer1");
            archer1.setVisibility(8);
            Intrinsics.checkNotNullExpressionValue(archer2, "archer2");
            archer2.setVisibility(0);
            this.archerView = archer2;
            intRef.element = getAdjustMaxWidth(this.mMaxWith, width - (getPaddingStart() * 2));
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        } else {
            Intrinsics.checkNotNullExpressionValue(archer1, "archer1");
            archer1.setVisibility(0);
            Intrinsics.checkNotNullExpressionValue(archer2, "archer2");
            archer2.setVisibility(8);
            this.archerView = archer1;
            intRef.element = getAdjustMaxWidth(this.mMaxWith, width - (getPaddingStart() * 2));
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        }
        if (!this.showArrow) {
            archer1.setVisibility(4);
            archer2.setVisibility(4);
        }
        viewGroup2.addView(inflateView, layoutParams);
        inflateView.getViewTreeObserver().addOnGlobalLayoutListener(new GlToolTips$show$3(this, inflateView, intRef, dimensionPixelOffset, height, objectRef, width));
    }

    private final int getAdjustMaxWidth(int maxWidth, int currentWidth) {
        return maxWidth == 0 ? currentWidth : Math.min(maxWidth, currentWidth);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openAnimation(View inflateView) {
        if (this.dimBehind) {
            ViewParent parent = inflateView.getParent();
            if (parent == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
            final ViewGroup viewGroup = (ViewGroup) parent;
            ValueAnimator valueAnimator = ValueAnimator.ofArgb(0, 1711276032);
            Intrinsics.checkNotNullExpressionValue(valueAnimator, "valueAnimator");
            valueAnimator.setDuration(250L);
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.glority.widget.tooltips.GlToolTips$openAnimation$1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator it) {
                    ViewGroup viewGroup2 = viewGroup;
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    Object animatedValue = it.getAnimatedValue();
                    if (animatedValue == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                    }
                    viewGroup2.setBackgroundColor(((Integer) animatedValue).intValue());
                }
            });
            valueAnimator.setInterpolator(new LinearInterpolator());
            valueAnimator.start();
        }
        View view = this.archerView;
        Intrinsics.checkNotNull(view);
        float x = view.getX();
        View view2 = this.archerView;
        Intrinsics.checkNotNull(view2);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, x, view2.getY());
        scaleAnimation.setDuration(250L);
        scaleAnimation.setInterpolator(new AccelerateInterpolator());
        inflateView.startAnimation(scaleAnimation);
        inflateView.setVisibility(0);
    }

    private final void exitAnimation() {
        final View view = this.inflaterView;
        if (view != null) {
            if (this.dimBehind) {
                ViewParent parent = view.getParent();
                if (parent == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                }
                final ViewGroup viewGroup = (ViewGroup) parent;
                ValueAnimator valueAnimator = ValueAnimator.ofArgb(1711276032, 0);
                Intrinsics.checkNotNullExpressionValue(valueAnimator, "valueAnimator");
                valueAnimator.setDuration(200L);
                valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.glority.widget.tooltips.GlToolTips$exitAnimation$1$1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator it) {
                        ViewGroup viewGroup2 = viewGroup;
                        Intrinsics.checkNotNullExpressionValue(it, "it");
                        Object animatedValue = it.getAnimatedValue();
                        if (animatedValue == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                        }
                        viewGroup2.setBackgroundColor(((Integer) animatedValue).intValue());
                    }
                });
                valueAnimator.setInterpolator(new LinearInterpolator());
                valueAnimator.start();
            }
            View view2 = this.archerView;
            float x = view2 != null ? view2.getX() : 0.0f;
            View view3 = this.archerView;
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, x, view3 != null ? view3.getY() : 0.0f);
            scaleAnimation.setDuration(200L);
            scaleAnimation.setInterpolator(new AccelerateInterpolator());
            scaleAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.glority.widget.tooltips.GlToolTips$exitAnimation$1$2
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    try {
                        View rootView = view.getRootView();
                        if (rootView == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                        }
                        ViewGroup viewGroup2 = (ViewGroup) rootView;
                        Object parent2 = view.getParent();
                        if (parent2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                        }
                        viewGroup2.removeView((View) parent2);
                    } catch (Throwable unused) {
                    }
                }
            });
            view.startAnimation(scaleAnimation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void adjustStartEnd(int inflateViewWidth, int inflateViewHeight, Rect viewRect, int windowHeight, FrameLayout.LayoutParams layoutParams, View archerView) {
        if (this.alignment == Alignment.END || this.alignment == Alignment.START) {
            int height = (inflateViewHeight - viewRect.height()) / 2;
            int height2 = (windowHeight - viewRect.top) - viewRect.height();
            if (height <= viewRect.top && height <= height2) {
                layoutParams.topMargin = viewRect.centerY() - (inflateViewHeight / 2);
            } else if (height > viewRect.top) {
                Context context = this.context;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("context");
                }
                layoutParams.topMargin = context.getResources().getDimensionPixelOffset(R.dimen.x50);
            } else {
                int i = windowHeight - inflateViewHeight;
                Context context2 = this.context;
                if (context2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("context");
                }
                layoutParams.topMargin = i - context2.getResources().getDimensionPixelOffset(R.dimen.x30);
            }
            if (this.alignment == Alignment.START) {
                layoutParams.setMarginStart(viewRect.left - inflateViewWidth);
            } else {
                layoutParams.setMarginStart(viewRect.left + viewRect.width());
            }
            View view = this.inflaterView;
            Intrinsics.checkNotNull(view);
            view.setLayoutParams(layoutParams);
            ViewGroup.LayoutParams layoutParams2 = archerView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
            layoutParams3.topMargin = (viewRect.centerY() - layoutParams.topMargin) - (archerView.getHeight() / 2);
            archerView.setLayoutParams(layoutParams3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void adjustTopAndBottom(int inflateViewWidth, int windowHeight, Rect viewRect, int windowWidth, View archerView, FrameLayout.LayoutParams layoutParams) {
        if (this.alignment == Alignment.TOP || this.alignment == Alignment.BOTTOM) {
            boolean z = viewRect.centerX() < windowWidth / 2;
            int i = viewRect.left;
            int width = (inflateViewWidth - viewRect.width()) / 2;
            int width2 = (windowWidth - i) - viewRect.width();
            if (width <= i && width <= width2) {
                ViewGroup.LayoutParams layoutParams2 = archerView.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
                ((LinearLayout.LayoutParams) layoutParams2).gravity = 1;
                layoutParams.setMarginStart(i - width);
            } else if (z) {
                layoutParams.gravity = GravityCompat.START;
                layoutParams.setMarginStart(getPaddingStart());
                ViewGroup.LayoutParams layoutParams3 = archerView.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                layoutParams4.gravity = GravityCompat.START;
                layoutParams4.setMarginStart((viewRect.centerX() - (getViewRect(archerView, windowWidth).width() / 2)) - getPaddingStart());
                archerView.setLayoutParams(layoutParams4);
            } else {
                layoutParams.gravity = GravityCompat.END;
                layoutParams.setMarginEnd(getPaddingStart());
                ViewGroup.LayoutParams layoutParams5 = archerView.getLayoutParams();
                if (layoutParams5 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
                LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
                layoutParams6.gravity = GravityCompat.END;
                layoutParams6.setMarginEnd(((windowWidth - viewRect.centerX()) - (getViewRect(archerView, windowWidth).width() / 2)) - getPaddingStart());
                archerView.setLayoutParams(layoutParams6);
            }
            if (this.alignment == Alignment.TOP) {
                layoutParams.bottomMargin = (windowHeight - viewRect.top) + 8;
                if (layoutParams.gravity != -1) {
                    layoutParams.gravity |= 80;
                } else {
                    layoutParams.gravity = 80;
                }
            } else {
                layoutParams.topMargin = viewRect.top + viewRect.height() + 8;
            }
            View view = this.inflaterView;
            Intrinsics.checkNotNull(view);
            view.setLayoutParams(layoutParams);
        }
    }

    private final boolean isRtl() {
        Context context = this.context;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "context.resources.configuration");
        return configuration.getLayoutDirection() == 1;
    }

    private final void setMarginStart(ViewGroup.MarginLayoutParams marginLayoutParams, int margin) {
        if (isRtl()) {
            marginLayoutParams.setMarginEnd(margin);
        } else {
            marginLayoutParams.setMarginStart(margin);
        }
    }

    private final void setMarginEnd(ViewGroup.MarginLayoutParams marginLayoutParams, int margin) {
        if (isRtl()) {
            marginLayoutParams.setMarginStart(margin);
        } else {
            marginLayoutParams.setMarginEnd(margin);
        }
    }
}
