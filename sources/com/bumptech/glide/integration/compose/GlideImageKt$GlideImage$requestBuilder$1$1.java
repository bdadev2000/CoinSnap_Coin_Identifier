package com.bumptech.glide.integration.compose;

import android.graphics.drawable.Drawable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.RequestBuilder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: GlideImage.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
/* synthetic */ class GlideImageKt$GlideImage$requestBuilder$1$1 extends FunctionReferenceImpl implements Function1<Integer, RequestBuilder<Drawable>> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public GlideImageKt$GlideImage$requestBuilder$1$1(Object obj) {
        super(1, obj, RequestBuilder.class, "placeholder", "placeholder(I)Lcom/bumptech/glide/request/BaseRequestOptions;", 0);
    }

    public final RequestBuilder<Drawable> invoke(int i) {
        return (RequestBuilder) ((RequestBuilder) this.receiver).placeholder(i);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ RequestBuilder<Drawable> invoke(Integer num) {
        return invoke(num.intValue());
    }
}
