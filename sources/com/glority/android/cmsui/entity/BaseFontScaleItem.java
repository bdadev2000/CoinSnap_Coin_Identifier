package com.glority.android.cmsui.entity;

import android.content.Context;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.glority.android.cms.base.BaseItem;
import com.glority.android.xx.constants.Args;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseFontScaleItem.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00140\u0018J\u0016\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\tR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\t¨\u0006\u001c"}, d2 = {"Lcom/glority/android/cmsui/entity/BaseFontScaleItem;", "Lcom/glority/android/cms/base/BaseItem;", Args.pageName, "", "(Ljava/lang/String;)V", "contentTextViews", "", "Landroid/widget/TextView;", "getContentTextViews", "()Ljava/util/List;", "fontScale", "Landroidx/lifecycle/MutableLiveData;", "", "getFontScale", "()Landroidx/lifecycle/MutableLiveData;", "medicinalTextViews", "getMedicinalTextViews", "subTitleTextViews", "getSubTitleTextViews", "observeFontScale", "", "context", "Landroid/content/Context;", "scaleBack", "Lkotlin/Function1;", "setTextScaleSize", "textView", "textSize", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public abstract class BaseFontScaleItem extends BaseItem {
    private final List<TextView> contentTextViews;
    private final MutableLiveData<Float> fontScale;
    private final List<TextView> medicinalTextViews;
    private final List<TextView> subTitleTextViews;

    public BaseFontScaleItem(String str) {
        super(str);
        this.fontScale = new MutableLiveData<>(Float.valueOf(1.0f));
        this.subTitleTextViews = new ArrayList();
        this.contentTextViews = new ArrayList();
        this.medicinalTextViews = new ArrayList();
    }

    public final MutableLiveData<Float> getFontScale() {
        return this.fontScale;
    }

    public final List<TextView> getSubTitleTextViews() {
        return this.subTitleTextViews;
    }

    public final List<TextView> getContentTextViews() {
        return this.contentTextViews;
    }

    public final List<TextView> getMedicinalTextViews() {
        return this.medicinalTextViews;
    }

    public final void observeFontScale(Context context, final Function1<? super Float, Unit> scaleBack) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scaleBack, "scaleBack");
        boolean z = context instanceof LifecycleOwner;
        Object obj = context;
        if (!z) {
            obj = null;
        }
        LifecycleOwner lifecycleOwner = (LifecycleOwner) obj;
        if (lifecycleOwner != null) {
            this.fontScale.observe(lifecycleOwner, (Observer) new Observer<T>() { // from class: com.glority.android.cmsui.entity.BaseFontScaleItem$observeFontScale$$inlined$let$lambda$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // androidx.lifecycle.Observer
                public final void onChanged(T t) {
                    Float it = (Float) t;
                    Function1 function1 = scaleBack;
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    function1.invoke(it);
                }
            });
        }
    }

    public final void setTextScaleSize(TextView textView, float textSize) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        Float value = this.fontScale.getValue();
        if (value == null) {
            value = Float.valueOf(1.0f);
        }
        Intrinsics.checkNotNullExpressionValue(value, "fontScale.value ?: 1f");
        textView.setTextSize(0, textSize * value.floatValue());
    }
}
