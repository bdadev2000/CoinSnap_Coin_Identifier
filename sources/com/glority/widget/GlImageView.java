package com.glority.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.Glide;
import com.glority.android.uimaker.parameter.ClickEnum;
import com.glority.android.uimaker.parameter.IUIMakerView;
import com.glority.android.uimaker.parameter.ResourceConverter;
import com.glority.android.uimaker.parameter.UiMakerOnClickListener;
import com.glority.android.uimaker.parameter.attribute.ColorParameter;
import com.glority.android.uimaker.parameter.attribute.ImageFile;
import com.glority.android.uimaker.parameter.baseview.ImageViewParameter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: GlImageView.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u001b\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016J \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003H\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/glority/widget/GlImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Lcom/glority/android/uimaker/parameter/IUIMakerView;", "Lcom/glority/android/uimaker/parameter/baseview/ImageViewParameter;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "uiMakerOnClickListener", "Lcom/glority/android/uimaker/parameter/UiMakerOnClickListener;", "getUiMakerOnClickListener", "()Lcom/glority/android/uimaker/parameter/UiMakerOnClickListener;", "setUiMakerOnClickListener", "(Lcom/glority/android/uimaker/parameter/UiMakerOnClickListener;)V", "getUiMakerViewTag", "", "getViewContext", "parseParameter", "", "loadLocalResource", "", "resourceConverter", "Lcom/glority/android/uimaker/parameter/ResourceConverter;", "parameter", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class GlImageView extends AppCompatImageView implements IUIMakerView<ImageViewParameter> {
    private UiMakerOnClickListener uiMakerOnClickListener;

    public GlImageView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

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
    public /* synthetic */ GlImageView(android.content.Context r1, android.util.AttributeSet r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.GlImageView.<init>(android.content.Context, android.util.AttributeSet, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.glority.android.uimaker.parameter.IUIMakerView
    public UiMakerOnClickListener getUiMakerOnClickListener() {
        return this.uiMakerOnClickListener;
    }

    @Override // com.glority.android.uimaker.parameter.IUIMakerView
    public void setUiMakerOnClickListener(UiMakerOnClickListener uiMakerOnClickListener) {
        this.uiMakerOnClickListener = uiMakerOnClickListener;
    }

    @Override // com.glority.android.uimaker.parameter.IUIMakerView
    public void parseParameter(boolean loadLocalResource, ResourceConverter resourceConverter, ImageViewParameter parameter) {
        Intrinsics.checkNotNullParameter(resourceConverter, "resourceConverter");
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        Object obj = null;
        if (loadLocalResource) {
            ImageFile imageFile = parameter.getImageFile();
            if ((imageFile != null ? imageFile.getLocalFilePath() : null) == null) {
                obj = "";
            } else {
                ImageFile imageFile2 = parameter.getImageFile();
                String localFilePath = imageFile2 != null ? imageFile2.getLocalFilePath() : null;
                Intrinsics.checkNotNull(localFilePath);
                obj = Integer.valueOf(resourceConverter.getDrawableRes(localFilePath));
            }
        } else {
            ImageFile imageFile3 = parameter.getImageFile();
            if (imageFile3 != null) {
                obj = imageFile3.getRemoteUrl();
            }
        }
        if (parameter.getBackground()) {
            setAdjustViewBounds(true);
            Glide.with(getContext()).load(obj).optionalCenterCrop().into(this);
        } else {
            Glide.with(getContext()).load(obj).into(this);
        }
        String figmaName = parameter.getFigmaName();
        if (figmaName == null || !StringsKt.contains((CharSequence) figmaName, (CharSequence) "close", false)) {
            return;
        }
        setForeground(ContextCompat.getDrawable(getContext(), R.drawable.ripple_circle));
        setOnClickListener(new View.OnClickListener() { // from class: com.glority.widget.GlImageView$parseParameter$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UiMakerOnClickListener uiMakerOnClickListener = GlImageView.this.getUiMakerOnClickListener();
                if (uiMakerOnClickListener != null) {
                    uiMakerOnClickListener.onClick(ClickEnum.close);
                }
            }
        });
    }

    @Override // com.glority.android.uimaker.parameter.IUIMakerView
    public Context getViewContext() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return context;
    }

    @Override // com.glority.android.uimaker.parameter.IUIMakerView
    public String getUiMakerViewTag() {
        return "GlImageView";
    }
}
