package com.glority.widget.uitls;

import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.transition.AutoTransition;
import androidx.transition.Transition;
import com.glority.android.cmsui2.common.CmsUILogEvents;
import com.glority.widget.uitls.GlTextViewSuffixWrapper;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlTextViewSuffixWrapper.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001LB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010?\u001a\u00020@2\b\b\u0002\u0010A\u001a\u00020\nH\u0007J\u0012\u0010B\u001a\u00020@2\b\b\u0002\u0010A\u001a\u00020\nH\u0007J\u0012\u0010C\u001a\u00020@2\b\u00109\u001a\u0004\u0018\u00010:H\u0002J\u0012\u0010D\u001a\u00020@2\b\u00109\u001a\u0004\u0018\u00010:H\u0002J\u001e\u0010E\u001a\u00020@2\u0006\u0010F\u001a\u00020+2\u0006\u0010G\u001a\u00020+2\u0006\u0010H\u001a\u00020IJ \u0010E\u001a\u00020@2\u0006\u0010F\u001a\u00020+2\u0006\u0010G\u001a\u00020+2\b\b\u0001\u0010J\u001a\u00020+J(\u0010E\u001a\u00020@2\u0006\u0010F\u001a\u00020+2\u0006\u0010G\u001a\u00020+2\b\b\u0001\u0010J\u001a\u00020+2\u0006\u0010H\u001a\u00020IJ\u0012\u0010K\u001a\u00020@2\b\b\u0002\u0010A\u001a\u00020\nH\u0007R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fR$\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010 \u001a\u0004\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R!\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\u001a\u0010*\u001a\u00020+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u00101RS\u00102\u001aG\u0012\u0013\u0012\u001104¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(7\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b( \u0012\u0013\u0012\u00110+¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(8\u0012\u0004\u0012\u00020\u000603X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00109\u001a\u00020:X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006M"}, d2 = {"Lcom/glority/widget/uitls/GlTextViewSuffixWrapper;", "", "textView", "Landroid/widget/TextView;", "(Landroid/widget/TextView;)V", "collapseCache", "", "collapseLayoutCache", "Landroid/text/Layout;", "enableCache", "", "getEnableCache", "()Z", "setEnableCache", "(Z)V", "enableMaxLinesCheck", "getEnableMaxLinesCheck", "setEnableMaxLinesCheck", "<set-?>", "isCollapsed", "value", "mainContent", "getMainContent", "()Ljava/lang/CharSequence;", "setMainContent", "(Ljava/lang/CharSequence;)V", "sceneRoot", "Landroid/view/ViewGroup;", "getSceneRoot", "()Landroid/view/ViewGroup;", "setSceneRoot", "(Landroid/view/ViewGroup;)V", "suffix", "getSuffix", "setSuffix", "suffixColorList", "", "Lcom/glority/widget/uitls/GlTextViewSuffixWrapper$SuffixColor;", "getSuffixColorList", "()Ljava/util/List;", "suffixColorList$delegate", "Lkotlin/Lazy;", "targetLineCount", "", "getTargetLineCount", "()I", "setTargetLineCount", "(I)V", "getTextView", "()Landroid/widget/TextView;", "textWrapper", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "text", "suffixIndex", "transition", "Landroidx/transition/Transition;", "getTransition", "()Landroidx/transition/Transition;", "setTransition", "(Landroidx/transition/Transition;)V", CmsUILogEvents.CMS_NAME_TYPE_COLLAPSE, "", "animation", "expand", "performCollapse", "performExpand", "suffixColor", "fromIndex", "toIndex", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/View$OnClickListener;", "colorRes", "toggle", "SuffixColor", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class GlTextViewSuffixWrapper {
    private CharSequence collapseCache;
    private Layout collapseLayoutCache;
    private boolean enableCache;
    private boolean enableMaxLinesCheck;
    private boolean isCollapsed;
    private CharSequence mainContent;
    private ViewGroup sceneRoot;
    private CharSequence suffix;

    /* renamed from: suffixColorList$delegate, reason: from kotlin metadata */
    private final Lazy suffixColorList;
    private int targetLineCount;
    private final TextView textView;
    private final Function3<String, CharSequence, Integer, CharSequence> textWrapper;
    private Transition transition;

    /* JADX INFO: Access modifiers changed from: private */
    public final List<SuffixColor> getSuffixColorList() {
        return (List) this.suffixColorList.getValue();
    }

    public final void collapse() {
        collapse$default(this, false, 1, null);
    }

    public final void expand() {
        expand$default(this, false, 1, null);
    }

    public final void toggle() {
        toggle$default(this, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GlTextViewSuffixWrapper.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J:\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/glority/widget/uitls/GlTextViewSuffixWrapper$SuffixColor;", "", "fromIndex", "", "toIndex", "color", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/View$OnClickListener;", "(IILjava/lang/Integer;Landroid/view/View$OnClickListener;)V", "getColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFromIndex", "()I", "getListener", "()Landroid/view/View$OnClickListener;", "getToIndex", "component1", "component2", "component3", "component4", "copy", "(IILjava/lang/Integer;Landroid/view/View$OnClickListener;)Lcom/glority/widget/uitls/GlTextViewSuffixWrapper$SuffixColor;", "equals", "", "other", "hashCode", "toString", "", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public static final /* data */ class SuffixColor {
        private final Integer color;
        private final int fromIndex;
        private final View.OnClickListener listener;
        private final int toIndex;

        public static /* synthetic */ SuffixColor copy$default(SuffixColor suffixColor, int i, int i2, Integer num, View.OnClickListener onClickListener, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = suffixColor.fromIndex;
            }
            if ((i3 & 2) != 0) {
                i2 = suffixColor.toIndex;
            }
            if ((i3 & 4) != 0) {
                num = suffixColor.color;
            }
            if ((i3 & 8) != 0) {
                onClickListener = suffixColor.listener;
            }
            return suffixColor.copy(i, i2, num, onClickListener);
        }

        /* renamed from: component1, reason: from getter */
        public final int getFromIndex() {
            return this.fromIndex;
        }

        /* renamed from: component2, reason: from getter */
        public final int getToIndex() {
            return this.toIndex;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getColor() {
            return this.color;
        }

        /* renamed from: component4, reason: from getter */
        public final View.OnClickListener getListener() {
            return this.listener;
        }

        public final SuffixColor copy(int fromIndex, int toIndex, Integer color, View.OnClickListener listener) {
            return new SuffixColor(fromIndex, toIndex, color, listener);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SuffixColor)) {
                return false;
            }
            SuffixColor suffixColor = (SuffixColor) other;
            return this.fromIndex == suffixColor.fromIndex && this.toIndex == suffixColor.toIndex && Intrinsics.areEqual(this.color, suffixColor.color) && Intrinsics.areEqual(this.listener, suffixColor.listener);
        }

        public int hashCode() {
            int hashCode = ((Integer.hashCode(this.fromIndex) * 31) + Integer.hashCode(this.toIndex)) * 31;
            Integer num = this.color;
            int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
            View.OnClickListener onClickListener = this.listener;
            return hashCode2 + (onClickListener != null ? onClickListener.hashCode() : 0);
        }

        public String toString() {
            return "SuffixColor(fromIndex=" + this.fromIndex + ", toIndex=" + this.toIndex + ", color=" + this.color + ", listener=" + this.listener + ")";
        }

        public SuffixColor(int i, int i2, Integer num, View.OnClickListener onClickListener) {
            this.fromIndex = i;
            this.toIndex = i2;
            this.color = num;
            this.listener = onClickListener;
        }

        public final int getFromIndex() {
            return this.fromIndex;
        }

        public final int getToIndex() {
            return this.toIndex;
        }

        public final Integer getColor() {
            return this.color;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public /* synthetic */ SuffixColor(int r1, int r2, java.lang.Integer r3, android.view.View.OnClickListener r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
            /*
                r0 = this;
                r5 = r5 & 8
                if (r5 == 0) goto L8
                r4 = 0
                r5 = r4
                android.view.View$OnClickListener r5 = (android.view.View.OnClickListener) r5
            L8:
                r0.<init>(r1, r2, r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.uitls.GlTextViewSuffixWrapper.SuffixColor.<init>(int, int, java.lang.Integer, android.view.View$OnClickListener, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final View.OnClickListener getListener() {
            return this.listener;
        }
    }

    public GlTextViewSuffixWrapper(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        this.textView = textView;
        CharSequence text = textView.getText();
        Intrinsics.checkNotNullExpressionValue(text, "textView.text");
        this.mainContent = text;
        this.enableMaxLinesCheck = true;
        this.targetLineCount = 2;
        this.transition = new AutoTransition();
        ViewParent parent = textView.getParent();
        if (parent == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.sceneRoot = (ViewGroup) parent;
        this.textWrapper = new Function3<String, CharSequence, Integer, SpannableStringBuilder>() { // from class: com.glority.widget.uitls.GlTextViewSuffixWrapper$textWrapper$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ SpannableStringBuilder invoke(String str, CharSequence charSequence, Integer num) {
                return invoke(str, charSequence, num.intValue());
            }

            public final SpannableStringBuilder invoke(String text2, CharSequence suffix, int i) {
                List<GlTextViewSuffixWrapper.SuffixColor> suffixColorList;
                Intrinsics.checkNotNullParameter(text2, "text");
                Intrinsics.checkNotNullParameter(suffix, "suffix");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text2);
                suffixColorList = GlTextViewSuffixWrapper.this.getSuffixColorList();
                for (GlTextViewSuffixWrapper.SuffixColor suffixColor : suffixColorList) {
                    int fromIndex = suffixColor.getFromIndex() + i;
                    int toIndex = suffixColor.getToIndex() + i;
                    final View.OnClickListener listener = suffixColor.getListener();
                    if (listener != null) {
                        spannableStringBuilder.setSpan(new ClickableSpan() { // from class: com.glority.widget.uitls.GlTextViewSuffixWrapper$textWrapper$1$1$1$1$1
                            @Override // android.text.style.ClickableSpan
                            public void onClick(View widget) {
                                Intrinsics.checkNotNullParameter(widget, "widget");
                                listener.onClick(widget);
                            }
                        }, fromIndex, toIndex, 33);
                        GlTextViewSuffixWrapper.this.getTextView().setMovementMethod(LinkMovementMethod.getInstance());
                    }
                    Integer color = suffixColor.getColor();
                    if (color != null) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(color.intValue()), fromIndex, toIndex, 33);
                    }
                }
                return spannableStringBuilder;
            }
        };
        this.suffixColorList = LazyKt.lazy(new Function0<List<SuffixColor>>() { // from class: com.glority.widget.uitls.GlTextViewSuffixWrapper$suffixColorList$2
            @Override // kotlin.jvm.functions.Function0
            public final List<GlTextViewSuffixWrapper.SuffixColor> invoke() {
                return new ArrayList();
            }
        });
        if (textView.getLayoutParams().width == -2) {
            throw new RuntimeException("textView's width can't be wrap_content. Only support match_parent or specified size");
        }
    }

    public final TextView getTextView() {
        return this.textView;
    }

    public final CharSequence getMainContent() {
        return this.mainContent;
    }

    public final void setMainContent(CharSequence value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.collapseCache = null;
        this.mainContent = value;
    }

    public final CharSequence getSuffix() {
        return this.suffix;
    }

    public final void setSuffix(CharSequence charSequence) {
        this.collapseCache = null;
        this.suffix = charSequence;
    }

    /* renamed from: isCollapsed, reason: from getter */
    public final boolean getIsCollapsed() {
        return this.isCollapsed;
    }

    public final boolean getEnableCache() {
        return this.enableCache;
    }

    public final void setEnableCache(boolean z) {
        this.enableCache = z;
    }

    public final boolean getEnableMaxLinesCheck() {
        return this.enableMaxLinesCheck;
    }

    public final void setEnableMaxLinesCheck(boolean z) {
        this.enableMaxLinesCheck = z;
    }

    public final int getTargetLineCount() {
        return this.targetLineCount;
    }

    public final void setTargetLineCount(int i) {
        this.targetLineCount = i;
    }

    public final Transition getTransition() {
        return this.transition;
    }

    public final void setTransition(Transition transition) {
        Intrinsics.checkNotNullParameter(transition, "<set-?>");
        this.transition = transition;
    }

    public final ViewGroup getSceneRoot() {
        return this.sceneRoot;
    }

    public final void setSceneRoot(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<set-?>");
        this.sceneRoot = viewGroup;
    }

    public final void suffixColor(int fromIndex, int toIndex, int colorRes) {
        Resources resources = this.textView.getResources();
        Context context = this.textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "textView.context");
        getSuffixColorList().add(new SuffixColor(fromIndex, toIndex, Integer.valueOf(ResourcesCompat.getColor(resources, colorRes, context.getTheme())), null));
    }

    public final void suffixColor(int fromIndex, int toIndex, View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        getSuffixColorList().add(new SuffixColor(fromIndex, toIndex, null, listener));
    }

    public final void suffixColor(int fromIndex, int toIndex, int colorRes, View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Resources resources = this.textView.getResources();
        Context context = this.textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "textView.context");
        getSuffixColorList().add(new SuffixColor(fromIndex, toIndex, Integer.valueOf(ResourcesCompat.getColor(resources, colorRes, context.getTheme())), listener));
    }

    public static /* synthetic */ void collapse$default(GlTextViewSuffixWrapper glTextViewSuffixWrapper, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        glTextViewSuffixWrapper.collapse(z);
    }

    public final void collapse(boolean animation) {
        performCollapse(animation ? this.transition : null);
    }

    public static /* synthetic */ void toggle$default(GlTextViewSuffixWrapper glTextViewSuffixWrapper, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        glTextViewSuffixWrapper.toggle(z);
    }

    public final void toggle(boolean animation) {
        if (this.isCollapsed) {
            expand(animation);
        } else {
            collapse(animation);
        }
    }

    public static /* synthetic */ void expand$default(GlTextViewSuffixWrapper glTextViewSuffixWrapper, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        glTextViewSuffixWrapper.expand(z);
    }

    public final void expand(boolean animation) {
        performExpand(animation ? this.transition : null);
    }

    private final void performExpand(Transition transition) {
        this.isCollapsed = false;
        GlTextViewSuffixWrapperKt.expand(this.textView, this.mainContent, transition, this.sceneRoot);
    }

    private final void performCollapse(Transition transition) {
        if (!(!this.enableMaxLinesCheck || this.textView.getMaxLines() >= this.targetLineCount)) {
            throw new IllegalArgumentException(("textView.maxLines(" + this.textView.getMaxLines() + ") < targetLineCount(" + this.targetLineCount + ')').toString());
        }
        this.isCollapsed = true;
        final GlTextViewSuffixWrapper$performCollapse$2 glTextViewSuffixWrapper$performCollapse$2 = new GlTextViewSuffixWrapper$performCollapse$2(this, transition);
        if (this.suffix == null) {
            glTextViewSuffixWrapper$performCollapse$2.invoke2();
            return;
        }
        if (this.enableCache && this.collapseCache != null && Intrinsics.areEqual(this.collapseLayoutCache, this.textView.getLayout())) {
            if (Intrinsics.areEqual(this.collapseCache, this.mainContent)) {
                return;
            }
            if (transition != null) {
                TextView textView = this.textView;
                CharSequence charSequence = this.collapseCache;
                Intrinsics.checkNotNull(charSequence);
                GlTextViewSuffixWrapperKt.setTextWithAnimator(textView, charSequence, transition, this.sceneRoot);
                return;
            }
            this.textView.setMaxLines(this.targetLineCount);
            this.textView.setEllipsize(TextUtils.TruncateAt.END);
            this.textView.setText(this.collapseCache);
            return;
        }
        TextView textView2 = this.textView;
        CharSequence charSequence2 = this.mainContent;
        CharSequence charSequence3 = this.suffix;
        Intrinsics.checkNotNull(charSequence3);
        GlTextViewSuffixWrapperKt.collapse(textView2, charSequence2, charSequence3, this.targetLineCount, transition, this.sceneRoot, new Function1<CharSequence, Unit>() { // from class: com.glority.widget.uitls.GlTextViewSuffixWrapper$performCollapse$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence4) {
                invoke2(charSequence4);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CharSequence text) {
                Intrinsics.checkNotNullParameter(text, "text");
                GlTextViewSuffixWrapper.this.collapseCache = text;
                GlTextViewSuffixWrapper glTextViewSuffixWrapper = GlTextViewSuffixWrapper.this;
                glTextViewSuffixWrapper.collapseLayoutCache = glTextViewSuffixWrapper.getTextView().getLayout();
            }
        }, new Function1<CharSequence, Unit>() { // from class: com.glority.widget.uitls.GlTextViewSuffixWrapper$performCollapse$4
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence4) {
                invoke2(charSequence4);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CharSequence it) {
                Intrinsics.checkNotNullParameter(it, "it");
                GlTextViewSuffixWrapper$performCollapse$2.this.invoke2();
            }
        }, this.textWrapper);
    }
}
