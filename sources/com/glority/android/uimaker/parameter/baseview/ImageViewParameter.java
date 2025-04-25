package com.glority.android.uimaker.parameter.baseview;

import com.glority.android.uimaker.parameter.attribute.ImageFile;
import kotlin.Metadata;

/* compiled from: ImageViewParameter.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/glority/android/uimaker/parameter/baseview/ImageViewParameter;", "Lcom/glority/android/uimaker/parameter/baseview/ViewParameter;", "()V", "autoMirror", "", "getAutoMirror", "()Z", "setAutoMirror", "(Z)V", "background", "getBackground", "setBackground", "imageFile", "Lcom/glority/android/uimaker/parameter/attribute/ImageFile;", "getImageFile", "()Lcom/glority/android/uimaker/parameter/attribute/ImageFile;", "setImageFile", "(Lcom/glority/android/uimaker/parameter/attribute/ImageFile;)V", "viewName", "", "getViewName", "()Ljava/lang/String;", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class ImageViewParameter extends ViewParameter {
    private boolean autoMirror = true;
    private boolean background;
    private ImageFile imageFile;

    public final ImageFile getImageFile() {
        return this.imageFile;
    }

    public final void setImageFile(ImageFile imageFile) {
        this.imageFile = imageFile;
    }

    public final boolean getBackground() {
        return this.background;
    }

    public final void setBackground(boolean z) {
        this.background = z;
    }

    public final boolean getAutoMirror() {
        return this.autoMirror;
    }

    public final void setAutoMirror(boolean z) {
        this.autoMirror = z;
    }

    @Override // com.glority.android.uimaker.parameter.baseview.ViewParameter, com.glority.android.uimaker.parameter.baseview.BaseUiMakerParameter
    public String getViewName() {
        return "IMAGEVIEW";
    }
}
