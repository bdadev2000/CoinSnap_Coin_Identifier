package com.glority.widget.scanner;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.glority.utils.ui.ViewUtils;
import com.glority.widget.R;
import com.glority.widget.scanner.CropPointsView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CropWidget.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 -2\u00020\u0001:\u0001-B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ7\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2'\u0010$\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020!0%J(\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0007H\u0014R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016¨\u0006."}, d2 = {"Lcom/glority/widget/scanner/CropWidget;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cpv", "Lcom/glority/widget/scanner/CropPointsView;", TypedValues.Custom.S_DIMENSION, "Landroid/util/Size;", "getDimension", "()Landroid/util/Size;", "setDimension", "(Landroid/util/Size;)V", "fl_container", "image", "Landroidx/lifecycle/MutableLiveData;", "", "getImage", "()Landroidx/lifecycle/MutableLiveData;", "isViewReady", "", "iv", "Landroid/widget/ImageView;", "onViewReady", "points", "", "Landroid/graphics/PointF;", "getPoints", "bindMagnifierView", "", "magnifierView", "Lcom/glority/widget/scanner/CropMagnifierView;", "onDragEnded", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "onSizeChanged", "w", "h", "oldw", "oldh", "Companion", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class CropWidget extends FrameLayout {
    private final CropPointsView cpv;
    private Size dimension;
    private FrameLayout fl_container;
    private final MutableLiveData<String> image;
    private boolean isViewReady;
    private final ImageView iv;
    private final MutableLiveData<Boolean> onViewReady;
    private final MutableLiveData<List<PointF>> points;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int MARGIN_CARD_VIEW = ViewUtils.dp2px(16.0f);
    private static final int HAND_TOUCH_WIDTH = ViewUtils.dp2px(48.0f);

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CropPointsView.DragPointType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[CropPointsView.DragPointType.LEFT_TOP.ordinal()] = 1;
            iArr[CropPointsView.DragPointType.RIGHT_TOP.ordinal()] = 2;
            iArr[CropPointsView.DragPointType.RIGHT_BOTTOM.ordinal()] = 3;
            iArr[CropPointsView.DragPointType.LEFT_BOTTOM.ordinal()] = 4;
            iArr[CropPointsView.DragPointType.TOP.ordinal()] = 5;
            iArr[CropPointsView.DragPointType.RIGHT.ordinal()] = 6;
            iArr[CropPointsView.DragPointType.BOTTOM.ordinal()] = 7;
            iArr[CropPointsView.DragPointType.LEFT.ordinal()] = 8;
        }
    }

    public CropWidget(Context context) {
        this(context, null, 0, 6, null);
    }

    public CropWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ CropWidget(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.scanner.CropWidget.<init>(android.content.Context, android.util.AttributeSet, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CropWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.onViewReady = mutableLiveData;
        this.dimension = new Size(0, 0);
        MutableLiveData<String> mutableLiveData2 = new MutableLiveData<>();
        this.image = mutableLiveData2;
        MutableLiveData<List<PointF>> mutableLiveData3 = new MutableLiveData<>();
        this.points = mutableLiveData3;
        View.inflate(context, R.layout.gl_widget_crop, this);
        View findViewById = findViewById(R.id.fl_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.fl_container)");
        this.fl_container = (FrameLayout) findViewById;
        View findViewById2 = findViewById(R.id.iv);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.iv)");
        this.iv = (ImageView) findViewById2;
        View findViewById3 = findViewById(R.id.cpv);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.cpv)");
        this.cpv = (CropPointsView) findViewById3;
        mutableLiveData2.observeForever(new AnonymousClass1());
        mutableLiveData3.observeForever(new Observer<List<? extends PointF>>() { // from class: com.glority.widget.scanner.CropWidget.2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(List<? extends PointF> list) {
                int margin_card_view;
                int margin_card_view2;
                int i2;
                if (CropWidget.this.isViewReady) {
                    if (list == null) {
                        CropWidget.this.cpv.setPoints(null);
                        return;
                    }
                    int width = CropWidget.this.fl_container.getWidth() - (CropWidget.INSTANCE.getMARGIN_CARD_VIEW() * 2);
                    int height = CropWidget.this.fl_container.getHeight() - (CropWidget.INSTANCE.getMARGIN_CARD_VIEW() * 2);
                    int width2 = CropWidget.this.getDimension().getWidth();
                    int height2 = CropWidget.this.getDimension().getHeight();
                    if (width <= 0 || height <= 0 || width2 <= 0 || height2 <= 0) {
                        return;
                    }
                    float f = width2;
                    float f2 = height2;
                    float f3 = width;
                    float f4 = height;
                    if (f / f2 > f3 / f4) {
                        margin_card_view2 = CropWidget.INSTANCE.getMARGIN_CARD_VIEW();
                        float f5 = (f3 * f2) / f;
                        margin_card_view = (int) (((f4 - f5) / 2) + CropWidget.INSTANCE.getMARGIN_CARD_VIEW() + 0.5f);
                        i2 = (int) f5;
                    } else {
                        float f6 = (f4 * f) / f2;
                        margin_card_view = CropWidget.INSTANCE.getMARGIN_CARD_VIEW();
                        margin_card_view2 = (int) (((f3 - f6) / 2) + CropWidget.INSTANCE.getMARGIN_CARD_VIEW() + 0.5f);
                        width = (int) f6;
                        i2 = height;
                    }
                    CropPointsView cropPointsView = CropWidget.this.cpv;
                    cropPointsView.setImageRect(new Rect(margin_card_view2, margin_card_view, margin_card_view2 + width, margin_card_view + i2));
                    cropPointsView.setPoints(list);
                    ImageView imageView = CropWidget.this.iv;
                    ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) (layoutParams instanceof FrameLayout.LayoutParams ? layoutParams : null);
                    if (layoutParams2 != null) {
                        layoutParams2.width = width;
                        layoutParams2.height = i2;
                    }
                    imageView.requestLayout();
                }
            }
        });
        mutableLiveData.observeForever(new Observer<Boolean>() { // from class: com.glority.widget.scanner.CropWidget.3
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Boolean bool) {
                CropWidget.this.getImage().setValue(CropWidget.this.getImage().getValue());
                CropWidget.this.getPoints().setValue(CropWidget.this.getPoints().getValue());
            }
        });
    }

    public final Size getDimension() {
        return this.dimension;
    }

    public final void setDimension(Size size) {
        Intrinsics.checkNotNullParameter(size, "<set-?>");
        this.dimension = size;
    }

    public final MutableLiveData<String> getImage() {
        return this.image;
    }

    public final MutableLiveData<List<PointF>> getPoints() {
        return this.points;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CropWidget.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged"}, k = 3, mv = {1, 4, 2})
    /* renamed from: com.glority.widget.scanner.CropWidget$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    public static final class AnonymousClass1<T> implements Observer<String> {
        AnonymousClass1() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(String str) {
            if (CropWidget.this.isViewReady) {
                if (str == null) {
                    CropWidget.this.iv.setImageDrawable(null);
                    return;
                }
                RequestBuilder<Drawable> load = Glide.with(CropWidget.this.iv).load(str);
                Intrinsics.checkNotNullExpressionValue(load, "Glide.with(iv)\n                .load(it)");
                if (CropWidget.this.getDimension().getWidth() > 0 && CropWidget.this.getDimension().getHeight() > 0) {
                    Intrinsics.checkNotNullExpressionValue(load.into(CropWidget.this.iv), "requestBuilder.into(iv)");
                } else {
                    Intrinsics.checkNotNullExpressionValue(load.listener(new C01381()).submit(), "requestBuilder.listener(…              }).submit()");
                }
            }
        }

        /* compiled from: CropWidget.kt */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J4\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J<\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¨\u0006\u0010"}, d2 = {"com/glority/widget/scanner/CropWidget$1$1", "Lcom/bumptech/glide/request/RequestListener;", "Landroid/graphics/drawable/Drawable;", "onLoadFailed", "", "e", "Lcom/bumptech/glide/load/engine/GlideException;", "model", "", "target", "Lcom/bumptech/glide/request/target/Target;", "isFirstResource", "onResourceReady", "resource", "dataSource", "Lcom/bumptech/glide/load/DataSource;", "mod_release"}, k = 1, mv = {1, 4, 2})
        /* renamed from: com.glority.widget.scanner.CropWidget$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes12.dex */
        public static final class C01381 implements RequestListener<Drawable> {
            @Override // com.bumptech.glide.request.RequestListener
            public boolean onLoadFailed(GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                return false;
            }

            C01381() {
            }

            @Override // com.bumptech.glide.request.RequestListener
            public boolean onResourceReady(final Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                Intrinsics.checkNotNullParameter(resource, "resource");
                CropWidget.this.post(new Runnable() { // from class: com.glority.widget.scanner.CropWidget$1$1$onResourceReady$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        CropWidget.this.iv.setImageDrawable(resource);
                        CropWidget.this.setDimension(new Size(resource.getIntrinsicWidth(), resource.getIntrinsicHeight()));
                        CropWidget.this.getPoints().setValue(CropWidget.this.getPoints().getValue());
                    }
                });
                return true;
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if (w <= 0 || h <= 0) {
            return;
        }
        if (!this.isViewReady) {
            post(new Runnable() { // from class: com.glority.widget.scanner.CropWidget$onSizeChanged$1
                @Override // java.lang.Runnable
                public final void run() {
                    MutableLiveData mutableLiveData;
                    CropWidget.this.isViewReady = true;
                    mutableLiveData = CropWidget.this.onViewReady;
                    mutableLiveData.setValue(true);
                }
            });
        } else {
            post(new Runnable() { // from class: com.glority.widget.scanner.CropWidget$onSizeChanged$2
                @Override // java.lang.Runnable
                public final void run() {
                    MutableLiveData mutableLiveData;
                    mutableLiveData = CropWidget.this.onViewReady;
                    mutableLiveData.setValue(true);
                }
            });
        }
    }

    public final void bindMagnifierView(CropMagnifierView magnifierView, Function1<? super List<? extends PointF>, Unit> onDragEnded) {
        Intrinsics.checkNotNullParameter(magnifierView, "magnifierView");
        Intrinsics.checkNotNullParameter(onDragEnded, "onDragEnded");
        CropPointsView cropPointsView = this.cpv;
        cropPointsView.setCallback(new CropWidget$bindMagnifierView$1(magnifierView, cropPointsView, onDragEnded));
    }

    /* compiled from: CropWidget.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/glority/widget/scanner/CropWidget$Companion;", "", "()V", "HAND_TOUCH_WIDTH", "", "getHAND_TOUCH_WIDTH", "()I", "MARGIN_CARD_VIEW", "getMARGIN_CARD_VIEW", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getMARGIN_CARD_VIEW() {
            return CropWidget.MARGIN_CARD_VIEW;
        }

        public final int getHAND_TOUCH_WIDTH() {
            return CropWidget.HAND_TOUCH_WIDTH;
        }
    }
}
