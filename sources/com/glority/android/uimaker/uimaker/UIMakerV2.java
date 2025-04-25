package com.glority.android.uimaker.uimaker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.glority.android.uimaker.Constants;
import com.glority.android.uimaker.parameter.ClickEnum;
import com.glority.android.uimaker.parameter.IUIMakerView;
import com.glority.android.uimaker.parameter.ResourceConverter;
import com.glority.android.uimaker.parameter.UiMakerOnClickListener;
import com.glority.android.uimaker.parameter.attribute.ColorParameter;
import com.glority.android.uimaker.parameter.baseview.ViewGroupParameter;
import com.glority.android.uimaker.parameter.baseview.ViewParameter;
import com.glority.android.uimaker.parameter.baseview.WindowParameter;
import com.glority.widget.GlImageView;
import com.glority.widget.GlScrollView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UIMakerV2.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ \u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u00102\u0006\u0010<\u001a\u00020=H\u0002J\u0018\u0010>\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010?\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0002J\u0018\u0010@\u001a\u0002082\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0002J\b\u0010E\u001a\u000208H\u0002J\u0018\u0010F\u001a\u00020+2\u0006\u0010G\u001a\u0002042\u0006\u0010<\u001a\u00020=H\u0016R\u001a\u0010\t\u001a\u00020\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0016X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u00020%X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R*\u00102\u001a\u001e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020503j\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u000205`6X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006H"}, d2 = {"Lcom/glority/android/uimaker/uimaker/UIMakerV2;", "Lcom/glority/android/uimaker/uimaker/BaseUiMaker;", "context", "Landroid/content/Context;", "window", "Lcom/glority/android/uimaker/parameter/baseview/WindowParameter;", "localResources", "", "(Landroid/content/Context;Lcom/glority/android/uimaker/parameter/baseview/WindowParameter;Z)V", "bgImage", "Lcom/glority/widget/GlImageView;", "getBgImage", "()Lcom/glority/widget/GlImageView;", "setBgImage", "(Lcom/glority/widget/GlImageView;)V", "constraintLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getConstraintLayout", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setConstraintLayout", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "floatingLayout", "Landroid/widget/FrameLayout;", "getFloatingLayout", "()Landroid/widget/FrameLayout;", "setFloatingLayout", "(Landroid/widget/FrameLayout;)V", "innerRootView", "getInnerRootView", "setInnerRootView", "innerScrollView", "Lcom/glority/widget/GlScrollView;", "getInnerScrollView", "()Lcom/glority/widget/GlScrollView;", "setInnerScrollView", "(Lcom/glority/widget/GlScrollView;)V", "resourceConverter", "Lcom/glority/android/uimaker/parameter/ResourceConverter;", "getResourceConverter", "()Lcom/glority/android/uimaker/parameter/ResourceConverter;", "setResourceConverter", "(Lcom/glority/android/uimaker/parameter/ResourceConverter;)V", "rootView", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "scrollView", "Landroid/widget/ScrollView;", "getScrollView", "()Landroid/widget/ScrollView;", "viewIdMap", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "addView", "", "viewGroupParameter", "Lcom/glority/android/uimaker/parameter/baseview/ViewGroupParameter;", TtmlNode.TAG_LAYOUT, "onClickListener", "Lcom/glority/android/uimaker/parameter/UiMakerOnClickListener;", "applyConstraintSet", "createViewIdMap", "getConstraintSet", "parameter", "Lcom/glority/android/uimaker/parameter/baseview/ViewParameter;", "constraintSet", "Landroidx/constraintlayout/widget/ConstraintSet;", "makeRootView", "toView", "json", "uimaker_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class UIMakerV2 implements BaseUiMaker {
    public GlImageView bgImage;
    public ConstraintLayout constraintLayout;
    private final Context context;
    public FrameLayout floatingLayout;
    public FrameLayout innerRootView;
    public GlScrollView innerScrollView;
    private final boolean localResources;
    public ResourceConverter resourceConverter;
    private final HashMap<String, Integer> viewIdMap;
    private final WindowParameter window;

    public UIMakerV2(Context context, WindowParameter window, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(window, "window");
        this.context = context;
        this.window = window;
        this.localResources = z;
        this.viewIdMap = new HashMap<>();
    }

    public /* synthetic */ UIMakerV2(Context context, WindowParameter windowParameter, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, windowParameter, (i & 4) != 0 ? true : z);
    }

    public final ResourceConverter getResourceConverter() {
        ResourceConverter resourceConverter = this.resourceConverter;
        if (resourceConverter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("resourceConverter");
        }
        return resourceConverter;
    }

    public final void setResourceConverter(ResourceConverter resourceConverter) {
        Intrinsics.checkNotNullParameter(resourceConverter, "<set-?>");
        this.resourceConverter = resourceConverter;
    }

    public final FrameLayout getInnerRootView() {
        FrameLayout frameLayout = this.innerRootView;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("innerRootView");
        }
        return frameLayout;
    }

    public final void setInnerRootView(FrameLayout frameLayout) {
        Intrinsics.checkNotNullParameter(frameLayout, "<set-?>");
        this.innerRootView = frameLayout;
    }

    public final FrameLayout getFloatingLayout() {
        FrameLayout frameLayout = this.floatingLayout;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("floatingLayout");
        }
        return frameLayout;
    }

    public final void setFloatingLayout(FrameLayout frameLayout) {
        Intrinsics.checkNotNullParameter(frameLayout, "<set-?>");
        this.floatingLayout = frameLayout;
    }

    public final ConstraintLayout getConstraintLayout() {
        ConstraintLayout constraintLayout = this.constraintLayout;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("constraintLayout");
        }
        return constraintLayout;
    }

    public final void setConstraintLayout(ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<set-?>");
        this.constraintLayout = constraintLayout;
    }

    public final GlScrollView getInnerScrollView() {
        GlScrollView glScrollView = this.innerScrollView;
        if (glScrollView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("innerScrollView");
        }
        return glScrollView;
    }

    public final void setInnerScrollView(GlScrollView glScrollView) {
        Intrinsics.checkNotNullParameter(glScrollView, "<set-?>");
        this.innerScrollView = glScrollView;
    }

    public final GlImageView getBgImage() {
        GlImageView glImageView = this.bgImage;
        if (glImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bgImage");
        }
        return glImageView;
    }

    public final void setBgImage(GlImageView glImageView) {
        Intrinsics.checkNotNullParameter(glImageView, "<set-?>");
        this.bgImage = glImageView;
    }

    @Override // com.glority.android.uimaker.uimaker.BaseUiMaker
    /* renamed from: getRootView */
    public View mo7943getRootView() {
        FrameLayout frameLayout = this.innerRootView;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("innerRootView");
        }
        return frameLayout;
    }

    @Override // com.glority.android.uimaker.uimaker.BaseUiMaker
    public ScrollView getScrollView() {
        GlScrollView glScrollView = this.innerScrollView;
        if (glScrollView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("innerScrollView");
        }
        return glScrollView;
    }

    @Override // com.glority.android.uimaker.uimaker.BaseUiMaker
    public View toView(String json, UiMakerOnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        makeRootView();
        this.resourceConverter = new ResourceConverter(this.window.getWidth(), this.window.getHeight(), this.context);
        ColorParameter backgroundColorParameter = this.window.getBackgroundColorParameter();
        if (backgroundColorParameter != null) {
            View mo7943getRootView = mo7943getRootView();
            ResourceConverter resourceConverter = this.resourceConverter;
            if (resourceConverter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("resourceConverter");
            }
            mo7943getRootView.setBackgroundColor(resourceConverter.colorConvert(backgroundColorParameter));
        }
        createViewIdMap(this.window);
        this.viewIdMap.put("window", 0);
        WindowParameter windowParameter = this.window;
        ConstraintLayout constraintLayout = this.constraintLayout;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("constraintLayout");
        }
        addView(windowParameter, constraintLayout, onClickListener);
        try {
            GlScrollView glScrollView = this.innerScrollView;
            if (glScrollView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("innerScrollView");
            }
            boolean z = this.localResources;
            ResourceConverter resourceConverter2 = this.resourceConverter;
            if (resourceConverter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("resourceConverter");
            }
            glScrollView.parseParameter(z, resourceConverter2, this.window);
        } catch (Throwable unused) {
        }
        WindowParameter windowParameter2 = this.window;
        ConstraintLayout constraintLayout2 = this.constraintLayout;
        if (constraintLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("constraintLayout");
        }
        applyConstraintSet(windowParameter2, constraintLayout2);
        FrameLayout frameLayout = this.innerRootView;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("innerRootView");
        }
        return frameLayout;
    }

    private final void createViewIdMap(ViewGroupParameter viewGroupParameter) {
        for (ViewParameter viewParameter : viewGroupParameter.getChildViewParameters()) {
            this.viewIdMap.put(viewParameter.getId(), Integer.valueOf(View.generateViewId()));
            if (viewParameter instanceof ViewGroupParameter) {
                createViewIdMap((ViewGroupParameter) viewParameter);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addView(ViewGroupParameter viewGroupParameter, final ConstraintLayout layout, final UiMakerOnClickListener onClickListener) {
        Object obj;
        for (final ViewParameter viewParameter : viewGroupParameter.getChildViewParameters()) {
            View view = null;
            HashMap<ViewParameter, String> viewNameAndViewMap = Constants.INSTANCE.getViewNameAndViewMap();
            ResourceConverter resourceConverter = this.resourceConverter;
            if (resourceConverter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("resourceConverter");
            }
            resourceConverter.getHeightDimension(this.context, viewParameter.getHeight());
            Set<ViewParameter> keySet = viewNameAndViewMap.keySet();
            Intrinsics.checkNotNullExpressionValue(keySet, "map.keys");
            Iterator<T> it = keySet.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.areEqual(((ViewParameter) obj).getViewName(), viewParameter.getViewName())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            ViewParameter viewParameter2 = (ViewParameter) obj;
            if (viewParameter2 != null) {
                String str = viewNameAndViewMap.get(viewParameter2);
                Intrinsics.checkNotNull(str);
                Class<?> cls = Class.forName(str);
                Intrinsics.checkNotNullExpressionValue(cls, "Class.forName(map[it]!!)");
                Object newInstance = cls.getConstructor(Context.class, AttributeSet.class).newInstance(this.context, null);
                if (newInstance == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.glority.android.uimaker.parameter.IUIMakerView<com.glority.android.uimaker.parameter.baseview.ViewParameter>");
                }
                IUIMakerView iUIMakerView = (IUIMakerView) newInstance;
                iUIMakerView.setUiMakerOnClickListener(onClickListener);
                try {
                    boolean z = this.localResources;
                    ResourceConverter resourceConverter2 = this.resourceConverter;
                    if (resourceConverter2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("resourceConverter");
                    }
                    iUIMakerView.parseParameter(z, resourceConverter2, viewParameter);
                } catch (Throwable unused) {
                }
                if (iUIMakerView == 0) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                }
                view = (View) iUIMakerView;
            }
            if (view != null) {
                Intrinsics.checkNotNull(view);
                view.setTag(viewParameter.getFigmaName());
                Intrinsics.checkNotNull(view);
                Integer num = this.viewIdMap.get(viewParameter.getId());
                Intrinsics.checkNotNull(num);
                view.setId(num.intValue());
                if (viewParameter.getFloating()) {
                    FrameLayout frameLayout = this.floatingLayout;
                    if (frameLayout == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("floatingLayout");
                    }
                    ResourceConverter resourceConverter3 = this.resourceConverter;
                    if (resourceConverter3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("resourceConverter");
                    }
                    int widthDimension = resourceConverter3.getWidthDimension(this.context, viewParameter.getWidth());
                    ResourceConverter resourceConverter4 = this.resourceConverter;
                    if (resourceConverter4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("resourceConverter");
                    }
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(widthDimension, resourceConverter4.getWidthDimension(this.context, viewParameter.getHeight()));
                    ResourceConverter resourceConverter5 = this.resourceConverter;
                    if (resourceConverter5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("resourceConverter");
                    }
                    layoutParams.setMarginStart(resourceConverter5.getWidthDimension(this.context, viewParameter.getX()));
                    ResourceConverter resourceConverter6 = this.resourceConverter;
                    if (resourceConverter6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("resourceConverter");
                    }
                    layoutParams.topMargin = resourceConverter6.getHeightDimension(this.context, viewParameter.getY());
                    Unit unit = Unit.INSTANCE;
                    frameLayout.addView(view, layoutParams);
                } else {
                    layout.addView(view);
                }
                Intrinsics.checkNotNull(view);
                view.setAlpha(viewParameter.getOpacity());
                String click = viewParameter.getClick();
                if (click != null && click.length() != 0) {
                    try {
                        String click2 = viewParameter.getClick();
                        Intrinsics.checkNotNull(click2);
                        if (click2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            break;
                        }
                        String lowerCase = click2.toLowerCase();
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                        final ClickEnum valueOf = ClickEnum.valueOf(lowerCase);
                        Intrinsics.checkNotNull(view);
                        view.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.uimaker.uimaker.UIMakerV2$addView$$inlined$forEach$lambda$1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                onClickListener.onClick(ClickEnum.this);
                            }
                        });
                    } catch (Throwable unused2) {
                        Intrinsics.checkNotNull(view);
                        view.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.uimaker.uimaker.UIMakerV2$addView$$inlined$forEach$lambda$2
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                UiMakerOnClickListener uiMakerOnClickListener = onClickListener;
                                String click3 = ViewParameter.this.getClick();
                                Intrinsics.checkNotNull(click3);
                                uiMakerOnClickListener.onClickByTag(click3);
                            }
                        });
                    }
                }
                if (viewParameter instanceof ViewGroupParameter) {
                    ViewGroupParameter viewGroupParameter2 = (ViewGroupParameter) viewParameter;
                    if (view == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                    }
                    addView(viewGroupParameter2, (ConstraintLayout) view, onClickListener);
                } else {
                    continue;
                }
            }
        }
    }

    private final void makeRootView() {
        FrameLayout frameLayout = new FrameLayout(this.context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        Unit unit = Unit.INSTANCE;
        this.innerRootView = frameLayout;
        byte b = 0;
        byte b2 = 0;
        int i = 2;
        GlScrollView glScrollView = new GlScrollView(this.context, null, i, 0 == true ? 1 : 0);
        glScrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        Unit unit2 = Unit.INSTANCE;
        this.innerScrollView = glScrollView;
        FrameLayout frameLayout2 = new FrameLayout(this.context);
        GlScrollView glScrollView2 = this.innerScrollView;
        if (glScrollView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("innerScrollView");
        }
        glScrollView2.setFillViewport(true);
        GlScrollView glScrollView3 = this.innerScrollView;
        if (glScrollView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("innerScrollView");
        }
        glScrollView3.addView(frameLayout2, -1, -1);
        this.constraintLayout = new ConstraintLayout(this.context);
        GlImageView glImageView = new GlImageView(this.context, b2 == true ? 1 : 0, i, b == true ? 1 : 0);
        this.bgImage = glImageView;
        glImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        FrameLayout frameLayout3 = this.innerRootView;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("innerRootView");
        }
        GlImageView glImageView2 = this.bgImage;
        if (glImageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bgImage");
        }
        frameLayout3.addView(glImageView2, -1, -1);
        ConstraintLayout constraintLayout = this.constraintLayout;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("constraintLayout");
        }
        frameLayout2.addView(constraintLayout, -1, -1);
        this.floatingLayout = new FrameLayout(this.context);
        FrameLayout frameLayout4 = this.innerRootView;
        if (frameLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("innerRootView");
        }
        GlScrollView glScrollView4 = this.innerScrollView;
        if (glScrollView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("innerScrollView");
        }
        frameLayout4.addView(glScrollView4);
        FrameLayout frameLayout5 = this.innerRootView;
        if (frameLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("innerRootView");
        }
        FrameLayout frameLayout6 = this.floatingLayout;
        if (frameLayout6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("floatingLayout");
        }
        frameLayout5.addView(frameLayout6, -1, -1);
    }

    private final void getConstraintSet(ViewParameter parameter, ConstraintSet constraintSet) {
        Integer num = this.viewIdMap.get(parameter.getId());
        Intrinsics.checkNotNull(num);
        Intrinsics.checkNotNullExpressionValue(num, "viewIdMap[parameter.id]!!");
        int intValue = num.intValue();
        ResourceConverter resourceConverter = this.resourceConverter;
        if (resourceConverter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("resourceConverter");
        }
        int widthDimension = resourceConverter.getWidthDimension(this.context, parameter.getWidth());
        ResourceConverter resourceConverter2 = this.resourceConverter;
        if (resourceConverter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("resourceConverter");
        }
        constraintSet.constrainHeight(intValue, resourceConverter2.getWidthDimension(this.context, parameter.getHeight()));
        constraintSet.constrainWidth(intValue, widthDimension);
        if (parameter.getMaxHeight() != 0) {
            ResourceConverter resourceConverter3 = this.resourceConverter;
            if (resourceConverter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("resourceConverter");
            }
            constraintSet.constrainMaxHeight(intValue, resourceConverter3.getWidthDimension(this.context, parameter.getMaxHeight()));
        }
        if (parameter.getMaxWidth() != 0) {
            ResourceConverter resourceConverter4 = this.resourceConverter;
            if (resourceConverter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("resourceConverter");
            }
            constraintSet.constrainMaxWidth(intValue, resourceConverter4.getWidthDimension(this.context, parameter.getMaxWidth()));
        }
        ResourceConverter resourceConverter5 = this.resourceConverter;
        if (resourceConverter5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("resourceConverter");
        }
        constraintSet.setMargin(intValue, 6, resourceConverter5.getWidthDimension(this.context, parameter.getMarginStart()));
        ResourceConverter resourceConverter6 = this.resourceConverter;
        if (resourceConverter6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("resourceConverter");
        }
        constraintSet.setMargin(intValue, 7, resourceConverter6.getWidthDimension(this.context, parameter.getMarginEnd()));
        ResourceConverter resourceConverter7 = this.resourceConverter;
        if (resourceConverter7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("resourceConverter");
        }
        constraintSet.setMargin(intValue, 3, resourceConverter7.getWidthDimension(this.context, parameter.getMarginTop()));
        ResourceConverter resourceConverter8 = this.resourceConverter;
        if (resourceConverter8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("resourceConverter");
        }
        constraintSet.setMargin(intValue, 4, resourceConverter8.getWidthDimension(this.context, parameter.getMarginBottom()));
        String startToStart = parameter.getStartToStart();
        if (startToStart != null && startToStart.length() != 0) {
            Integer num2 = this.viewIdMap.get(parameter.getStartToStart());
            Intrinsics.checkNotNull(num2);
            constraintSet.connect(intValue, 6, num2.intValue(), 6);
        }
        String startToEnd = parameter.getStartToEnd();
        if (startToEnd != null && startToEnd.length() != 0) {
            Integer num3 = this.viewIdMap.get(parameter.getStartToEnd());
            Intrinsics.checkNotNull(num3);
            constraintSet.connect(intValue, 6, num3.intValue(), 7);
        }
        String endToEnd = parameter.getEndToEnd();
        if (endToEnd != null && endToEnd.length() != 0) {
            Integer num4 = this.viewIdMap.get(parameter.getEndToEnd());
            Intrinsics.checkNotNull(num4);
            constraintSet.connect(intValue, 7, num4.intValue(), 7);
        }
        String endToStart = parameter.getEndToStart();
        if (endToStart != null && endToStart.length() != 0) {
            Integer num5 = this.viewIdMap.get(parameter.getEndToStart());
            Intrinsics.checkNotNull(num5);
            constraintSet.connect(intValue, 7, num5.intValue(), 6);
        }
        String topToTop = parameter.getTopToTop();
        if (topToTop != null && topToTop.length() != 0) {
            Integer num6 = this.viewIdMap.get(parameter.getTopToTop());
            Intrinsics.checkNotNull(num6);
            constraintSet.connect(intValue, 3, num6.intValue(), 3);
        }
        String topToBottom = parameter.getTopToBottom();
        if (topToBottom != null && topToBottom.length() != 0) {
            Integer num7 = this.viewIdMap.get(parameter.getTopToBottom());
            Intrinsics.checkNotNull(num7);
            constraintSet.connect(intValue, 3, num7.intValue(), 4);
        }
        String bottomToBottom = parameter.getBottomToBottom();
        if (bottomToBottom != null && bottomToBottom.length() != 0) {
            Integer num8 = this.viewIdMap.get(parameter.getBottomToBottom());
            Intrinsics.checkNotNull(num8);
            constraintSet.connect(intValue, 4, num8.intValue(), 4);
        }
        String bottomToTop = parameter.getBottomToTop();
        if (bottomToTop == null || bottomToTop.length() == 0) {
            return;
        }
        Integer num9 = this.viewIdMap.get(parameter.getBottomToTop());
        Intrinsics.checkNotNull(num9);
        constraintSet.connect(intValue, 4, num9.intValue(), 3);
    }

    private final void applyConstraintSet(ViewGroupParameter viewGroupParameter, ConstraintLayout constraintLayout) {
        ConstraintSet constraintSet = new ConstraintSet();
        for (ViewParameter viewParameter : viewGroupParameter.getChildViewParameters()) {
            if (!viewParameter.getFloating()) {
                getConstraintSet(viewParameter, constraintSet);
                if (viewParameter instanceof ViewGroupParameter) {
                    ViewGroupParameter viewGroupParameter2 = (ViewGroupParameter) viewParameter;
                    View mo7943getRootView = mo7943getRootView();
                    Integer num = this.viewIdMap.get(viewParameter.getId());
                    Intrinsics.checkNotNull(num);
                    Intrinsics.checkNotNullExpressionValue(num, "viewIdMap[it.id]!!");
                    View findViewById = mo7943getRootView.findViewById(num.intValue());
                    Intrinsics.checkNotNullExpressionValue(findViewById, "rootView.findViewById(viewIdMap[it.id]!!)");
                    applyConstraintSet(viewGroupParameter2, (ConstraintLayout) findViewById);
                }
            }
        }
        constraintSet.applyTo(constraintLayout);
    }
}
