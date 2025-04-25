package com.glority.android.uimaker.uimaker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import com.glority.android.uimaker.Constants;
import com.glority.android.uimaker.parameter.IUIMakerView;
import com.glority.android.uimaker.parameter.ResourceConverter;
import com.glority.android.uimaker.parameter.UiMakerOnClickListener;
import com.glority.android.uimaker.parameter.attribute.ColorParameter;
import com.glority.android.uimaker.parameter.baseview.ViewParameter;
import com.glority.android.uimaker.parameter.baseview.WindowParameter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: UIMakerV1.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0017\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/glority/android/uimaker/uimaker/UIMakerV1;", "Lcom/glority/android/uimaker/uimaker/BaseUiMaker;", "context", "Landroid/content/Context;", "window", "Lcom/glority/android/uimaker/parameter/baseview/WindowParameter;", "localResources", "", "(Landroid/content/Context;Lcom/glority/android/uimaker/parameter/baseview/WindowParameter;Z)V", "innerRootView", "Landroid/widget/ScrollView;", "getInnerRootView", "()Landroid/widget/ScrollView;", "setInnerRootView", "(Landroid/widget/ScrollView;)V", "resourceConverter", "Lcom/glority/android/uimaker/parameter/ResourceConverter;", "getResourceConverter", "()Lcom/glority/android/uimaker/parameter/ResourceConverter;", "setResourceConverter", "(Lcom/glority/android/uimaker/parameter/ResourceConverter;)V", "rootView", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "scrollView", "getScrollView", "Landroid/view/ViewGroup;", "toView", "json", "", "onClickListener", "Lcom/glority/android/uimaker/parameter/UiMakerOnClickListener;", "uimaker_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class UIMakerV1 implements BaseUiMaker {
    private final Context context;
    public ScrollView innerRootView;
    private final boolean localResources;
    public ResourceConverter resourceConverter;
    private final WindowParameter window;

    public UIMakerV1(Context context, WindowParameter window, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(window, "window");
        this.context = context;
        this.window = window;
        this.localResources = z;
    }

    public /* synthetic */ UIMakerV1(Context context, WindowParameter windowParameter, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
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

    public final ScrollView getInnerRootView() {
        ScrollView scrollView = this.innerRootView;
        if (scrollView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("innerRootView");
        }
        return scrollView;
    }

    public final void setInnerRootView(ScrollView scrollView) {
        Intrinsics.checkNotNullParameter(scrollView, "<set-?>");
        this.innerRootView = scrollView;
    }

    @Override // com.glority.android.uimaker.uimaker.BaseUiMaker
    /* renamed from: getRootView, reason: collision with other method in class */
    public View mo7943getRootView() {
        ScrollView scrollView = this.innerRootView;
        if (scrollView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("innerRootView");
        }
        return scrollView;
    }

    @Override // com.glority.android.uimaker.uimaker.BaseUiMaker
    public ScrollView getScrollView() {
        ScrollView scrollView = this.innerRootView;
        if (scrollView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("innerRootView");
        }
        return scrollView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.glority.android.uimaker.uimaker.BaseUiMaker
    public View toView(String json, UiMakerOnClickListener onClickListener) {
        Object obj;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        ViewGroup rootView = getRootView();
        this.resourceConverter = new ResourceConverter(this.window.getWidth(), this.window.getHeight(), this.context);
        ColorParameter backgroundColorParameter = this.window.getBackgroundColorParameter();
        if (backgroundColorParameter != null) {
            ResourceConverter resourceConverter = this.resourceConverter;
            if (resourceConverter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("resourceConverter");
            }
            rootView.setBackgroundColor(resourceConverter.colorConvert(backgroundColorParameter));
        }
        for (ViewParameter viewParameter : this.window.getChildViewParameters()) {
            View view = null;
            HashMap<ViewParameter, String> viewNameAndViewMap = Constants.INSTANCE.getViewNameAndViewMap();
            ResourceConverter resourceConverter2 = this.resourceConverter;
            if (resourceConverter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("resourceConverter");
            }
            resourceConverter2.getHeightDimension(this.context, viewParameter.getHeight());
            Set<ViewParameter> keySet = viewNameAndViewMap.keySet();
            Intrinsics.checkNotNullExpressionValue(keySet, "map.keys");
            Iterator<T> it = keySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((ViewParameter) obj).getViewName(), viewParameter.getViewName())) {
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
                Intrinsics.checkNotNull(iUIMakerView);
                iUIMakerView.setUiMakerOnClickListener(onClickListener);
                boolean z = this.localResources;
                ResourceConverter resourceConverter3 = this.resourceConverter;
                if (resourceConverter3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("resourceConverter");
                }
                iUIMakerView.parseParameter(z, resourceConverter3, viewParameter);
                view = (View) iUIMakerView;
            }
            int height = StringsKt.startsWith(viewParameter.getViewName(), "Gl", true) ? -2 : viewParameter.getHeight();
            if (view != null) {
                ResourceConverter resourceConverter4 = this.resourceConverter;
                if (resourceConverter4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("resourceConverter");
                }
                int widthDimension = resourceConverter4.getWidthDimension(this.context, viewParameter.getWidth());
                ResourceConverter resourceConverter5 = this.resourceConverter;
                if (resourceConverter5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("resourceConverter");
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(widthDimension, resourceConverter5.getWidthDimension(this.context, height));
                ResourceConverter resourceConverter6 = this.resourceConverter;
                if (resourceConverter6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("resourceConverter");
                }
                layoutParams.setMarginStart(resourceConverter6.getWidthDimension(this.context, viewParameter.getX()));
                ResourceConverter resourceConverter7 = this.resourceConverter;
                if (resourceConverter7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("resourceConverter");
                }
                layoutParams.topMargin = resourceConverter7.getHeightDimension(this.context, viewParameter.getY());
                Unit unit = Unit.INSTANCE;
                rootView.addView(view, layoutParams);
                Intrinsics.checkNotNull(view);
                view.setAlpha(viewParameter.getOpacity());
            }
        }
        ViewParent parent = rootView.getParent();
        if (parent != null) {
            return (ScrollView) parent;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.ScrollView");
    }

    private final ViewGroup getRootView() {
        ScrollView scrollView = new ScrollView(this.context);
        scrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        Unit unit = Unit.INSTANCE;
        this.innerRootView = scrollView;
        FrameLayout frameLayout = new FrameLayout(this.context);
        ScrollView scrollView2 = this.innerRootView;
        if (scrollView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("innerRootView");
        }
        scrollView2.setFillViewport(true);
        ScrollView scrollView3 = this.innerRootView;
        if (scrollView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("innerRootView");
        }
        scrollView3.addView(frameLayout, -1, -2);
        return frameLayout;
    }
}
