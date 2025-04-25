package com.glority.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ScrollView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.glority.android.uimaker.parameter.IUIMakerView;
import com.glority.android.uimaker.parameter.ResourceConverter;
import com.glority.android.uimaker.parameter.UiMakerOnClickListener;
import com.glority.android.uimaker.parameter.attribute.ColorParameter;
import com.glority.android.uimaker.parameter.attribute.ImageFile;
import com.glority.android.uimaker.parameter.baseview.WindowParameter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlScrollView.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u001b\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016J \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003H\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/glority/widget/GlScrollView;", "Landroid/widget/ScrollView;", "Lcom/glority/android/uimaker/parameter/IUIMakerView;", "Lcom/glority/android/uimaker/parameter/baseview/WindowParameter;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "uiMakerOnClickListener", "Lcom/glority/android/uimaker/parameter/UiMakerOnClickListener;", "getUiMakerOnClickListener", "()Lcom/glority/android/uimaker/parameter/UiMakerOnClickListener;", "setUiMakerOnClickListener", "(Lcom/glority/android/uimaker/parameter/UiMakerOnClickListener;)V", "getUiMakerViewTag", "", "getViewContext", "parseParameter", "", "loadLocalResource", "", "resourceConverter", "Lcom/glority/android/uimaker/parameter/ResourceConverter;", "parameter", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class GlScrollView extends ScrollView implements IUIMakerView<WindowParameter> {
    private UiMakerOnClickListener uiMakerOnClickListener;

    public GlScrollView(Context context) {
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
    public /* synthetic */ GlScrollView(android.content.Context r1, android.util.AttributeSet r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.GlScrollView.<init>(android.content.Context, android.util.AttributeSet, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.glority.android.uimaker.parameter.IUIMakerView
    public void parseParameter(boolean loadLocalResource, ResourceConverter resourceConverter, WindowParameter parameter) {
        Object remoteUrl;
        Intrinsics.checkNotNullParameter(resourceConverter, "resourceConverter");
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        ImageFile backgroundImage = parameter.getBackgroundImage();
        if (backgroundImage != null) {
            if (loadLocalResource) {
                if (backgroundImage.getLocalFilePath() == null) {
                    remoteUrl = "";
                } else {
                    String localFilePath = backgroundImage.getLocalFilePath();
                    Intrinsics.checkNotNull(localFilePath);
                    remoteUrl = Integer.valueOf(resourceConverter.getDrawableRes(localFilePath));
                }
            } else {
                remoteUrl = backgroundImage.getRemoteUrl();
            }
            Glide.with(this).asDrawable().load(remoteUrl).into((RequestBuilder<Drawable>) new CustomTarget<Drawable>() { // from class: com.glority.widget.GlScrollView$parseParameter$1
                @Override // com.bumptech.glide.request.target.Target
                public void onLoadCleared(Drawable placeholder) {
                }

                @Override // com.bumptech.glide.request.target.Target
                public /* bridge */ /* synthetic */ void onResourceReady(Object obj, Transition transition) {
                    onResourceReady((Drawable) obj, (Transition<? super Drawable>) transition);
                }

                public void onResourceReady(Drawable resource, Transition<? super Drawable> transition) {
                    Intrinsics.checkNotNullParameter(resource, "resource");
                    GlScrollView.this.setBackground(resource);
                }
            });
        }
    }

    @Override // com.glority.android.uimaker.parameter.IUIMakerView
    public Context getViewContext() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return context;
    }

    @Override // com.glority.android.uimaker.parameter.IUIMakerView
    public String getUiMakerViewTag() {
        return "GlScrollView";
    }

    @Override // com.glority.android.uimaker.parameter.IUIMakerView
    public UiMakerOnClickListener getUiMakerOnClickListener() {
        return this.uiMakerOnClickListener;
    }

    @Override // com.glority.android.uimaker.parameter.IUIMakerView
    public void setUiMakerOnClickListener(UiMakerOnClickListener uiMakerOnClickListener) {
        this.uiMakerOnClickListener = uiMakerOnClickListener;
    }
}
