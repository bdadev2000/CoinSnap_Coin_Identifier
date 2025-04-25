package com.glority.android.uimaker.parameter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import com.glority.android.uimaker.parameter.attribute.ColorParameter;
import com.glority.android.uimaker.parameter.attribute.ImageFile;
import com.glority.android.uimaker.parameter.baseview.BaseUiMakerParameter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: IUIMakerView.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&J%\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0019J8\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0016\u001a\u00020\u00172\u0014\u0010\u001d\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020\u00130\u001eH\u0016R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0005X¦\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006 "}, d2 = {"Lcom/glority/android/uimaker/parameter/IUIMakerView;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/glority/android/uimaker/parameter/baseview/BaseUiMakerParameter;", "", "uiMakerOnClickListener", "Lcom/glority/android/uimaker/parameter/UiMakerOnClickListener;", "getUiMakerOnClickListener", "()Lcom/glority/android/uimaker/parameter/UiMakerOnClickListener;", "setUiMakerOnClickListener", "(Lcom/glority/android/uimaker/parameter/UiMakerOnClickListener;)V", "getColor", "", "colorParameter", "Lcom/glority/android/uimaker/parameter/attribute/ColorParameter;", "getUiMakerViewTag", "", "getViewContext", "Landroid/content/Context;", "parseParameter", "", "loadLocalResource", "", "resourceConverter", "Lcom/glority/android/uimaker/parameter/ResourceConverter;", "parameter", "(ZLcom/glority/android/uimaker/parameter/ResourceConverter;Lcom/glority/android/uimaker/parameter/baseview/BaseUiMakerParameter;)V", "setDrawable", "imageFile", "Lcom/glority/android/uimaker/parameter/attribute/ImageFile;", "callback", "Lkotlin/Function1;", "Landroid/graphics/drawable/Drawable;", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public interface IUIMakerView<T extends BaseUiMakerParameter> {
    int getColor(ColorParameter colorParameter);

    UiMakerOnClickListener getUiMakerOnClickListener();

    String getUiMakerViewTag();

    Context getViewContext();

    void parseParameter(boolean loadLocalResource, ResourceConverter resourceConverter, T parameter);

    void setDrawable(boolean loadLocalResource, ImageFile imageFile, ResourceConverter resourceConverter, Function1<? super Drawable, Unit> callback);

    void setUiMakerOnClickListener(UiMakerOnClickListener uiMakerOnClickListener);

    /* compiled from: IUIMakerView.kt */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static <T extends BaseUiMakerParameter> void setDrawable(IUIMakerView<T> iUIMakerView, boolean z, ImageFile imageFile, ResourceConverter resourceConverter, Function1<? super Drawable, Unit> callback) {
            Intrinsics.checkNotNullParameter(resourceConverter, "resourceConverter");
            Intrinsics.checkNotNullParameter(callback, "callback");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new IUIMakerView$setDrawable$1(iUIMakerView, z, imageFile, resourceConverter, callback, null), 3, null);
        }

        public static <T extends BaseUiMakerParameter> int getColor(IUIMakerView<T> iUIMakerView, ColorParameter colorParameter) {
            return colorParameter != null ? Color.argb(colorParameter.getA(), colorParameter.getR(), colorParameter.getG(), colorParameter.getB()) : ViewCompat.MEASURED_STATE_MASK;
        }
    }
}
