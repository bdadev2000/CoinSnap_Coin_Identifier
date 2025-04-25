package com.glority.widget.imagepager;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.glority.widget.GlWidgetConfig;
import com.glority.widget.R;
import com.glority.widget.databinding.GlImagepagerBinding;
import com.glority.widget.imagepager.GlImagePager;
import com.glority.widget.tooltips.GlToolTips;
import com.glority.widget.uitls.CopyrightUtil;
import com.glority.widget.uitls.GlTextViewSuffixWrapper;
import com.glority.widget.uitls.UiUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlImagePager.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0006<=>?@AB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010*\u001a\u00020+J\"\u0010,\u001a\u00020-2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\b\u0002\u0010/\u001a\u00020\u0007H\u0002J\b\u00100\u001a\u00020-H\u0002J\u0010\u00101\u001a\u00020-2\u0006\u0010/\u001a\u00020\u0007H\u0002J\u0010\u00102\u001a\u00020-2\u0006\u00103\u001a\u000204H\u0002J\u0018\u00105\u001a\u00020-2\u0006\u00106\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0007H\u0002J\u0010\u00108\u001a\u00020-2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u00109\u001a\u00020-2\u0006\u0010:\u001a\u00020;H\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006B"}, d2 = {"Lcom/glority/widget/imagepager/GlImagePager;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "adapter", "Lcom/glority/widget/imagepager/GlImagePagerAdapter;", "binding", "Lcom/glority/widget/databinding/GlImagepagerBinding;", "data", "", "Lcom/glority/widget/imagepager/GlImageItem;", "descLineThreshold", "errorHolder", "Ljava/lang/Integer;", "indexLocation", "Lcom/glority/widget/imagepager/GlImagePager$IndexLocation;", "llTextViewSuffixWrapper", "Lcom/glority/widget/uitls/GlTextViewSuffixWrapper;", "loadingHolder", "onCopyRightClickListener", "Lcom/glority/widget/imagepager/GlImagePagerOnClickListener;", "onDeleteClickListener", "Lcom/glority/widget/imagepager/GlImagePager$OnDeleteClickListener;", "onLongTapListener", "Lcom/glority/widget/imagepager/GlImagePager$OnLongTapListener;", "getOnLongTapListener$mod_release", "()Lcom/glority/widget/imagepager/GlImagePager$OnLongTapListener;", "setOnLongTapListener$mod_release", "(Lcom/glority/widget/imagepager/GlImagePager$OnLongTapListener;)V", "onPageSelectedListener", "Lcom/glority/widget/imagepager/GlImagePager$OnPageSelectedListener;", "onSingleTapListener", "Lcom/glority/widget/imagepager/GlImagePager$OnSingleTapListener;", "getOnSingleTapListener$mod_release", "()Lcom/glority/widget/imagepager/GlImagePager$OnSingleTapListener;", "setOnSingleTapListener$mod_release", "(Lcom/glority/widget/imagepager/GlImagePager$OnSingleTapListener;)V", "builder", "Lcom/glority/widget/imagepager/GlImagePager$GlImagePagerBuilder;", "init", "", "list", "index", "initViewPager", "onPageSelected", "setDesc", "desc", "", "setIndex", "position", "total", "setIndexLocation", "visibleDeleteIcon", "visible", "", "GlImagePagerBuilder", "IndexLocation", "OnDeleteClickListener", "OnLongTapListener", "OnPageSelectedListener", "OnSingleTapListener", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class GlImagePager extends FrameLayout {
    private GlImagePagerAdapter adapter;
    private GlImagepagerBinding binding;
    private List<GlImageItem> data;
    private int descLineThreshold;
    private Integer errorHolder;
    private IndexLocation indexLocation;
    private GlTextViewSuffixWrapper llTextViewSuffixWrapper;
    private Integer loadingHolder;
    private GlImagePagerOnClickListener onCopyRightClickListener;
    private OnDeleteClickListener onDeleteClickListener;
    private OnLongTapListener onLongTapListener;
    private OnPageSelectedListener onPageSelectedListener;
    private OnSingleTapListener onSingleTapListener;

    /* compiled from: GlImagePager.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/glority/widget/imagepager/GlImagePager$IndexLocation;", "", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "NONE", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public enum IndexLocation {
        TOP,
        BOTTOM,
        NONE
    }

    /* compiled from: GlImagePager.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/glority/widget/imagepager/GlImagePager$OnDeleteClickListener;", "", "delete", "", "glImageItem", "Lcom/glority/widget/imagepager/GlImageItem;", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public interface OnDeleteClickListener {
        void delete(GlImageItem glImageItem);
    }

    /* compiled from: GlImagePager.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/glority/widget/imagepager/GlImagePager$OnLongTapListener;", "", "tap", "", "glImageItem", "Lcom/glority/widget/imagepager/GlImageItem;", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public interface OnLongTapListener {
        void tap(GlImageItem glImageItem);
    }

    /* compiled from: GlImagePager.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/glority/widget/imagepager/GlImagePager$OnPageSelectedListener;", "", "selected", "", "index", "", "glImageItem", "Lcom/glority/widget/imagepager/GlImageItem;", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public interface OnPageSelectedListener {
        void selected(int index, GlImageItem glImageItem);
    }

    /* compiled from: GlImagePager.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/glority/widget/imagepager/GlImagePager$OnSingleTapListener;", "", "tap", "", "glImageItem", "Lcom/glority/widget/imagepager/GlImageItem;", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public interface OnSingleTapListener {
        void tap(GlImageItem glImageItem);
    }

    public GlImagePager(Context context) {
        this(context, null, 0, 6, null);
    }

    public GlImagePager(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ GlImagePager(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L8
            r2 = 0
            r5 = r2
            android.util.AttributeSet r5 = (android.util.AttributeSet) r5
        L8:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            r3 = 0
        Ld:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.imagepager.GlImagePager.<init>(android.content.Context, android.util.AttributeSet, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlImagePager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.indexLocation = IndexLocation.BOTTOM;
        this.descLineThreshold = 4;
        GlImagepagerBinding inflate = GlImagepagerBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "GlImagepagerBinding.infl…rom(context), this, true)");
        this.binding = inflate;
    }

    /* compiled from: GlImagePager.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\tJ\u0016\u0010\u001d\u001a\u00020\u00002\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u001a\u0010\u001f\u001a\u00020\u00002\b\b\u0001\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\tJ\u0010\u0010 \u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0010\u0010!\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0010\u0010\"\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0010\u0010#\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/glority/widget/imagepager/GlImagePager$GlImagePagerBuilder;", "", "glImagePager", "Lcom/glority/widget/imagepager/GlImagePager;", "(Lcom/glority/widget/imagepager/GlImagePager;)V", "data", "", "Lcom/glority/widget/imagepager/GlImageItem;", "descLineThreshold", "", "errorHolder", "index", "indexLocation", "Lcom/glority/widget/imagepager/GlImagePager$IndexLocation;", "loadingHolder", "onCopyRightClickListener", "Lcom/glority/widget/imagepager/GlImagePagerOnClickListener;", "onDeleteClickListener", "Lcom/glority/widget/imagepager/GlImagePager$OnDeleteClickListener;", "onLongTapListener", "Lcom/glority/widget/imagepager/GlImagePager$OnLongTapListener;", "onPageSelectedListener", "Lcom/glority/widget/imagepager/GlImagePager$OnPageSelectedListener;", "onSingleTapListener", "Lcom/glority/widget/imagepager/GlImagePager$OnSingleTapListener;", "build", "", "setCopyRightClickListener", "setCurrentIndex", "setData", "setDescLineThreshold", "setImageHolder", "setOnDeleteClickListener", "setOnLongTapListener", "setOnPageSelectedListener", "setOnSingleTapListener", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public static final class GlImagePagerBuilder {
        private List<GlImageItem> data;
        private int descLineThreshold;
        private int errorHolder;
        private final GlImagePager glImagePager;
        private int index;
        private IndexLocation indexLocation;
        private int loadingHolder;
        private GlImagePagerOnClickListener onCopyRightClickListener;
        private OnDeleteClickListener onDeleteClickListener;
        private OnLongTapListener onLongTapListener;
        private OnPageSelectedListener onPageSelectedListener;
        private OnSingleTapListener onSingleTapListener;

        public GlImagePagerBuilder(GlImagePager glImagePager) {
            Intrinsics.checkNotNullParameter(glImagePager, "glImagePager");
            this.glImagePager = glImagePager;
            this.errorHolder = GlWidgetConfig.INSTANCE.getErrorImageHolder();
            this.loadingHolder = GlWidgetConfig.INSTANCE.getImageLoadingHolder();
            this.indexLocation = IndexLocation.BOTTOM;
            this.descLineThreshold = 4;
        }

        public final GlImagePagerBuilder setData(List<GlImageItem> data) {
            this.data = data;
            return this;
        }

        public final GlImagePagerBuilder setImageHolder(int loadingHolder, int errorHolder) {
            this.loadingHolder = loadingHolder;
            this.errorHolder = errorHolder;
            return this;
        }

        public final GlImagePagerBuilder setCurrentIndex(int index) {
            this.index = index;
            return this;
        }

        public final GlImagePagerBuilder setOnSingleTapListener(OnSingleTapListener onSingleTapListener) {
            this.onSingleTapListener = onSingleTapListener;
            return this;
        }

        public final GlImagePagerBuilder setOnLongTapListener(OnLongTapListener onLongTapListener) {
            this.onLongTapListener = onLongTapListener;
            return this;
        }

        public final GlImagePagerBuilder setOnDeleteClickListener(OnDeleteClickListener onDeleteClickListener) {
            this.onDeleteClickListener = onDeleteClickListener;
            return this;
        }

        public final GlImagePagerBuilder setOnPageSelectedListener(OnPageSelectedListener onPageSelectedListener) {
            this.onPageSelectedListener = onPageSelectedListener;
            return this;
        }

        public final GlImagePagerBuilder setCopyRightClickListener(GlImagePagerOnClickListener onCopyRightClickListener) {
            Intrinsics.checkNotNullParameter(onCopyRightClickListener, "onCopyRightClickListener");
            this.onCopyRightClickListener = onCopyRightClickListener;
            return this;
        }

        public final GlImagePagerBuilder indexLocation(IndexLocation indexLocation) {
            Intrinsics.checkNotNullParameter(indexLocation, "indexLocation");
            this.indexLocation = indexLocation;
            return this;
        }

        public final GlImagePagerBuilder setDescLineThreshold(int descLineThreshold) {
            this.descLineThreshold = descLineThreshold;
            return this;
        }

        public final void build() {
            this.glImagePager.setOnSingleTapListener$mod_release(this.onSingleTapListener);
            this.glImagePager.onDeleteClickListener = this.onDeleteClickListener;
            this.glImagePager.setOnLongTapListener$mod_release(this.onLongTapListener);
            this.glImagePager.setOnSingleTapListener$mod_release(this.onSingleTapListener);
            this.glImagePager.onPageSelectedListener = this.onPageSelectedListener;
            this.glImagePager.indexLocation = this.indexLocation;
            this.glImagePager.onCopyRightClickListener = this.onCopyRightClickListener;
            this.glImagePager.errorHolder = Integer.valueOf(this.errorHolder);
            this.glImagePager.loadingHolder = Integer.valueOf(this.loadingHolder);
            this.glImagePager.init(this.data, this.index);
        }
    }

    /* renamed from: getOnSingleTapListener$mod_release, reason: from getter */
    public final OnSingleTapListener getOnSingleTapListener() {
        return this.onSingleTapListener;
    }

    public final void setOnSingleTapListener$mod_release(OnSingleTapListener onSingleTapListener) {
        this.onSingleTapListener = onSingleTapListener;
    }

    /* renamed from: getOnLongTapListener$mod_release, reason: from getter */
    public final OnLongTapListener getOnLongTapListener() {
        return this.onLongTapListener;
    }

    public final void setOnLongTapListener$mod_release(OnLongTapListener onLongTapListener) {
        this.onLongTapListener = onLongTapListener;
    }

    public final GlImagePagerBuilder builder() {
        return new GlImagePagerBuilder(this);
    }

    static /* synthetic */ void init$default(GlImagePager glImagePager, List list, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        glImagePager.init(list, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void init(List<GlImageItem> list, int index) {
        UiUtils uiUtils = UiUtils.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int statusBarHeight = uiUtils.getStatusBarHeight(context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        int dimension = statusBarHeight + ((int) context2.getResources().getDimension(R.dimen.x11));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        int dimension2 = dimension - ((int) context3.getResources().getDimension(R.dimen.x32));
        this.binding.topIndexContainer.setPadding(0, dimension2, 0, 0);
        ImageView imageView = this.binding.deleteIv;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.deleteIv");
        ImageView imageView2 = imageView;
        ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = dimension2;
            imageView2.setLayoutParams(marginLayoutParams);
            this.data = list;
            setIndexLocation(this.indexLocation);
            initViewPager();
            this.binding.deleteIv.setOnClickListener(new View.OnClickListener() { // from class: com.glority.widget.imagepager.GlImagePager$init$2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    List list2;
                    GlImagepagerBinding glImagepagerBinding;
                    List list3;
                    GlImagePager.OnDeleteClickListener onDeleteClickListener;
                    GlImagePagerAdapter glImagePagerAdapter;
                    list2 = GlImagePager.this.data;
                    List list4 = list2;
                    if (list4 == null || list4.isEmpty()) {
                        GlImagePager.this.onPageSelected(0);
                        return;
                    }
                    glImagepagerBinding = GlImagePager.this.binding;
                    ViewPager2 viewPager2 = glImagepagerBinding.vp2;
                    Intrinsics.checkNotNullExpressionValue(viewPager2, "binding.vp2");
                    int currentItem = viewPager2.getCurrentItem();
                    list3 = GlImagePager.this.data;
                    Intrinsics.checkNotNull(list3);
                    GlImageItem glImageItem = (GlImageItem) list3.get(currentItem);
                    onDeleteClickListener = GlImagePager.this.onDeleteClickListener;
                    if (onDeleteClickListener != null) {
                        onDeleteClickListener.delete(glImageItem);
                    }
                    glImagePagerAdapter = GlImagePager.this.adapter;
                    if (glImagePagerAdapter != null) {
                        glImagePagerAdapter.notifyItemRemoved(currentItem);
                    }
                    GlImagePager.this.onPageSelected(currentItem);
                }
            });
            this.binding.vp2.setCurrentItem(index, false);
            onPageSelected(index);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    private final void initViewPager() {
        List<GlImageItem> list = this.data;
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        this.adapter = new GlImagePagerAdapter(list, this, this.loadingHolder, this.errorHolder);
        ViewPager2 viewPager2 = this.binding.vp2;
        Intrinsics.checkNotNullExpressionValue(viewPager2, "binding.vp2");
        viewPager2.setOffscreenPageLimit(3);
        ViewPager2 viewPager22 = this.binding.vp2;
        Intrinsics.checkNotNullExpressionValue(viewPager22, "binding.vp2");
        viewPager22.setAdapter(this.adapter);
        this.binding.vp2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.glority.widget.imagepager.GlImagePager$initViewPager$1
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrollStateChanged(int state) {
                GlImagepagerBinding glImagepagerBinding;
                if (state == 2) {
                    try {
                        glImagepagerBinding = GlImagePager.this.binding;
                        View childAt = glImagepagerBinding.vp2.getChildAt(0);
                        if (childAt == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                        }
                        ViewGroup viewGroup = (ViewGroup) childAt;
                        int childCount = viewGroup.getChildCount();
                        for (int i = 0; i < childCount; i++) {
                            View childAt2 = viewGroup.getChildAt(i);
                            if (childAt2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type com.glority.widget.imagepager.GlImageViewTouch");
                            }
                            ((GlImageViewTouch) childAt2).zoomTo(1.0f, 300L);
                        }
                    } catch (ClassCastException | IndexOutOfBoundsException unused) {
                    }
                }
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int position) {
                GlImagePager.this.onPageSelected(position);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPageSelected(int index) {
        GlImageItem glImageItem;
        List<GlImageItem> list = this.data;
        if (list == null || list.isEmpty()) {
            View view = this.binding.mask;
            Intrinsics.checkNotNullExpressionValue(view, "binding.mask");
            view.setVisibility(0);
        } else {
            View view2 = this.binding.mask;
            Intrinsics.checkNotNullExpressionValue(view2, "binding.mask");
            view2.setVisibility(8);
        }
        List<GlImageItem> list2 = this.data;
        Intrinsics.checkNotNull(list2);
        if (index < list2.size() && index >= 0) {
            List<GlImageItem> list3 = this.data;
            setIndex(index, list3 != null ? list3.size() : 0);
            List<GlImageItem> list4 = this.data;
            if (list4 == null || (glImageItem = list4.get(index)) == null) {
                return;
            }
            visibleDeleteIcon(glImageItem.getCanDelete());
            TextView textView = this.binding.topPageIndexTv;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.topPageIndexTv");
            textView.setVisibility(this.indexLocation == IndexLocation.TOP ? 0 : 8);
            TextView textView2 = this.binding.bottomPageIndexTv;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.bottomPageIndexTv");
            textView2.setVisibility(this.indexLocation == IndexLocation.BOTTOM ? 0 : 8);
            if (glImageItem.getCopyRight() == null) {
                TextView textView3 = this.binding.copyRightTv;
                Intrinsics.checkNotNullExpressionValue(textView3, "binding.copyRightTv");
                textView3.setVisibility(8);
            } else {
                TextView textView4 = this.binding.copyRightTv;
                Intrinsics.checkNotNullExpressionValue(textView4, "binding.copyRightTv");
                textView4.setVisibility(0);
                TextView textView5 = this.binding.copyRightTv;
                Intrinsics.checkNotNullExpressionValue(textView5, "binding.copyRightTv");
                textView5.setPaintFlags(8);
                CopyrightUtil copyrightUtil = CopyrightUtil.INSTANCE;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                final SpannableStringBuilder copyrightSsb = copyrightUtil.getCopyrightSsb(context, glImageItem.getCopyRight());
                if (copyrightSsb.length() == 0) {
                    FrameLayout frameLayout = this.binding.copyRightContainer;
                    Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.copyRightContainer");
                    frameLayout.setVisibility(4);
                } else {
                    FrameLayout frameLayout2 = this.binding.copyRightContainer;
                    Intrinsics.checkNotNullExpressionValue(frameLayout2, "binding.copyRightContainer");
                    frameLayout2.setVisibility(0);
                    this.binding.copyRightContainer.setOnClickListener(new View.OnClickListener() { // from class: com.glority.widget.imagepager.GlImagePager$onPageSelected$1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            GlImagePagerOnClickListener glImagePagerOnClickListener;
                            GlImagepagerBinding glImagepagerBinding;
                            glImagePagerOnClickListener = GlImagePager.this.onCopyRightClickListener;
                            if (glImagePagerOnClickListener == null || !glImagePagerOnClickListener.onClick()) {
                                Context context2 = GlImagePager.this.getContext();
                                Intrinsics.checkNotNullExpressionValue(context2, "context");
                                GlToolTips.Builder text = new GlToolTips.Builder(context2).setText(copyrightSsb, GlToolTips.Type.SMALL);
                                glImagepagerBinding = GlImagePager.this.binding;
                                TextView textView6 = glImagepagerBinding.copyRightTv;
                                Intrinsics.checkNotNullExpressionValue(textView6, "binding.copyRightTv");
                                text.showDark(textView6, GlToolTips.Alignment.TOP);
                            }
                        }
                    });
                }
            }
            String desc = glImageItem.getDesc();
            if (desc == null || desc.length() == 0) {
                TextView textView6 = this.binding.desc;
                Intrinsics.checkNotNullExpressionValue(textView6, "binding.desc");
                textView6.setVisibility(8);
            } else {
                setDesc(glImageItem.getDesc());
            }
            String name = glImageItem.getName();
            if (name == null || name.length() == 0) {
                TextView textView7 = this.binding.tvLabel;
                Intrinsics.checkNotNullExpressionValue(textView7, "binding.tvLabel");
                textView7.setVisibility(8);
            } else {
                TextView textView8 = this.binding.tvLabel;
                Intrinsics.checkNotNullExpressionValue(textView8, "binding.tvLabel");
                textView8.setText(glImageItem.getName());
            }
            OnPageSelectedListener onPageSelectedListener = this.onPageSelectedListener;
            if (onPageSelectedListener != null) {
                onPageSelectedListener.selected(index, glImageItem);
            }
        }
    }

    private final void setDesc(final String desc) {
        this.binding.desc.post(new Runnable() { // from class: com.glority.widget.imagepager.GlImagePager$setDesc$1
            @Override // java.lang.Runnable
            public final void run() {
                GlTextViewSuffixWrapper glTextViewSuffixWrapper;
                GlTextViewSuffixWrapper glTextViewSuffixWrapper2;
                GlTextViewSuffixWrapper glTextViewSuffixWrapper3;
                GlTextViewSuffixWrapper glTextViewSuffixWrapper4;
                GlTextViewSuffixWrapper glTextViewSuffixWrapper5;
                GlImagepagerBinding glImagepagerBinding;
                int i;
                glTextViewSuffixWrapper = GlImagePager.this.llTextViewSuffixWrapper;
                if (glTextViewSuffixWrapper != null) {
                    glTextViewSuffixWrapper2 = GlImagePager.this.llTextViewSuffixWrapper;
                    Intrinsics.checkNotNull(glTextViewSuffixWrapper2);
                    glTextViewSuffixWrapper2.setMainContent(desc);
                    glTextViewSuffixWrapper3 = GlImagePager.this.llTextViewSuffixWrapper;
                    Intrinsics.checkNotNull(glTextViewSuffixWrapper3);
                    if (glTextViewSuffixWrapper3.getIsCollapsed()) {
                        glTextViewSuffixWrapper5 = GlImagePager.this.llTextViewSuffixWrapper;
                        Intrinsics.checkNotNull(glTextViewSuffixWrapper5);
                        glTextViewSuffixWrapper5.collapse(false);
                        return;
                    } else {
                        glTextViewSuffixWrapper4 = GlImagePager.this.llTextViewSuffixWrapper;
                        Intrinsics.checkNotNull(glTextViewSuffixWrapper4);
                        glTextViewSuffixWrapper4.expand(false);
                        return;
                    }
                }
                GlImagePager glImagePager = GlImagePager.this;
                glImagepagerBinding = GlImagePager.this.binding;
                TextView textView = glImagepagerBinding.desc;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.desc");
                final GlTextViewSuffixWrapper glTextViewSuffixWrapper6 = new GlTextViewSuffixWrapper(textView);
                glTextViewSuffixWrapper6.setMainContent(desc);
                glTextViewSuffixWrapper6.setSuffix("...");
                i = GlImagePager.this.descLineThreshold;
                glTextViewSuffixWrapper6.setTargetLineCount(i);
                glTextViewSuffixWrapper6.getTransition().setDuration(250L);
                glTextViewSuffixWrapper6.getTextView().setOnClickListener(new View.OnClickListener() { // from class: com.glority.widget.imagepager.GlImagePager$setDesc$1$1$1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        GlTextViewSuffixWrapper.this.toggle(true);
                    }
                });
                glTextViewSuffixWrapper6.collapse(false);
                Unit unit = Unit.INSTANCE;
                glImagePager.llTextViewSuffixWrapper = glTextViewSuffixWrapper6;
            }
        });
    }

    private final void setIndexLocation(IndexLocation indexLocation) {
        if (indexLocation == IndexLocation.TOP) {
            TextView textView = this.binding.topPageIndexTv;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.topPageIndexTv");
            textView.setVisibility(0);
            TextView textView2 = this.binding.bottomPageIndexTv;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.bottomPageIndexTv");
            textView2.setVisibility(8);
            return;
        }
        TextView textView3 = this.binding.topPageIndexTv;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.topPageIndexTv");
        textView3.setVisibility(8);
        TextView textView4 = this.binding.bottomPageIndexTv;
        Intrinsics.checkNotNullExpressionValue(textView4, "binding.bottomPageIndexTv");
        textView4.setVisibility(0);
    }

    private final void setIndex(int position, int total) {
        String str = (position + 1) + " / " + total;
        TextView textView = this.binding.bottomPageIndexTv;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.bottomPageIndexTv");
        String str2 = str;
        textView.setText(str2);
        TextView textView2 = this.binding.topPageIndexTv;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.topPageIndexTv");
        textView2.setText(str2);
    }

    private final void visibleDeleteIcon(boolean visible) {
        ImageView imageView = this.binding.deleteIv;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.deleteIv");
        imageView.setVisibility(visible ? 0 : 4);
    }
}
