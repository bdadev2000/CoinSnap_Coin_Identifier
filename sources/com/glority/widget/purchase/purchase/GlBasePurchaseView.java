package com.glority.widget.purchase.purchase;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.exifinterface.media.ExifInterface;
import com.glority.android.uimaker.parameter.IUIMakerView;
import com.glority.android.uimaker.parameter.ResourceConverter;
import com.glority.android.uimaker.parameter.attribute.ColorParameter;
import com.glority.android.uimaker.parameter.attribute.ImageFile;
import com.glority.android.uimaker.parameter.baseview.BaseUiMakerParameter;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlBasePurchaseView.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u001b\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020&H&J%\u0010'\u001a\u00020&2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010(J$\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010$2\b\u0010,\u001a\u0004\u0018\u00010$H&J\u0016\u0010-\u001a\u00020&2\u0006\u0010*\u001a\u00020\f2\u0006\u0010.\u001a\u00020\rR0\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bj\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r`\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006/"}, d2 = {"Lcom/glority/widget/purchase/purchase/GlBasePurchaseView;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/glority/android/uimaker/parameter/baseview/BaseUiMakerParameter;", "Landroid/widget/FrameLayout;", "Lcom/glority/android/uimaker/parameter/IUIMakerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "clickListenerMap", "Ljava/util/LinkedHashMap;", "Lcom/glority/widget/purchase/purchase/PurchaseType;", "Landroid/view/View$OnClickListener;", "Lkotlin/collections/LinkedHashMap;", "getClickListenerMap$mod_release", "()Ljava/util/LinkedHashMap;", "loadLocalResource", "", "getLoadLocalResource", "()Z", "setLoadLocalResource", "(Z)V", "parameter", "getParameter", "()Lcom/glority/android/uimaker/parameter/baseview/BaseUiMakerParameter;", "setParameter", "(Lcom/glority/android/uimaker/parameter/baseview/BaseUiMakerParameter;)V", "Lcom/glority/android/uimaker/parameter/baseview/BaseUiMakerParameter;", "resourceConverter", "Lcom/glority/android/uimaker/parameter/ResourceConverter;", "getResourceConverter", "()Lcom/glority/android/uimaker/parameter/ResourceConverter;", "setResourceConverter", "(Lcom/glority/android/uimaker/parameter/ResourceConverter;)V", "getUiMakerViewTag", "", "initClick", "", "parseParameter", "(ZLcom/glority/android/uimaker/parameter/ResourceConverter;Lcom/glority/android/uimaker/parameter/baseview/BaseUiMakerParameter;)V", "setPrice", "purchaseType", "price", "currencyCode", "setPurchaseClickListener", "onClickListener", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public abstract class GlBasePurchaseView<T extends BaseUiMakerParameter> extends FrameLayout implements IUIMakerView<T> {
    private final LinkedHashMap<PurchaseType, View.OnClickListener> clickListenerMap;
    private boolean loadLocalResource;
    private T parameter;
    private ResourceConverter resourceConverter;

    public GlBasePurchaseView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public abstract void initClick();

    public abstract void setPrice(PurchaseType purchaseType, String price, String currencyCode);

    @Override // com.glority.android.uimaker.parameter.IUIMakerView
    public int getColor(ColorParameter colorParameter) {
        return IUIMakerView.DefaultImpls.getColor(this, colorParameter);
    }

    @Override // com.glority.android.uimaker.parameter.IUIMakerView
    public void setDrawable(boolean z, ImageFile imageFile, ResourceConverter resourceConverter, Function1<? super Drawable, Unit> callback) {
        Intrinsics.checkNotNullParameter(resourceConverter, "resourceConverter");
        Intrinsics.checkNotNullParameter(callback, "callback");
        IUIMakerView.DefaultImpls.setDrawable(this, z, imageFile, resourceConverter, callback);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ GlBasePurchaseView(android.content.Context r1, android.util.AttributeSet r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L8
            r2 = 0
            r3 = r2
            android.util.AttributeSet r3 = (android.util.AttributeSet) r3
        L8:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.purchase.purchase.GlBasePurchaseView.<init>(android.content.Context, android.util.AttributeSet, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlBasePurchaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.loadLocalResource = true;
        this.clickListenerMap = new LinkedHashMap<>();
    }

    public final T getParameter() {
        return this.parameter;
    }

    public final void setParameter(T t) {
        this.parameter = t;
    }

    public final boolean getLoadLocalResource() {
        return this.loadLocalResource;
    }

    public final void setLoadLocalResource(boolean z) {
        this.loadLocalResource = z;
    }

    public final ResourceConverter getResourceConverter() {
        return this.resourceConverter;
    }

    public final void setResourceConverter(ResourceConverter resourceConverter) {
        this.resourceConverter = resourceConverter;
    }

    public final LinkedHashMap<PurchaseType, View.OnClickListener> getClickListenerMap$mod_release() {
        return this.clickListenerMap;
    }

    public final void setPurchaseClickListener(PurchaseType purchaseType, View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        this.clickListenerMap.put(purchaseType, onClickListener);
    }

    @Override // com.glority.android.uimaker.parameter.IUIMakerView
    public String getUiMakerViewTag() {
        return "GlBasePurchaseView";
    }

    @Override // com.glority.android.uimaker.parameter.IUIMakerView
    public void parseParameter(boolean loadLocalResource, ResourceConverter resourceConverter, T parameter) {
        Intrinsics.checkNotNullParameter(resourceConverter, "resourceConverter");
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        this.parameter = parameter;
        this.loadLocalResource = loadLocalResource;
        this.resourceConverter = resourceConverter;
    }
}
